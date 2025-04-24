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
 * A request to list deployment system metrics
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-04-23T14:14:36.786-07:00")
public class ListDeploymentSystemMetricsRequest  {

  /**
   * The deployment CRN
   **/
  private String deploymentCrn = null;

  /**
   * The metrics time period
   **/
  private String metricsTimePeriod = null;

  /**
   * Getter for deploymentCrn.
   * The deployment CRN
   **/
  @JsonProperty("deploymentCrn")
  public String getDeploymentCrn() {
    return deploymentCrn;
  }

  /**
   * Setter for deploymentCrn.
   * The deployment CRN
   **/
  public void setDeploymentCrn(String deploymentCrn) {
    this.deploymentCrn = deploymentCrn;
  }

  /**
   * Getter for metricsTimePeriod.
   * The metrics time period
   **/
  @JsonProperty("metricsTimePeriod")
  public String getMetricsTimePeriod() {
    return metricsTimePeriod;
  }

  /**
   * Setter for metricsTimePeriod.
   * The metrics time period
   **/
  public void setMetricsTimePeriod(String metricsTimePeriod) {
    this.metricsTimePeriod = metricsTimePeriod;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDeploymentSystemMetricsRequest listDeploymentSystemMetricsRequest = (ListDeploymentSystemMetricsRequest) o;
    if (!Objects.equals(this.deploymentCrn, listDeploymentSystemMetricsRequest.deploymentCrn)) {
      return false;
    }
    if (!Objects.equals(this.metricsTimePeriod, listDeploymentSystemMetricsRequest.metricsTimePeriod)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentCrn, metricsTimePeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDeploymentSystemMetricsRequest {\n");
    sb.append("    deploymentCrn: ").append(toIndentedString(deploymentCrn)).append("\n");
    sb.append("    metricsTimePeriod: ").append(toIndentedString(metricsTimePeriod)).append("\n");
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

