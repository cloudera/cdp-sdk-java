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
 * Contains the status and failure reason of an operation.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-10-06T10:34:44.045-07:00")
public class BackupRestoreOperationStatus  {

  /**
   * The status of the backup or restore operation.
   **/
  private String status = null;

  /**
   * The failure reason if the operation was not successful.
   **/
  private String failureReason = null;

  /**
   * Getter for status.
   * The status of the backup or restore operation.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The status of the backup or restore operation.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for failureReason.
   * The failure reason if the operation was not successful.
   **/
  @JsonProperty("failureReason")
  public String getFailureReason() {
    return failureReason;
  }

  /**
   * Setter for failureReason.
   * The failure reason if the operation was not successful.
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
    BackupRestoreOperationStatus backupRestoreOperationStatus = (BackupRestoreOperationStatus) o;
    if (!Objects.equals(this.status, backupRestoreOperationStatus.status)) {
      return false;
    }
    if (!Objects.equals(this.failureReason, backupRestoreOperationStatus.failureReason)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, failureReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupRestoreOperationStatus {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
