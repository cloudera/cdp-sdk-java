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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.util.CdpSDKTestUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.time.Duration;
import java.util.HashMap;

public class CdpInteractiveLoginCredentialsProviderTest {

  @Test
  public void testGetCredentials() {
    CdpInteractiveLoginCredentialsProvider ilcp = new CdpInteractiveLoginCredentialsProvider("foobar", null);
    ilcp.accessKeyId = "key-id";
    ilcp.privateKey = CdpSDKTestUtils.getEncodedRSAPrivateKey();
    CdpCredentials credentials = ilcp.getCredentials();
    assertNotNull(credentials);
    assertEquals("key-id", credentials.getAccessKeyId());
  }

  @Test
  public void testResolveLoginUrl() {
    CdpInteractiveLoginCredentialsProvider ilcp;
    URI url;

    ilcp = new CdpInteractiveLoginCredentialsProvider("foobar", null);
    url = ilcp.resolveLoginUrl();
    assertEquals("https://consoleauth.altus.cloudera.com/login?accountId=foobar&returnUrl=http%3A%2F%2Flocalhost%3A0%2FinteractiveLogin", url.toString());

    ilcp = new CdpInteractiveLoginCredentialsProvider("foobar", "");
    url = ilcp.resolveLoginUrl();
    assertEquals("https://consoleauth.altus.cloudera.com/login?accountId=foobar&returnUrl=http%3A%2F%2Flocalhost%3A0%2FinteractiveLogin", url.toString());

    ilcp = new CdpInteractiveLoginCredentialsProvider("foobar", "test-idp");
    url = ilcp.resolveLoginUrl();
    assertEquals("https://consoleauth.altus.cloudera.com/login?accountId=foobar&idp=test-idp&returnUrl=http%3A%2F%2Flocalhost%3A0%2FinteractiveLogin", url.toString());

    ilcp = new CdpInteractiveLoginCredentialsProvider("foobar", null, "https://unittest.com/auth?abc=1", 10100, Duration.ofSeconds(1));
    url = ilcp.resolveLoginUrl();
    assertEquals("https://unittest.com/auth?abc=1&accountId=foobar&returnUrl=http%3A%2F%2Flocalhost%3A10100%2FinteractiveLogin", url.toString());
  }

  @Test
  public void testFindUnusedPort() throws Exception {
    int port = CdpInteractiveLoginCredentialsProvider.findUnusedPort();
    assertTrue(port > 0);
  }

  @Test
  public void testRunHttpServer() throws Exception {
    int port = CdpInteractiveLoginCredentialsProvider.findUnusedPort();
    HashMap<String, Object> result = new HashMap<>();
    Thread thread = new Thread(() -> {
      int retryCount = 0;
      while (true) {
        try {
          Thread.sleep(100);
          URL url = new URL(String.format("http://localhost:%d/interactiveLogin?accessKeyId=key-id&privateKey=%s", port, URLEncoder.encode(CdpSDKTestUtils.getEncodedRSAPrivateKey(), "UTF-8")));
          HttpURLConnection connection = (HttpURLConnection) url.openConnection();
          connection.setRequestMethod("GET");
          result.put("ResponseCode", connection.getResponseCode());
          return;
        } catch (IOException e) {
          retryCount ++;
          if (retryCount > 1000) {
            result.put("Exception", e);
            return;
          }
        } catch (Exception e) {
          result.put("Exception", e);
          return;
        }
      }
    });
    thread.start();

    CdpInteractiveLoginCredentialsProvider ilcp = new CdpInteractiveLoginCredentialsProvider("foobar", null, "http://test.com/auth", port, Duration.ofSeconds(1));
    ilcp.runHttpServer();

    thread.join();
    assertEquals(null, result.getOrDefault("Exception", null));
    assertEquals(200, (int) result.getOrDefault("ResponseCode", 0));
    assertNull(ilcp.error);
    assertEquals("key-id", ilcp.accessKeyId);
    assertEquals(CdpSDKTestUtils.getEncodedRSAPrivateKey(), ilcp.privateKey);
  }

  @Test
  public void testRunHttpServer_Timeout() throws Exception {
    int port = CdpInteractiveLoginCredentialsProvider.findUnusedPort();
    CdpInteractiveLoginCredentialsProvider ilcp = new CdpInteractiveLoginCredentialsProvider("foobar", null, "http://test.com/auth", port, Duration.ofSeconds(1));
    Throwable e = assertThrows(CdpClientException.class, () -> {
      ilcp.runHttpServer();
    });
    assertEquals("Login Timeout", e.getMessage());
  }

  @Test
  public void testRunHttpServer_Error() throws Exception {
    int port = CdpInteractiveLoginCredentialsProvider.findUnusedPort();
    HashMap<String, Object> result = new HashMap<>();
    Thread thread = new Thread(() -> {
      int retryCount = 0;
      while (true) {
        try {
          Thread.sleep(100);
          URL url = new URL(String.format("http://localhost:%d/interactiveLogin?error=error_message", port));
          HttpURLConnection connection = (HttpURLConnection) url.openConnection();
          connection.setRequestMethod("GET");
          result.put("ResponseCode", connection.getResponseCode());
          return;
        } catch (IOException e) {
          retryCount ++;
          if (retryCount > 1000) {
            result.put("Exception", e);
            return;
          }
        } catch (Exception e) {
          result.put("Exception", e);
          return;
        }
      }
    });
    thread.start();

    CdpInteractiveLoginCredentialsProvider ilcp = new CdpInteractiveLoginCredentialsProvider("foobar", null, "http://test.com/auth", port, Duration.ofSeconds(1));
    Throwable e = assertThrows(CdpClientException.class, () -> {
      ilcp.runHttpServer();
    });
    assertEquals("Login failed: error_message", e.getMessage());

    thread.join();
    assertEquals(null, result.getOrDefault("Exception", null));
    assertEquals(200, (int) result.getOrDefault("ResponseCode", 0));
    assertEquals("error_message", ilcp.error);
    assertNull(ilcp.accessKeyId);
    assertNull(ilcp.privateKey);
  }
}
