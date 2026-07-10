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
 * Test connector job details.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:47.832Z")
public class GetConnectorTestJob  {

  /**
   * The ID of the test job.
   **/
  private String jobId = null;

  /**
   * The start time of the test job.
   **/
  private ZonedDateTime jobStartTime = null;

  /**
   * The finish time of the test job.
   **/
  private ZonedDateTime jobFinishTime = null;

  /**
   * The output log of the test job.
   **/
  private String outputLog = null;

  /**
   * Represents the possible status values of a test connector job.
   **/
  private String status = null;

  /**
   * Additional key-value pair attributes associated with the test connector job.
   **/
  private Map<String, String> labels = new HashMap<String, String>();

  /**
   * Getter for jobId.
   * The ID of the test job.
   **/
  @JsonProperty("jobId")
  public String getJobId() {
    return jobId;
  }

  /**
   * Setter for jobId.
   * The ID of the test job.
   **/
  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  /**
   * Getter for jobStartTime.
   * The start time of the test job.
   **/
  @JsonProperty("jobStartTime")
  public ZonedDateTime getJobStartTime() {
    return jobStartTime;
  }

  /**
   * Setter for jobStartTime.
   * The start time of the test job.
   **/
  public void setJobStartTime(ZonedDateTime jobStartTime) {
    this.jobStartTime = jobStartTime;
  }

  /**
   * Getter for jobFinishTime.
   * The finish time of the test job.
   **/
  @JsonProperty("jobFinishTime")
  public ZonedDateTime getJobFinishTime() {
    return jobFinishTime;
  }

  /**
   * Setter for jobFinishTime.
   * The finish time of the test job.
   **/
  public void setJobFinishTime(ZonedDateTime jobFinishTime) {
    this.jobFinishTime = jobFinishTime;
  }

  /**
   * Getter for outputLog.
   * The output log of the test job.
   **/
  @JsonProperty("outputLog")
  public String getOutputLog() {
    return outputLog;
  }

  /**
   * Setter for outputLog.
   * The output log of the test job.
   **/
  public void setOutputLog(String outputLog) {
    this.outputLog = outputLog;
  }

  /**
   * Getter for status.
   * Represents the possible status values of a test connector job.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Represents the possible status values of a test connector job.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for labels.
   * Additional key-value pair attributes associated with the test connector job.
   **/
  @JsonProperty("labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  /**
   * Setter for labels.
   * Additional key-value pair attributes associated with the test connector job.
   **/
  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetConnectorTestJob getConnectorTestJob = (GetConnectorTestJob) o;
    if (!Objects.equals(this.jobId, getConnectorTestJob.jobId)) {
      return false;
    }
    if (!Objects.equals(this.jobStartTime, getConnectorTestJob.jobStartTime)) {
      return false;
    }
    if (!Objects.equals(this.jobFinishTime, getConnectorTestJob.jobFinishTime)) {
      return false;
    }
    if (!Objects.equals(this.outputLog, getConnectorTestJob.outputLog)) {
      return false;
    }
    if (!Objects.equals(this.status, getConnectorTestJob.status)) {
      return false;
    }
    if (!Objects.equals(this.labels, getConnectorTestJob.labels)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, jobStartTime, jobFinishTime, outputLog, status, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetConnectorTestJob {\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobStartTime: ").append(toIndentedString(jobStartTime)).append("\n");
    sb.append("    jobFinishTime: ").append(toIndentedString(jobFinishTime)).append("\n");
    sb.append("    outputLog: ").append(toIndentedString(outputLog)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

