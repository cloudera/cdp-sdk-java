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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datahub.model.CustomConfigurationProperty;
import java.util.*;

/**
 * Information about custom configurations.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-06T11:27:14.324-08:00")
public class CustomConfigurations  {

  /**
   * The name of the custom configurations.
   **/
  private String name = null;

  /**
   * The CRN of the custom configurations.
   **/
  private String crn = null;

  /**
   * The custom configuration properties.
   **/
  private List<CustomConfigurationProperty> configurations = new ArrayList<CustomConfigurationProperty>();

  /**
   * The runtime version of the custom configurations.
   **/
  private String runtimeVersion = null;

  /**
   * The account ID that was used for creating custom configurations.
   **/
  private String accountId = null;

  /**
   * Getter for name.
   * The name of the custom configurations.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the custom configurations.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for crn.
   * The CRN of the custom configurations.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the custom configurations.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for configurations.
   * The custom configuration properties.
   **/
  @JsonProperty("configurations")
  public List<CustomConfigurationProperty> getConfigurations() {
    return configurations;
  }

  /**
   * Setter for configurations.
   * The custom configuration properties.
   **/
  public void setConfigurations(List<CustomConfigurationProperty> configurations) {
    this.configurations = configurations;
  }

  /**
   * Getter for runtimeVersion.
   * The runtime version of the custom configurations.
   **/
  @JsonProperty("runtimeVersion")
  public String getRuntimeVersion() {
    return runtimeVersion;
  }

  /**
   * Setter for runtimeVersion.
   * The runtime version of the custom configurations.
   **/
  public void setRuntimeVersion(String runtimeVersion) {
    this.runtimeVersion = runtimeVersion;
  }

  /**
   * Getter for accountId.
   * The account ID that was used for creating custom configurations.
   **/
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }

  /**
   * Setter for accountId.
   * The account ID that was used for creating custom configurations.
   **/
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomConfigurations customConfigurations = (CustomConfigurations) o;
    if (!Objects.equals(this.name, customConfigurations.name)) {
      return false;
    }
    if (!Objects.equals(this.crn, customConfigurations.crn)) {
      return false;
    }
    if (!Objects.equals(this.configurations, customConfigurations.configurations)) {
      return false;
    }
    if (!Objects.equals(this.runtimeVersion, customConfigurations.runtimeVersion)) {
      return false;
    }
    if (!Objects.equals(this.accountId, customConfigurations.accountId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, crn, configurations, runtimeVersion, accountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomConfigurations {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
    sb.append("    runtimeVersion: ").append(toIndentedString(runtimeVersion)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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

