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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.time.ZonedDateTime;

/**
 * Response object for tracking the latest (current/last) operation on the environment resource.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-14T11:34:35.786-07:00")
public class GetOperationResponse extends CdpResponse {

  /**
   * Identifier of the operation.
   **/
  private String operationId = null;

  /**
   * Name of the operation.
   **/
  private String operationName = null;

  /**
   * Status of the operation.
   **/
  private String operationStatus = null;

  /**
   * Start time of the operation.
   **/
  private ZonedDateTime started = null;

  /**
   * End time of the operation.
   **/
  private ZonedDateTime ended = null;

  /**
   * Getter for operationId.
   * Identifier of the operation.
   **/
  @JsonProperty("operationId")
  public String getOperationId() {
    return operationId;
  }

  /**
   * Setter for operationId.
   * Identifier of the operation.
   **/
  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  /**
   * Getter for operationName.
   * Name of the operation.
   **/
  @JsonProperty("operationName")
  public String getOperationName() {
    return operationName;
  }

  /**
   * Setter for operationName.
   * Name of the operation.
   **/
  public void setOperationName(String operationName) {
    this.operationName = operationName;
  }

  /**
   * Getter for operationStatus.
   * Status of the operation.
   **/
  @JsonProperty("operationStatus")
  public String getOperationStatus() {
    return operationStatus;
  }

  /**
   * Setter for operationStatus.
   * Status of the operation.
   **/
  public void setOperationStatus(String operationStatus) {
    this.operationStatus = operationStatus;
  }

  /**
   * Getter for started.
   * Start time of the operation.
   **/
  @JsonProperty("started")
  public ZonedDateTime getStarted() {
    return started;
  }

  /**
   * Setter for started.
   * Start time of the operation.
   **/
  public void setStarted(ZonedDateTime started) {
    this.started = started;
  }

  /**
   * Getter for ended.
   * End time of the operation.
   **/
  @JsonProperty("ended")
  public ZonedDateTime getEnded() {
    return ended;
  }

  /**
   * Setter for ended.
   * End time of the operation.
   **/
  public void setEnded(ZonedDateTime ended) {
    this.ended = ended;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOperationResponse getOperationResponse = (GetOperationResponse) o;
    if (!Objects.equals(this.operationId, getOperationResponse.operationId)) {
      return false;
    }
    if (!Objects.equals(this.operationName, getOperationResponse.operationName)) {
      return false;
    }
    if (!Objects.equals(this.operationStatus, getOperationResponse.operationStatus)) {
      return false;
    }
    if (!Objects.equals(this.started, getOperationResponse.started)) {
      return false;
    }
    if (!Objects.equals(this.ended, getOperationResponse.ended)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, operationName, operationStatus, started, ended, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOperationResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    operationName: ").append(toIndentedString(operationName)).append("\n");
    sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    ended: ").append(toIndentedString(ended)).append("\n");
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

