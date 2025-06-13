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

package com.cloudera.cdp.replicationmanager.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.time.ZonedDateTime;

/**
 * Policy execution details.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-06-12T15:05:30.576-07:00")
public class PolicyInstanceResponse extends CdpResponse {

  /**
   * Policy instance command id.
   **/
  private String id = null;

  /**
   * Policy id.
   **/
  private String policyId = null;

  /**
   * Policy command status.
   **/
  private String status = null;

  /**
   * Command start time.
   **/
  private ZonedDateTime startTime = null;

  /**
   * Command end time.
   **/
  private ZonedDateTime endTime = null;

  /**
   * JSON data to track polciy status.
   **/
  private String trackingInfo = null;

  /**
   * Output of the policy command.
   **/
  private String message = null;

  /**
   * Job type.
   **/
  private String jobType = null;

  /**
   * Total number of steps.
   **/
  private Integer totalSteps = null;

  /**
   * Number of completed steps.
   **/
  private Integer completedSteps = null;

  /**
   * Getter for id.
   * Policy instance command id.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * Policy instance command id.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for policyId.
   * Policy id.
   **/
  @JsonProperty("policyId")
  public String getPolicyId() {
    return policyId;
  }

  /**
   * Setter for policyId.
   * Policy id.
   **/
  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  /**
   * Getter for status.
   * Policy command status.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Policy command status.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for startTime.
   * Command start time.
   **/
  @JsonProperty("startTime")
  public ZonedDateTime getStartTime() {
    return startTime;
  }

  /**
   * Setter for startTime.
   * Command start time.
   **/
  public void setStartTime(ZonedDateTime startTime) {
    this.startTime = startTime;
  }

  /**
   * Getter for endTime.
   * Command end time.
   **/
  @JsonProperty("endTime")
  public ZonedDateTime getEndTime() {
    return endTime;
  }

  /**
   * Setter for endTime.
   * Command end time.
   **/
  public void setEndTime(ZonedDateTime endTime) {
    this.endTime = endTime;
  }

  /**
   * Getter for trackingInfo.
   * JSON data to track polciy status.
   **/
  @JsonProperty("trackingInfo")
  public String getTrackingInfo() {
    return trackingInfo;
  }

  /**
   * Setter for trackingInfo.
   * JSON data to track polciy status.
   **/
  public void setTrackingInfo(String trackingInfo) {
    this.trackingInfo = trackingInfo;
  }

  /**
   * Getter for message.
   * Output of the policy command.
   **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Setter for message.
   * Output of the policy command.
   **/
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Getter for jobType.
   * Job type.
   **/
  @JsonProperty("jobType")
  public String getJobType() {
    return jobType;
  }

  /**
   * Setter for jobType.
   * Job type.
   **/
  public void setJobType(String jobType) {
    this.jobType = jobType;
  }

  /**
   * Getter for totalSteps.
   * Total number of steps.
   **/
  @JsonProperty("totalSteps")
  public Integer getTotalSteps() {
    return totalSteps;
  }

  /**
   * Setter for totalSteps.
   * Total number of steps.
   **/
  public void setTotalSteps(Integer totalSteps) {
    this.totalSteps = totalSteps;
  }

  /**
   * Getter for completedSteps.
   * Number of completed steps.
   **/
  @JsonProperty("completedSteps")
  public Integer getCompletedSteps() {
    return completedSteps;
  }

  /**
   * Setter for completedSteps.
   * Number of completed steps.
   **/
  public void setCompletedSteps(Integer completedSteps) {
    this.completedSteps = completedSteps;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyInstanceResponse policyInstanceResponse = (PolicyInstanceResponse) o;
    if (!Objects.equals(this.id, policyInstanceResponse.id)) {
      return false;
    }
    if (!Objects.equals(this.policyId, policyInstanceResponse.policyId)) {
      return false;
    }
    if (!Objects.equals(this.status, policyInstanceResponse.status)) {
      return false;
    }
    if (!Objects.equals(this.startTime, policyInstanceResponse.startTime)) {
      return false;
    }
    if (!Objects.equals(this.endTime, policyInstanceResponse.endTime)) {
      return false;
    }
    if (!Objects.equals(this.trackingInfo, policyInstanceResponse.trackingInfo)) {
      return false;
    }
    if (!Objects.equals(this.message, policyInstanceResponse.message)) {
      return false;
    }
    if (!Objects.equals(this.jobType, policyInstanceResponse.jobType)) {
      return false;
    }
    if (!Objects.equals(this.totalSteps, policyInstanceResponse.totalSteps)) {
      return false;
    }
    if (!Objects.equals(this.completedSteps, policyInstanceResponse.completedSteps)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, policyId, status, startTime, endTime, trackingInfo, message, jobType, totalSteps, completedSteps, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyInstanceResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    trackingInfo: ").append(toIndentedString(trackingInfo)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    totalSteps: ").append(toIndentedString(totalSteps)).append("\n");
    sb.append("    completedSteps: ").append(toIndentedString(completedSteps)).append("\n");
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

