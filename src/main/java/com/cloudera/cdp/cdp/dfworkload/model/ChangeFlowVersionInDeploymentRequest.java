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
 * Request object for change flow version of a flow deployment.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-04-15T08:44:54.268-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class ChangeFlowVersionInDeploymentRequest  {

  /**
   * The CRN of an environment to execute the command.
   **/
  private String environmentCrn = null;

  /**
   * The crn of the deployment being updated.
   **/
  private String deploymentCrn = null;

  /**
   * The crn of the flow deployment being updated.
   **/
  private String deployedFlowCrn = null;

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
   * When specified, ignore the check to validate if deployment has custom NARs configured when the flow definition contains custom components.
   **/
  private Boolean ignoreCustomNarConfigurationCheck = null;

  /**
   * When specified, ignore the check to validate if deployment has custom Python configured when the flow definition contains custom Python processors.
   **/
  private Boolean ignoreCustomPythonConfigurationCheck = null;

  /**
   * When specified, ignore the check to validate if deployment has inbound connection configured for all listen components.
   **/
  private Boolean ignoreDeploymentInboundConfigurationChecks = null;

  /**
   * The CRN of the deployment request. Required for a new deployment.
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
   * Getter for deployedFlowCrn.
   * The crn of the flow deployment being updated.
   **/
  @JsonProperty("deployedFlowCrn")
  public String getDeployedFlowCrn() {
    return deployedFlowCrn;
  }

  /**
   * Setter for deployedFlowCrn.
   * The crn of the flow deployment being updated.
   **/
  public void setDeployedFlowCrn(String deployedFlowCrn) {
    this.deployedFlowCrn = deployedFlowCrn;
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
   * Getter for ignoreCustomNarConfigurationCheck.
   * When specified, ignore the check to validate if deployment has custom NARs configured when the flow definition contains custom components.
   **/
  @JsonProperty("ignoreCustomNarConfigurationCheck")
  public Boolean getIgnoreCustomNarConfigurationCheck() {
    return ignoreCustomNarConfigurationCheck;
  }

  /**
   * Setter for ignoreCustomNarConfigurationCheck.
   * When specified, ignore the check to validate if deployment has custom NARs configured when the flow definition contains custom components.
   **/
  public void setIgnoreCustomNarConfigurationCheck(Boolean ignoreCustomNarConfigurationCheck) {
    this.ignoreCustomNarConfigurationCheck = ignoreCustomNarConfigurationCheck;
  }

  /**
   * Getter for ignoreCustomPythonConfigurationCheck.
   * When specified, ignore the check to validate if deployment has custom Python configured when the flow definition contains custom Python processors.
   **/
  @JsonProperty("ignoreCustomPythonConfigurationCheck")
  public Boolean getIgnoreCustomPythonConfigurationCheck() {
    return ignoreCustomPythonConfigurationCheck;
  }

  /**
   * Setter for ignoreCustomPythonConfigurationCheck.
   * When specified, ignore the check to validate if deployment has custom Python configured when the flow definition contains custom Python processors.
   **/
  public void setIgnoreCustomPythonConfigurationCheck(Boolean ignoreCustomPythonConfigurationCheck) {
    this.ignoreCustomPythonConfigurationCheck = ignoreCustomPythonConfigurationCheck;
  }

  /**
   * Getter for ignoreDeploymentInboundConfigurationChecks.
   * When specified, ignore the check to validate if deployment has inbound connection configured for all listen components.
   **/
  @JsonProperty("ignoreDeploymentInboundConfigurationChecks")
  public Boolean getIgnoreDeploymentInboundConfigurationChecks() {
    return ignoreDeploymentInboundConfigurationChecks;
  }

  /**
   * Setter for ignoreDeploymentInboundConfigurationChecks.
   * When specified, ignore the check to validate if deployment has inbound connection configured for all listen components.
   **/
  public void setIgnoreDeploymentInboundConfigurationChecks(Boolean ignoreDeploymentInboundConfigurationChecks) {
    this.ignoreDeploymentInboundConfigurationChecks = ignoreDeploymentInboundConfigurationChecks;
  }

  /**
   * Getter for deploymentRequestCrn.
   * The CRN of the deployment request. Required for a new deployment.
   **/
  @JsonProperty("deploymentRequestCrn")
  public String getDeploymentRequestCrn() {
    return deploymentRequestCrn;
  }

  /**
   * Setter for deploymentRequestCrn.
   * The CRN of the deployment request. Required for a new deployment.
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
    ChangeFlowVersionInDeploymentRequest changeFlowVersionInDeploymentRequest = (ChangeFlowVersionInDeploymentRequest) o;
    if (!Objects.equals(this.environmentCrn, changeFlowVersionInDeploymentRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.deploymentCrn, changeFlowVersionInDeploymentRequest.deploymentCrn)) {
      return false;
    }
    if (!Objects.equals(this.deployedFlowCrn, changeFlowVersionInDeploymentRequest.deployedFlowCrn)) {
      return false;
    }
    if (!Objects.equals(this.parameterGroups, changeFlowVersionInDeploymentRequest.parameterGroups)) {
      return false;
    }
    if (!Objects.equals(this.kpis, changeFlowVersionInDeploymentRequest.kpis)) {
      return false;
    }
    if (!Objects.equals(this.strategy, changeFlowVersionInDeploymentRequest.strategy)) {
      return false;
    }
    if (!Objects.equals(this.waitForFlowToStopInMinutes, changeFlowVersionInDeploymentRequest.waitForFlowToStopInMinutes)) {
      return false;
    }
    if (!Objects.equals(this.ignoreCustomNarConfigurationCheck, changeFlowVersionInDeploymentRequest.ignoreCustomNarConfigurationCheck)) {
      return false;
    }
    if (!Objects.equals(this.ignoreCustomPythonConfigurationCheck, changeFlowVersionInDeploymentRequest.ignoreCustomPythonConfigurationCheck)) {
      return false;
    }
    if (!Objects.equals(this.ignoreDeploymentInboundConfigurationChecks, changeFlowVersionInDeploymentRequest.ignoreDeploymentInboundConfigurationChecks)) {
      return false;
    }
    if (!Objects.equals(this.deploymentRequestCrn, changeFlowVersionInDeploymentRequest.deploymentRequestCrn)) {
      return false;
    }
    if (!Objects.equals(this.assetUpdateRequestCrn, changeFlowVersionInDeploymentRequest.assetUpdateRequestCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, deploymentCrn, deployedFlowCrn, parameterGroups, kpis, strategy, waitForFlowToStopInMinutes, ignoreCustomNarConfigurationCheck, ignoreCustomPythonConfigurationCheck, ignoreDeploymentInboundConfigurationChecks, deploymentRequestCrn, assetUpdateRequestCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeFlowVersionInDeploymentRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    deploymentCrn: ").append(toIndentedString(deploymentCrn)).append("\n");
    sb.append("    deployedFlowCrn: ").append(toIndentedString(deployedFlowCrn)).append("\n");
    sb.append("    parameterGroups: ").append(toIndentedString(parameterGroups)).append("\n");
    sb.append("    kpis: ").append(toIndentedString(kpis)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    waitForFlowToStopInMinutes: ").append(toIndentedString(waitForFlowToStopInMinutes)).append("\n");
    sb.append("    ignoreCustomNarConfigurationCheck: ").append(toIndentedString(ignoreCustomNarConfigurationCheck)).append("\n");
    sb.append("    ignoreCustomPythonConfigurationCheck: ").append(toIndentedString(ignoreCustomPythonConfigurationCheck)).append("\n");
    sb.append("    ignoreDeploymentInboundConfigurationChecks: ").append(toIndentedString(ignoreDeploymentInboundConfigurationChecks)).append("\n");
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

