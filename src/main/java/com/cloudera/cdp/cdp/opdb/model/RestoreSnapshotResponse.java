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
 * Response object for the RestoreSnapshot method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-14T11:34:36.573-07:00")
public class RestoreSnapshotResponse extends CdpResponse {

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
   * The status of the restore snapshot.
   **/
  private String status = null;

  /**
   * The time when the snapshot restore was started.
   **/
  private Long restoreTime = null;

  /**
   * The submitted Command ID of the restore snapshot.
   **/
  private Long commandID = null;

  /**
   * Reason for the status.
   **/
  private String statusReason = null;

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
   * Getter for status.
   * The status of the restore snapshot.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The status of the restore snapshot.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for restoreTime.
   * The time when the snapshot restore was started.
   **/
  @JsonProperty("restoreTime")
  public Long getRestoreTime() {
    return restoreTime;
  }

  /**
   * Setter for restoreTime.
   * The time when the snapshot restore was started.
   **/
  public void setRestoreTime(Long restoreTime) {
    this.restoreTime = restoreTime;
  }

  /**
   * Getter for commandID.
   * The submitted Command ID of the restore snapshot.
   **/
  @JsonProperty("commandID")
  public Long getCommandID() {
    return commandID;
  }

  /**
   * Setter for commandID.
   * The submitted Command ID of the restore snapshot.
   **/
  public void setCommandID(Long commandID) {
    this.commandID = commandID;
  }

  /**
   * Getter for statusReason.
   * Reason for the status.
   **/
  @JsonProperty("statusReason")
  public String getStatusReason() {
    return statusReason;
  }

  /**
   * Setter for statusReason.
   * Reason for the status.
   **/
  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestoreSnapshotResponse restoreSnapshotResponse = (RestoreSnapshotResponse) o;
    if (!Objects.equals(this.environmentName, restoreSnapshotResponse.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.databaseName, restoreSnapshotResponse.databaseName)) {
      return false;
    }
    if (!Objects.equals(this.snapshotName, restoreSnapshotResponse.snapshotName)) {
      return false;
    }
    if (!Objects.equals(this.targetEnvironmentName, restoreSnapshotResponse.targetEnvironmentName)) {
      return false;
    }
    if (!Objects.equals(this.targetDatabaseName, restoreSnapshotResponse.targetDatabaseName)) {
      return false;
    }
    if (!Objects.equals(this.status, restoreSnapshotResponse.status)) {
      return false;
    }
    if (!Objects.equals(this.restoreTime, restoreSnapshotResponse.restoreTime)) {
      return false;
    }
    if (!Objects.equals(this.commandID, restoreSnapshotResponse.commandID)) {
      return false;
    }
    if (!Objects.equals(this.statusReason, restoreSnapshotResponse.statusReason)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, databaseName, snapshotName, targetEnvironmentName, targetDatabaseName, status, restoreTime, commandID, statusReason, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestoreSnapshotResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    snapshotName: ").append(toIndentedString(snapshotName)).append("\n");
    sb.append("    targetEnvironmentName: ").append(toIndentedString(targetEnvironmentName)).append("\n");
    sb.append("    targetDatabaseName: ").append(toIndentedString(targetDatabaseName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
    sb.append("    commandID: ").append(toIndentedString(commandID)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
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

