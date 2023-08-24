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
 * An event summary
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-08-24T14:47:24.414-07:00")
public class EventSummary  {

  /**
   * The CRN of the event
   **/
  private String crn = null;

  /**
   * Name of the event
   **/
  private String name = null;

  /**
   * The severity of the event
   **/
  private String severity = null;

  /**
   * Timestamp of the first occurrence of this event
   **/
  private Long firstOccurrence = null;

  /**
   * The type of event that occurred
   **/
  private String eventType = null;

  /**
   * Optional value for alerts
   **/
  private String alertType = null;

  /**
   * Getter for crn.
   * The CRN of the event
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the event
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for name.
   * Name of the event
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name of the event
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for severity.
   * The severity of the event
   **/
  @JsonProperty("severity")
  public String getSeverity() {
    return severity;
  }

  /**
   * Setter for severity.
   * The severity of the event
   **/
  public void setSeverity(String severity) {
    this.severity = severity;
  }

  /**
   * Getter for firstOccurrence.
   * Timestamp of the first occurrence of this event
   **/
  @JsonProperty("firstOccurrence")
  public Long getFirstOccurrence() {
    return firstOccurrence;
  }

  /**
   * Setter for firstOccurrence.
   * Timestamp of the first occurrence of this event
   **/
  public void setFirstOccurrence(Long firstOccurrence) {
    this.firstOccurrence = firstOccurrence;
  }

  /**
   * Getter for eventType.
   * The type of event that occurred
   **/
  @JsonProperty("eventType")
  public String getEventType() {
    return eventType;
  }

  /**
   * Setter for eventType.
   * The type of event that occurred
   **/
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  /**
   * Getter for alertType.
   * Optional value for alerts
   **/
  @JsonProperty("alertType")
  public String getAlertType() {
    return alertType;
  }

  /**
   * Setter for alertType.
   * Optional value for alerts
   **/
  public void setAlertType(String alertType) {
    this.alertType = alertType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSummary eventSummary = (EventSummary) o;
    if (!Objects.equals(this.crn, eventSummary.crn)) {
      return false;
    }
    if (!Objects.equals(this.name, eventSummary.name)) {
      return false;
    }
    if (!Objects.equals(this.severity, eventSummary.severity)) {
      return false;
    }
    if (!Objects.equals(this.firstOccurrence, eventSummary.firstOccurrence)) {
      return false;
    }
    if (!Objects.equals(this.eventType, eventSummary.eventType)) {
      return false;
    }
    if (!Objects.equals(this.alertType, eventSummary.alertType)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, name, severity, firstOccurrence, eventType, alertType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSummary {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    firstOccurrence: ").append(toIndentedString(firstOccurrence)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
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

