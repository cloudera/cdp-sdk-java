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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Configurations for Query Isolation.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-01-04T11:10:08.309-08:00")
public class QueryIsolationOptionsRequest  {

  /**
   * Maximum Concurrent Isolated Queries. If not provided, 0 will be applied. The 0 value means the query isoltaion functionality will be disabled.
   **/
  private Integer maxQueries = 0;

  /**
   * Maximum Nodes Per Isolated Query. If not provided, 0 will be applied. The 0 value means the query isoltaion functionality will be disabled.
   **/
  private Integer maxNodesPerQuery = 0;

  /**
   * Getter for maxQueries.
   * Maximum Concurrent Isolated Queries. If not provided, 0 will be applied. The 0 value means the query isoltaion functionality will be disabled.
   **/
  @JsonProperty("maxQueries")
  public Integer getMaxQueries() {
    return maxQueries;
  }

  /**
   * Setter for maxQueries.
   * Maximum Concurrent Isolated Queries. If not provided, 0 will be applied. The 0 value means the query isoltaion functionality will be disabled.
   **/
  public void setMaxQueries(Integer maxQueries) {
    this.maxQueries = maxQueries;
  }

  /**
   * Getter for maxNodesPerQuery.
   * Maximum Nodes Per Isolated Query. If not provided, 0 will be applied. The 0 value means the query isoltaion functionality will be disabled.
   **/
  @JsonProperty("maxNodesPerQuery")
  public Integer getMaxNodesPerQuery() {
    return maxNodesPerQuery;
  }

  /**
   * Setter for maxNodesPerQuery.
   * Maximum Nodes Per Isolated Query. If not provided, 0 will be applied. The 0 value means the query isoltaion functionality will be disabled.
   **/
  public void setMaxNodesPerQuery(Integer maxNodesPerQuery) {
    this.maxNodesPerQuery = maxNodesPerQuery;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryIsolationOptionsRequest queryIsolationOptionsRequest = (QueryIsolationOptionsRequest) o;
    if (!Objects.equals(this.maxQueries, queryIsolationOptionsRequest.maxQueries)) {
      return false;
    }
    if (!Objects.equals(this.maxNodesPerQuery, queryIsolationOptionsRequest.maxNodesPerQuery)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxQueries, maxNodesPerQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryIsolationOptionsRequest {\n");
    sb.append("    maxQueries: ").append(toIndentedString(maxQueries)).append("\n");
    sb.append("    maxNodesPerQuery: ").append(toIndentedString(maxNodesPerQuery)).append("\n");
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

