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

package com.cloudera.cdp.opdb.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.time.ZonedDateTime;

/**
 * Describe a diagnostics bundle
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-03-03T11:50:47.029-08:00")
public class DiagnosticsBundle  {

  /**
   * Identifier for each bundle collection
   **/
  private String id = null;

  /**
   * The object on which diagnostics was collected
   **/
  private String crn = null;

  /**
   * Start time
   **/
  private ZonedDateTime startTime = null;

  /**
   * The end time, if the command is finished.
   **/
  private ZonedDateTime endTime = null;

  /**
   * A status of the diagnostics collection process
   **/
  private String status = null;

  /**
   * If this is a download, a link to the download location of the bundle
   **/
  private String result = null;

  /**
   * Getter for id.
   * Identifier for each bundle collection
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * Identifier for each bundle collection
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for crn.
   * The object on which diagnostics was collected
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The object on which diagnostics was collected
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for startTime.
   * Start time
   **/
  @JsonProperty("startTime")
  public ZonedDateTime getStartTime() {
    return startTime;
  }

  /**
   * Setter for startTime.
   * Start time
   **/
  public void setStartTime(ZonedDateTime startTime) {
    this.startTime = startTime;
  }

  /**
   * Getter for endTime.
   * The end time, if the command is finished.
   **/
  @JsonProperty("endTime")
  public ZonedDateTime getEndTime() {
    return endTime;
  }

  /**
   * Setter for endTime.
   * The end time, if the command is finished.
   **/
  public void setEndTime(ZonedDateTime endTime) {
    this.endTime = endTime;
  }

  /**
   * Getter for status.
   * A status of the diagnostics collection process
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * A status of the diagnostics collection process
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for result.
   * If this is a download, a link to the download location of the bundle
   **/
  @JsonProperty("result")
  public String getResult() {
    return result;
  }

  /**
   * Setter for result.
   * If this is a download, a link to the download location of the bundle
   **/
  public void setResult(String result) {
    this.result = result;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagnosticsBundle diagnosticsBundle = (DiagnosticsBundle) o;
    if (!Objects.equals(this.id, diagnosticsBundle.id)) {
      return false;
    }
    if (!Objects.equals(this.crn, diagnosticsBundle.crn)) {
      return false;
    }
    if (!Objects.equals(this.startTime, diagnosticsBundle.startTime)) {
      return false;
    }
    if (!Objects.equals(this.endTime, diagnosticsBundle.endTime)) {
      return false;
    }
    if (!Objects.equals(this.status, diagnosticsBundle.status)) {
      return false;
    }
    if (!Objects.equals(this.result, diagnosticsBundle.result)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, crn, startTime, endTime, status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnosticsBundle {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

