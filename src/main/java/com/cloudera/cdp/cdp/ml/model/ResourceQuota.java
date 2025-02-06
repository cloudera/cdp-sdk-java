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
 * Resource quota configuration for quota management.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-02-06T11:00:49.241-08:00")
public class ResourceQuota  {

  /**
   * The quota for CPU resource.
   **/
  private String cpuQuota = null;

  /**
   * The quota for memory resource.
   **/
  private String memoryQuota = null;

  /**
   * The quota for gpu resource.
   **/
  private String gpuQuota = null;

  /**
   * Getter for cpuQuota.
   * The quota for CPU resource.
   **/
  @JsonProperty("cpuQuota")
  public String getCpuQuota() {
    return cpuQuota;
  }

  /**
   * Setter for cpuQuota.
   * The quota for CPU resource.
   **/
  public void setCpuQuota(String cpuQuota) {
    this.cpuQuota = cpuQuota;
  }

  /**
   * Getter for memoryQuota.
   * The quota for memory resource.
   **/
  @JsonProperty("memoryQuota")
  public String getMemoryQuota() {
    return memoryQuota;
  }

  /**
   * Setter for memoryQuota.
   * The quota for memory resource.
   **/
  public void setMemoryQuota(String memoryQuota) {
    this.memoryQuota = memoryQuota;
  }

  /**
   * Getter for gpuQuota.
   * The quota for gpu resource.
   **/
  @JsonProperty("gpuQuota")
  public String getGpuQuota() {
    return gpuQuota;
  }

  /**
   * Setter for gpuQuota.
   * The quota for gpu resource.
   **/
  public void setGpuQuota(String gpuQuota) {
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
    ResourceQuota resourceQuota = (ResourceQuota) o;
    if (!Objects.equals(this.cpuQuota, resourceQuota.cpuQuota)) {
      return false;
    }
    if (!Objects.equals(this.memoryQuota, resourceQuota.memoryQuota)) {
      return false;
    }
    if (!Objects.equals(this.gpuQuota, resourceQuota.gpuQuota)) {
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
    sb.append("class ResourceQuota {\n");
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

