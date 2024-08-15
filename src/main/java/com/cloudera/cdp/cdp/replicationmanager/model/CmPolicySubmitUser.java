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

package com.cloudera.cdp.replicationmanager.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * CM Policy submit user.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-08-15T13:42:20.189-07:00")
public class CmPolicySubmitUser  {

  /**
   * Username.
   **/
  private String userName = null;

  /**
   * Source user.
   **/
  private String sourceUser = null;

  /**
   * Getter for userName.
   * Username.
   **/
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  /**
   * Setter for userName.
   * Username.
   **/
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   * Getter for sourceUser.
   * Source user.
   **/
  @JsonProperty("sourceUser")
  public String getSourceUser() {
    return sourceUser;
  }

  /**
   * Setter for sourceUser.
   * Source user.
   **/
  public void setSourceUser(String sourceUser) {
    this.sourceUser = sourceUser;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CmPolicySubmitUser cmPolicySubmitUser = (CmPolicySubmitUser) o;
    if (!Objects.equals(this.userName, cmPolicySubmitUser.userName)) {
      return false;
    }
    if (!Objects.equals(this.sourceUser, cmPolicySubmitUser.sourceUser)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, sourceUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CmPolicySubmitUser {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    sourceUser: ").append(toIndentedString(sourceUser)).append("\n");
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

