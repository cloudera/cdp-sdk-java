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
 * Environment tags object containing the tag values defined for the environment.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-03-27T12:18:19.900-07:00")
public class EnvironmentTags  {

  /**
   * Map of tag names to values, for user-defined tags.
   **/
  private Map<String, String> userDefined = new HashMap<String, String>();

  /**
   * Map of tag names to values, for default tags.
   **/
  private Map<String, String> defaults = new HashMap<String, String>();

  /**
   * Getter for userDefined.
   * Map of tag names to values, for user-defined tags.
   **/
  @JsonProperty("userDefined")
  public Map<String, String> getUserDefined() {
    return userDefined;
  }

  /**
   * Setter for userDefined.
   * Map of tag names to values, for user-defined tags.
   **/
  public void setUserDefined(Map<String, String> userDefined) {
    this.userDefined = userDefined;
  }

  /**
   * Getter for defaults.
   * Map of tag names to values, for default tags.
   **/
  @JsonProperty("defaults")
  public Map<String, String> getDefaults() {
    return defaults;
  }

  /**
   * Setter for defaults.
   * Map of tag names to values, for default tags.
   **/
  public void setDefaults(Map<String, String> defaults) {
    this.defaults = defaults;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentTags environmentTags = (EnvironmentTags) o;
    if (!Objects.equals(this.userDefined, environmentTags.userDefined)) {
      return false;
    }
    if (!Objects.equals(this.defaults, environmentTags.defaults)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(userDefined, defaults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentTags {\n");
    sb.append("    userDefined: ").append(toIndentedString(userDefined)).append("\n");
    sb.append("    defaults: ").append(toIndentedString(defaults)).append("\n");
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

