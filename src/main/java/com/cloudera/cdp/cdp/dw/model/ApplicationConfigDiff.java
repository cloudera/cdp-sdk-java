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
import com.cloudera.cdp.dw.model.ConfigBlocksDiffs;

/**
 * Differences between two ApplicationConfigs.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-14T06:50:04.824-08:00")
public class ApplicationConfigDiff  {

  /**
   * Has any of the configurations changed?
   **/
  private Boolean isChanged = null;

  /**
   * Differences between the two sets of ConfigBlocks.
   **/
  private ConfigBlocksDiffs configBlocksDiffs = null;

  /**
   * Getter for isChanged.
   * Has any of the configurations changed?
   **/
  @JsonProperty("isChanged")
  public Boolean getIsChanged() {
    return isChanged;
  }

  /**
   * Setter for isChanged.
   * Has any of the configurations changed?
   **/
  public void setIsChanged(Boolean isChanged) {
    this.isChanged = isChanged;
  }

  /**
   * Getter for configBlocksDiffs.
   * Differences between the two sets of ConfigBlocks.
   **/
  @JsonProperty("configBlocksDiffs")
  public ConfigBlocksDiffs getConfigBlocksDiffs() {
    return configBlocksDiffs;
  }

  /**
   * Setter for configBlocksDiffs.
   * Differences between the two sets of ConfigBlocks.
   **/
  public void setConfigBlocksDiffs(ConfigBlocksDiffs configBlocksDiffs) {
    this.configBlocksDiffs = configBlocksDiffs;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationConfigDiff applicationConfigDiff = (ApplicationConfigDiff) o;
    if (!Objects.equals(this.isChanged, applicationConfigDiff.isChanged)) {
      return false;
    }
    if (!Objects.equals(this.configBlocksDiffs, applicationConfigDiff.configBlocksDiffs)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(isChanged, configBlocksDiffs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationConfigDiff {\n");
    sb.append("    isChanged: ").append(toIndentedString(isChanged)).append("\n");
    sb.append("    configBlocksDiffs: ").append(toIndentedString(configBlocksDiffs)).append("\n");
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

