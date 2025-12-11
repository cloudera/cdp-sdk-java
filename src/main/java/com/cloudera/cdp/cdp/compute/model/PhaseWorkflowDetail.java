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
import com.cloudera.cdp.compute.model.AppWorkflowDetail;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * Details of phase workflow.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-12-11T09:59:33.212-08:00")
public class PhaseWorkflowDetail  {

  /**
   * Workflow phase.
   **/
  private String workflowPhase = null;

  /**
   * Workflow status.
   **/
  private String workflowStatus = null;

  /**
   * Additional details regarding workflow status.
   **/
  private String message = null;

  /**
   * The start time of the workflow.
   **/
  private ZonedDateTime startTime = null;

  /**
   * The last time the workflow status was updated.
   **/
  private ZonedDateTime lastUpdateTime = null;

  /**
   * Cadence workflow ID.
   **/
  private String workflowId = null;

  /**
   * Cadence run ID.
   **/
  private String runId = null;

  /**
   * Details of application workflow.
   **/
  private List<AppWorkflowDetail> appWorkflowDetails = new ArrayList<AppWorkflowDetail>();

  /**
   * Activities
   **/
  private List<Activity> activities = new ArrayList<Activity>();

  /**
   * Getter for workflowPhase.
   * Workflow phase.
   **/
  @JsonProperty("workflowPhase")
  public String getWorkflowPhase() {
    return workflowPhase;
  }

  /**
   * Setter for workflowPhase.
   * Workflow phase.
   **/
  public void setWorkflowPhase(String workflowPhase) {
    this.workflowPhase = workflowPhase;
  }

  /**
   * Getter for workflowStatus.
   * Workflow status.
   **/
  @JsonProperty("workflowStatus")
  public String getWorkflowStatus() {
    return workflowStatus;
  }

  /**
   * Setter for workflowStatus.
   * Workflow status.
   **/
  public void setWorkflowStatus(String workflowStatus) {
    this.workflowStatus = workflowStatus;
  }

  /**
   * Getter for message.
   * Additional details regarding workflow status.
   **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Setter for message.
   * Additional details regarding workflow status.
   **/
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Getter for startTime.
   * The start time of the workflow.
   **/
  @JsonProperty("startTime")
  public ZonedDateTime getStartTime() {
    return startTime;
  }

  /**
   * Setter for startTime.
   * The start time of the workflow.
   **/
  public void setStartTime(ZonedDateTime startTime) {
    this.startTime = startTime;
  }

  /**
   * Getter for lastUpdateTime.
   * The last time the workflow status was updated.
   **/
  @JsonProperty("lastUpdateTime")
  public ZonedDateTime getLastUpdateTime() {
    return lastUpdateTime;
  }

  /**
   * Setter for lastUpdateTime.
   * The last time the workflow status was updated.
   **/
  public void setLastUpdateTime(ZonedDateTime lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
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
   * Getter for appWorkflowDetails.
   * Details of application workflow.
   **/
  @JsonProperty("appWorkflowDetails")
  public List<AppWorkflowDetail> getAppWorkflowDetails() {
    return appWorkflowDetails;
  }

  /**
   * Setter for appWorkflowDetails.
   * Details of application workflow.
   **/
  public void setAppWorkflowDetails(List<AppWorkflowDetail> appWorkflowDetails) {
    this.appWorkflowDetails = appWorkflowDetails;
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
    PhaseWorkflowDetail phaseWorkflowDetail = (PhaseWorkflowDetail) o;
    if (!Objects.equals(this.workflowPhase, phaseWorkflowDetail.workflowPhase)) {
      return false;
    }
    if (!Objects.equals(this.workflowStatus, phaseWorkflowDetail.workflowStatus)) {
      return false;
    }
    if (!Objects.equals(this.message, phaseWorkflowDetail.message)) {
      return false;
    }
    if (!Objects.equals(this.startTime, phaseWorkflowDetail.startTime)) {
      return false;
    }
    if (!Objects.equals(this.lastUpdateTime, phaseWorkflowDetail.lastUpdateTime)) {
      return false;
    }
    if (!Objects.equals(this.workflowId, phaseWorkflowDetail.workflowId)) {
      return false;
    }
    if (!Objects.equals(this.runId, phaseWorkflowDetail.runId)) {
      return false;
    }
    if (!Objects.equals(this.appWorkflowDetails, phaseWorkflowDetail.appWorkflowDetails)) {
      return false;
    }
    if (!Objects.equals(this.activities, phaseWorkflowDetail.activities)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowPhase, workflowStatus, message, startTime, lastUpdateTime, workflowId, runId, appWorkflowDetails, activities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhaseWorkflowDetail {\n");
    sb.append("    workflowPhase: ").append(toIndentedString(workflowPhase)).append("\n");
    sb.append("    workflowStatus: ").append(toIndentedString(workflowStatus)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    appWorkflowDetails: ").append(toIndentedString(appWorkflowDetails)).append("\n");
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

