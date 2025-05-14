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
 * Limits for the custom cluster size type.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-14T11:34:38.216-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class CustomClusterSizeLimits  {

  /**
   * The maximum number of CPU Cores per node, that fit on the node type.
   **/
  private Double maximumCpuCoresPerNode = null;

  /**
   * The minimum number of CPU Cores per node, that fit on the node type.
   **/
  private Double minimumCpuCoresPerNode = null;

  /**
   * The upper memory limit that is available on the node type.
   **/
  private Double maximumMemoryLimit = null;

  /**
   * The lower memory limit that is available on the node type.
   **/
  private Double minimumMemoryLimit = null;

  /**
   * Getter for maximumCpuCoresPerNode.
   * The maximum number of CPU Cores per node, that fit on the node type.
   **/
  @JsonProperty("maximumCpuCoresPerNode")
  public Double getMaximumCpuCoresPerNode() {
    return maximumCpuCoresPerNode;
  }

  /**
   * Setter for maximumCpuCoresPerNode.
   * The maximum number of CPU Cores per node, that fit on the node type.
   **/
  public void setMaximumCpuCoresPerNode(Double maximumCpuCoresPerNode) {
    this.maximumCpuCoresPerNode = maximumCpuCoresPerNode;
  }

  /**
   * Getter for minimumCpuCoresPerNode.
   * The minimum number of CPU Cores per node, that fit on the node type.
   **/
  @JsonProperty("minimumCpuCoresPerNode")
  public Double getMinimumCpuCoresPerNode() {
    return minimumCpuCoresPerNode;
  }

  /**
   * Setter for minimumCpuCoresPerNode.
   * The minimum number of CPU Cores per node, that fit on the node type.
   **/
  public void setMinimumCpuCoresPerNode(Double minimumCpuCoresPerNode) {
    this.minimumCpuCoresPerNode = minimumCpuCoresPerNode;
  }

  /**
   * Getter for maximumMemoryLimit.
   * The upper memory limit that is available on the node type.
   **/
  @JsonProperty("maximumMemoryLimit")
  public Double getMaximumMemoryLimit() {
    return maximumMemoryLimit;
  }

  /**
   * Setter for maximumMemoryLimit.
   * The upper memory limit that is available on the node type.
   **/
  public void setMaximumMemoryLimit(Double maximumMemoryLimit) {
    this.maximumMemoryLimit = maximumMemoryLimit;
  }

  /**
   * Getter for minimumMemoryLimit.
   * The lower memory limit that is available on the node type.
   **/
  @JsonProperty("minimumMemoryLimit")
  public Double getMinimumMemoryLimit() {
    return minimumMemoryLimit;
  }

  /**
   * Setter for minimumMemoryLimit.
   * The lower memory limit that is available on the node type.
   **/
  public void setMinimumMemoryLimit(Double minimumMemoryLimit) {
    this.minimumMemoryLimit = minimumMemoryLimit;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomClusterSizeLimits customClusterSizeLimits = (CustomClusterSizeLimits) o;
    if (!Objects.equals(this.maximumCpuCoresPerNode, customClusterSizeLimits.maximumCpuCoresPerNode)) {
      return false;
    }
    if (!Objects.equals(this.minimumCpuCoresPerNode, customClusterSizeLimits.minimumCpuCoresPerNode)) {
      return false;
    }
    if (!Objects.equals(this.maximumMemoryLimit, customClusterSizeLimits.maximumMemoryLimit)) {
      return false;
    }
    if (!Objects.equals(this.minimumMemoryLimit, customClusterSizeLimits.minimumMemoryLimit)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumCpuCoresPerNode, minimumCpuCoresPerNode, maximumMemoryLimit, minimumMemoryLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomClusterSizeLimits {\n");
    sb.append("    maximumCpuCoresPerNode: ").append(toIndentedString(maximumCpuCoresPerNode)).append("\n");
    sb.append("    minimumCpuCoresPerNode: ").append(toIndentedString(minimumCpuCoresPerNode)).append("\n");
    sb.append("    maximumMemoryLimit: ").append(toIndentedString(maximumMemoryLimit)).append("\n");
    sb.append("    minimumMemoryLimit: ").append(toIndentedString(minimumMemoryLimit)).append("\n");
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

