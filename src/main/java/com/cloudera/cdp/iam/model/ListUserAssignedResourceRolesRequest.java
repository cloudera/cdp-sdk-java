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

/**
 * Request object for a list user assigned resource roles request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2020-11-24T07:35:53.146-08:00")
public class ListUserAssignedResourceRolesRequest  {

  /**
   * The user to list the assigned roles for. Can be the user's CRN or id. If it is not included, it defaults to the user making the request.
   **/
  private String user = null;

  /**
   * The size of each page.
   **/
  private Integer pageSize = null;

  /**
   * A token to specify where to start paginating. This is the nextToken from a previously truncated response.
   **/
  private String startingToken = null;

  /**
   * Getter for user.
   * The user to list the assigned roles for. Can be the user&#39;s CRN or id. If it is not included, it defaults to the user making the request.
   **/
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  /**
   * Setter for user.
   * The user to list the assigned roles for. Can be the user&#39;s CRN or id. If it is not included, it defaults to the user making the request.
   **/
  public void setUser(String user) {
    this.user = user;
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
    ListUserAssignedResourceRolesRequest listUserAssignedResourceRolesRequest = (ListUserAssignedResourceRolesRequest) o;
    if (!Objects.equals(this.user, listUserAssignedResourceRolesRequest.user)) {
      return false;
    }
    if (!Objects.equals(this.pageSize, listUserAssignedResourceRolesRequest.pageSize)) {
      return false;
    }
    if (!Objects.equals(this.startingToken, listUserAssignedResourceRolesRequest.startingToken)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, pageSize, startingToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListUserAssignedResourceRolesRequest {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

