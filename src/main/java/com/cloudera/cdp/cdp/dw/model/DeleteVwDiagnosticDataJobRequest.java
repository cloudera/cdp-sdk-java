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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for the deleteVwDiagnosticDataJobRequest method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-04-17T06:49:11.502-07:00")
public class DeleteVwDiagnosticDataJobRequest  {

  /**
   * ID of cluster.
   **/
  private String clusterId = null;

  /**
   * ID of the Virtual Warehouse.
   **/
  private String vwId = null;

  /**
   * ID of the diagnostic job.
   **/
  private String jobId = null;

  /**
   * Getter for clusterId.
   * ID of cluster.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * ID of cluster.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for vwId.
   * ID of the Virtual Warehouse.
   **/
  @JsonProperty("vwId")
  public String getVwId() {
    return vwId;
  }

  /**
   * Setter for vwId.
   * ID of the Virtual Warehouse.
   **/
  public void setVwId(String vwId) {
    this.vwId = vwId;
  }

  /**
   * Getter for jobId.
   * ID of the diagnostic job.
   **/
  @JsonProperty("jobId")
  public String getJobId() {
    return jobId;
  }

  /**
   * Setter for jobId.
   * ID of the diagnostic job.
   **/
  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteVwDiagnosticDataJobRequest deleteVwDiagnosticDataJobRequest = (DeleteVwDiagnosticDataJobRequest) o;
    if (!Objects.equals(this.clusterId, deleteVwDiagnosticDataJobRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.vwId, deleteVwDiagnosticDataJobRequest.vwId)) {
      return false;
    }
    if (!Objects.equals(this.jobId, deleteVwDiagnosticDataJobRequest.jobId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, vwId, jobId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteVwDiagnosticDataJobRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    vwId: ").append(toIndentedString(vwId)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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

