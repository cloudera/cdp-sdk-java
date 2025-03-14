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
import java.time.ZonedDateTime;
import java.util.*;

/**
 * Response object for Sync Operation.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-13T11:52:46.289-07:00")
public class LastSyncStatusResponse extends CdpResponse {

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
   * List of sync operation details for all failed environments.
   **/
  private List<SyncOperationDetails> failure = new ArrayList<SyncOperationDetails>();

  /**
   * If there is any error associated. The error will be populated on any error and it may be populated when the operation failure details are empty.
   **/
  private String error = null;

  /**
   * Date when the sync operation started.
   **/
  private ZonedDateTime startDate = null;

  /**
   * Date when the sync operation ended. Omitted if operation has not ended.
   **/
  private ZonedDateTime endDate = null;

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
   * List of sync operation details for all failed environments.
   **/
  @JsonProperty("failure")
  public List<SyncOperationDetails> getFailure() {
    return failure;
  }

  /**
   * Setter for failure.
   * List of sync operation details for all failed environments.
   **/
  public void setFailure(List<SyncOperationDetails> failure) {
    this.failure = failure;
  }

  /**
   * Getter for error.
   * If there is any error associated. The error will be populated on any error and it may be populated when the operation failure details are empty.
   **/
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  /**
   * Setter for error.
   * If there is any error associated. The error will be populated on any error and it may be populated when the operation failure details are empty.
   **/
  public void setError(String error) {
    this.error = error;
  }

  /**
   * Getter for startDate.
   * Date when the sync operation started.
   **/
  @JsonProperty("startDate")
  public ZonedDateTime getStartDate() {
    return startDate;
  }

  /**
   * Setter for startDate.
   * Date when the sync operation started.
   **/
  public void setStartDate(ZonedDateTime startDate) {
    this.startDate = startDate;
  }

  /**
   * Getter for endDate.
   * Date when the sync operation ended. Omitted if operation has not ended.
   **/
  @JsonProperty("endDate")
  public ZonedDateTime getEndDate() {
    return endDate;
  }

  /**
   * Setter for endDate.
   * Date when the sync operation ended. Omitted if operation has not ended.
   **/
  public void setEndDate(ZonedDateTime endDate) {
    this.endDate = endDate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LastSyncStatusResponse lastSyncStatusResponse = (LastSyncStatusResponse) o;
    if (!Objects.equals(this.operationId, lastSyncStatusResponse.operationId)) {
      return false;
    }
    if (!Objects.equals(this.operationType, lastSyncStatusResponse.operationType)) {
      return false;
    }
    if (!Objects.equals(this.status, lastSyncStatusResponse.status)) {
      return false;
    }
    if (!Objects.equals(this.success, lastSyncStatusResponse.success)) {
      return false;
    }
    if (!Objects.equals(this.failure, lastSyncStatusResponse.failure)) {
      return false;
    }
    if (!Objects.equals(this.error, lastSyncStatusResponse.error)) {
      return false;
    }
    if (!Objects.equals(this.startDate, lastSyncStatusResponse.startDate)) {
      return false;
    }
    if (!Objects.equals(this.endDate, lastSyncStatusResponse.endDate)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, operationType, status, success, failure, error, startDate, endDate, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastSyncStatusResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

