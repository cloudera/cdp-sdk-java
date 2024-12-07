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
 * Restore entry
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-06T11:27:15.173-08:00")
public class Restore  {

  /**
   * The CRN of the restore.
   **/
  private String restoreCrn = null;

  /**
   * The CRN of the backup.
   **/
  private String backupCrn = null;

  /**
   * The time when the restore was created.
   **/
  private String restoreCreationTime = null;

  /**
   * The updated time of the restore.
   **/
  private String restoreUpdatedTime = null;

  /**
   * The list of resources to be excluded in restore.
   **/
  private List<String> excludedResources = new ArrayList<String>();

  /**
   * The list of namespaces to be included in restore.
   **/
  private List<String> includedNamespaces = new ArrayList<String>();

  /**
   * The list of conditions to be met for a successful restore.
   **/
  private List<String> successConditions = new ArrayList<String>();

  /**
   * The phase of the restore operation.
   **/
  private String restorePhase = null;

  /**
   * The current state of the restore job.
   **/
  private String restoreJobState = null;

  /**
   * The restore job name.
   **/
  private String restoreJob = null;

  /**
   * The warnings from restore job.
   **/
  private List<Message> warnings = new ArrayList<Message>();

  /**
   * The errors from restore job.
   **/
  private List<Message> errors = new ArrayList<Message>();

  /**
   * Getter for restoreCrn.
   * The CRN of the restore.
   **/
  @JsonProperty("restoreCrn")
  public String getRestoreCrn() {
    return restoreCrn;
  }

  /**
   * Setter for restoreCrn.
   * The CRN of the restore.
   **/
  public void setRestoreCrn(String restoreCrn) {
    this.restoreCrn = restoreCrn;
  }

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
   * Getter for restoreCreationTime.
   * The time when the restore was created.
   **/
  @JsonProperty("restoreCreationTime")
  public String getRestoreCreationTime() {
    return restoreCreationTime;
  }

  /**
   * Setter for restoreCreationTime.
   * The time when the restore was created.
   **/
  public void setRestoreCreationTime(String restoreCreationTime) {
    this.restoreCreationTime = restoreCreationTime;
  }

  /**
   * Getter for restoreUpdatedTime.
   * The updated time of the restore.
   **/
  @JsonProperty("restoreUpdatedTime")
  public String getRestoreUpdatedTime() {
    return restoreUpdatedTime;
  }

  /**
   * Setter for restoreUpdatedTime.
   * The updated time of the restore.
   **/
  public void setRestoreUpdatedTime(String restoreUpdatedTime) {
    this.restoreUpdatedTime = restoreUpdatedTime;
  }

  /**
   * Getter for excludedResources.
   * The list of resources to be excluded in restore.
   **/
  @JsonProperty("excludedResources")
  public List<String> getExcludedResources() {
    return excludedResources;
  }

  /**
   * Setter for excludedResources.
   * The list of resources to be excluded in restore.
   **/
  public void setExcludedResources(List<String> excludedResources) {
    this.excludedResources = excludedResources;
  }

  /**
   * Getter for includedNamespaces.
   * The list of namespaces to be included in restore.
   **/
  @JsonProperty("includedNamespaces")
  public List<String> getIncludedNamespaces() {
    return includedNamespaces;
  }

  /**
   * Setter for includedNamespaces.
   * The list of namespaces to be included in restore.
   **/
  public void setIncludedNamespaces(List<String> includedNamespaces) {
    this.includedNamespaces = includedNamespaces;
  }

  /**
   * Getter for successConditions.
   * The list of conditions to be met for a successful restore.
   **/
  @JsonProperty("successConditions")
  public List<String> getSuccessConditions() {
    return successConditions;
  }

  /**
   * Setter for successConditions.
   * The list of conditions to be met for a successful restore.
   **/
  public void setSuccessConditions(List<String> successConditions) {
    this.successConditions = successConditions;
  }

  /**
   * Getter for restorePhase.
   * The phase of the restore operation.
   **/
  @JsonProperty("restorePhase")
  public String getRestorePhase() {
    return restorePhase;
  }

