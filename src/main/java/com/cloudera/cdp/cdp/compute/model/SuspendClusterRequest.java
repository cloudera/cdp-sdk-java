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

/**
 * Request structure to suspend the compute cluster
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-04-17T06:49:16.183-07:00")
public class SuspendClusterRequest  {

  /**
   * Compute cluster CRN.
   **/
  private String clusterCrn = null;

  /**
   * Whether to skip the running workloads validation for externalized clusters
   **/
  private Boolean skipWorkloadsValidation = null;

  /**
   * Whether to skip validation.
   **/
  private Boolean skipValidation = null;

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
   * Getter for skipWorkloadsValidation.
   * Whether to skip the running workloads validation for externalized clusters
   **/
  @JsonProperty("skipWorkloadsValidation")
  public Boolean getSkipWorkloadsValidation() {
    return skipWorkloadsValidation;
  }

  /**
   * Setter for skipWorkloadsValidation.
   * Whether to skip the running workloads validation for externalized clusters
   **/
  public void setSkipWorkloadsValidation(Boolean skipWorkloadsValidation) {
    this.skipWorkloadsValidation = skipWorkloadsValidation;
  }

  /**
   * Getter for skipValidation.
   * Whether to skip validation.
   **/
  @JsonProperty("skipValidation")
  public Boolean getSkipValidation() {
    return skipValidation;
  }

  /**
   * Setter for skipValidation.
   * Whether to skip validation.
   **/
  public void setSkipValidation(Boolean skipValidation) {
    this.skipValidation = skipValidation;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuspendClusterRequest suspendClusterRequest = (SuspendClusterRequest) o;
    if (!Objects.equals(this.clusterCrn, suspendClusterRequest.clusterCrn)) {
      return false;
    }
    if (!Objects.equals(this.skipWorkloadsValidation, suspendClusterRequest.skipWorkloadsValidation)) {
      return false;
    }
    if (!Objects.equals(this.skipValidation, suspendClusterRequest.skipValidation)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterCrn, skipWorkloadsValidation, skipValidation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuspendClusterRequest {\n");
    sb.append("    clusterCrn: ").append(toIndentedString(clusterCrn)).append("\n");
    sb.append("    skipWorkloadsValidation: ").append(toIndentedString(skipWorkloadsValidation)).append("\n");
    sb.append("    skipValidation: ").append(toIndentedString(skipValidation)).append("\n");
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

