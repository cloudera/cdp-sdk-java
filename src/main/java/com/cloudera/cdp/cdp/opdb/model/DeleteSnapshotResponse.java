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
 * Response object of the DeleteSnapshot method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-15T17:00:47.320-07:00")
public class DeleteSnapshotResponse extends CdpResponse {

  /**
   * The name of the environment.
   **/
  private String environmentName = null;

  /**
   * The name of the database.
   **/
  private String databaseName = null;

  /**
   * The status of the delete snapshot.
   **/
  private String status = null;

  /**
   * The submitted Command ID of the delete snapshot.
   **/
  private Long commandID = null;

  /**
   * Reason for the status.
   **/
  private String statusReason = null;

  /**
   * The name of the snapshot.
   **/
  private String snapshotName = null;

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
   * Getter for status.
   * The status of the delete snapshot.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The status of the delete snapshot.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for commandID.
   * The submitted Command ID of the delete snapshot.
   **/
  @JsonProperty("commandID")
  public Long getCommandID() {
    return commandID;
  }

  /**
   * Setter for commandID.
   * The submitted Command ID of the delete snapshot.
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteSnapshotResponse deleteSnapshotResponse = (DeleteSnapshotResponse) o;
    if (!Objects.equals(this.environmentName, deleteSnapshotResponse.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.databaseName, deleteSnapshotResponse.databaseName)) {
      return false;
    }
    if (!Objects.equals(this.status, deleteSnapshotResponse.status)) {
      return false;
    }
    if (!Objects.equals(this.commandID, deleteSnapshotResponse.commandID)) {
      return false;
    }
    if (!Objects.equals(this.statusReason, deleteSnapshotResponse.statusReason)) {
      return false;
    }
    if (!Objects.equals(this.snapshotName, deleteSnapshotResponse.snapshotName)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, databaseName, status, commandID, statusReason, snapshotName, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteSnapshotResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    commandID: ").append(toIndentedString(commandID)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    snapshotName: ").append(toIndentedString(snapshotName)).append("\n");
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

