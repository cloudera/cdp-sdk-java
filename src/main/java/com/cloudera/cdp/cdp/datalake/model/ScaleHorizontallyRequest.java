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

package com.cloudera.cdp.datalake.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Data Lake horizontal scaling request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-23T07:12:40.257-08:00")
public class ScaleHorizontallyRequest  {

  /**
   * The name of the Data Lake
   **/
  private String datalakeName = null;

  /**
   * The target host group name to be scaled.
   **/
  private String instanceGroupName = null;

  /**
   * The target number of the scaling operation. If the desired count is less than the actual node count the scaling action will be a downscale operation.
   **/
  private Integer instanceGroupDesiredCount = null;

  /**
   * Getter for datalakeName.
   * The name of the Data Lake
   **/
  @JsonProperty("datalakeName")
  public String getDatalakeName() {
    return datalakeName;
  }

  /**
   * Setter for datalakeName.
   * The name of the Data Lake
   **/
  public void setDatalakeName(String datalakeName) {
    this.datalakeName = datalakeName;
  }

  /**
   * Getter for instanceGroupName.
   * The target host group name to be scaled.
   **/
  @JsonProperty("instanceGroupName")
  public String getInstanceGroupName() {
    return instanceGroupName;
  }

  /**
   * Setter for instanceGroupName.
   * The target host group name to be scaled.
   **/
  public void setInstanceGroupName(String instanceGroupName) {
    this.instanceGroupName = instanceGroupName;
  }

  /**
   * Getter for instanceGroupDesiredCount.
   * The target number of the scaling operation. If the desired count is less than the actual node count the scaling action will be a downscale operation.
   **/
  @JsonProperty("instanceGroupDesiredCount")
  public Integer getInstanceGroupDesiredCount() {
    return instanceGroupDesiredCount;
  }

  /**
   * Setter for instanceGroupDesiredCount.
   * The target number of the scaling operation. If the desired count is less than the actual node count the scaling action will be a downscale operation.
   **/
  public void setInstanceGroupDesiredCount(Integer instanceGroupDesiredCount) {
    this.instanceGroupDesiredCount = instanceGroupDesiredCount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScaleHorizontallyRequest scaleHorizontallyRequest = (ScaleHorizontallyRequest) o;
    if (!Objects.equals(this.datalakeName, scaleHorizontallyRequest.datalakeName)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroupName, scaleHorizontallyRequest.instanceGroupName)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroupDesiredCount, scaleHorizontallyRequest.instanceGroupDesiredCount)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeName, instanceGroupName, instanceGroupDesiredCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScaleHorizontallyRequest {\n");
    sb.append("    datalakeName: ").append(toIndentedString(datalakeName)).append("\n");
    sb.append("    instanceGroupName: ").append(toIndentedString(instanceGroupName)).append("\n");
    sb.append("    instanceGroupDesiredCount: ").append(toIndentedString(instanceGroupDesiredCount)).append("\n");
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

