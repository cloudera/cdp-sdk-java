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

package com.cloudera.cdp.df.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Object representation of a diagnostics request list item.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-05-09T12:44:58.271-07:00")
public class ListDiagnosticsResponseItem  {

  /**
   * DataFlow Service CRN.
   **/
  private String dfServiceCrn = null;

  /**
   * Status of request.
   **/
  private String status = null;

  /**
   * User provided description of request.
   **/
  private String description = null;

  /**
   * Upload destination.
   **/
  private String destination = null;

  /**
   * Cloud storage path of the bundle, only populated for CLOUD_STORAGE destinations.
   **/
  private String bundleCloudPath = null;

  /**
   * Time from which to collect logs.
   **/
  private String startTime = null;

  /**
   * Time to which to collect logs.
   **/
  private String endTime = null;

  /**
   * List of environment components included in the collection.
   **/
  private List<String> environmentComponents = new ArrayList<String>();;

  /**
   * Collection scope.
   **/
  private String collectionScope = null;

  /**
   * List of Flow deployments included in the collection.
   **/
  private List<String> deployments = new ArrayList<String>();

  /**
   * Support case number associated with the collection.
   **/
  private String caseNumber = null;

  /**
   * Uuid of the collection.
   **/
  private String uuid = null;

  /**
   * Time at which the collection was requested.
   **/
  private String requestedTime = null;

  /**
   * Getter for dfServiceCrn.
   * DataFlow Service CRN.
   **/
  @JsonProperty("dfServiceCrn")
  public String getDfServiceCrn() {
    return dfServiceCrn;
  }

  /**
   * Setter for dfServiceCrn.
   * DataFlow Service CRN.
   **/
  public void setDfServiceCrn(String dfServiceCrn) {
    this.dfServiceCrn = dfServiceCrn;
  }

  /**
   * Getter for status.
   * Status of request.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of request.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for description.
   * User provided description of request.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * User provided description of request.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for destination.
   * Upload destination.
   **/
  @JsonProperty("destination")
  public String getDestination() {
    return destination;
  }

  /**
   * Setter for destination.
   * Upload destination.
   **/
  public void setDestination(String destination) {
    this.destination = destination;
  }

  /**
   * Getter for bundleCloudPath.
   * Cloud storage path of the bundle, only populated for CLOUD_STORAGE destinations.
   **/
  @JsonProperty("bundleCloudPath")
  public String getBundleCloudPath() {
    return bundleCloudPath;
  }

  /**
   * Setter for bundleCloudPath.
   * Cloud storage path of the bundle, only populated for CLOUD_STORAGE destinations.
   **/
  public void setBundleCloudPath(String bundleCloudPath) {
    this.bundleCloudPath = bundleCloudPath;
  }

  /**
   * Getter for startTime.
   * Time from which to collect logs.
   **/
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }

  /**
   * Setter for startTime.
   * Time from which to collect logs.
   **/
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  /**
   * Getter for endTime.
   * Time to which to collect logs.
   **/
  @JsonProperty("endTime")
  public String getEndTime() {
    return endTime;
  }

  /**
   * Setter for endTime.
   * Time to which to collect logs.
   **/
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  /**
   * Getter for environmentComponents.
   * List of environment components included in the collection.
   **/
  @JsonProperty("environmentComponents")
  public List<String> getEnvironmentComponents() {
    return environmentComponents;
  }

  /**
   * Setter for environmentComponents.
   * List of environment components included in the collection.
   **/
  public void setEnvironmentComponents(List<String> environmentComponents) {
    this.environmentComponents = environmentComponents;
  }

  /**
   * Getter for collectionScope.
   * Collection scope.
   **/
  @JsonProperty("collectionScope")
  public String getCollectionScope() {
    return collectionScope;
  }

  /**
   * Setter for collectionScope.
   * Collection scope.
   **/
  public void setCollectionScope(String collectionScope) {
    this.collectionScope = collectionScope;
  }

  /**
   * Getter for deployments.
   * List of Flow deployments included in the collection.
   **/
  @JsonProperty("deployments")
  public List<String> getDeployments() {
    return deployments;
  }

  /**
   * Setter for deployments.
   * List of Flow deployments included in the collection.
   **/
  public void setDeployments(List<String> deployments) {
    this.deployments = deployments;
  }

  /**
   * Getter for caseNumber.
   * Support case number associated with the collection.
   **/
  @JsonProperty("caseNumber")
  public String getCaseNumber() {
    return caseNumber;
  }

  /**
   * Setter for caseNumber.
   * Support case number associated with the collection.
   **/
  public void setCaseNumber(String caseNumber) {
    this.caseNumber = caseNumber;
  }

  /**
   * Getter for uuid.
   * Uuid of the collection.
   **/
  @JsonProperty("uuid")
  public String getUuid() {
    return uuid;
  }

  /**
   * Setter for uuid.
   * Uuid of the collection.
   **/
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * Getter for requestedTime.
   * Time at which the collection was requested.
   **/
  @JsonProperty("requestedTime")
  public String getRequestedTime() {
    return requestedTime;
  }

  /**
   * Setter for requestedTime.
   * Time at which the collection was requested.
   **/
  public void setRequestedTime(String requestedTime) {
    this.requestedTime = requestedTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDiagnosticsResponseItem listDiagnosticsResponseItem = (ListDiagnosticsResponseItem) o;
    if (!Objects.equals(this.dfServiceCrn, listDiagnosticsResponseItem.dfServiceCrn)) {
      return false;
    }
    if (!Objects.equals(this.status, listDiagnosticsResponseItem.status)) {
      return false;
    }
    if (!Objects.equals(this.description, listDiagnosticsResponseItem.description)) {
      return false;
    }
    if (!Objects.equals(this.destination, listDiagnosticsResponseItem.destination)) {
      return false;
    }
    if (!Objects.equals(this.bundleCloudPath, listDiagnosticsResponseItem.bundleCloudPath)) {
      return false;
    }
    if (!Objects.equals(this.startTime, listDiagnosticsResponseItem.startTime)) {
      return false;
    }
    if (!Objects.equals(this.endTime, listDiagnosticsResponseItem.endTime)) {
      return false;
    }
    if (!Objects.equals(this.environmentComponents, listDiagnosticsResponseItem.environmentComponents)) {
      return false;
    }
    if (!Objects.equals(this.collectionScope, listDiagnosticsResponseItem.collectionScope)) {
      return false;
    }
    if (!Objects.equals(this.deployments, listDiagnosticsResponseItem.deployments)) {
      return false;
    }
    if (!Objects.equals(this.caseNumber, listDiagnosticsResponseItem.caseNumber)) {
      return false;
    }
    if (!Objects.equals(this.uuid, listDiagnosticsResponseItem.uuid)) {
      return false;
    }
    if (!Objects.equals(this.requestedTime, listDiagnosticsResponseItem.requestedTime)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(dfServiceCrn, status, description, destination, bundleCloudPath, startTime, endTime, environmentComponents, collectionScope, deployments, caseNumber, uuid, requestedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDiagnosticsResponseItem {\n");
    sb.append("    dfServiceCrn: ").append(toIndentedString(dfServiceCrn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    bundleCloudPath: ").append(toIndentedString(bundleCloudPath)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    environmentComponents: ").append(toIndentedString(environmentComponents)).append("\n");
    sb.append("    collectionScope: ").append(toIndentedString(collectionScope)).append("\n");
    sb.append("    deployments: ").append(toIndentedString(deployments)).append("\n");
    sb.append("    caseNumber: ").append(toIndentedString(caseNumber)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    requestedTime: ").append(toIndentedString(requestedTime)).append("\n");
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

