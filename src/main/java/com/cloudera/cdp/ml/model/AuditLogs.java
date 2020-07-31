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
import com.cloudera.cdp.ml.model.AuditLog;
import java.util.*;

/**
 * AuditLogs contains all the logs for a given request id.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2020-07-30T20:30:08.170-07:00")
public class AuditLogs  {

  /**
   * The request ID associated with a long-running operation to fetch the logs for.
   **/
  private String requestID = null;

  /**
   * Total number of logs associated with the request id.
   **/
  private Integer count = null;

  /**
   * Contains all the logs for a given request id.
   **/
  private List<AuditLog> logs = new ArrayList<AuditLog>();

  /**
   * Getter for requestID.
   * The request ID associated with a long-running operation to fetch the logs for.
   **/
  @JsonProperty("requestID")
  public String getRequestID() {
    return requestID;
  }

  /**
   * Setter for requestID.
   * The request ID associated with a long-running operation to fetch the logs for.
   **/
  public void setRequestID(String requestID) {
    this.requestID = requestID;
  }

  /**
   * Getter for count.
   * Total number of logs associated with the request id.
   **/
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  /**
   * Setter for count.
   * Total number of logs associated with the request id.
   **/
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * Getter for logs.
   * Contains all the logs for a given request id.
   **/
  @JsonProperty("logs")
  public List<AuditLog> getLogs() {
    return logs;
  }

  /**
   * Setter for logs.
   * Contains all the logs for a given request id.
   **/
  public void setLogs(List<AuditLog> logs) {
    this.logs = logs;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogs auditLogs = (AuditLogs) o;
    if (!Objects.equals(this.requestID, auditLogs.requestID)) {
      return false;
    }
    if (!Objects.equals(this.count, auditLogs.count)) {
      return false;
    }
    if (!Objects.equals(this.logs, auditLogs.logs)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestID, count, logs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogs {\n");
    sb.append("    requestID: ").append(toIndentedString(requestID)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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

