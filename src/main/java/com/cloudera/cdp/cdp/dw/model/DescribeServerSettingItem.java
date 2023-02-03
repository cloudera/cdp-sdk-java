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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * A DWX server setting.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-02-02T11:30:58.765-08:00")
public class DescribeServerSettingItem  {

  /**
   * The name of the setting in human readable format.
   **/
  private String configurationName = null;

  /**
   * The identifier of the setting.
   **/
  private String configurationKey = null;

  /**
   * The state of the setting.
   **/
  private Boolean enabled = null;

  /**
   * The description of the setting.
   **/
  private String description = null;

  /**
   * Indicates update requirements for the change to take effect.
   **/
  private List<String> requiresUpdate = new ArrayList<String>();;

  /**
   * Getter for configurationName.
   * The name of the setting in human readable format.
   **/
  @JsonProperty("configurationName")
  public String getConfigurationName() {
    return configurationName;
  }

  /**
   * Setter for configurationName.
   * The name of the setting in human readable format.
   **/
  public void setConfigurationName(String configurationName) {
    this.configurationName = configurationName;
  }

  /**
   * Getter for configurationKey.
   * The identifier of the setting.
   **/
  @JsonProperty("configurationKey")
  public String getConfigurationKey() {
    return configurationKey;
  }

  /**
   * Setter for configurationKey.
   * The identifier of the setting.
   **/
  public void setConfigurationKey(String configurationKey) {
    this.configurationKey = configurationKey;
  }

  /**
   * Getter for enabled.
   * The state of the setting.
   **/
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * Setter for enabled.
   * The state of the setting.
   **/
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Getter for description.
   * The description of the setting.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * The description of the setting.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for requiresUpdate.
   * Indicates update requirements for the change to take effect.
   **/
  @JsonProperty("requiresUpdate")
  public List<String> getRequiresUpdate() {
    return requiresUpdate;
  }

  /**
   * Setter for requiresUpdate.
   * Indicates update requirements for the change to take effect.
   **/
  public void setRequiresUpdate(List<String> requiresUpdate) {
    this.requiresUpdate = requiresUpdate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeServerSettingItem describeServerSettingItem = (DescribeServerSettingItem) o;
    if (!Objects.equals(this.configurationName, describeServerSettingItem.configurationName)) {
      return false;
    }
    if (!Objects.equals(this.configurationKey, describeServerSettingItem.configurationKey)) {
      return false;
    }
    if (!Objects.equals(this.enabled, describeServerSettingItem.enabled)) {
      return false;
    }
    if (!Objects.equals(this.description, describeServerSettingItem.description)) {
      return false;
    }
    if (!Objects.equals(this.requiresUpdate, describeServerSettingItem.requiresUpdate)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationName, configurationKey, enabled, description, requiresUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeServerSettingItem {\n");
    sb.append("    configurationName: ").append(toIndentedString(configurationName)).append("\n");
    sb.append("    configurationKey: ").append(toIndentedString(configurationKey)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    requiresUpdate: ").append(toIndentedString(requiresUpdate)).append("\n");
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

