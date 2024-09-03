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
import com.cloudera.cdp.dfworkload.model.ListenComponent;
import java.util.*;

/**
 * Contains the configuration data imported from exported archive.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-09-03T11:22:10.944-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class RpcImportedDeploymentConfiguration  {

  /**
   * The auto-scaling flag value retrieved from archive.
   **/
  private Boolean autoScalingEnabled = null;

  /**
   * The flow-metrics flag value retrieved from archive.
   **/
  private Boolean flowMetricsScalingEnabled = null;

  /**
   * The cluster's minimum number of nodes value retrieved from archive.
   **/
  private Integer autoScaleMinNodes = null;

  /**
   * The cluster's maximum number of nodes value retrieved from archive.
   **/
  private Integer autoScaleMaxNodes = null;

  /**
   * The cluster's static node count retrieved from archive.
   **/
  private Integer staticNodeCount = null;

  /**
   * The cluster size name retrieved from archive. Deprecated, use clusterSize.name instead.
   **/
  private String clusterSizeName = null;

  /**
   * The deployment t-shirt size.
   **/
  private BasicClusterSize clusterSize = null;

  /**
   * The list of configured KPIs imported from archive.
   **/
  private List<ConfiguredKpi> kpis = new ArrayList<ConfiguredKpi>();

  /**
   * The flow parameter groups with values imported from archive.
   **/
  private List<FlowParameterGroup> flowParameterGroups = new ArrayList<FlowParameterGroup>();

  /**
   * The CFM NiFi version retrieved from archive.
   **/
  private String cfmNifiVersion = null;

  /**
   * The FQDN of inbound hostname constructed with prefix imported from archive.
   **/
  private String inboundHostName = null;

  /**
   * The concatenated list of Nifi listen components imported from archive and flow.
   **/
  private List<ListenComponent> listenComponents = new ArrayList<ListenComponent>();

  /**
   * The node storage profile imported from archive.
   **/
  private String nodeStorageProfile = null;

  /**
   * The project CRN retrieved from backup.
   **/
  private String projectCrn = null;

  /**
   * The CRN of the custom NAR configuration.
   **/
  private String customNarConfigurationCrn = null;

  /**
   * The CRN of the custom Python configuration.
   **/
  private String customPythonConfigurationCrn = null;

  /**
   * Getter for autoScalingEnabled.
   * The auto-scaling flag value retrieved from archive.
   **/
  @JsonProperty("autoScalingEnabled")
  public Boolean getAutoScalingEnabled() {
    return autoScalingEnabled;
  }

  /**
   * Setter for autoScalingEnabled.
   * The auto-scaling flag value retrieved from archive.
   **/
  public void setAutoScalingEnabled(Boolean autoScalingEnabled) {
    this.autoScalingEnabled = autoScalingEnabled;
  }

  /**
   * Getter for flowMetricsScalingEnabled.
   * The flow-metrics flag value retrieved from archive.
   **/
  @JsonProperty("flowMetricsScalingEnabled")
  public Boolean getFlowMetricsScalingEnabled() {
    return flowMetricsScalingEnabled;
  }

  /**
   * Setter for flowMetricsScalingEnabled.
   * The flow-metrics flag value retrieved from archive.
   **/
  public void setFlowMetricsScalingEnabled(Boolean flowMetricsScalingEnabled) {
    this.flowMetricsScalingEnabled = flowMetricsScalingEnabled;
  }

  /**
   * Getter for autoScaleMinNodes.
   * The cluster&#39;s minimum number of nodes value retrieved from archive.
   **/
  @JsonProperty("autoScaleMinNodes")
  public Integer getAutoScaleMinNodes() {
    return autoScaleMinNodes;
  }

  /**
   * Setter for autoScaleMinNodes.
   * The cluster&#39;s minimum number of nodes value retrieved from archive.
   **/
  public void setAutoScaleMinNodes(Integer autoScaleMinNodes) {
    this.autoScaleMinNodes = autoScaleMinNodes;
  }

  /**
   * Getter for autoScaleMaxNodes.
   * The cluster&#39;s maximum number of nodes value retrieved from archive.
   **/
  @JsonProperty("autoScaleMaxNodes")
  public Integer getAutoScaleMaxNodes() {
    return autoScaleMaxNodes;
  }

  /**
   * Setter for autoScaleMaxNodes.
   * The cluster&#39;s maximum number of nodes value retrieved from archive.
   **/
  public void setAutoScaleMaxNodes(Integer autoScaleMaxNodes) {
    this.autoScaleMaxNodes = autoScaleMaxNodes;
  }

  /**
   * Getter for staticNodeCount.
   * The cluster&#39;s static node count retrieved from archive.
   **/
  @JsonProperty("staticNodeCount")
  public Integer getStaticNodeCount() {
    return staticNodeCount;
  }

  /**
   * Setter for staticNodeCount.
   * The cluster&#39;s static node count retrieved from archive.
   **/
  public void setStaticNodeCount(Integer staticNodeCount) {
    this.staticNodeCount = staticNodeCount;
  }

  /**
   * Getter for clusterSizeName.
   * The cluster size name retrieved from archive. Deprecated, use clusterSize.name instead.
   **/
  @Deprecated
  @JsonProperty("clusterSizeName")
  public String getClusterSizeName() {
    return clusterSizeName;
  }

  /**
   * Setter for clusterSizeName.
   * The cluster size name retrieved from archive. Deprecated, use clusterSize.name instead.
   **/
  @Deprecated
  public void setClusterSizeName(String clusterSizeName) {
    this.clusterSizeName = clusterSizeName;
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
   * Getter for kpis.
   * The list of configured KPIs imported from archive.
   **/
  @JsonProperty("kpis")
  public List<ConfiguredKpi> getKpis() {
    return kpis;
  }

  /**
   * Setter for kpis.
   * The list of configured KPIs imported from archive.
   **/
  public void setKpis(List<ConfiguredKpi> kpis) {
    this.kpis = kpis;
  }

  /**
   * Getter for flowParameterGroups.
   * The flow parameter groups with values imported from archive.
   **/
  @JsonProperty("flowParameterGroups")
  public List<FlowParameterGroup> getFlowParameterGroups() {
    return flowParameterGroups;
  }

  /**
   * Setter for flowParameterGroups.
   * The flow parameter groups with values imported from archive.
   **/
  public void setFlowParameterGroups(List<FlowParameterGroup> flowParameterGroups) {
    this.flowParameterGroups = flowParameterGroups;
  }

  /**
   * Getter for cfmNifiVersion.
   * The CFM NiFi version retrieved from archive.
   **/
  @JsonProperty("cfmNifiVersion")
  public String getCfmNifiVersion() {
    return cfmNifiVersion;
  }

  /**
   * Setter for cfmNifiVersion.
   * The CFM NiFi version retrieved from archive.
   **/
  public void setCfmNifiVersion(String cfmNifiVersion) {
    this.cfmNifiVersion = cfmNifiVersion;
  }

  /**
   * Getter for inboundHostName.
   * The FQDN of inbound hostname constructed with prefix imported from archive.
   **/
  @JsonProperty("inboundHostName")
  public String getInboundHostName() {
    return inboundHostName;
  }

  /**
   * Setter for inboundHostName.
   * The FQDN of inbound hostname constructed with prefix imported from archive.
   **/
  public void setInboundHostName(String inboundHostName) {
    this.inboundHostName = inboundHostName;
  }

  /**
   * Getter for listenComponents.
   * The concatenated list of Nifi listen components imported from archive and flow.
   **/
  @JsonProperty("listenComponents")
  public List<ListenComponent> getListenComponents() {
    return listenComponents;
  }

  /**
   * Setter for listenComponents.
   * The concatenated list of Nifi listen components imported from archive and flow.
   **/
  public void setListenComponents(List<ListenComponent> listenComponents) {
    this.listenComponents = listenComponents;
  }

  /**
   * Getter for nodeStorageProfile.
   * The node storage profile imported from archive.
   **/
  @JsonProperty("nodeStorageProfile")
  public String getNodeStorageProfile() {
    return nodeStorageProfile;
  }

  /**
   * Setter for nodeStorageProfile.
   * The node storage profile imported from archive.
   **/
  public void setNodeStorageProfile(String nodeStorageProfile) {
    this.nodeStorageProfile = nodeStorageProfile;
  }

  /**
   * Getter for projectCrn.
   * The project CRN retrieved from backup.
   **/
  @JsonProperty("projectCrn")
  public String getProjectCrn() {
    return projectCrn;
  }

  /**
   * Setter for projectCrn.
   * The project CRN retrieved from backup.
   **/
  public void setProjectCrn(String projectCrn) {
    this.projectCrn = projectCrn;
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

  /**
   * Getter for customPythonConfigurationCrn.
   * The CRN of the custom Python configuration.
   **/
  @JsonProperty("customPythonConfigurationCrn")
  public String getCustomPythonConfigurationCrn() {
    return customPythonConfigurationCrn;
  }

  /**
   * Setter for customPythonConfigurationCrn.
   * The CRN of the custom Python configuration.
   **/
  public void setCustomPythonConfigurationCrn(String customPythonConfigurationCrn) {
    this.customPythonConfigurationCrn = customPythonConfigurationCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RpcImportedDeploymentConfiguration rpcImportedDeploymentConfiguration = (RpcImportedDeploymentConfiguration) o;
    if (!Objects.equals(this.autoScalingEnabled, rpcImportedDeploymentConfiguration.autoScalingEnabled)) {
      return false;
    }
    if (!Objects.equals(this.flowMetricsScalingEnabled, rpcImportedDeploymentConfiguration.flowMetricsScalingEnabled)) {
      return false;
    }
    if (!Objects.equals(this.autoScaleMinNodes, rpcImportedDeploymentConfiguration.autoScaleMinNodes)) {
      return false;
    }
    if (!Objects.equals(this.autoScaleMaxNodes, rpcImportedDeploymentConfiguration.autoScaleMaxNodes)) {
      return false;
    }
    if (!Objects.equals(this.staticNodeCount, rpcImportedDeploymentConfiguration.staticNodeCount)) {
      return false;
    }
    if (!Objects.equals(this.clusterSizeName, rpcImportedDeploymentConfiguration.clusterSizeName)) {
      return false;
    }
    if (!Objects.equals(this.clusterSize, rpcImportedDeploymentConfiguration.clusterSize)) {
      return false;
    }
    if (!Objects.equals(this.kpis, rpcImportedDeploymentConfiguration.kpis)) {
      return false;
    }
    if (!Objects.equals(this.flowParameterGroups, rpcImportedDeploymentConfiguration.flowParameterGroups)) {
      return false;
    }
    if (!Objects.equals(this.cfmNifiVersion, rpcImportedDeploymentConfiguration.cfmNifiVersion)) {
      return false;
    }
    if (!Objects.equals(this.inboundHostName, rpcImportedDeploymentConfiguration.inboundHostName)) {
      return false;
    }
    if (!Objects.equals(this.listenComponents, rpcImportedDeploymentConfiguration.listenComponents)) {
      return false;
    }
    if (!Objects.equals(this.nodeStorageProfile, rpcImportedDeploymentConfiguration.nodeStorageProfile)) {
      return false;
    }
    if (!Objects.equals(this.projectCrn, rpcImportedDeploymentConfiguration.projectCrn)) {
      return false;
    }
    if (!Objects.equals(this.customNarConfigurationCrn, rpcImportedDeploymentConfiguration.customNarConfigurationCrn)) {
      return false;
    }
    if (!Objects.equals(this.customPythonConfigurationCrn, rpcImportedDeploymentConfiguration.customPythonConfigurationCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoScalingEnabled, flowMetricsScalingEnabled, autoScaleMinNodes, autoScaleMaxNodes, staticNodeCount, clusterSizeName, clusterSize, kpis, flowParameterGroups, cfmNifiVersion, inboundHostName, listenComponents, nodeStorageProfile, projectCrn, customNarConfigurationCrn, customPythonConfigurationCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RpcImportedDeploymentConfiguration {\n");
    sb.append("    autoScalingEnabled: ").append(toIndentedString(autoScalingEnabled)).append("\n");
    sb.append("    flowMetricsScalingEnabled: ").append(toIndentedString(flowMetricsScalingEnabled)).append("\n");
    sb.append("    autoScaleMinNodes: ").append(toIndentedString(autoScaleMinNodes)).append("\n");
    sb.append("    autoScaleMaxNodes: ").append(toIndentedString(autoScaleMaxNodes)).append("\n");
    sb.append("    staticNodeCount: ").append(toIndentedString(staticNodeCount)).append("\n");
    sb.append("    clusterSizeName: ").append(toIndentedString(clusterSizeName)).append("\n");
    sb.append("    clusterSize: ").append(toIndentedString(clusterSize)).append("\n");
    sb.append("    kpis: ").append(toIndentedString(kpis)).append("\n");
    sb.append("    flowParameterGroups: ").append(toIndentedString(flowParameterGroups)).append("\n");
    sb.append("    cfmNifiVersion: ").append(toIndentedString(cfmNifiVersion)).append("\n");
    sb.append("    inboundHostName: ").append(toIndentedString(inboundHostName)).append("\n");
    sb.append("    listenComponents: ").append(toIndentedString(listenComponents)).append("\n");
    sb.append("    nodeStorageProfile: ").append(toIndentedString(nodeStorageProfile)).append("\n");
    sb.append("    projectCrn: ").append(toIndentedString(projectCrn)).append("\n");
    sb.append("    customNarConfigurationCrn: ").append(toIndentedString(customNarConfigurationCrn)).append("\n");
    sb.append("    customPythonConfigurationCrn: ").append(toIndentedString(customPythonConfigurationCrn)).append("\n");
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

