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

package com.cloudera.cdp.dfworkload.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for deleting a custom Python configuration by CRN.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-06-05T15:31:00.597-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class DeleteCustomPythonConfigurationRequest  {

  /**
   * The CRN of an environment to execute the command.
   **/
  private String environmentCrn = null;

  /**
   * The CRN of the custom Python configuration to delete.
   **/
  private String customPythonConfigurationCrn = null;

  /**
   * The version of the configuration
   **/
  private Integer configurationVersion = null;

  /**
   * Getter for environmentCrn.
   * The CRN of an environment to execute the command.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of an environment to execute the command.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for customPythonConfigurationCrn.
   * The CRN of the custom Python configuration to delete.
   **/
  @JsonProperty("customPythonConfigurationCrn")
  public String getCustomPythonConfigurationCrn() {
    return customPythonConfigurationCrn;
  }

  /**
   * Setter for customPythonConfigurationCrn.
   * The CRN of the custom Python configuration to delete.
   **/
  public void setCustomPythonConfigurationCrn(String customPythonConfigurationCrn) {
    this.customPythonConfigurationCrn = customPythonConfigurationCrn;
  }

  /**
   * Getter for configurationVersion.
   * The version of the configuration
   **/
  @JsonProperty("configurationVersion")
  public Integer getConfigurationVersion() {
    return configurationVersion;
  }

  /**
   * Setter for configurationVersion.
   * The version of the configuration
   **/
  public void setConfigurationVersion(Integer configurationVersion) {
    this.configurationVersion = configurationVersion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteCustomPythonConfigurationRequest deleteCustomPythonConfigurationRequest = (DeleteCustomPythonConfigurationRequest) o;
    if (!Objects.equals(this.environmentCrn, deleteCustomPythonConfigurationRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.customPythonConfigurationCrn, deleteCustomPythonConfigurationRequest.customPythonConfigurationCrn)) {
      return false;
    }
    if (!Objects.equals(this.configurationVersion, deleteCustomPythonConfigurationRequest.configurationVersion)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, customPythonConfigurationCrn, configurationVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteCustomPythonConfigurationRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    customPythonConfigurationCrn: ").append(toIndentedString(customPythonConfigurationCrn)).append("\n");
    sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
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

