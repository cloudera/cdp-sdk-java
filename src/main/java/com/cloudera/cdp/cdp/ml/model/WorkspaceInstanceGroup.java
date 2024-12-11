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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.ml.model.Instance;
import com.cloudera.cdp.ml.model.Tag;
import java.util.*;

/**
 * Instance group information to show in workbench details.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-11T11:26:09.238-08:00")
public class WorkspaceInstanceGroup  {

  /**
   * The cloud provider instance type for the node instance.
   **/
  private String instanceType = null;

  /**
   * The initial number of instance node.
   **/
  private Integer instanceCount = null;

  /**
   * The unique name of the instance group.
   **/
  private String instanceGroupName = null;

  /**
   * The minimum number of instances that can be deployed to this instance group. If the value is 0, the group might be empty.
   **/
  private Integer minInstances = null;

  /**
   * The maximum number of instances that can be deployed to this instance group.
   **/
  private Integer maxInstances = null;

  /**
   * Instances in the instance group.
   **/
  private List<Instance> instances = new ArrayList<Instance>();

  /**
   * Tags are key/value pairs that are applied to all tag-able resources deployed in the workbench's cloud environment.
   **/
  private List<Tag> tags = new ArrayList<Tag>();

  /**
   * Number of CPUs attached to this instance type.
   **/
  private String cpu = null;

  /**
   * Number of GPUs attached to this instance type.
   **/
  private String gpu = null;

  /**
   * Memory in GiB attached to this instance type.
   **/
  private String memory = null;

  /**
   * Getter for instanceType.
   * The cloud provider instance type for the node instance.
   **/
  @JsonProperty("instanceType")
  public String getInstanceType() {
    return instanceType;
  }

  /**
   * Setter for instanceType.
   * The cloud provider instance type for the node instance.
   **/
  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  /**
   * Getter for instanceCount.
   * The initial number of instance node.
   **/
  @JsonProperty("instanceCount")
  public Integer getInstanceCount() {
    return instanceCount;
  }

  /**
   * Setter for instanceCount.
   * The initial number of instance node.
   **/
  public void setInstanceCount(Integer instanceCount) {
    this.instanceCount = instanceCount;
  }

  /**
   * Getter for instanceGroupName.
   * The unique name of the instance group.
   **/
  @JsonProperty("instanceGroupName")
  public String getInstanceGroupName() {
    return instanceGroupName;
  }

  /**
   * Setter for instanceGroupName.
   * The unique name of the instance group.
   **/
  public void setInstanceGroupName(String instanceGroupName) {
    this.instanceGroupName = instanceGroupName;
  }

  /**
   * Getter for minInstances.
   * The minimum number of instances that can be deployed to this instance group. If the value is 0, the group might be empty.
   **/
  @JsonProperty("minInstances")
  public Integer getMinInstances() {
    return minInstances;
  }

  /**
   * Setter for minInstances.
   * The minimum number of instances that can be deployed to this instance group. If the value is 0, the group might be empty.
   **/
  public void setMinInstances(Integer minInstances) {
    this.minInstances = minInstances;
  }

  /**
   * Getter for maxInstances.
   * The maximum number of instances that can be deployed to this instance group.
   **/
  @JsonProperty("maxInstances")
  public Integer getMaxInstances() {
    return maxInstances;
  }

  /**
   * Setter for maxInstances.
   * The maximum number of instances that can be deployed to this instance group.
   **/
  public void setMaxInstances(Integer maxInstances) {
    this.maxInstances = maxInstances;
  }

  /**
   * Getter for instances.
   * Instances in the instance group.
   **/
  @JsonProperty("instances")
  public List<Instance> getInstances() {
    return instances;
  }

  /**
   * Setter for instances.
   * Instances in the instance group.
   **/
  public void setInstances(List<Instance> instances) {
    this.instances = instances;
  }

  /**
   * Getter for tags.
   * Tags are key/value pairs that are applied to all tag-able resources deployed in the workbench&#39;s cloud environment.
   **/
  @JsonProperty("tags")
  public List<Tag> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Tags are key/value pairs that are applied to all tag-able resources deployed in the workbench&#39;s cloud environment.
   **/
  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  /**
   * Getter for cpu.
   * Number of CPUs attached to this instance type.
   **/
  @JsonProperty("cpu")
  public String getCpu() {
    return cpu;
  }

  /**
   * Setter for cpu.
   * Number of CPUs attached to this instance type.
   **/
  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  /**
   * Getter for gpu.
   * Number of GPUs attached to this instance type.
   **/
  @JsonProperty("gpu")
  public String getGpu() {
    return gpu;
  }

  /**
   * Setter for gpu.
   * Number of GPUs attached to this instance type.
   **/
  public void setGpu(String gpu) {
    this.gpu = gpu;
  }

  /**
   * Getter for memory.
   * Memory in GiB attached to this instance type.
   **/
  @JsonProperty("memory")
  public String getMemory() {
    return memory;
  }

  /**
   * Setter for memory.
   * Memory in GiB attached to this instance type.
   **/
  public void setMemory(String memory) {
    this.memory = memory;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceInstanceGroup workspaceInstanceGroup = (WorkspaceInstanceGroup) o;
    if (!Objects.equals(this.instanceType, workspaceInstanceGroup.instanceType)) {
      return false;
    }
    if (!Objects.equals(this.instanceCount, workspaceInstanceGroup.instanceCount)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroupName, workspaceInstanceGroup.instanceGroupName)) {
      return false;
    }
    if (!Objects.equals(this.minInstances, workspaceInstanceGroup.minInstances)) {
      return false;
    }
    if (!Objects.equals(this.maxInstances, workspaceInstanceGroup.maxInstances)) {
      return false;
    }
    if (!Objects.equals(this.instances, workspaceInstanceGroup.instances)) {
      return false;
    }
    if (!Objects.equals(this.tags, workspaceInstanceGroup.tags)) {
      return false;
    }
    if (!Objects.equals(this.cpu, workspaceInstanceGroup.cpu)) {
      return false;
    }
    if (!Objects.equals(this.gpu, workspaceInstanceGroup.gpu)) {
      return false;
    }
    if (!Objects.equals(this.memory, workspaceInstanceGroup.memory)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceType, instanceCount, instanceGroupName, minInstances, maxInstances, instances, tags, cpu, gpu, memory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceInstanceGroup {\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    instanceCount: ").append(toIndentedString(instanceCount)).append("\n");
    sb.append("    instanceGroupName: ").append(toIndentedString(instanceGroupName)).append("\n");
    sb.append("    minInstances: ").append(toIndentedString(minInstances)).append("\n");
    sb.append("    maxInstances: ").append(toIndentedString(maxInstances)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
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

