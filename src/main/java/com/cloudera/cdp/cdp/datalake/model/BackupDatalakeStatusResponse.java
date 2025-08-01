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
import com.cloudera.cdp.datalake.model.InternalBackupRestoreState;

/**
 * Response object to get the status of datalake backup status request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:42.225-07:00")
public class BackupDatalakeStatusResponse extends CdpResponse {

  /**
   * Account where the datalake exists.
   **/
  private String accountId = null;

  /**
   * Unique identifier for the backup requested.
   **/
  private String backupId = null;

  /**
   * Crn of the user who triggered this operation.
   **/
  private String userCrn = null;

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
   * Provides the details of the internal state of each operation.
   **/
  private InternalBackupRestoreState operationStates = null;

  /**
   * The runtime version of the datalake when the backup was taken.
   **/
  private String runtimeVersion = null;

  /**
   * Name of the backup.
   **/
  private String backupName = null;

  /**
   * Reason for the failure.
   **/
  private String failureReason = null;

  /**
   * Predicted total duration for the backup process, in minutes.
   **/
  private String totalPredictedDurationInMinutes = null;

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
   * Getter for backupId.
   * Unique identifier for the backup requested.
   **/
  @JsonProperty("backupId")
  public String getBackupId() {
    return backupId;
  }

  /**
   * Setter for backupId.
   * Unique identifier for the backup requested.
   **/
  public void setBackupId(String backupId) {
    this.backupId = backupId;
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
   * Getter for operationStates.
   * Provides the details of the internal state of each operation.
   **/
  @JsonProperty("operationStates")
  public InternalBackupRestoreState getOperationStates() {
    return operationStates;
  }

  /**
   * Setter for operationStates.
   * Provides the details of the internal state of each operation.
   **/
  public void setOperationStates(InternalBackupRestoreState operationStates) {
    this.operationStates = operationStates;
  }

  /**
   * Getter for runtimeVersion.
   * The runtime version of the datalake when the backup was taken.
   **/
  @JsonProperty("runtimeVersion")
  public String getRuntimeVersion() {
    return runtimeVersion;
  }

  /**
   * Setter for runtimeVersion.
   * The runtime version of the datalake when the backup was taken.
   **/
  public void setRuntimeVersion(String runtimeVersion) {
    this.runtimeVersion = runtimeVersion;
  }

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

  /**
   * Getter for totalPredictedDurationInMinutes.
   * Predicted total duration for the backup process, in minutes.
   **/
  @JsonProperty("totalPredictedDurationInMinutes")
  public String getTotalPredictedDurationInMinutes() {
    return totalPredictedDurationInMinutes;
  }

  /**
   * Setter for totalPredictedDurationInMinutes.
   * Predicted total duration for the backup process, in minutes.
   **/
  public void setTotalPredictedDurationInMinutes(String totalPredictedDurationInMinutes) {
    this.totalPredictedDurationInMinutes = totalPredictedDurationInMinutes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupDatalakeStatusResponse backupDatalakeStatusResponse = (BackupDatalakeStatusResponse) o;
    if (!Objects.equals(this.accountId, backupDatalakeStatusResponse.accountId)) {
      return false;
    }
    if (!Objects.equals(this.backupId, backupDatalakeStatusResponse.backupId)) {
      return false;
    }
    if (!Objects.equals(this.userCrn, backupDatalakeStatusResponse.userCrn)) {
      return false;
    }
    if (!Objects.equals(this.internalState, backupDatalakeStatusResponse.internalState)) {
      return false;
    }
    if (!Objects.equals(this.status, backupDatalakeStatusResponse.status)) {
      return false;
    }
    if (!Objects.equals(this.startTime, backupDatalakeStatusResponse.startTime)) {
      return false;
    }
    if (!Objects.equals(this.endTime, backupDatalakeStatusResponse.endTime)) {
      return false;
    }
    if (!Objects.equals(this.backupLocation, backupDatalakeStatusResponse.backupLocation)) {
      return false;
    }
    if (!Objects.equals(this.operationStates, backupDatalakeStatusResponse.operationStates)) {
      return false;
    }
    if (!Objects.equals(this.runtimeVersion, backupDatalakeStatusResponse.runtimeVersion)) {
      return false;
    }
    if (!Objects.equals(this.backupName, backupDatalakeStatusResponse.backupName)) {
      return false;
    }
    if (!Objects.equals(this.failureReason, backupDatalakeStatusResponse.failureReason)) {
      return false;
    }
    if (!Objects.equals(this.totalPredictedDurationInMinutes, backupDatalakeStatusResponse.totalPredictedDurationInMinutes)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, backupId, userCrn, internalState, status, startTime, endTime, backupLocation, operationStates, runtimeVersion, backupName, failureReason, totalPredictedDurationInMinutes, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupDatalakeStatusResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
    sb.append("    userCrn: ").append(toIndentedString(userCrn)).append("\n");
    sb.append("    internalState: ").append(toIndentedString(internalState)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    backupLocation: ").append(toIndentedString(backupLocation)).append("\n");
    sb.append("    operationStates: ").append(toIndentedString(operationStates)).append("\n");
    sb.append("    runtimeVersion: ").append(toIndentedString(runtimeVersion)).append("\n");
    sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    totalPredictedDurationInMinutes: ").append(toIndentedString(totalPredictedDurationInMinutes)).append("\n");
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

