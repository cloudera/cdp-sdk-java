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
import com.cloudera.cdp.dfworkload.model.ClusterSize;
import com.cloudera.cdp.dfworkload.model.FlowParameterGroup;
import com.cloudera.cdp.dfworkload.model.KpiMetaData;
import com.cloudera.cdp.dfworkload.model.NodeStorageProfileMetadata;
import com.cloudera.cdp.dfworkload.model.ServiceMeta;
import java.util.*;

/**
 * Provides details about the deployment and all of the different configuration items that are available.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-23T07:12:42.527-08:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class RpcDeploymentConfigurationMetadata  {

  /**
   * The CRN of the flow to deploy
   **/
  private String flowCrn = null;

  /**
   * The name of the flow to deploy
   **/
  private String flowName = null;

  /**
   * The version of the flow to deploy
   **/
  private Integer flowVersion = null;

  /**
   * The CRN for the flow version
   **/
  private String flowVersionCrn = null;

  /**
   * Simple information about the DataFlow service of the deployment
   **/
  private ServiceMeta service = null;

  /**
   * A flag indicating if the flow requires an Environment specific SSLContextService
   **/
  private Boolean requiresEnvironmentSslContextService = null;

  /**
   * The type of the artifact of the flow.
   **/
  private String artifactTypeName = null;

  /**
   * The list of flow parameter groups
   **/
  private List<FlowParameterGroup> parameterGroups = new ArrayList<FlowParameterGroup>();

  /**
   * The KPI meta data
   **/
  private KpiMetaData kpiMetaData = null;

  /**
   * The options that are available for determining the size of the deployed cluster
   **/
  private List<ClusterSize> clusterSizingOptions = new ArrayList<ClusterSize>();

  /**
   * The list of node storage profiles
   **/
  private List<NodeStorageProfileMetadata> nodeStorageProfileMetadata = new ArrayList<NodeStorageProfileMetadata>();

  /**
   * Getter for flowCrn.
   * The CRN of the flow to deploy
   **/
  @JsonProperty("flowCrn")
  public String getFlowCrn() {
    return flowCrn;
  }

  /**
   * Setter for flowCrn.
   * The CRN of the flow to deploy
   **/
  public void setFlowCrn(String flowCrn) {
    this.flowCrn = flowCrn;
  }

  /**
   * Getter for flowName.
   * The name of the flow to deploy
   **/
  @JsonProperty("flowName")
  public String getFlowName() {
    return flowName;
  }

  /**
   * Setter for flowName.
   * The name of the flow to deploy
   **/
  public void setFlowName(String flowName) {
    this.flowName = flowName;
  }

  /**
   * Getter for flowVersion.
   * The version of the flow to deploy
   **/
  @JsonProperty("flowVersion")
  public Integer getFlowVersion() {
    return flowVersion;
  }

  /**
   * Setter for flowVersion.
   * The version of the flow to deploy
   **/
  public void setFlowVersion(Integer flowVersion) {
    this.flowVersion = flowVersion;
  }

  /**
   * Getter for flowVersionCrn.
   * The CRN for the flow version
   **/
  @JsonProperty("flowVersionCrn")
  public String getFlowVersionCrn() {
    return flowVersionCrn;
  }

  /**
   * Setter for flowVersionCrn.
   * The CRN for the flow version
   **/
  public void setFlowVersionCrn(String flowVersionCrn) {
    this.flowVersionCrn = flowVersionCrn;
  }

  /**
   * Getter for service.
   * Simple information about the DataFlow service of the deployment
   **/
  @JsonProperty("service")
  public ServiceMeta getService() {
    return service;
  }

  /**
   * Setter for service.
   * Simple information about the DataFlow service of the deployment
   **/
  public void setService(ServiceMeta service) {
    this.service = service;
  }

  /**
   * Getter for requiresEnvironmentSslContextService.
   * A flag indicating if the flow requires an Environment specific SSLContextService
   **/
  @JsonProperty("requiresEnvironmentSslContextService")
  public Boolean getRequiresEnvironmentSslContextService() {
    return requiresEnvironmentSslContextService;
  }

  /**
   * Setter for requiresEnvironmentSslContextService.
   * A flag indicating if the flow requires an Environment specific SSLContextService
   **/
  public void setRequiresEnvironmentSslContextService(Boolean requiresEnvironmentSslContextService) {
    this.requiresEnvironmentSslContextService = requiresEnvironmentSslContextService;
  }

  /**
   * Getter for artifactTypeName.
   * The type of the artifact of the flow.
   **/
  @JsonProperty("artifactTypeName")
  public String getArtifactTypeName() {
    return artifactTypeName;
  }

  /**
   * Setter for artifactTypeName.
   * The type of the artifact of the flow.
   **/
  public void setArtifactTypeName(String artifactTypeName) {
    this.artifactTypeName = artifactTypeName;
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
   * Getter for kpiMetaData.
   * The KPI meta data
   **/
  @JsonProperty("kpiMetaData")
  public KpiMetaData getKpiMetaData() {
    return kpiMetaData;
  }

  /**
   * Setter for kpiMetaData.
   * The KPI meta data
   **/
  public void setKpiMetaData(KpiMetaData kpiMetaData) {
    this.kpiMetaData = kpiMetaData;
  }

  /**
   * Getter for clusterSizingOptions.
   * The options that are available for determining the size of the deployed cluster
   **/
  @JsonProperty("clusterSizingOptions")
  public List<ClusterSize> getClusterSizingOptions() {
    return clusterSizingOptions;
  }

  /**
   * Setter for clusterSizingOptions.
   * The options that are available for determining the size of the deployed cluster
   **/
  public void setClusterSizingOptions(List<ClusterSize> clusterSizingOptions) {
    this.clusterSizingOptions = clusterSizingOptions;
  }

  /**
   * Getter for nodeStorageProfileMetadata.
   * The list of node storage profiles
   **/
  @JsonProperty("nodeStorageProfileMetadata")
  public List<NodeStorageProfileMetadata> getNodeStorageProfileMetadata() {
    return nodeStorageProfileMetadata;
  }

  /**
   * Setter for nodeStorageProfileMetadata.
   * The list of node storage profiles
   **/
  public void setNodeStorageProfileMetadata(List<NodeStorageProfileMetadata> nodeStorageProfileMetadata) {
    this.nodeStorageProfileMetadata = nodeStorageProfileMetadata;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RpcDeploymentConfigurationMetadata rpcDeploymentConfigurationMetadata = (RpcDeploymentConfigurationMetadata) o;
    if (!Objects.equals(this.flowCrn, rpcDeploymentConfigurationMetadata.flowCrn)) {
      return false;
    }
    if (!Objects.equals(this.flowName, rpcDeploymentConfigurationMetadata.flowName)) {
      return false;
    }
    if (!Objects.equals(this.flowVersion, rpcDeploymentConfigurationMetadata.flowVersion)) {
      return false;
    }
    if (!Objects.equals(this.flowVersionCrn, rpcDeploymentConfigurationMetadata.flowVersionCrn)) {
      return false;
    }
    if (!Objects.equals(this.service, rpcDeploymentConfigurationMetadata.service)) {
      return false;
    }
    if (!Objects.equals(this.requiresEnvironmentSslContextService, rpcDeploymentConfigurationMetadata.requiresEnvironmentSslContextService)) {
      return false;
    }
    if (!Objects.equals(this.artifactTypeName, rpcDeploymentConfigurationMetadata.artifactTypeName)) {
      return false;
    }
    if (!Objects.equals(this.parameterGroups, rpcDeploymentConfigurationMetadata.parameterGroups)) {
      return false;
    }
    if (!Objects.equals(this.kpiMetaData, rpcDeploymentConfigurationMetadata.kpiMetaData)) {
      return false;
    }
    if (!Objects.equals(this.clusterSizingOptions, rpcDeploymentConfigurationMetadata.clusterSizingOptions)) {
      return false;
    }
    if (!Objects.equals(this.nodeStorageProfileMetadata, rpcDeploymentConfigurationMetadata.nodeStorageProfileMetadata)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowCrn, flowName, flowVersion, flowVersionCrn, service, requiresEnvironmentSslContextService, artifactTypeName, parameterGroups, kpiMetaData, clusterSizingOptions, nodeStorageProfileMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RpcDeploymentConfigurationMetadata {\n");
    sb.append("    flowCrn: ").append(toIndentedString(flowCrn)).append("\n");
    sb.append("    flowName: ").append(toIndentedString(flowName)).append("\n");
    sb.append("    flowVersion: ").append(toIndentedString(flowVersion)).append("\n");
    sb.append("    flowVersionCrn: ").append(toIndentedString(flowVersionCrn)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    requiresEnvironmentSslContextService: ").append(toIndentedString(requiresEnvironmentSslContextService)).append("\n");
    sb.append("    artifactTypeName: ").append(toIndentedString(artifactTypeName)).append("\n");
    sb.append("    parameterGroups: ").append(toIndentedString(parameterGroups)).append("\n");
    sb.append("    kpiMetaData: ").append(toIndentedString(kpiMetaData)).append("\n");
    sb.append("    clusterSizingOptions: ").append(toIndentedString(clusterSizingOptions)).append("\n");
    sb.append("    nodeStorageProfileMetadata: ").append(toIndentedString(nodeStorageProfileMetadata)).append("\n");
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

