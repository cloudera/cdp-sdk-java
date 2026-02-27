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

/**
 * Quota in requests for the Virtual Warehouse.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-02-26T14:34:48.889-08:00")
public class QuotaRequest  {

  /**
   * CPU quota in cores.
   **/
  private Float cpu = null;

  /**
   * Memory quota in MB.
   **/
  private Integer memory = null;

  /**
   * Getter for cpu.
   * CPU quota in cores.
   **/
  @JsonProperty("cpu")
  public Float getCpu() {
    return cpu;
  }

  /**
   * Setter for cpu.
   * CPU quota in cores.
   **/
  public void setCpu(Float cpu) {
    this.cpu = cpu;
  }

  /**
   * Getter for memory.
   * Memory quota in MB.
   **/
  @JsonProperty("memory")
  public Integer getMemory() {
    return memory;
  }

  /**
   * Setter for memory.
   * Memory quota in MB.
   **/
  public void setMemory(Integer memory) {
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
    QuotaRequest quotaRequest = (QuotaRequest) o;
    if (!Objects.equals(this.cpu, quotaRequest.cpu)) {
      return false;
    }
    if (!Objects.equals(this.memory, quotaRequest.memory)) {
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
    sb.append("class QuotaRequest {\n");
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

