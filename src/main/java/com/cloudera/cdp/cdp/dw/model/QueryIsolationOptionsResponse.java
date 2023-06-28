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
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-06-28T12:35:40.477-07:00")
public class QueryIsolationOptionsResponse extends CdpResponse {

  /**
   * Maximum Concurrent Isolated Queries
   **/
  private Integer maxQueries = null;

  /**
   * Maximum Nodes Per Isolated Query
   **/
  private Integer maxNodesPerQuery = null;

  /**
   * Getter for maxQueries.
   * Maximum Concurrent Isolated Queries
   **/
  @JsonProperty("maxQueries")
  public Integer getMaxQueries() {
    return maxQueries;
  }

  /**
   * Setter for maxQueries.
   * Maximum Concurrent Isolated Queries
   **/
  public void setMaxQueries(Integer maxQueries) {
    this.maxQueries = maxQueries;
  }

  /**
   * Getter for maxNodesPerQuery.
   * Maximum Nodes Per Isolated Query
   **/
  @JsonProperty("maxNodesPerQuery")
  public Integer getMaxNodesPerQuery() {
    return maxNodesPerQuery;
  }

  /**
   * Setter for maxNodesPerQuery.
   * Maximum Nodes Per Isolated Query
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
    QueryIsolationOptionsResponse queryIsolationOptionsResponse = (QueryIsolationOptionsResponse) o;
    if (!Objects.equals(this.maxQueries, queryIsolationOptionsResponse.maxQueries)) {
      return false;
    }
    if (!Objects.equals(this.maxNodesPerQuery, queryIsolationOptionsResponse.maxNodesPerQuery)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxQueries, maxNodesPerQuery, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryIsolationOptionsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

