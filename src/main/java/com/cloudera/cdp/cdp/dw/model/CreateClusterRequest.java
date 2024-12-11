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
import com.cloudera.cdp.dw.model.AwsActivationOptions;
import com.cloudera.cdp.dw.model.AzureActivationOptions;
import com.cloudera.cdp.dw.model.CustomRegistryOptions;
import com.cloudera.cdp.dw.model.PrivateCloudActivationOptions;
import java.util.*;

/**
 * Request object for the createCluster method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-11T11:26:08.472-08:00")
public class CreateClusterRequest  {

  /**
   * The CRN of the environment for the cluster to create.
   **/
  private String environmentCrn = null;

  /**
   * Using an overlay network will save IP addresses in the VPC by using a private IP address range for Pods in the cluster.
   **/
  private Boolean useOverlayNetwork = null;

  /**
   * PostgreSQL server backup retention days.
   **/
  private Integer databaseBackupRetentionPeriod = 30;

  /**
   * This field is still available for Private Cloud deployments, however it'll be removed for Public Cloud in the next DWX release. Please use the use 'whitelistK8sClusterAccessIpCIDRs' in combination of 'whitelistWorkloadAccessIpCIDRs' on Public Cloud. Comma separated list of IP address CIDRs to whitelist.
   **/
  private String whitelistIpCIDRs = null;

  /**
   * List of IP address CIDRs to whitelist for kubernetes cluster access.
   **/
  private List<String> whitelistK8sClusterAccessIpCIDRs = new ArrayList<String>();

  /**
   * List of IP address CIDRs to whitelist for workload access.
   **/
  private List<String> whitelistWorkloadAccessIpCIDRs = new ArrayList<String>();

  /**
   * Set up load balancer with private IP address. In AWS it is created in private subnets. In Azure an internal load balancer gets created. Make sure there is connectivity between your client network and the network (VPC/VNet) where CDW environment is deployed.
   **/
  private Boolean usePrivateLoadBalancer = null;

  /**
   * Set up worker node with public IP address. In AWS it is created in public subnets.
   **/
  private Boolean usePublicWorkerNode = null;

  /**
   * DEPRECATED - Enable Storage Roles
   **/
  private Boolean enableStorageRoles = false;

  /**
   * DEPRECATED - will be removed in future releases. Set additional number of nodes to reserve for executors and coordinators to use during autoscaling. Adding more reserved nodes increases your cloud costs.
   **/
  private Integer reservedComputeNodes = null;

  /**
   * DEPRECATED - will be removed in future releases. Set additional number of nodes to reserve for other services in the cluster. Adding more reserved nodes increases your cloud costs.
   **/
  private Integer reservedSharedServicesNodes = null;

  /**
   * Options for custom ACR/ECR registries.
   **/
  private CustomRegistryOptions customRegistryOptions = null;

  /**
   * Options for activating an AWS environment.
   **/
  private AwsActivationOptions awsOptions = null;

  /**
   * Options for activating an Azure environment.
   **/
  private AzureActivationOptions azureOptions = null;

  /**
   * Options for activating a Private Cloud environment.
   **/
  private PrivateCloudActivationOptions privateCloudOptions = null;

  /**
   * Custom environment subdomain. Overrides the environment subdomain using a customized domain either in the old subdomain format like ENV_ID.dw or the new format like dw-ENV_NAME.
   **/
  private String customSubdomain = null;

  /**
   * The Resource Pool of the cluster.
   **/
  private String resourcePool = null;

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
   * Getter for useOverlayNetwork.
   * Using an overlay network will save IP addresses in the VPC by using a private IP address range for Pods in the cluster.
   **/
  @JsonProperty("useOverlayNetwork")
  public Boolean getUseOverlayNetwork() {
    return useOverlayNetwork;
  }

  /**
   * Setter for useOverlayNetwork.
   * Using an overlay network will save IP addresses in the VPC by using a private IP address range for Pods in the cluster.
   **/
  public void setUseOverlayNetwork(Boolean useOverlayNetwork) {
    this.useOverlayNetwork = useOverlayNetwork;
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
   * Getter for whitelistIpCIDRs.
   * This field is still available for Private Cloud deployments, however it&#39;ll be removed for Public Cloud in the next DWX release. Please use the use &#39;whitelistK8sClusterAccessIpCIDRs&#39; in combination of &#39;whitelistWorkloadAccessIpCIDRs&#39; on Public Cloud. Comma separated list of IP address CIDRs to whitelist.
   **/
  @JsonProperty("whitelistIpCIDRs")
  public String getWhitelistIpCIDRs() {
    return whitelistIpCIDRs;
  }

  /**
   * Setter for whitelistIpCIDRs.
   * This field is still available for Private Cloud deployments, however it&#39;ll be removed for Public Cloud in the next DWX release. Please use the use &#39;whitelistK8sClusterAccessIpCIDRs&#39; in combination of &#39;whitelistWorkloadAccessIpCIDRs&#39; on Public Cloud. Comma separated list of IP address CIDRs to whitelist.
   **/
  public void setWhitelistIpCIDRs(String whitelistIpCIDRs) {
    this.whitelistIpCIDRs = whitelistIpCIDRs;
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
   * Getter for usePrivateLoadBalancer.
   * Set up load balancer with private IP address. In AWS it is created in private subnets. In Azure an internal load balancer gets created. Make sure there is connectivity between your client network and the network (VPC/VNet) where CDW environment is deployed.
   **/
  @JsonProperty("usePrivateLoadBalancer")
  public Boolean getUsePrivateLoadBalancer() {
    return usePrivateLoadBalancer;
  }

  /**
   * Setter for usePrivateLoadBalancer.
   * Set up load balancer with private IP address. In AWS it is created in private subnets. In Azure an internal load balancer gets created. Make sure there is connectivity between your client network and the network (VPC/VNet) where CDW environment is deployed.
   **/
  public void setUsePrivateLoadBalancer(Boolean usePrivateLoadBalancer) {
    this.usePrivateLoadBalancer = usePrivateLoadBalancer;
  }

  /**
   * Getter for usePublicWorkerNode.
   * Set up worker node with public IP address. In AWS it is created in public subnets.
   **/
  @JsonProperty("usePublicWorkerNode")
  public Boolean getUsePublicWorkerNode() {
    return usePublicWorkerNode;
  }

  /**
   * Setter for usePublicWorkerNode.
   * Set up worker node with public IP address. In AWS it is created in public subnets.
   **/
  public void setUsePublicWorkerNode(Boolean usePublicWorkerNode) {
    this.usePublicWorkerNode = usePublicWorkerNode;
  }

  /**
   * Getter for enableStorageRoles.
   * DEPRECATED - Enable Storage Roles
   **/
  @Deprecated
  @JsonProperty("enableStorageRoles")
  public Boolean getEnableStorageRoles() {
    return enableStorageRoles;
  }

  /**
   * Setter for enableStorageRoles.
   * DEPRECATED - Enable Storage Roles
   **/
  @Deprecated
  public void setEnableStorageRoles(Boolean enableStorageRoles) {
    this.enableStorageRoles = enableStorageRoles;
  }

  /**
   * Getter for reservedComputeNodes.
   * DEPRECATED - will be removed in future releases. Set additional number of nodes to reserve for executors and coordinators to use during autoscaling. Adding more reserved nodes increases your cloud costs.
   **/
  @Deprecated
  @JsonProperty("reservedComputeNodes")
  public Integer getReservedComputeNodes() {
    return reservedComputeNodes;
  }

  /**
   * Setter for reservedComputeNodes.
   * DEPRECATED - will be removed in future releases. Set additional number of nodes to reserve for executors and coordinators to use during autoscaling. Adding more reserved nodes increases your cloud costs.
   **/
  @Deprecated
  public void setReservedComputeNodes(Integer reservedComputeNodes) {
    this.reservedComputeNodes = reservedComputeNodes;
  }

  /**
   * Getter for reservedSharedServicesNodes.
   * DEPRECATED - will be removed in future releases. Set additional number of nodes to reserve for other services in the cluster. Adding more reserved nodes increases your cloud costs.
   **/
  @Deprecated
  @JsonProperty("reservedSharedServicesNodes")
  public Integer getReservedSharedServicesNodes() {
    return reservedSharedServicesNodes;
  }

  /**
   * Setter for reservedSharedServicesNodes.
   * DEPRECATED - will be removed in future releases. Set additional number of nodes to reserve for other services in the cluster. Adding more reserved nodes increases your cloud costs.
   **/
  @Deprecated
  public void setReservedSharedServicesNodes(Integer reservedSharedServicesNodes) {
    this.reservedSharedServicesNodes = reservedSharedServicesNodes;
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
   * Getter for awsOptions.
   * Options for activating an AWS environment.
   **/
  @JsonProperty("awsOptions")
  public AwsActivationOptions getAwsOptions() {
    return awsOptions;
  }

  /**
   * Setter for awsOptions.
   * Options for activating an AWS environment.
   **/
  public void setAwsOptions(AwsActivationOptions awsOptions) {
    this.awsOptions = awsOptions;
  }

  /**
   * Getter for azureOptions.
   * Options for activating an Azure environment.
   **/
  @JsonProperty("azureOptions")
  public AzureActivationOptions getAzureOptions() {
    return azureOptions;
  }

  /**
   * Setter for azureOptions.
   * Options for activating an Azure environment.
   **/
  public void setAzureOptions(AzureActivationOptions azureOptions) {
    this.azureOptions = azureOptions;
  }

  /**
   * Getter for privateCloudOptions.
   * Options for activating a Private Cloud environment.
   **/
  @JsonProperty("privateCloudOptions")
  public PrivateCloudActivationOptions getPrivateCloudOptions() {
    return privateCloudOptions;
  }

  /**
   * Setter for privateCloudOptions.
   * Options for activating a Private Cloud environment.
   **/
  public void setPrivateCloudOptions(PrivateCloudActivationOptions privateCloudOptions) {
    this.privateCloudOptions = privateCloudOptions;
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
   * Getter for resourcePool.
   * The Resource Pool of the cluster.
   **/
  @JsonProperty("resourcePool")
  public String getResourcePool() {
    return resourcePool;
  }

  /**
   * Setter for resourcePool.
   * The Resource Pool of the cluster.
   **/
  public void setResourcePool(String resourcePool) {
    this.resourcePool = resourcePool;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateClusterRequest createClusterRequest = (CreateClusterRequest) o;
    if (!Objects.equals(this.environmentCrn, createClusterRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.useOverlayNetwork, createClusterRequest.useOverlayNetwork)) {
      return false;
    }
    if (!Objects.equals(this.databaseBackupRetentionPeriod, createClusterRequest.databaseBackupRetentionPeriod)) {
      return false;
    }
    if (!Objects.equals(this.whitelistIpCIDRs, createClusterRequest.whitelistIpCIDRs)) {
      return false;
    }
    if (!Objects.equals(this.whitelistK8sClusterAccessIpCIDRs, createClusterRequest.whitelistK8sClusterAccessIpCIDRs)) {
      return false;
    }
    if (!Objects.equals(this.whitelistWorkloadAccessIpCIDRs, createClusterRequest.whitelistWorkloadAccessIpCIDRs)) {
      return false;
    }
    if (!Objects.equals(this.usePrivateLoadBalancer, createClusterRequest.usePrivateLoadBalancer)) {
      return false;
    }
    if (!Objects.equals(this.usePublicWorkerNode, createClusterRequest.usePublicWorkerNode)) {
      return false;
    }
    if (!Objects.equals(this.enableStorageRoles, createClusterRequest.enableStorageRoles)) {
      return false;
    }
    if (!Objects.equals(this.reservedComputeNodes, createClusterRequest.reservedComputeNodes)) {
      return false;
    }
    if (!Objects.equals(this.reservedSharedServicesNodes, createClusterRequest.reservedSharedServicesNodes)) {
      return false;
    }
    if (!Objects.equals(this.customRegistryOptions, createClusterRequest.customRegistryOptions)) {
      return false;
    }
    if (!Objects.equals(this.awsOptions, createClusterRequest.awsOptions)) {
      return false;
    }
    if (!Objects.equals(this.azureOptions, createClusterRequest.azureOptions)) {
      return false;
    }
    if (!Objects.equals(this.privateCloudOptions, createClusterRequest.privateCloudOptions)) {
      return false;
    }
    if (!Objects.equals(this.customSubdomain, createClusterRequest.customSubdomain)) {
      return false;
    }
    if (!Objects.equals(this.resourcePool, createClusterRequest.resourcePool)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, useOverlayNetwork, databaseBackupRetentionPeriod, whitelistIpCIDRs, whitelistK8sClusterAccessIpCIDRs, whitelistWorkloadAccessIpCIDRs, usePrivateLoadBalancer, usePublicWorkerNode, enableStorageRoles, reservedComputeNodes, reservedSharedServicesNodes, customRegistryOptions, awsOptions, azureOptions, privateCloudOptions, customSubdomain, resourcePool);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateClusterRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    useOverlayNetwork: ").append(toIndentedString(useOverlayNetwork)).append("\n");
    sb.append("    databaseBackupRetentionPeriod: ").append(toIndentedString(databaseBackupRetentionPeriod)).append("\n");
    sb.append("    whitelistIpCIDRs: ").append(toIndentedString(whitelistIpCIDRs)).append("\n");
    sb.append("    whitelistK8sClusterAccessIpCIDRs: ").append(toIndentedString(whitelistK8sClusterAccessIpCIDRs)).append("\n");
    sb.append("    whitelistWorkloadAccessIpCIDRs: ").append(toIndentedString(whitelistWorkloadAccessIpCIDRs)).append("\n");
    sb.append("    usePrivateLoadBalancer: ").append(toIndentedString(usePrivateLoadBalancer)).append("\n");
    sb.append("    usePublicWorkerNode: ").append(toIndentedString(usePublicWorkerNode)).append("\n");
    sb.append("    enableStorageRoles: ").append(toIndentedString(enableStorageRoles)).append("\n");
    sb.append("    reservedComputeNodes: ").append(toIndentedString(reservedComputeNodes)).append("\n");
    sb.append("    reservedSharedServicesNodes: ").append(toIndentedString(reservedSharedServicesNodes)).append("\n");
    sb.append("    customRegistryOptions: ").append(toIndentedString(customRegistryOptions)).append("\n");
    sb.append("    awsOptions: ").append(toIndentedString(awsOptions)).append("\n");
    sb.append("    azureOptions: ").append(toIndentedString(azureOptions)).append("\n");
    sb.append("    privateCloudOptions: ").append(toIndentedString(privateCloudOptions)).append("\n");
    sb.append("    customSubdomain: ").append(toIndentedString(customSubdomain)).append("\n");
    sb.append("    resourcePool: ").append(toIndentedString(resourcePool)).append("\n");
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

