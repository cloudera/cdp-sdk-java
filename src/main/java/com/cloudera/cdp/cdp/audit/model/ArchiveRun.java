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

package com.cloudera.cdp.audit.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.time.ZonedDateTime;

/**
 * The public model for an archive run.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-06-26T16:18:44.779-07:00")
public class ArchiveRun  {

  /**
   * The account ID for the archive run.
   **/
  private String accountId = null;

  /**
   * The run ID for the archive run, which uniquely identifies the run.
   **/
  private String runId = null;

  /**
   * The archive ID for the batch of events archived by the run.
   **/
  private String archiveId = null;

  /**
   * The status of the archive run: CREATED, SUCCEEDED, or FAILED.
   **/
  private String status = null;

  /**
   * A summary of the outcome of the run.
   **/
  private String summary = null;

  /**
   * Additional details about the run, such as a stack trace.
   **/
  private String details = null;

  /**
   * The creation timestamp of the archive run.
   **/
  private ZonedDateTime creationTimestamp = null;

  /**
   * The archive timestamp of the batch.
   **/
  private ZonedDateTime archiveTimestamp = null;

  /**
   * Getter for accountId.
   * The account ID for the archive run.
   **/
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }

  /**
   * Setter for accountId.
   * The account ID for the archive run.
   **/
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * Getter for runId.
   * The run ID for the archive run, which uniquely identifies the run.
   **/
  @JsonProperty("runId")
  public String getRunId() {
    return runId;
  }

  /**
   * Setter for runId.
   * The run ID for the archive run, which uniquely identifies the run.
   **/
  public void setRunId(String runId) {
    this.runId = runId;
  }

  /**
   * Getter for archiveId.
   * The archive ID for the batch of events archived by the run.
   **/
  @JsonProperty("archiveId")
  public String getArchiveId() {
    return archiveId;
  }

  /**
   * Setter for archiveId.
   * The archive ID for the batch of events archived by the run.
   **/
  public void setArchiveId(String archiveId) {
    this.archiveId = archiveId;
  }

  /**
   * Getter for status.
   * The status of the archive run: CREATED, SUCCEEDED, or FAILED.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The status of the archive run: CREATED, SUCCEEDED, or FAILED.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for summary.
   * A summary of the outcome of the run.
   **/
  @JsonProperty("summary")
  public String getSummary() {
    return summary;
  }

  /**
   * Setter for summary.
   * A summary of the outcome of the run.
   **/
  public void setSummary(String summary) {
    this.summary = summary;
  }

  /**
   * Getter for details.
   * Additional details about the run, such as a stack trace.
   **/
  @JsonProperty("details")
  public String getDetails() {
    return details;
  }

  /**
   * Setter for details.
   * Additional details about the run, such as a stack trace.
   **/
  public void setDetails(String details) {
    this.details = details;
  }

  /**
   * Getter for creationTimestamp.
   * The creation timestamp of the archive run.
   **/
  @JsonProperty("creationTimestamp")
  public ZonedDateTime getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * Setter for creationTimestamp.
   * The creation timestamp of the archive run.
   **/
  public void setCreationTimestamp(ZonedDateTime creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
  }

  /**
   * Getter for archiveTimestamp.
   * The archive timestamp of the batch.
   **/
  @JsonProperty("archiveTimestamp")
  public ZonedDateTime getArchiveTimestamp() {
    return archiveTimestamp;
  }

  /**
   * Setter for archiveTimestamp.
   * The archive timestamp of the batch.
   **/
  public void setArchiveTimestamp(ZonedDateTime archiveTimestamp) {
    this.archiveTimestamp = archiveTimestamp;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchiveRun archiveRun = (ArchiveRun) o;
    if (!Objects.equals(this.accountId, archiveRun.accountId)) {
      return false;
    }
    if (!Objects.equals(this.runId, archiveRun.runId)) {
      return false;
    }
    if (!Objects.equals(this.archiveId, archiveRun.archiveId)) {
      return false;
    }
    if (!Objects.equals(this.status, archiveRun.status)) {
      return false;
    }
    if (!Objects.equals(this.summary, archiveRun.summary)) {
      return false;
    }
    if (!Objects.equals(this.details, archiveRun.details)) {
      return false;
    }
    if (!Objects.equals(this.creationTimestamp, archiveRun.creationTimestamp)) {
      return false;
    }
    if (!Objects.equals(this.archiveTimestamp, archiveRun.archiveTimestamp)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, runId, archiveId, status, summary, details, creationTimestamp, archiveTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchiveRun {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    archiveId: ").append(toIndentedString(archiveId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
    sb.append("    archiveTimestamp: ").append(toIndentedString(archiveTimestamp)).append("\n");
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

