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

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.cloudera.cdp.http.SimpleRetryHandler;

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
}
