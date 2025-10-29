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
public class RequestResourceInfo  {

  /**
   * The model of the GPU, entails the complete name by the provider.
   **/
  private String gpuModel = null;

  /**
   * The gpu type, eg A100
   **/
  private String gpuType = null;

  /**
   * The number of CPU cores.
   **/
  private String cpu = null;

  /**
   * The number of GPUs.
   **/
  private String gpu = null;

  /**
   * The memory size of the resource.
   **/
  private String memory = null;

  /**
   * The GPU memory size of the resource.
   **/
  private String gpuMemory = null;

  /**
   * The compute capability of the GPU.
   **/
  private String computeCapability = null;

  /**
   * The interconnect type between 2 resources.
   **/
  private String interconnectType = null;

  /**
   * Getter for gpuModel.
   * The model of the GPU, entails the complete name by the provider.
   **/
  @JsonProperty("gpuModel")
  public String getGpuModel() {
    return gpuModel;
  }

  /**
   * Setter for gpuModel.
   * The model of the GPU, entails the complete name by the provider.
   **/
  public void setGpuModel(String gpuModel) {
    this.gpuModel = gpuModel;
  }

  /**
   * Getter for gpuType.
   * The gpu type, eg A100
   **/
  @JsonProperty("gpuType")
  public String getGpuType() {
    return gpuType;
  }

  /**
   * Setter for gpuType.
   * The gpu type, eg A100
   **/
  public void setGpuType(String gpuType) {
    this.gpuType = gpuType;
  }

  /**
   * Getter for cpu.
   * The number of CPU cores.
   **/
  @JsonProperty("cpu")
  public String getCpu() {
    return cpu;
  }

  /**
   * Setter for cpu.
   * The number of CPU cores.
   **/
  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  /**
   * Getter for gpu.
   * The number of GPUs.
   **/
  @JsonProperty("gpu")
  public String getGpu() {
    return gpu;
  }

  /**
   * Setter for gpu.
   * The number of GPUs.
   **/
  public void setGpu(String gpu) {
    this.gpu = gpu;
  }

  /**
   * Getter for memory.
   * The memory size of the resource.
   **/
  @JsonProperty("memory")
  public String getMemory() {
    return memory;
  }

  /**
   * Setter for memory.
   * The memory size of the resource.
   **/
  public void setMemory(String memory) {
    this.memory = memory;
  }

  /**
   * Getter for gpuMemory.
   * The GPU memory size of the resource.
   **/
  @JsonProperty("gpuMemory")
  public String getGpuMemory() {
    return gpuMemory;
  }

  /**
   * Setter for gpuMemory.
   * The GPU memory size of the resource.
   **/
  public void setGpuMemory(String gpuMemory) {
    this.gpuMemory = gpuMemory;
  }

  /**
   * Getter for computeCapability.
   * The compute capability of the GPU.
   **/
  @JsonProperty("computeCapability")
  public String getComputeCapability() {
    return computeCapability;
  }

  /**
   * Setter for computeCapability.
   * The compute capability of the GPU.
   **/
  public void setComputeCapability(String computeCapability) {
    this.computeCapability = computeCapability;
  }

  /**
   * Getter for interconnectType.
   * The interconnect type between 2 resources.
   **/
  @JsonProperty("interconnectType")
  public String getInterconnectType() {
    return interconnectType;
  }

  /**
   * Setter for interconnectType.
   * The interconnect type between 2 resources.
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
    RequestResourceInfo requestResourceInfo = (RequestResourceInfo) o;
    if (!Objects.equals(this.gpuModel, requestResourceInfo.gpuModel)) {
      return false;
    }
    if (!Objects.equals(this.gpuType, requestResourceInfo.gpuType)) {
      return false;
    }
    if (!Objects.equals(this.cpu, requestResourceInfo.cpu)) {
      return false;
    }
    if (!Objects.equals(this.gpu, requestResourceInfo.gpu)) {
      return false;
    }
    if (!Objects.equals(this.memory, requestResourceInfo.memory)) {
      return false;
    }
    if (!Objects.equals(this.gpuMemory, requestResourceInfo.gpuMemory)) {
      return false;
    }
    if (!Objects.equals(this.computeCapability, requestResourceInfo.computeCapability)) {
      return false;
    }
    if (!Objects.equals(this.interconnectType, requestResourceInfo.interconnectType)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(gpuModel, gpuType, cpu, gpu, memory, gpuMemory, computeCapability, interconnectType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestResourceInfo {\n");
    sb.append("    gpuModel: ").append(toIndentedString(gpuModel)).append("\n");
    sb.append("    gpuType: ").append(toIndentedString(gpuType)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
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

