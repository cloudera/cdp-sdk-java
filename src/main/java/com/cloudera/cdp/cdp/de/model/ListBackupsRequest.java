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

package com.cloudera.cdp.de.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Request object for List Backups command.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-08-02T09:36:51.006-07:00")
public class ListBackupsRequest  {

  /**
   * Whether ordering is ascending ('ASC') or descending ('DESC'), default 'DESC'.
   **/
  private String order = null;

  /**
   * The 'fieldname' to order by, default \"id\". Here 'fieldname' is one of ('id', 'clusterID', 'cdeVersion', 'environment', 'environmentCrn', 'created', 'status').
   **/
  private String orderBy = "id";

  /**
   * Filter backups using 'fieldname(operator)argument' syntax. Here 'fieldname' is one of ('id', 'clusterID', 'cdeVersion', 'environment', 'environmentCrn', 'created', 'status') and 'operator' is one of ('eq', 'noteq', 'lte', 'lt', 'gte', 'gt', 'in', 'notin', 'like', 'rlike', 'is', 'isnot'). Multiple filters are ANDed. For example, 'status(eq)failed'.
   **/
  private List<String> filter = new ArrayList<String>();

  /**
   * The size of each page.
   **/
  private Integer pageSize = null;

  /**
   * A token to specify where to start paginating. This is the nextToken from a previously truncated response.
   **/
  private String startingToken = null;

  /**
   * Getter for order.
   * Whether ordering is ascending (&#39;ASC&#39;) or descending (&#39;DESC&#39;), default &#39;DESC&#39;.
   **/
  @JsonProperty("order")
  public String getOrder() {
    return order;
  }

  /**
   * Setter for order.
   * Whether ordering is ascending (&#39;ASC&#39;) or descending (&#39;DESC&#39;), default &#39;DESC&#39;.
   **/
  public void setOrder(String order) {
    this.order = order;
  }

  /**
   * Getter for orderBy.
   * The &#39;fieldname&#39; to order by, default \&quot;id\&quot;. Here &#39;fieldname&#39; is one of (&#39;id&#39;, &#39;clusterID&#39;, &#39;cdeVersion&#39;, &#39;environment&#39;, &#39;environmentCrn&#39;, &#39;created&#39;, &#39;status&#39;).
   **/
  @JsonProperty("orderBy")
  public String getOrderBy() {
    return orderBy;
  }

  /**
   * Setter for orderBy.
   * The &#39;fieldname&#39; to order by, default \&quot;id\&quot;. Here &#39;fieldname&#39; is one of (&#39;id&#39;, &#39;clusterID&#39;, &#39;cdeVersion&#39;, &#39;environment&#39;, &#39;environmentCrn&#39;, &#39;created&#39;, &#39;status&#39;).
   **/
  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }

  /**
   * Getter for filter.
   * Filter backups using &#39;fieldname(operator)argument&#39; syntax. Here &#39;fieldname&#39; is one of (&#39;id&#39;, &#39;clusterID&#39;, &#39;cdeVersion&#39;, &#39;environment&#39;, &#39;environmentCrn&#39;, &#39;created&#39;, &#39;status&#39;) and &#39;operator&#39; is one of (&#39;eq&#39;, &#39;noteq&#39;, &#39;lte&#39;, &#39;lt&#39;, &#39;gte&#39;, &#39;gt&#39;, &#39;in&#39;, &#39;notin&#39;, &#39;like&#39;, &#39;rlike&#39;, &#39;is&#39;, &#39;isnot&#39;). Multiple filters are ANDed. For example, &#39;status(eq)failed&#39;.
   **/
  @JsonProperty("filter")
  public List<String> getFilter() {
    return filter;
  }

  /**
   * Setter for filter.
   * Filter backups using &#39;fieldname(operator)argument&#39; syntax. Here &#39;fieldname&#39; is one of (&#39;id&#39;, &#39;clusterID&#39;, &#39;cdeVersion&#39;, &#39;environment&#39;, &#39;environmentCrn&#39;, &#39;created&#39;, &#39;status&#39;) and &#39;operator&#39; is one of (&#39;eq&#39;, &#39;noteq&#39;, &#39;lte&#39;, &#39;lt&#39;, &#39;gte&#39;, &#39;gt&#39;, &#39;in&#39;, &#39;notin&#39;, &#39;like&#39;, &#39;rlike&#39;, &#39;is&#39;, &#39;isnot&#39;). Multiple filters are ANDed. For example, &#39;status(eq)failed&#39;.
   **/
  public void setFilter(List<String> filter) {
    this.filter = filter;
  }

  /**
   * Getter for pageSize.
   * The size of each page.
   **/
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  /**
   * Setter for pageSize.
   * The size of each page.
   **/
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  /**
   * Getter for startingToken.
   * A token to specify where to start paginating. This is the nextToken from a previously truncated response.
   **/
  @JsonProperty("startingToken")
  public String getStartingToken() {
    return startingToken;
  }

  /**
   * Setter for startingToken.
   * A token to specify where to start paginating. This is the nextToken from a previously truncated response.
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
    ListBackupsRequest listBackupsRequest = (ListBackupsRequest) o;
    if (!Objects.equals(this.order, listBackupsRequest.order)) {
      return false;
    }
    if (!Objects.equals(this.orderBy, listBackupsRequest.orderBy)) {
      return false;
    }
    if (!Objects.equals(this.filter, listBackupsRequest.filter)) {
      return false;
    }
    if (!Objects.equals(this.pageSize, listBackupsRequest.pageSize)) {
      return false;
    }
    if (!Objects.equals(this.startingToken, listBackupsRequest.startingToken)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, orderBy, filter, pageSize, startingToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBackupsRequest {\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

