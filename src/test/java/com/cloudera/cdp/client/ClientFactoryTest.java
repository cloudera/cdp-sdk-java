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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableList;
import com.google.common.io.Resources;

import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.time.Duration;
import javax.net.ssl.SSLHandshakeException;
import jakarta.ws.rs.ProcessingException;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.core.Response;

import org.glassfish.jersey.apache.connector.ApacheClientProperties;
import org.junit.Ignore;
import org.junit.Test;

public class ClientFactoryTest {

  private static final boolean EXPECT_ERROR = true;
  private static final boolean NO_ERROR = false;

  @Test
  public void testDefaultKeepAliveStrategy() {
    ClientFactory clientFactory = new ClientFactory();
    Client client = clientFactory.create(
        CdpClientConfigurationBuilder
            .defaultBuilder()
            .build());
    assertNotNull(client.getConfiguration().getProperty(
        ApacheClientProperties.KEEPALIVE_STRATEGY));
  }

  @Test
  public void testDisabledKeepAliveStrategy() {
    testDisabledKeepAliveStrategy(Duration.ofMillis(0));
    testDisabledKeepAliveStrategy(Duration.ofMillis(-1));
  }

  private void testDisabledKeepAliveStrategy(Duration d) {
    ClientFactory clientFactory = new ClientFactory();
    Client client = clientFactory.create(
        CdpClientConfigurationBuilder
            .defaultBuilder()
            .withConnectionMaxIdle(d)
            .build());
    assertNull(client.getConfiguration().getProperty(
        ApacheClientProperties.KEEPALIVE_STRATEGY));
  }

  @Test
  @Ignore // Disable the tests because https://*.badssl.com is not reliable recently
  public void testIgnoreTsl() {
    CdpClientConfiguration config = CdpClientConfigurationBuilder
        .defaultBuilder()
        .build();
    testHttps("https://self-signed.badssl.com", config, EXPECT_ERROR);

    config = CdpClientConfigurationBuilder
        .defaultBuilder()
        .withIgnoreTls(true)
        .build();
    testHttps("https://wrong.host.badssl.com/", config, NO_ERROR);
    testHttps("https://self-signed.badssl.com", config, NO_ERROR);
    testHttps("https://untrusted-root.badssl.com/", config, NO_ERROR);
  }


  @Test
  @Ignore
  public void testTrustedCertificates() throws Exception {
    CdpClientConfiguration config = CdpClientConfigurationBuilder
        .defaultBuilder()
        .build();
    testHttps("https://untrusted-root.badssl.com/", config, EXPECT_ERROR);

    CertificateFactory cf = CertificateFactory.getInstance("X.509");
    byte[] certBytes = Resources.toByteArray(Resources.getResource("badssl-com.pem"));
    X509Certificate cert = (X509Certificate) cf.generateCertificate(new ByteArrayInputStream(certBytes));
    config = CdpClientConfigurationBuilder
            .defaultBuilder()
            .withTrustedCertificates(ImmutableList.of(cert))
            .build();
    testHttps("https://untrusted-root.badssl.com/", config, NO_ERROR);
    testHttps("https://self-signed.badssl.com", config, EXPECT_ERROR);
  }

  private void testHttps(String url, CdpClientConfiguration configuration, boolean expectError) {
    Exception ex = null;
    Response response = null;
    ClientFactory clientFactory = new ClientFactory();
    Client client = clientFactory.create(configuration);
    try {
      response = client.target(url).request().get();
    } catch (ProcessingException e) {
      ex = e;
    }

    if (expectError) {
      assertNotNull(ex);
      assertTrue(ex.getCause() instanceof SSLHandshakeException);
    } else {
      assertNull(ex);
      assertNotNull(response);
    }
  }
}
