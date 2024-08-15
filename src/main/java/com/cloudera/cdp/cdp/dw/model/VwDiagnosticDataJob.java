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
 * Represents a Diagnostic Data Job.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-08-15T13:42:16.327-07:00")
public class VwDiagnosticDataJob  {

  /**
   * The unique identifier of the Diagnostic Data Job.
   **/
  private String jobId = null;

  /**
   * The start time of the Diagnostic Data Job.
   **/
  private ZonedDateTime startTime = null;

  /**
   * The finish time of the Diagnostic Data Job.
   **/
  private ZonedDateTime endTime = null;

  /**
   * If the request is for download, this URL points to download location.
   **/
  private String url = null;

  /**
   * The job status.
   **/
  private String status = null;

  /**
   * Additional key-value pair attributes associated with the Diagnostic Data Job.
   **/
  private Map<String, String> labels = new HashMap<String, String>();

  /**
   * Getter for jobId.
   * The unique identifier of the Diagnostic Data Job.
   **/
  @JsonProperty("jobId")
  public String getJobId() {
    return jobId;
  }

  /**
   * Setter for jobId.
   * The unique identifier of the Diagnostic Data Job.
   **/
  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  /**
   * Getter for startTime.
   * The start time of the Diagnostic Data Job.
   **/
  @JsonProperty("startTime")
  public ZonedDateTime getStartTime() {
    return startTime;
  }

  /**
   * Setter for startTime.
   * The start time of the Diagnostic Data Job.
   **/
  public void setStartTime(ZonedDateTime startTime) {
    this.startTime = startTime;
  }

  /**
   * Getter for endTime.
   * The finish time of the Diagnostic Data Job.
   **/
  @JsonProperty("endTime")
  public ZonedDateTime getEndTime() {
    return endTime;
  }

  /**
   * Setter for endTime.
   * The finish time of the Diagnostic Data Job.
   **/
  public void setEndTime(ZonedDateTime endTime) {
    this.endTime = endTime;
  }

  /**
   * Getter for url.
   * If the request is for download, this URL points to download location.
   **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  /**
   * Setter for url.
   * If the request is for download, this URL points to download location.
   **/
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Getter for status.
   * The job status.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The job status.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for labels.
   * Additional key-value pair attributes associated with the Diagnostic Data Job.
   **/
  @JsonProperty("labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  /**
   * Setter for labels.
   * Additional key-value pair attributes associated with the Diagnostic Data Job.
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
    VwDiagnosticDataJob vwDiagnosticDataJob = (VwDiagnosticDataJob) o;
    if (!Objects.equals(this.jobId, vwDiagnosticDataJob.jobId)) {
      return false;
    }
    if (!Objects.equals(this.startTime, vwDiagnosticDataJob.startTime)) {
      return false;
    }
    if (!Objects.equals(this.endTime, vwDiagnosticDataJob.endTime)) {
      return false;
    }
    if (!Objects.equals(this.url, vwDiagnosticDataJob.url)) {
      return false;
    }
    if (!Objects.equals(this.status, vwDiagnosticDataJob.status)) {
      return false;
    }
    if (!Objects.equals(this.labels, vwDiagnosticDataJob.labels)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, startTime, endTime, url, status, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VwDiagnosticDataJob {\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

