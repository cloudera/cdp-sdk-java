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
 * An event
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-11-13T12:48:27.676-08:00")
public class Event  {

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
   * The type of event that occurred
   **/
  private String eventType = null;

  /**
   * Timestamp of the first occurrence of this event
   **/
  private Long firstOccurrence = null;

  /**
   * Type of component that is identified by the referenceId.
   **/
  private String referenceType = null;

  /**
   * Timestamp of the last occurrence of this event
   **/
  private Long lastOccurrence = null;

  /**
   * Description of the event
   **/
  private String description = null;

  /**
   * The user associated with creating the event. Null for user-agnostic events.
   **/
  private String userName = null;

  /**
   * Optional value of the event when it was triggered
   **/
  private Double eventValue = null;

  /**
   * Optional value of the low end of the threshold that defines the event triggering condition
   **/
  private Double lowerThreshold = null;

  /**
   * Optional value of the high end of the threshold that defines the event triggering condition
   **/
  private Double upperThreshold = null;

  /**
   * Optional number of milliseconds tolerated outside the threshold bounds before the event is triggered
   **/
  private Long timeToleranceMillis = null;

  /**
   * Optional value of the units for the lower bound of the threshold
   **/
  private String lowerThresholdUnit = null;

  /**
   * Optional value of the units for the upper bound of the threshold
   **/
  private String upperThresholdUnit = null;

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
   * Getter for referenceType.
   * Type of component that is identified by the referenceId.
   **/
  @JsonProperty("referenceType")
  public String getReferenceType() {
    return referenceType;
  }

  /**
   * Setter for referenceType.
   * Type of component that is identified by the referenceId.
   **/
  public void setReferenceType(String referenceType) {
    this.referenceType = referenceType;
  }

  /**
   * Getter for lastOccurrence.
   * Timestamp of the last occurrence of this event
   **/
  @JsonProperty("lastOccurrence")
  public Long getLastOccurrence() {
    return lastOccurrence;
  }

  /**
   * Setter for lastOccurrence.
   * Timestamp of the last occurrence of this event
   **/
  public void setLastOccurrence(Long lastOccurrence) {
    this.lastOccurrence = lastOccurrence;
  }

  /**
   * Getter for description.
   * Description of the event
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * Description of the event
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for userName.
   * The user associated with creating the event. Null for user-agnostic events.
   **/
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  /**
   * Setter for userName.
   * The user associated with creating the event. Null for user-agnostic events.
   **/
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   * Getter for eventValue.
   * Optional value of the event when it was triggered
   **/
  @JsonProperty("eventValue")
  public Double getEventValue() {
    return eventValue;
  }

  /**
   * Setter for eventValue.
   * Optional value of the event when it was triggered
   **/
  public void setEventValue(Double eventValue) {
    this.eventValue = eventValue;
  }

  /**
   * Getter for lowerThreshold.
   * Optional value of the low end of the threshold that defines the event triggering condition
   **/
  @JsonProperty("lowerThreshold")
  public Double getLowerThreshold() {
    return lowerThreshold;
  }

  /**
   * Setter for lowerThreshold.
   * Optional value of the low end of the threshold that defines the event triggering condition
   **/
  public void setLowerThreshold(Double lowerThreshold) {
    this.lowerThreshold = lowerThreshold;
  }

  /**
   * Getter for upperThreshold.
   * Optional value of the high end of the threshold that defines the event triggering condition
   **/
  @JsonProperty("upperThreshold")
  public Double getUpperThreshold() {
    return upperThreshold;
  }

  /**
   * Setter for upperThreshold.
   * Optional value of the high end of the threshold that defines the event triggering condition
   **/
  public void setUpperThreshold(Double upperThreshold) {
    this.upperThreshold = upperThreshold;
  }

  /**
   * Getter for timeToleranceMillis.
   * Optional number of milliseconds tolerated outside the threshold bounds before the event is triggered
   **/
  @JsonProperty("timeToleranceMillis")
  public Long getTimeToleranceMillis() {
    return timeToleranceMillis;
  }

