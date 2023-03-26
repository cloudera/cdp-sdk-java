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
import java.util.*;

/**
 * A simple Restore entry for listRestore Usage
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-03-24T14:52:52.951-07:00")
public class SimpleRestore  {

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
   * The list of namespaces to be included in restore.
   **/
  private List<String> includedNamespaces = new ArrayList<String>();

  /**
   * The phase of the restore operation. The values are PENDING, PRE_VALIDATION, STOPPING_APPS, DELETING_OBJECTS, DELETING_OBJECTS_PVC, RESTORING_PVC, RESTORING_OBJECTS, STARTING_APPS and FINISHED. PENDING indicates waiting for the job to start executing. PRE_VALIDATION indicates validation of the environment before restore. STOPPING_APPS indicates stopping the microservices before data restore. DELETING_OBJECTS indicates deletion of Kubernetes resources other than PersistentVolumeClaims. DELETING_OBJECTS_PVC indicates deletion of Kubernetes PersistentVolumeClaims. RESTORING_PVC indicates creation of Kubernetes PersistentVolumeClaims. RESTORING_OBJECTS indicates creating of Kubernetes objects other than PersistentVolumeClaims. STARTING_APPS indicates starting of the microservices after data restore and FINISHED indicates the restore job has finished.
   **/
  private String restorePhase = null;

  /**
   * The current state of the restore job. The values are NOT_STARTED, IN_PROGRESS, COMPLETED, PARTIALLY_FAILED, FAILED and TERMINATING. NOT_STARTED indicates the job has not started. IN_PROGRESS indicates the job is running. COMPLETED indicates the job has finished running successfully. PARTIALLY_FAILED indicates the job has finished running with some warnings. FAILED indicates the job has finished running with errors and TERMINATING indicates that the entity containing this job is being deleted.
   **/
  private String restoreJobState = null;

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
   * Getter for restorePhase.
   * The phase of the restore operation. The values are PENDING, PRE_VALIDATION, STOPPING_APPS, DELETING_OBJECTS, DELETING_OBJECTS_PVC, RESTORING_PVC, RESTORING_OBJECTS, STARTING_APPS and FINISHED. PENDING indicates waiting for the job to start executing. PRE_VALIDATION indicates validation of the environment before restore. STOPPING_APPS indicates stopping the microservices before data restore. DELETING_OBJECTS indicates deletion of Kubernetes resources other than PersistentVolumeClaims. DELETING_OBJECTS_PVC indicates deletion of Kubernetes PersistentVolumeClaims. RESTORING_PVC indicates creation of Kubernetes PersistentVolumeClaims. RESTORING_OBJECTS indicates creating of Kubernetes objects other than PersistentVolumeClaims. STARTING_APPS indicates starting of the microservices after data restore and FINISHED indicates the restore job has finished.
   **/
  @JsonProperty("restorePhase")
  public String getRestorePhase() {
    return restorePhase;
  }

  /**
   * Setter for restorePhase.
   * The phase of the restore operation. The values are PENDING, PRE_VALIDATION, STOPPING_APPS, DELETING_OBJECTS, DELETING_OBJECTS_PVC, RESTORING_PVC, RESTORING_OBJECTS, STARTING_APPS and FINISHED. PENDING indicates waiting for the job to start executing. PRE_VALIDATION indicates validation of the environment before restore. STOPPING_APPS indicates stopping the microservices before data restore. DELETING_OBJECTS indicates deletion of Kubernetes resources other than PersistentVolumeClaims. DELETING_OBJECTS_PVC indicates deletion of Kubernetes PersistentVolumeClaims. RESTORING_PVC indicates creation of Kubernetes PersistentVolumeClaims. RESTORING_OBJECTS indicates creating of Kubernetes objects other than PersistentVolumeClaims. STARTING_APPS indicates starting of the microservices after data restore and FINISHED indicates the restore job has finished.
   **/
  public void setRestorePhase(String restorePhase) {
    this.restorePhase = restorePhase;
  }

  /**
   * Getter for restoreJobState.
   * The current state of the restore job. The values are NOT_STARTED, IN_PROGRESS, COMPLETED, PARTIALLY_FAILED, FAILED and TERMINATING. NOT_STARTED indicates the job has not started. IN_PROGRESS indicates the job is running. COMPLETED indicates the job has finished running successfully. PARTIALLY_FAILED indicates the job has finished running with some warnings. FAILED indicates the job has finished running with errors and TERMINATING indicates that the entity containing this job is being deleted.
   **/
  @JsonProperty("restoreJobState")
  public String getRestoreJobState() {
    return restoreJobState;
  }

  /**
   * Setter for restoreJobState.
   * The current state of the restore job. The values are NOT_STARTED, IN_PROGRESS, COMPLETED, PARTIALLY_FAILED, FAILED and TERMINATING. NOT_STARTED indicates the job has not started. IN_PROGRESS indicates the job is running. COMPLETED indicates the job has finished running successfully. PARTIALLY_FAILED indicates the job has finished running with some warnings. FAILED indicates the job has finished running with errors and TERMINATING indicates that the entity containing this job is being deleted.
   **/
  public void setRestoreJobState(String restoreJobState) {
    this.restoreJobState = restoreJobState;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleRestore simpleRestore = (SimpleRestore) o;
    if (!Objects.equals(this.restoreCrn, simpleRestore.restoreCrn)) {
      return false;
    }
    if (!Objects.equals(this.backupCrn, simpleRestore.backupCrn)) {
      return false;
    }
    if (!Objects.equals(this.restoreCreationTime, simpleRestore.restoreCreationTime)) {
      return false;
    }
    if (!Objects.equals(this.includedNamespaces, simpleRestore.includedNamespaces)) {
      return false;
    }
    if (!Objects.equals(this.restorePhase, simpleRestore.restorePhase)) {
      return false;
    }
    if (!Objects.equals(this.restoreJobState, simpleRestore.restoreJobState)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(restoreCrn, backupCrn, restoreCreationTime, includedNamespaces, restorePhase, restoreJobState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleRestore {\n");
    sb.append("    restoreCrn: ").append(toIndentedString(restoreCrn)).append("\n");
    sb.append("    backupCrn: ").append(toIndentedString(backupCrn)).append("\n");
    sb.append("    restoreCreationTime: ").append(toIndentedString(restoreCreationTime)).append("\n");
    sb.append("    includedNamespaces: ").append(toIndentedString(includedNamespaces)).append("\n");
    sb.append("    restorePhase: ").append(toIndentedString(restorePhase)).append("\n");
    sb.append("    restoreJobState: ").append(toIndentedString(restoreJobState)).append("\n");
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

