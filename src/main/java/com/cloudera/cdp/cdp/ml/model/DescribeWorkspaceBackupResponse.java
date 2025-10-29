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
import com.cloudera.cdp.ml.model.WorkspaceInstanceGroup;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * Response object for DescribeWorkspaceBackup method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-28T14:00:27.700-07:00")
public class DescribeWorkspaceBackupResponse extends CdpResponse {

  /**
   * The CRN of the backup snaphot.
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
   * Indicates whether the backup has cross namespace enabled.
   **/
  private Boolean isCrossNsBackup = null;

  /**
   * The list of instance groups.
   **/
  private List<WorkspaceInstanceGroup> instanceGroups = new ArrayList<WorkspaceInstanceGroup>();

  /**
   * Getter for backupCrn.
   * The CRN of the backup snaphot.
   **/
  @JsonProperty("backupCrn")
  public String getBackupCrn() {
    return backupCrn;
  }

  /**
   * Setter for backupCrn.
   * The CRN of the backup snaphot.
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

  /**
   * Getter for isCrossNsBackup.
   * Indicates whether the backup has cross namespace enabled.
   **/
  @JsonProperty("isCrossNsBackup")
  public Boolean getIsCrossNsBackup() {
    return isCrossNsBackup;
  }

  /**
   * Setter for isCrossNsBackup.
   * Indicates whether the backup has cross namespace enabled.
   **/
  public void setIsCrossNsBackup(Boolean isCrossNsBackup) {
    this.isCrossNsBackup = isCrossNsBackup;
  }

  /**
   * Getter for instanceGroups.
   * The list of instance groups.
   **/
  @JsonProperty("instanceGroups")
  public List<WorkspaceInstanceGroup> getInstanceGroups() {
    return instanceGroups;
  }

  /**
   * Setter for instanceGroups.
   * The list of instance groups.
   **/
  public void setInstanceGroups(List<WorkspaceInstanceGroup> instanceGroups) {
    this.instanceGroups = instanceGroups;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeWorkspaceBackupResponse describeWorkspaceBackupResponse = (DescribeWorkspaceBackupResponse) o;
    if (!Objects.equals(this.backupCrn, describeWorkspaceBackupResponse.backupCrn)) {
      return false;
    }
    if (!Objects.equals(this.backupName, describeWorkspaceBackupResponse.backupName)) {
      return false;
    }
    if (!Objects.equals(this.createdAt, describeWorkspaceBackupResponse.createdAt)) {
      return false;
    }
    if (!Objects.equals(this.creatorCrn, describeWorkspaceBackupResponse.creatorCrn)) {
      return false;
    }
    if (!Objects.equals(this.workspaceVersionAtBackup, describeWorkspaceBackupResponse.workspaceVersionAtBackup)) {
      return false;
    }
    if (!Objects.equals(this.backupStatus, describeWorkspaceBackupResponse.backupStatus)) {
      return false;
    }
    if (!Objects.equals(this.isCrossNsBackup, describeWorkspaceBackupResponse.isCrossNsBackup)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroups, describeWorkspaceBackupResponse.instanceGroups)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupCrn, backupName, createdAt, creatorCrn, workspaceVersionAtBackup, backupStatus, isCrossNsBackup, instanceGroups, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeWorkspaceBackupResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    backupCrn: ").append(toIndentedString(backupCrn)).append("\n");
    sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creatorCrn: ").append(toIndentedString(creatorCrn)).append("\n");
    sb.append("    workspaceVersionAtBackup: ").append(toIndentedString(workspaceVersionAtBackup)).append("\n");
    sb.append("    backupStatus: ").append(toIndentedString(backupStatus)).append("\n");
    sb.append("    isCrossNsBackup: ").append(toIndentedString(isCrossNsBackup)).append("\n");
    sb.append("    instanceGroups: ").append(toIndentedString(instanceGroups)).append("\n");
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

