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
 * Request object for the ListServices method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-09-03T11:22:10.617-07:00")
public class ListServicesRequest  {

  /**
   * The sort criteria
   **/
  private List<String> sorts = new ArrayList<String>();

  /**
   * The page size.
   **/
  private Integer pageSize = null;

  /**
   * The token pointing to the next element to be retrieved.
   **/
  private String startingToken = null;

  /**
   * Search term to filter by name
   **/
  private String searchTerm = null;

  /**
   * Getter for sorts.
   * The sort criteria
   **/
  @JsonProperty("sorts")
  public List<String> getSorts() {
    return sorts;
  }

  /**
   * Setter for sorts.
   * The sort criteria
   **/
  public void setSorts(List<String> sorts) {
    this.sorts = sorts;
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
   * Getter for searchTerm.
   * Search term to filter by name
   **/
  @JsonProperty("searchTerm")
  public String getSearchTerm() {
    return searchTerm;
  }

  /**
   * Setter for searchTerm.
   * Search term to filter by name
   **/
  public void setSearchTerm(String searchTerm) {
    this.searchTerm = searchTerm;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListServicesRequest listServicesRequest = (ListServicesRequest) o;
    if (!Objects.equals(this.sorts, listServicesRequest.sorts)) {
      return false;
    }
    if (!Objects.equals(this.pageSize, listServicesRequest.pageSize)) {
      return false;
    }
    if (!Objects.equals(this.startingToken, listServicesRequest.startingToken)) {
      return false;
    }
    if (!Objects.equals(this.searchTerm, listServicesRequest.searchTerm)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(sorts, pageSize, startingToken, searchTerm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListServicesRequest {\n");
    sb.append("    sorts: ").append(toIndentedString(sorts)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    startingToken: ").append(toIndentedString(startingToken)).append("\n");
    sb.append("    searchTerm: ").append(toIndentedString(searchTerm)).append("\n");
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

