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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * The details of the last sync performed by automated user sync.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-26T08:05:43.397-08:00")
public class LastAutomatedSyncDetails  {

  /**
   * The time when the sync was processed.
   **/
  private ZonedDateTime timestamp = null;

  /**
   * The status of the sync.
   **/
  private String status = null;

  /**
   * Additional detail related to the status.
   **/
  private List<String> statusMessages = new ArrayList<String>();

  /**
   * Getter for timestamp.
   * The time when the sync was processed.
   **/
  @JsonProperty("timestamp")
  public ZonedDateTime getTimestamp() {
    return timestamp;
  }

  /**
   * Setter for timestamp.
   * The time when the sync was processed.
   **/
  public void setTimestamp(ZonedDateTime timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Getter for status.
   * The status of the sync.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The status of the sync.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for statusMessages.
   * Additional detail related to the status.
   **/
  @JsonProperty("statusMessages")
  public List<String> getStatusMessages() {
    return statusMessages;
  }

  /**
   * Setter for statusMessages.
   * Additional detail related to the status.
   **/
  public void setStatusMessages(List<String> statusMessages) {
    this.statusMessages = statusMessages;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LastAutomatedSyncDetails lastAutomatedSyncDetails = (LastAutomatedSyncDetails) o;
    if (!Objects.equals(this.timestamp, lastAutomatedSyncDetails.timestamp)) {
      return false;
    }
    if (!Objects.equals(this.status, lastAutomatedSyncDetails.status)) {
      return false;
    }
    if (!Objects.equals(this.statusMessages, lastAutomatedSyncDetails.statusMessages)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, status, statusMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastAutomatedSyncDetails {\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMessages: ").append(toIndentedString(statusMessages)).append("\n");
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

