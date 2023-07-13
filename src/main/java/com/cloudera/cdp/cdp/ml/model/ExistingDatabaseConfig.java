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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Configurations for bringing an existing database for model metrics
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-07-13T10:29:22.224-07:00")
public class ExistingDatabaseConfig  {

  /**
   * Optionally provide a Postgresql database host to export model metrics to.
   **/
  private String existingDatabaseHost = null;

  /**
   * Optionally provide a Postgresql database port to export model metrics to.
   **/
  private String existingDatabasePort = null;

  /**
   * Optionally provide a Postgresql database name to export model metrics to.
   **/
  private String existingDatabaseName = null;

  /**
   * Optionally provide a Postgresql database user to use when exporting model metrics.
   **/
  private String existingDatabaseUser = null;

  /**
   * Optionally provide a Postgresql database password to use when exporting model metrics.
   **/
  private String existingDatabasePassword = null;

  /**
   * Getter for existingDatabaseHost.
   * Optionally provide a Postgresql database host to export model metrics to.
   **/
  @JsonProperty("existingDatabaseHost")
  public String getExistingDatabaseHost() {
    return existingDatabaseHost;
  }

  /**
   * Setter for existingDatabaseHost.
   * Optionally provide a Postgresql database host to export model metrics to.
   **/
  public void setExistingDatabaseHost(String existingDatabaseHost) {
    this.existingDatabaseHost = existingDatabaseHost;
  }

  /**
   * Getter for existingDatabasePort.
   * Optionally provide a Postgresql database port to export model metrics to.
   **/
  @JsonProperty("existingDatabasePort")
  public String getExistingDatabasePort() {
    return existingDatabasePort;
  }

  /**
   * Setter for existingDatabasePort.
   * Optionally provide a Postgresql database port to export model metrics to.
   **/
  public void setExistingDatabasePort(String existingDatabasePort) {
    this.existingDatabasePort = existingDatabasePort;
  }

  /**
   * Getter for existingDatabaseName.
   * Optionally provide a Postgresql database name to export model metrics to.
   **/
  @JsonProperty("existingDatabaseName")
  public String getExistingDatabaseName() {
    return existingDatabaseName;
  }

  /**
   * Setter for existingDatabaseName.
   * Optionally provide a Postgresql database name to export model metrics to.
   **/
  public void setExistingDatabaseName(String existingDatabaseName) {
    this.existingDatabaseName = existingDatabaseName;
  }

  /**
   * Getter for existingDatabaseUser.
   * Optionally provide a Postgresql database user to use when exporting model metrics.
   **/
  @JsonProperty("existingDatabaseUser")
  public String getExistingDatabaseUser() {
    return existingDatabaseUser;
  }

  /**
   * Setter for existingDatabaseUser.
   * Optionally provide a Postgresql database user to use when exporting model metrics.
   **/
  public void setExistingDatabaseUser(String existingDatabaseUser) {
    this.existingDatabaseUser = existingDatabaseUser;
  }

  /**
   * Getter for existingDatabasePassword.
   * Optionally provide a Postgresql database password to use when exporting model metrics.
   **/
  @JsonProperty("existingDatabasePassword")
  public String getExistingDatabasePassword() {
    return existingDatabasePassword;
  }

  /**
   * Setter for existingDatabasePassword.
   * Optionally provide a Postgresql database password to use when exporting model metrics.
   **/
  public void setExistingDatabasePassword(String existingDatabasePassword) {
    this.existingDatabasePassword = existingDatabasePassword;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExistingDatabaseConfig existingDatabaseConfig = (ExistingDatabaseConfig) o;
    if (!Objects.equals(this.existingDatabaseHost, existingDatabaseConfig.existingDatabaseHost)) {
      return false;
    }
    if (!Objects.equals(this.existingDatabasePort, existingDatabaseConfig.existingDatabasePort)) {
      return false;
    }
    if (!Objects.equals(this.existingDatabaseName, existingDatabaseConfig.existingDatabaseName)) {
      return false;
    }
    if (!Objects.equals(this.existingDatabaseUser, existingDatabaseConfig.existingDatabaseUser)) {
      return false;
    }
    if (!Objects.equals(this.existingDatabasePassword, existingDatabaseConfig.existingDatabasePassword)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(existingDatabaseHost, existingDatabasePort, existingDatabaseName, existingDatabaseUser, existingDatabasePassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExistingDatabaseConfig {\n");
    sb.append("    existingDatabaseHost: ").append(toIndentedString(existingDatabaseHost)).append("\n");
    sb.append("    existingDatabasePort: ").append(toIndentedString(existingDatabasePort)).append("\n");
    sb.append("    existingDatabaseName: ").append(toIndentedString(existingDatabaseName)).append("\n");
    sb.append("    existingDatabaseUser: ").append(toIndentedString(existingDatabaseUser)).append("\n");
    sb.append("    existingDatabasePassword: ").append(toIndentedString(existingDatabasePassword)).append("\n");
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

