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
import com.cloudera.cdp.dfworkload.model.RpcWorkloadResourceSummary;
import java.util.*;

/**
 * Request object to reassign resources.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-04-23T14:14:37.211-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class ReassignResourcesRequest  {

  /**
   * The CRN of an environment to execute the command.
   **/
  private String environmentCrn = null;

  /**
   * The summaries of the resources being reassigned.
   **/
  private List<RpcWorkloadResourceSummary> workloadResourceSummaries = new ArrayList<RpcWorkloadResourceSummary>();

  /**
   * The crn of the project to reassign the resources to, or null to unassign the resources.
   **/
  private String destinationProjectCrn = null;

  /**
   * Getter for environmentCrn.
   * The CRN of an environment to execute the command.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of an environment to execute the command.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for workloadResourceSummaries.
   * The summaries of the resources being reassigned.
   **/
  @JsonProperty("workloadResourceSummaries")
  public List<RpcWorkloadResourceSummary> getWorkloadResourceSummaries() {
    return workloadResourceSummaries;
  }

  /**
   * Setter for workloadResourceSummaries.
   * The summaries of the resources being reassigned.
   **/
  public void setWorkloadResourceSummaries(List<RpcWorkloadResourceSummary> workloadResourceSummaries) {
    this.workloadResourceSummaries = workloadResourceSummaries;
  }

  /**
   * Getter for destinationProjectCrn.
   * The crn of the project to reassign the resources to, or null to unassign the resources.
   **/
  @JsonProperty("destinationProjectCrn")
  public String getDestinationProjectCrn() {
    return destinationProjectCrn;
  }

  /**
   * Setter for destinationProjectCrn.
   * The crn of the project to reassign the resources to, or null to unassign the resources.
   **/
  public void setDestinationProjectCrn(String destinationProjectCrn) {
    this.destinationProjectCrn = destinationProjectCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReassignResourcesRequest reassignResourcesRequest = (ReassignResourcesRequest) o;
    if (!Objects.equals(this.environmentCrn, reassignResourcesRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.workloadResourceSummaries, reassignResourcesRequest.workloadResourceSummaries)) {
      return false;
    }
    if (!Objects.equals(this.destinationProjectCrn, reassignResourcesRequest.destinationProjectCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, workloadResourceSummaries, destinationProjectCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReassignResourcesRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    workloadResourceSummaries: ").append(toIndentedString(workloadResourceSummaries)).append("\n");
    sb.append("    destinationProjectCrn: ").append(toIndentedString(destinationProjectCrn)).append("\n");
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

