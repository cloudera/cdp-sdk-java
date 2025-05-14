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
import com.cloudera.cdp.df.model.Event;
import com.cloudera.cdp.df.model.MetricSummary;

/**
 * Event details
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-14T11:34:37.723-07:00")
public class EventDetail  {

  /**
   * The event
   **/
  private Event event = null;

  /**
   * the metric summary
   **/
  private MetricSummary metricSummary = null;

  /**
   * Getter for event.
   * The event
   **/
  @JsonProperty("event")
  public Event getEvent() {
    return event;
  }

  /**
   * Setter for event.
   * The event
   **/
  public void setEvent(Event event) {
    this.event = event;
  }

  /**
   * Getter for metricSummary.
   * the metric summary
   **/
  @JsonProperty("metricSummary")
  public MetricSummary getMetricSummary() {
    return metricSummary;
  }

  /**
   * Setter for metricSummary.
   * the metric summary
   **/
  public void setMetricSummary(MetricSummary metricSummary) {
    this.metricSummary = metricSummary;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventDetail eventDetail = (EventDetail) o;
    if (!Objects.equals(this.event, eventDetail.event)) {
      return false;
    }
    if (!Objects.equals(this.metricSummary, eventDetail.metricSummary)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, metricSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventDetail {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    metricSummary: ").append(toIndentedString(metricSummary)).append("\n");
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

