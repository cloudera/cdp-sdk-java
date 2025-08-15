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
import com.cloudera.cdp.dfworkload.model.CustomClusterSizeLimits;

/**
 * Cluster scaling parameters.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-14T20:25:47.841-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class ClusterSize  {

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
   * The text (i.e., the human readable name) for this Cluster Size.
   **/
  private String text = null;

  /**
   * The heap size.
   **/
  private Double heapSize = null;

  /**
   * Flag to signal whether this ClusterSize is enabled.
   **/
  private Boolean enabled = null;

  /**
   * Custom cluster size limits.
   **/
  private CustomClusterSizeLimits customClusterSizeLimits = null;

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

  /**
   * Getter for text.
   * The text (i.e., the human readable name) for this Cluster Size.
   **/
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  /**
   * Setter for text.
   * The text (i.e., the human readable name) for this Cluster Size.
   **/
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Getter for heapSize.
   * The heap size.
   **/
  @JsonProperty("heapSize")
  public Double getHeapSize() {
    return heapSize;
  }

  /**
   * Setter for heapSize.
   * The heap size.
   **/
  public void setHeapSize(Double heapSize) {
    this.heapSize = heapSize;
  }

  /**
   * Getter for enabled.
   * Flag to signal whether this ClusterSize is enabled.
   **/
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * Setter for enabled.
   * Flag to signal whether this ClusterSize is enabled.
   **/
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Getter for customClusterSizeLimits.
   * Custom cluster size limits.
   **/
  @JsonProperty("customClusterSizeLimits")
  public CustomClusterSizeLimits getCustomClusterSizeLimits() {
    return customClusterSizeLimits;
  }

  /**
   * Setter for customClusterSizeLimits.
   * Custom cluster size limits.
   **/
  public void setCustomClusterSizeLimits(CustomClusterSizeLimits customClusterSizeLimits) {
    this.customClusterSizeLimits = customClusterSizeLimits;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterSize clusterSize = (ClusterSize) o;
    if (!Objects.equals(this.name, clusterSize.name)) {
      return false;
    }
    if (!Objects.equals(this.coresPerNode, clusterSize.coresPerNode)) {
      return false;
    }
    if (!Objects.equals(this.memoryLimit, clusterSize.memoryLimit)) {
      return false;
    }
    if (!Objects.equals(this.text, clusterSize.text)) {
      return false;
    }
    if (!Objects.equals(this.heapSize, clusterSize.heapSize)) {
      return false;
    }
    if (!Objects.equals(this.enabled, clusterSize.enabled)) {
      return false;
    }
    if (!Objects.equals(this.customClusterSizeLimits, clusterSize.customClusterSizeLimits)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, coresPerNode, memoryLimit, text, heapSize, enabled, customClusterSizeLimits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterSize {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    coresPerNode: ").append(toIndentedString(coresPerNode)).append("\n");
    sb.append("    memoryLimit: ").append(toIndentedString(memoryLimit)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    heapSize: ").append(toIndentedString(heapSize)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    customClusterSizeLimits: ").append(toIndentedString(customClusterSizeLimits)).append("\n");
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

