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
 * Response from getting the status of creating batches of audit events to be archived.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-02-02T11:31:00.747-08:00")
public class GetBatchEventsForArchivingStatusResponse extends CdpResponse {

  /**
   * The task status.
   **/
  private String status = null;

  /**
   * The details about the created batches, if the task completed successfully.
   **/
  private List<ArchiveBatch> eventBatches = new ArrayList<ArchiveBatch>();

  /**
   * Getter for status.
   * The task status.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The task status.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for eventBatches.
   * The details about the created batches, if the task completed successfully.
   **/
  @JsonProperty("eventBatches")
  public List<ArchiveBatch> getEventBatches() {
    return eventBatches;
  }

  /**
   * Setter for eventBatches.
   * The details about the created batches, if the task completed successfully.
   **/
  public void setEventBatches(List<ArchiveBatch> eventBatches) {
    this.eventBatches = eventBatches;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBatchEventsForArchivingStatusResponse getBatchEventsForArchivingStatusResponse = (GetBatchEventsForArchivingStatusResponse) o;
    if (!Objects.equals(this.status, getBatchEventsForArchivingStatusResponse.status)) {
      return false;
    }
    if (!Objects.equals(this.eventBatches, getBatchEventsForArchivingStatusResponse.eventBatches)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, eventBatches, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBatchEventsForArchivingStatusResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    eventBatches: ").append(toIndentedString(eventBatches)).append("\n");
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

