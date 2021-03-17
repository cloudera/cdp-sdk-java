/*
 * Copyright (c) 2021 Cloudera, Inc. All Rights Reserved.
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

package com.cloudera.cdp.authentication.credentials;

import static com.cloudera.cdp.ValidationUtils.checkNotNullAndThrow;

import com.cloudera.cdp.CdpClientException;
import com.google.common.annotations.VisibleForTesting;
import fi.iki.elonen.NanoHTTPD;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nullable;
import javax.ws.rs.core.UriBuilder;
import java.awt.Desktop;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * CdpCredentialsProvider implementation that provides credentials by
 * login to CDP interactively.
 */
public class CdpInteractiveLoginCredentialsProvider
    implements CdpCredentialsProvider {

  private static final Logger LOG =
      LoggerFactory.getLogger(CdpInteractiveLoginCredentialsProvider.class);

  private static final Duration DEFAULT_LOGIN_TIMEOUT = Duration.ofMinutes(10);
  private static final String DEFAULT_LOGIN_URL = "https://consoleauth.altus.cloudera.com/login";
  private static final String USE_DEFAULT_IDP = null;
  private static final int USE_RANDOM_UNUSED_PORT = 0;
  private static final byte[] CLOSE_BROWSER_HTML = (
      "<!DOCTYPE html>\n" +
          "<html>\n" +
          "  <head>\n" +
          "    <link rel=\"icon\" href=\"data:,\">\n" +
          "    <meta charset=\"utf-8\" />\n" +
          "  </head>\n" +
          "  <body onload=\"window.close()\">\n" +
          "    <p>It is safe to close your browser.</p>\n" +
          "  </body>\n" +
          "</html>")
      .getBytes(StandardCharsets.UTF_8);

  private final String accountId;
  private final String idp;
  private final String loginUrl;
  private final Duration timeout;
  private int listeningPort;
  private CountDownLatch countDownLatch;
  private final Object lockObj = new Object();

  @VisibleForTesting
  volatile String error = null;
  @VisibleForTesting
  volatile String accessKeyId = null;
  @VisibleForTesting
  volatile String privateKey = null;

  /**
   * Login to CDP interactively by the default identity provider.
   * @param accountId The account id.
   */
  public CdpInteractiveLoginCredentialsProvider(String accountId) {
    this(accountId, USE_DEFAULT_IDP);
  }

  /**
   * Login to CDP interactively.
   * @param accountId The account id.
   * @param identityProvider The name or CRN of IdP used to login with.
   *                         The default IdP will be used if null or empty.
   */
  public CdpInteractiveLoginCredentialsProvider(String accountId, @Nullable String identityProvider) {
    this(accountId, identityProvider, DEFAULT_LOGIN_URL, USE_RANDOM_UNUSED_PORT, DEFAULT_LOGIN_TIMEOUT);
  }

  /**
   * Login to CDP interactively by the given CDP login URL.
   * @param accountId The account id.
   * @param identityProvider The name or CRN of IdP used to login with.
   *                         The default IdP will be used if null or empty.
   * @param loginUrl The CDP login URL.
   * @param port The listening port number for CLI to receive the access token.
   *             A random un-used port will be assigned if the value is zero.
   * @param timeout The login timeout duration.
   */
  public CdpInteractiveLoginCredentialsProvider(String accountId, @Nullable String identityProvider, String loginUrl, int port, Duration timeout) {
    this.accountId = checkNotNullAndThrow(accountId);
    this.idp = identityProvider;
    this.loginUrl = checkNotNullAndThrow(loginUrl);
    this.listeningPort = port;
    this.timeout = checkNotNullAndThrow(timeout);
  }

  @Override
  public CdpCredentials getCredentials() {
    if (StringUtils.isAnyEmpty(this.accessKeyId, this.privateKey)) {
      if (!Desktop.isDesktopSupported() || !Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
        throw new UnsupportedOperationException("Desktop browse is not supported.");
      }

      try {
        if (this.listeningPort == USE_RANDOM_UNUSED_PORT) {
          this.listeningPort = findUnusedPort();
        }
        URI url = this.resolveLoginUrl();
        LOG.debug("Open browser to login: " + url.toString());
        Desktop.getDesktop().browse(url);
        this.runHttpServer();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    synchronized (lockObj) {
      if (StringUtils.isNoneEmpty(this.accessKeyId, this.privateKey)) {
        return new BasicCdpCredentials(this.accessKeyId, this.privateKey);
      }
    }

    throw new IllegalArgumentException(
        "Login failed: missing access key id or private key.");
  }

  @VisibleForTesting
  URI resolveLoginUrl() {
    UriBuilder urlBuilder = UriBuilder.fromUri(this.loginUrl);
    urlBuilder = urlBuilder.queryParam("accountId", this.accountId);
    if (StringUtils.isNoneEmpty(this.idp)) {
      urlBuilder = urlBuilder.queryParam("idp", this.idp);
    }
    urlBuilder = urlBuilder.queryParam("returnUrl", String.format("http://localhost:%d/interactiveLogin", this.listeningPort));
    return urlBuilder.build();
  }

  @VisibleForTesting
  void runHttpServer() throws IOException {
    countDownLatch = new CountDownLatch(1);
    HttpServer httpd = new HttpServer();
    httpd.start();
    LOG.debug("HTTPServer started.");

    try {
      try {
        boolean waitSucceeded = countDownLatch.await(this.timeout.getSeconds(), TimeUnit.SECONDS);
        LOG.debug("Request served: " + waitSucceeded);
        if (!waitSucceeded) {
          throw new CdpClientException("Login Timeout");
        }
        if (error != null) {
          throw new CdpClientException("Login failed: " + error);
        }
      } finally {
        httpd.stop();
      }
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  @VisibleForTesting
  static int findUnusedPort() throws IOException {
    ServerSocket s = new ServerSocket(USE_RANDOM_UNUSED_PORT);
    int port = s.getLocalPort();
    s.close();
    return port;
  }

  private class HttpServer extends NanoHTTPD {

    public HttpServer() {
      super("localhost", listeningPort);
    }

    @Override
    public Response serve(IHTTPSession session) {
      LOG.debug("Handle HTTP request: " + session.getUri());

      synchronized (lockObj) {
        Map<String, List<String>> params = session.getParameters();
        List<String> errors = params.get("error");
        if (errors != null && !errors.isEmpty()) {
          error = errors.get(0);
        }
        List<String> accessKeyIds = params.get("accessKeyId");
        if (accessKeyIds != null && !accessKeyIds.isEmpty()) {
          accessKeyId = accessKeyIds.get(0);
        }
        List<String> privateKeys = params.get("privateKey");
        if (privateKeys != null && !privateKeys.isEmpty()) {
          privateKey = privateKeys.get(0);
        }
      }

      return newResponse();
    }

    private Response newResponse() {
      return new Response(
          Response.Status.OK,
          NanoHTTPD.MIME_HTML,
          new ByteArrayInputStream(CLOSE_BROWSER_HTML),
          CLOSE_BROWSER_HTML.length) {
        @Override
        public void close() throws IOException {
          super.close();
          countDownLatch.countDown();
        }
      };
    }
  }
}
