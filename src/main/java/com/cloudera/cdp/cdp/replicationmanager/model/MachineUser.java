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
 * Username and password for the machine user.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-15T12:52:24.443-08:00")
public class MachineUser  {

  /**
   * Username.
   **/
  private String user = null;

  /**
   * Password.
   **/
  private String password = null;

  /**
   * This option has no effect if the machine user already exists. Otherwise if 'true', a new machine user is created. If 'false', an error is returned indicating that the user does not exist.
   **/
  private Boolean createUser = null;

  /**
   * Getter for user.
   * Username.
   **/
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  /**
   * Setter for user.
   * Username.
   **/
  public void setUser(String user) {
    this.user = user;
  }

  /**
   * Getter for password.
   * Password.
   **/
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  /**
   * Setter for password.
   * Password.
   **/
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Getter for createUser.
   * This option has no effect if the machine user already exists. Otherwise if &#39;true&#39;, a new machine user is created. If &#39;false&#39;, an error is returned indicating that the user does not exist.
   **/
  @JsonProperty("createUser")
  public Boolean getCreateUser() {
    return createUser;
  }

  /**
   * Setter for createUser.
   * This option has no effect if the machine user already exists. Otherwise if &#39;true&#39;, a new machine user is created. If &#39;false&#39;, an error is returned indicating that the user does not exist.
   **/
  public void setCreateUser(Boolean createUser) {
    this.createUser = createUser;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MachineUser machineUser = (MachineUser) o;
    if (!Objects.equals(this.user, machineUser.user)) {
      return false;
    }
    if (!Objects.equals(this.password, machineUser.password)) {
      return false;
    }
    if (!Objects.equals(this.createUser, machineUser.createUser)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, password, createUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MachineUser {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
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

