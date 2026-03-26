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

package com.cloudera.cdp.df.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * A request to list active alerts for a flow in a deployment.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-25T09:53:07.561-07:00")
public class ListFlowActiveAlertsInDeploymentRequest  {

  /**
   * The deployment CRN.
   **/
  private String deploymentCrn = null;

  /**
   * The deployed flow CRN.
   **/
  private String deployedFlowCrn = null;

  /**
   * Sort criteria (firstOccurrence|name|eventType):(asc|desc). Defaults to firstOccurrence:asc.
   **/
  private String sort = null;

  /**
   * Getter for deploymentCrn.
   * The deployment CRN.
   **/
  @JsonProperty("deploymentCrn")
  public String getDeploymentCrn() {
    return deploymentCrn;
  }

  /**
   * Setter for deploymentCrn.
   * The deployment CRN.
   **/
  public void setDeploymentCrn(String deploymentCrn) {
    this.deploymentCrn = deploymentCrn;
  }

  /**
   * Getter for deployedFlowCrn.
   * The deployed flow CRN.
   **/
  @JsonProperty("deployedFlowCrn")
  public String getDeployedFlowCrn() {
    return deployedFlowCrn;
  }

  /**
   * Setter for deployedFlowCrn.
   * The deployed flow CRN.
   **/
  public void setDeployedFlowCrn(String deployedFlowCrn) {
    this.deployedFlowCrn = deployedFlowCrn;
  }

  /**
   * Getter for sort.
   * Sort criteria (firstOccurrence|name|eventType):(asc|desc). Defaults to firstOccurrence:asc.
   **/
  @JsonProperty("sort")
  public String getSort() {
    return sort;
  }

  /**
   * Setter for sort.
   * Sort criteria (firstOccurrence|name|eventType):(asc|desc). Defaults to firstOccurrence:asc.
   **/
  public void setSort(String sort) {
    this.sort = sort;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListFlowActiveAlertsInDeploymentRequest listFlowActiveAlertsInDeploymentRequest = (ListFlowActiveAlertsInDeploymentRequest) o;
    if (!Objects.equals(this.deploymentCrn, listFlowActiveAlertsInDeploymentRequest.deploymentCrn)) {
      return false;
    }
    if (!Objects.equals(this.deployedFlowCrn, listFlowActiveAlertsInDeploymentRequest.deployedFlowCrn)) {
      return false;
    }
    if (!Objects.equals(this.sort, listFlowActiveAlertsInDeploymentRequest.sort)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentCrn, deployedFlowCrn, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFlowActiveAlertsInDeploymentRequest {\n");
    sb.append("    deploymentCrn: ").append(toIndentedString(deploymentCrn)).append("\n");
    sb.append("    deployedFlowCrn: ").append(toIndentedString(deployedFlowCrn)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

