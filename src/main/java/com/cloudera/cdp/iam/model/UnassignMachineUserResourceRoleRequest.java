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
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-09-08T16:23:13.618-07:00")
public class UnassignMachineUserResourceRoleRequest  {

  /**
   * The machine user to unassign the resource role from.
   **/
  private String machineUserName = null;

  /**
   * The CRN of the resource role to unassigned from the machine user.
   **/
  private String resourceRoleCrn = null;

  /**
   * The CRN of the resource for which the resource role rights will be unassigned.
   **/
  private String resourceCrn = null;

  /**
   * Getter for machineUserName.
   * The machine user to unassign the resource role from.
   **/
  @JsonProperty("machineUserName")
  public String getMachineUserName() {
    return machineUserName;
  }

  /**
   * Setter for machineUserName.
   * The machine user to unassign the resource role from.
   **/
  public void setMachineUserName(String machineUserName) {
    this.machineUserName = machineUserName;
  }

  /**
   * Getter for resourceRoleCrn.
   * The CRN of the resource role to unassigned from the machine user.
   **/
  @JsonProperty("resourceRoleCrn")
  public String getResourceRoleCrn() {
    return resourceRoleCrn;
  }

  /**
   * Setter for resourceRoleCrn.
   * The CRN of the resource role to unassigned from the machine user.
   **/
  public void setResourceRoleCrn(String resourceRoleCrn) {
    this.resourceRoleCrn = resourceRoleCrn;
  }

  /**
   * Getter for resourceCrn.
   * The CRN of the resource for which the resource role rights will be unassigned.
   **/
  @JsonProperty("resourceCrn")
  public String getResourceCrn() {
    return resourceCrn;
  }

  /**
   * Setter for resourceCrn.
   * The CRN of the resource for which the resource role rights will be unassigned.
   **/
  public void setResourceCrn(String resourceCrn) {
    this.resourceCrn = resourceCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnassignMachineUserResourceRoleRequest unassignMachineUserResourceRoleRequest = (UnassignMachineUserResourceRoleRequest) o;
    if (!Objects.equals(this.machineUserName, unassignMachineUserResourceRoleRequest.machineUserName)) {
      return false;
    }
    if (!Objects.equals(this.resourceRoleCrn, unassignMachineUserResourceRoleRequest.resourceRoleCrn)) {
      return false;
    }
    if (!Objects.equals(this.resourceCrn, unassignMachineUserResourceRoleRequest.resourceCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(machineUserName, resourceRoleCrn, resourceCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnassignMachineUserResourceRoleRequest {\n");
    sb.append("    machineUserName: ").append(toIndentedString(machineUserName)).append("\n");
    sb.append("    resourceRoleCrn: ").append(toIndentedString(resourceRoleCrn)).append("\n");
    sb.append("    resourceCrn: ").append(toIndentedString(resourceCrn)).append("\n");
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

