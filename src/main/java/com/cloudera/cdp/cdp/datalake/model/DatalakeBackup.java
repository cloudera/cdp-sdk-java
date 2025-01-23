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

package com.cloudera.cdp.datalake.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Backup object with details of backup performed.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-23T07:12:40.257-08:00")
public class DatalakeBackup  {

  /**
   * Name of the backup.
   **/
  private String backupName = null;

  /**
   * Account where the datalake exists.
   **/
  private String accountId = null;

  /**
   * Crn of the user who triggered this operation.
   **/
  private String userCrn = null;

  /**
   * Request to perform a from a specific status for a specific backup. Else, status of the last backup performed will be returned.
   **/
  private String backupId = null;

  /**
   * Provides the details of the internal state where the backup operation stands.
   **/
  private String internalState = null;

  /**
   * Provide the current status.
   **/
  private String status = null;

  /**
   * Time when the backup operation started.
   **/
  private String startTime = null;

  /**
   * Time when the backup operation ended.
   **/
  private String endTime = null;

  /**
   * Location of the backup to be used to perform restore.
   **/
  private String backupLocation = null;

  /**
   * Reason for the failure.
   **/
  private String failureReason = null;

  /**
   * Getter for backupName.
   * Name of the backup.
   **/
  @JsonProperty("backupName")
  public String getBackupName() {
    return backupName;
  }

  /**
   * Setter for backupName.
   * Name of the backup.
   **/
  public void setBackupName(String backupName) {
    this.backupName = backupName;
  }

  /**
   * Getter for accountId.
   * Account where the datalake exists.
   **/
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }

  /**
   * Setter for accountId.
   * Account where the datalake exists.
   **/
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * Getter for userCrn.
   * Crn of the user who triggered this operation.
   **/
  @JsonProperty("userCrn")
  public String getUserCrn() {
    return userCrn;
  }

  /**
   * Setter for userCrn.
   * Crn of the user who triggered this operation.
   **/
  public void setUserCrn(String userCrn) {
    this.userCrn = userCrn;
  }

  /**
   * Getter for backupId.
   * Request to perform a from a specific status for a specific backup. Else, status of the last backup performed will be returned.
   **/
  @JsonProperty("backupId")
  public String getBackupId() {
    return backupId;
  }

  /**
   * Setter for backupId.
   * Request to perform a from a specific status for a specific backup. Else, status of the last backup performed will be returned.
   **/
  public void setBackupId(String backupId) {
    this.backupId = backupId;
  }

  /**
   * Getter for internalState.
   * Provides the details of the internal state where the backup operation stands.
   **/
  @JsonProperty("internalState")
  public String getInternalState() {
    return internalState;
  }

  /**
   * Setter for internalState.
   * Provides the details of the internal state where the backup operation stands.
   **/
  public void setInternalState(String internalState) {
    this.internalState = internalState;
  }

  /**
   * Getter for status.
   * Provide the current status.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Provide the current status.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for startTime.
   * Time when the backup operation started.
   **/
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }

  /**
   * Setter for startTime.
   * Time when the backup operation started.
   **/
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  /**
   * Getter for endTime.
   * Time when the backup operation ended.
   **/
  @JsonProperty("endTime")
  public String getEndTime() {
    return endTime;
  }

  /**
   * Setter for endTime.
   * Time when the backup operation ended.
   **/
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  /**
   * Getter for backupLocation.
   * Location of the backup to be used to perform restore.
   **/
  @JsonProperty("backupLocation")
  public String getBackupLocation() {
    return backupLocation;
  }

  /**
   * Setter for backupLocation.
   * Location of the backup to be used to perform restore.
   **/
  public void setBackupLocation(String backupLocation) {
    this.backupLocation = backupLocation;
  }

  /**
   * Getter for failureReason.
   * Reason for the failure.
   **/
  @JsonProperty("failureReason")
  public String getFailureReason() {
    return failureReason;
  }

  /**
   * Setter for failureReason.
   * Reason for the failure.
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
    DatalakeBackup datalakeBackup = (DatalakeBackup) o;
    if (!Objects.equals(this.backupName, datalakeBackup.backupName)) {
      return false;
    }
    if (!Objects.equals(this.accountId, datalakeBackup.accountId)) {
      return false;
    }
    if (!Objects.equals(this.userCrn, datalakeBackup.userCrn)) {
      return false;
    }
    if (!Objects.equals(this.backupId, datalakeBackup.backupId)) {
      return false;
    }
    if (!Objects.equals(this.internalState, datalakeBackup.internalState)) {
      return false;
    }
    if (!Objects.equals(this.status, datalakeBackup.status)) {
      return false;
    }
    if (!Objects.equals(this.startTime, datalakeBackup.startTime)) {
      return false;
    }
    if (!Objects.equals(this.endTime, datalakeBackup.endTime)) {
      return false;
    }
    if (!Objects.equals(this.backupLocation, datalakeBackup.backupLocation)) {
      return false;
    }
    if (!Objects.equals(this.failureReason, datalakeBackup.failureReason)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupName, accountId, userCrn, backupId, internalState, status, startTime, endTime, backupLocation, failureReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatalakeBackup {\n");
    sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    userCrn: ").append(toIndentedString(userCrn)).append("\n");
    sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
    sb.append("    internalState: ").append(toIndentedString(internalState)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    backupLocation: ").append(toIndentedString(backupLocation)).append("\n");
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

