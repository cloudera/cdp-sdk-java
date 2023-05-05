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

package com.cloudera.cdp.drscp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * A simple backup entry for listBackup usage
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-05-04T19:25:15.071-07:00")
public class SimpleBackup  {

  /**
   * The unique CRN of the backup.
   **/
  private String backupCrn = null;

  /**
   * The display name of the backup.
   **/
  private String backupName = null;

  /**
   * The time when the backup was created.
   **/
  private String backupCreationTime = null;

  /**
   * The phase of the backup operation. The values are PENDING, PRE_VALIDATION, SAVING_OBJECTS, CREATING_SNAPSHOTS and FINISHED. PENDING indicates waiting for the job to start executing. PRE_VALIDATION indicates validation of the environment before backup. SAVING_OBJECTS indicates saving all the kubernetes resources related to the backup item. CREATING_SNAPSHOTS indicates creating a snapshot of all Kubernetes PersistentVolumeClaims related to the backup item and FINISHED indicates that the backup job has finished.
   **/
  private String backupPhase = null;

  /**
   * The current state of the backup job. The values are NOT_STARTED, IN_PROGRESS, COMPLETED, PARTIALLY_FAILED, FAILED and TERMINATING. NOT_STARTED indicates the job has not started. IN_PROGRESS indicates the job is running. COMPLETED indicates the job has finished running successfully. PARTIALLY_FAILED indicates the job has finished running with some warnings. FAILED indicates the job has finished running with errors and TERMINATING indicates that the entity containing this job is being deleted.
   **/
  private String backupJobState = null;

  /**
   * Getter for backupCrn.
   * The unique CRN of the backup.
   **/
  @JsonProperty("backupCrn")
  public String getBackupCrn() {
    return backupCrn;
  }

  /**
   * Setter for backupCrn.
   * The unique CRN of the backup.
   **/
  public void setBackupCrn(String backupCrn) {
    this.backupCrn = backupCrn;
  }

  /**
   * Getter for backupName.
   * The display name of the backup.
   **/
  @JsonProperty("backupName")
  public String getBackupName() {
    return backupName;
  }

  /**
   * Setter for backupName.
   * The display name of the backup.
   **/
  public void setBackupName(String backupName) {
    this.backupName = backupName;
  }

  /**
   * Getter for backupCreationTime.
   * The time when the backup was created.
   **/
  @JsonProperty("backupCreationTime")
  public String getBackupCreationTime() {
    return backupCreationTime;
  }

  /**
   * Setter for backupCreationTime.
   * The time when the backup was created.
   **/
  public void setBackupCreationTime(String backupCreationTime) {
    this.backupCreationTime = backupCreationTime;
  }

  /**
   * Getter for backupPhase.
   * The phase of the backup operation. The values are PENDING, PRE_VALIDATION, SAVING_OBJECTS, CREATING_SNAPSHOTS and FINISHED. PENDING indicates waiting for the job to start executing. PRE_VALIDATION indicates validation of the environment before backup. SAVING_OBJECTS indicates saving all the kubernetes resources related to the backup item. CREATING_SNAPSHOTS indicates creating a snapshot of all Kubernetes PersistentVolumeClaims related to the backup item and FINISHED indicates that the backup job has finished.
   **/
  @JsonProperty("backupPhase")
  public String getBackupPhase() {
    return backupPhase;
  }

  /**
   * Setter for backupPhase.
   * The phase of the backup operation. The values are PENDING, PRE_VALIDATION, SAVING_OBJECTS, CREATING_SNAPSHOTS and FINISHED. PENDING indicates waiting for the job to start executing. PRE_VALIDATION indicates validation of the environment before backup. SAVING_OBJECTS indicates saving all the kubernetes resources related to the backup item. CREATING_SNAPSHOTS indicates creating a snapshot of all Kubernetes PersistentVolumeClaims related to the backup item and FINISHED indicates that the backup job has finished.
   **/
  public void setBackupPhase(String backupPhase) {
    this.backupPhase = backupPhase;
  }

  /**
   * Getter for backupJobState.
   * The current state of the backup job. The values are NOT_STARTED, IN_PROGRESS, COMPLETED, PARTIALLY_FAILED, FAILED and TERMINATING. NOT_STARTED indicates the job has not started. IN_PROGRESS indicates the job is running. COMPLETED indicates the job has finished running successfully. PARTIALLY_FAILED indicates the job has finished running with some warnings. FAILED indicates the job has finished running with errors and TERMINATING indicates that the entity containing this job is being deleted.
   **/
  @JsonProperty("backupJobState")
  public String getBackupJobState() {
    return backupJobState;
  }

  /**
   * Setter for backupJobState.
   * The current state of the backup job. The values are NOT_STARTED, IN_PROGRESS, COMPLETED, PARTIALLY_FAILED, FAILED and TERMINATING. NOT_STARTED indicates the job has not started. IN_PROGRESS indicates the job is running. COMPLETED indicates the job has finished running successfully. PARTIALLY_FAILED indicates the job has finished running with some warnings. FAILED indicates the job has finished running with errors and TERMINATING indicates that the entity containing this job is being deleted.
   **/
  public void setBackupJobState(String backupJobState) {
    this.backupJobState = backupJobState;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleBackup simpleBackup = (SimpleBackup) o;
    if (!Objects.equals(this.backupCrn, simpleBackup.backupCrn)) {
      return false;
    }
    if (!Objects.equals(this.backupName, simpleBackup.backupName)) {
      return false;
    }
    if (!Objects.equals(this.backupCreationTime, simpleBackup.backupCreationTime)) {
      return false;
    }
    if (!Objects.equals(this.backupPhase, simpleBackup.backupPhase)) {
      return false;
    }
    if (!Objects.equals(this.backupJobState, simpleBackup.backupJobState)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupCrn, backupName, backupCreationTime, backupPhase, backupJobState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleBackup {\n");
    sb.append("    backupCrn: ").append(toIndentedString(backupCrn)).append("\n");
    sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
    sb.append("    backupCreationTime: ").append(toIndentedString(backupCreationTime)).append("\n");
    sb.append("    backupPhase: ").append(toIndentedString(backupPhase)).append("\n");
    sb.append("    backupJobState: ").append(toIndentedString(backupJobState)).append("\n");
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

