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
 * Request object for create group request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-09-14T10:47:19.421-07:00")
public class CreateGroupRequest  {

  /**
   * The name of the group. This name must be unique. There are certain restrictions on the group name. Refer to the How To > User Management section in the Management Console documentation for the details.
   **/
  private String groupName = null;

  /**
   * Whether group membership is synced when a user logs in. The default is to sync group membership.
   **/
  private Boolean syncMembershipOnUserLogin = null;

  /**
   * Getter for groupName.
   * The name of the group. This name must be unique. There are certain restrictions on the group name. Refer to the How To &gt; User Management section in the Management Console documentation for the details.
   **/
  @JsonProperty("groupName")
  public String getGroupName() {
    return groupName;
  }

  /**
   * Setter for groupName.
   * The name of the group. This name must be unique. There are certain restrictions on the group name. Refer to the How To &gt; User Management section in the Management Console documentation for the details.
   **/
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  /**
   * Getter for syncMembershipOnUserLogin.
   * Whether group membership is synced when a user logs in. The default is to sync group membership.
   **/
  @JsonProperty("syncMembershipOnUserLogin")
  public Boolean getSyncMembershipOnUserLogin() {
    return syncMembershipOnUserLogin;
  }

  /**
   * Setter for syncMembershipOnUserLogin.
   * Whether group membership is synced when a user logs in. The default is to sync group membership.
   **/
  public void setSyncMembershipOnUserLogin(Boolean syncMembershipOnUserLogin) {
    this.syncMembershipOnUserLogin = syncMembershipOnUserLogin;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGroupRequest createGroupRequest = (CreateGroupRequest) o;
    if (!Objects.equals(this.groupName, createGroupRequest.groupName)) {
      return false;
    }
    if (!Objects.equals(this.syncMembershipOnUserLogin, createGroupRequest.syncMembershipOnUserLogin)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, syncMembershipOnUserLogin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGroupRequest {\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    syncMembershipOnUserLogin: ").append(toIndentedString(syncMembershipOnUserLogin)).append("\n");
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

