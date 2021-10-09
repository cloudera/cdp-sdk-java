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

/**
 * Request object to query environment configuration settings.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-10-08T17:07:08.008-07:00")
public class GetEnvironmentSettingRequest  {

  /**
   * List of attributes to query settings for. Non-existant settings will be ignored.
   **/
  private List<String> attrs = new ArrayList<String>();

  /**
   * The name or CRN of the environment. Empty to get system wide settings.
   **/
  private String environmentName = null;

  /**
   * Getter for attrs.
   * List of attributes to query settings for. Non-existant settings will be ignored.
   **/
  @JsonProperty("attrs")
  public List<String> getAttrs() {
    return attrs;
  }

  /**
   * Setter for attrs.
   * List of attributes to query settings for. Non-existant settings will be ignored.
   **/
  public void setAttrs(List<String> attrs) {
    this.attrs = attrs;
  }

  /**
   * Getter for environmentName.
   * The name or CRN of the environment. Empty to get system wide settings.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The name or CRN of the environment. Empty to get system wide settings.
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
    GetEnvironmentSettingRequest getEnvironmentSettingRequest = (GetEnvironmentSettingRequest) o;
    if (!Objects.equals(this.attrs, getEnvironmentSettingRequest.attrs)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, getEnvironmentSettingRequest.environmentName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(attrs, environmentName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEnvironmentSettingRequest {\n");
    sb.append("    attrs: ").append(toIndentedString(attrs)).append("\n");
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
