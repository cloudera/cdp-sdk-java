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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datahub.model.AttachedVolumeRequest;
import com.cloudera.cdp.datahub.model.VolumeEncryptionRequest;
import java.util.*;

/**
 * Configurations for instance group
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-12-01T13:59:38.963-08:00")
public class InstanceGroupRequest  {

  /**
   * Number of instances in the instance group
   **/
  private Integer nodeCount = null;

  /**
   * The instance group name.
   **/
  private String instanceGroupName = null;

  /**
   * The instance group type.
   **/
  private String instanceGroupType = null;

  /**
   * The cloud provider specific instance type to be used.
   **/
  private String instanceType = null;

  /**
   * The attached volume configuration. This does not include root volume.
   **/
  private List<AttachedVolumeRequest> attachedVolumeConfiguration = new ArrayList<AttachedVolumeRequest>();

  /**
   * The root volume size.
   **/
  private Integer rootVolumeSize = null;

  /**
   * The names or CRNs of the recipes that would be applied to the instance group.
   **/
  private List<String> recipeNames = new ArrayList<String>();

  /**
   * Recovery mode for the instance group.
   **/
  private String recoveryMode = null;

  /**
   * The volume encryption settings. This setting does not apply to Azure which always encrypts volumes.
   **/
  private VolumeEncryptionRequest volumeEncryption = null;

  /**
   * The list of subnet IDs in case of multi-availability zone setup. Specifying this field overrides the datahub level subnet ID setup for the multi-availability zone configuration.
   **/
  private List<String> subnetIds = new ArrayList<String>();

  /**
   * Getter for nodeCount.
   * Number of instances in the instance group
   **/
  @JsonProperty("nodeCount")
  public Integer getNodeCount() {
    return nodeCount;
  }

  /**
   * Setter for nodeCount.
   * Number of instances in the instance group
   **/
  public void setNodeCount(Integer nodeCount) {
    this.nodeCount = nodeCount;
  }

  /**
   * Getter for instanceGroupName.
   * The instance group name.
   **/
  @JsonProperty("instanceGroupName")
  public String getInstanceGroupName() {
    return instanceGroupName;
  }

  /**
   * Setter for instanceGroupName.
   * The instance group name.
   **/
  public void setInstanceGroupName(String instanceGroupName) {
    this.instanceGroupName = instanceGroupName;
  }

  /**
   * Getter for instanceGroupType.
   * The instance group type.
   **/
  @JsonProperty("instanceGroupType")
  public String getInstanceGroupType() {
    return instanceGroupType;
  }

  /**
   * Setter for instanceGroupType.
   * The instance group type.
   **/
  public void setInstanceGroupType(String instanceGroupType) {
    this.instanceGroupType = instanceGroupType;
  }

  /**
   * Getter for instanceType.
   * The cloud provider specific instance type to be used.
   **/
  @JsonProperty("instanceType")
  public String getInstanceType() {
    return instanceType;
  }

  /**
   * Setter for instanceType.
   * The cloud provider specific instance type to be used.
   **/
  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  /**
   * Getter for attachedVolumeConfiguration.
   * The attached volume configuration. This does not include root volume.
   **/
  @JsonProperty("attachedVolumeConfiguration")
  public List<AttachedVolumeRequest> getAttachedVolumeConfiguration() {
    return attachedVolumeConfiguration;
  }

  /**
   * Setter for attachedVolumeConfiguration.
   * The attached volume configuration. This does not include root volume.
   **/
  public void setAttachedVolumeConfiguration(List<AttachedVolumeRequest> attachedVolumeConfiguration) {
    this.attachedVolumeConfiguration = attachedVolumeConfiguration;
  }

  /**
   * Getter for rootVolumeSize.
   * The root volume size.
   **/
  @JsonProperty("rootVolumeSize")
  public Integer getRootVolumeSize() {
    return rootVolumeSize;
  }

  /**
   * Setter for rootVolumeSize.
   * The root volume size.
   **/
  public void setRootVolumeSize(Integer rootVolumeSize) {
    this.rootVolumeSize = rootVolumeSize;
  }

  /**
   * Getter for recipeNames.
   * The names or CRNs of the recipes that would be applied to the instance group.
   **/
  @JsonProperty("recipeNames")
  public List<String> getRecipeNames() {
    return recipeNames;
  }

  /**
   * Setter for recipeNames.
   * The names or CRNs of the recipes that would be applied to the instance group.
   **/
  public void setRecipeNames(List<String> recipeNames) {
    this.recipeNames = recipeNames;
  }

  /**
   * Getter for recoveryMode.
   * Recovery mode for the instance group.
   **/
  @JsonProperty("recoveryMode")
  public String getRecoveryMode() {
    return recoveryMode;
  }

  /**
   * Setter for recoveryMode.
   * Recovery mode for the instance group.
   **/
  public void setRecoveryMode(String recoveryMode) {
    this.recoveryMode = recoveryMode;
  }

  /**
   * Getter for volumeEncryption.
   * The volume encryption settings. This setting does not apply to Azure which always encrypts volumes.
   **/
  @JsonProperty("volumeEncryption")
  public VolumeEncryptionRequest getVolumeEncryption() {
    return volumeEncryption;
  }

  /**
   * Setter for volumeEncryption.
   * The volume encryption settings. This setting does not apply to Azure which always encrypts volumes.
   **/
  public void setVolumeEncryption(VolumeEncryptionRequest volumeEncryption) {
    this.volumeEncryption = volumeEncryption;
  }

  /**
   * Getter for subnetIds.
   * The list of subnet IDs in case of multi-availability zone setup. Specifying this field overrides the datahub level subnet ID setup for the multi-availability zone configuration.
   **/
  @JsonProperty("subnetIds")
  public List<String> getSubnetIds() {
    return subnetIds;
  }

  /**
   * Setter for subnetIds.
   * The list of subnet IDs in case of multi-availability zone setup. Specifying this field overrides the datahub level subnet ID setup for the multi-availability zone configuration.
   **/
  public void setSubnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceGroupRequest instanceGroupRequest = (InstanceGroupRequest) o;
    if (!Objects.equals(this.nodeCount, instanceGroupRequest.nodeCount)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroupName, instanceGroupRequest.instanceGroupName)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroupType, instanceGroupRequest.instanceGroupType)) {
      return false;
    }
    if (!Objects.equals(this.instanceType, instanceGroupRequest.instanceType)) {
      return false;
    }
    if (!Objects.equals(this.attachedVolumeConfiguration, instanceGroupRequest.attachedVolumeConfiguration)) {
      return false;
    }
    if (!Objects.equals(this.rootVolumeSize, instanceGroupRequest.rootVolumeSize)) {
      return false;
    }
    if (!Objects.equals(this.recipeNames, instanceGroupRequest.recipeNames)) {
      return false;
    }
    if (!Objects.equals(this.recoveryMode, instanceGroupRequest.recoveryMode)) {
      return false;
    }
    if (!Objects.equals(this.volumeEncryption, instanceGroupRequest.volumeEncryption)) {
      return false;
    }
    if (!Objects.equals(this.subnetIds, instanceGroupRequest.subnetIds)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeCount, instanceGroupName, instanceGroupType, instanceType, attachedVolumeConfiguration, rootVolumeSize, recipeNames, recoveryMode, volumeEncryption, subnetIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceGroupRequest {\n");
    sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
    sb.append("    instanceGroupName: ").append(toIndentedString(instanceGroupName)).append("\n");
    sb.append("    instanceGroupType: ").append(toIndentedString(instanceGroupType)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    attachedVolumeConfiguration: ").append(toIndentedString(attachedVolumeConfiguration)).append("\n");
    sb.append("    rootVolumeSize: ").append(toIndentedString(rootVolumeSize)).append("\n");
    sb.append("    recipeNames: ").append(toIndentedString(recipeNames)).append("\n");
    sb.append("    recoveryMode: ").append(toIndentedString(recoveryMode)).append("\n");
    sb.append("    volumeEncryption: ").append(toIndentedString(volumeEncryption)).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
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

