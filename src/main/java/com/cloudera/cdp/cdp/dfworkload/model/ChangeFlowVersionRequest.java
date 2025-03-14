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
import com.cloudera.cdp.dfworkload.model.ConfiguredKpi;
import com.cloudera.cdp.dfworkload.model.FlowParameterGroup;
import java.util.*;

/**
 * Request object for change flow version of a deployment.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-13T11:52:48.206-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class ChangeFlowVersionRequest  {

  /**
   * The CRN of an environment to execute the command.
   **/
  private String environmentCrn = null;

  /**
   * The crn of the deployment being updated.
   **/
  private String deploymentCrn = null;

  /**
   * The list of flow parameter groups.
   **/
  private List<FlowParameterGroup> parameterGroups = new ArrayList<FlowParameterGroup>();

  /**
   * The list of configured KPIs.
   **/
  private List<ConfiguredKpi> kpis = new ArrayList<ConfiguredKpi>();

  /**
   * The strategy to use during change flow version.
   **/
  private String strategy = null;

  /**
   * The max time in minutes to wait for the flow to process data.
   **/
  private Integer waitForFlowToStopInMinutes = null;

  /**
   * The CRN of the deployment request.
   **/
  private String deploymentRequestCrn = null;

  /**
   * The CRN of the asset update request. Required when updating assets of an existing deployment.
   **/
  private String assetUpdateRequestCrn = null;

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
   * Getter for deploymentCrn.
   * The crn of the deployment being updated.
   **/
  @JsonProperty("deploymentCrn")
  public String getDeploymentCrn() {
    return deploymentCrn;
  }

  /**
   * Setter for deploymentCrn.
   * The crn of the deployment being updated.
   **/
  public void setDeploymentCrn(String deploymentCrn) {
    this.deploymentCrn = deploymentCrn;
  }

  /**
   * Getter for parameterGroups.
   * The list of flow parameter groups.
   **/
  @JsonProperty("parameterGroups")
  public List<FlowParameterGroup> getParameterGroups() {
    return parameterGroups;
  }

  /**
   * Setter for parameterGroups.
   * The list of flow parameter groups.
   **/
  public void setParameterGroups(List<FlowParameterGroup> parameterGroups) {
    this.parameterGroups = parameterGroups;
  }

  /**
   * Getter for kpis.
   * The list of configured KPIs.
   **/
  @JsonProperty("kpis")
  public List<ConfiguredKpi> getKpis() {
    return kpis;
  }

  /**
   * Setter for kpis.
   * The list of configured KPIs.
   **/
  public void setKpis(List<ConfiguredKpi> kpis) {
    this.kpis = kpis;
  }

  /**
   * Getter for strategy.
   * The strategy to use during change flow version.
   **/
  @JsonProperty("strategy")
  public String getStrategy() {
    return strategy;
  }

  /**
   * Setter for strategy.
   * The strategy to use during change flow version.
   **/
  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }

  /**
   * Getter for waitForFlowToStopInMinutes.
   * The max time in minutes to wait for the flow to process data.
   **/
  @JsonProperty("waitForFlowToStopInMinutes")
  public Integer getWaitForFlowToStopInMinutes() {
    return waitForFlowToStopInMinutes;
  }

  /**
   * Setter for waitForFlowToStopInMinutes.
   * The max time in minutes to wait for the flow to process data.
   **/
  public void setWaitForFlowToStopInMinutes(Integer waitForFlowToStopInMinutes) {
    this.waitForFlowToStopInMinutes = waitForFlowToStopInMinutes;
  }

  /**
   * Getter for deploymentRequestCrn.
   * The CRN of the deployment request.
   **/
  @JsonProperty("deploymentRequestCrn")
  public String getDeploymentRequestCrn() {
    return deploymentRequestCrn;
  }

  /**
   * Setter for deploymentRequestCrn.
   * The CRN of the deployment request.
   **/
  public void setDeploymentRequestCrn(String deploymentRequestCrn) {
    this.deploymentRequestCrn = deploymentRequestCrn;
  }

  /**
   * Getter for assetUpdateRequestCrn.
   * The CRN of the asset update request. Required when updating assets of an existing deployment.
   **/
  @JsonProperty("assetUpdateRequestCrn")
  public String getAssetUpdateRequestCrn() {
    return assetUpdateRequestCrn;
  }

  /**
   * Setter for assetUpdateRequestCrn.
   * The CRN of the asset update request. Required when updating assets of an existing deployment.
   **/
  public void setAssetUpdateRequestCrn(String assetUpdateRequestCrn) {
    this.assetUpdateRequestCrn = assetUpdateRequestCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeFlowVersionRequest changeFlowVersionRequest = (ChangeFlowVersionRequest) o;
    if (!Objects.equals(this.environmentCrn, changeFlowVersionRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.deploymentCrn, changeFlowVersionRequest.deploymentCrn)) {
      return false;
    }
    if (!Objects.equals(this.parameterGroups, changeFlowVersionRequest.parameterGroups)) {
      return false;
    }
    if (!Objects.equals(this.kpis, changeFlowVersionRequest.kpis)) {
      return false;
    }
    if (!Objects.equals(this.strategy, changeFlowVersionRequest.strategy)) {
      return false;
    }
    if (!Objects.equals(this.waitForFlowToStopInMinutes, changeFlowVersionRequest.waitForFlowToStopInMinutes)) {
      return false;
    }
    if (!Objects.equals(this.deploymentRequestCrn, changeFlowVersionRequest.deploymentRequestCrn)) {
      return false;
    }
    if (!Objects.equals(this.assetUpdateRequestCrn, changeFlowVersionRequest.assetUpdateRequestCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, deploymentCrn, parameterGroups, kpis, strategy, waitForFlowToStopInMinutes, deploymentRequestCrn, assetUpdateRequestCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeFlowVersionRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    deploymentCrn: ").append(toIndentedString(deploymentCrn)).append("\n");
    sb.append("    parameterGroups: ").append(toIndentedString(parameterGroups)).append("\n");
    sb.append("    kpis: ").append(toIndentedString(kpis)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    waitForFlowToStopInMinutes: ").append(toIndentedString(waitForFlowToStopInMinutes)).append("\n");
    sb.append("    deploymentRequestCrn: ").append(toIndentedString(deploymentRequestCrn)).append("\n");
    sb.append("    assetUpdateRequestCrn: ").append(toIndentedString(assetUpdateRequestCrn)).append("\n");
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

