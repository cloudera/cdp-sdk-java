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
 * Request object for update group request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2020-11-24T07:35:53.146-08:00")
public class UpdateGroupRequest  {

  /**
   * The name or CRN of the group to update.
   **/
  private String groupName = null;

  /**
   * Whether group membership is synced when a user logs in. Can be omitted if no update is required.
   **/
  private Boolean syncMembershipOnUserLogin = null;

  /**
   * Getter for groupName.
   * The name or CRN of the group to update.
   **/
  @JsonProperty("groupName")
  public String getGroupName() {
    return groupName;
  }

  /**
   * Setter for groupName.
   * The name or CRN of the group to update.
   **/
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  /**
   * Getter for syncMembershipOnUserLogin.
   * Whether group membership is synced when a user logs in. Can be omitted if no update is required.
   **/
  @JsonProperty("syncMembershipOnUserLogin")
  public Boolean getSyncMembershipOnUserLogin() {
    return syncMembershipOnUserLogin;
  }

  /**
   * Setter for syncMembershipOnUserLogin.
   * Whether group membership is synced when a user logs in. Can be omitted if no update is required.
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
    UpdateGroupRequest updateGroupRequest = (UpdateGroupRequest) o;
    if (!Objects.equals(this.groupName, updateGroupRequest.groupName)) {
      return false;
    }
    if (!Objects.equals(this.syncMembershipOnUserLogin, updateGroupRequest.syncMembershipOnUserLogin)) {
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
    sb.append("class UpdateGroupRequest {\n");
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

