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
 * Simple wrapper class for a map of profiles.
 */
@SdkInternalApi
class AllCdpProfiles {

  private final ImmutableMap<String, CdpProfile> profiles;

  /**
   * Map of profiles that contain a profile name and CdpProfile object.
   * @param profiles Map of CdpProfile.
   */
  AllCdpProfiles(Map<String, CdpProfile> profiles) {
    this.profiles = ImmutableMap.copyOf(profiles);
  }

  /**
   * Returns an CdpProfile based the profileName.
   * @param profileName  Name of the CdpProfile to be searched.
   * @return  CdpProfile associated with the ProfileName or null if not found.
   */
  CdpProfile getProfile(String profileName) {
    return profiles.get(profileName);
  }
}