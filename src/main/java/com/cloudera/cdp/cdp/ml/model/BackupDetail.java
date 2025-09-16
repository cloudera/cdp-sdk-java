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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.time.ZonedDateTime;

/**
 * Backup Detail response object for listing backups.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-16T07:43:42.881-07:00")
public class BackupDetail  {

  /**
   * The CRN of the backup snapshot.
   **/
  private String backupCrn = null;

  /**
   * The name of the backup snapshot.
   **/
  private String backupName = null;

  /**
   * The creation time of the backup snapshot.
   **/
  private ZonedDateTime createdAt = null;

  /**
   * The CRN of the creator.
   **/
  private String creatorCrn = null;

  /**
   * The version of the backed-up workbench at the time of backup.
   **/
  private String workspaceVersionAtBackup = null;

  /**
   * The status of the backup.
   **/
  private String backupStatus = null;

  /**
   * Getter for backupCrn.
   * The CRN of the backup snapshot.
   **/
  @JsonProperty("backupCrn")
  public String getBackupCrn() {
    return backupCrn;
  }

  /**
   * Setter for backupCrn.
   * The CRN of the backup snapshot.
   **/
  public void setBackupCrn(String backupCrn) {
    this.backupCrn = backupCrn;
  }

  /**
   * Getter for backupName.
   * The name of the backup snapshot.
   **/
  @JsonProperty("backupName")
  public String getBackupName() {
    return backupName;
  }

  /**
   * Setter for backupName.
   * The name of the backup snapshot.
   **/
  public void setBackupName(String backupName) {
    this.backupName = backupName;
  }

  /**
   * Getter for createdAt.
   * The creation time of the backup snapshot.
   **/
  @JsonProperty("createdAt")
  public ZonedDateTime getCreatedAt() {
    return createdAt;
  }

  /**
   * Setter for createdAt.
   * The creation time of the backup snapshot.
   **/
  public void setCreatedAt(ZonedDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Getter for creatorCrn.
   * The CRN of the creator.
   **/
  @JsonProperty("creatorCrn")
  public String getCreatorCrn() {
    return creatorCrn;
  }

  /**
   * Setter for creatorCrn.
   * The CRN of the creator.
   **/
  public void setCreatorCrn(String creatorCrn) {
    this.creatorCrn = creatorCrn;
  }

  /**
   * Getter for workspaceVersionAtBackup.
   * The version of the backed-up workbench at the time of backup.
   **/
  @JsonProperty("workspaceVersionAtBackup")
  public String getWorkspaceVersionAtBackup() {
    return workspaceVersionAtBackup;
  }

  /**
   * Setter for workspaceVersionAtBackup.
   * The version of the backed-up workbench at the time of backup.
   **/
  public void setWorkspaceVersionAtBackup(String workspaceVersionAtBackup) {
    this.workspaceVersionAtBackup = workspaceVersionAtBackup;
  }

  /**
   * Getter for backupStatus.
   * The status of the backup.
   **/
  @JsonProperty("backupStatus")
  public String getBackupStatus() {
    return backupStatus;
  }

  /**
   * Setter for backupStatus.
   * The status of the backup.
   **/
  public void setBackupStatus(String backupStatus) {
    this.backupStatus = backupStatus;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupDetail backupDetail = (BackupDetail) o;
    if (!Objects.equals(this.backupCrn, backupDetail.backupCrn)) {
      return false;
    }
    if (!Objects.equals(this.backupName, backupDetail.backupName)) {
      return false;
    }
    if (!Objects.equals(this.createdAt, backupDetail.createdAt)) {
      return false;
    }
    if (!Objects.equals(this.creatorCrn, backupDetail.creatorCrn)) {
      return false;
    }
    if (!Objects.equals(this.workspaceVersionAtBackup, backupDetail.workspaceVersionAtBackup)) {
      return false;
    }
    if (!Objects.equals(this.backupStatus, backupDetail.backupStatus)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupCrn, backupName, createdAt, creatorCrn, workspaceVersionAtBackup, backupStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupDetail {\n");
    sb.append("    backupCrn: ").append(toIndentedString(backupCrn)).append("\n");
    sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creatorCrn: ").append(toIndentedString(creatorCrn)).append("\n");
    sb.append("    workspaceVersionAtBackup: ").append(toIndentedString(workspaceVersionAtBackup)).append("\n");
    sb.append("    backupStatus: ").append(toIndentedString(backupStatus)).append("\n");
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

