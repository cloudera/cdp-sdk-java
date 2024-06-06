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

/**
 * A DWX server setting update.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-06-05T15:30:57.248-07:00")
public class UpdateServerSettingItem  {

  /**
   * The identifier of the setting.
   **/
  private String configurationKey = null;

  /**
   * The state of the setting.
   **/
  private Boolean enabled = null;

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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateServerSettingItem updateServerSettingItem = (UpdateServerSettingItem) o;
    if (!Objects.equals(this.configurationKey, updateServerSettingItem.configurationKey)) {
      return false;
    }
    if (!Objects.equals(this.enabled, updateServerSettingItem.enabled)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationKey, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateServerSettingItem {\n");
    sb.append("    configurationKey: ").append(toIndentedString(configurationKey)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

