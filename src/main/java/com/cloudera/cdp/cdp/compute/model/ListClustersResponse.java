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

package com.cloudera.cdp.compute.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.compute.model.ListClusterItem;
import java.util.*;

/**
 * List clusters response.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-14T06:50:09.511-08:00")
public class ListClustersResponse extends CdpResponse {

  /**
   * Array of CDP compute clusters.
   **/
  private List<ListClusterItem> clusters = new ArrayList<ListClusterItem>();

  /**
   * The token to use when requesting the next set of results. If not present, there are no additional results.
   **/
  private String nextToken = null;

  /**
   * Total number of clusters.
   **/
  private Integer totalClusters = null;

  /**
   * Total number of pages.
   **/
  private Integer totalPages = null;

  /**
   * Getter for clusters.
   * Array of CDP compute clusters.
   **/
  @JsonProperty("clusters")
  public List<ListClusterItem> getClusters() {
    return clusters;
  }

  /**
   * Setter for clusters.
   * Array of CDP compute clusters.
   **/
  public void setClusters(List<ListClusterItem> clusters) {
    this.clusters = clusters;
  }

  /**
   * Getter for nextToken.
   * The token to use when requesting the next set of results. If not present, there are no additional results.
   **/
  @JsonProperty("nextToken")
  public String getNextToken() {
    return nextToken;
  }

  /**
   * Setter for nextToken.
   * The token to use when requesting the next set of results. If not present, there are no additional results.
   **/
  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  /**
   * Getter for totalClusters.
   * Total number of clusters.
   **/
  @JsonProperty("totalClusters")
  public Integer getTotalClusters() {
    return totalClusters;
  }

  /**
   * Setter for totalClusters.
   * Total number of clusters.
   **/
  public void setTotalClusters(Integer totalClusters) {
    this.totalClusters = totalClusters;
  }

  /**
   * Getter for totalPages.
   * Total number of pages.
   **/
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }

  /**
   * Setter for totalPages.
   * Total number of pages.
   **/
  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
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
    if (!Objects.equals(this.clusters, listClustersResponse.clusters)) {
      return false;
    }
    if (!Objects.equals(this.nextToken, listClustersResponse.nextToken)) {
      return false;
    }
    if (!Objects.equals(this.totalClusters, listClustersResponse.totalClusters)) {
      return false;
    }
    if (!Objects.equals(this.totalPages, listClustersResponse.totalPages)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusters, nextToken, totalClusters, totalPages, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListClustersResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    totalClusters: ").append(toIndentedString(totalClusters)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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

