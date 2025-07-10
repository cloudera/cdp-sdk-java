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
import com.cloudera.cdp.dfworkload.model.BasicClusterSize;
import com.cloudera.cdp.dfworkload.model.ConfiguredKpi;
import com.cloudera.cdp.dfworkload.model.FlowParameterGroup;
import java.util.*;

/**
 * Provides all of the configuration that dictates how a flow should be deployed.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-09T13:56:15.542-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class UpdateDeploymentRequest  {

  /**
   * The CRN of an environment to execute the command.
   **/
  private String environmentCrn = null;

  /**
   * The version of this configuration.
   **/
  private Integer configurationVersion = null;

  /**
   * The CRN of the existing deployment to be updated.
   **/
  private String deploymentCrn = null;

  /**
   * The list of flow parameter groups.
   **/
  private List<FlowParameterGroup> parameterGroups = new ArrayList<FlowParameterGroup>();

  /**
   * Specifies that auto-scaling should be enabled.
   **/
  private Boolean autoScalingEnabled = null;

  /**
   * Specifies that Flow metrics should be enabled for scaling.
   **/
  private Boolean flowMetricsScalingEnabled = null;

  /**
   * The minimum number of nodes that the cluster should allocate. May only be specified when autoScalingEnabled is true.
   **/
  private Integer autoScaleMinNodes = null;

  /**
   * The maximum number of nodes that the cluster should scale to. May only be specified when autoScalingEnabled is true.
   **/
  private Integer autoScaleMaxNodes = null;

  /**
   * The static number of nodes that the cluster should allocate. May only be specified when autoScalingEnabled is false.
   **/
  private Integer staticNodeCount = null;

  /**
   * The list of configured KPIs.
   **/
  private List<ConfiguredKpi> kpis = new ArrayList<ConfiguredKpi>();

  /**
   * The deployment t-shirt size.
   **/
  private BasicClusterSize clusterSize = null;

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
   * The CRN of the existing deployment to be updated.
   **/
  @JsonProperty("deploymentCrn")
  public String getDeploymentCrn() {
    return deploymentCrn;
  }

  /**
   * Setter for deploymentCrn.
   * The CRN of the existing deployment to be updated.
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
   * Getter for autoScalingEnabled.
   * Specifies that auto-scaling should be enabled.
   **/
  @JsonProperty("autoScalingEnabled")
  public Boolean getAutoScalingEnabled() {
    return autoScalingEnabled;
  }

  /**
   * Setter for autoScalingEnabled.
   * Specifies that auto-scaling should be enabled.
   **/
  public void setAutoScalingEnabled(Boolean autoScalingEnabled) {
    this.autoScalingEnabled = autoScalingEnabled;
  }

  /**
   * Getter for flowMetricsScalingEnabled.
   * Specifies that Flow metrics should be enabled for scaling.
   **/
  @JsonProperty("flowMetricsScalingEnabled")
  public Boolean getFlowMetricsScalingEnabled() {
    return flowMetricsScalingEnabled;
  }

  /**
   * Setter for flowMetricsScalingEnabled.
   * Specifies that Flow metrics should be enabled for scaling.
   **/
  public void setFlowMetricsScalingEnabled(Boolean flowMetricsScalingEnabled) {
    this.flowMetricsScalingEnabled = flowMetricsScalingEnabled;
  }

  /**
   * Getter for autoScaleMinNodes.
   * The minimum number of nodes that the cluster should allocate. May only be specified when autoScalingEnabled is true.
   **/
  @JsonProperty("autoScaleMinNodes")
  public Integer getAutoScaleMinNodes() {
    return autoScaleMinNodes;
  }

  /**
   * Setter for autoScaleMinNodes.
   * The minimum number of nodes that the cluster should allocate. May only be specified when autoScalingEnabled is true.
   **/
  public void setAutoScaleMinNodes(Integer autoScaleMinNodes) {
    this.autoScaleMinNodes = autoScaleMinNodes;
  }

  /**
   * Getter for autoScaleMaxNodes.
   * The maximum number of nodes that the cluster should scale to. May only be specified when autoScalingEnabled is true.
   **/
  @JsonProperty("autoScaleMaxNodes")
  public Integer getAutoScaleMaxNodes() {
    return autoScaleMaxNodes;
  }

  /**
   * Setter for autoScaleMaxNodes.
   * The maximum number of nodes that the cluster should scale to. May only be specified when autoScalingEnabled is true.
   **/
  public void setAutoScaleMaxNodes(Integer autoScaleMaxNodes) {
    this.autoScaleMaxNodes = autoScaleMaxNodes;
  }

  /**
   * Getter for staticNodeCount.
   * The static number of nodes that the cluster should allocate. May only be specified when autoScalingEnabled is false.
   **/
  @JsonProperty("staticNodeCount")
  public Integer getStaticNodeCount() {
    return staticNodeCount;
  }

  /**
   * Setter for staticNodeCount.
   * The static number of nodes that the cluster should allocate. May only be specified when autoScalingEnabled is false.
   **/
  public void setStaticNodeCount(Integer staticNodeCount) {
    this.staticNodeCount = staticNodeCount;
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
   * Getter for clusterSize.
   * The deployment t-shirt size.
   **/
  @JsonProperty("clusterSize")
  public BasicClusterSize getClusterSize() {
    return clusterSize;
  }

  /**
   * Setter for clusterSize.
   * The deployment t-shirt size.
   **/
  public void setClusterSize(BasicClusterSize clusterSize) {
    this.clusterSize = clusterSize;
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
    UpdateDeploymentRequest updateDeploymentRequest = (UpdateDeploymentRequest) o;
    if (!Objects.equals(this.environmentCrn, updateDeploymentRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.configurationVersion, updateDeploymentRequest.configurationVersion)) {
      return false;
    }
    if (!Objects.equals(this.deploymentCrn, updateDeploymentRequest.deploymentCrn)) {
      return false;
    }
    if (!Objects.equals(this.parameterGroups, updateDeploymentRequest.parameterGroups)) {
      return false;
    }
    if (!Objects.equals(this.autoScalingEnabled, updateDeploymentRequest.autoScalingEnabled)) {
      return false;
    }
    if (!Objects.equals(this.flowMetricsScalingEnabled, updateDeploymentRequest.flowMetricsScalingEnabled)) {
      return false;
    }
    if (!Objects.equals(this.autoScaleMinNodes, updateDeploymentRequest.autoScaleMinNodes)) {
      return false;
    }
    if (!Objects.equals(this.autoScaleMaxNodes, updateDeploymentRequest.autoScaleMaxNodes)) {
      return false;
    }
    if (!Objects.equals(this.staticNodeCount, updateDeploymentRequest.staticNodeCount)) {
      return false;
    }
    if (!Objects.equals(this.kpis, updateDeploymentRequest.kpis)) {
      return false;
    }
    if (!Objects.equals(this.clusterSize, updateDeploymentRequest.clusterSize)) {
      return false;
    }
    if (!Objects.equals(this.assetUpdateRequestCrn, updateDeploymentRequest.assetUpdateRequestCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, configurationVersion, deploymentCrn, parameterGroups, autoScalingEnabled, flowMetricsScalingEnabled, autoScaleMinNodes, autoScaleMaxNodes, staticNodeCount, kpis, clusterSize, assetUpdateRequestCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDeploymentRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
    sb.append("    deploymentCrn: ").append(toIndentedString(deploymentCrn)).append("\n");
    sb.append("    parameterGroups: ").append(toIndentedString(parameterGroups)).append("\n");
    sb.append("    autoScalingEnabled: ").append(toIndentedString(autoScalingEnabled)).append("\n");
    sb.append("    flowMetricsScalingEnabled: ").append(toIndentedString(flowMetricsScalingEnabled)).append("\n");
    sb.append("    autoScaleMinNodes: ").append(toIndentedString(autoScaleMinNodes)).append("\n");
    sb.append("    autoScaleMaxNodes: ").append(toIndentedString(autoScaleMaxNodes)).append("\n");
    sb.append("    staticNodeCount: ").append(toIndentedString(staticNodeCount)).append("\n");
    sb.append("    kpis: ").append(toIndentedString(kpis)).append("\n");
    sb.append("    clusterSize: ").append(toIndentedString(clusterSize)).append("\n");
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

