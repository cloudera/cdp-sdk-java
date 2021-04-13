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
import com.cloudera.cdp.iam.model.ResourceAssignment;
import java.util.*;

/**
 * Response object for delete machine user request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-04-13T14:18:24.213-07:00")
public class DeleteMachineUserResponse extends CdpResponse {

  /**
   * The list of associated access key CRNs that were deleted.
   **/
  private List<String> accessKeysDeleted = new ArrayList<String>();

  /**
   * The list of group CRNs from which the machine user has been removed.
   **/
  private List<String> groupsModified = new ArrayList<String>();

  /**
   * The list of role CRNs unassigned from the machine user.
   **/
  private List<String> rolesUnassigned = new ArrayList<String>();

  /**
   * The list of resource role assignments that have been unassigned from the machine user.
   **/
  private List<ResourceAssignment> resourcesUnassigned = new ArrayList<ResourceAssignment>();

  /**
   * Getter for accessKeysDeleted.
   * The list of associated access key CRNs that were deleted.
   **/
  @JsonProperty("accessKeysDeleted")
  public List<String> getAccessKeysDeleted() {
    return accessKeysDeleted;
  }

  /**
   * Setter for accessKeysDeleted.
   * The list of associated access key CRNs that were deleted.
   **/
  public void setAccessKeysDeleted(List<String> accessKeysDeleted) {
    this.accessKeysDeleted = accessKeysDeleted;
  }

  /**
   * Getter for groupsModified.
   * The list of group CRNs from which the machine user has been removed.
   **/
  @JsonProperty("groupsModified")
  public List<String> getGroupsModified() {
    return groupsModified;
  }

  /**
   * Setter for groupsModified.
   * The list of group CRNs from which the machine user has been removed.
   **/
  public void setGroupsModified(List<String> groupsModified) {
    this.groupsModified = groupsModified;
  }

  /**
   * Getter for rolesUnassigned.
   * The list of role CRNs unassigned from the machine user.
   **/
  @JsonProperty("rolesUnassigned")
  public List<String> getRolesUnassigned() {
    return rolesUnassigned;
  }

  /**
   * Setter for rolesUnassigned.
   * The list of role CRNs unassigned from the machine user.
   **/
  public void setRolesUnassigned(List<String> rolesUnassigned) {
    this.rolesUnassigned = rolesUnassigned;
  }

  /**
   * Getter for resourcesUnassigned.
   * The list of resource role assignments that have been unassigned from the machine user.
   **/
  @JsonProperty("resourcesUnassigned")
  public List<ResourceAssignment> getResourcesUnassigned() {
    return resourcesUnassigned;
  }

  /**
   * Setter for resourcesUnassigned.
   * The list of resource role assignments that have been unassigned from the machine user.
   **/
  public void setResourcesUnassigned(List<ResourceAssignment> resourcesUnassigned) {
    this.resourcesUnassigned = resourcesUnassigned;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteMachineUserResponse deleteMachineUserResponse = (DeleteMachineUserResponse) o;
    if (!Objects.equals(this.accessKeysDeleted, deleteMachineUserResponse.accessKeysDeleted)) {
      return false;
    }
    if (!Objects.equals(this.groupsModified, deleteMachineUserResponse.groupsModified)) {
      return false;
    }
    if (!Objects.equals(this.rolesUnassigned, deleteMachineUserResponse.rolesUnassigned)) {
      return false;
    }
    if (!Objects.equals(this.resourcesUnassigned, deleteMachineUserResponse.resourcesUnassigned)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeysDeleted, groupsModified, rolesUnassigned, resourcesUnassigned, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteMachineUserResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accessKeysDeleted: ").append(toIndentedString(accessKeysDeleted)).append("\n");
    sb.append("    groupsModified: ").append(toIndentedString(groupsModified)).append("\n");
    sb.append("    rolesUnassigned: ").append(toIndentedString(rolesUnassigned)).append("\n");
    sb.append("    resourcesUnassigned: ").append(toIndentedString(resourcesUnassigned)).append("\n");
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

