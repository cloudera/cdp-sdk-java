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

/**
 * Represents a Event.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-06-24T14:06:21.133-07:00")
public class Event  {

  /**
   * The ID of the operation to which the event belongs.
   **/
  private String operationId = null;

  /**
   * The ID of the service to which the event belongs.
   **/
  private String serviceId = null;

  /**
   * The name of the event.
   **/
  private String event = null;

  /**
   * Detailed message.
   **/
  private String message = null;

  /**
   * The timestamp of the event.
   **/
  private ZonedDateTime timestamp = null;

  /**
   * Getter for operationId.
   * The ID of the operation to which the event belongs.
   **/
  @JsonProperty("operationId")
  public String getOperationId() {
    return operationId;
  }

  /**
   * Setter for operationId.
   * The ID of the operation to which the event belongs.
   **/
  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  /**
   * Getter for serviceId.
   * The ID of the service to which the event belongs.
   **/
  @JsonProperty("serviceId")
  public String getServiceId() {
    return serviceId;
  }

  /**
   * Setter for serviceId.
   * The ID of the service to which the event belongs.
   **/
  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  /**
   * Getter for event.
   * The name of the event.
   **/
  @JsonProperty("event")
  public String getEvent() {
    return event;
  }

  /**
   * Setter for event.
   * The name of the event.
   **/
  public void setEvent(String event) {
    this.event = event;
  }

  /**
   * Getter for message.
   * Detailed message.
   **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Setter for message.
   * Detailed message.
   **/
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Getter for timestamp.
   * The timestamp of the event.
   **/
  @JsonProperty("timestamp")
  public ZonedDateTime getTimestamp() {
    return timestamp;
  }

  /**
   * Setter for timestamp.
   * The timestamp of the event.
   **/
  public void setTimestamp(ZonedDateTime timestamp) {
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
    Event event = (Event) o;
    if (!Objects.equals(this.operationId, event.operationId)) {
      return false;
    }
    if (!Objects.equals(this.serviceId, event.serviceId)) {
      return false;
    }
    if (!Objects.equals(this.event, event.event)) {
      return false;
    }
    if (!Objects.equals(this.message, event.message)) {
      return false;
    }
    if (!Objects.equals(this.timestamp, event.timestamp)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, serviceId, event, message, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

