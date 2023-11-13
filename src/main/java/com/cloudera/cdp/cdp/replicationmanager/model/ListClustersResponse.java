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

package com.cloudera.cdp.replicationmanager.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.replicationmanager.model.ApiError;
import com.cloudera.cdp.replicationmanager.model.Cluster;
import java.util.*;

/**
 * Response object for list clusters request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-11-09T15:08:31.393-08:00")
public class ListClustersResponse extends CdpResponse {

  /**
   * List of errors for unreachable clusters.
   **/
  private List<ApiError> unreachableClusters = new ArrayList<ApiError>();

  /**
   * List of clusters.
   **/
  private List<Cluster> clusters = new ArrayList<Cluster>();

  /**
   * Getter for unreachableClusters.
   * List of errors for unreachable clusters.
   **/
  @JsonProperty("unreachableClusters")
  public List<ApiError> getUnreachableClusters() {
    return unreachableClusters;
  }

  /**
   * Setter for unreachableClusters.
   * List of errors for unreachable clusters.
   **/
  public void setUnreachableClusters(List<ApiError> unreachableClusters) {
    this.unreachableClusters = unreachableClusters;
  }

  /**
   * Getter for clusters.
   * List of clusters.
   **/
  @JsonProperty("clusters")
  public List<Cluster> getClusters() {
    return clusters;
  }

  /**
   * Setter for clusters.
   * List of clusters.
   **/
  public void setClusters(List<Cluster> clusters) {
    this.clusters = clusters;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListClustersResponse listClustersResponse = (ListClustersResponse) o;
    if (!Objects.equals(this.unreachableClusters, listClustersResponse.unreachableClusters)) {
      return false;
    }
    if (!Objects.equals(this.clusters, listClustersResponse.clusters)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(unreachableClusters, clusters, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListClustersResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    unreachableClusters: ").append(toIndentedString(unreachableClusters)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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

