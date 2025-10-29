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
 * Request object for restart cluster instances request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-28T14:00:25.843-07:00")
public class RestartClusterInstancesRequest  {

  /**
   * The name or CRN of the cluster.
   **/
  private String cluster = null;

  /**
   * List of instance ids.
   **/
  private List<String> instances = new ArrayList<String>();

  /**
   * Getter for cluster.
   * The name or CRN of the cluster.
   **/
  @JsonProperty("cluster")
  public String getCluster() {
    return cluster;
  }

  /**
   * Setter for cluster.
   * The name or CRN of the cluster.
   **/
  public void setCluster(String cluster) {
    this.cluster = cluster;
  }

  /**
   * Getter for instances.
   * List of instance ids.
   **/
  @JsonProperty("instances")
  public List<String> getInstances() {
    return instances;
  }

  /**
   * Setter for instances.
   * List of instance ids.
   **/
  public void setInstances(List<String> instances) {
    this.instances = instances;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestartClusterInstancesRequest restartClusterInstancesRequest = (RestartClusterInstancesRequest) o;
    if (!Objects.equals(this.cluster, restartClusterInstancesRequest.cluster)) {
      return false;
    }
    if (!Objects.equals(this.instances, restartClusterInstancesRequest.instances)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, instances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestartClusterInstancesRequest {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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

