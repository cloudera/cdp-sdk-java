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
 * A request to list active alerts for deployment.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-26T08:05:44.984-08:00")
public class ListDeploymentActiveAlertsRequest  {

  /**
   * The deployment CRN.
   **/
  private String deploymentCrn = null;

  /**
   * Sort criteria.
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
   * Getter for sort.
   * Sort criteria.
   **/
  @JsonProperty("sort")
  public String getSort() {
    return sort;
  }

  /**
   * Setter for sort.
   * Sort criteria.
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
    ListDeploymentActiveAlertsRequest listDeploymentActiveAlertsRequest = (ListDeploymentActiveAlertsRequest) o;
    if (!Objects.equals(this.deploymentCrn, listDeploymentActiveAlertsRequest.deploymentCrn)) {
      return false;
    }
    if (!Objects.equals(this.sort, listDeploymentActiveAlertsRequest.sort)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentCrn, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDeploymentActiveAlertsRequest {\n");
    sb.append("    deploymentCrn: ").append(toIndentedString(deploymentCrn)).append("\n");
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

