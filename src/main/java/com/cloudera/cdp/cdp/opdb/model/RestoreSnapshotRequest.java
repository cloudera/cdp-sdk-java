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

package com.cloudera.cdp.opdb.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Restore Snapshot Request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-04-17T06:49:14.354-07:00")
public class RestoreSnapshotRequest  {

  /**
   * The name of the original environment.
   **/
  private String environmentName = null;

  /**
   * The name of the original database.
   **/
  private String databaseName = null;

  /**
   * The name of the snapshot.
   **/
  private String snapshotName = null;

  /**
   * The name of the target environment where the snapshot should be restored.
   **/
  private String targetEnvironmentName = null;

  /**
   * The name of the target database where the snapshot should be restored.
   **/
  private String targetDatabaseName = null;

  /**
   * Getter for environmentName.
   * The name of the original environment.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The name of the original environment.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for databaseName.
   * The name of the original database.
   **/
  @JsonProperty("databaseName")
  public String getDatabaseName() {
    return databaseName;
  }

  /**
   * Setter for databaseName.
   * The name of the original database.
   **/
  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }

  /**
   * Getter for snapshotName.
   * The name of the snapshot.
   **/
  @JsonProperty("snapshotName")
  public String getSnapshotName() {
    return snapshotName;
  }

  /**
   * Setter for snapshotName.
   * The name of the snapshot.
   **/
  public void setSnapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
  }

  /**
   * Getter for targetEnvironmentName.
   * The name of the target environment where the snapshot should be restored.
   **/
  @JsonProperty("targetEnvironmentName")
  public String getTargetEnvironmentName() {
    return targetEnvironmentName;
  }

  /**
   * Setter for targetEnvironmentName.
   * The name of the target environment where the snapshot should be restored.
   **/
  public void setTargetEnvironmentName(String targetEnvironmentName) {
    this.targetEnvironmentName = targetEnvironmentName;
  }

  /**
   * Getter for targetDatabaseName.
   * The name of the target database where the snapshot should be restored.
   **/
  @JsonProperty("targetDatabaseName")
  public String getTargetDatabaseName() {
    return targetDatabaseName;
  }

  /**
   * Setter for targetDatabaseName.
   * The name of the target database where the snapshot should be restored.
   **/
  public void setTargetDatabaseName(String targetDatabaseName) {
    this.targetDatabaseName = targetDatabaseName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestoreSnapshotRequest restoreSnapshotRequest = (RestoreSnapshotRequest) o;
    if (!Objects.equals(this.environmentName, restoreSnapshotRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.databaseName, restoreSnapshotRequest.databaseName)) {
      return false;
    }
    if (!Objects.equals(this.snapshotName, restoreSnapshotRequest.snapshotName)) {
      return false;
    }
    if (!Objects.equals(this.targetEnvironmentName, restoreSnapshotRequest.targetEnvironmentName)) {
      return false;
    }
    if (!Objects.equals(this.targetDatabaseName, restoreSnapshotRequest.targetDatabaseName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, databaseName, snapshotName, targetEnvironmentName, targetDatabaseName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestoreSnapshotRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    snapshotName: ").append(toIndentedString(snapshotName)).append("\n");
    sb.append("    targetEnvironmentName: ").append(toIndentedString(targetEnvironmentName)).append("\n");
    sb.append("    targetDatabaseName: ").append(toIndentedString(targetDatabaseName)).append("\n");
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

