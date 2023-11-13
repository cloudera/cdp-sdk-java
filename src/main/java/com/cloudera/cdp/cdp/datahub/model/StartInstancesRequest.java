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

/**
 * Request object to start instances of a host group on a Data Hub.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-11-09T15:08:27.392-08:00")
public class StartInstancesRequest  {

  /**
   * The name or CRN of the cluster whose instances are to be started.
   **/
  private String cluster = null;

  /**
   * The name of the instance group whose instances are to be started.
   **/
  private String hostGroup = null;

  /**
   * The number of instances to start.
   **/
  private Integer instanceCount = null;

  /**
   * Getter for cluster.
   * The name or CRN of the cluster whose instances are to be started.
   **/
  @JsonProperty("cluster")
  public String getCluster() {
    return cluster;
  }

  /**
   * Setter for cluster.
   * The name or CRN of the cluster whose instances are to be started.
   **/
  public void setCluster(String cluster) {
    this.cluster = cluster;
  }

  /**
   * Getter for hostGroup.
   * The name of the instance group whose instances are to be started.
   **/
  @JsonProperty("hostGroup")
  public String getHostGroup() {
    return hostGroup;
  }

  /**
   * Setter for hostGroup.
   * The name of the instance group whose instances are to be started.
   **/
  public void setHostGroup(String hostGroup) {
    this.hostGroup = hostGroup;
  }

  /**
   * Getter for instanceCount.
   * The number of instances to start.
   **/
  @JsonProperty("instanceCount")
  public Integer getInstanceCount() {
    return instanceCount;
  }

  /**
   * Setter for instanceCount.
   * The number of instances to start.
   **/
  public void setInstanceCount(Integer instanceCount) {
    this.instanceCount = instanceCount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartInstancesRequest startInstancesRequest = (StartInstancesRequest) o;
    if (!Objects.equals(this.cluster, startInstancesRequest.cluster)) {
      return false;
    }
    if (!Objects.equals(this.hostGroup, startInstancesRequest.hostGroup)) {
      return false;
    }
    if (!Objects.equals(this.instanceCount, startInstancesRequest.instanceCount)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, hostGroup, instanceCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartInstancesRequest {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    hostGroup: ").append(toIndentedString(hostGroup)).append("\n");
    sb.append("    instanceCount: ").append(toIndentedString(instanceCount)).append("\n");
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

