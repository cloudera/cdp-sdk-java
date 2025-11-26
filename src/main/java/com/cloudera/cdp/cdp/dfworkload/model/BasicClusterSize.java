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

package com.cloudera.cdp.dfworkload.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Cluster scaling parameters.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-26T08:05:45.357-08:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class BasicClusterSize  {

  /**
   * The name of this Cluster Size.
   **/
  private String name = null;

  /**
   * The number of CPU Cores per node (will be truncated to the nearest integer).
   **/
  private Double coresPerNode = null;

  /**
   * The memory limit (will be truncated to the nearest integer).
   **/
  private Double memoryLimit = null;

  /**
   * Getter for name.
   * The name of this Cluster Size.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of this Cluster Size.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for coresPerNode.
   * The number of CPU Cores per node (will be truncated to the nearest integer).
   **/
  @JsonProperty("coresPerNode")
  public Double getCoresPerNode() {
    return coresPerNode;
  }

  /**
   * Setter for coresPerNode.
   * The number of CPU Cores per node (will be truncated to the nearest integer).
   **/
  public void setCoresPerNode(Double coresPerNode) {
    this.coresPerNode = coresPerNode;
  }

  /**
   * Getter for memoryLimit.
   * The memory limit (will be truncated to the nearest integer).
   **/
  @JsonProperty("memoryLimit")
  public Double getMemoryLimit() {
    return memoryLimit;
  }

  /**
   * Setter for memoryLimit.
   * The memory limit (will be truncated to the nearest integer).
   **/
  public void setMemoryLimit(Double memoryLimit) {
    this.memoryLimit = memoryLimit;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicClusterSize basicClusterSize = (BasicClusterSize) o;
    if (!Objects.equals(this.name, basicClusterSize.name)) {
      return false;
    }
    if (!Objects.equals(this.coresPerNode, basicClusterSize.coresPerNode)) {
      return false;
    }
    if (!Objects.equals(this.memoryLimit, basicClusterSize.memoryLimit)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, coresPerNode, memoryLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicClusterSize {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    coresPerNode: ").append(toIndentedString(coresPerNode)).append("\n");
    sb.append("    memoryLimit: ").append(toIndentedString(memoryLimit)).append("\n");
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

