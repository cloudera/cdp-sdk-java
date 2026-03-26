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
 * A request to list event history for deployment.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-25T09:53:07.561-07:00")
public class ListDeploymentEventsRequest  {

  /**
   * The deployment CRN.
   **/
  private String deploymentCrn = null;

  /**
   * This field is deprecated and will be removed. Use max-items instead. Historically used to set the number of elements to return. Note that if max-items is also specified, and rows is less than max-items, an error will be returned.
   **/
  private Integer rows = null;

  /**
   * Timestamp from when to list events prior.
   **/
  private Long timestampFrom = null;

  /**
   * Filter criteria (see list-filter-options).
   **/
  private List<String> filters = new ArrayList<String>();

  /**
   * The page size.
   **/
  private Integer pageSize = null;

  /**
   * The token pointing to the next element to be retrieved.
   **/
  private String startingToken = null;

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
   * Getter for rows.
   * This field is deprecated and will be removed. Use max-items instead. Historically used to set the number of elements to return. Note that if max-items is also specified, and rows is less than max-items, an error will be returned.
   **/
  @Deprecated
  @JsonProperty("rows")
  public Integer getRows() {
    return rows;
  }

  /**
   * Setter for rows.
   * This field is deprecated and will be removed. Use max-items instead. Historically used to set the number of elements to return. Note that if max-items is also specified, and rows is less than max-items, an error will be returned.
   **/
  @Deprecated
  public void setRows(Integer rows) {
    this.rows = rows;
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDeploymentEventsRequest listDeploymentEventsRequest = (ListDeploymentEventsRequest) o;
    if (!Objects.equals(this.deploymentCrn, listDeploymentEventsRequest.deploymentCrn)) {
      return false;
    }
    if (!Objects.equals(this.rows, listDeploymentEventsRequest.rows)) {
      return false;
    }
    if (!Objects.equals(this.timestampFrom, listDeploymentEventsRequest.timestampFrom)) {
      return false;
    }
    if (!Objects.equals(this.filters, listDeploymentEventsRequest.filters)) {
      return false;
    }
    if (!Objects.equals(this.pageSize, listDeploymentEventsRequest.pageSize)) {
      return false;
    }
    if (!Objects.equals(this.startingToken, listDeploymentEventsRequest.startingToken)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentCrn, rows, timestampFrom, filters, pageSize, startingToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDeploymentEventsRequest {\n");
    sb.append("    deploymentCrn: ").append(toIndentedString(deploymentCrn)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    timestampFrom: ").append(toIndentedString(timestampFrom)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    startingToken: ").append(toIndentedString(startingToken)).append("\n");
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

