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
 * Request object to stop instances of a host group on a Data Hub.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-29T08:54:17.636-07:00")
public class StopInstancesRequest  {

  /**
   * The name or CRN of the cluster whose instances are to be stopped.
   **/
  private String cluster = null;

  /**
   * The list of instance IDs.
   **/
  private List<String> instanceIds = new ArrayList<String>();

  /**
   * Whether the stop instances operation should be forced or not. Defaults to false.
   **/
  private Boolean forced = null;

  /**
   * Getter for cluster.
   * The name or CRN of the cluster whose instances are to be stopped.
   **/
  @JsonProperty("cluster")
  public String getCluster() {
    return cluster;
  }

  /**
   * Setter for cluster.
   * The name or CRN of the cluster whose instances are to be stopped.
   **/
  public void setCluster(String cluster) {
    this.cluster = cluster;
  }

  /**
   * Getter for instanceIds.
   * The list of instance IDs.
   **/
  @JsonProperty("instanceIds")
  public List<String> getInstanceIds() {
    return instanceIds;
  }

  /**
   * Setter for instanceIds.
   * The list of instance IDs.
   **/
  public void setInstanceIds(List<String> instanceIds) {
    this.instanceIds = instanceIds;
  }

  /**
   * Getter for forced.
   * Whether the stop instances operation should be forced or not. Defaults to false.
   **/
  @JsonProperty("forced")
  public Boolean getForced() {
    return forced;
  }

  /**
   * Setter for forced.
   * Whether the stop instances operation should be forced or not. Defaults to false.
   **/
  public void setForced(Boolean forced) {
    this.forced = forced;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopInstancesRequest stopInstancesRequest = (StopInstancesRequest) o;
    if (!Objects.equals(this.cluster, stopInstancesRequest.cluster)) {
      return false;
    }
    if (!Objects.equals(this.instanceIds, stopInstancesRequest.instanceIds)) {
      return false;
    }
    if (!Objects.equals(this.forced, stopInstancesRequest.forced)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, instanceIds, forced);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopInstancesRequest {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
    sb.append("    forced: ").append(toIndentedString(forced)).append("\n");
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

