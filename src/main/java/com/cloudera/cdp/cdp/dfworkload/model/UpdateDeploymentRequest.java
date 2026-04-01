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
import com.cloudera.cdp.dfworkload.model.SimpleListenComponent;
import java.util.*;

/**
 * Provides all of the configuration that dictates how a deployment should be updated.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-31T14:25:34.176-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class UpdateDeploymentRequest  {

  /**
   * The CRN of an environment to execute the command.
   **/
  private String environmentCrn = null;

  /**
   * The CRN of the existing deployment to be updated.
   **/
  private String deploymentCrn = null;

  /**
   * The version of this configuration.
   **/
  private Integer configurationVersion = null;

  /**
   * The CRN of the asset update request. Required when updating assets of an existing deployment. Deprecated, use asset-update-request-crn in the update-flow-in-deployment command.
   **/
  private String assetUpdateRequestCrn = null;

  /**
   * The deployment t-shirt size.
   **/
  private BasicClusterSize clusterSize = null;

  /**
   * The list of flow parameter groups, for the first deployed flow. Deprecated, use parameter-groups in the update-flow-in-deployment command.
   **/
  private List<FlowParameterGroup> parameterGroups = new ArrayList<FlowParameterGroup>();

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
   * The list of Key Performance Indicators (KPIs) with which to replace the current list of configured KPIs. Only deployment-level KPIs are allowed. To configure flow-level KPIs, use update-flow-in-deployment. If the list is empty, all KPIs are deleted; however, if it is not specified, the current KPI settings are not updated.
   **/
  private List<ConfiguredKpi> kpis = new ArrayList<ConfiguredKpi>();

  /**
   * The FQDN of inbound hostname or just the prefix part.
   **/
  private String inboundHostname = null;

  /**
   * Listen components port and protocol data.
   **/
  private List<SimpleListenComponent> listenComponents = new ArrayList<SimpleListenComponent>();

  /**
   * Set of authorized CIDR ranges for the inbound connections.
   **/
  private List<String> inboundConnectionAuthorizedIpRanges = new ArrayList<String>();

  /**
   * Specifies that the inbound connection be deactivated.
   **/
  private Boolean deactivateInboundConnection = null;

  /**
   * The CRN of the Custom NAR configuration.
   **/
  private String customNarConfigurationCrn = null;

  /**
   * The CRN of the Custom Python configuration.
   **/
  private String customPythonConfigurationCrn = null;

  /**
   * Specifies whether the CDP CLI supports the multi-flow. Deprecated, this argument is only for internal use.
   **/
  private Boolean cliSupportsMultiFlow = null;

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
   * The CRN of the asset update request. Required when updating assets of an existing deployment. Deprecated, use asset-update-request-crn in the update-flow-in-deployment command.
   **/
  @Deprecated
  @JsonProperty("assetUpdateRequestCrn")
  public String getAssetUpdateRequestCrn() {
    return assetUpdateRequestCrn;
  }

  /**
   * Setter for assetUpdateRequestCrn.
   * The CRN of the asset update request. Required when updating assets of an existing deployment. Deprecated, use asset-update-request-crn in the update-flow-in-deployment command.
   **/
  @Deprecated
  public void setAssetUpdateRequestCrn(String assetUpdateRequestCrn) {
    this.assetUpdateRequestCrn = assetUpdateRequestCrn;
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
   * Getter for parameterGroups.
   * The list of flow parameter groups, for the first deployed flow. Deprecated, use parameter-groups in the update-flow-in-deployment command.
   **/
  @Deprecated
  @JsonProperty("parameterGroups")
  public List<FlowParameterGroup> getParameterGroups() {
    return parameterGroups;
  }

  /**
   * Setter for parameterGroups.
   * The list of flow parameter groups, for the first deployed flow. Deprecated, use parameter-groups in the update-flow-in-deployment command.
   **/
  @Deprecated
  public void setParameterGroups(List<FlowParameterGroup> parameterGroups) {
    this.parameterGroups = parameterGroups;
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
   * The list of Key Performance Indicators (KPIs) with which to replace the current list of configured KPIs. Only deployment-level KPIs are allowed. To configure flow-level KPIs, use update-flow-in-deployment. If the list is empty, all KPIs are deleted; however, if it is not specified, the current KPI settings are not updated.
   **/
  @JsonProperty("kpis")
  public List<ConfiguredKpi> getKpis() {
    return kpis;
  }

  /**
   * Setter for kpis.
   * The list of Key Performance Indicators (KPIs) with which to replace the current list of configured KPIs. Only deployment-level KPIs are allowed. To configure flow-level KPIs, use update-flow-in-deployment. If the list is empty, all KPIs are deleted; however, if it is not specified, the current KPI settings are not updated.
   **/
  public void setKpis(List<ConfiguredKpi> kpis) {
    this.kpis = kpis;
  }

  /**
   * Getter for inboundHostname.
   * The FQDN of inbound hostname or just the prefix part.
   **/
  @JsonProperty("inboundHostname")
  public String getInboundHostname() {
    return inboundHostname;
  }

  /**
   * Setter for inboundHostname.
   * The FQDN of inbound hostname or just the prefix part.
   **/
  public void setInboundHostname(String inboundHostname) {
    this.inboundHostname = inboundHostname;
  }

  /**
   * Getter for listenComponents.
   * Listen components port and protocol data.
   **/
  @JsonProperty("listenComponents")
  public List<SimpleListenComponent> getListenComponents() {
    return listenComponents;
  }

  /**
   * Setter for listenComponents.
   * Listen components port and protocol data.
   **/
  public void setListenComponents(List<SimpleListenComponent> listenComponents) {
    this.listenComponents = listenComponents;
  }

  /**
   * Getter for inboundConnectionAuthorizedIpRanges.
   * Set of authorized CIDR ranges for the inbound connections.
   **/
  @JsonProperty("inboundConnectionAuthorizedIpRanges")
  public List<String> getInboundConnectionAuthorizedIpRanges() {
    return inboundConnectionAuthorizedIpRanges;
  }

  /**
   * Setter for inboundConnectionAuthorizedIpRanges.
   * Set of authorized CIDR ranges for the inbound connections.
   **/
  public void setInboundConnectionAuthorizedIpRanges(List<String> inboundConnectionAuthorizedIpRanges) {
    this.inboundConnectionAuthorizedIpRanges = inboundConnectionAuthorizedIpRanges;
  }

  /**
   * Getter for deactivateInboundConnection.
   * Specifies that the inbound connection be deactivated.
   **/
  @JsonProperty("deactivateInboundConnection")
  public Boolean getDeactivateInboundConnection() {
    return deactivateInboundConnection;
  }

  /**
   * Setter for deactivateInboundConnection.
   * Specifies that the inbound connection be deactivated.
   **/
  public void setDeactivateInboundConnection(Boolean deactivateInboundConnection) {
    this.deactivateInboundConnection = deactivateInboundConnection;
  }

  /**
   * Getter for customNarConfigurationCrn.
   * The CRN of the Custom NAR configuration.
   **/
  @JsonProperty("customNarConfigurationCrn")
  public String getCustomNarConfigurationCrn() {
    return customNarConfigurationCrn;
  }

  /**
   * Setter for customNarConfigurationCrn.
   * The CRN of the Custom NAR configuration.
   **/
  public void setCustomNarConfigurationCrn(String customNarConfigurationCrn) {
    this.customNarConfigurationCrn = customNarConfigurationCrn;
  }

  /**
   * Getter for customPythonConfigurationCrn.
   * The CRN of the Custom Python configuration.
   **/
  @JsonProperty("customPythonConfigurationCrn")
  public String getCustomPythonConfigurationCrn() {
    return customPythonConfigurationCrn;
  }

  /**
   * Setter for customPythonConfigurationCrn.
   * The CRN of the Custom Python configuration.
   **/
  public void setCustomPythonConfigurationCrn(String customPythonConfigurationCrn) {
    this.customPythonConfigurationCrn = customPythonConfigurationCrn;
  }

  /**
   * Getter for cliSupportsMultiFlow.
   * Specifies whether the CDP CLI supports the multi-flow. Deprecated, this argument is only for internal use.
   **/
  @Deprecated
  @JsonProperty("cliSupportsMultiFlow")
  public Boolean getCliSupportsMultiFlow() {
    return cliSupportsMultiFlow;
  }

  /**
   * Setter for cliSupportsMultiFlow.
   * Specifies whether the CDP CLI supports the multi-flow. Deprecated, this argument is only for internal use.
   **/
  @Deprecated
  public void setCliSupportsMultiFlow(Boolean cliSupportsMultiFlow) {
    this.cliSupportsMultiFlow = cliSupportsMultiFlow;
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
    if (!Objects.equals(this.deploymentCrn, updateDeploymentRequest.deploymentCrn)) {
      return false;
    }
    if (!Objects.equals(this.configurationVersion, updateDeploymentRequest.configurationVersion)) {
      return false;
    }
    if (!Objects.equals(this.assetUpdateRequestCrn, updateDeploymentRequest.assetUpdateRequestCrn)) {
      return false;
    }
    if (!Objects.equals(this.clusterSize, updateDeploymentRequest.clusterSize)) {
      return false;
    }
    if (!Objects.equals(this.parameterGroups, updateDeploymentRequest.parameterGroups)) {
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
    if (!Objects.equals(this.inboundHostname, updateDeploymentRequest.inboundHostname)) {
      return false;
    }
    if (!Objects.equals(this.listenComponents, updateDeploymentRequest.listenComponents)) {
      return false;
    }
    if (!Objects.equals(this.inboundConnectionAuthorizedIpRanges, updateDeploymentRequest.inboundConnectionAuthorizedIpRanges)) {
      return false;
    }
    if (!Objects.equals(this.deactivateInboundConnection, updateDeploymentRequest.deactivateInboundConnection)) {
      return false;
    }
    if (!Objects.equals(this.customNarConfigurationCrn, updateDeploymentRequest.customNarConfigurationCrn)) {
      return false;
    }
    if (!Objects.equals(this.customPythonConfigurationCrn, updateDeploymentRequest.customPythonConfigurationCrn)) {
      return false;
    }
    if (!Objects.equals(this.cliSupportsMultiFlow, updateDeploymentRequest.cliSupportsMultiFlow)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, deploymentCrn, configurationVersion, assetUpdateRequestCrn, clusterSize, parameterGroups, autoScaleMinNodes, autoScaleMaxNodes, staticNodeCount, kpis, inboundHostname, listenComponents, inboundConnectionAuthorizedIpRanges, deactivateInboundConnection, customNarConfigurationCrn, customPythonConfigurationCrn, cliSupportsMultiFlow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDeploymentRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    deploymentCrn: ").append(toIndentedString(deploymentCrn)).append("\n");
    sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
    sb.append("    assetUpdateRequestCrn: ").append(toIndentedString(assetUpdateRequestCrn)).append("\n");
    sb.append("    clusterSize: ").append(toIndentedString(clusterSize)).append("\n");
    sb.append("    parameterGroups: ").append(toIndentedString(parameterGroups)).append("\n");
    sb.append("    autoScaleMinNodes: ").append(toIndentedString(autoScaleMinNodes)).append("\n");
    sb.append("    autoScaleMaxNodes: ").append(toIndentedString(autoScaleMaxNodes)).append("\n");
    sb.append("    staticNodeCount: ").append(toIndentedString(staticNodeCount)).append("\n");
    sb.append("    kpis: ").append(toIndentedString(kpis)).append("\n");
    sb.append("    inboundHostname: ").append(toIndentedString(inboundHostname)).append("\n");
    sb.append("    listenComponents: ").append(toIndentedString(listenComponents)).append("\n");
    sb.append("    inboundConnectionAuthorizedIpRanges: ").append(toIndentedString(inboundConnectionAuthorizedIpRanges)).append("\n");
    sb.append("    deactivateInboundConnection: ").append(toIndentedString(deactivateInboundConnection)).append("\n");
    sb.append("    customNarConfigurationCrn: ").append(toIndentedString(customNarConfigurationCrn)).append("\n");
    sb.append("    customPythonConfigurationCrn: ").append(toIndentedString(customPythonConfigurationCrn)).append("\n");
    sb.append("    cliSupportsMultiFlow: ").append(toIndentedString(cliSupportsMultiFlow)).append("\n");
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

