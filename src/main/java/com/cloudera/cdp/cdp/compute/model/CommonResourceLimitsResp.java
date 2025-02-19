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

/**
 * Resource limits response structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-02-18T18:28:47.390-08:00")
public class CommonResourceLimitsResp  {

  /**
   * Prometheus server CPU limit (default 1000m).
   **/
  private String cpu = null;

  /**
   * Prometheus server memory limit (default 2048M).
   **/
  private String memory = null;

  /**
   * Getter for cpu.
   * Prometheus server CPU limit (default 1000m).
   **/
  @JsonProperty("cpu")
  public String getCpu() {
    return cpu;
  }

  /**
   * Setter for cpu.
   * Prometheus server CPU limit (default 1000m).
   **/
  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  /**
   * Getter for memory.
   * Prometheus server memory limit (default 2048M).
   **/
  @JsonProperty("memory")
  public String getMemory() {
    return memory;
  }

  /**
   * Setter for memory.
   * Prometheus server memory limit (default 2048M).
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
    CommonResourceLimitsResp commonResourceLimitsResp = (CommonResourceLimitsResp) o;
    if (!Objects.equals(this.cpu, commonResourceLimitsResp.cpu)) {
      return false;
    }
    if (!Objects.equals(this.memory, commonResourceLimitsResp.memory)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpu, memory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonResourceLimitsResp {\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
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

