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
import com.cloudera.cdp.audit.model.ApiRequestEventCriteria;
import com.cloudera.cdp.audit.model.CdpServiceEventCriteria;
import com.cloudera.cdp.audit.model.InteractiveLoginEventCriteria;
import java.time.ZonedDateTime;

/**
 * Request object for the ListEvents method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-04-10T13:24:00.293-07:00")
public class ListEventsRequest  {

  /**
   * The beginning timestamp for the search range (inclusive).
   **/
  private ZonedDateTime fromTimestamp = null;

  /**
   * The ending timestamp for the search range (exclusive).
   **/
  private ZonedDateTime toTimestamp = null;

  /**
   * The page size.
   **/
  private Integer pageSize = null;

  /**
   * The page token.
   **/
  private String pageToken = null;

  /**
   * The optional request ID. If specified, only events associated with this request ID are returned.
   **/
  private String requestId = null;

  /**
   * The optional source service. If specified, only events associated with this event source are returned. The source must be the name of a service as enumerated in the CRN definition.
   **/
  private String eventSource = null;

  /**
   * The optional event name. If specified, only events with this name are returned.
   **/
  private String eventName = null;

  /**
   * The optional actor CRN. If specified, only events with this CRN recorded for the actor identity are returned.
   **/
  private String actorCrn = null;

  /**
   * The optional result code. If specified, only events with this result code are returned. Events without a result code are not returned.
   **/
  private String resultCode = null;

  /**
   * The optional result message. If specified, only events with this result message are returned. Events without a result message are not returned.
   **/
  private String resultMessage = null;

  /**
   * Optional additional filtering criteria for listing API request audit events.
   **/
  private ApiRequestEventCriteria apiRequestEventCriteria = null;

  /**
   * Optional additional filtering criteria for listing CDP service audit events.
   **/
  private CdpServiceEventCriteria cdpServiceEventCriteria = null;

  /**
   * Optional additional filtering criteria for listing interactive login audit events.
   **/
  private InteractiveLoginEventCriteria interactiveLoginEventCriteria = null;

  /**
   * Getter for fromTimestamp.
   * The beginning timestamp for the search range (inclusive).
   **/
  @JsonProperty("fromTimestamp")
  public ZonedDateTime getFromTimestamp() {
    return fromTimestamp;
  }

  /**
   * Setter for fromTimestamp.
   * The beginning timestamp for the search range (inclusive).
   **/
  public void setFromTimestamp(ZonedDateTime fromTimestamp) {
    this.fromTimestamp = fromTimestamp;
  }

  /**
   * Getter for toTimestamp.
   * The ending timestamp for the search range (exclusive).
   **/
  @JsonProperty("toTimestamp")
  public ZonedDateTime getToTimestamp() {
    return toTimestamp;
  }

  /**
   * Setter for toTimestamp.
   * The ending timestamp for the search range (exclusive).
   **/
  public void setToTimestamp(ZonedDateTime toTimestamp) {
    this.toTimestamp = toTimestamp;
  }

  /**
   * Getter for pageSize.
   * The page size.
   **/
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  /**
   * Setter for pageSize.
   * The page size.
   **/
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  /**
   * Getter for pageToken.
   * The page token.
   **/
  @JsonProperty("pageToken")
  public String getPageToken() {
    return pageToken;
  }

  /**
   * Setter for pageToken.
   * The page token.
   **/
  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }

  /**
   * Getter for requestId.
   * The optional request ID. If specified, only events associated with this request ID are returned.
   **/
  @JsonProperty("requestId")
  public String getRequestId() {
    return requestId;
  }

  /**
   * Setter for requestId.
   * The optional request ID. If specified, only events associated with this request ID are returned.
   **/
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * Getter for eventSource.
   * The optional source service. If specified, only events associated with this event source are returned. The source must be the name of a service as enumerated in the CRN definition.
   **/
  @JsonProperty("eventSource")
  public String getEventSource() {
    return eventSource;
  }

  /**
   * Setter for eventSource.
   * The optional source service. If specified, only events associated with this event source are returned. The source must be the name of a service as enumerated in the CRN definition.
   **/
  public void setEventSource(String eventSource) {
    this.eventSource = eventSource;
  }

  /**
   * Getter for eventName.
   * The optional event name. If specified, only events with this name are returned.
   **/
  @JsonProperty("eventName")
  public String getEventName() {
    return eventName;
  }

  /**
   * Setter for eventName.
   * The optional event name. If specified, only events with this name are returned.
   **/
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  /**
   * Getter for actorCrn.
   * The optional actor CRN. If specified, only events with this CRN recorded for the actor identity are returned.
   **/
  @JsonProperty("actorCrn")
  public String getActorCrn() {
    return actorCrn;
  }

  /**
   * Setter for actorCrn.
   * The optional actor CRN. If specified, only events with this CRN recorded for the actor identity are returned.
   **/
  public void setActorCrn(String actorCrn) {
    this.actorCrn = actorCrn;
  }

  /**
   * Getter for resultCode.
   * The optional result code. If specified, only events with this result code are returned. Events without a result code are not returned.
   **/
  @JsonProperty("resultCode")
  public String getResultCode() {
    return resultCode;
  }

  /**
   * Setter for resultCode.
   * The optional result code. If specified, only events with this result code are returned. Events without a result code are not returned.
   **/
  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }

  /**
   * Getter for resultMessage.
   * The optional result message. If specified, only events with this result message are returned. Events without a result message are not returned.
   **/
  @JsonProperty("resultMessage")
  public String getResultMessage() {
    return resultMessage;
  }

  /**
   * Setter for resultMessage.
   * The optional result message. If specified, only events with this result message are returned. Events without a result message are not returned.
   **/
  public void setResultMessage(String resultMessage) {
    this.resultMessage = resultMessage;
  }

  /**
   * Getter for apiRequestEventCriteria.
   * Optional additional filtering criteria for listing API request audit events.
   **/
  @JsonProperty("apiRequestEventCriteria")
  public ApiRequestEventCriteria getApiRequestEventCriteria() {
    return apiRequestEventCriteria;
  }

  /**
   * Setter for apiRequestEventCriteria.
   * Optional additional filtering criteria for listing API request audit events.
   **/
  public void setApiRequestEventCriteria(ApiRequestEventCriteria apiRequestEventCriteria) {
    this.apiRequestEventCriteria = apiRequestEventCriteria;
  }

  /**
   * Getter for cdpServiceEventCriteria.
   * Optional additional filtering criteria for listing CDP service audit events.
   **/
  @JsonProperty("cdpServiceEventCriteria")
  public CdpServiceEventCriteria getCdpServiceEventCriteria() {
    return cdpServiceEventCriteria;
  }

  /**
   * Setter for cdpServiceEventCriteria.
   * Optional additional filtering criteria for listing CDP service audit events.
   **/
  public void setCdpServiceEventCriteria(CdpServiceEventCriteria cdpServiceEventCriteria) {
    this.cdpServiceEventCriteria = cdpServiceEventCriteria;
  }

  /**
   * Getter for interactiveLoginEventCriteria.
   * Optional additional filtering criteria for listing interactive login audit events.
   **/
  @JsonProperty("interactiveLoginEventCriteria")
  public InteractiveLoginEventCriteria getInteractiveLoginEventCriteria() {
    return interactiveLoginEventCriteria;
  }

  /**
   * Setter for interactiveLoginEventCriteria.
   * Optional additional filtering criteria for listing interactive login audit events.
   **/
  public void setInteractiveLoginEventCriteria(InteractiveLoginEventCriteria interactiveLoginEventCriteria) {
    this.interactiveLoginEventCriteria = interactiveLoginEventCriteria;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListEventsRequest listEventsRequest = (ListEventsRequest) o;
    if (!Objects.equals(this.fromTimestamp, listEventsRequest.fromTimestamp)) {
      return false;
    }
    if (!Objects.equals(this.toTimestamp, listEventsRequest.toTimestamp)) {
      return false;
    }
    if (!Objects.equals(this.pageSize, listEventsRequest.pageSize)) {
      return false;
    }
    if (!Objects.equals(this.pageToken, listEventsRequest.pageToken)) {
      return false;
    }
    if (!Objects.equals(this.requestId, listEventsRequest.requestId)) {
      return false;
    }
    if (!Objects.equals(this.eventSource, listEventsRequest.eventSource)) {
      return false;
    }
    if (!Objects.equals(this.eventName, listEventsRequest.eventName)) {
      return false;
    }
    if (!Objects.equals(this.actorCrn, listEventsRequest.actorCrn)) {
      return false;
    }
    if (!Objects.equals(this.resultCode, listEventsRequest.resultCode)) {
      return false;
    }
    if (!Objects.equals(this.resultMessage, listEventsRequest.resultMessage)) {
      return false;
    }
    if (!Objects.equals(this.apiRequestEventCriteria, listEventsRequest.apiRequestEventCriteria)) {
      return false;
    }
    if (!Objects.equals(this.cdpServiceEventCriteria, listEventsRequest.cdpServiceEventCriteria)) {
      return false;
    }
    if (!Objects.equals(this.interactiveLoginEventCriteria, listEventsRequest.interactiveLoginEventCriteria)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromTimestamp, toTimestamp, pageSize, pageToken, requestId, eventSource, eventName, actorCrn, resultCode, resultMessage, apiRequestEventCriteria, cdpServiceEventCriteria, interactiveLoginEventCriteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListEventsRequest {\n");
    sb.append("    fromTimestamp: ").append(toIndentedString(fromTimestamp)).append("\n");
    sb.append("    toTimestamp: ").append(toIndentedString(toTimestamp)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    actorCrn: ").append(toIndentedString(actorCrn)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    resultMessage: ").append(toIndentedString(resultMessage)).append("\n");
    sb.append("    apiRequestEventCriteria: ").append(toIndentedString(apiRequestEventCriteria)).append("\n");
    sb.append("    cdpServiceEventCriteria: ").append(toIndentedString(cdpServiceEventCriteria)).append("\n");
    sb.append("    interactiveLoginEventCriteria: ").append(toIndentedString(interactiveLoginEventCriteria)).append("\n");
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

