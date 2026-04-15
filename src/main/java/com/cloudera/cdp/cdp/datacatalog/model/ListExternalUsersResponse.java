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

package com.cloudera.cdp.datacatalog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datacatalog.model.ExternalUserListItem;
import java.util.*;

/**
 * Response of the List external users operation.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-04-15T08:44:50.980-07:00")
public class ListExternalUsersResponse extends CdpResponse {

  /**
   * List of external users.
   **/
  private List<ExternalUserListItem> externalUsers = new ArrayList<ExternalUserListItem>();

  /**
   * The token to use when requesting the next set of results. If there are no additional results, the string is empty.
   **/
  private String nextToken = null;

  /**
   * Getter for externalUsers.
   * List of external users.
   **/
  @JsonProperty("externalUsers")
  public List<ExternalUserListItem> getExternalUsers() {
    return externalUsers;
  }

  /**
   * Setter for externalUsers.
   * List of external users.
   **/
  public void setExternalUsers(List<ExternalUserListItem> externalUsers) {
    this.externalUsers = externalUsers;
  }

  /**
   * Getter for nextToken.
   * The token to use when requesting the next set of results. If there are no additional results, the string is empty.
   **/
  @JsonProperty("nextToken")
  public String getNextToken() {
    return nextToken;
  }

  /**
   * Setter for nextToken.
   * The token to use when requesting the next set of results. If there are no additional results, the string is empty.
   **/
  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListExternalUsersResponse listExternalUsersResponse = (ListExternalUsersResponse) o;
    if (!Objects.equals(this.externalUsers, listExternalUsersResponse.externalUsers)) {
      return false;
    }
    if (!Objects.equals(this.nextToken, listExternalUsersResponse.nextToken)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalUsers, nextToken, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListExternalUsersResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    externalUsers: ").append(toIndentedString(externalUsers)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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

