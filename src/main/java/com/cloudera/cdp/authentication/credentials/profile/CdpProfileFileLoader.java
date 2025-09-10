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
import com.google.common.collect.ImmutableMap;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.configuration2.INIConfiguration;
import org.apache.commons.configuration2.SubnodeConfiguration;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;


/**
 * Handles the actual loading of an CDP configuration file.
 */
@SdkInternalApi
class CdpProfileFileLoader {

  /**
   * Loads the CDP configuration file.
   * @param file the configuration file
   * @return the loaded profiles
   */
  AllCdpProfiles loadProfiles(File file) {
    checkNotNullAndThrow(file);

    if (!file.exists()) {
      throw new CdpClientException("Error loading CDP profile. CDP " +
          "profile file not found at: " + file.getAbsolutePath());
    }
    if (!file.isFile()) {
      throw new CdpClientException("Error loading CDP profile. File is " +
          "a directory " + file.getAbsolutePath());
    }

    try {
      Parameters params = new Parameters();
      FileBasedConfigurationBuilder<INIConfiguration> builder = new FileBasedConfigurationBuilder<>(INIConfiguration.class).configure(params.fileBased().setFile(file));
      INIConfiguration ini = builder.getConfiguration();
      return loadProfiles(ini);
    } catch (ConfigurationException e) {
      throw new CdpClientException("Unable to load CDP profile specified " +
          "at " + file.getAbsolutePath(), e);
    } catch (IOException ioe) {
      throw new CdpClientException("Unable to load CDP profile specified " +
          "at " + file.getAbsolutePath(), ioe);
    }
  }

  private AllCdpProfiles loadProfiles(INIConfiguration ini) throws IOException, ConfigurationException {
    ImmutableMap.Builder<String, CdpProfile> profilesByName = ImmutableMap.builder();

    for (String sectionName : ini.getSections() ) {
      SubnodeConfiguration section = ini.getSection(sectionName);

      ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
      for (Iterator<String> it = section.getKeys(); it.hasNext(); ) {
        String key = it.next();
        mapBuilder.put(key, section.getString(key));
      }
      profilesByName.put(sectionName, new CdpProfile(mapBuilder.build()));
    }
    return new AllCdpProfiles(profilesByName.build());
  }
}