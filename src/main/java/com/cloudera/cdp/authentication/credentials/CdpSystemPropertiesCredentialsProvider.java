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

import com.cloudera.cdp.CdpClientException;

import org.apache.commons.lang3.StringUtils;

/**
 * CdpCredentialsProvider implementation that provides credentials by looking
 * at the CDP_ACCESS_KEY_ID, CDP_PRIVATE_KEY and CDP_ACCESS_TOKEN system properties.
 */
public class CdpSystemPropertiesCredentialsProvider
  implements CdpCredentialsProvider {

  /**
   * Name of system variable holding the users CDP access key ID.
   */
  public static final String CDP_ACCESS_KEY_ID = "CDP_ACCESS_KEY_ID";

  /**
   * Name of system variable holding the users CDP private key.
   */
  public static final String CDP_PRIVATE_KEY = "CDP_PRIVATE_KEY";

  /**
   * Name of system variable holding the users CDP access token.
   */
  public static final String CDP_ACCESS_TOKEN = "CDP_ACCESS_TOKEN";

  @Override
  public CdpCredentials getCredentials() {
    String accessKeyId = StringUtils.trim(System.getProperty(CDP_ACCESS_KEY_ID));
    String privateKey = StringUtils.trim(System.getProperty(CDP_PRIVATE_KEY));
    String accessToken = StringUtils.trim(System.getProperty(CDP_ACCESS_TOKEN));
    accessKeyId = StringUtils.trim(accessKeyId);
    privateKey = StringUtils.trim(privateKey);
    accessToken = StringUtils.trim(accessToken);
    if (StringUtils.isNoneEmpty(accessKeyId, privateKey)) {
      return new BasicCdpCredentials(accessKeyId, privateKey);
    }
    if (StringUtils.isNoneEmpty(accessToken)) {
      return new BasicCdpCredentials(accessToken);
    }
    throw new CdpClientException(
        "Unable to load credentials from Java system properties " +
            CDP_ACCESS_KEY_ID + ", " + CDP_PRIVATE_KEY + " and " + CDP_ACCESS_TOKEN);
  }

  @Override
  public String toString() {
    return getClass().getSimpleName();
  }
}
