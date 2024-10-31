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
 * Request object for the createAwsCluster method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-10-31T09:45:08.143-07:00")
public class CreateAwsClusterRequest  {

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
   * Use this option to set up AWS EKS cluster in private only mode with restricted access only from internal/peered networks. Ensure you have ccmv2 setup functional to achieve this integration.
   **/
  private Boolean enablePrivateEKS = false;

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
   * Custom environment subdomain. Overrides the environment subdomain using a customized domain either in the old subdomain format like ENV_ID.dw or the new format like dw-ENV_NAME.
   **/
  private String customSubdomain = null;

  /**
   * IDs of AWS subnets where the cluster worker nodes should be deployed.
   **/
  private List<String> workerSubnetIds = new ArrayList<String>();

  /**
   * IDs of AWS subnets where the cluster load balancer should be deployed.
   **/
  private List<String> lbSubnetIds = new ArrayList<String>();

  /**
   * Custom AMI ID.
   **/
  private String customAmiId = null;

  /**
   * Managed Policy Arn to be attached to the Node Instance Role.
   **/
  private String nodeRoleCDWManagedPolicyArn = null;

  /**
   * Whether to enable Spot instances for Virtual warehouses. It cannot be updated later. Defaults to false.
   **/
  private Boolean enableSpotInstances = false;

  /**
   * Use this option to activate the environment with fewer than half of the standard required IAM permissions on your AWS cross-account IAM role.
   **/
  private Boolean reducedPermissionMode = null;

  /**
   * NOTE: The cluster level instance type selection will be replaced by virtual warehouse level selection. AWS compute instance types that the environment is restricted to use. This affects the creation of virtual warehouses where this restriction will apply. Select an instance type that meets your computing, memory, networking, or storage needs. As of now, only a single instance type can be listed. Use describe-allowed-instance-types to see currently possible values.
   **/
  private List<String> computeInstanceTypes = new ArrayList<String>();

  /**
   * DEPRECATED: Additional compute instance types will be removed in subsequent releases. Additional (fallback) instance types listed in their priority order. They will be used instead of the primary compute instance type in case it is unavailable. You cannot include any instance type that was already indicated in computeInstanceTypes. Use describe-allowed-instance-types to see currently supported values and also the default value when nothing is provided for the computeInstanceTypes.
   **/
  private List<String> additionalInstanceTypes = new ArrayList<String>();

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
   * Getter for enablePrivateEKS.
   * Use this option to set up AWS EKS cluster in private only mode with restricted access only from internal/peered networks. Ensure you have ccmv2 setup functional to achieve this integration.
   **/
  @JsonProperty("enablePrivateEKS")
  public Boolean getEnablePrivateEKS() {
    return enablePrivateEKS;
  }

