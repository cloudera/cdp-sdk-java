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
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-09-03T11:22:07.520-07:00")
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
   * Pod CIDR setting for Azure CNI networking.
   **/
  private String aksPodCIDR = null;

  /**
   * Workspace ID for Azure log analytics.
   **/
  private String logAnalyticsWorkspaceId = null;

  /**
   * Name of the delegated subnet where the private SQL should be deployed.
   **/
  private String privateSQLSubnetName = null;

  /**
   * Private DNS zone ID for the PostgreSQL server.
   **/
  private String privateDNSZoneSQL = null;

  /**
   * Denotes whether the private SQL is enabled for the cluster.
   **/
  private Boolean enablePrivateSQL = false;

  /**
   * The resource ID of the private DNS zone for the AKS cluster.
   **/
  private String privateDNSZoneAKS = null;

  /**
   * Denotes whether the AKS cluster is in private mode.
   **/
  private Boolean enablePrivateAKS = false;

  /**
   * The resource ID of the managed identity used by the AKS cluster.
   **/
  private String userAssignedManagedIdentity = null;

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
   * Getter for aksPodCIDR.
   * Pod CIDR setting for Azure CNI networking.
   **/
  @JsonProperty("aksPodCIDR")
  public String getAksPodCIDR() {
    return aksPodCIDR;
  }

  /**
   * Setter for aksPodCIDR.
   * Pod CIDR setting for Azure CNI networking.
   **/
  public void setAksPodCIDR(String aksPodCIDR) {
    this.aksPodCIDR = aksPodCIDR;
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

  /**
   * Getter for privateSQLSubnetName.
   * Name of the delegated subnet where the private SQL should be deployed.
   **/
  @JsonProperty("privateSQLSubnetName")
  public String getPrivateSQLSubnetName() {
    return privateSQLSubnetName;
  }

  /**
   * Setter for privateSQLSubnetName.
   * Name of the delegated subnet where the private SQL should be deployed.
   **/
  public void setPrivateSQLSubnetName(String privateSQLSubnetName) {
    this.privateSQLSubnetName = privateSQLSubnetName;
  }

  /**
   * Getter for privateDNSZoneSQL.
   * Private DNS zone ID for the PostgreSQL server.
   **/
  @JsonProperty("privateDNSZoneSQL")
  public String getPrivateDNSZoneSQL() {
    return privateDNSZoneSQL;
  }

  /**
   * Setter for privateDNSZoneSQL.
   * Private DNS zone ID for the PostgreSQL server.
   **/
  public void setPrivateDNSZoneSQL(String privateDNSZoneSQL) {
    this.privateDNSZoneSQL = privateDNSZoneSQL;
  }

  /**
   * Getter for enablePrivateSQL.
   * Denotes whether the private SQL is enabled for the cluster.
   **/
  @JsonProperty("enablePrivateSQL")
  public Boolean getEnablePrivateSQL() {
    return enablePrivateSQL;
  }

  /**
   * Setter for enablePrivateSQL.
   * Denotes whether the private SQL is enabled for the cluster.
   **/
  public void setEnablePrivateSQL(Boolean enablePrivateSQL) {
    this.enablePrivateSQL = enablePrivateSQL;
  }

  /**
   * Getter for privateDNSZoneAKS.
   * The resource ID of the private DNS zone for the AKS cluster.
   **/
  @JsonProperty("privateDNSZoneAKS")
  public String getPrivateDNSZoneAKS() {
    return privateDNSZoneAKS;
  }

  /**
   * Setter for privateDNSZoneAKS.
   * The resource ID of the private DNS zone for the AKS cluster.
   **/
  public void setPrivateDNSZoneAKS(String privateDNSZoneAKS) {
    this.privateDNSZoneAKS = privateDNSZoneAKS;
  }

  /**
   * Getter for enablePrivateAKS.
   * Denotes whether the AKS cluster is in private mode.
   **/
  @JsonProperty("enablePrivateAKS")
  public Boolean getEnablePrivateAKS() {
    return enablePrivateAKS;
  }

  /**
   * Setter for enablePrivateAKS.
   * Denotes whether the AKS cluster is in private mode.
   **/
  public void setEnablePrivateAKS(Boolean enablePrivateAKS) {
    this.enablePrivateAKS = enablePrivateAKS;
  }

  /**
   * Getter for userAssignedManagedIdentity.
   * The resource ID of the managed identity used by the AKS cluster.
   **/
  @JsonProperty("userAssignedManagedIdentity")
  public String getUserAssignedManagedIdentity() {
    return userAssignedManagedIdentity;
  }

  /**
   * Setter for userAssignedManagedIdentity.
   * The resource ID of the managed identity used by the AKS cluster.
   **/
  public void setUserAssignedManagedIdentity(String userAssignedManagedIdentity) {
    this.userAssignedManagedIdentity = userAssignedManagedIdentity;
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
    if (!Objects.equals(this.aksPodCIDR, azureOptionsResponse.aksPodCIDR)) {
      return false;
    }
    if (!Objects.equals(this.logAnalyticsWorkspaceId, azureOptionsResponse.logAnalyticsWorkspaceId)) {
      return false;
    }
    if (!Objects.equals(this.privateSQLSubnetName, azureOptionsResponse.privateSQLSubnetName)) {
      return false;
    }
    if (!Objects.equals(this.privateDNSZoneSQL, azureOptionsResponse.privateDNSZoneSQL)) {
      return false;
    }
    if (!Objects.equals(this.enablePrivateSQL, azureOptionsResponse.enablePrivateSQL)) {
      return false;
    }
    if (!Objects.equals(this.privateDNSZoneAKS, azureOptionsResponse.privateDNSZoneAKS)) {
      return false;
    }
    if (!Objects.equals(this.enablePrivateAKS, azureOptionsResponse.enablePrivateAKS)) {
      return false;
    }
    if (!Objects.equals(this.userAssignedManagedIdentity, azureOptionsResponse.userAssignedManagedIdentity)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnetId, enableAZ, outboundType, aksPodCIDR, logAnalyticsWorkspaceId, privateSQLSubnetName, privateDNSZoneSQL, enablePrivateSQL, privateDNSZoneAKS, enablePrivateAKS, userAssignedManagedIdentity, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureOptionsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    enableAZ: ").append(toIndentedString(enableAZ)).append("\n");
    sb.append("    outboundType: ").append(toIndentedString(outboundType)).append("\n");
    sb.append("    aksPodCIDR: ").append(toIndentedString(aksPodCIDR)).append("\n");
    sb.append("    logAnalyticsWorkspaceId: ").append(toIndentedString(logAnalyticsWorkspaceId)).append("\n");
    sb.append("    privateSQLSubnetName: ").append(toIndentedString(privateSQLSubnetName)).append("\n");
    sb.append("    privateDNSZoneSQL: ").append(toIndentedString(privateDNSZoneSQL)).append("\n");
    sb.append("    enablePrivateSQL: ").append(toIndentedString(enablePrivateSQL)).append("\n");
    sb.append("    privateDNSZoneAKS: ").append(toIndentedString(privateDNSZoneAKS)).append("\n");
    sb.append("    enablePrivateAKS: ").append(toIndentedString(enablePrivateAKS)).append("\n");
    sb.append("    userAssignedManagedIdentity: ").append(toIndentedString(userAssignedManagedIdentity)).append("\n");
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

