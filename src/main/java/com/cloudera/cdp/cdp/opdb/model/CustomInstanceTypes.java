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

package com.cloudera.cdp.opdb.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Custom VM Instance Types.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-15T17:00:47.320-07:00")
public class CustomInstanceTypes  {

  /**
   * Master VM Instance Type.
   **/
  private String masterType = null;

  /**
   * Worker VM Instance Type.
   **/
  private String workerType = null;

  /**
   * Gateway VM Instance Type.
   **/
  private String gatewayType = null;

  /**
   * Leader VM Instance Type.
   **/
  private String leaderType = null;

  /**
   * Edge VM Instance Type.
   **/
  private String edgeType = null;

  /**
   * Compute VM Instance Type.
   **/
  private String computeType = null;

  /**
   * Getter for masterType.
   * Master VM Instance Type.
   **/
  @JsonProperty("masterType")
  public String getMasterType() {
    return masterType;
  }

  /**
   * Setter for masterType.
   * Master VM Instance Type.
   **/
  public void setMasterType(String masterType) {
    this.masterType = masterType;
  }

  /**
   * Getter for workerType.
   * Worker VM Instance Type.
   **/
  @JsonProperty("workerType")
  public String getWorkerType() {
    return workerType;
  }

  /**
   * Setter for workerType.
   * Worker VM Instance Type.
   **/
  public void setWorkerType(String workerType) {
    this.workerType = workerType;
  }

  /**
   * Getter for gatewayType.
   * Gateway VM Instance Type.
   **/
  @JsonProperty("gatewayType")
  public String getGatewayType() {
    return gatewayType;
  }

  /**
   * Setter for gatewayType.
   * Gateway VM Instance Type.
   **/
  public void setGatewayType(String gatewayType) {
    this.gatewayType = gatewayType;
  }

  /**
   * Getter for leaderType.
   * Leader VM Instance Type.
   **/
  @JsonProperty("leaderType")
  public String getLeaderType() {
    return leaderType;
  }

  /**
   * Setter for leaderType.
   * Leader VM Instance Type.
   **/
  public void setLeaderType(String leaderType) {
    this.leaderType = leaderType;
  }

  /**
   * Getter for edgeType.
   * Edge VM Instance Type.
   **/
  @JsonProperty("edgeType")
  public String getEdgeType() {
    return edgeType;
  }

  /**
   * Setter for edgeType.
   * Edge VM Instance Type.
   **/
  public void setEdgeType(String edgeType) {
    this.edgeType = edgeType;
  }

  /**
   * Getter for computeType.
   * Compute VM Instance Type.
   **/
  @JsonProperty("computeType")
  public String getComputeType() {
    return computeType;
  }

  /**
   * Setter for computeType.
   * Compute VM Instance Type.
   **/
  public void setComputeType(String computeType) {
    this.computeType = computeType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomInstanceTypes customInstanceTypes = (CustomInstanceTypes) o;
    if (!Objects.equals(this.masterType, customInstanceTypes.masterType)) {
      return false;
    }
    if (!Objects.equals(this.workerType, customInstanceTypes.workerType)) {
      return false;
    }
    if (!Objects.equals(this.gatewayType, customInstanceTypes.gatewayType)) {
      return false;
    }
    if (!Objects.equals(this.leaderType, customInstanceTypes.leaderType)) {
      return false;
    }
    if (!Objects.equals(this.edgeType, customInstanceTypes.edgeType)) {
      return false;
    }
    if (!Objects.equals(this.computeType, customInstanceTypes.computeType)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(masterType, workerType, gatewayType, leaderType, edgeType, computeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomInstanceTypes {\n");
    sb.append("    masterType: ").append(toIndentedString(masterType)).append("\n");
    sb.append("    workerType: ").append(toIndentedString(workerType)).append("\n");
    sb.append("    gatewayType: ").append(toIndentedString(gatewayType)).append("\n");
    sb.append("    leaderType: ").append(toIndentedString(leaderType)).append("\n");
    sb.append("    edgeType: ").append(toIndentedString(edgeType)).append("\n");
    sb.append("    computeType: ").append(toIndentedString(computeType)).append("\n");
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