  /**
   * Setter for enablePrivateEKS.
   * Use this option to set up AWS EKS cluster in private only mode with restricted access only from internal/peered networks. Ensure you have ccmv2 setup functional to achieve this integration.
   **/
  public void setEnablePrivateEKS(Boolean enablePrivateEKS) {
    this.enablePrivateEKS = enablePrivateEKS;
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
   * Getter for workerSubnetIds.
   * IDs of AWS subnets where the cluster worker nodes should be deployed.
   **/
  @JsonProperty("workerSubnetIds")
  public List<String> getWorkerSubnetIds() {
    return workerSubnetIds;
  }

  /**
   * Setter for workerSubnetIds.
   * IDs of AWS subnets where the cluster worker nodes should be deployed.
   **/
  public void setWorkerSubnetIds(List<String> workerSubnetIds) {
    this.workerSubnetIds = workerSubnetIds;
  }

  /**
   * Getter for lbSubnetIds.
   * IDs of AWS subnets where the cluster load balancer should be deployed.
   **/
  @JsonProperty("lbSubnetIds")
  public List<String> getLbSubnetIds() {
    return lbSubnetIds;
  }

  /**
   * Setter for lbSubnetIds.
   * IDs of AWS subnets where the cluster load balancer should be deployed.
   **/
  public void setLbSubnetIds(List<String> lbSubnetIds) {
    this.lbSubnetIds = lbSubnetIds;
  }

  /**
   * Getter for customAmiId.
   * Custom AMI ID.
   **/
  @JsonProperty("customAmiId")
  public String getCustomAmiId() {
    return customAmiId;
  }

  /**
   * Setter for customAmiId.
   * Custom AMI ID.
   **/
  public void setCustomAmiId(String customAmiId) {
    this.customAmiId = customAmiId;
  }

  /**
   * Getter for nodeRoleCDWManagedPolicyArn.
   * Managed Policy Arn to be attached to the Node Instance Role.
   **/
  @JsonProperty("nodeRoleCDWManagedPolicyArn")
  public String getNodeRoleCDWManagedPolicyArn() {
    return nodeRoleCDWManagedPolicyArn;
  }

  /**
   * Setter for nodeRoleCDWManagedPolicyArn.
   * Managed Policy Arn to be attached to the Node Instance Role.
   **/
  public void setNodeRoleCDWManagedPolicyArn(String nodeRoleCDWManagedPolicyArn) {
    this.nodeRoleCDWManagedPolicyArn = nodeRoleCDWManagedPolicyArn;
  }

  /**
   * Getter for enableSpotInstances.
   * Whether to enable Spot instances for Virtual warehouses. It cannot be updated later. Defaults to false.
   **/
  @JsonProperty("enableSpotInstances")
  public Boolean getEnableSpotInstances() {
    return enableSpotInstances;
  }

  /**
   * Setter for enableSpotInstances.
   * Whether to enable Spot instances for Virtual warehouses. It cannot be updated later. Defaults to false.
   **/
  public void setEnableSpotInstances(Boolean enableSpotInstances) {
    this.enableSpotInstances = enableSpotInstances;
  }

  /**
   * Getter for reducedPermissionMode.
   * Use this option to activate the environment with fewer than half of the standard required IAM permissions on your AWS cross-account IAM role.
   **/
  @JsonProperty("reducedPermissionMode")
  public Boolean getReducedPermissionMode() {
    return reducedPermissionMode;
  }

  /**
   * Setter for reducedPermissionMode.
   * Use this option to activate the environment with fewer than half of the standard required IAM permissions on your AWS cross-account IAM role.
   **/
  public void setReducedPermissionMode(Boolean reducedPermissionMode) {
    this.reducedPermissionMode = reducedPermissionMode;
  }

  /**
   * Getter for computeInstanceTypes.
   * NOTE: The cluster level instance type selection will be replaced by virtual warehouse level selection. AWS compute instance types that the environment is restricted to use. This affects the creation of virtual warehouses where this restriction will apply. Select an instance type that meets your computing, memory, networking, or storage needs. As of now, only a single instance type can be listed. Use describe-allowed-instance-types to see currently possible values.
   **/
  @JsonProperty("computeInstanceTypes")
  public List<String> getComputeInstanceTypes() {
    return computeInstanceTypes;
  }

  /**
   * Setter for computeInstanceTypes.
   * NOTE: The cluster level instance type selection will be replaced by virtual warehouse level selection. AWS compute instance types that the environment is restricted to use. This affects the creation of virtual warehouses where this restriction will apply. Select an instance type that meets your computing, memory, networking, or storage needs. As of now, only a single instance type can be listed. Use describe-allowed-instance-types to see currently possible values.
   **/
  public void setComputeInstanceTypes(List<String> computeInstanceTypes) {
    this.computeInstanceTypes = computeInstanceTypes;
  }

  /**
   * Getter for additionalInstanceTypes.
   * DEPRECATED: Additional compute instance types will be removed in subsequent releases. Additional (fallback) instance types listed in their priority order. They will be used instead of the primary compute instance type in case it is unavailable. You cannot include any instance type that was already indicated in computeInstanceTypes. Use describe-allowed-instance-types to see currently supported values and also the default value when nothing is provided for the computeInstanceTypes.
   **/
  @Deprecated
  @JsonProperty("additionalInstanceTypes")
  public List<String> getAdditionalInstanceTypes() {
    return additionalInstanceTypes;
  }

  /**
   * Setter for additionalInstanceTypes.
   * DEPRECATED: Additional compute instance types will be removed in subsequent releases. Additional (fallback) instance types listed in their priority order. They will be used instead of the primary compute instance type in case it is unavailable. You cannot include any instance type that was already indicated in computeInstanceTypes. Use describe-allowed-instance-types to see currently supported values and also the default value when nothing is provided for the computeInstanceTypes.
   **/
  @Deprecated
  public void setAdditionalInstanceTypes(List<String> additionalInstanceTypes) {
    this.additionalInstanceTypes = additionalInstanceTypes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAwsClusterRequest createAwsClusterRequest = (CreateAwsClusterRequest) o;
    if (!Objects.equals(this.environmentCrn, createAwsClusterRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.useOverlayNetwork, createAwsClusterRequest.useOverlayNetwork)) {
      return false;
    }
    if (!Objects.equals(this.databaseBackupRetentionPeriod, createAwsClusterRequest.databaseBackupRetentionPeriod)) {
      return false;
    }
    if (!Objects.equals(this.whitelistK8sClusterAccessIpCIDRs, createAwsClusterRequest.whitelistK8sClusterAccessIpCIDRs)) {
      return false;
    }
    if (!Objects.equals(this.whitelistWorkloadAccessIpCIDRs, createAwsClusterRequest.whitelistWorkloadAccessIpCIDRs)) {
      return false;
    }
    if (!Objects.equals(this.usePrivateLoadBalancer, createAwsClusterRequest.usePrivateLoadBalancer)) {
      return false;
    }
    if (!Objects.equals(this.usePublicWorkerNode, createAwsClusterRequest.usePublicWorkerNode)) {
      return false;
    }
    if (!Objects.equals(this.enablePrivateEKS, createAwsClusterRequest.enablePrivateEKS)) {
      return false;
    }
    if (!Objects.equals(this.reservedComputeNodes, createAwsClusterRequest.reservedComputeNodes)) {
      return false;
    }
    if (!Objects.equals(this.reservedSharedServicesNodes, createAwsClusterRequest.reservedSharedServicesNodes)) {
      return false;
    }
    if (!Objects.equals(this.customRegistryOptions, createAwsClusterRequest.customRegistryOptions)) {
      return false;
    }
    if (!Objects.equals(this.customSubdomain, createAwsClusterRequest.customSubdomain)) {
      return false;
    }
    if (!Objects.equals(this.workerSubnetIds, createAwsClusterRequest.workerSubnetIds)) {
      return false;
    }
    if (!Objects.equals(this.lbSubnetIds, createAwsClusterRequest.lbSubnetIds)) {
      return false;
    }
    if (!Objects.equals(this.customAmiId, createAwsClusterRequest.customAmiId)) {
      return false;
    }
    if (!Objects.equals(this.nodeRoleCDWManagedPolicyArn, createAwsClusterRequest.nodeRoleCDWManagedPolicyArn)) {
      return false;
    }
    if (!Objects.equals(this.enableSpotInstances, createAwsClusterRequest.enableSpotInstances)) {
      return false;
    }
    if (!Objects.equals(this.reducedPermissionMode, createAwsClusterRequest.reducedPermissionMode)) {
      return false;
    }
    if (!Objects.equals(this.computeInstanceTypes, createAwsClusterRequest.computeInstanceTypes)) {
      return false;
    }
    if (!Objects.equals(this.additionalInstanceTypes, createAwsClusterRequest.additionalInstanceTypes)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, useOverlayNetwork, databaseBackupRetentionPeriod, whitelistK8sClusterAccessIpCIDRs, whitelistWorkloadAccessIpCIDRs, usePrivateLoadBalancer, usePublicWorkerNode, enablePrivateEKS, reservedComputeNodes, reservedSharedServicesNodes, customRegistryOptions, customSubdomain, workerSubnetIds, lbSubnetIds, customAmiId, nodeRoleCDWManagedPolicyArn, enableSpotInstances, reducedPermissionMode, computeInstanceTypes, additionalInstanceTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAwsClusterRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    useOverlayNetwork: ").append(toIndentedString(useOverlayNetwork)).append("\n");
    sb.append("    databaseBackupRetentionPeriod: ").append(toIndentedString(databaseBackupRetentionPeriod)).append("\n");
    sb.append("    whitelistK8sClusterAccessIpCIDRs: ").append(toIndentedString(whitelistK8sClusterAccessIpCIDRs)).append("\n");
    sb.append("    whitelistWorkloadAccessIpCIDRs: ").append(toIndentedString(whitelistWorkloadAccessIpCIDRs)).append("\n");
    sb.append("    usePrivateLoadBalancer: ").append(toIndentedString(usePrivateLoadBalancer)).append("\n");
    sb.append("    usePublicWorkerNode: ").append(toIndentedString(usePublicWorkerNode)).append("\n");
    sb.append("    enablePrivateEKS: ").append(toIndentedString(enablePrivateEKS)).append("\n");
    sb.append("    reservedComputeNodes: ").append(toIndentedString(reservedComputeNodes)).append("\n");
    sb.append("    reservedSharedServicesNodes: ").append(toIndentedString(reservedSharedServicesNodes)).append("\n");
    sb.append("    customRegistryOptions: ").append(toIndentedString(customRegistryOptions)).append("\n");
    sb.append("    customSubdomain: ").append(toIndentedString(customSubdomain)).append("\n");
    sb.append("    workerSubnetIds: ").append(toIndentedString(workerSubnetIds)).append("\n");
    sb.append("    lbSubnetIds: ").append(toIndentedString(lbSubnetIds)).append("\n");
    sb.append("    customAmiId: ").append(toIndentedString(customAmiId)).append("\n");
    sb.append("    nodeRoleCDWManagedPolicyArn: ").append(toIndentedString(nodeRoleCDWManagedPolicyArn)).append("\n");
    sb.append("    enableSpotInstances: ").append(toIndentedString(enableSpotInstances)).append("\n");
    sb.append("    reducedPermissionMode: ").append(toIndentedString(reducedPermissionMode)).append("\n");
    sb.append("    computeInstanceTypes: ").append(toIndentedString(computeInstanceTypes)).append("\n");
    sb.append("    additionalInstanceTypes: ").append(toIndentedString(additionalInstanceTypes)).append("\n");
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

