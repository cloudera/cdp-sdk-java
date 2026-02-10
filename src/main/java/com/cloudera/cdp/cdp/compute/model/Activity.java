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
import java.util.*;

/**
 * Represents an individual activity within a workflow execution.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-01-28T12:21:18.585-08:00")
public class Activity  {

  /**
   * Unique identifier for this activity instance.
   **/
  private String activityId = null;

  /**
   * Human-readable name of the activity.
   **/
  private String name = null;

  /**
   * Current execution status of the activity.
   **/
  private String status = null;

  /**
   * Time when the activity started execution.
   **/
  private ZonedDateTime startedAt = null;

  /**
   * Time when the activity completed execution.
   **/
  private ZonedDateTime completedAt = null;

  /**
   * Collection of log messages generated during activity execution.
   **/
  private List<String> logs = new ArrayList<String>();

  /**
   * Getter for activityId.
   * Unique identifier for this activity instance.
   **/
  @JsonProperty("activityId")
  public String getActivityId() {
    return activityId;
  }

  /**
   * Setter for activityId.
   * Unique identifier for this activity instance.
   **/
  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  /**
   * Getter for name.
   * Human-readable name of the activity.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Human-readable name of the activity.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for status.
   * Current execution status of the activity.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Current execution status of the activity.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for startedAt.
   * Time when the activity started execution.
   **/
  @JsonProperty("startedAt")
  public ZonedDateTime getStartedAt() {
    return startedAt;
  }

  /**
   * Setter for startedAt.
   * Time when the activity started execution.
   **/
  public void setStartedAt(ZonedDateTime startedAt) {
    this.startedAt = startedAt;
  }

  /**
   * Getter for completedAt.
   * Time when the activity completed execution.
   **/
  @JsonProperty("completedAt")
  public ZonedDateTime getCompletedAt() {
    return completedAt;
  }

  /**
   * Setter for completedAt.
   * Time when the activity completed execution.
   **/
  public void setCompletedAt(ZonedDateTime completedAt) {
    this.completedAt = completedAt;
  }

  /**
   * Getter for logs.
   * Collection of log messages generated during activity execution.
   **/
  @JsonProperty("logs")
  public List<String> getLogs() {
    return logs;
  }

  /**
   * Setter for logs.
   * Collection of log messages generated during activity execution.
   **/
  public void setLogs(List<String> logs) {
    this.logs = logs;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Activity activity = (Activity) o;
    if (!Objects.equals(this.activityId, activity.activityId)) {
      return false;
    }
    if (!Objects.equals(this.name, activity.name)) {
      return false;
    }
    if (!Objects.equals(this.status, activity.status)) {
      return false;
    }
    if (!Objects.equals(this.startedAt, activity.startedAt)) {
      return false;
    }
    if (!Objects.equals(this.completedAt, activity.completedAt)) {
      return false;
    }
    if (!Objects.equals(this.logs, activity.logs)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, name, status, startedAt, completedAt, logs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activity {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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

