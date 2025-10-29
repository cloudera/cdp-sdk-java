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

package com.cloudera.cdp.compute.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.compute.model.CommonStatusMessage;
import com.cloudera.cdp.compute.model.ValidationResponse;

/**
 * Response structure for suspending the compute cluster
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-28T14:00:31.430-07:00")
public class SuspendClusterResponse extends CdpResponse {

  /**
   * Cluster status.
   **/
  private CommonStatusMessage clusterStatus = null;

  /**
   * Pre-flight validation check response. Only given on a validation failure and `skipValidation` is false.
   **/
  private ValidationResponse validationResponse = null;

  /**
   * Getter for clusterStatus.
   * Cluster status.
   **/
  @JsonProperty("clusterStatus")
  public CommonStatusMessage getClusterStatus() {
    return clusterStatus;
  }

  /**
   * Setter for clusterStatus.
   * Cluster status.
   **/
  public void setClusterStatus(CommonStatusMessage clusterStatus) {
    this.clusterStatus = clusterStatus;
  }

  /**
   * Getter for validationResponse.
   * Pre-flight validation check response. Only given on a validation failure and &#x60;skipValidation&#x60; is false.
   **/
  @JsonProperty("validationResponse")
  public ValidationResponse getValidationResponse() {
    return validationResponse;
  }

  /**
   * Setter for validationResponse.
   * Pre-flight validation check response. Only given on a validation failure and &#x60;skipValidation&#x60; is false.
   **/
  public void setValidationResponse(ValidationResponse validationResponse) {
    this.validationResponse = validationResponse;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuspendClusterResponse suspendClusterResponse = (SuspendClusterResponse) o;
    if (!Objects.equals(this.clusterStatus, suspendClusterResponse.clusterStatus)) {
      return false;
    }
    if (!Objects.equals(this.validationResponse, suspendClusterResponse.validationResponse)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterStatus, validationResponse, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuspendClusterResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    clusterStatus: ").append(toIndentedString(clusterStatus)).append("\n");
    sb.append("    validationResponse: ").append(toIndentedString(validationResponse)).append("\n");
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

