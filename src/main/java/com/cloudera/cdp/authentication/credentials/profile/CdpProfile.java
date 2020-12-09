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

import com.cloudera.cdp.annotation.SdkInternalApi;
import com.google.common.collect.ImmutableMap;

import java.util.Map;

/**
 * Simple wrapper class for a map of properties. Provides convenience accessors
 * for properties used by the SDK.
 */
@SdkInternalApi
class CdpProfile {

  private static final String CDP_ACCESS_KEY_ID = "cdp_access_key_id";
  private static final String CDP_PRIVATE_KEY = "cdp_private_key";
  private static final String CDP_ACCESS_TOKEN = "cdp_access_token";

  private final ImmutableMap<String, String> properties;

  /**
   * Constructor.
   * @param properties the properties
   */
  CdpProfile(Map<String, String> properties) {
    this.properties = ImmutableMap.copyOf(properties);
  }

  private String getPropertyValue(String propertyName) {
    return this.properties.get(propertyName);
  }

  /**
   * Get the CDP access key ID.
   * @return the CDP access key ID, if any
   */
  String getCdpAccessKeyId() {
    return getPropertyValue(CDP_ACCESS_KEY_ID);
  }

  /**
   * Get the CDP private key.
   * @return the CDP private key, as a string, if any
   */
  String getCdpPrivateKey() {
    return getPropertyValue(CDP_PRIVATE_KEY);
  }

  /**
   * Get the CDP access token.
   * @return the CDP access token, if any
   */
  String getCdpAccessToken() {
    return getPropertyValue(CDP_ACCESS_TOKEN);
  }
}
