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
 * Configurations for auto-scaling a Virtual Warehouse.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-10-20T13:23:28.902-07:00")
public class AutoscalingOptions  {

  /**
   * Minimum number of available compute groups.
   **/
  private Integer minClusters = 1;

  /**
   * Maximum number of available compute groups.
   **/
  private Integer maxClusters = 20;

  /**
   * Getter for minClusters.
   * Minimum number of available compute groups.
   **/
  @JsonProperty("minClusters")
  public Integer getMinClusters() {
    return minClusters;
  }

  /**
   * Setter for minClusters.
   * Minimum number of available compute groups.
   **/
  public void setMinClusters(Integer minClusters) {
    this.minClusters = minClusters;
  }

  /**
   * Getter for maxClusters.
   * Maximum number of available compute groups.
   **/
  @JsonProperty("maxClusters")
  public Integer getMaxClusters() {
    return maxClusters;
  }

  /**
   * Setter for maxClusters.
   * Maximum number of available compute groups.
   **/
  public void setMaxClusters(Integer maxClusters) {
    this.maxClusters = maxClusters;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoscalingOptions autoscalingOptions = (AutoscalingOptions) o;
    if (!Objects.equals(this.minClusters, autoscalingOptions.minClusters)) {
      return false;
    }
    if (!Objects.equals(this.maxClusters, autoscalingOptions.maxClusters)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(minClusters, maxClusters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoscalingOptions {\n");
    sb.append("    minClusters: ").append(toIndentedString(minClusters)).append("\n");
    sb.append("    maxClusters: ").append(toIndentedString(maxClusters)).append("\n");
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

