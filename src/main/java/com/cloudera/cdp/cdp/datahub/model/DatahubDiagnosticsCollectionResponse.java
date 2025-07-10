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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datahub.model.DatahubDiagnosticsCollectionDetailsResponse;
import java.time.ZonedDateTime;

/**
 * Response object for diagnostic collection flow details.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-09T13:56:10.708-07:00")
public class DatahubDiagnosticsCollectionResponse extends CdpResponse {

  /**
   * Status of the diagnostics collection flow.
   **/
  private String status = null;

  /**
   * Flow ID of the diagnostics collection flow.
   **/
  private String flowId = null;

  /**
   * Current state of the diagnostics collection flow.
   **/
  private String flowState = null;

  /**
   * Creation date of the diagnostics collection flow.
   **/
  private ZonedDateTime created = null;

  /**
   * Progress percentage of the diagnostics collection flow (maximum value if finished).
   **/
  private Integer progressPercentage = null;

  /**
   * Additional details about the diagnostics collection.
   **/
  private DatahubDiagnosticsCollectionDetailsResponse collectionDetails = null;

  /**
   * Getter for status.
   * Status of the diagnostics collection flow.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of the diagnostics collection flow.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for flowId.
   * Flow ID of the diagnostics collection flow.
   **/
  @JsonProperty("flowId")
  public String getFlowId() {
    return flowId;
  }

  /**
   * Setter for flowId.
   * Flow ID of the diagnostics collection flow.
   **/
  public void setFlowId(String flowId) {
    this.flowId = flowId;
  }

  /**
   * Getter for flowState.
   * Current state of the diagnostics collection flow.
   **/
  @JsonProperty("flowState")
  public String getFlowState() {
    return flowState;
  }

  /**
   * Setter for flowState.
   * Current state of the diagnostics collection flow.
   **/
  public void setFlowState(String flowState) {
    this.flowState = flowState;
  }

  /**
   * Getter for created.
   * Creation date of the diagnostics collection flow.
   **/
  @JsonProperty("created")
  public ZonedDateTime getCreated() {
    return created;
  }

  /**
   * Setter for created.
   * Creation date of the diagnostics collection flow.
   **/
  public void setCreated(ZonedDateTime created) {
    this.created = created;
  }

  /**
   * Getter for progressPercentage.
   * Progress percentage of the diagnostics collection flow (maximum value if finished).
   **/
  @JsonProperty("progressPercentage")
  public Integer getProgressPercentage() {
    return progressPercentage;
  }

  /**
   * Setter for progressPercentage.
   * Progress percentage of the diagnostics collection flow (maximum value if finished).
   **/
  public void setProgressPercentage(Integer progressPercentage) {
    this.progressPercentage = progressPercentage;
  }

  /**
   * Getter for collectionDetails.
   * Additional details about the diagnostics collection.
   **/
  @JsonProperty("collectionDetails")
  public DatahubDiagnosticsCollectionDetailsResponse getCollectionDetails() {
    return collectionDetails;
  }

  /**
   * Setter for collectionDetails.
   * Additional details about the diagnostics collection.
   **/
  public void setCollectionDetails(DatahubDiagnosticsCollectionDetailsResponse collectionDetails) {
    this.collectionDetails = collectionDetails;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatahubDiagnosticsCollectionResponse datahubDiagnosticsCollectionResponse = (DatahubDiagnosticsCollectionResponse) o;
    if (!Objects.equals(this.status, datahubDiagnosticsCollectionResponse.status)) {
      return false;
    }
    if (!Objects.equals(this.flowId, datahubDiagnosticsCollectionResponse.flowId)) {
      return false;
    }
    if (!Objects.equals(this.flowState, datahubDiagnosticsCollectionResponse.flowState)) {
      return false;
    }
    if (!Objects.equals(this.created, datahubDiagnosticsCollectionResponse.created)) {
      return false;
    }
    if (!Objects.equals(this.progressPercentage, datahubDiagnosticsCollectionResponse.progressPercentage)) {
      return false;
    }
    if (!Objects.equals(this.collectionDetails, datahubDiagnosticsCollectionResponse.collectionDetails)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, flowId, flowState, created, progressPercentage, collectionDetails, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatahubDiagnosticsCollectionResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    flowState: ").append(toIndentedString(flowState)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    progressPercentage: ").append(toIndentedString(progressPercentage)).append("\n");
    sb.append("    collectionDetails: ").append(toIndentedString(collectionDetails)).append("\n");
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

