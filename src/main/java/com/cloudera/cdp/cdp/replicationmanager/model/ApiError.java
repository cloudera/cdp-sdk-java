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

package com.cloudera.cdp.replicationmanager.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * API error.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-08-15T13:42:20.189-07:00")
public class ApiError  {

  /**
   * Error code.
   **/
  private Integer code = null;

  /**
   * Error message.
   **/
  private String message = null;

  /**
   * Error status.
   **/
  private String status = null;

  /**
   * Cluster URL.
   **/
  private String clusterUrl = null;

  /**
   * Request ID.
   **/
  private String requestId = null;

  /**
   * Getter for code.
   * Error code.
   **/
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  /**
   * Setter for code.
   * Error code.
   **/
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * Getter for message.
   * Error message.
   **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Setter for message.
   * Error message.
   **/
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Getter for status.
   * Error status.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Error status.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for clusterUrl.
   * Cluster URL.
   **/
  @JsonProperty("clusterUrl")
  public String getClusterUrl() {
    return clusterUrl;
  }

  /**
   * Setter for clusterUrl.
   * Cluster URL.
   **/
  public void setClusterUrl(String clusterUrl) {
    this.clusterUrl = clusterUrl;
  }

  /**
   * Getter for requestId.
   * Request ID.
   **/
  @JsonProperty("requestId")
  public String getRequestId() {
    return requestId;
  }

  /**
   * Setter for requestId.
   * Request ID.
   **/
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiError apiError = (ApiError) o;
    if (!Objects.equals(this.code, apiError.code)) {
      return false;
    }
    if (!Objects.equals(this.message, apiError.message)) {
      return false;
    }
    if (!Objects.equals(this.status, apiError.status)) {
      return false;
    }
    if (!Objects.equals(this.clusterUrl, apiError.clusterUrl)) {
      return false;
    }
    if (!Objects.equals(this.requestId, apiError.requestId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, status, clusterUrl, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    clusterUrl: ").append(toIndentedString(clusterUrl)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

