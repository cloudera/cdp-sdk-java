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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.time.ZonedDateTime;

/**
 * Information about a Scaling activity.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-13T11:52:43.637-07:00")
public class ScalingActivitySummary  {

  /**
   * The operation ID of the scaling activity.
   **/
  private String operationId = null;

  /**
   * The start time of the scaling activity.
   **/
  private ZonedDateTime startTime = null;

  /**
   * The end time of the scaling activity.
   **/
  private ZonedDateTime endTime = null;

  /**
   * The reason of the scaling activity.
   **/
  private String scalingActivityReason = null;

  /**
   * The status of the scaling activity. Supported values- ACTIVITY_PENDING - If scaling activity is in pending state, METRICS_COLLECTION_SUCCESS/FAILED - for success/failure of metrics collection, UPSCALE_TRIGGER_SUCCESS/FAILED - for success/failure at the time of upscaling, DOWNSCALE_TRIGGER_SUCCESS/FAILED for success/failure at the time of downscaling, SCHEDULE_BASED_UPSCALE/DOWNSCALE - if schedule based scaling is used, SCALING_FLOW_IN_PROGRESS/SUCCESS/FAILED - State at which the scaling has reached, POLICY_ADJUSTMENT - if policy adjustment is taking place, UNKNOWN - if the state is not known.
   **/
  private String activityStatus = null;

  /**
   * Getter for operationId.
   * The operation ID of the scaling activity.
   **/
  @JsonProperty("operationId")
  public String getOperationId() {
    return operationId;
  }

  /**
   * Setter for operationId.
   * The operation ID of the scaling activity.
   **/
  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  /**
   * Getter for startTime.
   * The start time of the scaling activity.
   **/
  @JsonProperty("startTime")
  public ZonedDateTime getStartTime() {
    return startTime;
  }

  /**
   * Setter for startTime.
   * The start time of the scaling activity.
   **/
  public void setStartTime(ZonedDateTime startTime) {
    this.startTime = startTime;
  }

  /**
   * Getter for endTime.
   * The end time of the scaling activity.
   **/
  @JsonProperty("endTime")
  public ZonedDateTime getEndTime() {
    return endTime;
  }

  /**
   * Setter for endTime.
   * The end time of the scaling activity.
   **/
  public void setEndTime(ZonedDateTime endTime) {
    this.endTime = endTime;
  }

  /**
   * Getter for scalingActivityReason.
   * The reason of the scaling activity.
   **/
  @JsonProperty("scalingActivityReason")
  public String getScalingActivityReason() {
    return scalingActivityReason;
  }

  /**
   * Setter for scalingActivityReason.
   * The reason of the scaling activity.
   **/
  public void setScalingActivityReason(String scalingActivityReason) {
    this.scalingActivityReason = scalingActivityReason;
  }

  /**
   * Getter for activityStatus.
   * The status of the scaling activity. Supported values- ACTIVITY_PENDING - If scaling activity is in pending state, METRICS_COLLECTION_SUCCESS/FAILED - for success/failure of metrics collection, UPSCALE_TRIGGER_SUCCESS/FAILED - for success/failure at the time of upscaling, DOWNSCALE_TRIGGER_SUCCESS/FAILED for success/failure at the time of downscaling, SCHEDULE_BASED_UPSCALE/DOWNSCALE - if schedule based scaling is used, SCALING_FLOW_IN_PROGRESS/SUCCESS/FAILED - State at which the scaling has reached, POLICY_ADJUSTMENT - if policy adjustment is taking place, UNKNOWN - if the state is not known.
   **/
  @JsonProperty("activityStatus")
  public String getActivityStatus() {
    return activityStatus;
  }

  /**
   * Setter for activityStatus.
   * The status of the scaling activity. Supported values- ACTIVITY_PENDING - If scaling activity is in pending state, METRICS_COLLECTION_SUCCESS/FAILED - for success/failure of metrics collection, UPSCALE_TRIGGER_SUCCESS/FAILED - for success/failure at the time of upscaling, DOWNSCALE_TRIGGER_SUCCESS/FAILED for success/failure at the time of downscaling, SCHEDULE_BASED_UPSCALE/DOWNSCALE - if schedule based scaling is used, SCALING_FLOW_IN_PROGRESS/SUCCESS/FAILED - State at which the scaling has reached, POLICY_ADJUSTMENT - if policy adjustment is taking place, UNKNOWN - if the state is not known.
   **/
  public void setActivityStatus(String activityStatus) {
    this.activityStatus = activityStatus;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScalingActivitySummary scalingActivitySummary = (ScalingActivitySummary) o;
    if (!Objects.equals(this.operationId, scalingActivitySummary.operationId)) {
      return false;
    }
    if (!Objects.equals(this.startTime, scalingActivitySummary.startTime)) {
      return false;
    }
    if (!Objects.equals(this.endTime, scalingActivitySummary.endTime)) {
      return false;
    }
    if (!Objects.equals(this.scalingActivityReason, scalingActivitySummary.scalingActivityReason)) {
      return false;
    }
    if (!Objects.equals(this.activityStatus, scalingActivitySummary.activityStatus)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, startTime, endTime, scalingActivityReason, activityStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScalingActivitySummary {\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    scalingActivityReason: ").append(toIndentedString(scalingActivityReason)).append("\n");
    sb.append("    activityStatus: ").append(toIndentedString(activityStatus)).append("\n");
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