  /**
   * Setter for timeToleranceMillis.
   * Optional number of milliseconds tolerated outside the threshold bounds before the event is triggered
   **/
  public void setTimeToleranceMillis(Long timeToleranceMillis) {
    this.timeToleranceMillis = timeToleranceMillis;
  }

  /**
   * Getter for lowerThresholdUnit.
   * Optional value of the units for the lower bound of the threshold
   **/
  @JsonProperty("lowerThresholdUnit")
  public String getLowerThresholdUnit() {
    return lowerThresholdUnit;
  }

  /**
   * Setter for lowerThresholdUnit.
   * Optional value of the units for the lower bound of the threshold
   **/
  public void setLowerThresholdUnit(String lowerThresholdUnit) {
    this.lowerThresholdUnit = lowerThresholdUnit;
  }

  /**
   * Getter for upperThresholdUnit.
   * Optional value of the units for the upper bound of the threshold
   **/
  @JsonProperty("upperThresholdUnit")
  public String getUpperThresholdUnit() {
    return upperThresholdUnit;
  }

  /**
   * Setter for upperThresholdUnit.
   * Optional value of the units for the upper bound of the threshold
   **/
  public void setUpperThresholdUnit(String upperThresholdUnit) {
    this.upperThresholdUnit = upperThresholdUnit;
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
    Event event = (Event) o;
    if (!Objects.equals(this.crn, event.crn)) {
      return false;
    }
    if (!Objects.equals(this.name, event.name)) {
      return false;
    }
    if (!Objects.equals(this.severity, event.severity)) {
      return false;
    }
    if (!Objects.equals(this.eventType, event.eventType)) {
      return false;
    }
    if (!Objects.equals(this.firstOccurrence, event.firstOccurrence)) {
      return false;
    }
    if (!Objects.equals(this.referenceType, event.referenceType)) {
      return false;
    }
    if (!Objects.equals(this.lastOccurrence, event.lastOccurrence)) {
      return false;
    }
    if (!Objects.equals(this.description, event.description)) {
      return false;
    }
    if (!Objects.equals(this.userName, event.userName)) {
      return false;
    }
    if (!Objects.equals(this.eventValue, event.eventValue)) {
      return false;
    }
    if (!Objects.equals(this.lowerThreshold, event.lowerThreshold)) {
      return false;
    }
    if (!Objects.equals(this.upperThreshold, event.upperThreshold)) {
      return false;
    }
    if (!Objects.equals(this.timeToleranceMillis, event.timeToleranceMillis)) {
      return false;
    }
    if (!Objects.equals(this.lowerThresholdUnit, event.lowerThresholdUnit)) {
      return false;
    }
    if (!Objects.equals(this.upperThresholdUnit, event.upperThresholdUnit)) {
      return false;
    }
    if (!Objects.equals(this.alertType, event.alertType)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, name, severity, eventType, firstOccurrence, referenceType, lastOccurrence, description, userName, eventValue, lowerThreshold, upperThreshold, timeToleranceMillis, lowerThresholdUnit, upperThresholdUnit, alertType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    firstOccurrence: ").append(toIndentedString(firstOccurrence)).append("\n");
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
    sb.append("    lastOccurrence: ").append(toIndentedString(lastOccurrence)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    eventValue: ").append(toIndentedString(eventValue)).append("\n");
    sb.append("    lowerThreshold: ").append(toIndentedString(lowerThreshold)).append("\n");
    sb.append("    upperThreshold: ").append(toIndentedString(upperThreshold)).append("\n");
    sb.append("    timeToleranceMillis: ").append(toIndentedString(timeToleranceMillis)).append("\n");
    sb.append("    lowerThresholdUnit: ").append(toIndentedString(lowerThresholdUnit)).append("\n");
    sb.append("    upperThresholdUnit: ").append(toIndentedString(upperThresholdUnit)).append("\n");
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

