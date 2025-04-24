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
 * An instance of a table&#39;s snapshot.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-04-23T14:14:35.926-07:00")
public class Snapshot  {

  /**
   * The id of the snapshot.
   **/
  private Long snapshotId = null;

  /**
   * The table name.
   **/
  private String tableName = null;

  /**
   * The name of the snapshot.
   **/
  private String snapshotName = null;

  /**
   * The creation time of the snapshot.
   **/
  private Long creationTime = null;

  /**
   * The status of the snapshot.
   **/
  private String status = null;

  /**
   * The submitted Command ID of the snapshot.
   **/
  private Long commandID = null;

  /**
   * The location of the snapshot.
   **/
  private String snapshotLocation = null;

  /**
   * Reason for the failure in case of snapshot creation failed.
   **/
  private String failureReason = null;

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
   * Getter for creationTime.
   * The creation time of the snapshot.
   **/
  @JsonProperty("creationTime")
  public Long getCreationTime() {
    return creationTime;
  }

  /**
   * Setter for creationTime.
   * The creation time of the snapshot.
   **/
  public void setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
  }

  /**
   * Getter for status.
   * The status of the snapshot.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The status of the snapshot.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for commandID.
   * The submitted Command ID of the snapshot.
   **/
  @JsonProperty("commandID")
  public Long getCommandID() {
    return commandID;
  }

  /**
   * Setter for commandID.
   * The submitted Command ID of the snapshot.
   **/
  public void setCommandID(Long commandID) {
    this.commandID = commandID;
  }

  /**
   * Getter for snapshotLocation.
   * The location of the snapshot.
   **/
  @JsonProperty("snapshotLocation")
  public String getSnapshotLocation() {
    return snapshotLocation;
  }

  /**
   * Setter for snapshotLocation.
   * The location of the snapshot.
   **/
  public void setSnapshotLocation(String snapshotLocation) {
    this.snapshotLocation = snapshotLocation;
  }

  /**
   * Getter for failureReason.
   * Reason for the failure in case of snapshot creation failed.
   **/
  @JsonProperty("failureReason")
  public String getFailureReason() {
    return failureReason;
  }

  /**
   * Setter for failureReason.
   * Reason for the failure in case of snapshot creation failed.
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
    Snapshot snapshot = (Snapshot) o;
    if (!Objects.equals(this.snapshotId, snapshot.snapshotId)) {
      return false;
    }
    if (!Objects.equals(this.tableName, snapshot.tableName)) {
      return false;
    }
    if (!Objects.equals(this.snapshotName, snapshot.snapshotName)) {
      return false;
    }
    if (!Objects.equals(this.creationTime, snapshot.creationTime)) {
      return false;
    }
    if (!Objects.equals(this.status, snapshot.status)) {
      return false;
    }
    if (!Objects.equals(this.commandID, snapshot.commandID)) {
      return false;
    }
    if (!Objects.equals(this.snapshotLocation, snapshot.snapshotLocation)) {
      return false;
    }
    if (!Objects.equals(this.failureReason, snapshot.failureReason)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotId, tableName, snapshotName, creationTime, status, commandID, snapshotLocation, failureReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Snapshot {\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    snapshotName: ").append(toIndentedString(snapshotName)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    commandID: ").append(toIndentedString(commandID)).append("\n");
    sb.append("    snapshotLocation: ").append(toIndentedString(snapshotLocation)).append("\n");
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

