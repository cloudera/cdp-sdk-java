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

/**
 * GetLogsRequest for getting logs for a request ID.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-01-05T09:16:30.380-08:00")
public class GetLogsRequest  {

  /**
   * Unique Key to identify a set of logs.
   **/
  private String requestID = null;

  /**
   * Flag to fetch all logs.
   **/
  private Boolean fetchAll = null;

  /**
   * Limit the number of logs.
   **/
  private Integer pageSize = null;

  /**
   * offset from which the logs should be fetched.
   **/
  private Integer offset = null;

  /**
   * Deprecated. Please begin to use resourceCrn, as this will soon be unsupported
   **/
  private String workspaceCrn = null;

  /**
   * Getter for requestID.
   * Unique Key to identify a set of logs.
   **/
  @JsonProperty("requestID")
  public String getRequestID() {
    return requestID;
  }

  /**
   * Setter for requestID.
   * Unique Key to identify a set of logs.
   **/
  public void setRequestID(String requestID) {
    this.requestID = requestID;
  }

  /**
   * Getter for fetchAll.
   * Flag to fetch all logs.
   **/
  @JsonProperty("fetchAll")
  public Boolean getFetchAll() {
    return fetchAll;
  }

  /**
   * Setter for fetchAll.
   * Flag to fetch all logs.
   **/
  public void setFetchAll(Boolean fetchAll) {
    this.fetchAll = fetchAll;
  }

  /**
   * Getter for pageSize.
   * Limit the number of logs.
   **/
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  /**
   * Setter for pageSize.
   * Limit the number of logs.
   **/
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  /**
   * Getter for offset.
   * offset from which the logs should be fetched.
   **/
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }

  /**
   * Setter for offset.
   * offset from which the logs should be fetched.
   **/
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  /**
   * Getter for workspaceCrn.
   * Deprecated. Please begin to use resourceCrn, as this will soon be unsupported
   **/
  @Deprecated
  @JsonProperty("workspaceCrn")
  public String getWorkspaceCrn() {
    return workspaceCrn;
  }

  /**
   * Setter for workspaceCrn.
   * Deprecated. Please begin to use resourceCrn, as this will soon be unsupported
   **/
  @Deprecated
  public void setWorkspaceCrn(String workspaceCrn) {
    this.workspaceCrn = workspaceCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLogsRequest getLogsRequest = (GetLogsRequest) o;
    if (!Objects.equals(this.requestID, getLogsRequest.requestID)) {
      return false;
    }
    if (!Objects.equals(this.fetchAll, getLogsRequest.fetchAll)) {
      return false;
    }
    if (!Objects.equals(this.pageSize, getLogsRequest.pageSize)) {
      return false;
    }
    if (!Objects.equals(this.offset, getLogsRequest.offset)) {
      return false;
    }
    if (!Objects.equals(this.workspaceCrn, getLogsRequest.workspaceCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestID, fetchAll, pageSize, offset, workspaceCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLogsRequest {\n");
    sb.append("    requestID: ").append(toIndentedString(requestID)).append("\n");
    sb.append("    fetchAll: ").append(toIndentedString(fetchAll)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    workspaceCrn: ").append(toIndentedString(workspaceCrn)).append("\n");
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

