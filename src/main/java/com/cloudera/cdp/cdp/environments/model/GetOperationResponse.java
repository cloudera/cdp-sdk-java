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

/**
 * Response object for tracking the latest (current/last) operation on the environment resource.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-08-15T13:42:17.621-07:00")
public class GetOperationResponse extends CdpResponse {

  /**
   * Identifier of the operation.
   **/
  private String operationId = null;

  /**
   * Type of the operation.
   **/
  private String operationType = null;

  /**
   * Status of the operation.
   **/
  private String operationStatus = null;

  /**
   * Progress percentage of the operation.
   **/
  private Integer progress = null;

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
   * Getter for operationType.
   * Type of the operation.
   **/
  @JsonProperty("operationType")
  public String getOperationType() {
    return operationType;
  }

  /**
   * Setter for operationType.
   * Type of the operation.
   **/
  public void setOperationType(String operationType) {
    this.operationType = operationType;
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
   * Getter for progress.
   * Progress percentage of the operation.
   **/
  @JsonProperty("progress")
  public Integer getProgress() {
    return progress;
  }

  /**
   * Setter for progress.
   * Progress percentage of the operation.
   **/
  public void setProgress(Integer progress) {
    this.progress = progress;
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
    if (!Objects.equals(this.operationType, getOperationResponse.operationType)) {
      return false;
    }
    if (!Objects.equals(this.operationStatus, getOperationResponse.operationStatus)) {
      return false;
    }
    if (!Objects.equals(this.progress, getOperationResponse.progress)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, operationType, operationStatus, progress, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOperationResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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