  /**
   * Setter for restorePhase.
   * The phase of the restore operation.
   **/
  public void setRestorePhase(String restorePhase) {
    this.restorePhase = restorePhase;
  }

  /**
   * Getter for restoreJobState.
   * The current state of the restore job.
   **/
  @JsonProperty("restoreJobState")
  public String getRestoreJobState() {
    return restoreJobState;
  }

  /**
   * Setter for restoreJobState.
   * The current state of the restore job.
   **/
  public void setRestoreJobState(String restoreJobState) {
    this.restoreJobState = restoreJobState;
  }

  /**
   * Getter for restoreJob.
   * The restore job name.
   **/
  @JsonProperty("restoreJob")
  public String getRestoreJob() {
    return restoreJob;
  }

  /**
   * Setter for restoreJob.
   * The restore job name.
   **/
  public void setRestoreJob(String restoreJob) {
    this.restoreJob = restoreJob;
  }

  /**
   * Getter for warnings.
   * The warnings from restore job.
   **/
  @JsonProperty("warnings")
  public List<Message> getWarnings() {
    return warnings;
  }

  /**
   * Setter for warnings.
   * The warnings from restore job.
   **/
  public void setWarnings(List<Message> warnings) {
    this.warnings = warnings;
  }

  /**
   * Getter for errors.
   * The errors from restore job.
   **/
  @JsonProperty("errors")
  public List<Message> getErrors() {
    return errors;
  }

  /**
   * Setter for errors.
   * The errors from restore job.
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
    Restore restore = (Restore) o;
    if (!Objects.equals(this.restoreCrn, restore.restoreCrn)) {
      return false;
    }
    if (!Objects.equals(this.backupCrn, restore.backupCrn)) {
      return false;
    }
    if (!Objects.equals(this.restoreCreationTime, restore.restoreCreationTime)) {
      return false;
    }
    if (!Objects.equals(this.restoreUpdatedTime, restore.restoreUpdatedTime)) {
      return false;
    }
    if (!Objects.equals(this.excludedResources, restore.excludedResources)) {
      return false;
    }
    if (!Objects.equals(this.includedNamespaces, restore.includedNamespaces)) {
      return false;
    }
    if (!Objects.equals(this.successConditions, restore.successConditions)) {
      return false;
    }
    if (!Objects.equals(this.restorePhase, restore.restorePhase)) {
      return false;
    }
    if (!Objects.equals(this.restoreJobState, restore.restoreJobState)) {
      return false;
    }
    if (!Objects.equals(this.restoreJob, restore.restoreJob)) {
      return false;
    }
    if (!Objects.equals(this.warnings, restore.warnings)) {
      return false;
    }
    if (!Objects.equals(this.errors, restore.errors)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(restoreCrn, backupCrn, restoreCreationTime, restoreUpdatedTime, excludedResources, includedNamespaces, successConditions, restorePhase, restoreJobState, restoreJob, warnings, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Restore {\n");
    sb.append("    restoreCrn: ").append(toIndentedString(restoreCrn)).append("\n");
    sb.append("    backupCrn: ").append(toIndentedString(backupCrn)).append("\n");
    sb.append("    restoreCreationTime: ").append(toIndentedString(restoreCreationTime)).append("\n");
    sb.append("    restoreUpdatedTime: ").append(toIndentedString(restoreUpdatedTime)).append("\n");
    sb.append("    excludedResources: ").append(toIndentedString(excludedResources)).append("\n");
    sb.append("    includedNamespaces: ").append(toIndentedString(includedNamespaces)).append("\n");
    sb.append("    successConditions: ").append(toIndentedString(successConditions)).append("\n");
    sb.append("    restorePhase: ").append(toIndentedString(restorePhase)).append("\n");
    sb.append("    restoreJobState: ").append(toIndentedString(restoreJobState)).append("\n");
    sb.append("    restoreJob: ").append(toIndentedString(restoreJob)).append("\n");
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

