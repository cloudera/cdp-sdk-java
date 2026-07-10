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
 * Update compute cluster response.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:57.501Z")
public class UpdateClusterResponse extends CdpResponse {

  /**
   * Compute cluster CRN.
   **/
  private String clusterCrn = null;

  /**
   * Status of the compute cluster.
   **/
  private CommonStatusMessage clusterStatus = null;

  /**
   * Uniform resource identifier of the compute cluster.
   **/
  private String uri = null;

  /**
   * Pre-flight validation check response. Only given on a validation failure and `skipValidation` is false.
   **/
  private ValidationResponse validationResponse = null;

  /**
   * Getter for clusterCrn.
   * Compute cluster CRN.
   **/
  @JsonProperty("clusterCrn")
  public String getClusterCrn() {
    return clusterCrn;
  }

  /**
   * Setter for clusterCrn.
   * Compute cluster CRN.
   **/
  public void setClusterCrn(String clusterCrn) {
    this.clusterCrn = clusterCrn;
  }

  /**
   * Getter for clusterStatus.
   * Status of the compute cluster.
   **/
  @JsonProperty("clusterStatus")
  public CommonStatusMessage getClusterStatus() {
    return clusterStatus;
  }

  /**
   * Setter for clusterStatus.
   * Status of the compute cluster.
   **/
  public void setClusterStatus(CommonStatusMessage clusterStatus) {
    this.clusterStatus = clusterStatus;
  }

  /**
   * Getter for uri.
   * Uniform resource identifier of the compute cluster.
   **/
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }

  /**
   * Setter for uri.
   * Uniform resource identifier of the compute cluster.
   **/
  public void setUri(String uri) {
    this.uri = uri;
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
    UpdateClusterResponse updateClusterResponse = (UpdateClusterResponse) o;
    if (!Objects.equals(this.clusterCrn, updateClusterResponse.clusterCrn)) {
      return false;
    }
    if (!Objects.equals(this.clusterStatus, updateClusterResponse.clusterStatus)) {
      return false;
    }
    if (!Objects.equals(this.uri, updateClusterResponse.uri)) {
      return false;
    }
    if (!Objects.equals(this.validationResponse, updateClusterResponse.validationResponse)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterCrn, clusterStatus, uri, validationResponse, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateClusterResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    clusterCrn: ").append(toIndentedString(clusterCrn)).append("\n");
    sb.append("    clusterStatus: ").append(toIndentedString(clusterStatus)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

