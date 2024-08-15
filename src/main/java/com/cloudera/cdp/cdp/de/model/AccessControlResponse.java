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
 * Response object containing access control information for a Virtual Cluster.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-08-15T13:42:18.574-07:00")
public class AccessControlResponse extends CdpResponse {

  /**
   * Workload usernames of CDP users granted access to the Virtual Cluster.
   **/
  private List<String> users = new ArrayList<String>();

  /**
   * Users with full access.
   **/
  private List<String> fullAccessUsers = new ArrayList<String>();

  /**
   * Groups with full access.
   **/
  private List<String> fullAccessGroups = new ArrayList<String>();

  /**
   * Users with view only access.
   **/
  private List<String> viewOnlyUsers = new ArrayList<String>();

  /**
   * Groups with view only access.
   **/
  private List<String> viewOnlyGroups = new ArrayList<String>();

  /**
   * Getter for users.
   * Workload usernames of CDP users granted access to the Virtual Cluster.
   **/
  @JsonProperty("users")
  public List<String> getUsers() {
    return users;
  }

  /**
   * Setter for users.
   * Workload usernames of CDP users granted access to the Virtual Cluster.
   **/
  public void setUsers(List<String> users) {
    this.users = users;
  }

  /**
   * Getter for fullAccessUsers.
   * Users with full access.
   **/
  @JsonProperty("fullAccessUsers")
  public List<String> getFullAccessUsers() {
    return fullAccessUsers;
  }

  /**
   * Setter for fullAccessUsers.
   * Users with full access.
   **/
  public void setFullAccessUsers(List<String> fullAccessUsers) {
    this.fullAccessUsers = fullAccessUsers;
  }

  /**
   * Getter for fullAccessGroups.
   * Groups with full access.
   **/
  @JsonProperty("fullAccessGroups")
  public List<String> getFullAccessGroups() {
    return fullAccessGroups;
  }

  /**
   * Setter for fullAccessGroups.
   * Groups with full access.
   **/
  public void setFullAccessGroups(List<String> fullAccessGroups) {
    this.fullAccessGroups = fullAccessGroups;
  }

  /**
   * Getter for viewOnlyUsers.
   * Users with view only access.
   **/
  @JsonProperty("viewOnlyUsers")
  public List<String> getViewOnlyUsers() {
    return viewOnlyUsers;
  }

  /**
   * Setter for viewOnlyUsers.
   * Users with view only access.
   **/
  public void setViewOnlyUsers(List<String> viewOnlyUsers) {
    this.viewOnlyUsers = viewOnlyUsers;
  }

  /**
   * Getter for viewOnlyGroups.
   * Groups with view only access.
   **/
  @JsonProperty("viewOnlyGroups")
  public List<String> getViewOnlyGroups() {
    return viewOnlyGroups;
  }

  /**
   * Setter for viewOnlyGroups.
   * Groups with view only access.
   **/
  public void setViewOnlyGroups(List<String> viewOnlyGroups) {
    this.viewOnlyGroups = viewOnlyGroups;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessControlResponse accessControlResponse = (AccessControlResponse) o;
    if (!Objects.equals(this.users, accessControlResponse.users)) {
      return false;
    }
    if (!Objects.equals(this.fullAccessUsers, accessControlResponse.fullAccessUsers)) {
      return false;
    }
    if (!Objects.equals(this.fullAccessGroups, accessControlResponse.fullAccessGroups)) {
      return false;
    }
    if (!Objects.equals(this.viewOnlyUsers, accessControlResponse.viewOnlyUsers)) {
      return false;
    }
    if (!Objects.equals(this.viewOnlyGroups, accessControlResponse.viewOnlyGroups)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, fullAccessUsers, fullAccessGroups, viewOnlyUsers, viewOnlyGroups, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessControlResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    fullAccessUsers: ").append(toIndentedString(fullAccessUsers)).append("\n");
    sb.append("    fullAccessGroups: ").append(toIndentedString(fullAccessGroups)).append("\n");
    sb.append("    viewOnlyUsers: ").append(toIndentedString(viewOnlyUsers)).append("\n");
    sb.append("    viewOnlyGroups: ").append(toIndentedString(viewOnlyGroups)).append("\n");
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

