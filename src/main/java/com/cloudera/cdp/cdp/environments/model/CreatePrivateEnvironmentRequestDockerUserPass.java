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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Alternative to dockerConfigJson.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-29T08:54:20.540-07:00")
public class CreatePrivateEnvironmentRequestDockerUserPass  {

  /**
   * Docker username.
   **/
  private String username = null;

  /**
   * Docker password.
   **/
  private String password = null;

  /**
   * Docker email.
   **/
  private String email = null;

  /**
   * Docker Registry FQDN.
   **/
  private String server = null;

  /**
   * Getter for username.
   * Docker username.
   **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  /**
   * Setter for username.
   * Docker username.
   **/
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Getter for password.
   * Docker password.
   **/
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  /**
   * Setter for password.
   * Docker password.
   **/
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Getter for email.
   * Docker email.
   **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  /**
   * Setter for email.
   * Docker email.
   **/
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Getter for server.
   * Docker Registry FQDN.
   **/
  @JsonProperty("server")
  public String getServer() {
    return server;
  }

  /**
   * Setter for server.
   * Docker Registry FQDN.
   **/
  public void setServer(String server) {
    this.server = server;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePrivateEnvironmentRequestDockerUserPass createPrivateEnvironmentRequestDockerUserPass = (CreatePrivateEnvironmentRequestDockerUserPass) o;
    if (!Objects.equals(this.username, createPrivateEnvironmentRequestDockerUserPass.username)) {
      return false;
    }
    if (!Objects.equals(this.password, createPrivateEnvironmentRequestDockerUserPass.password)) {
      return false;
    }
    if (!Objects.equals(this.email, createPrivateEnvironmentRequestDockerUserPass.email)) {
      return false;
    }
    if (!Objects.equals(this.server, createPrivateEnvironmentRequestDockerUserPass.server)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, email, server);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePrivateEnvironmentRequestDockerUserPass {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
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

