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
 * Request object to add a flow to an existing deployment.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-04-15T08:44:54.268-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class AddFlowToDeploymentRequest  {

  /**
   * The CRN of an environment to execute the command.
   **/
  private String environmentCrn = null;

  /**
   * The name of the deployed NiFi flow.
   **/
  private String name = null;

  /**
   * The version of this configuration.
   **/
  private Integer configurationVersion = null;

  /**
   * The CRN of the deployment.
   **/
  private String deploymentCrn = null;

  /**
   * The CRN of the flow deployment request.
   **/
  private String deployedFlowRequestCrn = null;

  /**
   * The list of flow parameter groups.
   **/
  private List<FlowParameterGroup> parameterGroups = new ArrayList<FlowParameterGroup>();

  /**
   * The list of configured KPIs.
   **/
  private List<ConfiguredKpi> kpis = new ArrayList<ConfiguredKpi>();

  /**
   * Indicates whether or not the flow should be started during deployment creation.
   **/
  private Boolean autoStartFlow = null;

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
   * The CRN of the project to which the deployment belongs, used for authorization.
   **/
  private String projectCrn = null;

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
   * Getter for name.
   * The name of the deployed NiFi flow.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the deployed NiFi flow.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for configurationVersion.
   * The version of this configuration.
   **/
  @JsonProperty("configurationVersion")
  public Integer getConfigurationVersion() {
    return configurationVersion;
  }

  /**
   * Setter for configurationVersion.
   * The version of this configuration.
   **/
  public void setConfigurationVersion(Integer configurationVersion) {
    this.configurationVersion = configurationVersion;
  }

  /**
   * Getter for deploymentCrn.
   * The CRN of the deployment.
   **/
  @JsonProperty("deploymentCrn")
  public String getDeploymentCrn() {
    return deploymentCrn;
  }

  /**
   * Setter for deploymentCrn.
   * The CRN of the deployment.
   **/
  public void setDeploymentCrn(String deploymentCrn) {
    this.deploymentCrn = deploymentCrn;
  }

  /**
   * Getter for deployedFlowRequestCrn.
   * The CRN of the flow deployment request.
   **/
  @JsonProperty("deployedFlowRequestCrn")
  public String getDeployedFlowRequestCrn() {
    return deployedFlowRequestCrn;
  }

  /**
   * Setter for deployedFlowRequestCrn.
   * The CRN of the flow deployment request.
   **/
  public void setDeployedFlowRequestCrn(String deployedFlowRequestCrn) {
    this.deployedFlowRequestCrn = deployedFlowRequestCrn;
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
   * Getter for autoStartFlow.
   * Indicates whether or not the flow should be started during deployment creation.
   **/
  @JsonProperty("autoStartFlow")
  public Boolean getAutoStartFlow() {
    return autoStartFlow;
  }

  /**
   * Setter for autoStartFlow.
   * Indicates whether or not the flow should be started during deployment creation.
   **/
  public void setAutoStartFlow(Boolean autoStartFlow) {
    this.autoStartFlow = autoStartFlow;
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
   * Getter for projectCrn.
   * The CRN of the project to which the deployment belongs, used for authorization.
   **/
  @JsonProperty("projectCrn")
  public String getProjectCrn() {
    return projectCrn;
  }

  /**
   * Setter for projectCrn.
   * The CRN of the project to which the deployment belongs, used for authorization.
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
    AddFlowToDeploymentRequest addFlowToDeploymentRequest = (AddFlowToDeploymentRequest) o;
    if (!Objects.equals(this.environmentCrn, addFlowToDeploymentRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.name, addFlowToDeploymentRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.configurationVersion, addFlowToDeploymentRequest.configurationVersion)) {
      return false;
    }
    if (!Objects.equals(this.deploymentCrn, addFlowToDeploymentRequest.deploymentCrn)) {
      return false;
    }
    if (!Objects.equals(this.deployedFlowRequestCrn, addFlowToDeploymentRequest.deployedFlowRequestCrn)) {
      return false;
    }
    if (!Objects.equals(this.parameterGroups, addFlowToDeploymentRequest.parameterGroups)) {
      return false;
    }
    if (!Objects.equals(this.kpis, addFlowToDeploymentRequest.kpis)) {
      return false;
    }
    if (!Objects.equals(this.autoStartFlow, addFlowToDeploymentRequest.autoStartFlow)) {
      return false;
    }
    if (!Objects.equals(this.ignoreCustomNarConfigurationCheck, addFlowToDeploymentRequest.ignoreCustomNarConfigurationCheck)) {
      return false;
    }
    if (!Objects.equals(this.ignoreCustomPythonConfigurationCheck, addFlowToDeploymentRequest.ignoreCustomPythonConfigurationCheck)) {
      return false;
    }
    if (!Objects.equals(this.ignoreDeploymentInboundConfigurationChecks, addFlowToDeploymentRequest.ignoreDeploymentInboundConfigurationChecks)) {
      return false;
    }
    if (!Objects.equals(this.projectCrn, addFlowToDeploymentRequest.projectCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, name, configurationVersion, deploymentCrn, deployedFlowRequestCrn, parameterGroups, kpis, autoStartFlow, ignoreCustomNarConfigurationCheck, ignoreCustomPythonConfigurationCheck, ignoreDeploymentInboundConfigurationChecks, projectCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddFlowToDeploymentRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
    sb.append("    deploymentCrn: ").append(toIndentedString(deploymentCrn)).append("\n");
    sb.append("    deployedFlowRequestCrn: ").append(toIndentedString(deployedFlowRequestCrn)).append("\n");
    sb.append("    parameterGroups: ").append(toIndentedString(parameterGroups)).append("\n");
    sb.append("    kpis: ").append(toIndentedString(kpis)).append("\n");
    sb.append("    autoStartFlow: ").append(toIndentedString(autoStartFlow)).append("\n");
    sb.append("    ignoreCustomNarConfigurationCheck: ").append(toIndentedString(ignoreCustomNarConfigurationCheck)).append("\n");
    sb.append("    ignoreCustomPythonConfigurationCheck: ").append(toIndentedString(ignoreCustomPythonConfigurationCheck)).append("\n");
    sb.append("    ignoreDeploymentInboundConfigurationChecks: ").append(toIndentedString(ignoreDeploymentInboundConfigurationChecks)).append("\n");
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

