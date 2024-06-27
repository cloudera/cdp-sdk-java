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
 * Response object of the cluster Azure settings.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-06-26T16:18:42.398-07:00")
public class AzureOptionsResponse extends CdpResponse {

  /**
   * ID of Azure subnet where the cluster is deployed.
   **/
  private String subnetId = null;

  /**
   * Denotes whther the Azure Availability Zones for the cluster is enabled or not.
   **/
  private Boolean enableAZ = false;

  /**
   * The current outbound type setting.
   **/
  private String outboundType = null;

  /**
   * Workspace ID for Azure log analytics.
   **/
  private String logAnalyticsWorkspaceId = null;

  /**
   * Getter for subnetId.
   * ID of Azure subnet where the cluster is deployed.
   **/
  @JsonProperty("subnetId")
  public String getSubnetId() {
    return subnetId;
  }

  /**
   * Setter for subnetId.
   * ID of Azure subnet where the cluster is deployed.
   **/
  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  /**
   * Getter for enableAZ.
   * Denotes whther the Azure Availability Zones for the cluster is enabled or not.
   **/
  @JsonProperty("enableAZ")
  public Boolean getEnableAZ() {
    return enableAZ;
  }

  /**
   * Setter for enableAZ.
   * Denotes whther the Azure Availability Zones for the cluster is enabled or not.
   **/
  public void setEnableAZ(Boolean enableAZ) {
    this.enableAZ = enableAZ;
  }

  /**
   * Getter for outboundType.
   * The current outbound type setting.
   **/
  @JsonProperty("outboundType")
  public String getOutboundType() {
    return outboundType;
  }

  /**
   * Setter for outboundType.
   * The current outbound type setting.
   **/
  public void setOutboundType(String outboundType) {
    this.outboundType = outboundType;
  }

  /**
   * Getter for logAnalyticsWorkspaceId.
   * Workspace ID for Azure log analytics.
   **/
  @JsonProperty("logAnalyticsWorkspaceId")
  public String getLogAnalyticsWorkspaceId() {
    return logAnalyticsWorkspaceId;
  }

  /**
   * Setter for logAnalyticsWorkspaceId.
   * Workspace ID for Azure log analytics.
   **/
  public void setLogAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
    this.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureOptionsResponse azureOptionsResponse = (AzureOptionsResponse) o;
    if (!Objects.equals(this.subnetId, azureOptionsResponse.subnetId)) {
      return false;
    }
    if (!Objects.equals(this.enableAZ, azureOptionsResponse.enableAZ)) {
      return false;
    }
    if (!Objects.equals(this.outboundType, azureOptionsResponse.outboundType)) {
      return false;
    }
    if (!Objects.equals(this.logAnalyticsWorkspaceId, azureOptionsResponse.logAnalyticsWorkspaceId)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnetId, enableAZ, outboundType, logAnalyticsWorkspaceId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureOptionsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    enableAZ: ").append(toIndentedString(enableAZ)).append("\n");
    sb.append("    outboundType: ").append(toIndentedString(outboundType)).append("\n");
    sb.append("    logAnalyticsWorkspaceId: ").append(toIndentedString(logAnalyticsWorkspaceId)).append("\n");
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

