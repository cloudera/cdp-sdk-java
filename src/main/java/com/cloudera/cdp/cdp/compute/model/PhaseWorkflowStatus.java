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
import com.cloudera.cdp.compute.model.AppWorkflowStatus;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * Status of phase workflow.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-31T14:25:34.900-07:00")
public class PhaseWorkflowStatus  {

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
   * Status of application workflow.
   **/
  private List<AppWorkflowStatus> appWorkflowStatuses = new ArrayList<AppWorkflowStatus>();

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
   * Getter for appWorkflowStatuses.
   * Status of application workflow.
   **/
  @JsonProperty("appWorkflowStatuses")
  public List<AppWorkflowStatus> getAppWorkflowStatuses() {
    return appWorkflowStatuses;
  }

  /**
   * Setter for appWorkflowStatuses.
   * Status of application workflow.
   **/
  public void setAppWorkflowStatuses(List<AppWorkflowStatus> appWorkflowStatuses) {
    this.appWorkflowStatuses = appWorkflowStatuses;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhaseWorkflowStatus phaseWorkflowStatus = (PhaseWorkflowStatus) o;
    if (!Objects.equals(this.workflowPhase, phaseWorkflowStatus.workflowPhase)) {
      return false;
    }
    if (!Objects.equals(this.workflowStatus, phaseWorkflowStatus.workflowStatus)) {
      return false;
    }
    if (!Objects.equals(this.message, phaseWorkflowStatus.message)) {
      return false;
    }
    if (!Objects.equals(this.startTime, phaseWorkflowStatus.startTime)) {
      return false;
    }
    if (!Objects.equals(this.lastUpdateTime, phaseWorkflowStatus.lastUpdateTime)) {
      return false;
    }
    if (!Objects.equals(this.appWorkflowStatuses, phaseWorkflowStatus.appWorkflowStatuses)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowPhase, workflowStatus, message, startTime, lastUpdateTime, appWorkflowStatuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhaseWorkflowStatus {\n");
    sb.append("    workflowPhase: ").append(toIndentedString(workflowPhase)).append("\n");
    sb.append("    workflowStatus: ").append(toIndentedString(workflowStatus)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    appWorkflowStatuses: ").append(toIndentedString(appWorkflowStatuses)).append("\n");
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

