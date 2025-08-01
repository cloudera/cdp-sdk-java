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
 * Request object for an unassign machine user role request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:44.034-07:00")
public class UnassignMachineUserRoleRequest  {

  /**
   * The machine user to unassigned the roles from. Can be the machine user's name or CRN.
   **/
  private String machineUserName = null;

  /**
   * The role to unassigned from the user. Can be the role's name or CRN.
   **/
  private String role = null;

  /**
   * Getter for machineUserName.
   * The machine user to unassigned the roles from. Can be the machine user&#39;s name or CRN.
   **/
  @JsonProperty("machineUserName")
  public String getMachineUserName() {
    return machineUserName;
  }

  /**
   * Setter for machineUserName.
   * The machine user to unassigned the roles from. Can be the machine user&#39;s name or CRN.
   **/
  public void setMachineUserName(String machineUserName) {
    this.machineUserName = machineUserName;
  }

  /**
   * Getter for role.
   * The role to unassigned from the user. Can be the role&#39;s name or CRN.
   **/
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  /**
   * Setter for role.
   * The role to unassigned from the user. Can be the role&#39;s name or CRN.
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
    UnassignMachineUserRoleRequest unassignMachineUserRoleRequest = (UnassignMachineUserRoleRequest) o;
    if (!Objects.equals(this.machineUserName, unassignMachineUserRoleRequest.machineUserName)) {
      return false;
    }
    if (!Objects.equals(this.role, unassignMachineUserRoleRequest.role)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(machineUserName, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnassignMachineUserRoleRequest {\n");
    sb.append("    machineUserName: ").append(toIndentedString(machineUserName)).append("\n");
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

