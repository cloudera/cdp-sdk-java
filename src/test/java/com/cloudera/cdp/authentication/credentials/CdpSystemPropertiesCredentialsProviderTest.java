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

import static com.cloudera.cdp.authentication.credentials.CdpSystemPropertiesCredentialsProvider.CDP_ACCESS_KEY_ID;
import static com.cloudera.cdp.authentication.credentials.CdpSystemPropertiesCredentialsProvider.CDP_PRIVATE_KEY;
import static com.cloudera.cdp.authentication.credentials.CdpSystemPropertiesCredentialsProvider.CDP_ACCESS_TOKEN;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.util.CdpSDKTestUtils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CdpSystemPropertiesCredentialsProviderTest {

  private String originalAccessKeyId = null;
  private String originalPrivateKey = null;
  private String originalAccessToken = null;

  @BeforeEach
  public void setEnvVariables() {
    originalAccessKeyId = System.getProperty(CDP_ACCESS_KEY_ID);
    originalPrivateKey = System.getProperty(CDP_PRIVATE_KEY);
    originalAccessToken = System.getProperty(CDP_ACCESS_TOKEN);
    System.clearProperty(CDP_PRIVATE_KEY);
    System.clearProperty(CDP_ACCESS_KEY_ID);
    System.clearProperty(CDP_ACCESS_TOKEN);
  }

  @AfterEach
  public void resetEnvVariables() {
    System.clearProperty(CDP_PRIVATE_KEY);
    System.clearProperty(CDP_ACCESS_KEY_ID);
    System.clearProperty(CDP_ACCESS_TOKEN);
    if (originalAccessKeyId != null) {
      System.setProperty(CDP_ACCESS_KEY_ID, originalAccessKeyId);
    }
    if (originalPrivateKey != null) {
      System.setProperty(CDP_PRIVATE_KEY, originalPrivateKey);
    }
    if (originalAccessToken != null) {
      System.setProperty(CDP_ACCESS_TOKEN, originalAccessToken);
    }
  }

  @Test
  public void testGetCredentialsWithNullIdAndPrivateKeysAndAccessToken() {
    CdpSystemPropertiesCredentialsProvider aspcp =
        new CdpSystemPropertiesCredentialsProvider();
    Throwable e = assertThrows(CdpClientException.class, () -> {
      aspcp.getCredentials();
    });
    assertEquals("Unable to load credentials from Java system " +
                 "properties CDP_ACCESS_KEY_ID, CDP_PRIVATE_KEY and CDP_ACCESS_TOKEN",
                 e.getMessage());
  }

  @Test
  public void testGetCredentialsForCdpKeyIdMissing() {
    System.setProperty(CDP_PRIVATE_KEY, "");
    CdpSystemPropertiesCredentialsProvider aspcp =
        new CdpSystemPropertiesCredentialsProvider();
    Throwable e = assertThrows(CdpClientException.class, () -> {
      aspcp.getCredentials();
    });
    assertEquals("Unable to load credentials from Java system " +
                 "properties CDP_ACCESS_KEY_ID, CDP_PRIVATE_KEY and CDP_ACCESS_TOKEN",
                 e.getMessage());
  }

  @Test
  public void testGetCredentialsForCdpPrivateKeyMissing() {
    System.setProperty(CDP_ACCESS_KEY_ID,
                       "c2cf4ffb-9f0a-42bf-938b-f50085e63883");
    CdpSystemPropertiesCredentialsProvider aspcp =
        new CdpSystemPropertiesCredentialsProvider();
    Throwable e = assertThrows(CdpClientException.class, () -> {
      aspcp.getCredentials();
    });
    assertEquals("Unable to load credentials from Java system " +
                 "properties CDP_ACCESS_KEY_ID, CDP_PRIVATE_KEY and CDP_ACCESS_TOKEN",
                 e.getMessage());
  }

  @Test
  public void testValidApiKeyCredentials() {
    System.setProperty(CDP_ACCESS_KEY_ID, "somekey");
    System.setProperty(CDP_PRIVATE_KEY,
                       CdpSDKTestUtils.getEncodedRSAPrivateKey());
    CdpSystemPropertiesCredentialsProvider aspcp =
        new CdpSystemPropertiesCredentialsProvider();
    CdpCredentials credentials = aspcp.getCredentials();
    assertNotNull(credentials);
    assertEquals("somekey", credentials.getAccessKeyId());
  }

  @Test
  public void testValidAccessTokenCredentials() {
    System.setProperty(CDP_ACCESS_TOKEN, "sometoken");
    CdpSystemPropertiesCredentialsProvider aspcp =
        new CdpSystemPropertiesCredentialsProvider();
    CdpCredentials credentials = aspcp.getCredentials();
    assertNotNull(credentials);
    assertEquals("sometoken", credentials.getAccessToken());
  }
}
