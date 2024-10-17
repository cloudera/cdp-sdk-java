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
 * Request object for deleting multiple instance from a cluster
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-10-16T16:58:49.129-07:00")
public class DeleteInstancesRequest  {

  /**
   * The name or CRN of the cluster for which instances are to be deleted.
   **/
  private String clusterName = null;

  /**
   * The instanceIds to be deleted from the cluster.
   **/
  private List<String> instanceIds = new ArrayList<String>();

  /**
   * Whether the termination would be forced or not. If it is true, the termination would not be stopped by other - usually blocking - circumstances. Defaults to false.
   **/
  private Boolean force = null;

  /**
   * Getter for clusterName.
   * The name or CRN of the cluster for which instances are to be deleted.
   **/
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }

  /**
   * Setter for clusterName.
   * The name or CRN of the cluster for which instances are to be deleted.
   **/
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  /**
   * Getter for instanceIds.
   * The instanceIds to be deleted from the cluster.
   **/
  @JsonProperty("instanceIds")
  public List<String> getInstanceIds() {
    return instanceIds;
  }

  /**
   * Setter for instanceIds.
   * The instanceIds to be deleted from the cluster.
   **/
  public void setInstanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
  }

  /**
   * Getter for force.
   * Whether the termination would be forced or not. If it is true, the termination would not be stopped by other - usually blocking - circumstances. Defaults to false.
   **/
  @JsonProperty("force")
  public Boolean getForce() {
    return force;
  }

  /**
   * Setter for force.
   * Whether the termination would be forced or not. If it is true, the termination would not be stopped by other - usually blocking - circumstances. Defaults to false.
   **/
  public void setForce(Boolean force) {
    this.force = force;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteInstancesRequest deleteInstancesRequest = (DeleteInstancesRequest) o;
    if (!Objects.equals(this.clusterName, deleteInstancesRequest.clusterName)) {
      return false;
    }
    if (!Objects.equals(this.instanceIds, deleteInstancesRequest.instanceIds)) {
      return false;
    }
    if (!Objects.equals(this.force, deleteInstancesRequest.force)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterName, instanceIds, force);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteInstancesRequest {\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
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

