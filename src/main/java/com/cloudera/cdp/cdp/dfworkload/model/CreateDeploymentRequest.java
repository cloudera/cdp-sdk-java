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
 * Request object to create a deployment.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-06-14T15:47:19.045-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class CreateDeploymentRequest  {

  /**
   * The CRN of an environment to execute the command.
   **/
  private String environmentCrn = null;

  /**
   * The version of this configuration
   **/
  private Integer configurationVersion = null;

  /**
   * The name of the deployment
   **/
  private String name = null;

  /**
   * The size of the cluster to deploy
   **/
  private String clusterSizeName = null;

  /**
   * The CRN of the deployment request.
   **/
  private String deploymentRequestCrn = null;

  /**
   * The list of flow parameter groups
   **/
  private List<FlowParameterGroup> parameterGroups = new ArrayList<FlowParameterGroup>();

  /**
   * Specifies that auto-scaling should be enabled.
   **/
  private Boolean autoScalingEnabled = null;

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
   * The CFM NiFi version associated with the deployment
   **/
  private String cfmNifiVersion = null;

  /**
   * Indicates whether or not the flow should be started during deployment creation
   **/
  private Boolean autoStartFlow = null;

  /**
   * The FQDN of inbound hostname or just the prefix part
   **/
  private String inboundHostname = null;

  /**
   * Listen components port and protocol data
   **/
  private List<ListenComponent> listenComponents = new ArrayList<ListenComponent>();

  /**
   * The CRN of the custom NAR configuration.
   **/
  private String customNarConfigurationCrn = null;

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
   * Getter for inboundHostname.
   * The FQDN of inbound hostname or just the prefix part
   **/
  @JsonProperty("inboundHostname")
  public String getInboundHostname() {
    return inboundHostname;
  }

  /**
   * Setter for inboundHostname.
   * The FQDN of inbound hostname or just the prefix part
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

  /**
   * Getter for customNarConfigurationCrn.
   * The CRN of the custom NAR configuration.
   **/
  @JsonProperty("customNarConfigurationCrn")
  public String getCustomNarConfigurationCrn() {
    return customNarConfigurationCrn;
  }

  /**
   * Setter for customNarConfigurationCrn.
   * The CRN of the custom NAR configuration.
   **/
  public void setCustomNarConfigurationCrn(String customNarConfigurationCrn) {
    this.customNarConfigurationCrn = customNarConfigurationCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDeploymentRequest createDeploymentRequest = (CreateDeploymentRequest) o;
    if (!Objects.equals(this.environmentCrn, createDeploymentRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.configurationVersion, createDeploymentRequest.configurationVersion)) {
      return false;
    }
    if (!Objects.equals(this.name, createDeploymentRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.clusterSizeName, createDeploymentRequest.clusterSizeName)) {
      return false;
    }
    if (!Objects.equals(this.deploymentRequestCrn, createDeploymentRequest.deploymentRequestCrn)) {
      return false;
    }
    if (!Objects.equals(this.parameterGroups, createDeploymentRequest.parameterGroups)) {
      return false;
    }
    if (!Objects.equals(this.autoScalingEnabled, createDeploymentRequest.autoScalingEnabled)) {
      return false;
    }
    if (!Objects.equals(this.autoScaleMinNodes, createDeploymentRequest.autoScaleMinNodes)) {
      return false;
    }
    if (!Objects.equals(this.autoScaleMaxNodes, createDeploymentRequest.autoScaleMaxNodes)) {
      return false;
    }
    if (!Objects.equals(this.staticNodeCount, createDeploymentRequest.staticNodeCount)) {
      return false;
    }
    if (!Objects.equals(this.kpis, createDeploymentRequest.kpis)) {
      return false;
    }
    if (!Objects.equals(this.cfmNifiVersion, createDeploymentRequest.cfmNifiVersion)) {
      return false;
    }
    if (!Objects.equals(this.autoStartFlow, createDeploymentRequest.autoStartFlow)) {
      return false;
    }
    if (!Objects.equals(this.inboundHostname, createDeploymentRequest.inboundHostname)) {
      return false;
    }
    if (!Objects.equals(this.listenComponents, createDeploymentRequest.listenComponents)) {
      return false;
    }
    if (!Objects.equals(this.customNarConfigurationCrn, createDeploymentRequest.customNarConfigurationCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, configurationVersion, name, clusterSizeName, deploymentRequestCrn, parameterGroups, autoScalingEnabled, autoScaleMinNodes, autoScaleMaxNodes, staticNodeCount, kpis, cfmNifiVersion, autoStartFlow, inboundHostname, listenComponents, customNarConfigurationCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDeploymentRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    clusterSizeName: ").append(toIndentedString(clusterSizeName)).append("\n");
    sb.append("    deploymentRequestCrn: ").append(toIndentedString(deploymentRequestCrn)).append("\n");
    sb.append("    parameterGroups: ").append(toIndentedString(parameterGroups)).append("\n");
    sb.append("    autoScalingEnabled: ").append(toIndentedString(autoScalingEnabled)).append("\n");
    sb.append("    autoScaleMinNodes: ").append(toIndentedString(autoScaleMinNodes)).append("\n");
    sb.append("    autoScaleMaxNodes: ").append(toIndentedString(autoScaleMaxNodes)).append("\n");
    sb.append("    staticNodeCount: ").append(toIndentedString(staticNodeCount)).append("\n");
    sb.append("    kpis: ").append(toIndentedString(kpis)).append("\n");
    sb.append("    cfmNifiVersion: ").append(toIndentedString(cfmNifiVersion)).append("\n");
    sb.append("    autoStartFlow: ").append(toIndentedString(autoStartFlow)).append("\n");
    sb.append("    inboundHostname: ").append(toIndentedString(inboundHostname)).append("\n");
    sb.append("    listenComponents: ").append(toIndentedString(listenComponents)).append("\n");
    sb.append("    customNarConfigurationCrn: ").append(toIndentedString(customNarConfigurationCrn)).append("\n");
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

