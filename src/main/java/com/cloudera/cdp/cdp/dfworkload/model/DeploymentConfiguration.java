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
import com.cloudera.cdp.dfworkload.model.ListenComponent;
import java.util.*;

/**
 * Provides all of the configuration that dictates how a flow should be deployed
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-09-14T10:47:19.979-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class DeploymentConfiguration  {

  /**
   * The version of this configuration
   **/
  private Integer configurationVersion = null;

  /**
   * The list of flow parameter groups
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
   * The list of configured KPIs
   **/
  private List<ConfiguredKpi> kpis = new ArrayList<ConfiguredKpi>();

  /**
   * The id of the deployment.
   **/
  private String deploymentId = null;

  /**
   * The CRN of the deployment.
   **/
  private String deploymentCrn = null;

  /**
   * The name of the deployment
   **/
  private String name = null;

  /**
   * The CFM NiFi version associated with the deployment
   **/
  private String cfmNifiVersion = null;

  /**
   * Indicates whether or not the flow should be started during deployment creation
   **/
  private Boolean autoStartFlow = null;

  /**
   * The size of the cluster to deploy
   **/
  private String clusterSizeName = null;

  /**
   * Indicates whether or not all current parameter values have successfully been applied to NiFi
   **/
  private Boolean parametersDirty = null;

  /**
   * Indicates whether or not the current KPIs have successfully been deployed as alert rules
   **/
  private Boolean kpisDirty = null;

  /**
   * Indicates whether or not the current sizing and scaling configuration has been successfully applied in Kubernetes
   **/
  private Boolean sizingAndScalingDirty = null;

  /**
   * The username of the last person to update the deployment configuration
   **/
  private String lastUpdatedByUsername = null;

  /**
   * The inbound hostname
   **/
  private String inboundHostname = null;

  /**
   * Listen components port and protocol data
   **/
  private List<ListenComponent> listenComponents = new ArrayList<ListenComponent>();

  /**
   * Getter for configurationVersion.
   * The version of this configuration
   **/
  @JsonProperty("configurationVersion")
  public Integer getConfigurationVersion() {
    return configurationVersion;
  }

  /**
   * Setter for configurationVersion.
   * The version of this configuration
   **/
  public void setConfigurationVersion(Integer configurationVersion) {
    this.configurationVersion = configurationVersion;
  }

  /**
   * Getter for parameterGroups.
   * The list of flow parameter groups
   **/
  @JsonProperty("parameterGroups")
  public List<FlowParameterGroup> getParameterGroups() {
    return parameterGroups;
  }

  /**
   * Setter for parameterGroups.
   * The list of flow parameter groups
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
   * The list of configured KPIs
   **/
  @JsonProperty("kpis")
  public List<ConfiguredKpi> getKpis() {
    return kpis;
  }

  /**
   * Setter for kpis.
   * The list of configured KPIs
   **/
  public void setKpis(List<ConfiguredKpi> kpis) {
    this.kpis = kpis;
  }

  /**
   * Getter for deploymentId.
   * The id of the deployment.
   **/
  @JsonProperty("deploymentId")
  public String getDeploymentId() {
    return deploymentId;
  }

  /**
   * Setter for deploymentId.
   * The id of the deployment.
   **/
  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
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
   * Getter for name.
   * The name of the deployment
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the deployment
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for cfmNifiVersion.
   * The CFM NiFi version associated with the deployment
   **/
  @JsonProperty("cfmNifiVersion")
  public String getCfmNifiVersion() {
    return cfmNifiVersion;
  }

  /**
   * Setter for cfmNifiVersion.
   * The CFM NiFi version associated with the deployment
   **/
  public void setCfmNifiVersion(String cfmNifiVersion) {
    this.cfmNifiVersion = cfmNifiVersion;
  }

  /**
   * Getter for autoStartFlow.
   * Indicates whether or not the flow should be started during deployment creation
   **/
  @JsonProperty("autoStartFlow")
  public Boolean getAutoStartFlow() {
    return autoStartFlow;
  }

  /**
   * Setter for autoStartFlow.
   * Indicates whether or not the flow should be started during deployment creation
   **/
  public void setAutoStartFlow(Boolean autoStartFlow) {
    this.autoStartFlow = autoStartFlow;
  }

  /**
   * Getter for clusterSizeName.
   * The size of the cluster to deploy
   **/
  @JsonProperty("clusterSizeName")
  public String getClusterSizeName() {
    return clusterSizeName;
  }

  /**
   * Setter for clusterSizeName.
   * The size of the cluster to deploy
   **/
  public void setClusterSizeName(String clusterSizeName) {
    this.clusterSizeName = clusterSizeName;
  }

  /**
   * Getter for parametersDirty.
   * Indicates whether or not all current parameter values have successfully been applied to NiFi
   **/
  @JsonProperty("parametersDirty")
  public Boolean getParametersDirty() {
    return parametersDirty;
  }

  /**
   * Setter for parametersDirty.
   * Indicates whether or not all current parameter values have successfully been applied to NiFi
   **/
  public void setParametersDirty(Boolean parametersDirty) {
    this.parametersDirty = parametersDirty;
  }

  /**
   * Getter for kpisDirty.
   * Indicates whether or not the current KPIs have successfully been deployed as alert rules
   **/
  @JsonProperty("kpisDirty")
  public Boolean getKpisDirty() {
    return kpisDirty;
  }

  /**
   * Setter for kpisDirty.
   * Indicates whether or not the current KPIs have successfully been deployed as alert rules
   **/
  public void setKpisDirty(Boolean kpisDirty) {
    this.kpisDirty = kpisDirty;
  }

  /**
   * Getter for sizingAndScalingDirty.
   * Indicates whether or not the current sizing and scaling configuration has been successfully applied in Kubernetes
   **/
  @JsonProperty("sizingAndScalingDirty")
  public Boolean getSizingAndScalingDirty() {
    return sizingAndScalingDirty;
  }

  /**
   * Setter for sizingAndScalingDirty.
   * Indicates whether or not the current sizing and scaling configuration has been successfully applied in Kubernetes
   **/
  public void setSizingAndScalingDirty(Boolean sizingAndScalingDirty) {
    this.sizingAndScalingDirty = sizingAndScalingDirty;
  }

  /**
   * Getter for lastUpdatedByUsername.
   * The username of the last person to update the deployment configuration
   **/
  @JsonProperty("lastUpdatedByUsername")
  public String getLastUpdatedByUsername() {
    return lastUpdatedByUsername;
  }

  /**
   * Setter for lastUpdatedByUsername.
   * The username of the last person to update the deployment configuration
   **/
  public void setLastUpdatedByUsername(String lastUpdatedByUsername) {
    this.lastUpdatedByUsername = lastUpdatedByUsername;
  }

  /**
   * Getter for inboundHostname.
   * The inbound hostname
   **/
  @JsonProperty("inboundHostname")
  public String getInboundHostname() {
    return inboundHostname;
  }

  /**
   * Setter for inboundHostname.
   * The inbound hostname
   **/
  public void setInboundHostname(String inboundHostname) {
    this.inboundHostname = inboundHostname;
  }

  /**
   * Getter for listenComponents.
   * Listen components port and protocol data
   **/
  @JsonProperty("listenComponents")
  public List<ListenComponent> getListenComponents() {
    return listenComponents;
  }

  /**
   * Setter for listenComponents.
   * Listen components port and protocol data
   **/
  public void setListenComponents(List<ListenComponent> listenComponents) {
    this.listenComponents = listenComponents;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentConfiguration deploymentConfiguration = (DeploymentConfiguration) o;
    if (!Objects.equals(this.configurationVersion, deploymentConfiguration.configurationVersion)) {
      return false;
    }
    if (!Objects.equals(this.parameterGroups, deploymentConfiguration.parameterGroups)) {
      return false;
    }
    if (!Objects.equals(this.autoScalingEnabled, deploymentConfiguration.autoScalingEnabled)) {
      return false;
    }
    if (!Objects.equals(this.flowMetricsScalingEnabled, deploymentConfiguration.flowMetricsScalingEnabled)) {
      return false;
    }
    if (!Objects.equals(this.autoScaleMinNodes, deploymentConfiguration.autoScaleMinNodes)) {
      return false;
    }
    if (!Objects.equals(this.autoScaleMaxNodes, deploymentConfiguration.autoScaleMaxNodes)) {
      return false;
    }
    if (!Objects.equals(this.staticNodeCount, deploymentConfiguration.staticNodeCount)) {
      return false;
    }
    if (!Objects.equals(this.kpis, deploymentConfiguration.kpis)) {
      return false;
    }
    if (!Objects.equals(this.deploymentId, deploymentConfiguration.deploymentId)) {
      return false;
    }
    if (!Objects.equals(this.deploymentCrn, deploymentConfiguration.deploymentCrn)) {
      return false;
    }
    if (!Objects.equals(this.name, deploymentConfiguration.name)) {
      return false;
    }
    if (!Objects.equals(this.cfmNifiVersion, deploymentConfiguration.cfmNifiVersion)) {
      return false;
    }
    if (!Objects.equals(this.autoStartFlow, deploymentConfiguration.autoStartFlow)) {
      return false;
    }
    if (!Objects.equals(this.clusterSizeName, deploymentConfiguration.clusterSizeName)) {
      return false;
    }
    if (!Objects.equals(this.parametersDirty, deploymentConfiguration.parametersDirty)) {
      return false;
    }
    if (!Objects.equals(this.kpisDirty, deploymentConfiguration.kpisDirty)) {
      return false;
    }
    if (!Objects.equals(this.sizingAndScalingDirty, deploymentConfiguration.sizingAndScalingDirty)) {
      return false;
    }
    if (!Objects.equals(this.lastUpdatedByUsername, deploymentConfiguration.lastUpdatedByUsername)) {
      return false;
    }
    if (!Objects.equals(this.inboundHostname, deploymentConfiguration.inboundHostname)) {
      return false;
    }
    if (!Objects.equals(this.listenComponents, deploymentConfiguration.listenComponents)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationVersion, parameterGroups, autoScalingEnabled, flowMetricsScalingEnabled, autoScaleMinNodes, autoScaleMaxNodes, staticNodeCount, kpis, deploymentId, deploymentCrn, name, cfmNifiVersion, autoStartFlow, clusterSizeName, parametersDirty, kpisDirty, sizingAndScalingDirty, lastUpdatedByUsername, inboundHostname, listenComponents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentConfiguration {\n");
    sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
    sb.append("    parameterGroups: ").append(toIndentedString(parameterGroups)).append("\n");
    sb.append("    autoScalingEnabled: ").append(toIndentedString(autoScalingEnabled)).append("\n");
    sb.append("    flowMetricsScalingEnabled: ").append(toIndentedString(flowMetricsScalingEnabled)).append("\n");
    sb.append("    autoScaleMinNodes: ").append(toIndentedString(autoScaleMinNodes)).append("\n");
    sb.append("    autoScaleMaxNodes: ").append(toIndentedString(autoScaleMaxNodes)).append("\n");
    sb.append("    staticNodeCount: ").append(toIndentedString(staticNodeCount)).append("\n");
    sb.append("    kpis: ").append(toIndentedString(kpis)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    deploymentCrn: ").append(toIndentedString(deploymentCrn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cfmNifiVersion: ").append(toIndentedString(cfmNifiVersion)).append("\n");
    sb.append("    autoStartFlow: ").append(toIndentedString(autoStartFlow)).append("\n");
    sb.append("    clusterSizeName: ").append(toIndentedString(clusterSizeName)).append("\n");
    sb.append("    parametersDirty: ").append(toIndentedString(parametersDirty)).append("\n");
    sb.append("    kpisDirty: ").append(toIndentedString(kpisDirty)).append("\n");
    sb.append("    sizingAndScalingDirty: ").append(toIndentedString(sizingAndScalingDirty)).append("\n");
    sb.append("    lastUpdatedByUsername: ").append(toIndentedString(lastUpdatedByUsername)).append("\n");
    sb.append("    inboundHostname: ").append(toIndentedString(inboundHostname)).append("\n");
    sb.append("    listenComponents: ").append(toIndentedString(listenComponents)).append("\n");
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

