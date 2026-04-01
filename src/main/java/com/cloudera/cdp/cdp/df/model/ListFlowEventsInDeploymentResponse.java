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
import com.cloudera.cdp.df.model.EventSummary;
import java.util.*;

/**
 * A response to list flow event history in a deployment.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-31T14:25:33.758-07:00")
public class ListFlowEventsInDeploymentResponse extends CdpResponse {

  /**
   * The list of events.
   **/
  private List<EventSummary> eventSummaries = new ArrayList<EventSummary>();

  /**
   * The page token for requesting the next page of results.
   **/
  private String nextToken = null;

  /**
   * Getter for eventSummaries.
   * The list of events.
   **/
  @JsonProperty("eventSummaries")
  public List<EventSummary> getEventSummaries() {
    return eventSummaries;
  }

  /**
   * Setter for eventSummaries.
   * The list of events.
   **/
  public void setEventSummaries(List<EventSummary> eventSummaries) {
    this.eventSummaries = eventSummaries;
  }

  /**
   * Getter for nextToken.
   * The page token for requesting the next page of results.
   **/
  @JsonProperty("nextToken")
  public String getNextToken() {
    return nextToken;
  }

  /**
   * Setter for nextToken.
   * The page token for requesting the next page of results.
   **/
  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListFlowEventsInDeploymentResponse listFlowEventsInDeploymentResponse = (ListFlowEventsInDeploymentResponse) o;
    if (!Objects.equals(this.eventSummaries, listFlowEventsInDeploymentResponse.eventSummaries)) {
      return false;
    }
    if (!Objects.equals(this.nextToken, listFlowEventsInDeploymentResponse.nextToken)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventSummaries, nextToken, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFlowEventsInDeploymentResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    eventSummaries: ").append(toIndentedString(eventSummaries)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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

