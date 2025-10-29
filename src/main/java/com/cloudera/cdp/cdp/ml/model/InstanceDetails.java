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

/**
 * Instance Details
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-28T14:00:27.700-07:00")
public class InstanceDetails  {

  /**
   * The number of CPU cores available for the instance in the region.
   **/
  private String cpu = null;

  /**
   * The number of GPUs available for the instance in the region.
   **/
  private String gpu = null;

  /**
   * The amount of memory (RAM) available for the instance in the region, typically measured in GB.
   **/
  private String memory = null;

  /**
   * A unique name or identifier for the instance type in the region.
   **/
  private String name = null;

  /**
   * Name of the CPU/GPU category to which it belongs.
   **/
  private String category = null;

  /**
   * GPU model.
   **/
  private String gpuModel = null;

  /**
   * GPU model type.
   **/
  private String gpuType = null;

  /**
   * Memory capacity of the GPU.
   **/
  private String gpuMemory = null;

  /**
   * Compute capability of the GPU.
   **/
  private String computeCapability = null;

  /**
   * Type of interconnect between GPUs.
   **/
  private String interconnectType = null;

  /**
   * Getter for cpu.
   * The number of CPU cores available for the instance in the region.
   **/
  @JsonProperty("cpu")
  public String getCpu() {
    return cpu;
  }

  /**
   * Setter for cpu.
   * The number of CPU cores available for the instance in the region.
   **/
  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  /**
   * Getter for gpu.
   * The number of GPUs available for the instance in the region.
   **/
  @JsonProperty("gpu")
  public String getGpu() {
    return gpu;
  }

  /**
   * Setter for gpu.
   * The number of GPUs available for the instance in the region.
   **/
  public void setGpu(String gpu) {
    this.gpu = gpu;
  }

  /**
   * Getter for memory.
   * The amount of memory (RAM) available for the instance in the region, typically measured in GB.
   **/
  @JsonProperty("memory")
  public String getMemory() {
    return memory;
  }

  /**
   * Setter for memory.
   * The amount of memory (RAM) available for the instance in the region, typically measured in GB.
   **/
  public void setMemory(String memory) {
    this.memory = memory;
  }

  /**
   * Getter for name.
   * A unique name or identifier for the instance type in the region.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * A unique name or identifier for the instance type in the region.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for category.
   * Name of the CPU/GPU category to which it belongs.
   **/
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  /**
   * Setter for category.
   * Name of the CPU/GPU category to which it belongs.
   **/
  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * Getter for gpuModel.
   * GPU model.
   **/
  @JsonProperty("gpuModel")
  public String getGpuModel() {
    return gpuModel;
  }

  /**
   * Setter for gpuModel.
   * GPU model.
   **/
  public void setGpuModel(String gpuModel) {
    this.gpuModel = gpuModel;
  }

  /**
   * Getter for gpuType.
   * GPU model type.
   **/
  @JsonProperty("gpuType")
  public String getGpuType() {
    return gpuType;
  }

  /**
   * Setter for gpuType.
   * GPU model type.
   **/
  public void setGpuType(String gpuType) {
    this.gpuType = gpuType;
  }

  /**
   * Getter for gpuMemory.
   * Memory capacity of the GPU.
   **/
  @JsonProperty("gpuMemory")
  public String getGpuMemory() {
    return gpuMemory;
  }

  /**
   * Setter for gpuMemory.
   * Memory capacity of the GPU.
   **/
  public void setGpuMemory(String gpuMemory) {
    this.gpuMemory = gpuMemory;
  }

  /**
   * Getter for computeCapability.
   * Compute capability of the GPU.
   **/
  @JsonProperty("computeCapability")
  public String getComputeCapability() {
    return computeCapability;
  }

  /**
   * Setter for computeCapability.
   * Compute capability of the GPU.
   **/
  public void setComputeCapability(String computeCapability) {
    this.computeCapability = computeCapability;
  }

  /**
   * Getter for interconnectType.
   * Type of interconnect between GPUs.
   **/
  @JsonProperty("interconnectType")
  public String getInterconnectType() {
    return interconnectType;
  }

  /**
   * Setter for interconnectType.
   * Type of interconnect between GPUs.
   **/
  public void setInterconnectType(String interconnectType) {
    this.interconnectType = interconnectType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceDetails instanceDetails = (InstanceDetails) o;
    if (!Objects.equals(this.cpu, instanceDetails.cpu)) {
      return false;
    }
    if (!Objects.equals(this.gpu, instanceDetails.gpu)) {
      return false;
    }
    if (!Objects.equals(this.memory, instanceDetails.memory)) {
      return false;
    }
    if (!Objects.equals(this.name, instanceDetails.name)) {
      return false;
    }
    if (!Objects.equals(this.category, instanceDetails.category)) {
      return false;
    }
    if (!Objects.equals(this.gpuModel, instanceDetails.gpuModel)) {
      return false;
    }
    if (!Objects.equals(this.gpuType, instanceDetails.gpuType)) {
      return false;
    }
    if (!Objects.equals(this.gpuMemory, instanceDetails.gpuMemory)) {
      return false;
    }
    if (!Objects.equals(this.computeCapability, instanceDetails.computeCapability)) {
      return false;
    }
    if (!Objects.equals(this.interconnectType, instanceDetails.interconnectType)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpu, gpu, memory, name, category, gpuModel, gpuType, gpuMemory, computeCapability, interconnectType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceDetails {\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    gpuModel: ").append(toIndentedString(gpuModel)).append("\n");
    sb.append("    gpuType: ").append(toIndentedString(gpuType)).append("\n");
    sb.append("    gpuMemory: ").append(toIndentedString(gpuMemory)).append("\n");
    sb.append("    computeCapability: ").append(toIndentedString(computeCapability)).append("\n");
    sb.append("    interconnectType: ").append(toIndentedString(interconnectType)).append("\n");
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

