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

/**
 * Event response structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-26T08:05:45.766-08:00")
public class CommonEvent  {

  /**
   * Details.
   **/
  private String details = null;

  /**
   * Event name.
   **/
  private String name = null;

  /**
   * Progress.
   **/
  private String progress = null;

  /**
   * Resource type.
   **/
  private String resourceType = null;

  /**
   * Status.
   **/
  private String status = null;

  /**
   * Status reason.
   **/
  private String statusReason = null;

  /**
   * Timestamp.
   **/
  private String timestamp = null;

  /**
   * Getter for details.
   * Details.
   **/
  @JsonProperty("details")
  public String getDetails() {
    return details;
  }

  /**
   * Setter for details.
   * Details.
   **/
  public void setDetails(String details) {
    this.details = details;
  }

  /**
   * Getter for name.
   * Event name.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Event name.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for progress.
   * Progress.
   **/
  @JsonProperty("progress")
  public String getProgress() {
    return progress;
  }

  /**
   * Setter for progress.
   * Progress.
   **/
  public void setProgress(String progress) {
    this.progress = progress;
  }

  /**
   * Getter for resourceType.
   * Resource type.
   **/
  @JsonProperty("resourceType")
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Setter for resourceType.
   * Resource type.
   **/
  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  /**
   * Getter for status.
   * Status.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for statusReason.
   * Status reason.
   **/
  @JsonProperty("statusReason")
  public String getStatusReason() {
    return statusReason;
  }

  /**
   * Setter for statusReason.
   * Status reason.
   **/
  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }

  /**
   * Getter for timestamp.
   * Timestamp.
   **/
  @JsonProperty("timestamp")
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * Setter for timestamp.
   * Timestamp.
   **/
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonEvent commonEvent = (CommonEvent) o;
    if (!Objects.equals(this.details, commonEvent.details)) {
      return false;
    }
    if (!Objects.equals(this.name, commonEvent.name)) {
      return false;
    }
    if (!Objects.equals(this.progress, commonEvent.progress)) {
      return false;
    }
    if (!Objects.equals(this.resourceType, commonEvent.resourceType)) {
      return false;
    }
    if (!Objects.equals(this.status, commonEvent.status)) {
      return false;
    }
    if (!Objects.equals(this.statusReason, commonEvent.statusReason)) {
      return false;
    }
    if (!Objects.equals(this.timestamp, commonEvent.timestamp)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, name, progress, resourceType, status, statusReason, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonEvent {\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

