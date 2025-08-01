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
import com.cloudera.cdp.environments.model.SyncOperationDetails;
import java.util.*;

/**
 * Response Object for single user sync operation.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:42.850-07:00")
public class SyncUserResponse extends CdpResponse {

  /**
   * Unique operation ID assigned to this command execution. Use this identifier with 'get-operation' to track status and retrieve detailed results.
   **/
  private String operationId = null;

  /**
   * Operation type, set password or user sync
   **/
  private String operationType = null;

  /**
   * Status of this operation. Status can be one of these values (REQUESTED, RUNNING, COMPLETED, FAILED, REJECTED, TIMEDOUT)
   **/
  private String status = null;

  /**
   * List of sync operation details for all succeeded environments.
   **/
  private List<SyncOperationDetails> success = new ArrayList<SyncOperationDetails>();

  /**
   * List of sync operation details for all failed envs.
   **/
  private List<SyncOperationDetails> failure = new ArrayList<SyncOperationDetails>();

  /**
   * If there is any error associated.
   **/
  private String error = null;

  /**
   * Sync operation start timestamp.
   **/
  private String startTime = null;

  /**
   * Sync operation end timestamp.
   **/
  private String endTime = null;

  /**
   * Getter for operationId.
   * Unique operation ID assigned to this command execution. Use this identifier with &#39;get-operation&#39; to track status and retrieve detailed results.
   **/
  @JsonProperty("operationId")
  public String getOperationId() {
    return operationId;
  }

  /**
   * Setter for operationId.
   * Unique operation ID assigned to this command execution. Use this identifier with &#39;get-operation&#39; to track status and retrieve detailed results.
   **/
  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  /**
   * Getter for operationType.
   * Operation type, set password or user sync
   **/
  @JsonProperty("operationType")
  public String getOperationType() {
    return operationType;
  }

  /**
   * Setter for operationType.
   * Operation type, set password or user sync
   **/
  public void setOperationType(String operationType) {
    this.operationType = operationType;
  }

  /**
   * Getter for status.
   * Status of this operation. Status can be one of these values (REQUESTED, RUNNING, COMPLETED, FAILED, REJECTED, TIMEDOUT)
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of this operation. Status can be one of these values (REQUESTED, RUNNING, COMPLETED, FAILED, REJECTED, TIMEDOUT)
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for success.
   * List of sync operation details for all succeeded environments.
   **/
  @JsonProperty("success")
  public List<SyncOperationDetails> getSuccess() {
    return success;
  }

  /**
   * Setter for success.
   * List of sync operation details for all succeeded environments.
   **/
  public void setSuccess(List<SyncOperationDetails> success) {
    this.success = success;
  }

  /**
   * Getter for failure.
   * List of sync operation details for all failed envs.
   **/
  @JsonProperty("failure")
  public List<SyncOperationDetails> getFailure() {
    return failure;
  }

  /**
   * Setter for failure.
   * List of sync operation details for all failed envs.
   **/
  public void setFailure(List<SyncOperationDetails> failure) {
    this.failure = failure;
  }

  /**
   * Getter for error.
   * If there is any error associated.
   **/
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  /**
   * Setter for error.
   * If there is any error associated.
   **/
  public void setError(String error) {
    this.error = error;
  }

  /**
   * Getter for startTime.
   * Sync operation start timestamp.
   **/
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }

  /**
   * Setter for startTime.
   * Sync operation start timestamp.
   **/
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  /**
   * Getter for endTime.
   * Sync operation end timestamp.
   **/
  @JsonProperty("endTime")
  public String getEndTime() {
    return endTime;
  }

  /**
   * Setter for endTime.
   * Sync operation end timestamp.
   **/
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncUserResponse syncUserResponse = (SyncUserResponse) o;
    if (!Objects.equals(this.operationId, syncUserResponse.operationId)) {
      return false;
    }
    if (!Objects.equals(this.operationType, syncUserResponse.operationType)) {
      return false;
    }
    if (!Objects.equals(this.status, syncUserResponse.status)) {
      return false;
    }
    if (!Objects.equals(this.success, syncUserResponse.success)) {
      return false;
    }
    if (!Objects.equals(this.failure, syncUserResponse.failure)) {
      return false;
    }
    if (!Objects.equals(this.error, syncUserResponse.error)) {
      return false;
    }
    if (!Objects.equals(this.startTime, syncUserResponse.startTime)) {
      return false;
    }
    if (!Objects.equals(this.endTime, syncUserResponse.endTime)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, operationType, status, success, failure, error, startTime, endTime, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncUserResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

