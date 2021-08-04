/*
 * Copyright (c) 2019 Cloudera, Inc. All Rights Reserved.
 *
 * Portions Copyright (c) Copyright 2013-2018 Amazon.com, Inc. or its
 * affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cloudera.cdp.client;

import static com.cloudera.cdp.ValidationUtils.checkNotNullAndThrow;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.SdkInternalApi;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.UUID;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.DefaultHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

/**
 * Factory class for producing PoolingHttpClientConnectionManager instances used
 * by clients.
 */
@SdkInternalApi
class ConnectionManagerFactory {

  private static final KeyStore USE_DEFAULT_KEYSTORE = null;

  /**
   * Create a connection manager.
   * @param config the client configuration
   * @return the connection manager
   */
  public PoolingHttpClientConnectionManager create(CdpClientConfiguration config) {
    checkNotNullAndThrow(config);

    TrustManager[] trustManagers;
    HostnameVerifier hostnameVerifier;

    if (config.getIgnoreTls()) {
      trustManagers = new TrustManager[] { createIgnoreCertTrustManger() };
      hostnameVerifier = (s1, s2) -> true;
    } else {
      try {
        KeyStore ks;
        if (config.getTrustedCertificates().isEmpty()) {
          ks = USE_DEFAULT_KEYSTORE;
        } else {
          ks = KeyStore.getInstance(KeyStore.getDefaultType());
          ks.load(null);
          for (X509Certificate cert : config.getTrustedCertificates()) {
            ks.setCertificateEntry(UUID.randomUUID().toString(), cert);
          }
        }

        TrustManagerFactory trustManagerFactory =
            TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(ks);
        trustManagers = trustManagerFactory.getTrustManagers();
      } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
        throw new CdpClientException("Error initializing truststore", e);
      }
      hostnameVerifier = new DefaultHostnameVerifier();
    }

    SSLContext sslContext;
    try {
      sslContext = SSLContext.getInstance("TLS");
      sslContext.init(null, trustManagers, new SecureRandom());
    } catch (NoSuchAlgorithmException | KeyManagementException e) {
      throw new CdpClientException("Error initializing SSL", e);
    }

    Registry<ConnectionSocketFactory> socketFactoryRegistry =
        RegistryBuilder.<ConnectionSocketFactory>create()
            .register("http", PlainConnectionSocketFactory.getSocketFactory())
            .register("https", new SSLConnectionSocketFactory(sslContext,
                                                                  hostnameVerifier))
            .build();

    PoolingHttpClientConnectionManager connectionManager =
        new PoolingHttpClientConnectionManager(socketFactoryRegistry);
    connectionManager.setValidateAfterInactivity(
        (int) config.getValidateAfterInactivity().toMillis());
    connectionManager.setDefaultMaxPerRoute(config.getMaxConnections());
    connectionManager.setMaxTotal(config.getMaxConnections());

    return connectionManager;
  }

  private static X509TrustManager createIgnoreCertTrustManger() {
    return new X509TrustManager() {
      @Override
      public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}

      @Override
      public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}

      @Override
      public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
      }
    };
  }
}
