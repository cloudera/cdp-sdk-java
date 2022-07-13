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

package com.cloudera.cdp.df.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * A notification for an event
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-07-12T15:10:00.396-07:00")
public class Notification  {

  /**
   * The name of the notification
   **/
  private String name = null;

  /**
   * The description of the notification
   **/
  private String description = null;

  /**
   * The severity of the notification
   **/
  private String severity = null;

  /**
   * The id of the component referenced by this notification
   **/
  private String referenceId = null;

  /**
   * The type of component referenced by this notification
   **/
  private String referenceType = null;

  /**
   * The user associated with the notification
   **/
  private String username = null;

  /**
   * The id of the event that triggered this notification
   **/
  private String eventId = null;

  /**
   * The timestamp of the event that triggered this notification
   **/
  private Long timestamp = null;

  /**
   * Getter for name.
   * The name of the notification
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the notification
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for description.
   * The description of the notification
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * The description of the notification
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for severity.
   * The severity of the notification
   **/
  @JsonProperty("severity")
  public String getSeverity() {
    return severity;
  }

  /**
   * Setter for severity.
   * The severity of the notification
   **/
  public void setSeverity(String severity) {
    this.severity = severity;
  }

  /**
   * Getter for referenceId.
   * The id of the component referenced by this notification
   **/
  @JsonProperty("referenceId")
  public String getReferenceId() {
    return referenceId;
  }

  /**
   * Setter for referenceId.
   * The id of the component referenced by this notification
   **/
  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  /**
   * Getter for referenceType.
   * The type of component referenced by this notification
   **/
  @JsonProperty("referenceType")
  public String getReferenceType() {
    return referenceType;
  }

  /**
   * Setter for referenceType.
   * The type of component referenced by this notification
   **/
  public void setReferenceType(String referenceType) {
    this.referenceType = referenceType;
  }

  /**
   * Getter for username.
   * The user associated with the notification
   **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  /**
   * Setter for username.
   * The user associated with the notification
   **/
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Getter for eventId.
   * The id of the event that triggered this notification
   **/
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }

  /**
   * Setter for eventId.
   * The id of the event that triggered this notification
   **/
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * Getter for timestamp.
   * The timestamp of the event that triggered this notification
   **/
  @JsonProperty("timestamp")
  public Long getTimestamp() {
    return timestamp;
  }

  /**
   * Setter for timestamp.
   * The timestamp of the event that triggered this notification
   **/
  public void setTimestamp(Long timestamp) {
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
    Notification notification = (Notification) o;
    if (!Objects.equals(this.name, notification.name)) {
      return false;
    }
    if (!Objects.equals(this.description, notification.description)) {
      return false;
    }
    if (!Objects.equals(this.severity, notification.severity)) {
      return false;
    }
    if (!Objects.equals(this.referenceId, notification.referenceId)) {
      return false;
    }
    if (!Objects.equals(this.referenceType, notification.referenceType)) {
      return false;
    }
    if (!Objects.equals(this.username, notification.username)) {
      return false;
    }
    if (!Objects.equals(this.eventId, notification.eventId)) {
      return false;
    }
    if (!Objects.equals(this.timestamp, notification.timestamp)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, severity, referenceId, referenceType, username, eventId, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
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

