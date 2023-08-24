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
 * Request object for ListServiceEvents
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-08-24T14:47:24.414-07:00")
public class ListServiceEventsRequest  {

  /**
   * The service CRN
   **/
  private String serviceCrn = null;

  /**
   * Max number of rows to return
   **/
  private Integer rows = null;

  /**
   * Timestamp from when to list events prior
   **/
  private Long timestampFrom = null;

  /**
   * Filter criteria
   **/
  private List<String> filters = new ArrayList<String>();

  /**
   * Getter for serviceCrn.
   * The service CRN
   **/
  @JsonProperty("serviceCrn")
  public String getServiceCrn() {
    return serviceCrn;
  }

  /**
   * Setter for serviceCrn.
   * The service CRN
   **/
  public void setServiceCrn(String serviceCrn) {
    this.serviceCrn = serviceCrn;
  }

  /**
   * Getter for rows.
   * Max number of rows to return
   **/
  @JsonProperty("rows")
  public Integer getRows() {
    return rows;
  }

  /**
   * Setter for rows.
   * Max number of rows to return
   **/
  public void setRows(Integer rows) {
    this.rows = rows;
  }

  /**
   * Getter for timestampFrom.
   * Timestamp from when to list events prior
   **/
  @JsonProperty("timestampFrom")
  public Long getTimestampFrom() {
    return timestampFrom;
  }

  /**
   * Setter for timestampFrom.
   * Timestamp from when to list events prior
   **/
  public void setTimestampFrom(Long timestampFrom) {
    this.timestampFrom = timestampFrom;
  }

  /**
   * Getter for filters.
   * Filter criteria
   **/
  @JsonProperty("filters")
  public List<String> getFilters() {
    return filters;
  }

  /**
   * Setter for filters.
   * Filter criteria
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
    ListServiceEventsRequest listServiceEventsRequest = (ListServiceEventsRequest) o;
    if (!Objects.equals(this.serviceCrn, listServiceEventsRequest.serviceCrn)) {
      return false;
    }
    if (!Objects.equals(this.rows, listServiceEventsRequest.rows)) {
      return false;
    }
    if (!Objects.equals(this.timestampFrom, listServiceEventsRequest.timestampFrom)) {
      return false;
    }
    if (!Objects.equals(this.filters, listServiceEventsRequest.filters)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceCrn, rows, timestampFrom, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListServiceEventsRequest {\n");
    sb.append("    serviceCrn: ").append(toIndentedString(serviceCrn)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

