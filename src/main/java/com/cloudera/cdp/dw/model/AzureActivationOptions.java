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
 * Options for activating an Azure environment.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-03-30T09:56:50.023-07:00")
public class AzureActivationOptions  {

  /**
   * ID of Azure subnet where the cluster should be deployed.
   **/
  private String subnetId = null;

  /**
   * Enables Azure Availability Zones for the cluster deployment.
   **/
  private Boolean enableAZ = null;

  /**
   * Getter for subnetId.
   * ID of Azure subnet where the cluster should be deployed.
   **/
  @JsonProperty("subnetId")
  public String getSubnetId() {
    return subnetId;
  }

  /**
   * Setter for subnetId.
   * ID of Azure subnet where the cluster should be deployed.
   **/
  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  /**
   * Getter for enableAZ.
   * Enables Azure Availability Zones for the cluster deployment.
   **/
  @JsonProperty("enableAZ")
  public Boolean getEnableAZ() {
    return enableAZ;
  }

  /**
   * Setter for enableAZ.
   * Enables Azure Availability Zones for the cluster deployment.
   **/
  public void setEnableAZ(Boolean enableAZ) {
    this.enableAZ = enableAZ;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureActivationOptions azureActivationOptions = (AzureActivationOptions) o;
    if (!Objects.equals(this.subnetId, azureActivationOptions.subnetId)) {
      return false;
    }
    if (!Objects.equals(this.enableAZ, azureActivationOptions.enableAZ)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnetId, enableAZ);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureActivationOptions {\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    enableAZ: ").append(toIndentedString(enableAZ)).append("\n");
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

