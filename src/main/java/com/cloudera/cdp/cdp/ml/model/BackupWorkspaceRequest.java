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

/**
 * The request object for Cloudera AI workbench backup.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-26T09:46:34.516-07:00")
public class BackupWorkspaceRequest  {

  /**
   * CRN of the workbench to backup.
   **/
  private String workspaceCrn = null;

  /**
   * Backup name.
   **/
  private String backupName = null;

  /**
   * The timeout(in minutes) to use for the execution of the backup jobs.
   **/
  private Integer backupJobTimeoutMinutes = null;

  /**
   * Skip pre-flight validations if requested.
   **/
  private Boolean skipValidation = null;

  /**
   * Getter for workspaceCrn.
   * CRN of the workbench to backup.
   **/
  @JsonProperty("workspaceCrn")
  public String getWorkspaceCrn() {
    return workspaceCrn;
  }

  /**
   * Setter for workspaceCrn.
   * CRN of the workbench to backup.
   **/
  public void setWorkspaceCrn(String workspaceCrn) {
    this.workspaceCrn = workspaceCrn;
  }

  /**
   * Getter for backupName.
   * Backup name.
   **/
  @JsonProperty("backupName")
  public String getBackupName() {
    return backupName;
  }

  /**
   * Setter for backupName.
   * Backup name.
   **/
  public void setBackupName(String backupName) {
    this.backupName = backupName;
  }

  /**
   * Getter for backupJobTimeoutMinutes.
   * The timeout(in minutes) to use for the execution of the backup jobs.
   **/
  @JsonProperty("backupJobTimeoutMinutes")
  public Integer getBackupJobTimeoutMinutes() {
    return backupJobTimeoutMinutes;
  }

  /**
   * Setter for backupJobTimeoutMinutes.
   * The timeout(in minutes) to use for the execution of the backup jobs.
   **/
  public void setBackupJobTimeoutMinutes(Integer backupJobTimeoutMinutes) {
    this.backupJobTimeoutMinutes = backupJobTimeoutMinutes;
  }

  /**
   * Getter for skipValidation.
   * Skip pre-flight validations if requested.
   **/
  @JsonProperty("skipValidation")
  public Boolean getSkipValidation() {
    return skipValidation;
  }

  /**
   * Setter for skipValidation.
   * Skip pre-flight validations if requested.
   **/
  public void setSkipValidation(Boolean skipValidation) {
    this.skipValidation = skipValidation;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupWorkspaceRequest backupWorkspaceRequest = (BackupWorkspaceRequest) o;
    if (!Objects.equals(this.workspaceCrn, backupWorkspaceRequest.workspaceCrn)) {
      return false;
    }
    if (!Objects.equals(this.backupName, backupWorkspaceRequest.backupName)) {
      return false;
    }
    if (!Objects.equals(this.backupJobTimeoutMinutes, backupWorkspaceRequest.backupJobTimeoutMinutes)) {
      return false;
    }
    if (!Objects.equals(this.skipValidation, backupWorkspaceRequest.skipValidation)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceCrn, backupName, backupJobTimeoutMinutes, skipValidation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupWorkspaceRequest {\n");
    sb.append("    workspaceCrn: ").append(toIndentedString(workspaceCrn)).append("\n");
    sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
    sb.append("    backupJobTimeoutMinutes: ").append(toIndentedString(backupJobTimeoutMinutes)).append("\n");
    sb.append("    skipValidation: ").append(toIndentedString(skipValidation)).append("\n");
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

