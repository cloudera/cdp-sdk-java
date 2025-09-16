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

package com.cloudera.cdp.compute.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.compute.model.AksNodePool;
import com.cloudera.cdp.compute.model.AksPoolInstance;
import com.cloudera.cdp.compute.model.CommonInstanceStateCounts;
import java.util.*;
import java.util.Map;

/**
 * AKS instance group response structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-16T07:43:46.341-07:00")
public class AksInstanceGroup  {

  /**
   * Instance group name.
   **/
  private String instanceGroupName = null;

  /**
   * Instance group ID.
   **/
  private String instanceGroupId = null;

  /**
   * Instance type.
   **/
  private String instanceType = null;

  /**
   * Instance tier.
   **/
  private String instanceTier = null;

  /**
   * Instance states
   **/
  private CommonInstanceStateCounts instanceStates = null;

  /**
   * Instance count.
   **/
  private Long instanceCount = null;

  /**
   * Node volume size.
   **/
  private Long nodeVolumeSize = null;

  /**
   * Enable auto scaling.
   **/
  private Boolean enableAutoScaling = null;

  /**
   * Min instances.
   **/
  private Long minInstance = null;

  /**
   * Max instances.
   **/
  private Long maxInstance = null;

  /**
   * Single zone.
   **/
  private Boolean singleZone = null;

  /**
   * Labels.
   **/
  private Map<String, String> labels = new HashMap<String, String>();

  /**
   * Taints.
   **/
  private Map<String, String> taints = new HashMap<String, String>();

  /**
   * Tags.
   **/
  private Map<String, String> tags = new HashMap<String, String>();

  /**
   * Kube reserved CPU.
   **/
  private Long kubeReservedCpu = null;

  /**
   * Kube reserved memory.
   **/
  private Long kubeReservedMemory = null;

  /**
   * Kube reserved storage.
   **/
  private Long kubeReservedStorage = null;

  /**
   * System reserved CPU.
   **/
  private Long systemReservedCpu = null;

  /**
   * System reserved memory.
   **/
  private Long systemReservedMemory = null;

  /**
   * System reserved storage.
   **/
  private Long systemReservedStorage = null;

  /**
   * Availability zones.
   **/
  private List<Integer> availabilityZones = new ArrayList<Integer>();

  /**
   * AKS node pool.
   **/
  private AksNodePool nodePool = null;

  /**
   * AKS pool instance.
   **/
  private List<AksPoolInstance> instances = new ArrayList<AksPoolInstance>();

  /**
   * True for a system node.
   **/
  private Boolean isSystem = null;

  /**
   * Getter for instanceGroupName.
   * Instance group name.
   **/
  @JsonProperty("instanceGroupName")
  public String getInstanceGroupName() {
    return instanceGroupName;
  }

  /**
   * Setter for instanceGroupName.
   * Instance group name.
   **/
  public void setInstanceGroupName(String instanceGroupName) {
    this.instanceGroupName = instanceGroupName;
  }

  /**
   * Getter for instanceGroupId.
   * Instance group ID.
   **/
  @JsonProperty("instanceGroupId")
  public String getInstanceGroupId() {
    return instanceGroupId;
  }

  /**
   * Setter for instanceGroupId.
   * Instance group ID.
   **/
  public void setInstanceGroupId(String instanceGroupId) {
    this.instanceGroupId = instanceGroupId;
  }

  /**
   * Getter for instanceType.
   * Instance type.
   **/
  @JsonProperty("instanceType")
  public String getInstanceType() {
    return instanceType;
  }

  /**
   * Setter for instanceType.
   * Instance type.
   **/
  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  /**
   * Getter for instanceTier.
   * Instance tier.
   **/
  @JsonProperty("instanceTier")
  public String getInstanceTier() {
    return instanceTier;
  }

  /**
   * Setter for instanceTier.
   * Instance tier.
   **/
  public void setInstanceTier(String instanceTier) {
    this.instanceTier = instanceTier;
  }

  /**
   * Getter for instanceStates.
   * Instance states
   **/
  @JsonProperty("instanceStates")
  public CommonInstanceStateCounts getInstanceStates() {
    return instanceStates;
  }

  /**
   * Setter for instanceStates.
   * Instance states
   **/
  public void setInstanceStates(CommonInstanceStateCounts instanceStates) {
    this.instanceStates = instanceStates;
  }

  /**
   * Getter for instanceCount.
   * Instance count.
   **/
  @JsonProperty("instanceCount")
  public Long getInstanceCount() {
    return instanceCount;
  }

  /**
   * Setter for instanceCount.
   * Instance count.
   **/
  public void setInstanceCount(Long instanceCount) {
    this.instanceCount = instanceCount;
  }

  /**
   * Getter for nodeVolumeSize.
   * Node volume size.
   **/
  @JsonProperty("nodeVolumeSize")
  public Long getNodeVolumeSize() {
    return nodeVolumeSize;
  }

  /**
   * Setter for nodeVolumeSize.
   * Node volume size.
   **/
  public void setNodeVolumeSize(Long nodeVolumeSize) {
    this.nodeVolumeSize = nodeVolumeSize;
  }

  /**
   * Getter for enableAutoScaling.
   * Enable auto scaling.
   **/
  @JsonProperty("enableAutoScaling")
  public Boolean getEnableAutoScaling() {
    return enableAutoScaling;
  }

  /**
   * Setter for enableAutoScaling.
   * Enable auto scaling.
   **/
  public void setEnableAutoScaling(Boolean enableAutoScaling) {
    this.enableAutoScaling = enableAutoScaling;
  }

  /**
   * Getter for minInstance.
   * Min instances.
   **/
  @JsonProperty("minInstance")
  public Long getMinInstance() {
    return minInstance;
  }

  /**
   * Setter for minInstance.
   * Min instances.
   **/
  public void setMinInstance(Long minInstance) {
    this.minInstance = minInstance;
  }

  /**
   * Getter for maxInstance.
   * Max instances.
   **/
  @JsonProperty("maxInstance")
  public Long getMaxInstance() {
    return maxInstance;
  }

  /**
   * Setter for maxInstance.
   * Max instances.
   **/
  public void setMaxInstance(Long maxInstance) {
    this.maxInstance = maxInstance;
  }

  /**
   * Getter for singleZone.
   * Single zone.
   **/
  @JsonProperty("singleZone")
  public Boolean getSingleZone() {
    return singleZone;
  }

  /**
   * Setter for singleZone.
   * Single zone.
   **/
  public void setSingleZone(Boolean singleZone) {
    this.singleZone = singleZone;
  }

  /**
   * Getter for labels.
   * Labels.
   **/
  @JsonProperty("labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  /**
   * Setter for labels.
   * Labels.
   **/
  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  /**
   * Getter for taints.
   * Taints.
   **/
  @JsonProperty("taints")
  public Map<String, String> getTaints() {
    return taints;
  }

  /**
   * Setter for taints.
   * Taints.
   **/
  public void setTaints(Map<String, String> taints) {
    this.taints = taints;
  }

  /**
   * Getter for tags.
   * Tags.
   **/
  @JsonProperty("tags")
  public Map<String, String> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Tags.
   **/
  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  /**
   * Getter for kubeReservedCpu.
   * Kube reserved CPU.
   **/
  @JsonProperty("kubeReservedCpu")
  public Long getKubeReservedCpu() {
    return kubeReservedCpu;
  }

  /**
   * Setter for kubeReservedCpu.
   * Kube reserved CPU.
   **/
  public void setKubeReservedCpu(Long kubeReservedCpu) {
    this.kubeReservedCpu = kubeReservedCpu;
  }

  /**
   * Getter for kubeReservedMemory.
   * Kube reserved memory.
   **/
  @JsonProperty("kubeReservedMemory")
  public Long getKubeReservedMemory() {
    return kubeReservedMemory;
  }

  /**
   * Setter for kubeReservedMemory.
   * Kube reserved memory.
   **/
  public void setKubeReservedMemory(Long kubeReservedMemory) {
    this.kubeReservedMemory = kubeReservedMemory;
  }

  /**
   * Getter for kubeReservedStorage.
   * Kube reserved storage.
   **/
  @JsonProperty("kubeReservedStorage")
  public Long getKubeReservedStorage() {
    return kubeReservedStorage;
  }

  /**
   * Setter for kubeReservedStorage.
   * Kube reserved storage.
   **/
  public void setKubeReservedStorage(Long kubeReservedStorage) {
    this.kubeReservedStorage = kubeReservedStorage;
  }

  /**
   * Getter for systemReservedCpu.
   * System reserved CPU.
   **/
  @JsonProperty("systemReservedCpu")
  public Long getSystemReservedCpu() {
    return systemReservedCpu;
  }

  /**
   * Setter for systemReservedCpu.
   * System reserved CPU.
   **/
  public void setSystemReservedCpu(Long systemReservedCpu) {
    this.systemReservedCpu = systemReservedCpu;
  }

  /**
   * Getter for systemReservedMemory.
   * System reserved memory.
   **/
  @JsonProperty("systemReservedMemory")
  public Long getSystemReservedMemory() {
    return systemReservedMemory;
  }

  /**
   * Setter for systemReservedMemory.
   * System reserved memory.
   **/
  public void setSystemReservedMemory(Long systemReservedMemory) {
    this.systemReservedMemory = systemReservedMemory;
  }

  /**
   * Getter for systemReservedStorage.
   * System reserved storage.
   **/
  @JsonProperty("systemReservedStorage")
  public Long getSystemReservedStorage() {
    return systemReservedStorage;
  }

  /**
   * Setter for systemReservedStorage.
   * System reserved storage.
   **/
  public void setSystemReservedStorage(Long systemReservedStorage) {
    this.systemReservedStorage = systemReservedStorage;
  }

  /**
   * Getter for availabilityZones.
   * Availability zones.
   **/
  @JsonProperty("availabilityZones")
  public List<Integer> getAvailabilityZones() {
    return availabilityZones;
  }

  /**
   * Setter for availabilityZones.
   * Availability zones.
   **/
  public void setAvailabilityZones(List<Integer> availabilityZones) {
    this.availabilityZones = availabilityZones;
  }

  /**
   * Getter for nodePool.
   * AKS node pool.
   **/
  @JsonProperty("nodePool")
  public AksNodePool getNodePool() {
    return nodePool;
  }

  /**
   * Setter for nodePool.
   * AKS node pool.
   **/
  public void setNodePool(AksNodePool nodePool) {
    this.nodePool = nodePool;
  }

  /**
   * Getter for instances.
   * AKS pool instance.
   **/
  @JsonProperty("instances")
  public List<AksPoolInstance> getInstances() {
    return instances;
  }

  /**
   * Setter for instances.
   * AKS pool instance.
   **/
  public void setInstances(List<AksPoolInstance> instances) {
    this.instances = instances;
  }

  /**
   * Getter for isSystem.
   * True for a system node.
   **/
  @JsonProperty("isSystem")
  public Boolean getIsSystem() {
    return isSystem;
  }

  /**
   * Setter for isSystem.
   * True for a system node.
   **/
  public void setIsSystem(Boolean isSystem) {
    this.isSystem = isSystem;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AksInstanceGroup aksInstanceGroup = (AksInstanceGroup) o;
    if (!Objects.equals(this.instanceGroupName, aksInstanceGroup.instanceGroupName)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroupId, aksInstanceGroup.instanceGroupId)) {
      return false;
    }
    if (!Objects.equals(this.instanceType, aksInstanceGroup.instanceType)) {
      return false;
    }
    if (!Objects.equals(this.instanceTier, aksInstanceGroup.instanceTier)) {
      return false;
    }
    if (!Objects.equals(this.instanceStates, aksInstanceGroup.instanceStates)) {
      return false;
    }
    if (!Objects.equals(this.instanceCount, aksInstanceGroup.instanceCount)) {
      return false;
    }
    if (!Objects.equals(this.nodeVolumeSize, aksInstanceGroup.nodeVolumeSize)) {
      return false;
    }
    if (!Objects.equals(this.enableAutoScaling, aksInstanceGroup.enableAutoScaling)) {
      return false;
    }
    if (!Objects.equals(this.minInstance, aksInstanceGroup.minInstance)) {
      return false;
    }
    if (!Objects.equals(this.maxInstance, aksInstanceGroup.maxInstance)) {
      return false;
    }
    if (!Objects.equals(this.singleZone, aksInstanceGroup.singleZone)) {
      return false;
    }
    if (!Objects.equals(this.labels, aksInstanceGroup.labels)) {
      return false;
    }
    if (!Objects.equals(this.taints, aksInstanceGroup.taints)) {
      return false;
    }
    if (!Objects.equals(this.tags, aksInstanceGroup.tags)) {
      return false;
    }
    if (!Objects.equals(this.kubeReservedCpu, aksInstanceGroup.kubeReservedCpu)) {
      return false;
    }
    if (!Objects.equals(this.kubeReservedMemory, aksInstanceGroup.kubeReservedMemory)) {
      return false;
    }
    if (!Objects.equals(this.kubeReservedStorage, aksInstanceGroup.kubeReservedStorage)) {
      return false;
    }
    if (!Objects.equals(this.systemReservedCpu, aksInstanceGroup.systemReservedCpu)) {
      return false;
    }
    if (!Objects.equals(this.systemReservedMemory, aksInstanceGroup.systemReservedMemory)) {
      return false;
    }
    if (!Objects.equals(this.systemReservedStorage, aksInstanceGroup.systemReservedStorage)) {
      return false;
    }
    if (!Objects.equals(this.availabilityZones, aksInstanceGroup.availabilityZones)) {
      return false;
    }
    if (!Objects.equals(this.nodePool, aksInstanceGroup.nodePool)) {
      return false;
    }
    if (!Objects.equals(this.instances, aksInstanceGroup.instances)) {
      return false;
    }
    if (!Objects.equals(this.isSystem, aksInstanceGroup.isSystem)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceGroupName, instanceGroupId, instanceType, instanceTier, instanceStates, instanceCount, nodeVolumeSize, enableAutoScaling, minInstance, maxInstance, singleZone, labels, taints, tags, kubeReservedCpu, kubeReservedMemory, kubeReservedStorage, systemReservedCpu, systemReservedMemory, systemReservedStorage, availabilityZones, nodePool, instances, isSystem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AksInstanceGroup {\n");
    sb.append("    instanceGroupName: ").append(toIndentedString(instanceGroupName)).append("\n");
    sb.append("    instanceGroupId: ").append(toIndentedString(instanceGroupId)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    instanceTier: ").append(toIndentedString(instanceTier)).append("\n");
    sb.append("    instanceStates: ").append(toIndentedString(instanceStates)).append("\n");
    sb.append("    instanceCount: ").append(toIndentedString(instanceCount)).append("\n");
    sb.append("    nodeVolumeSize: ").append(toIndentedString(nodeVolumeSize)).append("\n");
    sb.append("    enableAutoScaling: ").append(toIndentedString(enableAutoScaling)).append("\n");
    sb.append("    minInstance: ").append(toIndentedString(minInstance)).append("\n");
    sb.append("    maxInstance: ").append(toIndentedString(maxInstance)).append("\n");
    sb.append("    singleZone: ").append(toIndentedString(singleZone)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    taints: ").append(toIndentedString(taints)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    kubeReservedCpu: ").append(toIndentedString(kubeReservedCpu)).append("\n");
    sb.append("    kubeReservedMemory: ").append(toIndentedString(kubeReservedMemory)).append("\n");
    sb.append("    kubeReservedStorage: ").append(toIndentedString(kubeReservedStorage)).append("\n");
    sb.append("    systemReservedCpu: ").append(toIndentedString(systemReservedCpu)).append("\n");
    sb.append("    systemReservedMemory: ").append(toIndentedString(systemReservedMemory)).append("\n");
    sb.append("    systemReservedStorage: ").append(toIndentedString(systemReservedStorage)).append("\n");
    sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
    sb.append("    nodePool: ").append(toIndentedString(nodePool)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    isSystem: ").append(toIndentedString(isSystem)).append("\n");
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

