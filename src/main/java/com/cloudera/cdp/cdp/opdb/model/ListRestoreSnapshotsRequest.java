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
 * Show Restore Snapshots Request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-26T09:46:36.150-07:00")
public class ListRestoreSnapshotsRequest  {

  /**
   * The name of the environment.
   **/
  private String environmentName = null;

  /**
   * The name of the database.
   **/
  private String databaseName = null;

  /**
   * The name of the snapshot.
   **/
  private String snapshotName = null;

  /**
   * The name of the target environment.
   **/
  private String targetEnvironmentName = null;

  /**
   * The name of the target database.
   **/
  private String targetDatabaseName = null;

  /**
   * The submitted Command ID of the snapshot.
   **/
  private Long commandId = null;

  /**
   * The starting snapshot restore time to search restore snapshots (inclusive).
   **/
  private ZonedDateTime fromRestoreTime = null;

  /**
   * The ending snapshot restore time to search restore snapshots (inclusive).
   **/
  private ZonedDateTime toRestoreTime = null;

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
   * Getter for snapshotName.
   * The name of the snapshot.
   **/
  @JsonProperty("snapshotName")
  public String getSnapshotName() {
    return snapshotName;
  }

  /**
   * Setter for snapshotName.
   * The name of the snapshot.
   **/
  public void setSnapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
  }

  /**
   * Getter for targetEnvironmentName.
   * The name of the target environment.
   **/
  @JsonProperty("targetEnvironmentName")
  public String getTargetEnvironmentName() {
    return targetEnvironmentName;
  }

  /**
   * Setter for targetEnvironmentName.
   * The name of the target environment.
   **/
  public void setTargetEnvironmentName(String targetEnvironmentName) {
    this.targetEnvironmentName = targetEnvironmentName;
  }

  /**
   * Getter for targetDatabaseName.
   * The name of the target database.
   **/
  @JsonProperty("targetDatabaseName")
  public String getTargetDatabaseName() {
    return targetDatabaseName;
  }

  /**
   * Setter for targetDatabaseName.
   * The name of the target database.
   **/
  public void setTargetDatabaseName(String targetDatabaseName) {
    this.targetDatabaseName = targetDatabaseName;
  }

  /**
   * Getter for commandId.
   * The submitted Command ID of the snapshot.
   **/
  @JsonProperty("commandId")
  public Long getCommandId() {
    return commandId;
  }

  /**
   * Setter for commandId.
   * The submitted Command ID of the snapshot.
   **/
  public void setCommandId(Long commandId) {
    this.commandId = commandId;
  }

  /**
   * Getter for fromRestoreTime.
   * The starting snapshot restore time to search restore snapshots (inclusive).
   **/
  @JsonProperty("fromRestoreTime")
  public ZonedDateTime getFromRestoreTime() {
    return fromRestoreTime;
  }

  /**
   * Setter for fromRestoreTime.
   * The starting snapshot restore time to search restore snapshots (inclusive).
   **/
  public void setFromRestoreTime(ZonedDateTime fromRestoreTime) {
    this.fromRestoreTime = fromRestoreTime;
  }

  /**
   * Getter for toRestoreTime.
   * The ending snapshot restore time to search restore snapshots (inclusive).
   **/
  @JsonProperty("toRestoreTime")
  public ZonedDateTime getToRestoreTime() {
    return toRestoreTime;
  }

  /**
   * Setter for toRestoreTime.
   * The ending snapshot restore time to search restore snapshots (inclusive).
   **/
  public void setToRestoreTime(ZonedDateTime toRestoreTime) {
    this.toRestoreTime = toRestoreTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRestoreSnapshotsRequest listRestoreSnapshotsRequest = (ListRestoreSnapshotsRequest) o;
    if (!Objects.equals(this.environmentName, listRestoreSnapshotsRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.databaseName, listRestoreSnapshotsRequest.databaseName)) {
      return false;
    }
    if (!Objects.equals(this.snapshotName, listRestoreSnapshotsRequest.snapshotName)) {
      return false;
    }
    if (!Objects.equals(this.targetEnvironmentName, listRestoreSnapshotsRequest.targetEnvironmentName)) {
      return false;
    }
    if (!Objects.equals(this.targetDatabaseName, listRestoreSnapshotsRequest.targetDatabaseName)) {
      return false;
    }
    if (!Objects.equals(this.commandId, listRestoreSnapshotsRequest.commandId)) {
      return false;
    }
    if (!Objects.equals(this.fromRestoreTime, listRestoreSnapshotsRequest.fromRestoreTime)) {
      return false;
    }
    if (!Objects.equals(this.toRestoreTime, listRestoreSnapshotsRequest.toRestoreTime)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, databaseName, snapshotName, targetEnvironmentName, targetDatabaseName, commandId, fromRestoreTime, toRestoreTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRestoreSnapshotsRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    snapshotName: ").append(toIndentedString(snapshotName)).append("\n");
    sb.append("    targetEnvironmentName: ").append(toIndentedString(targetEnvironmentName)).append("\n");
    sb.append("    targetDatabaseName: ").append(toIndentedString(targetDatabaseName)).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
    sb.append("    fromRestoreTime: ").append(toIndentedString(fromRestoreTime)).append("\n");
    sb.append("    toRestoreTime: ").append(toIndentedString(toRestoreTime)).append("\n");
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

