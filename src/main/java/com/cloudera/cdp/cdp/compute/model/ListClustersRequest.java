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

/**
 * Request object to list clusters.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-12-01T13:59:43.180-08:00")
public class ListClustersRequest  {

  /**
   * Environment name or crn.
   **/
  private String envNameOrCrn = null;

  /**
   * Workloads for workload filtering.
   **/
  private String workloads = null;

  /**
   * Cluster Status for status filtering.
   **/
  private String status = null;

  /**
   * The size of each page. Default is 100.
   **/
  private Integer pageSize = 100;

  /**
   * A token to specify where to start paginating. This is the nextToken from a previously truncated response. 1 or empty for first page.
   **/
  private String startingToken = null;

  /**
   * Include deleted clusters in the response. Optional.
   **/
  private Boolean includeDeleted = false;

  /**
   * Getter for envNameOrCrn.
   * Environment name or crn.
   **/
  @JsonProperty("envNameOrCrn")
  public String getEnvNameOrCrn() {
    return envNameOrCrn;
  }

  /**
   * Setter for envNameOrCrn.
   * Environment name or crn.
   **/
  public void setEnvNameOrCrn(String envNameOrCrn) {
    this.envNameOrCrn = envNameOrCrn;
  }

  /**
   * Getter for workloads.
   * Workloads for workload filtering.
   **/
  @JsonProperty("workloads")
  public String getWorkloads() {
    return workloads;
  }

  /**
   * Setter for workloads.
   * Workloads for workload filtering.
   **/
  public void setWorkloads(String workloads) {
    this.workloads = workloads;
  }

  /**
   * Getter for status.
   * Cluster Status for status filtering.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Cluster Status for status filtering.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for pageSize.
   * The size of each page. Default is 100.
   **/
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  /**
   * Setter for pageSize.
   * The size of each page. Default is 100.
   **/
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  /**
   * Getter for startingToken.
   * A token to specify where to start paginating. This is the nextToken from a previously truncated response. 1 or empty for first page.
   **/
  @JsonProperty("startingToken")
  public String getStartingToken() {
    return startingToken;
  }

  /**
   * Setter for startingToken.
   * A token to specify where to start paginating. This is the nextToken from a previously truncated response. 1 or empty for first page.
   **/
  public void setStartingToken(String startingToken) {
    this.startingToken = startingToken;
  }

  /**
   * Getter for includeDeleted.
   * Include deleted clusters in the response. Optional.
   **/
  @JsonProperty("includeDeleted")
  public Boolean getIncludeDeleted() {
    return includeDeleted;
  }

  /**
   * Setter for includeDeleted.
   * Include deleted clusters in the response. Optional.
   **/
  public void setIncludeDeleted(Boolean includeDeleted) {
    this.includeDeleted = includeDeleted;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListClustersRequest listClustersRequest = (ListClustersRequest) o;
    if (!Objects.equals(this.envNameOrCrn, listClustersRequest.envNameOrCrn)) {
      return false;
    }
    if (!Objects.equals(this.workloads, listClustersRequest.workloads)) {
      return false;
    }
    if (!Objects.equals(this.status, listClustersRequest.status)) {
      return false;
    }
    if (!Objects.equals(this.pageSize, listClustersRequest.pageSize)) {
      return false;
    }
    if (!Objects.equals(this.startingToken, listClustersRequest.startingToken)) {
      return false;
    }
    if (!Objects.equals(this.includeDeleted, listClustersRequest.includeDeleted)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(envNameOrCrn, workloads, status, pageSize, startingToken, includeDeleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListClustersRequest {\n");
    sb.append("    envNameOrCrn: ").append(toIndentedString(envNameOrCrn)).append("\n");
    sb.append("    workloads: ").append(toIndentedString(workloads)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    startingToken: ").append(toIndentedString(startingToken)).append("\n");
    sb.append("    includeDeleted: ").append(toIndentedString(includeDeleted)).append("\n");
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

