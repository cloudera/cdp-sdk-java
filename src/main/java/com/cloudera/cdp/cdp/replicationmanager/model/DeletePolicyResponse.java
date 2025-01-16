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
 * Response object for deletePolicy.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-15T12:52:24.443-08:00")
public class DeletePolicyResponse extends CdpResponse {

  /**
   * The CRN of the input cluster.
   **/
  private String clusterCrn = null;

  /**
   * The ID of the request. Populated only for Ambari backend.
   **/
  private String requestId = null;

  /**
   * The detailed description of the action taken.
   **/
  private String message = null;

  /**
   * The status of the request.
   **/
  private String status = null;

  /**
   * Getter for clusterCrn.
   * The CRN of the input cluster.
   **/
  @JsonProperty("clusterCrn")
  public String getClusterCrn() {
    return clusterCrn;
  }

  /**
   * Setter for clusterCrn.
   * The CRN of the input cluster.
   **/
  public void setClusterCrn(String clusterCrn) {
    this.clusterCrn = clusterCrn;
  }

  /**
   * Getter for requestId.
   * The ID of the request. Populated only for Ambari backend.
   **/
  @JsonProperty("requestId")
  public String getRequestId() {
    return requestId;
  }

  /**
   * Setter for requestId.
   * The ID of the request. Populated only for Ambari backend.
   **/
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * Getter for message.
   * The detailed description of the action taken.
   **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Setter for message.
   * The detailed description of the action taken.
   **/
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Getter for status.
   * The status of the request.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The status of the request.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletePolicyResponse deletePolicyResponse = (DeletePolicyResponse) o;
    if (!Objects.equals(this.clusterCrn, deletePolicyResponse.clusterCrn)) {
      return false;
    }
    if (!Objects.equals(this.requestId, deletePolicyResponse.requestId)) {
      return false;
    }
    if (!Objects.equals(this.message, deletePolicyResponse.message)) {
      return false;
    }
    if (!Objects.equals(this.status, deletePolicyResponse.status)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterCrn, requestId, message, status, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePolicyResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    clusterCrn: ").append(toIndentedString(clusterCrn)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

