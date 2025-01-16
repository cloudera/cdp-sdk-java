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
import java.time.ZonedDateTime;

/**
 * Show Snapshots Request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-15T12:52:22.696-08:00")
public class ListSnapshotsRequest  {

  /**
   * The name of the environment.
   **/
  private String environmentName = null;

  /**
   * The name of the database.
   **/
  private String databaseName = null;

  /**
   * The table name.
   **/
  private String tableName = null;

  /**
   * The submitted Command ID of the snapshots.
   **/
  private Long commandId = null;

  /**
   * The creation time of the snapshots to search (inclusive).
   **/
  private ZonedDateTime fromCreationTime = null;

  /**
   * The ending time of the snapshot creation to search (inclusive).
   **/
  private ZonedDateTime toCreationTime = null;

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
   * The table name.
   **/
  @JsonProperty("tableName")
  public String getTableName() {
    return tableName;
  }

  /**
   * Setter for tableName.
   * The table name.
   **/
  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  /**
   * Getter for commandId.
   * The submitted Command ID of the snapshots.
   **/
  @JsonProperty("commandId")
  public Long getCommandId() {
    return commandId;
  }

  /**
   * Setter for commandId.
   * The submitted Command ID of the snapshots.
   **/
  public void setCommandId(Long commandId) {
    this.commandId = commandId;
  }

  /**
   * Getter for fromCreationTime.
   * The creation time of the snapshots to search (inclusive).
   **/
  @JsonProperty("fromCreationTime")
  public ZonedDateTime getFromCreationTime() {
    return fromCreationTime;
  }

  /**
   * Setter for fromCreationTime.
   * The creation time of the snapshots to search (inclusive).
   **/
  public void setFromCreationTime(ZonedDateTime fromCreationTime) {
    this.fromCreationTime = fromCreationTime;
  }

  /**
   * Getter for toCreationTime.
   * The ending time of the snapshot creation to search (inclusive).
   **/
  @JsonProperty("toCreationTime")
  public ZonedDateTime getToCreationTime() {
    return toCreationTime;
  }

  /**
   * Setter for toCreationTime.
   * The ending time of the snapshot creation to search (inclusive).
   **/
  public void setToCreationTime(ZonedDateTime toCreationTime) {
    this.toCreationTime = toCreationTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSnapshotsRequest listSnapshotsRequest = (ListSnapshotsRequest) o;
    if (!Objects.equals(this.environmentName, listSnapshotsRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.databaseName, listSnapshotsRequest.databaseName)) {
      return false;
    }
    if (!Objects.equals(this.tableName, listSnapshotsRequest.tableName)) {
      return false;
    }
    if (!Objects.equals(this.commandId, listSnapshotsRequest.commandId)) {
      return false;
    }
    if (!Objects.equals(this.fromCreationTime, listSnapshotsRequest.fromCreationTime)) {
      return false;
    }
    if (!Objects.equals(this.toCreationTime, listSnapshotsRequest.toCreationTime)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, databaseName, tableName, commandId, fromCreationTime, toCreationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSnapshotsRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
    sb.append("    fromCreationTime: ").append(toIndentedString(fromCreationTime)).append("\n");
    sb.append("    toCreationTime: ").append(toIndentedString(toCreationTime)).append("\n");
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

