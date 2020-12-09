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

package com.cloudera.cdp.authentication.credentials;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.util.CdpSDKTestUtils;

import java.security.PrivateKey;

import org.junit.jupiter.api.Test;

public class BasicCdpCredentialsTest {

  @Test
  public void testNullKeyId() {
    Throwable e = assertThrows(
        CdpClientException.class,
        () -> new BasicCdpCredentials(null,
                                      CdpSDKTestUtils.getRSAPrivateKey()));
    assertEquals("Argument is null", e.getMessage());
  }

  @Test
  public void testNullPrivateKey() {
    Throwable e = assertThrows(CdpClientException.class,
                               () -> new BasicCdpCredentials("foo",
                                                             (PrivateKey) null));
    assertEquals("Argument is null", e.getMessage());
  }

  @Test
  public void testNullPrivateKeyString() {
    Throwable e = assertThrows(CdpClientException.class,
                               () -> new BasicCdpCredentials("foo",
                                                             (String) null));
    assertEquals("Argument is null", e.getMessage());
  }

  @Test
  public void testNullAccessToken() {
    Throwable e = assertThrows(
        CdpClientException.class,
        () -> new BasicCdpCredentials(null));
    assertEquals("Argument is null", e.getMessage());
  }

  @Test
  public void testApiKeyExpectedValues() {
    PrivateKey privateKey = CdpSDKTestUtils.getRSAPrivateKey();
    BasicCdpCredentials credentials =
        new BasicCdpCredentials("foo", privateKey);
    assertEquals("foo", credentials.getAccessKeyId());
    assertEquals(privateKey, credentials.getPrivateKey());
    assertNull(credentials.getAccessToken());
    assertTrue(credentials.isValid());
  }

  @Test
  public void testAccessTokenExpectedValues() {
    BasicCdpCredentials credentials =
        new BasicCdpCredentials("bar");
    assertNull(credentials.getAccessKeyId());
    assertNull(credentials.getPrivateKey());
    assertEquals("bar", credentials.getAccessToken());
    assertTrue(credentials.isValid());
  }
}
