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
 * The request to cancel a backup operation.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-04-10T13:23:59.308-07:00")
public class CancelBackupRequest  {

  /**
   * Backup-id that identifies the backup to be cancelled.
   **/
  private String backupId = null;

  /**
   * Will mark all unfinished operations as cancelled without waiting for their result and mark backup operation as finished (cancelled, successful or failed) immediately.
   **/
  private Boolean force = false;

  /**
   * Getter for backupId.
   * Backup-id that identifies the backup to be cancelled.
   **/
  @JsonProperty("backupId")
  public String getBackupId() {
    return backupId;
  }

  /**
   * Setter for backupId.
   * Backup-id that identifies the backup to be cancelled.
   **/
  public void setBackupId(String backupId) {
    this.backupId = backupId;
  }

  /**
   * Getter for force.
   * Will mark all unfinished operations as cancelled without waiting for their result and mark backup operation as finished (cancelled, successful or failed) immediately.
   **/
  @JsonProperty("force")
  public Boolean getForce() {
    return force;
  }

  /**
   * Setter for force.
   * Will mark all unfinished operations as cancelled without waiting for their result and mark backup operation as finished (cancelled, successful or failed) immediately.
   **/
  public void setForce(Boolean force) {
    this.force = force;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelBackupRequest cancelBackupRequest = (CancelBackupRequest) o;
    if (!Objects.equals(this.backupId, cancelBackupRequest.backupId)) {
      return false;
    }
    if (!Objects.equals(this.force, cancelBackupRequest.force)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupId, force);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelBackupRequest {\n");
    sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
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
