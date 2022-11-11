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
import java.time.ZonedDateTime;
import java.util.*;
import java.util.Map;

/**
 * Request object for the createDbcDiagnosticDataJob method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-11-10T17:48:31.643-08:00")
public class CreateDbcDiagnosticDataJobRequest  {

  /**
   * ID of cluster.
   **/
  private String clusterId = null;

  /**
   * ID of the Database Catalog.
   **/
  private String dbcId = null;

  /**
   * The resulting bundle will contain logs/metrics after the specified start time.
   **/
  private ZonedDateTime startTime = null;

  /**
   * The resulting bundle will contain logs/metrics before the specified end time.
   **/
  private ZonedDateTime endTime = null;

  /**
   * Destination of the diagnostics collection.
   **/
  private String destination = null;

  /**
   * Optional support case number in case of SUPPORT destination, otherwise only act as additional data.
   **/
  private String caseNumber = null;

  /**
   * Metadata information which is attached to bundle-info.json when posting the bundle.
   **/
  private Map<String, String> bundleMetadata = new HashMap<String, String>();

  /**
   * Forced recreation of the diagnostic job.
   **/
  private Boolean force = false;

  /**
   * Getter for clusterId.
   * ID of cluster.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * ID of cluster.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for dbcId.
   * ID of the Database Catalog.
   **/
  @JsonProperty("dbcId")
  public String getDbcId() {
    return dbcId;
  }

  /**
   * Setter for dbcId.
   * ID of the Database Catalog.
   **/
  public void setDbcId(String dbcId) {
    this.dbcId = dbcId;
  }

  /**
   * Getter for startTime.
   * The resulting bundle will contain logs/metrics after the specified start time.
   **/
  @JsonProperty("startTime")
  public ZonedDateTime getStartTime() {
    return startTime;
  }

  /**
   * Setter for startTime.
   * The resulting bundle will contain logs/metrics after the specified start time.
   **/
  public void setStartTime(ZonedDateTime startTime) {
    this.startTime = startTime;
  }

  /**
   * Getter for endTime.
   * The resulting bundle will contain logs/metrics before the specified end time.
   **/
  @JsonProperty("endTime")
  public ZonedDateTime getEndTime() {
    return endTime;
  }

  /**
   * Setter for endTime.
   * The resulting bundle will contain logs/metrics before the specified end time.
   **/
  public void setEndTime(ZonedDateTime endTime) {
    this.endTime = endTime;
  }

  /**
   * Getter for destination.
   * Destination of the diagnostics collection.
   **/
  @JsonProperty("destination")
  public String getDestination() {
    return destination;
  }

  /**
   * Setter for destination.
   * Destination of the diagnostics collection.
   **/
  public void setDestination(String destination) {
    this.destination = destination;
  }

  /**
   * Getter for caseNumber.
   * Optional support case number in case of SUPPORT destination, otherwise only act as additional data.
   **/
  @JsonProperty("caseNumber")
  public String getCaseNumber() {
    return caseNumber;
  }

  /**
   * Setter for caseNumber.
   * Optional support case number in case of SUPPORT destination, otherwise only act as additional data.
   **/
  public void setCaseNumber(String caseNumber) {
    this.caseNumber = caseNumber;
  }

  /**
   * Getter for bundleMetadata.
   * Metadata information which is attached to bundle-info.json when posting the bundle.
   **/
  @JsonProperty("bundleMetadata")
  public Map<String, String> getBundleMetadata() {
    return bundleMetadata;
  }

  /**
   * Setter for bundleMetadata.
   * Metadata information which is attached to bundle-info.json when posting the bundle.
   **/
  public void setBundleMetadata(Map<String, String> bundleMetadata) {
    this.bundleMetadata = bundleMetadata;
  }

  /**
   * Getter for force.
   * Forced recreation of the diagnostic job.
   **/
  @JsonProperty("force")
  public Boolean getForce() {
    return force;
  }

  /**
   * Setter for force.
   * Forced recreation of the diagnostic job.
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
    CreateDbcDiagnosticDataJobRequest createDbcDiagnosticDataJobRequest = (CreateDbcDiagnosticDataJobRequest) o;
    if (!Objects.equals(this.clusterId, createDbcDiagnosticDataJobRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.dbcId, createDbcDiagnosticDataJobRequest.dbcId)) {
      return false;
    }
    if (!Objects.equals(this.startTime, createDbcDiagnosticDataJobRequest.startTime)) {
      return false;
    }
    if (!Objects.equals(this.endTime, createDbcDiagnosticDataJobRequest.endTime)) {
      return false;
    }
    if (!Objects.equals(this.destination, createDbcDiagnosticDataJobRequest.destination)) {
      return false;
    }
    if (!Objects.equals(this.caseNumber, createDbcDiagnosticDataJobRequest.caseNumber)) {
      return false;
    }
    if (!Objects.equals(this.bundleMetadata, createDbcDiagnosticDataJobRequest.bundleMetadata)) {
      return false;
    }
    if (!Objects.equals(this.force, createDbcDiagnosticDataJobRequest.force)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, dbcId, startTime, endTime, destination, caseNumber, bundleMetadata, force);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDbcDiagnosticDataJobRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    dbcId: ").append(toIndentedString(dbcId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    caseNumber: ").append(toIndentedString(caseNumber)).append("\n");
    sb.append("    bundleMetadata: ").append(toIndentedString(bundleMetadata)).append("\n");
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

