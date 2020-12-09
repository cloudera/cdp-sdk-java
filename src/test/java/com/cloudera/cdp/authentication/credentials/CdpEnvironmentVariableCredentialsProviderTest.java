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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.cloudera.cdp.util.CdpSDKTestUtils;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class CdpEnvironmentVariableCredentialsProviderTest {

  @AfterEach
  public void resetEnvVariables() {
    CdpSDKTestUtils.setEnv(new HashMap<>());
  }

  @Test
  public void testGetCredentialsWithNullIdAndPrivateKeysAndAccessToken() {
    Map<String, String> newenv = new HashMap<>();
    CdpSDKTestUtils.setEnv(newenv);
    CdpEnvironmentVariableCredentialsProvider aenvcp =
        new CdpEnvironmentVariableCredentialsProvider();
    Throwable e = assertThrows(IllegalArgumentException.class,
                               aenvcp::getCredentials);
    assertEquals("Invalid values for credential environment " +
                 "variables CDP_ACCESS_KEY_ID, CDP_PRIVATE_KEY and CDP_ACCESS_TOKEN",
                 e.getMessage());
  }

  @Test
  public void testGetCredentialsForCdpKeyIdMissing() {
    Map<String, String> newenv = new HashMap<>();
    newenv.put(CdpEnvironmentVariableCredentialsProvider.CDP_PRIVATE_KEY,
               "");
    CdpSDKTestUtils.setEnv(newenv);
    CdpEnvironmentVariableCredentialsProvider aenvcp =
        new CdpEnvironmentVariableCredentialsProvider();
    Throwable e = assertThrows(IllegalArgumentException.class,
                               aenvcp::getCredentials);
    assertEquals("Invalid values for credential environment " +
                 "variables CDP_ACCESS_KEY_ID, CDP_PRIVATE_KEY and CDP_ACCESS_TOKEN",
                 e.getMessage());
  }

  @Test
  public void testGetCredentialsForCdpPrivateKeyMissing() {
    Map<String, String> newenv = new HashMap<>();
    newenv.put(CdpEnvironmentVariableCredentialsProvider.CDP_ACCESS_KEY_ID,
               "c2cf4ffb-9f0a-42bf-938b-f50085e63883");
    CdpSDKTestUtils.setEnv(newenv);
    CdpEnvironmentVariableCredentialsProvider aenvcp =
        new CdpEnvironmentVariableCredentialsProvider();
    Throwable e = assertThrows(IllegalArgumentException.class,
                               aenvcp::getCredentials);
    assertEquals("Invalid values for credential environment " +
                 "variables CDP_ACCESS_KEY_ID, CDP_PRIVATE_KEY and CDP_ACCESS_TOKEN",
                 e.getMessage());
  }

  @Test
  public void testValidApiKeyCredentials() {
    Map<String, String> newenv = new HashMap<>();
    newenv.put(CdpEnvironmentVariableCredentialsProvider.CDP_ACCESS_KEY_ID,
               "somekey");
    newenv.put(CdpEnvironmentVariableCredentialsProvider.CDP_PRIVATE_KEY,
               CdpSDKTestUtils.getEncodedRSAPrivateKey());
    CdpSDKTestUtils.setEnv(newenv);
    CdpEnvironmentVariableCredentialsProvider aenvcp =
        new CdpEnvironmentVariableCredentialsProvider();
    CdpCredentials credentials = aenvcp.getCredentials();
    assertNotNull(credentials);
    assertEquals("somekey", credentials.getAccessKeyId());
  }

  @Test
  public void testValidAccessTokenCredentials() {
    Map<String, String> newenv = new HashMap<>();
    newenv.put(CdpEnvironmentVariableCredentialsProvider.CDP_ACCESS_TOKEN,
        "sometoken");
    CdpSDKTestUtils.setEnv(newenv);
    CdpEnvironmentVariableCredentialsProvider aenvcp =
        new CdpEnvironmentVariableCredentialsProvider();
    CdpCredentials credentials = aenvcp.getCredentials();
    assertNotNull(credentials);
    assertEquals("sometoken", credentials.getAccessToken());
  }
}
