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
 * Request object for checking Database connectivity.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-06T11:27:16.941-08:00")
public class CheckDatabaseConnectivityRequest  {

  /**
   * Host value.
   **/
  private String host = null;

  /**
   * Port value.
   **/
  private Integer port = null;

  /**
   * Database name value.
   **/
  private String name = null;

  /**
   * Username value.
   **/
  private String username = null;

  /**
   * Password value.
   **/
  private String password = null;

  /**
   * Getter for host.
   * Host value.
   **/
  @JsonProperty("host")
  public String getHost() {
    return host;
  }

  /**
   * Setter for host.
   * Host value.
   **/
  public void setHost(String host) {
    this.host = host;
  }

  /**
   * Getter for port.
   * Port value.
   **/
  @JsonProperty("port")
  public Integer getPort() {
    return port;
  }

  /**
   * Setter for port.
   * Port value.
   **/
  public void setPort(Integer port) {
    this.port = port;
  }

  /**
   * Getter for name.
   * Database name value.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Database name value.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for username.
   * Username value.
   **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  /**
   * Setter for username.
   * Username value.
   **/
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Getter for password.
   * Password value.
   **/
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  /**
   * Setter for password.
   * Password value.
   **/
  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckDatabaseConnectivityRequest checkDatabaseConnectivityRequest = (CheckDatabaseConnectivityRequest) o;
    if (!Objects.equals(this.host, checkDatabaseConnectivityRequest.host)) {
      return false;
    }
    if (!Objects.equals(this.port, checkDatabaseConnectivityRequest.port)) {
      return false;
    }
    if (!Objects.equals(this.name, checkDatabaseConnectivityRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.username, checkDatabaseConnectivityRequest.username)) {
      return false;
    }
    if (!Objects.equals(this.password, checkDatabaseConnectivityRequest.password)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, port, name, username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckDatabaseConnectivityRequest {\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

