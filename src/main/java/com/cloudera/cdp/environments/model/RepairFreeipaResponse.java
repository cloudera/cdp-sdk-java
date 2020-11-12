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
import com.cloudera.cdp.environments.model.RepairOperationDetails;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * Response object for an FreeIPA repair request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2020-11-12T10:44:16.365-08:00")
public class RepairFreeipaResponse extends CdpResponse {

  /**
   * Operation ID of the request for this operation. This ID can be used for geting status on the operation.
   **/
  private String operationId = null;

  /**
   * Status of this operation.
   **/
  private String status = null;

  /**
   * List of operation details for all successes. If the repair is only partially successful both successful and failure operation details will be populated.
   **/
  private List<RepairOperationDetails> successfulOperationDetails = new ArrayList<RepairOperationDetails>();

  /**
   * List of operation details for failures. If the repair is only partially successful both successful and failure operation details will be populated.
   **/
  private List<RepairOperationDetails> failureOperationDetails = new ArrayList<RepairOperationDetails>();

  /**
   * If there is any error associated. The error will be populated on any error and it may be populated when the operation failure details are empty. The error will typically contain the high level information such as the assocated repair failure phase.
   **/
  private String error = null;

  /**
   * Date when the operation started.
   **/
  private ZonedDateTime startDate = null;

  /**
   * Date when the operation ended. Omitted if operation has not ended.
   **/
  private ZonedDateTime endDate = null;

  /**
   * Getter for operationId.
   * Operation ID of the request for this operation. This ID can be used for geting status on the operation.
   **/
  @JsonProperty("operationId")
  public String getOperationId() {
    return operationId;
  }

  /**
   * Setter for operationId.
   * Operation ID of the request for this operation. This ID can be used for geting status on the operation.
   **/
  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  /**
   * Getter for status.
   * Status of this operation.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of this operation.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for successfulOperationDetails.
   * List of operation details for all successes. If the repair is only partially successful both successful and failure operation details will be populated.
   **/
  @JsonProperty("successfulOperationDetails")
  public List<RepairOperationDetails> getSuccessfulOperationDetails() {
    return successfulOperationDetails;
  }

  /**
   * Setter for successfulOperationDetails.
   * List of operation details for all successes. If the repair is only partially successful both successful and failure operation details will be populated.
   **/
  public void setSuccessfulOperationDetails(List<RepairOperationDetails> successfulOperationDetails) {
    this.successfulOperationDetails = successfulOperationDetails;
  }

  /**
   * Getter for failureOperationDetails.
   * List of operation details for failures. If the repair is only partially successful both successful and failure operation details will be populated.
   **/
  @JsonProperty("failureOperationDetails")
  public List<RepairOperationDetails> getFailureOperationDetails() {
    return failureOperationDetails;
  }

  /**
   * Setter for failureOperationDetails.
   * List of operation details for failures. If the repair is only partially successful both successful and failure operation details will be populated.
   **/
  public void setFailureOperationDetails(List<RepairOperationDetails> failureOperationDetails) {
    this.failureOperationDetails = failureOperationDetails;
  }

  /**
   * Getter for error.
   * If there is any error associated. The error will be populated on any error and it may be populated when the operation failure details are empty. The error will typically contain the high level information such as the assocated repair failure phase.
   **/
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  /**
   * Setter for error.
   * If there is any error associated. The error will be populated on any error and it may be populated when the operation failure details are empty. The error will typically contain the high level information such as the assocated repair failure phase.
   **/
  public void setError(String error) {
    this.error = error;
  }

  /**
   * Getter for startDate.
   * Date when the operation started.
   **/
  @JsonProperty("startDate")
  public ZonedDateTime getStartDate() {
    return startDate;
  }

  /**
   * Setter for startDate.
   * Date when the operation started.
   **/
  public void setStartDate(ZonedDateTime startDate) {
    this.startDate = startDate;
  }

  /**
   * Getter for endDate.
   * Date when the operation ended. Omitted if operation has not ended.
   **/
  @JsonProperty("endDate")
  public ZonedDateTime getEndDate() {
    return endDate;
  }

  /**
   * Setter for endDate.
   * Date when the operation ended. Omitted if operation has not ended.
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
    RepairFreeipaResponse repairFreeipaResponse = (RepairFreeipaResponse) o;
    if (!Objects.equals(this.operationId, repairFreeipaResponse.operationId)) {
      return false;
    }
    if (!Objects.equals(this.status, repairFreeipaResponse.status)) {
      return false;
    }
    if (!Objects.equals(this.successfulOperationDetails, repairFreeipaResponse.successfulOperationDetails)) {
      return false;
    }
    if (!Objects.equals(this.failureOperationDetails, repairFreeipaResponse.failureOperationDetails)) {
      return false;
    }
    if (!Objects.equals(this.error, repairFreeipaResponse.error)) {
      return false;
    }
    if (!Objects.equals(this.startDate, repairFreeipaResponse.startDate)) {
      return false;
    }
    if (!Objects.equals(this.endDate, repairFreeipaResponse.endDate)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, status, successfulOperationDetails, failureOperationDetails, error, startDate, endDate, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepairFreeipaResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    successfulOperationDetails: ").append(toIndentedString(successfulOperationDetails)).append("\n");
    sb.append("    failureOperationDetails: ").append(toIndentedString(failureOperationDetails)).append("\n");
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

