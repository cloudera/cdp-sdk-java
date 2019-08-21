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

package com.cloudera.cdp.authentication.credentials.profile.path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.authentication.credentials.CdpProfileCredentialsProvider;
import com.cloudera.cdp.authentication.credentials.profile.CdpProfileConfigFile;
import com.cloudera.cdp.util.CdpSDKTestUtils;

import java.io.File;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class CdpProfileConfigFileTest {

  @Test
  public void testNullConfigFileName() {
    Throwable e = assertThrows(CdpClientException.class, () -> {
      new CdpProfileConfigFile((String)null);
    });
    assertEquals("Argument is null", e.getMessage());
  }

  @Test
  public void testNullConfigFileHandle() {
    Throwable e = assertThrows(CdpClientException.class, () -> {
      new CdpProfileConfigFile((File)null);
    });
    assertEquals("Argument is null", e.getMessage());
  }

  @Test
  public void testNonExistantFileName(@TempDir Path folder) {
    Throwable e = assertThrows(CdpClientException.class, () -> {
      new CdpProfileConfigFile(folder.toAbsolutePath() + "/junk.txt");
    });
    assertTrue(e.getMessage().startsWith("Error loading CDP profile. CDP " +
                                         "profile file not found at:"));
  }

  @Test
  public void testNonExistantFileHandle(@TempDir Path folder) {
    Throwable e = assertThrows(CdpClientException.class, () -> {
      new CdpProfileConfigFile(
          new File(folder.toAbsolutePath().toString(), "junk.txt"));
    });
    assertTrue(e.getMessage().startsWith("Error loading CDP profile. CDP " +
                                         "profile file not found at:"));
  }

  @Test
  public void testNonExistantProfileName(@TempDir Path folder) {
    Path credentialsPath = CdpSDKTestUtils.copyTestCredentialsFileToFolder(folder);
    CdpProfileConfigFile config =
        new CdpProfileConfigFile(credentialsPath.toString());
    Throwable e = assertThrows(CdpClientException.class, () -> {
      config.getCredentials("foobar");
    });
    assertEquals("Unable to find profile named foobar", e.getMessage());
  }

  @Test
  public void testValidProfile(@TempDir Path folder) {
    Path credentialsPath = CdpSDKTestUtils.copyTestCredentialsFileToFolder(folder);
    CdpProfileCredentialsProvider credentialsProvider =
        new CdpProfileCredentialsProvider(credentialsPath.toString(), "default");
    CdpCredentials credentials = credentialsProvider.getCredentials();
    assertNotNull(credentials.getPrivateKey());
    assertEquals(CdpSDKTestUtils.DEFAULT_CREDENTIALS_KEY_ID,
                 credentials.getAccessKeyId());
  }
}
