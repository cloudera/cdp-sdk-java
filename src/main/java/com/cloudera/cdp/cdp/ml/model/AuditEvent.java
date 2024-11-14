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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.time.ZonedDateTime;

/**
 * Audit event descibes an performed or performing in a given workbench.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-11-13T12:48:25.494-08:00")
public class AuditEvent  {

  /**
   * workbench crn where the event observed.
   **/
  private String workspaceCrn = null;

  /**
   * UserCrn to track which user has caused the event.
   **/
  private String userCrn = null;

  /**
   * Unique request ID to keep track of event.
   **/
  private String requestID = null;

  /**
   * Action the user has generated.
   **/
  private String action = null;

  /**
   * Time at creation of event.
   **/
  private ZonedDateTime createdDate = null;

  /**
   * Getter for workspaceCrn.
   * workbench crn where the event observed.
   **/
  @JsonProperty("workspaceCrn")
  public String getWorkspaceCrn() {
    return workspaceCrn;
  }

  /**
   * Setter for workspaceCrn.
   * workbench crn where the event observed.
   **/
  public void setWorkspaceCrn(String workspaceCrn) {
    this.workspaceCrn = workspaceCrn;
  }

  /**
   * Getter for userCrn.
   * UserCrn to track which user has caused the event.
   **/
  @JsonProperty("userCrn")
  public String getUserCrn() {
    return userCrn;
  }

  /**
   * Setter for userCrn.
   * UserCrn to track which user has caused the event.
   **/
  public void setUserCrn(String userCrn) {
    this.userCrn = userCrn;
  }

  /**
   * Getter for requestID.
   * Unique request ID to keep track of event.
   **/
  @JsonProperty("requestID")
  public String getRequestID() {
    return requestID;
  }

  /**
   * Setter for requestID.
   * Unique request ID to keep track of event.
   **/
  public void setRequestID(String requestID) {
    this.requestID = requestID;
  }

  /**
   * Getter for action.
   * Action the user has generated.
   **/
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  /**
   * Setter for action.
   * Action the user has generated.
   **/
  public void setAction(String action) {
    this.action = action;
  }

  /**
   * Getter for createdDate.
   * Time at creation of event.
   **/
  @JsonProperty("createdDate")
  public ZonedDateTime getCreatedDate() {
    return createdDate;
  }

  /**
   * Setter for createdDate.
   * Time at creation of event.
   **/
  public void setCreatedDate(ZonedDateTime createdDate) {
    this.createdDate = createdDate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditEvent auditEvent = (AuditEvent) o;
    if (!Objects.equals(this.workspaceCrn, auditEvent.workspaceCrn)) {
      return false;
    }
    if (!Objects.equals(this.userCrn, auditEvent.userCrn)) {
      return false;
    }
    if (!Objects.equals(this.requestID, auditEvent.requestID)) {
      return false;
    }
    if (!Objects.equals(this.action, auditEvent.action)) {
      return false;
    }
    if (!Objects.equals(this.createdDate, auditEvent.createdDate)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceCrn, userCrn, requestID, action, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditEvent {\n");
    sb.append("    workspaceCrn: ").append(toIndentedString(workspaceCrn)).append("\n");
    sb.append("    userCrn: ").append(toIndentedString(userCrn)).append("\n");
    sb.append("    requestID: ").append(toIndentedString(requestID)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

