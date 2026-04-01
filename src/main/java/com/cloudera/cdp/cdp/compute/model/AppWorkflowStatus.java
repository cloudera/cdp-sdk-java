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
import java.time.ZonedDateTime;

/**
 * Status of an application workflow.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-31T14:25:34.900-07:00")
public class AppWorkflowStatus  {

  /**
   * Workflow status.
   **/
  private String workflowStatus = null;

  /**
   * Additional details regarding workflow status.
   **/
  private String message = null;

  /**
   * Application CRN.
   **/
  private String appCrn = null;

  /**
   * The start time of the workflow.
   **/
  private ZonedDateTime startTime = null;

  /**
   * The last time the workflow status was updated.
   **/
  private ZonedDateTime lastUpdateTime = null;

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
   * Getter for appCrn.
   * Application CRN.
   **/
  @JsonProperty("appCrn")
  public String getAppCrn() {
    return appCrn;
  }

  /**
   * Setter for appCrn.
   * Application CRN.
   **/
  public void setAppCrn(String appCrn) {
    this.appCrn = appCrn;
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppWorkflowStatus appWorkflowStatus = (AppWorkflowStatus) o;
    if (!Objects.equals(this.workflowStatus, appWorkflowStatus.workflowStatus)) {
      return false;
    }
    if (!Objects.equals(this.message, appWorkflowStatus.message)) {
      return false;
    }
    if (!Objects.equals(this.appCrn, appWorkflowStatus.appCrn)) {
      return false;
    }
    if (!Objects.equals(this.startTime, appWorkflowStatus.startTime)) {
      return false;
    }
    if (!Objects.equals(this.lastUpdateTime, appWorkflowStatus.lastUpdateTime)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowStatus, message, appCrn, startTime, lastUpdateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppWorkflowStatus {\n");
    sb.append("    workflowStatus: ").append(toIndentedString(workflowStatus)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    appCrn: ").append(toIndentedString(appCrn)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
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

