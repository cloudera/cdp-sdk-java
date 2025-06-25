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
import com.cloudera.cdp.compute.model.Chart;
import com.cloudera.cdp.compute.model.Deployment;
import java.util.*;

/**
 * Response structure to list deployments in the cluster.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-06-24T14:06:25.564-07:00")
public class ListDeploymentsResponse extends CdpResponse {

  /**
   * Array of available charts.
   **/
  private List<Chart> availableCharts = new ArrayList<Chart>();

  /**
   * Array of unavailable charts.
   **/
  private List<Chart> unavailableCharts = new ArrayList<Chart>();

  /**
   * Array of installed deployments.
   **/
  private List<Deployment> installedDeployments = new ArrayList<Deployment>();

  /**
   * Getter for availableCharts.
   * Array of available charts.
   **/
  @JsonProperty("availableCharts")
  public List<Chart> getAvailableCharts() {
    return availableCharts;
  }

  /**
   * Setter for availableCharts.
   * Array of available charts.
   **/
  public void setAvailableCharts(List<Chart> availableCharts) {
    this.availableCharts = availableCharts;
  }

  /**
   * Getter for unavailableCharts.
   * Array of unavailable charts.
   **/
  @JsonProperty("unavailableCharts")
  public List<Chart> getUnavailableCharts() {
    return unavailableCharts;
  }

  /**
   * Setter for unavailableCharts.
   * Array of unavailable charts.
   **/
  public void setUnavailableCharts(List<Chart> unavailableCharts) {
    this.unavailableCharts = unavailableCharts;
  }

  /**
   * Getter for installedDeployments.
   * Array of installed deployments.
   **/
  @JsonProperty("installedDeployments")
  public List<Deployment> getInstalledDeployments() {
    return installedDeployments;
  }

  /**
   * Setter for installedDeployments.
   * Array of installed deployments.
   **/
  public void setInstalledDeployments(List<Deployment> installedDeployments) {
    this.installedDeployments = installedDeployments;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDeploymentsResponse listDeploymentsResponse = (ListDeploymentsResponse) o;
    if (!Objects.equals(this.availableCharts, listDeploymentsResponse.availableCharts)) {
      return false;
    }
    if (!Objects.equals(this.unavailableCharts, listDeploymentsResponse.unavailableCharts)) {
      return false;
    }
    if (!Objects.equals(this.installedDeployments, listDeploymentsResponse.installedDeployments)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableCharts, unavailableCharts, installedDeployments, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDeploymentsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    availableCharts: ").append(toIndentedString(availableCharts)).append("\n");
    sb.append("    unavailableCharts: ").append(toIndentedString(unavailableCharts)).append("\n");
    sb.append("    installedDeployments: ").append(toIndentedString(installedDeployments)).append("\n");
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

