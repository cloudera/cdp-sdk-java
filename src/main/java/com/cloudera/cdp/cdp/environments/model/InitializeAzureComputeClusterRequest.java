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
import com.cloudera.cdp.environments.model.AzureComputeClusterConfigurationRequest;

/**
 * Request object for a initialize Azure default compute cluster.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:42.850-07:00")
public class InitializeAzureComputeClusterRequest  {

  /**
   * The name of the environment.
   **/
  private String environmentName = null;

  /**
   * The Externalized k8s configuration create request for the environment
   **/
  private AzureComputeClusterConfigurationRequest computeClusterConfiguration = null;

  /**
   * Getter for environmentName.
   * The name of the environment.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The name of the environment.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for computeClusterConfiguration.
   * The Externalized k8s configuration create request for the environment
   **/
  @JsonProperty("computeClusterConfiguration")
  public AzureComputeClusterConfigurationRequest getComputeClusterConfiguration() {
    return computeClusterConfiguration;
  }

  /**
   * Setter for computeClusterConfiguration.
   * The Externalized k8s configuration create request for the environment
   **/
  public void setComputeClusterConfiguration(AzureComputeClusterConfigurationRequest computeClusterConfiguration) {
    this.computeClusterConfiguration = computeClusterConfiguration;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitializeAzureComputeClusterRequest initializeAzureComputeClusterRequest = (InitializeAzureComputeClusterRequest) o;
    if (!Objects.equals(this.environmentName, initializeAzureComputeClusterRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.computeClusterConfiguration, initializeAzureComputeClusterRequest.computeClusterConfiguration)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, computeClusterConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitializeAzureComputeClusterRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    computeClusterConfiguration: ").append(toIndentedString(computeClusterConfiguration)).append("\n");
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

