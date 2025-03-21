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
 * Options for activating an AWS environment.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-19T13:03:27.345-07:00")
public class AwsActivationOptions  {

  /**
   * Use this option to set up AWS EKS cluster in private only mode with restricted access only from internal/peered networks. Ensure you have ccmv2 setup functional to achieve this integration.
   **/
  private Boolean enablePrivateEKS = false;

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
   * Whether to enable Spot instances for Virtual warehouses. It cannot be updated later. If the aws-options is not provided it defaults to false.
   **/
  private Boolean enableSpotInstances = false;

  /**
   * Use this option to activate the environment with fewer than half of the standard required IAM permissions on your AWS cross-account IAM role.
   **/
  private Boolean reducedPermissionMode = null;

  /**
   * DEPRECATED: The cluster level instance type selection will be replaced by virtual warehouse level selection. AWS compute instance types that the environment is restricted to use. This affects the creation of virtual warehouses where this restriction will apply. Select an instance type that meets your computing, memory, networking, or storage needs. As of now, only a single instance type can be listed. Use describe-allowed-instance-types to see currently possible values.
   **/
  private List<String> computeInstanceTypes = new ArrayList<String>();

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
   * Whether to enable Spot instances for Virtual warehouses. It cannot be updated later. If the aws-options is not provided it defaults to false.
   **/
  @JsonProperty("enableSpotInstances")
  public Boolean getEnableSpotInstances() {
    return enableSpotInstances;
  }

  /**
   * Setter for enableSpotInstances.
   * Whether to enable Spot instances for Virtual warehouses. It cannot be updated later. If the aws-options is not provided it defaults to false.
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
   * DEPRECATED: The cluster level instance type selection will be replaced by virtual warehouse level selection. AWS compute instance types that the environment is restricted to use. This affects the creation of virtual warehouses where this restriction will apply. Select an instance type that meets your computing, memory, networking, or storage needs. As of now, only a single instance type can be listed. Use describe-allowed-instance-types to see currently possible values.
   **/
  @Deprecated
  @JsonProperty("computeInstanceTypes")
  public List<String> getComputeInstanceTypes() {
    return computeInstanceTypes;
  }

  /**
   * Setter for computeInstanceTypes.
   * DEPRECATED: The cluster level instance type selection will be replaced by virtual warehouse level selection. AWS compute instance types that the environment is restricted to use. This affects the creation of virtual warehouses where this restriction will apply. Select an instance type that meets your computing, memory, networking, or storage needs. As of now, only a single instance type can be listed. Use describe-allowed-instance-types to see currently possible values.
   **/
  @Deprecated
  public void setComputeInstanceTypes(List<String> computeInstanceTypes) {
    this.computeInstanceTypes = computeInstanceTypes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsActivationOptions awsActivationOptions = (AwsActivationOptions) o;
    if (!Objects.equals(this.enablePrivateEKS, awsActivationOptions.enablePrivateEKS)) {
      return false;
    }
    if (!Objects.equals(this.workerSubnetIds, awsActivationOptions.workerSubnetIds)) {
      return false;
    }
    if (!Objects.equals(this.lbSubnetIds, awsActivationOptions.lbSubnetIds)) {
      return false;
    }
    if (!Objects.equals(this.customAmiId, awsActivationOptions.customAmiId)) {
      return false;
    }
    if (!Objects.equals(this.nodeRoleCDWManagedPolicyArn, awsActivationOptions.nodeRoleCDWManagedPolicyArn)) {
      return false;
    }
    if (!Objects.equals(this.enableSpotInstances, awsActivationOptions.enableSpotInstances)) {
      return false;
    }
    if (!Objects.equals(this.reducedPermissionMode, awsActivationOptions.reducedPermissionMode)) {
      return false;
    }
    if (!Objects.equals(this.computeInstanceTypes, awsActivationOptions.computeInstanceTypes)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(enablePrivateEKS, workerSubnetIds, lbSubnetIds, customAmiId, nodeRoleCDWManagedPolicyArn, enableSpotInstances, reducedPermissionMode, computeInstanceTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsActivationOptions {\n");
    sb.append("    enablePrivateEKS: ").append(toIndentedString(enablePrivateEKS)).append("\n");
    sb.append("    workerSubnetIds: ").append(toIndentedString(workerSubnetIds)).append("\n");
    sb.append("    lbSubnetIds: ").append(toIndentedString(lbSubnetIds)).append("\n");
    sb.append("    customAmiId: ").append(toIndentedString(customAmiId)).append("\n");
    sb.append("    nodeRoleCDWManagedPolicyArn: ").append(toIndentedString(nodeRoleCDWManagedPolicyArn)).append("\n");
    sb.append("    enableSpotInstances: ").append(toIndentedString(enableSpotInstances)).append("\n");
    sb.append("    reducedPermissionMode: ").append(toIndentedString(reducedPermissionMode)).append("\n");
    sb.append("    computeInstanceTypes: ").append(toIndentedString(computeInstanceTypes)).append("\n");
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

