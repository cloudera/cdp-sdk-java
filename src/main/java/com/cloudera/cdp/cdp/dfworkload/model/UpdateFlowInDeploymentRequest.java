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
 * Provides all of the configuration that dictates how a deployed flow should be updated.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-31T14:25:34.176-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class UpdateFlowInDeploymentRequest  {

  /**
   * The CRN of an environment to execute the command.
   **/
  private String environmentCrn = null;

  /**
   * The CRN of the deployment.
   **/
  private String deploymentCrn = null;

  /**
   * The CRN of the deployed flow.
   **/
  private String deployedFlowCrn = null;

  /**
   * The version of this configuration.
   **/
  private Integer configurationVersion = null;

  /**
   * The CRN of the asset update request. Required when updating assets of an existing deployed flow. Deprecated, this argument is only for internal use.
   **/
  private String assetUpdateRequestCrn = null;

  /**
   * The list of flow parameter groups.
   **/
  private List<FlowParameterGroup> parameterGroups = new ArrayList<FlowParameterGroup>();

  /**
   * The list of configured KPIs.
   **/
  private List<ConfiguredKpi> kpis = new ArrayList<ConfiguredKpi>();

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
   * Getter for deployedFlowCrn.
   * The CRN of the deployed flow.
   **/
  @JsonProperty("deployedFlowCrn")
  public String getDeployedFlowCrn() {
    return deployedFlowCrn;
  }

  /**
   * Setter for deployedFlowCrn.
   * The CRN of the deployed flow.
   **/
  public void setDeployedFlowCrn(String deployedFlowCrn) {
    this.deployedFlowCrn = deployedFlowCrn;
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
   * Getter for assetUpdateRequestCrn.
   * The CRN of the asset update request. Required when updating assets of an existing deployed flow. Deprecated, this argument is only for internal use.
   **/
  @Deprecated
  @JsonProperty("assetUpdateRequestCrn")
  public String getAssetUpdateRequestCrn() {
    return assetUpdateRequestCrn;
  }

  /**
   * Setter for assetUpdateRequestCrn.
   * The CRN of the asset update request. Required when updating assets of an existing deployed flow. Deprecated, this argument is only for internal use.
   **/
  @Deprecated
  public void setAssetUpdateRequestCrn(String assetUpdateRequestCrn) {
    this.assetUpdateRequestCrn = assetUpdateRequestCrn;
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFlowInDeploymentRequest updateFlowInDeploymentRequest = (UpdateFlowInDeploymentRequest) o;
    if (!Objects.equals(this.environmentCrn, updateFlowInDeploymentRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.deploymentCrn, updateFlowInDeploymentRequest.deploymentCrn)) {
      return false;
    }
    if (!Objects.equals(this.deployedFlowCrn, updateFlowInDeploymentRequest.deployedFlowCrn)) {
      return false;
    }
    if (!Objects.equals(this.configurationVersion, updateFlowInDeploymentRequest.configurationVersion)) {
      return false;
    }
    if (!Objects.equals(this.assetUpdateRequestCrn, updateFlowInDeploymentRequest.assetUpdateRequestCrn)) {
      return false;
    }
    if (!Objects.equals(this.parameterGroups, updateFlowInDeploymentRequest.parameterGroups)) {
      return false;
    }
    if (!Objects.equals(this.kpis, updateFlowInDeploymentRequest.kpis)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, deploymentCrn, deployedFlowCrn, configurationVersion, assetUpdateRequestCrn, parameterGroups, kpis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFlowInDeploymentRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    deploymentCrn: ").append(toIndentedString(deploymentCrn)).append("\n");
    sb.append("    deployedFlowCrn: ").append(toIndentedString(deployedFlowCrn)).append("\n");
    sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
    sb.append("    assetUpdateRequestCrn: ").append(toIndentedString(assetUpdateRequestCrn)).append("\n");
    sb.append("    parameterGroups: ").append(toIndentedString(parameterGroups)).append("\n");
    sb.append("    kpis: ").append(toIndentedString(kpis)).append("\n");
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

