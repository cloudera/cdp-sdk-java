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
import com.cloudera.cdp.compute.model.CommonEvent;
import com.cloudera.cdp.compute.model.CommonInstanceRequirementsWithMetadataResp;
import com.cloudera.cdp.compute.model.CommonInstanceStateCounts;
import com.cloudera.cdp.compute.model.EksInstance;
import java.util.*;
import java.util.Map;

/**
 * EKS instance group response structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-16T07:43:46.341-07:00")
public class EksInstanceGroup  {

  /**
   * AMI.
   **/
  private String ami = null;

  /**
   * Image param.
   **/
  private String imageParam = null;

  /**
   * Instance group name.
   **/
  private String instanceGroupName = null;

  /**
   * Instance group ID.
   **/
  private String instanceGroupId = null;

  /**
   * Instance tier.
   **/
  private String instanceTier = null;

  /**
   * Instance types.
   **/
  private List<String> instanceTypes = new ArrayList<String>();

  /**
   * Instance count.
   **/
  private Long instanceCount = null;

  /**
   * Instance states
   **/
  private CommonInstanceStateCounts instanceStates = null;

  /**
   * Single zone.
   **/
  private Boolean singleZone = null;

  /**
   * Min instances.
   **/
  private Long minInstance = null;

  /**
   * Max instances.
   **/
  private Long maxInstance = null;

  /**
   * Node instance role.
   **/
  private String nodeInstanceRole = null;

  /**
   * Node volume size.
   **/
  private Long nodeVolumeSize = null;

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
   * Autoscaling enabled.
   **/
  private Boolean autoscalingEnabled = null;

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
   * Enable cfs quota.
   **/
  private Boolean enableCfsQuota = null;

  /**
   * EKS Instance.
   **/
  private List<EksInstance> instances = new ArrayList<EksInstance>();

  /**
   * Events.
   **/
  private List<CommonEvent> events = new ArrayList<CommonEvent>();

  /**
   * Instance group status.
   **/
  private String instanceGroupStatus = null;

  /**
   * Launch Template name suffix.
   **/
  private String lTNameSuffix = null;

  /**
   * Instance requirements.
   **/
  private CommonInstanceRequirementsWithMetadataResp instanceRequirementswithMetadata = null;

  /**
   * Instance profile name.
   **/
  private String instanceProfile = null;

  /**
   * IMDS versions.
   **/
  private List<String> imdsVersions = new ArrayList<String>();

  /**
   * Getter for ami.
   * AMI.
   **/
  @JsonProperty("ami")
  public String getAmi() {
    return ami;
  }

  /**
   * Setter for ami.
   * AMI.
   **/
  public void setAmi(String ami) {
    this.ami = ami;
  }

  /**
   * Getter for imageParam.
   * Image param.
   **/
  @JsonProperty("imageParam")
  public String getImageParam() {
    return imageParam;
  }

  /**
   * Setter for imageParam.
   * Image param.
   **/
  public void setImageParam(String imageParam) {
    this.imageParam = imageParam;
  }

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
   * Getter for instanceTypes.
   * Instance types.
   **/
  @JsonProperty("instanceTypes")
  public List<String> getInstanceTypes() {
    return instanceTypes;
  }

  /**
   * Setter for instanceTypes.
   * Instance types.
   **/
  public void setInstanceTypes(List<String> instanceTypes) {
    this.instanceTypes = instanceTypes;
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
   * Getter for nodeInstanceRole.
   * Node instance role.
   **/
  @JsonProperty("nodeInstanceRole")
  public String getNodeInstanceRole() {
    return nodeInstanceRole;
  }

  /**
   * Setter for nodeInstanceRole.
   * Node instance role.
   **/
  public void setNodeInstanceRole(String nodeInstanceRole) {
    this.nodeInstanceRole = nodeInstanceRole;
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
   * Getter for autoscalingEnabled.
   * Autoscaling enabled.
   **/
  @JsonProperty("autoscalingEnabled")
  public Boolean getAutoscalingEnabled() {
    return autoscalingEnabled;
  }

  /**
   * Setter for autoscalingEnabled.
   * Autoscaling enabled.
   **/
  public void setAutoscalingEnabled(Boolean autoscalingEnabled) {
    this.autoscalingEnabled = autoscalingEnabled;
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
   * Getter for enableCfsQuota.
   * Enable cfs quota.
   **/
  @JsonProperty("enableCfsQuota")
  public Boolean getEnableCfsQuota() {
    return enableCfsQuota;
  }

  /**
   * Setter for enableCfsQuota.
   * Enable cfs quota.
   **/
  public void setEnableCfsQuota(Boolean enableCfsQuota) {
    this.enableCfsQuota = enableCfsQuota;
  }

  /**
   * Getter for instances.
   * EKS Instance.
   **/
  @JsonProperty("instances")
  public List<EksInstance> getInstances() {
    return instances;
  }

  /**
   * Setter for instances.
   * EKS Instance.
   **/
  public void setInstances(List<EksInstance> instances) {
    this.instances = instances;
  }

  /**
   * Getter for events.
   * Events.
   **/
  @JsonProperty("events")
  public List<CommonEvent> getEvents() {
    return events;
  }

  /**
   * Setter for events.
   * Events.
   **/
  public void setEvents(List<CommonEvent> events) {
    this.events = events;
  }

  /**
   * Getter for instanceGroupStatus.
   * Instance group status.
   **/
  @JsonProperty("instanceGroupStatus")
  public String getInstanceGroupStatus() {
    return instanceGroupStatus;
  }

  /**
   * Setter for instanceGroupStatus.
   * Instance group status.
   **/
  public void setInstanceGroupStatus(String instanceGroupStatus) {
    this.instanceGroupStatus = instanceGroupStatus;
  }

  /**
   * Getter for lTNameSuffix.
   * Launch Template name suffix.
   **/
  @JsonProperty("lTNameSuffix")
  public String getLTNameSuffix() {
    return lTNameSuffix;
  }

  /**
   * Setter for lTNameSuffix.
   * Launch Template name suffix.
   **/
  public void setLTNameSuffix(String lTNameSuffix) {
    this.lTNameSuffix = lTNameSuffix;
  }

  /**
   * Getter for instanceRequirementswithMetadata.
   * Instance requirements.
   **/
  @JsonProperty("instanceRequirementswithMetadata")
  public CommonInstanceRequirementsWithMetadataResp getInstanceRequirementswithMetadata() {
    return instanceRequirementswithMetadata;
  }

  /**
   * Setter for instanceRequirementswithMetadata.
   * Instance requirements.
   **/
  public void setInstanceRequirementswithMetadata(CommonInstanceRequirementsWithMetadataResp instanceRequirementswithMetadata) {
    this.instanceRequirementswithMetadata = instanceRequirementswithMetadata;
  }

  /**
   * Getter for instanceProfile.
   * Instance profile name.
   **/
  @JsonProperty("instanceProfile")
  public String getInstanceProfile() {
    return instanceProfile;
  }

  /**
   * Setter for instanceProfile.
   * Instance profile name.
   **/
  public void setInstanceProfile(String instanceProfile) {
    this.instanceProfile = instanceProfile;
  }

  /**
   * Getter for imdsVersions.
   * IMDS versions.
   **/
  @JsonProperty("imdsVersions")
  public List<String> getImdsVersions() {
    return imdsVersions;
  }

  /**
   * Setter for imdsVersions.
   * IMDS versions.
   **/
  public void setImdsVersions(List<String> imdsVersions) {
    this.imdsVersions = imdsVersions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EksInstanceGroup eksInstanceGroup = (EksInstanceGroup) o;
    if (!Objects.equals(this.ami, eksInstanceGroup.ami)) {
      return false;
    }
    if (!Objects.equals(this.imageParam, eksInstanceGroup.imageParam)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroupName, eksInstanceGroup.instanceGroupName)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroupId, eksInstanceGroup.instanceGroupId)) {
      return false;
    }
    if (!Objects.equals(this.instanceTier, eksInstanceGroup.instanceTier)) {
      return false;
    }
    if (!Objects.equals(this.instanceTypes, eksInstanceGroup.instanceTypes)) {
      return false;
    }
    if (!Objects.equals(this.instanceCount, eksInstanceGroup.instanceCount)) {
      return false;
    }
    if (!Objects.equals(this.instanceStates, eksInstanceGroup.instanceStates)) {
      return false;
    }
    if (!Objects.equals(this.singleZone, eksInstanceGroup.singleZone)) {
      return false;
    }
    if (!Objects.equals(this.minInstance, eksInstanceGroup.minInstance)) {
      return false;
    }
    if (!Objects.equals(this.maxInstance, eksInstanceGroup.maxInstance)) {
      return false;
    }
    if (!Objects.equals(this.nodeInstanceRole, eksInstanceGroup.nodeInstanceRole)) {
      return false;
    }
    if (!Objects.equals(this.nodeVolumeSize, eksInstanceGroup.nodeVolumeSize)) {
      return false;
    }
    if (!Objects.equals(this.labels, eksInstanceGroup.labels)) {
      return false;
    }
    if (!Objects.equals(this.taints, eksInstanceGroup.taints)) {
      return false;
    }
    if (!Objects.equals(this.tags, eksInstanceGroup.tags)) {
      return false;
    }
    if (!Objects.equals(this.autoscalingEnabled, eksInstanceGroup.autoscalingEnabled)) {
      return false;
    }
    if (!Objects.equals(this.kubeReservedCpu, eksInstanceGroup.kubeReservedCpu)) {
      return false;
    }
    if (!Objects.equals(this.kubeReservedMemory, eksInstanceGroup.kubeReservedMemory)) {
      return false;
    }
    if (!Objects.equals(this.kubeReservedStorage, eksInstanceGroup.kubeReservedStorage)) {
      return false;
    }
    if (!Objects.equals(this.systemReservedCpu, eksInstanceGroup.systemReservedCpu)) {
      return false;
    }
    if (!Objects.equals(this.systemReservedMemory, eksInstanceGroup.systemReservedMemory)) {
      return false;
    }
    if (!Objects.equals(this.systemReservedStorage, eksInstanceGroup.systemReservedStorage)) {
      return false;
    }
    if (!Objects.equals(this.enableCfsQuota, eksInstanceGroup.enableCfsQuota)) {
      return false;
    }
    if (!Objects.equals(this.instances, eksInstanceGroup.instances)) {
      return false;
    }
    if (!Objects.equals(this.events, eksInstanceGroup.events)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroupStatus, eksInstanceGroup.instanceGroupStatus)) {
      return false;
    }
    if (!Objects.equals(this.lTNameSuffix, eksInstanceGroup.lTNameSuffix)) {
      return false;
    }
    if (!Objects.equals(this.instanceRequirementswithMetadata, eksInstanceGroup.instanceRequirementswithMetadata)) {
      return false;
    }
    if (!Objects.equals(this.instanceProfile, eksInstanceGroup.instanceProfile)) {
      return false;
    }
    if (!Objects.equals(this.imdsVersions, eksInstanceGroup.imdsVersions)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(ami, imageParam, instanceGroupName, instanceGroupId, instanceTier, instanceTypes, instanceCount, instanceStates, singleZone, minInstance, maxInstance, nodeInstanceRole, nodeVolumeSize, labels, taints, tags, autoscalingEnabled, kubeReservedCpu, kubeReservedMemory, kubeReservedStorage, systemReservedCpu, systemReservedMemory, systemReservedStorage, enableCfsQuota, instances, events, instanceGroupStatus, lTNameSuffix, instanceRequirementswithMetadata, instanceProfile, imdsVersions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EksInstanceGroup {\n");
    sb.append("    ami: ").append(toIndentedString(ami)).append("\n");
    sb.append("    imageParam: ").append(toIndentedString(imageParam)).append("\n");
    sb.append("    instanceGroupName: ").append(toIndentedString(instanceGroupName)).append("\n");
    sb.append("    instanceGroupId: ").append(toIndentedString(instanceGroupId)).append("\n");
    sb.append("    instanceTier: ").append(toIndentedString(instanceTier)).append("\n");
    sb.append("    instanceTypes: ").append(toIndentedString(instanceTypes)).append("\n");
    sb.append("    instanceCount: ").append(toIndentedString(instanceCount)).append("\n");
    sb.append("    instanceStates: ").append(toIndentedString(instanceStates)).append("\n");
    sb.append("    singleZone: ").append(toIndentedString(singleZone)).append("\n");
    sb.append("    minInstance: ").append(toIndentedString(minInstance)).append("\n");
    sb.append("    maxInstance: ").append(toIndentedString(maxInstance)).append("\n");
    sb.append("    nodeInstanceRole: ").append(toIndentedString(nodeInstanceRole)).append("\n");
    sb.append("    nodeVolumeSize: ").append(toIndentedString(nodeVolumeSize)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    taints: ").append(toIndentedString(taints)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    autoscalingEnabled: ").append(toIndentedString(autoscalingEnabled)).append("\n");
    sb.append("    kubeReservedCpu: ").append(toIndentedString(kubeReservedCpu)).append("\n");
    sb.append("    kubeReservedMemory: ").append(toIndentedString(kubeReservedMemory)).append("\n");
    sb.append("    kubeReservedStorage: ").append(toIndentedString(kubeReservedStorage)).append("\n");
    sb.append("    systemReservedCpu: ").append(toIndentedString(systemReservedCpu)).append("\n");
    sb.append("    systemReservedMemory: ").append(toIndentedString(systemReservedMemory)).append("\n");
    sb.append("    systemReservedStorage: ").append(toIndentedString(systemReservedStorage)).append("\n");
    sb.append("    enableCfsQuota: ").append(toIndentedString(enableCfsQuota)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    instanceGroupStatus: ").append(toIndentedString(instanceGroupStatus)).append("\n");
    sb.append("    lTNameSuffix: ").append(toIndentedString(lTNameSuffix)).append("\n");
    sb.append("    instanceRequirementswithMetadata: ").append(toIndentedString(instanceRequirementswithMetadata)).append("\n");
    sb.append("    instanceProfile: ").append(toIndentedString(instanceProfile)).append("\n");
    sb.append("    imdsVersions: ").append(toIndentedString(imdsVersions)).append("\n");
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

