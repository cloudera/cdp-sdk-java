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

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.util.CdpSDKTestUtils;
import com.google.common.collect.Maps;

import java.nio.file.Path;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class CdpProfileCredentialsProviderTest {

  private String originalUserHome = null;

  @BeforeEach
  public void setEnvVariables(@TempDir Path folder) {
    originalUserHome = System.getProperty("user.home");
    System.setProperty("user.home",
        folder.toAbsolutePath().toString());
    Map<String, String> newEnvironment = Maps.newHashMap();
    CdpSDKTestUtils.setEnv(newEnvironment);
  }

  @AfterEach
  public void resetEnvVariables() {
    System.setProperty("user.home", originalUserHome);
  }

  @Test
  public void readFromDefaultLocationDefaultProfileName(@TempDir Path folder) {
    CdpSDKTestUtils.copyTestCredentialsFileToFolder(folder);
    CdpProfileCredentialsProvider credentialsProvider =
        new CdpProfileCredentialsProvider();
    CdpCredentials credentials = credentialsProvider.getCredentials();
    assertNotNull(credentials.getPrivateKey());
    assertEquals(CdpSDKTestUtils.DEFAULT_CREDENTIALS_KEY_ID,
                 credentials.getAccessKeyId());
  }

  @Test
  public void readFromDefaultLocationSpecifiedProfileName(@TempDir Path folder) {
    CdpSDKTestUtils.copyTestCredentialsFileToFolder(folder);
    CdpProfileCredentialsProvider credentialsProvider =
        new CdpProfileCredentialsProvider("cdp_test");
    CdpCredentials credentials = credentialsProvider.getCredentials();
    assertNotNull(credentials.getPrivateKey());
    assertEquals(CdpSDKTestUtils.TEST_CREDENTIALS_KEY_ID,
                 credentials.getAccessKeyId());
  }

  @Test
  public void invalidProfile(@TempDir Path folder) {
    CdpSDKTestUtils.copyTestCredentialsFileToFolder(folder);
    CdpProfileCredentialsProvider credentialsProvider =
        new CdpProfileCredentialsProvider("nonExistingName");
    Throwable e = assertThrows(CdpClientException.class, () -> {
      credentialsProvider.getCredentials();
    });
    assertEquals("Unable to find profile named nonExistingName",
                 e.getMessage());
  }

  @Test
  public void invalidEnvVarProfile(@TempDir Path folder) {
    CdpSDKTestUtils.copyTestCredentialsFileToFolder(folder);
    Map<String, String> newEnvironment = Maps.newHashMap();
    newEnvironment.put(CdpProfileCredentialsProvider.CDP_DEFAULT_PROFILE,
                       "newEnvironmentprofile");
    CdpSDKTestUtils.setEnv(newEnvironment);
    CdpProfileCredentialsProvider credentialsProvider =
        new CdpProfileCredentialsProvider();
    Throwable e = assertThrows(CdpClientException.class, () -> {
      credentialsProvider.getCredentials();
    });
    assertEquals("Unable to find profile named newEnvironmentprofile",
                 e.getMessage());
  }

  @Test
  public void readFromEnvVar(@TempDir Path folder) {
    Map<String, String> newEnvironment = Maps.newHashMap();
    newEnvironment.put(CdpProfileCredentialsProvider.CDP_DEFAULT_PROFILE,
                       "cdp_test");
    CdpSDKTestUtils.setEnv(newEnvironment);
    CdpSDKTestUtils.copyTestCredentialsFileToFolder(folder);
    CdpProfileCredentialsProvider credentialsProvider =
        new CdpProfileCredentialsProvider();
    CdpCredentials credentials = credentialsProvider.getCredentials();
    assertNotNull(credentials.getPrivateKey());
    assertEquals(CdpSDKTestUtils.TEST_CREDENTIALS_KEY_ID,
                 credentials.getAccessKeyId());
  }

  @Test
  public void readFromSpecifiedPath(@TempDir Path folder) {
    Path credentialsPath = CdpSDKTestUtils.copyTestCredentialsFileToFolder(folder);
    CdpProfileCredentialsProvider credentialsProvider =
        new CdpProfileCredentialsProvider(credentialsPath.toString(), "default");
    CdpCredentials credentials = credentialsProvider.getCredentials();
    assertNotNull(CdpSDKTestUtils.DEFAULT_CREDENTIALS_PRIVATE_KEY);
    assertEquals(CdpSDKTestUtils.DEFAULT_CREDENTIALS_KEY_ID,
                 credentials.getAccessKeyId());
  }

}
