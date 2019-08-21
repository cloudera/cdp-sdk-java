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
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.cloudera.cdp.CdpClientException;
import com.google.common.collect.Maps;

import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.HttpHeaders;

import org.junit.jupiter.api.Test;

public class ClientConnectionWrapperTest {

  @Test
  public void testNullArgument() {
    assertThrows(CdpClientException.class, () -> {
      new ClientConnectionWrapper(null);
    });
  }

  @Test
  public void testUserAgent() throws Exception {
    CdpClientConfiguration mockConfig = mock(CdpClientConfiguration.class);

    Map<String, String> headers = Maps.newHashMap();

    Builder builder = mock(Builder.class);
    when(builder.accept(any(String.class))).thenReturn(builder);
    when(builder.header(anyString(), anyString())).thenAnswer(invocation -> {
      headers.put(invocation.getArgument(0), invocation.getArgument(1));
      return builder;
    });

    WebTarget target = mock(WebTarget.class);
    when(target.request()).thenReturn(builder);

    Client mockClient = mock(Client.class);
    when(mockClient.target(anyString())).thenReturn(target);

    ClientConnectionWrapper wrapper = new ClientConnectionWrapper(mockConfig, mockClient);
    wrapper.doPost("http://www.example.com", "/path", "auth", "my birthday", "{}");
    wrapper.close();

    assertTrue(headers.containsKey(HttpHeaders.USER_AGENT));
    assertEquals(wrapper.buildUserAgent(), headers.get(HttpHeaders.USER_AGENT));
  }
}
