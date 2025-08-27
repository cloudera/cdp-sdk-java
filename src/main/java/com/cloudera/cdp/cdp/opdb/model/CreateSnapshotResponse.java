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
 * Create Snapshot Response.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-27T10:36:30.192-07:00")
public class CreateSnapshotResponse extends CdpResponse {

  /**
   * The name of the environment.
   **/
  private String environmentName = null;

  /**
   * The name of the database.
   **/
  private String databaseName = null;

  /**
   * The status of the create snapshot.
   **/
  private String status = null;

  /**
   * When the snapshot was created.
   **/
  private Long creationTime = null;

  /**
   * The submitted Command ID of the create snapshot.
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
   * Getter for status.
   * The status of the create snapshot.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The status of the create snapshot.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for creationTime.
   * When the snapshot was created.
   **/
  @JsonProperty("creationTime")
  public Long getCreationTime() {
    return creationTime;
  }

  /**
   * Setter for creationTime.
   * When the snapshot was created.
   **/
  public void setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
  }

  /**
   * Getter for commandID.
   * The submitted Command ID of the create snapshot.
   **/
  @JsonProperty("commandID")
  public Long getCommandID() {
    return commandID;
  }

  /**
   * Setter for commandID.
   * The submitted Command ID of the create snapshot.
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
    CreateSnapshotResponse createSnapshotResponse = (CreateSnapshotResponse) o;
    if (!Objects.equals(this.environmentName, createSnapshotResponse.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.databaseName, createSnapshotResponse.databaseName)) {
      return false;
    }
    if (!Objects.equals(this.status, createSnapshotResponse.status)) {
      return false;
    }
    if (!Objects.equals(this.creationTime, createSnapshotResponse.creationTime)) {
      return false;
    }
    if (!Objects.equals(this.commandID, createSnapshotResponse.commandID)) {
      return false;
    }
    if (!Objects.equals(this.statusReason, createSnapshotResponse.statusReason)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, databaseName, status, creationTime, commandID, statusReason, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSnapshotResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
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

