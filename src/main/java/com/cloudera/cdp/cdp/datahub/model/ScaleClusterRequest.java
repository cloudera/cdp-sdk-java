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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Request object for scale cluster request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:39.671-07:00")
public class ScaleClusterRequest  {

  /**
   * The name or CRN of the cluster to be scaled.
   **/
  private String clusterName = null;

  /**
   * The name of the instance group which needs to be scaled.
   **/
  private String instanceGroupName = null;

  /**
   * The desired number of instances in the instance group.
   **/
  private Integer instanceGroupDesiredCount = null;

  /**
   * The preferred subnet IDs for the scaling cluster (only for AWS).
   **/
  private List<String> preferredSubnetIds = new ArrayList<String>();

  /**
   * The preferred zones for the scaling cluster (only for Azure and Google Cloud).
   **/
  private List<String> preferredZones = new ArrayList<String>();

  /**
   * Getter for clusterName.
   * The name or CRN of the cluster to be scaled.
   **/
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }

  /**
   * Setter for clusterName.
   * The name or CRN of the cluster to be scaled.
   **/
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  /**
   * Getter for instanceGroupName.
   * The name of the instance group which needs to be scaled.
   **/
  @JsonProperty("instanceGroupName")
  public String getInstanceGroupName() {
    return instanceGroupName;
  }

  /**
   * Setter for instanceGroupName.
   * The name of the instance group which needs to be scaled.
   **/
  public void setInstanceGroupName(String instanceGroupName) {
    this.instanceGroupName = instanceGroupName;
  }

  /**
   * Getter for instanceGroupDesiredCount.
   * The desired number of instances in the instance group.
   **/
  @JsonProperty("instanceGroupDesiredCount")
  public Integer getInstanceGroupDesiredCount() {
    return instanceGroupDesiredCount;
  }

  /**
   * Setter for instanceGroupDesiredCount.
   * The desired number of instances in the instance group.
   **/
  public void setInstanceGroupDesiredCount(Integer instanceGroupDesiredCount) {
    this.instanceGroupDesiredCount = instanceGroupDesiredCount;
  }

  /**
   * Getter for preferredSubnetIds.
   * The preferred subnet IDs for the scaling cluster (only for AWS).
   **/
  @JsonProperty("preferredSubnetIds")
  public List<String> getPreferredSubnetIds() {
    return preferredSubnetIds;
  }

  /**
   * Setter for preferredSubnetIds.
   * The preferred subnet IDs for the scaling cluster (only for AWS).
   **/
  public void setPreferredSubnetIds(List<String> preferredSubnetIds) {
    this.preferredSubnetIds = preferredSubnetIds;
  }

  /**
   * Getter for preferredZones.
   * The preferred zones for the scaling cluster (only for Azure and Google Cloud).
   **/
  @JsonProperty("preferredZones")
  public List<String> getPreferredZones() {
    return preferredZones;
  }

  /**
   * Setter for preferredZones.
   * The preferred zones for the scaling cluster (only for Azure and Google Cloud).
   **/
  public void setPreferredZones(List<String> preferredZones) {
    this.preferredZones = preferredZones;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScaleClusterRequest scaleClusterRequest = (ScaleClusterRequest) o;
    if (!Objects.equals(this.clusterName, scaleClusterRequest.clusterName)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroupName, scaleClusterRequest.instanceGroupName)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroupDesiredCount, scaleClusterRequest.instanceGroupDesiredCount)) {
      return false;
    }
    if (!Objects.equals(this.preferredSubnetIds, scaleClusterRequest.preferredSubnetIds)) {
      return false;
    }
    if (!Objects.equals(this.preferredZones, scaleClusterRequest.preferredZones)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterName, instanceGroupName, instanceGroupDesiredCount, preferredSubnetIds, preferredZones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScaleClusterRequest {\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    instanceGroupName: ").append(toIndentedString(instanceGroupName)).append("\n");
    sb.append("    instanceGroupDesiredCount: ").append(toIndentedString(instanceGroupDesiredCount)).append("\n");
    sb.append("    preferredSubnetIds: ").append(toIndentedString(preferredSubnetIds)).append("\n");
    sb.append("    preferredZones: ").append(toIndentedString(preferredZones)).append("\n");
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

