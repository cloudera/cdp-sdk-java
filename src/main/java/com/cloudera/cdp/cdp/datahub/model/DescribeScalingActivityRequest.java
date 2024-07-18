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
 * Request object for describing a particular scaling activity using clusterCrn or clusterName and operationId.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-07-18T14:59:52.786-07:00")
public class DescribeScalingActivityRequest  {

  /**
   * The name or CRN of the cluster.
   **/
  private String cluster = null;

  /**
   * Operation ID of the scaling activity.
   **/
  private String operationId = null;

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
   * Getter for operationId.
   * Operation ID of the scaling activity.
   **/
  @JsonProperty("operationId")
  public String getOperationId() {
    return operationId;
  }

  /**
   * Setter for operationId.
   * Operation ID of the scaling activity.
   **/
  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeScalingActivityRequest describeScalingActivityRequest = (DescribeScalingActivityRequest) o;
    if (!Objects.equals(this.cluster, describeScalingActivityRequest.cluster)) {
      return false;
    }
    if (!Objects.equals(this.operationId, describeScalingActivityRequest.operationId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, operationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeScalingActivityRequest {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
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

