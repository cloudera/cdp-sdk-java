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
 * Create cluster response.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-15T12:52:24.261-08:00")
public class CreateClusterResponse extends CdpResponse {

  /**
   * Compute cluster ID.
   **/
  private String clusterId = null;

  /**
   * Cluster status.
   **/
  private CommonStatusMessage clusterStatus = null;

  /**
   * Uniform Resource Identifier of cluster.
   **/
  private String uri = null;

  /**
   * Compute cluster CRN.
   **/
  private String clusterCrn = null;

  /**
   * Pre-flight validation check response. Only given on a validation failure.
   **/
  private ValidationResponse validationResponse = null;

  /**
   * Getter for clusterId.
   * Compute cluster ID.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * Compute cluster ID.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

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
   * Getter for uri.
   * Uniform Resource Identifier of cluster.
   **/
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }

  /**
   * Setter for uri.
   * Uniform Resource Identifier of cluster.
   **/
  public void setUri(String uri) {
    this.uri = uri;
  }

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
   * Getter for validationResponse.
   * Pre-flight validation check response. Only given on a validation failure.
   **/
  @JsonProperty("validationResponse")
  public ValidationResponse getValidationResponse() {
    return validationResponse;
  }

  /**
   * Setter for validationResponse.
   * Pre-flight validation check response. Only given on a validation failure.
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
    CreateClusterResponse createClusterResponse = (CreateClusterResponse) o;
    if (!Objects.equals(this.clusterId, createClusterResponse.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.clusterStatus, createClusterResponse.clusterStatus)) {
      return false;
    }
    if (!Objects.equals(this.uri, createClusterResponse.uri)) {
      return false;
    }
    if (!Objects.equals(this.clusterCrn, createClusterResponse.clusterCrn)) {
      return false;
    }
    if (!Objects.equals(this.validationResponse, createClusterResponse.validationResponse)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, clusterStatus, uri, clusterCrn, validationResponse, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateClusterResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    clusterStatus: ").append(toIndentedString(clusterStatus)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    clusterCrn: ").append(toIndentedString(clusterCrn)).append("\n");
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

