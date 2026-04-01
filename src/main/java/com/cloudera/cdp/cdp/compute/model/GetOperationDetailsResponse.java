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

package com.cloudera.cdp.compute.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.compute.model.Activity;
import com.cloudera.cdp.compute.model.OperationOwner;
import com.cloudera.cdp.compute.model.PhaseWorkflowDetail;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * Represents the response containing the details of an operation.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-31T14:25:34.900-07:00")
public class GetOperationDetailsResponse extends CdpResponse {

  /**
   * The unique ID of the operation.
   **/
  private String operationId = null;

  /**
   * The type of workflow for this operation.
   **/
  private String workflowOperation = null;

  /**
   * The current status of the operation.
   **/
  private String operationStatus = null;

  /**
   * Additional details regarding operation status.
   **/
  private String message = null;

  /**
   * The CRN of the cluster associated with the operation.
   **/
  private String clusterCrn = null;

  /**
   * The start time of the operation.
   **/
  private ZonedDateTime startTime = null;

  /**
   * The last time the operation status was updated.
   **/
  private ZonedDateTime lastUpdateTime = null;

  /**
   * Details of operation owner.
   **/
  private OperationOwner operationOwner = null;

  /**
   * Number of retires attempted. Its value is 0 for first operation.
   **/
  private Integer retryCount = null;

  /**
   * Cadence workflow ID.
   **/
  private String workflowId = null;

  /**
   * Cadence run ID.
   **/
  private String runId = null;

  /**
   * Details of workflow phases.
   **/
  private List<PhaseWorkflowDetail> phaseWorkflowDetails = new ArrayList<PhaseWorkflowDetail>();

  /**
   * Activities
   **/
  private List<Activity> activities = new ArrayList<Activity>();

  /**
   * Getter for operationId.
   * The unique ID of the operation.
   **/
  @JsonProperty("operationId")
  public String getOperationId() {
    return operationId;
  }

  /**
   * Setter for operationId.
   * The unique ID of the operation.
   **/
  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  /**
   * Getter for workflowOperation.
   * The type of workflow for this operation.
   **/
  @JsonProperty("workflowOperation")
  public String getWorkflowOperation() {
    return workflowOperation;
  }

  /**
   * Setter for workflowOperation.
   * The type of workflow for this operation.
   **/
  public void setWorkflowOperation(String workflowOperation) {
    this.workflowOperation = workflowOperation;
  }

  /**
   * Getter for operationStatus.
   * The current status of the operation.
   **/
  @JsonProperty("operationStatus")
  public String getOperationStatus() {
    return operationStatus;
  }

  /**
   * Setter for operationStatus.
   * The current status of the operation.
   **/
  public void setOperationStatus(String operationStatus) {
    this.operationStatus = operationStatus;
  }

  /**
   * Getter for message.
   * Additional details regarding operation status.
   **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Setter for message.
   * Additional details regarding operation status.
   **/
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Getter for clusterCrn.
   * The CRN of the cluster associated with the operation.
   **/
  @JsonProperty("clusterCrn")
  public String getClusterCrn() {
    return clusterCrn;
  }

  /**
   * Setter for clusterCrn.
   * The CRN of the cluster associated with the operation.
   **/
  public void setClusterCrn(String clusterCrn) {
    this.clusterCrn = clusterCrn;
  }

  /**
   * Getter for startTime.
   * The start time of the operation.
   **/
  @JsonProperty("startTime")
  public ZonedDateTime getStartTime() {
    return startTime;
  }

  /**
   * Setter for startTime.
   * The start time of the operation.
   **/
  public void setStartTime(ZonedDateTime startTime) {
    this.startTime = startTime;
  }

  /**
   * Getter for lastUpdateTime.
   * The last time the operation status was updated.
   **/
  @JsonProperty("lastUpdateTime")
  public ZonedDateTime getLastUpdateTime() {
    return lastUpdateTime;
  }

