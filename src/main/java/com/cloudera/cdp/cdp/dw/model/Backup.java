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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.dw.model.Message;
import java.util.*;

/**
 * Backup entry
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-08-30T17:23:15.372-07:00")
public class Backup  {

  /**
   * The CRN of the backup.
   **/
  private String backupCrn = null;

  /**
   * The time when the backup was created.
   **/
  private String backupCreationTime = null;

  /**
   * The display name of the backup.
   **/
  private String backupName = null;

  /**
   * The time when the backup was updated.
   **/
  private String backupUpdatedTime = null;

  /**
   * The phase of the backup operation.
   **/
  private String backupPhase = null;

  /**
   * The current state of the backup job.
   **/
  private String backupJobState = null;

  /**
   * The backup job name.
   **/
  private String backupJob = null;

  /**
   * The list of namespaces to be included in backup.
   **/
  private List<String> includedNamespaces = new ArrayList<String>();

  /**
   * The warnings from backup job.
   **/
  private List<Message> warnings = new ArrayList<Message>();

  /**
   * The errors from backup job.
   **/
  private List<Message> errors = new ArrayList<Message>();

  /**
   * Getter for backupCrn.
   * The CRN of the backup.
   **/
  @JsonProperty("backupCrn")
  public String getBackupCrn() {
    return backupCrn;
  }

  /**
   * Setter for backupCrn.
   * The CRN of the backup.
   **/
  public void setBackupCrn(String backupCrn) {
    this.backupCrn = backupCrn;
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
   * Getter for backupUpdatedTime.
   * The time when the backup was updated.
   **/
  @JsonProperty("backupUpdatedTime")
  public String getBackupUpdatedTime() {
    return backupUpdatedTime;
  }

  /**
   * Setter for backupUpdatedTime.
   * The time when the backup was updated.
   **/
  public void setBackupUpdatedTime(String backupUpdatedTime) {
    this.backupUpdatedTime = backupUpdatedTime;
  }

  /**
   * Getter for backupPhase.
   * The phase of the backup operation.
   **/
  @JsonProperty("backupPhase")
  public String getBackupPhase() {
    return backupPhase;
  }

  /**
   * Setter for backupPhase.
   * The phase of the backup operation.
   **/
  public void setBackupPhase(String backupPhase) {
    this.backupPhase = backupPhase;
  }

  /**
   * Getter for backupJobState.
   * The current state of the backup job.
   **/
  @JsonProperty("backupJobState")
  public String getBackupJobState() {
    return backupJobState;
  }

  /**
   * Setter for backupJobState.
   * The current state of the backup job.
   **/
  public void setBackupJobState(String backupJobState) {
    this.backupJobState = backupJobState;
  }

  /**
   * Getter for backupJob.
   * The backup job name.
   **/
  @JsonProperty("backupJob")
  public String getBackupJob() {
    return backupJob;
  }

  /**
   * Setter for backupJob.
   * The backup job name.
   **/
  public void setBackupJob(String backupJob) {
    this.backupJob = backupJob;
  }

  /**
   * Getter for includedNamespaces.
   * The list of namespaces to be included in backup.
   **/
  @JsonProperty("includedNamespaces")
  public List<String> getIncludedNamespaces() {
    return includedNamespaces;
  }

  /**
   * Setter for includedNamespaces.
   * The list of namespaces to be included in backup.
   **/
  public void setIncludedNamespaces(List<String> includedNamespaces) {
    this.includedNamespaces = includedNamespaces;
  }

  /**
   * Getter for warnings.
   * The warnings from backup job.
   **/
  @JsonProperty("warnings")
  public List<Message> getWarnings() {
    return warnings;
  }

  /**
   * Setter for warnings.
   * The warnings from backup job.
   **/
  public void setWarnings(List<Message> warnings) {
    this.warnings = warnings;
  }

  /**
   * Getter for errors.
   * The errors from backup job.
   **/
  @JsonProperty("errors")
  public List<Message> getErrors() {
    return errors;
  }

  /**
   * Setter for errors.
   * The errors from backup job.
   **/
  public void setErrors(List<Message> errors) {
    this.errors = errors;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Backup backup = (Backup) o;
    if (!Objects.equals(this.backupCrn, backup.backupCrn)) {
      return false;
    }
    if (!Objects.equals(this.backupCreationTime, backup.backupCreationTime)) {
      return false;
    }
    if (!Objects.equals(this.backupName, backup.backupName)) {
      return false;
    }
    if (!Objects.equals(this.backupUpdatedTime, backup.backupUpdatedTime)) {
      return false;
    }
    if (!Objects.equals(this.backupPhase, backup.backupPhase)) {
      return false;
    }
    if (!Objects.equals(this.backupJobState, backup.backupJobState)) {
      return false;
    }
    if (!Objects.equals(this.backupJob, backup.backupJob)) {
      return false;
    }
    if (!Objects.equals(this.includedNamespaces, backup.includedNamespaces)) {
      return false;
    }
    if (!Objects.equals(this.warnings, backup.warnings)) {
      return false;
    }
    if (!Objects.equals(this.errors, backup.errors)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupCrn, backupCreationTime, backupName, backupUpdatedTime, backupPhase, backupJobState, backupJob, includedNamespaces, warnings, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Backup {\n");
    sb.append("    backupCrn: ").append(toIndentedString(backupCrn)).append("\n");
    sb.append("    backupCreationTime: ").append(toIndentedString(backupCreationTime)).append("\n");
    sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
    sb.append("    backupUpdatedTime: ").append(toIndentedString(backupUpdatedTime)).append("\n");
    sb.append("    backupPhase: ").append(toIndentedString(backupPhase)).append("\n");
    sb.append("    backupJobState: ").append(toIndentedString(backupJobState)).append("\n");
    sb.append("    backupJob: ").append(toIndentedString(backupJob)).append("\n");
    sb.append("    includedNamespaces: ").append(toIndentedString(includedNamespaces)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

