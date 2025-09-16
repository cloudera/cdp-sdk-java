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

package com.cloudera.cdp.dfworkload.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Provides a summary of the workload resource.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-16T07:43:45.932-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class RpcWorkloadResourceSummary  {

  /**
   * The crn of the workload resource.
   **/
  private String resourceCrn = null;

  /**
   * The project crn that the resource is assigned to. Should be null if resource is not assigned to a project.
   **/
  private String projectCrn = null;

  /**
   * Getter for resourceCrn.
   * The crn of the workload resource.
   **/
  @JsonProperty("resourceCrn")
  public String getResourceCrn() {
    return resourceCrn;
  }

  /**
   * Setter for resourceCrn.
   * The crn of the workload resource.
   **/
  public void setResourceCrn(String resourceCrn) {
    this.resourceCrn = resourceCrn;
  }

  /**
   * Getter for projectCrn.
   * The project crn that the resource is assigned to. Should be null if resource is not assigned to a project.
   **/
  @JsonProperty("projectCrn")
  public String getProjectCrn() {
    return projectCrn;
  }

  /**
   * Setter for projectCrn.
   * The project crn that the resource is assigned to. Should be null if resource is not assigned to a project.
   **/
  public void setProjectCrn(String projectCrn) {
    this.projectCrn = projectCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RpcWorkloadResourceSummary rpcWorkloadResourceSummary = (RpcWorkloadResourceSummary) o;
    if (!Objects.equals(this.resourceCrn, rpcWorkloadResourceSummary.resourceCrn)) {
      return false;
    }
    if (!Objects.equals(this.projectCrn, rpcWorkloadResourceSummary.projectCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceCrn, projectCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RpcWorkloadResourceSummary {\n");
    sb.append("    resourceCrn: ").append(toIndentedString(resourceCrn)).append("\n");
    sb.append("    projectCrn: ").append(toIndentedString(projectCrn)).append("\n");
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

