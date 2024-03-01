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
import com.cloudera.cdp.audit.model.ArchiveBatch;
import java.util.*;

/**
 * Response from archiving audit events.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-02-29T13:23:34.843-08:00")
public class ArchiveAuditEventsResponse extends CdpResponse {

  /**
   * The number of events archived.
   **/
  private Long eventCount = null;

  /**
   * The details about the batches of events archived.
   **/
  private List<ArchiveBatch> eventBatches = new ArrayList<ArchiveBatch>();

  /**
   * The id representing an asynchronous task.
   **/
  private String taskId = null;

  /**
   * Getter for eventCount.
   * The number of events archived.
   **/
  @JsonProperty("eventCount")
  public Long getEventCount() {
    return eventCount;
  }

  /**
   * Setter for eventCount.
   * The number of events archived.
   **/
  public void setEventCount(Long eventCount) {
    this.eventCount = eventCount;
  }

  /**
   * Getter for eventBatches.
   * The details about the batches of events archived.
   **/
  @JsonProperty("eventBatches")
  public List<ArchiveBatch> getEventBatches() {
    return eventBatches;
  }

  /**
   * Setter for eventBatches.
   * The details about the batches of events archived.
   **/
  public void setEventBatches(List<ArchiveBatch> eventBatches) {
    this.eventBatches = eventBatches;
  }

  /**
   * Getter for taskId.
   * The id representing an asynchronous task.
   **/
  @JsonProperty("taskId")
  public String getTaskId() {
    return taskId;
  }

  /**
   * Setter for taskId.
   * The id representing an asynchronous task.
   **/
  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchiveAuditEventsResponse archiveAuditEventsResponse = (ArchiveAuditEventsResponse) o;
    if (!Objects.equals(this.eventCount, archiveAuditEventsResponse.eventCount)) {
      return false;
    }
    if (!Objects.equals(this.eventBatches, archiveAuditEventsResponse.eventBatches)) {
      return false;
    }
    if (!Objects.equals(this.taskId, archiveAuditEventsResponse.taskId)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventCount, eventBatches, taskId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchiveAuditEventsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
    sb.append("    eventBatches: ").append(toIndentedString(eventBatches)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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

