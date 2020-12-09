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

package com.cloudera.cdp.authentication.credentials.profile;

import static com.cloudera.cdp.ValidationUtils.checkNotNullAndThrow;

import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.annotation.SdkInternalApi;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.authentication.credentials.BasicCdpCredentials;

import java.io.File;

import org.apache.commons.lang3.StringUtils;

/**
 * Handles loading a CDP profile from either the default location or from an
 * input path. Offers a convenience method for retreiving credentials from a
 * named profile.
 */
@SdkInternalApi
public class CdpProfileConfigFile {

  private AllCdpProfiles allProfiles;

  /**
   * Constructor. Loads the CDP credentials file from the default location.
   */
  public CdpProfileConfigFile() {
    this(getCdpCredentialsLocation());
  }

  /**
   * Loads the CDP credential profiles from the input path.
   * @param filePath path to CDP credentials file
   */
  public CdpProfileConfigFile(String filePath) {
    this(new File(checkNotNullAndThrow(filePath)));
  }

  /**
   * Loads the CDP credential profiles from the input file.
   * @param file CDP credentials file
   */
  public CdpProfileConfigFile(File file) {
    allProfiles = loadProfiles(checkNotNullAndThrow(file));
  }

  /**
   * Returns the CdpCredentials using the profile name provided.
   * @param profileName CDP profile name
   * @return CdpCredentials
   */
  public CdpCredentials getCredentials(String profileName) {
    checkNotNullAndThrow(profileName);
    CdpProfile profile = allProfiles.getProfile(profileName);
    if (profile == null) {
      throw new CdpClientException("Unable to find profile named " + profileName);
    }

    String accessKeyId = profile.getCdpAccessKeyId();
    String privateKey = profile.getCdpPrivateKey();
    String accessToken = profile.getCdpAccessToken();
    if (StringUtils.isNoneEmpty(accessKeyId, privateKey)) {
      return new BasicCdpCredentials(accessKeyId, privateKey);
    }
    if (StringUtils.isNoneEmpty(accessToken)) {
      return new BasicCdpCredentials(accessToken);
    }
    throw new IllegalArgumentException(
        "Invalid values for credential profile " + profileName);
  }

  private static File getCdpCredentialsLocation() {
    File credProfiles = new File(getCdpDirectory(), "credentials");
    if (credProfiles.exists() && credProfiles.isFile()) {
      return credProfiles;
    }
    return null;
  }

  private static File getCdpDirectory() {
    return new File(getHomeDirectory(), ".cdp");
  }

  private static String getHomeDirectory() {
    String userHomeDir = System.getProperty("user.home");
    if (userHomeDir == null) {
      throw new CdpClientException("Unable to load CDP profiles since " +
          "user.home system property is not set");
    }
    return userHomeDir;
  }

  private AllCdpProfiles loadProfiles(File file) {
    return new CdpProfileFileLoader().loadProfiles(file);
  }
}