  /**
   * Setter for lastUpdateTime.
   * The last time the operation status was updated.
   **/
  public void setLastUpdateTime(ZonedDateTime lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  /**
   * Getter for operationOwner.
   * Details of operation owner.
   **/
  @JsonProperty("operationOwner")
  public OperationOwner getOperationOwner() {
    return operationOwner;
  }

  /**
   * Setter for operationOwner.
   * Details of operation owner.
   **/
  public void setOperationOwner(OperationOwner operationOwner) {
    this.operationOwner = operationOwner;
  }

  /**
   * Getter for retryCount.
   * Number of retires attempted. Its value is 0 for first operation.
   **/
  @JsonProperty("retryCount")
  public Integer getRetryCount() {
    return retryCount;
  }

  /**
   * Setter for retryCount.
   * Number of retires attempted. Its value is 0 for first operation.
   **/
  public void setRetryCount(Integer retryCount) {
    this.retryCount = retryCount;
  }

  /**
   * Getter for workflowId.
   * Cadence workflow ID.
   **/
  @JsonProperty("workflowId")
  public String getWorkflowId() {
    return workflowId;
  }

  /**
   * Setter for workflowId.
   * Cadence workflow ID.
   **/
  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
  }

  /**
   * Getter for runId.
   * Cadence run ID.
   **/
  @JsonProperty("runId")
  public String getRunId() {
    return runId;
  }

  /**
   * Setter for runId.
   * Cadence run ID.
   **/
  public void setRunId(String runId) {
    this.runId = runId;
  }

  /**
   * Getter for phaseWorkflowDetails.
   * Details of workflow phases.
   **/
  @JsonProperty("phaseWorkflowDetails")
  public List<PhaseWorkflowDetail> getPhaseWorkflowDetails() {
    return phaseWorkflowDetails;
  }

  /**
   * Setter for phaseWorkflowDetails.
   * Details of workflow phases.
   **/
  public void setPhaseWorkflowDetails(List<PhaseWorkflowDetail> phaseWorkflowDetails) {
    this.phaseWorkflowDetails = phaseWorkflowDetails;
  }

  /**
   * Getter for activities.
   * Activities
   **/
  @JsonProperty("activities")
  public List<Activity> getActivities() {
    return activities;
  }

  /**
   * Setter for activities.
   * Activities
   **/
  public void setActivities(List<Activity> activities) {
    this.activities = activities;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOperationDetailsResponse getOperationDetailsResponse = (GetOperationDetailsResponse) o;
    if (!Objects.equals(this.operationId, getOperationDetailsResponse.operationId)) {
      return false;
    }
    if (!Objects.equals(this.workflowOperation, getOperationDetailsResponse.workflowOperation)) {
      return false;
    }
    if (!Objects.equals(this.operationStatus, getOperationDetailsResponse.operationStatus)) {
      return false;
    }
    if (!Objects.equals(this.message, getOperationDetailsResponse.message)) {
      return false;
    }
    if (!Objects.equals(this.clusterCrn, getOperationDetailsResponse.clusterCrn)) {
      return false;
    }
    if (!Objects.equals(this.startTime, getOperationDetailsResponse.startTime)) {
      return false;
    }
    if (!Objects.equals(this.lastUpdateTime, getOperationDetailsResponse.lastUpdateTime)) {
      return false;
    }
    if (!Objects.equals(this.operationOwner, getOperationDetailsResponse.operationOwner)) {
      return false;
    }
    if (!Objects.equals(this.retryCount, getOperationDetailsResponse.retryCount)) {
      return false;
    }
    if (!Objects.equals(this.workflowId, getOperationDetailsResponse.workflowId)) {
      return false;
    }
    if (!Objects.equals(this.runId, getOperationDetailsResponse.runId)) {
      return false;
    }
    if (!Objects.equals(this.phaseWorkflowDetails, getOperationDetailsResponse.phaseWorkflowDetails)) {
      return false;
    }
    if (!Objects.equals(this.activities, getOperationDetailsResponse.activities)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, workflowOperation, operationStatus, message, clusterCrn, startTime, lastUpdateTime, operationOwner, retryCount, workflowId, runId, phaseWorkflowDetails, activities, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOperationDetailsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    workflowOperation: ").append(toIndentedString(workflowOperation)).append("\n");
    sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    clusterCrn: ").append(toIndentedString(clusterCrn)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    operationOwner: ").append(toIndentedString(operationOwner)).append("\n");
    sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    phaseWorkflowDetails: ").append(toIndentedString(phaseWorkflowDetails)).append("\n");
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
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

