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
 * Create Snapshot Request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-14T20:25:46.408-07:00")
public class CreateSnapshotRequest  {

  /**
   * The name of the environment.
   **/
  private String environmentName = null;

  /**
   * The name of the database.
   **/
  private String databaseName = null;

  /**
   * The fully qualified table name.
   **/
  private String tableName = null;

  /**
   * Snapshot name unique per database.
   **/
  private String snapshotName = null;

  /**
   * The snapshot location URL on object store.
   **/
  private String snapshotLocation = null;

  /**
   * Getter for environmentName.
   * The name of the environment.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The name of the environment.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for databaseName.
   * The name of the database.
   **/
  @JsonProperty("databaseName")
  public String getDatabaseName() {
    return databaseName;
  }

  /**
   * Setter for databaseName.
   * The name of the database.
   **/
  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }

  /**
   * Getter for tableName.
   * The fully qualified table name.
   **/
  @JsonProperty("tableName")
  public String getTableName() {
    return tableName;
  }

  /**
   * Setter for tableName.
   * The fully qualified table name.
   **/
  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  /**
   * Getter for snapshotName.
   * Snapshot name unique per database.
   **/
  @JsonProperty("snapshotName")
  public String getSnapshotName() {
    return snapshotName;
  }

  /**
   * Setter for snapshotName.
   * Snapshot name unique per database.
   **/
  public void setSnapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
  }

  /**
   * Getter for snapshotLocation.
   * The snapshot location URL on object store.
   **/
  @JsonProperty("snapshotLocation")
  public String getSnapshotLocation() {
    return snapshotLocation;
  }

  /**
   * Setter for snapshotLocation.
   * The snapshot location URL on object store.
   **/
  public void setSnapshotLocation(String snapshotLocation) {
    this.snapshotLocation = snapshotLocation;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSnapshotRequest createSnapshotRequest = (CreateSnapshotRequest) o;
    if (!Objects.equals(this.environmentName, createSnapshotRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.databaseName, createSnapshotRequest.databaseName)) {
      return false;
    }
    if (!Objects.equals(this.tableName, createSnapshotRequest.tableName)) {
      return false;
    }
    if (!Objects.equals(this.snapshotName, createSnapshotRequest.snapshotName)) {
      return false;
    }
    if (!Objects.equals(this.snapshotLocation, createSnapshotRequest.snapshotLocation)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, databaseName, tableName, snapshotName, snapshotLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSnapshotRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    snapshotName: ").append(toIndentedString(snapshotName)).append("\n");
    sb.append("    snapshotLocation: ").append(toIndentedString(snapshotLocation)).append("\n");
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

