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
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.util.CdpSDKTestUtils;

import org.junit.jupiter.api.Test;

public class StaticCdpCredentialsProviderTest {

  @Test
  public void testValidCredentials() {
    BasicCdpCredentials credentials =
        new BasicCdpCredentials("foo", CdpSDKTestUtils.getRSAPrivateKey());
    StaticCdpCredentialsProvider credentialsProvider =
        new StaticCdpCredentialsProvider(credentials);
    assertEquals(credentials, credentialsProvider.getCredentials());
  }


  @Test
  public void testNullCredentials() {
    Throwable e = assertThrows(CdpClientException.class, () -> {
      new StaticCdpCredentialsProvider(null);
    });
    assertEquals("Argument is null", e.getMessage());
  }
}
