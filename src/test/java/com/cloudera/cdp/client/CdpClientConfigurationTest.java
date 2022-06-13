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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.http.RetryHandler;
import com.cloudera.cdp.http.SimpleRetryHandler;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class CdpClientConfigurationTest {

  @Test
  public void testWithDefaultConfiguration() {
    CdpClientConfiguration config =
        CdpClientConfigurationBuilder.defaultBuilder().build();
    assertEquals(20, config.getMaxConnections());
    assertNull(config.getProxyUri());
    assertNull(config.getProxyUsername());
    assertNull(config.getProxyPassword());
    assertEquals(Duration.ofMinutes(1), config.getConnectionTimeout());
    assertEquals(Duration.ofMinutes(1), config.getReadTimeout());
    assertEquals(Duration.ofSeconds(50), config.getConnectionMaxIdle());
    assertEquals(Duration.ofSeconds(2), config.getValidateAfterInactivity());
    assertEquals(SimpleRetryHandler.class,config.getRetryHandler().getClass());
    assertFalse(config.getIgnoreTls());
    assertTrue(config.getTrustedCertificates().isEmpty());
    assertTrue(config.getTrustedCertificates() instanceof ImmutableList);
    assertTrue(config.getRequestHeaders().isEmpty());
    assertTrue(config.getRequestHeaders() instanceof ImmutableMap);
  }

  @Test
  public void testClientApplicationName() {
    String clientName = "testpartner";
    CdpClientConfigurationBuilder cdpClientConfigurationBuilder
        = CdpClientConfigurationBuilder.defaultBuilder();
    cdpClientConfigurationBuilder.withClientApplicationName(clientName);
    assertEquals(clientName,
                 cdpClientConfigurationBuilder.getClientApplicationName());
  }

  @Test
  public void testToBuilder() {
    RetryHandler retryHandler = new RetryHandler() {
      @Override
      public Duration shouldRetry(int attempts, CdpClientException exception) {
        return null;
      }
    };
    CdpClientConfiguration config =
        CdpClientConfigurationBuilder.defaultBuilder()
            .withMaxConnections(101)
            .withReadTimeout(Duration.ofSeconds(102))
            .withConnectionTimeout(Duration.ofSeconds(103))
            .withConnectionMaxIdle(Duration.ofSeconds(104))
            .withValidateAfterInactivity(Duration.ofSeconds(105))
            .withRetryHandler(retryHandler)
            .withClientApplicationName("appName")
            .withProxyUri("proxyUri")
            .withProxyUsername("proxyUsername")
            .withProxyPassword("proxyPassword")
            .addRequestHeader("foo", "bar")
            .build();

    CdpClientConfigurationBuilder builder = config.toBuilder();
    config = builder.build();

    assertEquals(101, config.getMaxConnections());
    assertEquals(Duration.ofSeconds(102), config.getReadTimeout());
    assertEquals(Duration.ofSeconds(103), config.getConnectionTimeout());
    assertEquals(Duration.ofSeconds(104), config.getConnectionMaxIdle());
    assertEquals(Duration.ofSeconds(105), config.getValidateAfterInactivity());
    assertEquals(retryHandler, config.getRetryHandler());
    assertEquals("appName", config.getClientApplicationName());
    assertEquals("proxyUri", config.getProxyUri());
    assertEquals("proxyUsername", config.getProxyUsername());
    assertEquals("proxyPassword", config.getProxyPassword());
    assertEquals(1, config.getRequestHeaders().size());
    assertEquals("bar", config.getRequestHeaders().get("foo"));
  }
}
