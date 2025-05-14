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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Resource pool quota for the Environment.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-14T11:34:35.786-07:00")
public class EnvironmentQuota  {

  /**
   * CPU quota (in Cores) for the Environment. Must be a positive number. By default, a quota won't be set for this resource type in the environment.
   **/
  private Long cpuQuota = null;

  /**
   * Memory quota (in GigaBytes) for the Environment. Must be a positive number. By default, a quota won't be set for this resource type in the environment.
   **/
  private Long memoryQuota = null;

  /**
   * GPU quota (in Cores) for the Environment. Must be a positive number. By default, a quota won't be set for this resource type in the environment.
   **/
  private Long gpuQuota = null;

  /**
   * Getter for cpuQuota.
   * CPU quota (in Cores) for the Environment. Must be a positive number. By default, a quota won&#39;t be set for this resource type in the environment.
   **/
  @JsonProperty("cpuQuota")
  public Long getCpuQuota() {
    return cpuQuota;
  }

  /**
   * Setter for cpuQuota.
   * CPU quota (in Cores) for the Environment. Must be a positive number. By default, a quota won&#39;t be set for this resource type in the environment.
   **/
  public void setCpuQuota(Long cpuQuota) {
    this.cpuQuota = cpuQuota;
  }

  /**
   * Getter for memoryQuota.
   * Memory quota (in GigaBytes) for the Environment. Must be a positive number. By default, a quota won&#39;t be set for this resource type in the environment.
   **/
  @JsonProperty("memoryQuota")
  public Long getMemoryQuota() {
    return memoryQuota;
  }

  /**
   * Setter for memoryQuota.
   * Memory quota (in GigaBytes) for the Environment. Must be a positive number. By default, a quota won&#39;t be set for this resource type in the environment.
   **/
  public void setMemoryQuota(Long memoryQuota) {
    this.memoryQuota = memoryQuota;
  }

  /**
   * Getter for gpuQuota.
   * GPU quota (in Cores) for the Environment. Must be a positive number. By default, a quota won&#39;t be set for this resource type in the environment.
   **/
  @JsonProperty("gpuQuota")
  public Long getGpuQuota() {
    return gpuQuota;
  }

  /**
   * Setter for gpuQuota.
   * GPU quota (in Cores) for the Environment. Must be a positive number. By default, a quota won&#39;t be set for this resource type in the environment.
   **/
  public void setGpuQuota(Long gpuQuota) {
    this.gpuQuota = gpuQuota;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentQuota environmentQuota = (EnvironmentQuota) o;
    if (!Objects.equals(this.cpuQuota, environmentQuota.cpuQuota)) {
      return false;
    }
    if (!Objects.equals(this.memoryQuota, environmentQuota.memoryQuota)) {
      return false;
    }
    if (!Objects.equals(this.gpuQuota, environmentQuota.gpuQuota)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuQuota, memoryQuota, gpuQuota);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentQuota {\n");
    sb.append("    cpuQuota: ").append(toIndentedString(cpuQuota)).append("\n");
    sb.append("    memoryQuota: ").append(toIndentedString(memoryQuota)).append("\n");
    sb.append("    gpuQuota: ").append(toIndentedString(gpuQuota)).append("\n");
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

