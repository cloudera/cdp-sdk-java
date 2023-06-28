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

package com.cloudera.cdp.iam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Request object for a list roles request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-06-28T12:35:42.858-07:00")
public class ListRolesRequest  {

  /**
   * The roles names or CRNs to retrieve. If empty all roles will be returned.
   **/
  private List<String> roleNames = new ArrayList<String>();

  /**
   * The size of each page.
   **/
  private Integer pageSize = null;

  /**
   * A token to specify where to start paginating. This is the nextToken from a previously truncated response.
   **/
  private String startingToken = null;

  /**
   * Getter for roleNames.
   * The roles names or CRNs to retrieve. If empty all roles will be returned.
   **/
  @JsonProperty("roleNames")
  public List<String> getRoleNames() {
    return roleNames;
  }

  /**
   * Setter for roleNames.
   * The roles names or CRNs to retrieve. If empty all roles will be returned.
   **/
  public void setRoleNames(List<String> roleNames) {
    this.roleNames = roleNames;
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
    ListRolesRequest listRolesRequest = (ListRolesRequest) o;
    if (!Objects.equals(this.roleNames, listRolesRequest.roleNames)) {
      return false;
    }
    if (!Objects.equals(this.pageSize, listRolesRequest.pageSize)) {
      return false;
    }
    if (!Objects.equals(this.startingToken, listRolesRequest.startingToken)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleNames, pageSize, startingToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRolesRequest {\n");
    sb.append("    roleNames: ").append(toIndentedString(roleNames)).append("\n");
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

