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
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.util.CdpSDKTestUtils;
import com.google.common.collect.Maps;

import java.nio.file.Path;
import java.util.Map;
import java.util.UUID;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class DefaultCredentialsProviderChainTest {

  private String originalUserHome = null;

  @BeforeEach
  public void setEnvVariables(@TempDir Path folder) {
    //override user home in case server has existing CDP credentials file
    originalUserHome = System.getProperty("user.home");
    System.setProperty("user.home", folder.toAbsolutePath().toString());
  }

  @AfterEach
  public void resetEnvVariables() {
    System.setProperty("user.home",originalUserHome);
  }

  @Test
  public void testNoCredentials() {
    DefaultCdpCredentialProviderChain cp = new DefaultCdpCredentialProviderChain();

    Throwable e = assertThrows(CdpClientException.class, () -> {
      cp.getCredentials();
    });
    assertEquals("Unable to load credentials from provider files", e.getMessage());
  }

  @Test
  public void testValidEnvironmentVariableCredentials() {
    Map<String, String> newEnvironment = Maps.newHashMap();
    String accessKeyId = UUID.randomUUID().toString();
    newEnvironment.put(
        CdpEnvironmentVariableCredentialsProvider.CDP_ACCESS_KEY_ID,
        accessKeyId);
    newEnvironment.put(
        CdpEnvironmentVariableCredentialsProvider.CDP_PRIVATE_KEY,
        CdpSDKTestUtils.getEncodedRSAPrivateKey());
    CdpSDKTestUtils.setEnv(newEnvironment);

    DefaultCdpCredentialProviderChain cp = new DefaultCdpCredentialProviderChain();
    CdpCredentials credentials = cp.getCredentials();

    assertEquals(accessKeyId, credentials.getAccessKeyId());
    assertEquals(CdpSDKTestUtils.getRSAPrivateKey(), credentials.getPrivateKey());
    assertNull(credentials.getAccessToken());

    newEnvironment = Maps.newHashMap();
    String accessToken = UUID.randomUUID().toString();
    newEnvironment.put(
        CdpEnvironmentVariableCredentialsProvider.CDP_ACCESS_TOKEN,
        accessToken);
    CdpSDKTestUtils.setEnv(newEnvironment);

    credentials = cp.getCredentials();

    assertNull(credentials.getAccessKeyId());
    assertNull(credentials.getPrivateKey());
    assertEquals(accessToken, credentials.getAccessToken());

    newEnvironment = Maps.newHashMap();
    CdpSDKTestUtils.setEnv(newEnvironment);
  }

  @Test
  public void testValidSystemPropertiesCredentials() {
    String accessKeyId = UUID.randomUUID().toString();
    System.setProperty(
        CdpSystemPropertiesCredentialsProvider.CDP_ACCESS_KEY_ID,
        accessKeyId);
    System.setProperty(
        CdpSystemPropertiesCredentialsProvider.CDP_PRIVATE_KEY,
        CdpSDKTestUtils.getEncodedRSAPrivateKey());

    DefaultCdpCredentialProviderChain cp = new DefaultCdpCredentialProviderChain();
    CdpCredentials credentials = cp.getCredentials();

    assertEquals(accessKeyId, credentials.getAccessKeyId());
    assertEquals(CdpSDKTestUtils.getRSAPrivateKey(), credentials.getPrivateKey());
    assertNull(credentials.getAccessToken());

    System.clearProperty(
        CdpSystemPropertiesCredentialsProvider.CDP_PRIVATE_KEY);
    System.clearProperty(
        CdpSystemPropertiesCredentialsProvider.CDP_ACCESS_KEY_ID);

    String accessToken = UUID.randomUUID().toString();
    System.setProperty(
        CdpSystemPropertiesCredentialsProvider.CDP_ACCESS_TOKEN,
        accessToken);

    credentials = cp.getCredentials();

    assertNull(credentials.getAccessKeyId());
    assertNull(credentials.getPrivateKey());
    assertEquals(accessToken, credentials.getAccessToken());

    System.clearProperty(
        CdpSystemPropertiesCredentialsProvider.CDP_ACCESS_TOKEN);
  }

  @Test
  public void testValidProfileCredentials(@TempDir Path folder) {
    CdpSDKTestUtils.copyTestCredentialsFileToFolder(folder);
    DefaultCdpCredentialProviderChain cp = new DefaultCdpCredentialProviderChain();
    CdpCredentials credentials = cp.getCredentials();
    assertNotNull(credentials.getPrivateKey());
    assertEquals(CdpSDKTestUtils.DEFAULT_CREDENTIALS_KEY_ID,
                 credentials.getAccessKeyId());
  }

}
