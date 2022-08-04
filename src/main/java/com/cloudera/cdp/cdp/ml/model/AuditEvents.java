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
import com.cloudera.cdp.ml.model.AuditEvent;
import java.util.*;

/**
 * AuditEvents contains all the audit events for a given workspace crn.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-08-03T22:29:41.755-07:00")
public class AuditEvents  {

  /**
   * Workspace crn unique for the set of audit events.
   **/
  private String workspaceCrn = null;

  /**
   * AuditEvent belong to the workspace crn.
   **/
  private List<AuditEvent> events = new ArrayList<AuditEvent>();

  /**
   * Getter for workspaceCrn.
   * Workspace crn unique for the set of audit events.
   **/
  @JsonProperty("workspaceCrn")
  public String getWorkspaceCrn() {
    return workspaceCrn;
  }

  /**
   * Setter for workspaceCrn.
   * Workspace crn unique for the set of audit events.
   **/
  public void setWorkspaceCrn(String workspaceCrn) {
    this.workspaceCrn = workspaceCrn;
  }

  /**
   * Getter for events.
   * AuditEvent belong to the workspace crn.
   **/
  @JsonProperty("events")
  public List<AuditEvent> getEvents() {
    return events;
  }

  /**
   * Setter for events.
   * AuditEvent belong to the workspace crn.
   **/
  public void setEvents(List<AuditEvent> events) {
    this.events = events;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditEvents auditEvents = (AuditEvents) o;
    if (!Objects.equals(this.workspaceCrn, auditEvents.workspaceCrn)) {
      return false;
    }
    if (!Objects.equals(this.events, auditEvents.events)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceCrn, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditEvents {\n");
    sb.append("    workspaceCrn: ").append(toIndentedString(workspaceCrn)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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

