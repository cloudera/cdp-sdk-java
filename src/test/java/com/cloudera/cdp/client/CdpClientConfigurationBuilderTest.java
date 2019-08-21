/*
 * Copyright (c) 2018 Cloudera, Inc. All Rights Reserved.
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.http.SimpleRetryHandler;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class CdpClientConfigurationBuilderTest {

  @Test
  public void testDefaultReadTimeout() {
    CdpClientConfigurationBuilder builder = CdpClientConfigurationBuilder.defaultBuilder();
    assertEquals(Duration.ofMinutes(1), builder.getReadTimeout());
  }

  @Test
  public void testDefaultConnectionTimeout() {
    CdpClientConfigurationBuilder builder = CdpClientConfigurationBuilder.defaultBuilder();
    assertEquals(Duration.ofMinutes(1), builder.getConnectionTimeout());
  }

  @Test
  public void testDefaultApplicationName() {
    CdpClientConfigurationBuilder builder = CdpClientConfigurationBuilder.defaultBuilder();
    assertEquals(null, builder.getClientApplicationName());
  }

  @Test
  public void testDefaultRetryHandler() {
    CdpClientConfigurationBuilder builder = CdpClientConfigurationBuilder.defaultBuilder();
    builder.build();
    assertEquals(builder.getRetryHandler().getClass(), SimpleRetryHandler.class);
  }

  @Test
  public void testInvalidConnectionTimeout() {
    assertThrows(CdpClientException.class, () -> {
      CdpClientConfigurationBuilder.defaultBuilder()
        .withConnectionTimeout(Duration.ofMillis(0));
    });
}

  @Test
  public void testInvalidReadTimeout() {
    assertThrows(CdpClientException.class, () -> {
      CdpClientConfigurationBuilder.defaultBuilder()
        .withReadTimeout(Duration.ofMillis(0));
    });
  }

  @Test
  public void testInvalidClientApplicationName() {
    assertThrows(CdpClientException.class, () -> {
      CdpClientConfigurationBuilder.defaultBuilder()
        .withClientApplicationName(null);
    });
  }

  @Test
  public void testInvalidRetryHandler() {
    assertThrows(CdpClientException.class, () -> {
      CdpClientConfigurationBuilder.defaultBuilder()
        .withRetryHandler(null);
    });
  }

  @Test
  public void testDefaultProxyConfig() {
    CdpClientConfigurationBuilder builder = CdpClientConfigurationBuilder.defaultBuilder();
    assertEquals(null, builder.getProxyUri());
    assertEquals(null, builder.getProxyUsername());
    assertEquals(null, builder.getProxyPassword());
  }

  @Test
  public void testProxyClientConfiguration() {
    final String proxyUri = "https://foobar.com:1234/";
    final String proxyUsername = "foo";
    final String proxyPassword = "bar";
    CdpClientConfiguration cc = CdpClientConfigurationBuilder
        .defaultBuilder()
        .withProxyUri(proxyUri)
        .withProxyUsername(proxyUsername)
        .withProxyPassword(proxyPassword)
        .build();
    assertEquals(proxyUri, cc.getProxyUri());
    assertEquals(proxyUsername, cc.getProxyUsername());
    assertEquals(proxyPassword, cc.getProxyPassword());
  }
}
