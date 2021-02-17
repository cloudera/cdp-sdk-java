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

package com.cloudera.cdp.de.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.de.model.ChartValueOverridesRequest;
import java.util.*;

/**
 * Request object for CreateVc method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-02-17T11:49:10.596-08:00")
public class CreateVcRequest  {

  /**
   * Name of the virtual cluster.
   **/
  private String name = null;

  /**
   * Cluster id of the CDE service where virtual cluster has to be created.
   **/
  private String clusterId = null;

  /**
   * Cpu requests for autoscaling.
   **/
  private String cpuRequests = null;

  /**
   * Memory requests for autoscaling - eg. 30Gi.
   **/
  private String memoryRequests = null;

  /**
   * Chart overrides for creating a virtual cluster.
   **/
  private List<ChartValueOverridesRequest> chartValueOverrides = new ArrayList<ChartValueOverridesRequest>();

  /**
   * Getter for name.
   * Name of the virtual cluster.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name of the virtual cluster.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for clusterId.
   * Cluster id of the CDE service where virtual cluster has to be created.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * Cluster id of the CDE service where virtual cluster has to be created.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for cpuRequests.
   * Cpu requests for autoscaling.
   **/
  @JsonProperty("cpuRequests")
  public String getCpuRequests() {
    return cpuRequests;
  }

  /**
   * Setter for cpuRequests.
   * Cpu requests for autoscaling.
   **/
  public void setCpuRequests(String cpuRequests) {
    this.cpuRequests = cpuRequests;
  }

  /**
   * Getter for memoryRequests.
   * Memory requests for autoscaling - eg. 30Gi.
   **/
  @JsonProperty("memoryRequests")
  public String getMemoryRequests() {
    return memoryRequests;
  }

  /**
   * Setter for memoryRequests.
   * Memory requests for autoscaling - eg. 30Gi.
   **/
  public void setMemoryRequests(String memoryRequests) {
    this.memoryRequests = memoryRequests;
  }

  /**
   * Getter for chartValueOverrides.
   * Chart overrides for creating a virtual cluster.
   **/
  @JsonProperty("chartValueOverrides")
  public List<ChartValueOverridesRequest> getChartValueOverrides() {
    return chartValueOverrides;
  }

  /**
   * Setter for chartValueOverrides.
   * Chart overrides for creating a virtual cluster.
   **/
  public void setChartValueOverrides(List<ChartValueOverridesRequest> chartValueOverrides) {
    this.chartValueOverrides = chartValueOverrides;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVcRequest createVcRequest = (CreateVcRequest) o;
    if (!Objects.equals(this.name, createVcRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.clusterId, createVcRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.cpuRequests, createVcRequest.cpuRequests)) {
      return false;
    }
    if (!Objects.equals(this.memoryRequests, createVcRequest.memoryRequests)) {
      return false;
    }
    if (!Objects.equals(this.chartValueOverrides, createVcRequest.chartValueOverrides)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, clusterId, cpuRequests, memoryRequests, chartValueOverrides);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVcRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    cpuRequests: ").append(toIndentedString(cpuRequests)).append("\n");
    sb.append("    memoryRequests: ").append(toIndentedString(memoryRequests)).append("\n");
    sb.append("    chartValueOverrides: ").append(toIndentedString(chartValueOverrides)).append("\n");
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
