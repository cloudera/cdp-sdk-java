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
import com.cloudera.cdp.opdb.model.Snapshot;
import java.util.*;

/**
 * Show Snapshots Response.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-15T12:52:22.696-08:00")
public class ListSnapshotsResponse extends CdpResponse {

  /**
   * The name of the environment.
   **/
  private String environmentName = null;

  /**
   * The name of the database.
   **/
  private String databaseName = null;

  /**
   * List of snapshots.
   **/
  private List<Snapshot> snapshots = new ArrayList<Snapshot>();

  /**
   * The status of the list snapshots.
   **/
  private String status = null;

  /**
   * Reason for the status.
   **/
  private String statusReason = null;

  /**
   * Getter for environmentName.
   * The name of the environment.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The name of the environment.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for databaseName.
   * The name of the database.
   **/
  @JsonProperty("databaseName")
  public String getDatabaseName() {
    return databaseName;
  }

  /**
   * Setter for databaseName.
   * The name of the database.
   **/
  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }

  /**
   * Getter for snapshots.
   * List of snapshots.
   **/
  @JsonProperty("snapshots")
  public List<Snapshot> getSnapshots() {
    return snapshots;
  }

  /**
   * Setter for snapshots.
   * List of snapshots.
   **/
  public void setSnapshots(List<Snapshot> snapshots) {
    this.snapshots = snapshots;
  }

  /**
   * Getter for status.
   * The status of the list snapshots.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The status of the list snapshots.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for statusReason.
   * Reason for the status.
   **/
  @JsonProperty("statusReason")
  public String getStatusReason() {
    return statusReason;
  }

  /**
   * Setter for statusReason.
   * Reason for the status.
   **/
  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSnapshotsResponse listSnapshotsResponse = (ListSnapshotsResponse) o;
    if (!Objects.equals(this.environmentName, listSnapshotsResponse.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.databaseName, listSnapshotsResponse.databaseName)) {
      return false;
    }
    if (!Objects.equals(this.snapshots, listSnapshotsResponse.snapshots)) {
      return false;
    }
    if (!Objects.equals(this.status, listSnapshotsResponse.status)) {
      return false;
    }
    if (!Objects.equals(this.statusReason, listSnapshotsResponse.statusReason)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, databaseName, snapshots, status, statusReason, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSnapshotsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
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

