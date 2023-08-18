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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;
import java.util.Map;

/**
 * Request object to set environment configuration settings.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-08-14T10:18:50.506-07:00")
public class SetEnvironmentSettingRequest  {

  /**
   * Dictionary of settings to set.
   **/
  private Map<String, String> settings = new HashMap<String, String>();

  /**
   * The name or CRN of the environment. Empty to set system wide settings.
   **/
  private String environmentName = null;

  /**
   * Getter for settings.
   * Dictionary of settings to set.
   **/
  @JsonProperty("settings")
  public Map<String, String> getSettings() {
    return settings;
  }

  /**
   * Setter for settings.
   * Dictionary of settings to set.
   **/
  public void setSettings(Map<String, String> settings) {
    this.settings = settings;
  }

  /**
   * Getter for environmentName.
   * The name or CRN of the environment. Empty to set system wide settings.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The name or CRN of the environment. Empty to set system wide settings.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetEnvironmentSettingRequest setEnvironmentSettingRequest = (SetEnvironmentSettingRequest) o;
    if (!Objects.equals(this.settings, setEnvironmentSettingRequest.settings)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, setEnvironmentSettingRequest.environmentName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings, environmentName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetEnvironmentSettingRequest {\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line except the first indented by 4 spaces.
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

