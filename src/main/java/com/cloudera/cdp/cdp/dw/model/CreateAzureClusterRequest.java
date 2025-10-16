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
import com.cloudera.cdp.dw.model.CustomRegistryOptions;
import java.util.*;

/**
 * Request object for the createAzureCluster method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-15T17:00:44.787-07:00")
public class CreateAzureClusterRequest  {

  /**
   * The CRN of the environment for the cluster to create.
   **/
  private String environmentCrn = null;

  /**
   * Resource ID of the managed identity used by AKS. It is a mandatory parameter for Azure cluster creation.
   **/
  private String userAssignedManagedIdentity = null;

  /**
   * Name of Azure subnet where the cluster should be deployed. It is a mandatory parameter for Azure cluster creation.
   **/
  private String subnetName = null;

  /**
   * With overlay network nodes get an IP address from the Azure virtual network subnet. Pods receive an IP address from a logically different address space to the Azure virtual network subnet of the nodes.
   **/
  private Boolean useOverlayNetworking = null;

  /**
   * PostgreSQL server backup retention days.
   **/
  private Integer databaseBackupRetentionPeriod = 30;

  /**
   * List of IP address CIDRs to whitelist for kubernetes cluster access.
   **/
  private List<String> whitelistK8sClusterAccessIpCIDRs = new ArrayList<String>();

  /**
   * List of IP address CIDRs to whitelist for workload access.
   **/
  private List<String> whitelistWorkloadAccessIpCIDRs = new ArrayList<String>();

  /**
   * Set up load balancer with private IP address. An internal load balancer gets created. Make sure there is connectivity between your client network and the network VNet where CDW environment is deployed.
   **/
  private Boolean useInternalLoadBalancer = null;

  /**
   * Options for custom ACR/ECR registries.
   **/
  private CustomRegistryOptions customRegistryOptions = null;

  /**
   * Custom environment subdomain. Overrides the environment subdomain using a customized domain either in the old subdomain format like ENV_ID.dw or the new format like dw-ENV_NAME.
   **/
  private String customSubdomain = null;

  /**
   * Enables Azure Availability Zones for the cluster deployment.
   **/
  private Boolean enableAZ = null;

  /**
   * Whether to enable spot instances for Virtual warehouses. It cannot be updated later. Defaults to false.
   **/
  private Boolean enableSpotInstances = false;

  /**
   * Enable monitoring of Azure Kubernetes Service (AKS) cluster. Workspace ID for Azure log analytics.
   **/
  private String logAnalyticsWorkspaceId = null;

  /**
   * Network outbound type. This setting controls the egress traffic for cluster nodes in Azure Kubernetes Service. Please refer to the following AKS documentation on the Azure portal. https://learn.microsoft.com/en-us/azure/aks/egress-outboundtype, https://learn.microsoft.com/en-us/azure/aks/nat-gateway
   **/
  private String outboundType = null;

  /**
   * Pod CIDR required for Azure CNI networking. Please refer to the following Azure documentation, https://docs.microsoft.com/en-us/azure/aks/azure-cni-overlay.
   **/
  private String aksPodCIDR = null;

  /**
   * Enables private SQL for the cluster deployment.
   **/
  private Boolean enablePrivateSQL = false;

  /**
   * Name of the delegated subnet where the private SQL should be deployed.
   **/
  private String privateSQLSubnetName = null;

  /**
   * Private DNS zone ID for the PostgreSQL server.
   **/
  private String privateDNSZoneSQL = null;

  /**
   * Private DNS zone AKS resource ID.
   **/
  private String privateDNSZoneAKS = null;

  /**
   * Enable Azure Private AKS mode.
   **/
  private Boolean enablePrivateAks = false;

  /**
   * Getter for environmentCrn.
   * The CRN of the environment for the cluster to create.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of the environment for the cluster to create.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

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
   * Getter for subnetName.
   * Name of Azure subnet where the cluster should be deployed. It is a mandatory parameter for Azure cluster creation.
   **/
  @JsonProperty("subnetName")
  public String getSubnetName() {
    return subnetName;
  }

  /**
   * Setter for subnetName.
   * Name of Azure subnet where the cluster should be deployed. It is a mandatory parameter for Azure cluster creation.
   **/
  public void setSubnetName(String subnetName) {
    this.subnetName = subnetName;
  }

  /**
   * Getter for useOverlayNetworking.
   * With overlay network nodes get an IP address from the Azure virtual network subnet. Pods receive an IP address from a logically different address space to the Azure virtual network subnet of the nodes.
   **/
  @JsonProperty("useOverlayNetworking")
  public Boolean getUseOverlayNetworking() {
    return useOverlayNetworking;
  }

  /**
   * Setter for useOverlayNetworking.
   * With overlay network nodes get an IP address from the Azure virtual network subnet. Pods receive an IP address from a logically different address space to the Azure virtual network subnet of the nodes.
   **/
  public void setUseOverlayNetworking(Boolean useOverlayNetworking) {
    this.useOverlayNetworking = useOverlayNetworking;
  }

  /**
   * Getter for databaseBackupRetentionPeriod.
   * PostgreSQL server backup retention days.
   **/
  @JsonProperty("databaseBackupRetentionPeriod")
  public Integer getDatabaseBackupRetentionPeriod() {
    return databaseBackupRetentionPeriod;
  }

  /**
   * Setter for databaseBackupRetentionPeriod.
   * PostgreSQL server backup retention days.
   **/
  public void setDatabaseBackupRetentionPeriod(Integer databaseBackupRetentionPeriod) {
    this.databaseBackupRetentionPeriod = databaseBackupRetentionPeriod;
  }

  /**
   * Getter for whitelistK8sClusterAccessIpCIDRs.
   * List of IP address CIDRs to whitelist for kubernetes cluster access.
   **/
  @JsonProperty("whitelistK8sClusterAccessIpCIDRs")
  public List<String> getWhitelistK8sClusterAccessIpCIDRs() {
    return whitelistK8sClusterAccessIpCIDRs;
  }

  /**
   * Setter for whitelistK8sClusterAccessIpCIDRs.
   * List of IP address CIDRs to whitelist for kubernetes cluster access.
   **/
  public void setWhitelistK8sClusterAccessIpCIDRs(List<String> whitelistK8sClusterAccessIpCIDRs) {
    this.whitelistK8sClusterAccessIpCIDRs = whitelistK8sClusterAccessIpCIDRs;
  }

  /**
   * Getter for whitelistWorkloadAccessIpCIDRs.
   * List of IP address CIDRs to whitelist for workload access.
   **/
  @JsonProperty("whitelistWorkloadAccessIpCIDRs")
  public List<String> getWhitelistWorkloadAccessIpCIDRs() {
    return whitelistWorkloadAccessIpCIDRs;
  }

  /**
   * Setter for whitelistWorkloadAccessIpCIDRs.
   * List of IP address CIDRs to whitelist for workload access.
   **/
  public void setWhitelistWorkloadAccessIpCIDRs(List<String> whitelistWorkloadAccessIpCIDRs) {
    this.whitelistWorkloadAccessIpCIDRs = whitelistWorkloadAccessIpCIDRs;
  }

  /**
   * Getter for useInternalLoadBalancer.
   * Set up load balancer with private IP address. An internal load balancer gets created. Make sure there is connectivity between your client network and the network VNet where CDW environment is deployed.
   **/
  @JsonProperty("useInternalLoadBalancer")
  public Boolean getUseInternalLoadBalancer() {
    return useInternalLoadBalancer;
  }

  /**
   * Setter for useInternalLoadBalancer.
   * Set up load balancer with private IP address. An internal load balancer gets created. Make sure there is connectivity between your client network and the network VNet where CDW environment is deployed.
   **/
  public void setUseInternalLoadBalancer(Boolean useInternalLoadBalancer) {
    this.useInternalLoadBalancer = useInternalLoadBalancer;
  }

  /**
   * Getter for customRegistryOptions.
   * Options for custom ACR/ECR registries.
   **/
  @JsonProperty("customRegistryOptions")
  public CustomRegistryOptions getCustomRegistryOptions() {
    return customRegistryOptions;
  }

  /**
   * Setter for customRegistryOptions.
   * Options for custom ACR/ECR registries.
   **/
  public void setCustomRegistryOptions(CustomRegistryOptions customRegistryOptions) {
    this.customRegistryOptions = customRegistryOptions;
  }

  /**
   * Getter for customSubdomain.
   * Custom environment subdomain. Overrides the environment subdomain using a customized domain either in the old subdomain format like ENV_ID.dw or the new format like dw-ENV_NAME.
   **/
  @JsonProperty("customSubdomain")
  public String getCustomSubdomain() {
    return customSubdomain;
  }

  /**
   * Setter for customSubdomain.
   * Custom environment subdomain. Overrides the environment subdomain using a customized domain either in the old subdomain format like ENV_ID.dw or the new format like dw-ENV_NAME.
   **/
  public void setCustomSubdomain(String customSubdomain) {
    this.customSubdomain = customSubdomain;
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
   * Whether to enable spot instances for Virtual warehouses. It cannot be updated later. Defaults to false.
   **/
  @JsonProperty("enableSpotInstances")
  public Boolean getEnableSpotInstances() {
    return enableSpotInstances;
  }

  /**
   * Setter for enableSpotInstances.
   * Whether to enable spot instances for Virtual warehouses. It cannot be updated later. Defaults to false.
   **/
  public void setEnableSpotInstances(Boolean enableSpotInstances) {
    this.enableSpotInstances = enableSpotInstances;
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
   * Getter for aksPodCIDR.
   * Pod CIDR required for Azure CNI networking. Please refer to the following Azure documentation, https://docs.microsoft.com/en-us/azure/aks/azure-cni-overlay.
   **/
  @JsonProperty("aksPodCIDR")
  public String getAksPodCIDR() {
    return aksPodCIDR;
  }

  /**
   * Setter for aksPodCIDR.
   * Pod CIDR required for Azure CNI networking. Please refer to the following Azure documentation, https://docs.microsoft.com/en-us/azure/aks/azure-cni-overlay.
   **/
  public void setAksPodCIDR(String aksPodCIDR) {
    this.aksPodCIDR = aksPodCIDR;
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
   * Enable Azure Private AKS mode.
   **/
  @JsonProperty("enablePrivateAks")
  public Boolean getEnablePrivateAks() {
    return enablePrivateAks;
  }

  /**
   * Setter for enablePrivateAks.
   * Enable Azure Private AKS mode.
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
    CreateAzureClusterRequest createAzureClusterRequest = (CreateAzureClusterRequest) o;
    if (!Objects.equals(this.environmentCrn, createAzureClusterRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.userAssignedManagedIdentity, createAzureClusterRequest.userAssignedManagedIdentity)) {
      return false;
    }
    if (!Objects.equals(this.subnetName, createAzureClusterRequest.subnetName)) {
      return false;
    }
    if (!Objects.equals(this.useOverlayNetworking, createAzureClusterRequest.useOverlayNetworking)) {
      return false;
    }
    if (!Objects.equals(this.databaseBackupRetentionPeriod, createAzureClusterRequest.databaseBackupRetentionPeriod)) {
      return false;
    }
    if (!Objects.equals(this.whitelistK8sClusterAccessIpCIDRs, createAzureClusterRequest.whitelistK8sClusterAccessIpCIDRs)) {
      return false;
    }
    if (!Objects.equals(this.whitelistWorkloadAccessIpCIDRs, createAzureClusterRequest.whitelistWorkloadAccessIpCIDRs)) {
      return false;
    }
    if (!Objects.equals(this.useInternalLoadBalancer, createAzureClusterRequest.useInternalLoadBalancer)) {
      return false;
    }
    if (!Objects.equals(this.customRegistryOptions, createAzureClusterRequest.customRegistryOptions)) {
      return false;
    }
    if (!Objects.equals(this.customSubdomain, createAzureClusterRequest.customSubdomain)) {
      return false;
    }
    if (!Objects.equals(this.enableAZ, createAzureClusterRequest.enableAZ)) {
      return false;
    }
    if (!Objects.equals(this.enableSpotInstances, createAzureClusterRequest.enableSpotInstances)) {
      return false;
    }
    if (!Objects.equals(this.logAnalyticsWorkspaceId, createAzureClusterRequest.logAnalyticsWorkspaceId)) {
      return false;
    }
    if (!Objects.equals(this.outboundType, createAzureClusterRequest.outboundType)) {
      return false;
    }
    if (!Objects.equals(this.aksPodCIDR, createAzureClusterRequest.aksPodCIDR)) {
      return false;
    }
    if (!Objects.equals(this.enablePrivateSQL, createAzureClusterRequest.enablePrivateSQL)) {
      return false;
    }
    if (!Objects.equals(this.privateSQLSubnetName, createAzureClusterRequest.privateSQLSubnetName)) {
      return false;
    }
    if (!Objects.equals(this.privateDNSZoneSQL, createAzureClusterRequest.privateDNSZoneSQL)) {
      return false;
    }
    if (!Objects.equals(this.privateDNSZoneAKS, createAzureClusterRequest.privateDNSZoneAKS)) {
      return false;
    }
    if (!Objects.equals(this.enablePrivateAks, createAzureClusterRequest.enablePrivateAks)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, userAssignedManagedIdentity, subnetName, useOverlayNetworking, databaseBackupRetentionPeriod, whitelistK8sClusterAccessIpCIDRs, whitelistWorkloadAccessIpCIDRs, useInternalLoadBalancer, customRegistryOptions, customSubdomain, enableAZ, enableSpotInstances, logAnalyticsWorkspaceId, outboundType, aksPodCIDR, enablePrivateSQL, privateSQLSubnetName, privateDNSZoneSQL, privateDNSZoneAKS, enablePrivateAks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAzureClusterRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    userAssignedManagedIdentity: ").append(toIndentedString(userAssignedManagedIdentity)).append("\n");
    sb.append("    subnetName: ").append(toIndentedString(subnetName)).append("\n");
    sb.append("    useOverlayNetworking: ").append(toIndentedString(useOverlayNetworking)).append("\n");
    sb.append("    databaseBackupRetentionPeriod: ").append(toIndentedString(databaseBackupRetentionPeriod)).append("\n");
    sb.append("    whitelistK8sClusterAccessIpCIDRs: ").append(toIndentedString(whitelistK8sClusterAccessIpCIDRs)).append("\n");
    sb.append("    whitelistWorkloadAccessIpCIDRs: ").append(toIndentedString(whitelistWorkloadAccessIpCIDRs)).append("\n");
    sb.append("    useInternalLoadBalancer: ").append(toIndentedString(useInternalLoadBalancer)).append("\n");
    sb.append("    customRegistryOptions: ").append(toIndentedString(customRegistryOptions)).append("\n");
    sb.append("    customSubdomain: ").append(toIndentedString(customSubdomain)).append("\n");
    sb.append("    enableAZ: ").append(toIndentedString(enableAZ)).append("\n");
    sb.append("    enableSpotInstances: ").append(toIndentedString(enableSpotInstances)).append("\n");
    sb.append("    logAnalyticsWorkspaceId: ").append(toIndentedString(logAnalyticsWorkspaceId)).append("\n");
    sb.append("    outboundType: ").append(toIndentedString(outboundType)).append("\n");
    sb.append("    aksPodCIDR: ").append(toIndentedString(aksPodCIDR)).append("\n");
    sb.append("    enablePrivateSQL: ").append(toIndentedString(enablePrivateSQL)).append("\n");
    sb.append("    privateSQLSubnetName: ").append(toIndentedString(privateSQLSubnetName)).append("\n");
    sb.append("    privateDNSZoneSQL: ").append(toIndentedString(privateDNSZoneSQL)).append("\n");
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

