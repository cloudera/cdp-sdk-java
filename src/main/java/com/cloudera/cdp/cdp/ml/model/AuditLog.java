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
 * Audit log represents an individual log.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-04-11T11:03:30.661-07:00")
public class AuditLog  {

  /**
   * Time at which the log is created.
   **/
  private ZonedDateTime createdDate = null;

  /**
   * Log description.
   **/
  private String log = null;

  /**
   * Getter for createdDate.
   * Time at which the log is created.
   **/
  @JsonProperty("createdDate")
  public ZonedDateTime getCreatedDate() {
    return createdDate;
  }

  /**
   * Setter for createdDate.
   * Time at which the log is created.
   **/
  public void setCreatedDate(ZonedDateTime createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * Getter for log.
   * Log description.
   **/
  @JsonProperty("log")
  public String getLog() {
    return log;
  }

  /**
   * Setter for log.
   * Log description.
   **/
  public void setLog(String log) {
    this.log = log;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLog auditLog = (AuditLog) o;
    if (!Objects.equals(this.createdDate, auditLog.createdDate)) {
      return false;
    }
    if (!Objects.equals(this.log, auditLog.log)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, log);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLog {\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
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

