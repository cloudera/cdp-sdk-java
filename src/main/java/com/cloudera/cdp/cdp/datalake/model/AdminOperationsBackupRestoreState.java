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
import com.cloudera.cdp.datalake.model.BackupRestoreOperationStatus;

/**
 * The state of Cloudera Manager admin operations.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-10-06T10:34:44.045-07:00")
public class AdminOperationsBackupRestoreState  {

  /**
   * The status of the stop services operation that is triggered before the backup/restore is started.
   **/
  private BackupRestoreOperationStatus stopServices = null;

  /**
   * The status of the start services operation this is triggered after the backup/restore is complete.
   **/
  private BackupRestoreOperationStatus startServices = null;

  /**
   * Getter for stopServices.
   * The status of the stop services operation that is triggered before the backup/restore is started.
   **/
  @JsonProperty("stopServices")
  public BackupRestoreOperationStatus getStopServices() {
    return stopServices;
  }

  /**
   * Setter for stopServices.
   * The status of the stop services operation that is triggered before the backup/restore is started.
   **/
  public void setStopServices(BackupRestoreOperationStatus stopServices) {
    this.stopServices = stopServices;
  }

  /**
   * Getter for startServices.
   * The status of the start services operation this is triggered after the backup/restore is complete.
   **/
  @JsonProperty("startServices")
  public BackupRestoreOperationStatus getStartServices() {
    return startServices;
  }

  /**
   * Setter for startServices.
   * The status of the start services operation this is triggered after the backup/restore is complete.
   **/
  public void setStartServices(BackupRestoreOperationStatus startServices) {
    this.startServices = startServices;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminOperationsBackupRestoreState adminOperationsBackupRestoreState = (AdminOperationsBackupRestoreState) o;
    if (!Objects.equals(this.stopServices, adminOperationsBackupRestoreState.stopServices)) {
      return false;
    }
    if (!Objects.equals(this.startServices, adminOperationsBackupRestoreState.startServices)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(stopServices, startServices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminOperationsBackupRestoreState {\n");
    sb.append("    stopServices: ").append(toIndentedString(stopServices)).append("\n");
    sb.append("    startServices: ").append(toIndentedString(startServices)).append("\n");
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
