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
 * Request to start DataFlow diagnostics bundle creation.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-28T14:00:30.597-07:00")
public class StartGetDiagnosticsCollectionRequest  {

  /**
   * DataFlow Service CRN from which to collect diagnostics.
   **/
  private String dfServiceCrn = null;

  /**
   * Destination location.
   **/
  private String destination = null;

  /**
   * Description of diagnostics collection.
   **/
  private String description = null;

  /**
   * List of environment components for which logs should be collected.
   **/
  private List<String> environmentComponents = new ArrayList<String>();;

  /**
   * Support case number associated with this request.
   **/
  private String caseNumber = null;

  /**
   * List of deployments to collect diagnostics from, if none are specified, all deployments will be included.
   **/
  private List<String> deployments = new ArrayList<String>();

  /**
   * Date-time from which component logs will be collected, up until endTime.
   **/
  private String startTime = null;

  /**
   * Date-time to which component logs will be collected, starting from startTime.
   **/
  private String endTime = null;

  /**
   * Collection scope.
   **/
  private String collectionScope = null;

  /**
   * Indicates if the heap and thread dumps are needed for a flow.
   **/
  private Boolean includeNifiDiagnostics = null;

  /**
   * Getter for dfServiceCrn.
   * DataFlow Service CRN from which to collect diagnostics.
   **/
  @JsonProperty("dfServiceCrn")
  public String getDfServiceCrn() {
    return dfServiceCrn;
  }

  /**
   * Setter for dfServiceCrn.
   * DataFlow Service CRN from which to collect diagnostics.
   **/
  public void setDfServiceCrn(String dfServiceCrn) {
    this.dfServiceCrn = dfServiceCrn;
  }

  /**
   * Getter for destination.
   * Destination location.
   **/
  @JsonProperty("destination")
  public String getDestination() {
    return destination;
  }

  /**
   * Setter for destination.
   * Destination location.
   **/
  public void setDestination(String destination) {
    this.destination = destination;
  }

  /**
   * Getter for description.
   * Description of diagnostics collection.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * Description of diagnostics collection.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for environmentComponents.
   * List of environment components for which logs should be collected.
   **/
  @JsonProperty("environmentComponents")
  public List<String> getEnvironmentComponents() {
    return environmentComponents;
  }

  /**
   * Setter for environmentComponents.
   * List of environment components for which logs should be collected.
   **/
  public void setEnvironmentComponents(List<String> environmentComponents) {
    this.environmentComponents = environmentComponents;
  }

  /**
   * Getter for caseNumber.
   * Support case number associated with this request.
   **/
  @JsonProperty("caseNumber")
  public String getCaseNumber() {
    return caseNumber;
  }

  /**
   * Setter for caseNumber.
   * Support case number associated with this request.
   **/
  public void setCaseNumber(String caseNumber) {
    this.caseNumber = caseNumber;
  }

  /**
   * Getter for deployments.
   * List of deployments to collect diagnostics from, if none are specified, all deployments will be included.
   **/
  @JsonProperty("deployments")
  public List<String> getDeployments() {
    return deployments;
  }

  /**
   * Setter for deployments.
   * List of deployments to collect diagnostics from, if none are specified, all deployments will be included.
   **/
  public void setDeployments(List<String> deployments) {
    this.deployments = deployments;
  }

  /**
   * Getter for startTime.
   * Date-time from which component logs will be collected, up until endTime.
   **/
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }

  /**
   * Setter for startTime.
   * Date-time from which component logs will be collected, up until endTime.
   **/
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  /**
   * Getter for endTime.
   * Date-time to which component logs will be collected, starting from startTime.
   **/
  @JsonProperty("endTime")
  public String getEndTime() {
    return endTime;
  }

  /**
   * Setter for endTime.
   * Date-time to which component logs will be collected, starting from startTime.
   **/
  public void setEndTime(String endTime) {
    this.endTime = endTime;
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
   * Getter for includeNifiDiagnostics.
   * Indicates if the heap and thread dumps are needed for a flow.
   **/
  @JsonProperty("includeNifiDiagnostics")
  public Boolean getIncludeNifiDiagnostics() {
    return includeNifiDiagnostics;
  }

  /**
   * Setter for includeNifiDiagnostics.
   * Indicates if the heap and thread dumps are needed for a flow.
   **/
  public void setIncludeNifiDiagnostics(Boolean includeNifiDiagnostics) {
    this.includeNifiDiagnostics = includeNifiDiagnostics;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartGetDiagnosticsCollectionRequest startGetDiagnosticsCollectionRequest = (StartGetDiagnosticsCollectionRequest) o;
    if (!Objects.equals(this.dfServiceCrn, startGetDiagnosticsCollectionRequest.dfServiceCrn)) {
      return false;
    }
    if (!Objects.equals(this.destination, startGetDiagnosticsCollectionRequest.destination)) {
      return false;
    }
    if (!Objects.equals(this.description, startGetDiagnosticsCollectionRequest.description)) {
      return false;
    }
    if (!Objects.equals(this.environmentComponents, startGetDiagnosticsCollectionRequest.environmentComponents)) {
      return false;
    }
    if (!Objects.equals(this.caseNumber, startGetDiagnosticsCollectionRequest.caseNumber)) {
      return false;
    }
    if (!Objects.equals(this.deployments, startGetDiagnosticsCollectionRequest.deployments)) {
      return false;
    }
    if (!Objects.equals(this.startTime, startGetDiagnosticsCollectionRequest.startTime)) {
      return false;
    }
    if (!Objects.equals(this.endTime, startGetDiagnosticsCollectionRequest.endTime)) {
      return false;
    }
    if (!Objects.equals(this.collectionScope, startGetDiagnosticsCollectionRequest.collectionScope)) {
      return false;
    }
    if (!Objects.equals(this.includeNifiDiagnostics, startGetDiagnosticsCollectionRequest.includeNifiDiagnostics)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(dfServiceCrn, destination, description, environmentComponents, caseNumber, deployments, startTime, endTime, collectionScope, includeNifiDiagnostics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartGetDiagnosticsCollectionRequest {\n");
    sb.append("    dfServiceCrn: ").append(toIndentedString(dfServiceCrn)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    environmentComponents: ").append(toIndentedString(environmentComponents)).append("\n");
    sb.append("    caseNumber: ").append(toIndentedString(caseNumber)).append("\n");
    sb.append("    deployments: ").append(toIndentedString(deployments)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    collectionScope: ").append(toIndentedString(collectionScope)).append("\n");
    sb.append("    includeNifiDiagnostics: ").append(toIndentedString(includeNifiDiagnostics)).append("\n");
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

