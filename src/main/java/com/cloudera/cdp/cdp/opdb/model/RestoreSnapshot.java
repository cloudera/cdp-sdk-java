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
 * An instance of restoring a snapshot to a database.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-14T11:34:36.573-07:00")
public class RestoreSnapshot  {

  /**
   * The id of the restore snapshot.
   **/
  private Long restoreId = null;

  /**
   * The id of the snapshot.
   **/
  private Long snapshotId = null;

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
   * Reason for the failure in case of restore snapshot failed.
   **/
  private String failureReason = null;

  /**
   * Getter for restoreId.
   * The id of the restore snapshot.
   **/
  @JsonProperty("restoreId")
  public Long getRestoreId() {
    return restoreId;
  }

  /**
   * Setter for restoreId.
   * The id of the restore snapshot.
   **/
  public void setRestoreId(Long restoreId) {
    this.restoreId = restoreId;
  }

  /**
   * Getter for snapshotId.
   * The id of the snapshot.
   **/
  @JsonProperty("snapshotId")
  public Long getSnapshotId() {
    return snapshotId;
  }

  /**
   * Setter for snapshotId.
   * The id of the snapshot.
   **/
  public void setSnapshotId(Long snapshotId) {
    this.snapshotId = snapshotId;
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
   * Getter for failureReason.
   * Reason for the failure in case of restore snapshot failed.
   **/
  @JsonProperty("failureReason")
  public String getFailureReason() {
    return failureReason;
  }

  /**
   * Setter for failureReason.
   * Reason for the failure in case of restore snapshot failed.
   **/
  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestoreSnapshot restoreSnapshot = (RestoreSnapshot) o;
    if (!Objects.equals(this.restoreId, restoreSnapshot.restoreId)) {
      return false;
    }
    if (!Objects.equals(this.snapshotId, restoreSnapshot.snapshotId)) {
      return false;
    }
    if (!Objects.equals(this.snapshotName, restoreSnapshot.snapshotName)) {
      return false;
    }
    if (!Objects.equals(this.targetEnvironmentName, restoreSnapshot.targetEnvironmentName)) {
      return false;
    }
    if (!Objects.equals(this.targetDatabaseName, restoreSnapshot.targetDatabaseName)) {
      return false;
    }
    if (!Objects.equals(this.status, restoreSnapshot.status)) {
      return false;
    }
    if (!Objects.equals(this.restoreTime, restoreSnapshot.restoreTime)) {
      return false;
    }
    if (!Objects.equals(this.commandID, restoreSnapshot.commandID)) {
      return false;
    }
    if (!Objects.equals(this.failureReason, restoreSnapshot.failureReason)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(restoreId, snapshotId, snapshotName, targetEnvironmentName, targetDatabaseName, status, restoreTime, commandID, failureReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestoreSnapshot {\n");
    sb.append("    restoreId: ").append(toIndentedString(restoreId)).append("\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    snapshotName: ").append(toIndentedString(snapshotName)).append("\n");
    sb.append("    targetEnvironmentName: ").append(toIndentedString(targetEnvironmentName)).append("\n");
    sb.append("    targetDatabaseName: ").append(toIndentedString(targetDatabaseName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
    sb.append("    commandID: ").append(toIndentedString(commandID)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
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

