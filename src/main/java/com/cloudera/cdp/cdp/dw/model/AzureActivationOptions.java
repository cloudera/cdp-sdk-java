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
import java.util.*;

/**
 * Options for activating an Azure environment.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-01-05T09:16:29.548-08:00")
public class AzureActivationOptions  {

  /**
   * Resource ID of the managed identity used by AKS. It is a mandatory parameter for Azure cluster creation.
   **/
  private String userAssignedManagedIdentity = null;

  /**
   * ID of Azure subnet where the cluster should be deployed. It is a mandatory parameter for Azure cluster creation.
   **/
  private String subnetId = null;

  /**
   * Enables Azure Availability Zones for the cluster deployment.
   **/
  private Boolean enableAZ = null;

  /**
   * Whether to enable spot instances for Virtual warehouses. It cannot be updated later. If the AzureActivationOptions is not provided it defaults to false.
   **/
  private Boolean enableSpotInstances = false;

  /**
   * Azure compute instance types that the environment is restricted to use. This affects the creation of virtual warehouses where this restriction will apply. Select an instance type that meets your computing, memory, networking, or storage needs. As of now, only a single instance type can be listed. Use describe-allowed-instance-types to see currently possible values and the default value used for the case it is not provided.
   **/
  private List<String> computeInstanceTypes = new ArrayList<String>();

  /**
   * Enable monitoring of Azure Kubernetes Service (AKS) cluster. Workspace ID for Azure log analytics.
   **/
  private String logAnalyticsWorkspaceId = null;

  /**
   * Network outbound type. This setting controls the egress traffic for cluster nodes in Azure Kubernetes Service. Please refer to the following AKS documentation on the Azure portal. https://learn.microsoft.com/en-us/azure/aks/egress-outboundtype, https://learn.microsoft.com/en-us/azure/aks/nat-gateway
   **/
  private String outboundType = null;

  /**
   * Enables private SQL for the cluster deployment.
   **/
  private Boolean enablePrivateSQL = false;

  /**
   * Private DNS zone AKS resource ID.
   **/
  private String privateDNSZoneAKS = null;

  /**
   * Enable Azure Private AKS mode. Note that this feature is currently unstable due to critical networking issues within the Azure Software Definition Layer (SDN). This problem prevents the deployment of necessary components and results in unpredictable behavior and instability, impacting operations such as environment activation, VW creation, modification, and start/stop operations. While we work towards a resolution with Microsoft, estimated within the next 6-9 months, we recommend utilizing alternative methods like enabling public endpoints or virtual network peering for accessing your Azure Cluster.
   **/
  private Boolean enablePrivateAks = false;

  /**
   * Getter for userAssignedManagedIdentity.
   * Resource ID of the managed identity used by AKS. It is a mandatory parameter for Azure cluster creation.
   **/
  @JsonProperty("userAssignedManagedIdentity")
  public String getUserAssignedManagedIdentity() {
    return userAssignedManagedIdentity;
  }

  /**
   * Setter for userAssignedManagedIdentity.
   * Resource ID of the managed identity used by AKS. It is a mandatory parameter for Azure cluster creation.
   **/
  public void setUserAssignedManagedIdentity(String userAssignedManagedIdentity) {
    this.userAssignedManagedIdentity = userAssignedManagedIdentity;
  }

  /**
   * Getter for subnetId.
   * ID of Azure subnet where the cluster should be deployed. It is a mandatory parameter for Azure cluster creation.
   **/
  @JsonProperty("subnetId")
  public String getSubnetId() {
    return subnetId;
  }

  /**
   * Setter for subnetId.
   * ID of Azure subnet where the cluster should be deployed. It is a mandatory parameter for Azure cluster creation.
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

  /**
   * Getter for enableSpotInstances.
   * Whether to enable spot instances for Virtual warehouses. It cannot be updated later. If the AzureActivationOptions is not provided it defaults to false.
   **/
  @JsonProperty("enableSpotInstances")
  public Boolean getEnableSpotInstances() {
    return enableSpotInstances;
  }

  /**
   * Setter for enableSpotInstances.
   * Whether to enable spot instances for Virtual warehouses. It cannot be updated later. If the AzureActivationOptions is not provided it defaults to false.
   **/
  public void setEnableSpotInstances(Boolean enableSpotInstances) {
    this.enableSpotInstances = enableSpotInstances;
  }

  /**
   * Getter for computeInstanceTypes.
   * Azure compute instance types that the environment is restricted to use. This affects the creation of virtual warehouses where this restriction will apply. Select an instance type that meets your computing, memory, networking, or storage needs. As of now, only a single instance type can be listed. Use describe-allowed-instance-types to see currently possible values and the default value used for the case it is not provided.
   **/
  @JsonProperty("computeInstanceTypes")
  public List<String> getComputeInstanceTypes() {
    return computeInstanceTypes;
  }

  /**
   * Setter for computeInstanceTypes.
   * Azure compute instance types that the environment is restricted to use. This affects the creation of virtual warehouses where this restriction will apply. Select an instance type that meets your computing, memory, networking, or storage needs. As of now, only a single instance type can be listed. Use describe-allowed-instance-types to see currently possible values and the default value used for the case it is not provided.
   **/
  public void setComputeInstanceTypes(List<String> computeInstanceTypes) {
    this.computeInstanceTypes = computeInstanceTypes;
  }

  /**
   * Getter for logAnalyticsWorkspaceId.
   * Enable monitoring of Azure Kubernetes Service (AKS) cluster. Workspace ID for Azure log analytics.
   **/
  @JsonProperty("logAnalyticsWorkspaceId")
  public String getLogAnalyticsWorkspaceId() {
    return logAnalyticsWorkspaceId;
  }

  /**
   * Setter for logAnalyticsWorkspaceId.
   * Enable monitoring of Azure Kubernetes Service (AKS) cluster. Workspace ID for Azure log analytics.
   **/
  public void setLogAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
    this.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
  }

  /**
   * Getter for outboundType.
   * Network outbound type. This setting controls the egress traffic for cluster nodes in Azure Kubernetes Service. Please refer to the following AKS documentation on the Azure portal. https://learn.microsoft.com/en-us/azure/aks/egress-outboundtype, https://learn.microsoft.com/en-us/azure/aks/nat-gateway
   **/
  @JsonProperty("outboundType")
  public String getOutboundType() {
    return outboundType;
  }

  /**
   * Setter for outboundType.
   * Network outbound type. This setting controls the egress traffic for cluster nodes in Azure Kubernetes Service. Please refer to the following AKS documentation on the Azure portal. https://learn.microsoft.com/en-us/azure/aks/egress-outboundtype, https://learn.microsoft.com/en-us/azure/aks/nat-gateway
   **/
  public void setOutboundType(String outboundType) {
    this.outboundType = outboundType;
  }

  /**
   * Getter for enablePrivateSQL.
   * Enables private SQL for the cluster deployment.
   **/
  @JsonProperty("enablePrivateSQL")
  public Boolean getEnablePrivateSQL() {
    return enablePrivateSQL;
  }

  /**
   * Setter for enablePrivateSQL.
   * Enables private SQL for the cluster deployment.
   **/
  public void setEnablePrivateSQL(Boolean enablePrivateSQL) {
    this.enablePrivateSQL = enablePrivateSQL;
  }

  /**
   * Getter for privateDNSZoneAKS.
   * Private DNS zone AKS resource ID.
   **/
  @JsonProperty("privateDNSZoneAKS")
  public String getPrivateDNSZoneAKS() {
    return privateDNSZoneAKS;
  }

  /**
   * Setter for privateDNSZoneAKS.
   * Private DNS zone AKS resource ID.
   **/
  public void setPrivateDNSZoneAKS(String privateDNSZoneAKS) {
    this.privateDNSZoneAKS = privateDNSZoneAKS;
  }

  /**
   * Getter for enablePrivateAks.
   * Enable Azure Private AKS mode. Note that this feature is currently unstable due to critical networking issues within the Azure Software Definition Layer (SDN). This problem prevents the deployment of necessary components and results in unpredictable behavior and instability, impacting operations such as environment activation, VW creation, modification, and start/stop operations. While we work towards a resolution with Microsoft, estimated within the next 6-9 months, we recommend utilizing alternative methods like enabling public endpoints or virtual network peering for accessing your Azure Cluster.
   **/
  @JsonProperty("enablePrivateAks")
  public Boolean getEnablePrivateAks() {
    return enablePrivateAks;
  }

  /**
   * Setter for enablePrivateAks.
   * Enable Azure Private AKS mode. Note that this feature is currently unstable due to critical networking issues within the Azure Software Definition Layer (SDN). This problem prevents the deployment of necessary components and results in unpredictable behavior and instability, impacting operations such as environment activation, VW creation, modification, and start/stop operations. While we work towards a resolution with Microsoft, estimated within the next 6-9 months, we recommend utilizing alternative methods like enabling public endpoints or virtual network peering for accessing your Azure Cluster.
   **/
  public void setEnablePrivateAks(Boolean enablePrivateAks) {
    this.enablePrivateAks = enablePrivateAks;
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
    if (!Objects.equals(this.userAssignedManagedIdentity, azureActivationOptions.userAssignedManagedIdentity)) {
      return false;
    }
    if (!Objects.equals(this.subnetId, azureActivationOptions.subnetId)) {
      return false;
    }
    if (!Objects.equals(this.enableAZ, azureActivationOptions.enableAZ)) {
      return false;
    }
    if (!Objects.equals(this.enableSpotInstances, azureActivationOptions.enableSpotInstances)) {
      return false;
    }
    if (!Objects.equals(this.computeInstanceTypes, azureActivationOptions.computeInstanceTypes)) {
      return false;
    }
    if (!Objects.equals(this.logAnalyticsWorkspaceId, azureActivationOptions.logAnalyticsWorkspaceId)) {
      return false;
    }
    if (!Objects.equals(this.outboundType, azureActivationOptions.outboundType)) {
      return false;
    }
    if (!Objects.equals(this.enablePrivateSQL, azureActivationOptions.enablePrivateSQL)) {
      return false;
    }
    if (!Objects.equals(this.privateDNSZoneAKS, azureActivationOptions.privateDNSZoneAKS)) {
      return false;
    }
    if (!Objects.equals(this.enablePrivateAks, azureActivationOptions.enablePrivateAks)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(userAssignedManagedIdentity, subnetId, enableAZ, enableSpotInstances, computeInstanceTypes, logAnalyticsWorkspaceId, outboundType, enablePrivateSQL, privateDNSZoneAKS, enablePrivateAks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureActivationOptions {\n");
    sb.append("    userAssignedManagedIdentity: ").append(toIndentedString(userAssignedManagedIdentity)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    enableAZ: ").append(toIndentedString(enableAZ)).append("\n");
    sb.append("    enableSpotInstances: ").append(toIndentedString(enableSpotInstances)).append("\n");
    sb.append("    computeInstanceTypes: ").append(toIndentedString(computeInstanceTypes)).append("\n");
    sb.append("    logAnalyticsWorkspaceId: ").append(toIndentedString(logAnalyticsWorkspaceId)).append("\n");
    sb.append("    outboundType: ").append(toIndentedString(outboundType)).append("\n");
    sb.append("    enablePrivateSQL: ").append(toIndentedString(enablePrivateSQL)).append("\n");
    sb.append("    privateDNSZoneAKS: ").append(toIndentedString(privateDNSZoneAKS)).append("\n");
    sb.append("    enablePrivateAks: ").append(toIndentedString(enablePrivateAks)).append("\n");
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

