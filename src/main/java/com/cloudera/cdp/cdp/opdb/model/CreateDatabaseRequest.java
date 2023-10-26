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

package com.cloudera.cdp.opdb.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * A request to create the database
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-10-25T14:07:13.707-07:00")
public class CreateDatabaseRequest  {

  /**
   * environment name
   **/
  private String environmentName = null;

  /**
   * database name
   **/
  private String databaseName = null;

  /**
   * Optional tags to choose one of the predefined cluster sizes.
   **/
  private String scaleType = null;

  /**
   * Optional tag to choose the storage types.
   **/
  private String storageType = null;

  /**
   * Getter for environmentName.
   * environment name
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * environment name
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for databaseName.
   * database name
   **/
  @JsonProperty("databaseName")
  public String getDatabaseName() {
    return databaseName;
  }

  /**
   * Setter for databaseName.
   * database name
   **/
  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }

  /**
   * Getter for scaleType.
   * Optional tags to choose one of the predefined cluster sizes.
   **/
  @JsonProperty("scaleType")
  public String getScaleType() {
    return scaleType;
  }

  /**
   * Setter for scaleType.
   * Optional tags to choose one of the predefined cluster sizes.
   **/
  public void setScaleType(String scaleType) {
    this.scaleType = scaleType;
  }

  /**
   * Getter for storageType.
   * Optional tag to choose the storage types.
   **/
  @JsonProperty("storageType")
  public String getStorageType() {
    return storageType;
  }

  /**
   * Setter for storageType.
   * Optional tag to choose the storage types.
   **/
  public void setStorageType(String storageType) {
    this.storageType = storageType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDatabaseRequest createDatabaseRequest = (CreateDatabaseRequest) o;
    if (!Objects.equals(this.environmentName, createDatabaseRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.databaseName, createDatabaseRequest.databaseName)) {
      return false;
    }
    if (!Objects.equals(this.scaleType, createDatabaseRequest.scaleType)) {
      return false;
    }
    if (!Objects.equals(this.storageType, createDatabaseRequest.storageType)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, databaseName, scaleType, storageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDatabaseRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    scaleType: ").append(toIndentedString(scaleType)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
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

