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
 * Auto-scaling configuration for a Virtual Warehouse. Provide those values only that you want to update.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-06-29T15:24:02.444-07:00")
public class AutoscalingOptionsUpdateRequest  {

  /**
   * Minimum number of available compute groups. Zero means, the minClusters will not be updated.
   **/
  private Integer minClusters = 0;

  /**
   * Maximum number of available compute groups. Zero means, the maxClusters will not be updated..
   **/
  private Integer maxClusters = 0;

  /**
   * Getter for minClusters.
   * Minimum number of available compute groups. Zero means, the minClusters will not be updated.
   **/
  @JsonProperty("minClusters")
  public Integer getMinClusters() {
    return minClusters;
  }

  /**
   * Setter for minClusters.
   * Minimum number of available compute groups. Zero means, the minClusters will not be updated.
   **/
  public void setMinClusters(Integer minClusters) {
    this.minClusters = minClusters;
  }

  /**
   * Getter for maxClusters.
   * Maximum number of available compute groups. Zero means, the maxClusters will not be updated..
   **/
  @JsonProperty("maxClusters")
  public Integer getMaxClusters() {
    return maxClusters;
  }

  /**
   * Setter for maxClusters.
   * Maximum number of available compute groups. Zero means, the maxClusters will not be updated..
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
    AutoscalingOptionsUpdateRequest autoscalingOptionsUpdateRequest = (AutoscalingOptionsUpdateRequest) o;
    if (!Objects.equals(this.minClusters, autoscalingOptionsUpdateRequest.minClusters)) {
      return false;
    }
    if (!Objects.equals(this.maxClusters, autoscalingOptionsUpdateRequest.maxClusters)) {
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
    sb.append("class AutoscalingOptionsUpdateRequest {\n");
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

