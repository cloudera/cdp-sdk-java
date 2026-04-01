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

package com.cloudera.cdp.df.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * A request to list flow event history in a deployment.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-31T14:25:33.758-07:00")
public class ListFlowEventsInDeploymentRequest  {

  /**
   * The deployment CRN.
   **/
  private String deploymentCrn = null;

  /**
   * The deployment CRN.
   **/
  private String deployedFlowCrn = null;

  /**
   * The page size.
   **/
  private Integer pageSize = null;

  /**
   * The token pointing to the next element to be retrieved.
   **/
  private String startingToken = null;

  /**
   * Timestamp from when to list events prior.
   **/
  private Long timestampFrom = null;

  /**
   * Filter criteria (see list-filter-options).
   **/
  private List<String> filters = new ArrayList<String>();

  /**
   * Getter for deploymentCrn.
   * The deployment CRN.
   **/
  @JsonProperty("deploymentCrn")
  public String getDeploymentCrn() {
    return deploymentCrn;
  }

  /**
   * Setter for deploymentCrn.
   * The deployment CRN.
   **/
  public void setDeploymentCrn(String deploymentCrn) {
    this.deploymentCrn = deploymentCrn;
  }

  /**
   * Getter for deployedFlowCrn.
   * The deployment CRN.
   **/
  @JsonProperty("deployedFlowCrn")
  public String getDeployedFlowCrn() {
    return deployedFlowCrn;
  }

  /**
   * Setter for deployedFlowCrn.
   * The deployment CRN.
   **/
  public void setDeployedFlowCrn(String deployedFlowCrn) {
    this.deployedFlowCrn = deployedFlowCrn;
  }

  /**
   * Getter for pageSize.
   * The page size.
   **/
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  /**
   * Setter for pageSize.
   * The page size.
   **/
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  /**
   * Getter for startingToken.
   * The token pointing to the next element to be retrieved.
   **/
  @JsonProperty("startingToken")
  public String getStartingToken() {
    return startingToken;
  }

  /**
   * Setter for startingToken.
   * The token pointing to the next element to be retrieved.
   **/
  public void setStartingToken(String startingToken) {
    this.startingToken = startingToken;
  }

  /**
   * Getter for timestampFrom.
   * Timestamp from when to list events prior.
   **/
  @JsonProperty("timestampFrom")
  public Long getTimestampFrom() {
    return timestampFrom;
  }

  /**
   * Setter for timestampFrom.
   * Timestamp from when to list events prior.
   **/
  public void setTimestampFrom(Long timestampFrom) {
    this.timestampFrom = timestampFrom;
  }

  /**
   * Getter for filters.
   * Filter criteria (see list-filter-options).
   **/
  @JsonProperty("filters")
  public List<String> getFilters() {
    return filters;
  }

  /**
   * Setter for filters.
   * Filter criteria (see list-filter-options).
   **/
  public void setFilters(List<String> filters) {
    this.filters = filters;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListFlowEventsInDeploymentRequest listFlowEventsInDeploymentRequest = (ListFlowEventsInDeploymentRequest) o;
    if (!Objects.equals(this.deploymentCrn, listFlowEventsInDeploymentRequest.deploymentCrn)) {
      return false;
    }
    if (!Objects.equals(this.deployedFlowCrn, listFlowEventsInDeploymentRequest.deployedFlowCrn)) {
      return false;
    }
    if (!Objects.equals(this.pageSize, listFlowEventsInDeploymentRequest.pageSize)) {
      return false;
    }
    if (!Objects.equals(this.startingToken, listFlowEventsInDeploymentRequest.startingToken)) {
      return false;
    }
    if (!Objects.equals(this.timestampFrom, listFlowEventsInDeploymentRequest.timestampFrom)) {
      return false;
    }
    if (!Objects.equals(this.filters, listFlowEventsInDeploymentRequest.filters)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentCrn, deployedFlowCrn, pageSize, startingToken, timestampFrom, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFlowEventsInDeploymentRequest {\n");
    sb.append("    deploymentCrn: ").append(toIndentedString(deploymentCrn)).append("\n");
    sb.append("    deployedFlowCrn: ").append(toIndentedString(deployedFlowCrn)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    startingToken: ").append(toIndentedString(startingToken)).append("\n");
    sb.append("    timestampFrom: ").append(toIndentedString(timestampFrom)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

