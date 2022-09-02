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
 * Request object for an assign group role request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-09-01T19:38:42.413-07:00")
public class AssignGroupRoleRequest  {

  /**
   * The group to which the role is assigned to. Can be the group name or CRN.
   **/
  private String groupName = null;

  /**
   * The role being assigned to the group. Can be the role's CRN or name.
   **/
  private String role = null;

  /**
   * Getter for groupName.
   * The group to which the role is assigned to. Can be the group name or CRN.
   **/
  @JsonProperty("groupName")
  public String getGroupName() {
    return groupName;
  }

  /**
   * Setter for groupName.
   * The group to which the role is assigned to. Can be the group name or CRN.
   **/
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  /**
   * Getter for role.
   * The role being assigned to the group. Can be the role&#39;s CRN or name.
   **/
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  /**
   * Setter for role.
   * The role being assigned to the group. Can be the role&#39;s CRN or name.
   **/
  public void setRole(String role) {
    this.role = role;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignGroupRoleRequest assignGroupRoleRequest = (AssignGroupRoleRequest) o;
    if (!Objects.equals(this.groupName, assignGroupRoleRequest.groupName)) {
      return false;
    }
    if (!Objects.equals(this.role, assignGroupRoleRequest.role)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignGroupRoleRequest {\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

