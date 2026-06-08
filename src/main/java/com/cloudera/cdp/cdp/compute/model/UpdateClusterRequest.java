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
import com.cloudera.cdp.compute.model.CommonUpdateClusterSpec;

/**
 * Update compute cluster request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-05T07:54:46.022-07:00")
public class UpdateClusterRequest  {

  /**
   * Compute Cluster CRN.
   **/
  private String clusterCrn = null;

  /**
   * Spec for updating compute cluster.
   **/
  private CommonUpdateClusterSpec spec = null;

  /**
   * Current cluster state version of the compute cluster being updated.
   **/
  private Long clusterStateVersion = null;

  /**
   * Getter for clusterCrn.
   * Compute Cluster CRN.
   **/
  @JsonProperty("clusterCrn")
  public String getClusterCrn() {
    return clusterCrn;
  }

  /**
   * Setter for clusterCrn.
   * Compute Cluster CRN.
   **/
  public void setClusterCrn(String clusterCrn) {
    this.clusterCrn = clusterCrn;
  }

  /**
   * Getter for spec.
   * Spec for updating compute cluster.
   **/
  @JsonProperty("spec")
  public CommonUpdateClusterSpec getSpec() {
    return spec;
  }

  /**
   * Setter for spec.
   * Spec for updating compute cluster.
   **/
  public void setSpec(CommonUpdateClusterSpec spec) {
    this.spec = spec;
  }

  /**
   * Getter for clusterStateVersion.
   * Current cluster state version of the compute cluster being updated.
   **/
  @JsonProperty("clusterStateVersion")
  public Long getClusterStateVersion() {
    return clusterStateVersion;
  }

  /**
   * Setter for clusterStateVersion.
   * Current cluster state version of the compute cluster being updated.
   **/
  public void setClusterStateVersion(Long clusterStateVersion) {
    this.clusterStateVersion = clusterStateVersion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateClusterRequest updateClusterRequest = (UpdateClusterRequest) o;
    if (!Objects.equals(this.clusterCrn, updateClusterRequest.clusterCrn)) {
      return false;
    }
    if (!Objects.equals(this.spec, updateClusterRequest.spec)) {
      return false;
    }
    if (!Objects.equals(this.clusterStateVersion, updateClusterRequest.clusterStateVersion)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterCrn, spec, clusterStateVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateClusterRequest {\n");
    sb.append("    clusterCrn: ").append(toIndentedString(clusterCrn)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    clusterStateVersion: ").append(toIndentedString(clusterStateVersion)).append("\n");
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

