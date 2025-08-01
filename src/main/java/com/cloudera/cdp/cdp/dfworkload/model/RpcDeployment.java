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
import com.cloudera.cdp.dfworkload.model.DeploymentStatus;
import com.cloudera.cdp.dfworkload.model.NodeStorage;
import com.cloudera.cdp.dfworkload.model.ProjectMeta;
import com.cloudera.cdp.dfworkload.model.ServiceMeta;
import java.util.*;

/**
 * Provides details about a deployment.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:44.928-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class RpcDeployment  {

  /**
   * The name of the deployment.
   **/
  private String name = null;

  /**
   * The workflow status of the deployment.
   **/
  private DeploymentStatus status = null;

  /**
   * Simple information about the DataFlow service of the deployment.
   **/
  private ServiceMeta service = null;

  /**
   * The CRN of the deployment.
   **/
  private String crn = null;

  /**
   * The runtime status of the deployment.
   **/
  private DeploymentStatus runtimeStatus = null;

  /**
   * Current count of active alerts classified as an info.
   **/
  private Long activeInfoAlertCount = null;

  /**
   * Current count of active alerts classified as a warning.
   **/
  private Long activeWarningAlertCount = null;

  /**
   * Current count of active alerts classified as an error.
   **/
  private Long activeErrorAlertCount = null;

  /**
   * Timestamp of the creation of the deployment.
   **/
  private Long created = null;

  /**
   * Timestamp of the last time the deployment was modified.
   **/
  private Long updated = null;

  /**
   * Valid actions that can be applied to the deployment in its current state.
   **/
  private List<String> validActions = new ArrayList<String>();

  /**
   * Simple information about the project this deployment belongs to, or null if does not belong to a project.
   **/
  private ProjectMeta project = null;

  /**
   * The url to open the deployed flow in NiFi.
   **/
  private String nifiUrl = null;

  /**
   * The initial size of the deployment.
   **/
  private ClusterSize clusterSizeParams = null;

  /**
   * Whether or not autoscaling is enabled for this deployment.
   **/
  private Boolean autoscalingEnabled = null;

  /**
   * Whether or not flow metrics scaling is enabled for this deployment.
   **/
  private Boolean flowMetricsScalingEnabled = null;

  /**
   * The minimum number of nodes that the deployment will allocate; can only be used when autoscalingEnabled is true.
   **/
  private Integer autoscaleMinNodes = null;

  /**
   * The maximum number of nodes that the deployment can scale up to; can only be used when autoscalingEnabled is true.
   **/
  private Integer autoscaleMaxNodes = null;

  /**
   * The static number of nodes of the deployment; can only be used when autoscalingEnabled is false.
   **/
  private Integer staticNodeCount = null;

  /**
   * The name of the flow.
   **/
  private String flowName = null;

  /**
   * The version of the flow.
   **/
  private Integer flowVersion = null;

  /**
   * The deployment's current flow version CRN.
   **/
  private String flowVersionCrn = null;

  /**
   * The deployment's current flow CRN.
   **/
  private String flowCrn = null;

  /**
   * The CRN of the user who deployed the flow.
   **/
  private String creatorCrn = null;

  /**
   * The type of artifact of the flow.
   **/
  private String artifactTypeName = null;

  /**
   * The current node count.
   **/
  private Integer currentNodeCount = null;

  /**
   * The username of the person who deployed the flow.
   **/
  private String deployedByUsername = null;

  /**
   * The name of the person who deployed the flow.
   **/
  private String deployedByName = null;

  /**
   * Base URL to the CDF Local instance running this deployment.
   **/
  private String dfxLocalUrl = null;

  /**
   * The current version of the deployment's configuration.
   **/
  private Integer configurationVersion = null;

  /**
   * The username of the last person to update the deployment.
   **/
  private String lastUpdatedByUsername = null;

  /**
   * The CFM NiFi version associated with the deployment.
   **/
  private String cfmNifiVersion = null;

  /**
   * The ID of Inbound Connection Endpoint assigned to the deployment.
   **/
  private String inboundConnectionEndpointId = null;

  /**
   * Indicates this deployment was created as a test session for designing a flow.
   **/
  private Boolean testSession = null;

  /**
   * The ID of the flow design for a test session deployment.
   **/
  private String flowDesignerId = null;

  /**
   * The identifier of the custom NAR configuration, if used.
   **/
  private String customNarConfigurationId = null;

  /**
   * The identifier of the custom python configuration, if used.
   **/
  private String customPythonConfigurationId = null;

  /**
   * The node storage profile.
   **/
  private String nodeStorageProfile = null;

  /**
   * The node storage data.
   **/
  private NodeStorage nodeStorage = null;

  /**
   * The target process group ID of the deployment.
   **/
  private String targetProcessGroupId = null;

  /**
   * Set of authorized IP ranges for the inbound connections.
   **/
  private List<String> inboundConnectionAuthorizedIpRanges = new ArrayList<String>();

  /**
   * The crn of the project this deployment belongs to, or null if does not belong to a project.
   **/
  private String projectCrn = null;

  /**
   * Getter for name.
   * The name of the deployment.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the deployment.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for status.
   * The workflow status of the deployment.
   **/
  @JsonProperty("status")
  public DeploymentStatus getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The workflow status of the deployment.
   **/
  public void setStatus(DeploymentStatus status) {
    this.status = status;
  }

  /**
   * Getter for service.
   * Simple information about the DataFlow service of the deployment.
   **/
  @JsonProperty("service")
  public ServiceMeta getService() {
    return service;
  }

  /**
   * Setter for service.
   * Simple information about the DataFlow service of the deployment.
   **/
  public void setService(ServiceMeta service) {
    this.service = service;
  }

  /**
   * Getter for crn.
   * The CRN of the deployment.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the deployment.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for runtimeStatus.
   * The runtime status of the deployment.
   **/
  @JsonProperty("runtimeStatus")
  public DeploymentStatus getRuntimeStatus() {
    return runtimeStatus;
  }

  /**
   * Setter for runtimeStatus.
   * The runtime status of the deployment.
   **/
  public void setRuntimeStatus(DeploymentStatus runtimeStatus) {
    this.runtimeStatus = runtimeStatus;
  }

  /**
   * Getter for activeInfoAlertCount.
   * Current count of active alerts classified as an info.
   **/
  @JsonProperty("activeInfoAlertCount")
  public Long getActiveInfoAlertCount() {
    return activeInfoAlertCount;
  }

  /**
   * Setter for activeInfoAlertCount.
   * Current count of active alerts classified as an info.
   **/
  public void setActiveInfoAlertCount(Long activeInfoAlertCount) {
    this.activeInfoAlertCount = activeInfoAlertCount;
  }

  /**
   * Getter for activeWarningAlertCount.
   * Current count of active alerts classified as a warning.
   **/
  @JsonProperty("activeWarningAlertCount")
  public Long getActiveWarningAlertCount() {
    return activeWarningAlertCount;
  }

  /**
   * Setter for activeWarningAlertCount.
   * Current count of active alerts classified as a warning.
   **/
  public void setActiveWarningAlertCount(Long activeWarningAlertCount) {
    this.activeWarningAlertCount = activeWarningAlertCount;
  }

  /**
   * Getter for activeErrorAlertCount.
   * Current count of active alerts classified as an error.
   **/
  @JsonProperty("activeErrorAlertCount")
  public Long getActiveErrorAlertCount() {
    return activeErrorAlertCount;
  }

  /**
   * Setter for activeErrorAlertCount.
   * Current count of active alerts classified as an error.
   **/
  public void setActiveErrorAlertCount(Long activeErrorAlertCount) {
    this.activeErrorAlertCount = activeErrorAlertCount;
  }

  /**
   * Getter for created.
   * Timestamp of the creation of the deployment.
   **/
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }

  /**
   * Setter for created.
   * Timestamp of the creation of the deployment.
   **/
  public void setCreated(Long created) {
    this.created = created;
  }

  /**
   * Getter for updated.
   * Timestamp of the last time the deployment was modified.
   **/
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }

  /**
   * Setter for updated.
   * Timestamp of the last time the deployment was modified.
   **/
  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  /**
   * Getter for validActions.
   * Valid actions that can be applied to the deployment in its current state.
   **/
  @JsonProperty("validActions")
  public List<String> getValidActions() {
    return validActions;
  }

  /**
   * Setter for validActions.
   * Valid actions that can be applied to the deployment in its current state.
   **/
  public void setValidActions(List<String> validActions) {
    this.validActions = validActions;
  }

  /**
   * Getter for project.
   * Simple information about the project this deployment belongs to, or null if does not belong to a project.
   **/
  @JsonProperty("project")
  public ProjectMeta getProject() {
    return project;
  }

  /**
   * Setter for project.
   * Simple information about the project this deployment belongs to, or null if does not belong to a project.
   **/
  public void setProject(ProjectMeta project) {
    this.project = project;
  }

  /**
   * Getter for nifiUrl.
   * The url to open the deployed flow in NiFi.
   **/
  @JsonProperty("nifiUrl")
  public String getNifiUrl() {
    return nifiUrl;
  }

  /**
   * Setter for nifiUrl.
   * The url to open the deployed flow in NiFi.
   **/
  public void setNifiUrl(String nifiUrl) {
    this.nifiUrl = nifiUrl;
  }

  /**
   * Getter for clusterSizeParams.
   * The initial size of the deployment.
   **/
  @JsonProperty("clusterSizeParams")
  public ClusterSize getClusterSizeParams() {
    return clusterSizeParams;
  }

  /**
   * Setter for clusterSizeParams.
   * The initial size of the deployment.
   **/
  public void setClusterSizeParams(ClusterSize clusterSizeParams) {
    this.clusterSizeParams = clusterSizeParams;
  }

  /**
   * Getter for autoscalingEnabled.
   * Whether or not autoscaling is enabled for this deployment.
   **/
  @JsonProperty("autoscalingEnabled")
  public Boolean getAutoscalingEnabled() {
    return autoscalingEnabled;
  }

  /**
   * Setter for autoscalingEnabled.
   * Whether or not autoscaling is enabled for this deployment.
   **/
  public void setAutoscalingEnabled(Boolean autoscalingEnabled) {
    this.autoscalingEnabled = autoscalingEnabled;
  }

  /**
   * Getter for flowMetricsScalingEnabled.
   * Whether or not flow metrics scaling is enabled for this deployment.
   **/
  @JsonProperty("flowMetricsScalingEnabled")
  public Boolean getFlowMetricsScalingEnabled() {
    return flowMetricsScalingEnabled;
  }

  /**
   * Setter for flowMetricsScalingEnabled.
   * Whether or not flow metrics scaling is enabled for this deployment.
   **/
  public void setFlowMetricsScalingEnabled(Boolean flowMetricsScalingEnabled) {
    this.flowMetricsScalingEnabled = flowMetricsScalingEnabled;
  }

  /**
   * Getter for autoscaleMinNodes.
   * The minimum number of nodes that the deployment will allocate; can only be used when autoscalingEnabled is true.
   **/
  @JsonProperty("autoscaleMinNodes")
  public Integer getAutoscaleMinNodes() {
    return autoscaleMinNodes;
  }

  /**
   * Setter for autoscaleMinNodes.
   * The minimum number of nodes that the deployment will allocate; can only be used when autoscalingEnabled is true.
   **/
  public void setAutoscaleMinNodes(Integer autoscaleMinNodes) {
    this.autoscaleMinNodes = autoscaleMinNodes;
  }

  /**
   * Getter for autoscaleMaxNodes.
   * The maximum number of nodes that the deployment can scale up to; can only be used when autoscalingEnabled is true.
   **/
  @JsonProperty("autoscaleMaxNodes")
  public Integer getAutoscaleMaxNodes() {
    return autoscaleMaxNodes;
  }

  /**
   * Setter for autoscaleMaxNodes.
   * The maximum number of nodes that the deployment can scale up to; can only be used when autoscalingEnabled is true.
   **/
  public void setAutoscaleMaxNodes(Integer autoscaleMaxNodes) {
    this.autoscaleMaxNodes = autoscaleMaxNodes;
  }

  /**
   * Getter for staticNodeCount.
   * The static number of nodes of the deployment; can only be used when autoscalingEnabled is false.
   **/
  @JsonProperty("staticNodeCount")
  public Integer getStaticNodeCount() {
    return staticNodeCount;
  }

  /**
   * Setter for staticNodeCount.
   * The static number of nodes of the deployment; can only be used when autoscalingEnabled is false.
   **/
  public void setStaticNodeCount(Integer staticNodeCount) {
    this.staticNodeCount = staticNodeCount;
  }

  /**
   * Getter for flowName.
   * The name of the flow.
   **/
  @JsonProperty("flowName")
  public String getFlowName() {
    return flowName;
  }

  /**
   * Setter for flowName.
   * The name of the flow.
   **/
  public void setFlowName(String flowName) {
    this.flowName = flowName;
  }

  /**
   * Getter for flowVersion.
   * The version of the flow.
   **/
  @JsonProperty("flowVersion")
  public Integer getFlowVersion() {
    return flowVersion;
  }

  /**
   * Setter for flowVersion.
   * The version of the flow.
   **/
  public void setFlowVersion(Integer flowVersion) {
    this.flowVersion = flowVersion;
  }

  /**
   * Getter for flowVersionCrn.
   * The deployment&#39;s current flow version CRN.
   **/
  @JsonProperty("flowVersionCrn")
  public String getFlowVersionCrn() {
    return flowVersionCrn;
  }

  /**
   * Setter for flowVersionCrn.
   * The deployment&#39;s current flow version CRN.
   **/
  public void setFlowVersionCrn(String flowVersionCrn) {
    this.flowVersionCrn = flowVersionCrn;
  }

  /**
   * Getter for flowCrn.
   * The deployment&#39;s current flow CRN.
   **/
  @JsonProperty("flowCrn")
  public String getFlowCrn() {
    return flowCrn;
  }

  /**
   * Setter for flowCrn.
   * The deployment&#39;s current flow CRN.
   **/
  public void setFlowCrn(String flowCrn) {
    this.flowCrn = flowCrn;
  }

  /**
   * Getter for creatorCrn.
   * The CRN of the user who deployed the flow.
   **/
  @JsonProperty("creatorCrn")
  public String getCreatorCrn() {
    return creatorCrn;
  }

  /**
   * Setter for creatorCrn.
   * The CRN of the user who deployed the flow.
   **/
  public void setCreatorCrn(String creatorCrn) {
    this.creatorCrn = creatorCrn;
  }

  /**
   * Getter for artifactTypeName.
   * The type of artifact of the flow.
   **/
  @JsonProperty("artifactTypeName")
  public String getArtifactTypeName() {
    return artifactTypeName;
  }

  /**
   * Setter for artifactTypeName.
   * The type of artifact of the flow.
   **/
  public void setArtifactTypeName(String artifactTypeName) {
    this.artifactTypeName = artifactTypeName;
  }

  /**
   * Getter for currentNodeCount.
   * The current node count.
   **/
  @JsonProperty("currentNodeCount")
  public Integer getCurrentNodeCount() {
    return currentNodeCount;
  }

  /**
   * Setter for currentNodeCount.
   * The current node count.
   **/
  public void setCurrentNodeCount(Integer currentNodeCount) {
    this.currentNodeCount = currentNodeCount;
  }

  /**
   * Getter for deployedByUsername.
   * The username of the person who deployed the flow.
   **/
  @JsonProperty("deployedByUsername")
  public String getDeployedByUsername() {
    return deployedByUsername;
  }

  /**
   * Setter for deployedByUsername.
   * The username of the person who deployed the flow.
   **/
  public void setDeployedByUsername(String deployedByUsername) {
    this.deployedByUsername = deployedByUsername;
  }

  /**
   * Getter for deployedByName.
   * The name of the person who deployed the flow.
   **/
  @JsonProperty("deployedByName")
  public String getDeployedByName() {
    return deployedByName;
  }

  /**
   * Setter for deployedByName.
   * The name of the person who deployed the flow.
   **/
  public void setDeployedByName(String deployedByName) {
    this.deployedByName = deployedByName;
  }

  /**
   * Getter for dfxLocalUrl.
   * Base URL to the CDF Local instance running this deployment.
   **/
  @JsonProperty("dfxLocalUrl")
  public String getDfxLocalUrl() {
    return dfxLocalUrl;
  }

  /**
   * Setter for dfxLocalUrl.
   * Base URL to the CDF Local instance running this deployment.
   **/
  public void setDfxLocalUrl(String dfxLocalUrl) {
    this.dfxLocalUrl = dfxLocalUrl;
  }

  /**
   * Getter for configurationVersion.
   * The current version of the deployment&#39;s configuration.
   **/
  @JsonProperty("configurationVersion")
  public Integer getConfigurationVersion() {
    return configurationVersion;
  }

  /**
   * Setter for configurationVersion.
   * The current version of the deployment&#39;s configuration.
   **/
  public void setConfigurationVersion(Integer configurationVersion) {
    this.configurationVersion = configurationVersion;
  }

  /**
   * Getter for lastUpdatedByUsername.
   * The username of the last person to update the deployment.
   **/
  @JsonProperty("lastUpdatedByUsername")
  public String getLastUpdatedByUsername() {
    return lastUpdatedByUsername;
  }

  /**
   * Setter for lastUpdatedByUsername.
   * The username of the last person to update the deployment.
   **/
  public void setLastUpdatedByUsername(String lastUpdatedByUsername) {
    this.lastUpdatedByUsername = lastUpdatedByUsername;
  }

  /**
   * Getter for cfmNifiVersion.
   * The CFM NiFi version associated with the deployment.
   **/
  @JsonProperty("cfmNifiVersion")
  public String getCfmNifiVersion() {
    return cfmNifiVersion;
  }

  /**
   * Setter for cfmNifiVersion.
   * The CFM NiFi version associated with the deployment.
   **/
  public void setCfmNifiVersion(String cfmNifiVersion) {
    this.cfmNifiVersion = cfmNifiVersion;
  }

  /**
   * Getter for inboundConnectionEndpointId.
   * The ID of Inbound Connection Endpoint assigned to the deployment.
   **/
  @JsonProperty("inboundConnectionEndpointId")
  public String getInboundConnectionEndpointId() {
    return inboundConnectionEndpointId;
  }

  /**
   * Setter for inboundConnectionEndpointId.
   * The ID of Inbound Connection Endpoint assigned to the deployment.
   **/
  public void setInboundConnectionEndpointId(String inboundConnectionEndpointId) {
    this.inboundConnectionEndpointId = inboundConnectionEndpointId;
  }

  /**
   * Getter for testSession.
   * Indicates this deployment was created as a test session for designing a flow.
   **/
  @JsonProperty("testSession")
  public Boolean getTestSession() {
    return testSession;
  }

  /**
   * Setter for testSession.
   * Indicates this deployment was created as a test session for designing a flow.
   **/
  public void setTestSession(Boolean testSession) {
    this.testSession = testSession;
  }

  /**
   * Getter for flowDesignerId.
   * The ID of the flow design for a test session deployment.
   **/
  @JsonProperty("flowDesignerId")
  public String getFlowDesignerId() {
    return flowDesignerId;
  }

  /**
   * Setter for flowDesignerId.
   * The ID of the flow design for a test session deployment.
   **/
  public void setFlowDesignerId(String flowDesignerId) {
    this.flowDesignerId = flowDesignerId;
  }

  /**
   * Getter for customNarConfigurationId.
   * The identifier of the custom NAR configuration, if used.
   **/
  @JsonProperty("customNarConfigurationId")
  public String getCustomNarConfigurationId() {
    return customNarConfigurationId;
  }

  /**
   * Setter for customNarConfigurationId.
   * The identifier of the custom NAR configuration, if used.
   **/
  public void setCustomNarConfigurationId(String customNarConfigurationId) {
    this.customNarConfigurationId = customNarConfigurationId;
  }

  /**
   * Getter for customPythonConfigurationId.
   * The identifier of the custom python configuration, if used.
   **/
  @JsonProperty("customPythonConfigurationId")
  public String getCustomPythonConfigurationId() {
    return customPythonConfigurationId;
  }

  /**
   * Setter for customPythonConfigurationId.
   * The identifier of the custom python configuration, if used.
   **/
  public void setCustomPythonConfigurationId(String customPythonConfigurationId) {
    this.customPythonConfigurationId = customPythonConfigurationId;
  }

  /**
   * Getter for nodeStorageProfile.
   * The node storage profile.
   **/
  @JsonProperty("nodeStorageProfile")
  public String getNodeStorageProfile() {
    return nodeStorageProfile;
  }

  /**
   * Setter for nodeStorageProfile.
   * The node storage profile.
   **/
  public void setNodeStorageProfile(String nodeStorageProfile) {
    this.nodeStorageProfile = nodeStorageProfile;
  }

  /**
   * Getter for nodeStorage.
   * The node storage data.
   **/
  @JsonProperty("nodeStorage")
  public NodeStorage getNodeStorage() {
    return nodeStorage;
  }

  /**
   * Setter for nodeStorage.
   * The node storage data.
   **/
  public void setNodeStorage(NodeStorage nodeStorage) {
    this.nodeStorage = nodeStorage;
  }

  /**
   * Getter for targetProcessGroupId.
   * The target process group ID of the deployment.
   **/
  @JsonProperty("targetProcessGroupId")
  public String getTargetProcessGroupId() {
    return targetProcessGroupId;
  }

  /**
   * Setter for targetProcessGroupId.
   * The target process group ID of the deployment.
   **/
  public void setTargetProcessGroupId(String targetProcessGroupId) {
    this.targetProcessGroupId = targetProcessGroupId;
  }

  /**
   * Getter for inboundConnectionAuthorizedIpRanges.
   * Set of authorized IP ranges for the inbound connections.
   **/
  @JsonProperty("inboundConnectionAuthorizedIpRanges")
  public List<String> getInboundConnectionAuthorizedIpRanges() {
    return inboundConnectionAuthorizedIpRanges;
  }

  /**
   * Setter for inboundConnectionAuthorizedIpRanges.
   * Set of authorized IP ranges for the inbound connections.
   **/
  public void setInboundConnectionAuthorizedIpRanges(List<String> inboundConnectionAuthorizedIpRanges) {
    this.inboundConnectionAuthorizedIpRanges = inboundConnectionAuthorizedIpRanges;
  }

  /**
   * Getter for projectCrn.
   * The crn of the project this deployment belongs to, or null if does not belong to a project.
   **/
  @JsonProperty("projectCrn")
  public String getProjectCrn() {
    return projectCrn;
  }

  /**
   * Setter for projectCrn.
   * The crn of the project this deployment belongs to, or null if does not belong to a project.
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
    RpcDeployment rpcDeployment = (RpcDeployment) o;
    if (!Objects.equals(this.name, rpcDeployment.name)) {
      return false;
    }
    if (!Objects.equals(this.status, rpcDeployment.status)) {
      return false;
    }
    if (!Objects.equals(this.service, rpcDeployment.service)) {
      return false;
    }
    if (!Objects.equals(this.crn, rpcDeployment.crn)) {
      return false;
    }
    if (!Objects.equals(this.runtimeStatus, rpcDeployment.runtimeStatus)) {
      return false;
    }
    if (!Objects.equals(this.activeInfoAlertCount, rpcDeployment.activeInfoAlertCount)) {
      return false;
    }
    if (!Objects.equals(this.activeWarningAlertCount, rpcDeployment.activeWarningAlertCount)) {
      return false;
    }
    if (!Objects.equals(this.activeErrorAlertCount, rpcDeployment.activeErrorAlertCount)) {
      return false;
    }
    if (!Objects.equals(this.created, rpcDeployment.created)) {
      return false;
    }
    if (!Objects.equals(this.updated, rpcDeployment.updated)) {
      return false;
    }
    if (!Objects.equals(this.validActions, rpcDeployment.validActions)) {
      return false;
    }
    if (!Objects.equals(this.project, rpcDeployment.project)) {
      return false;
    }
    if (!Objects.equals(this.nifiUrl, rpcDeployment.nifiUrl)) {
      return false;
    }
    if (!Objects.equals(this.clusterSizeParams, rpcDeployment.clusterSizeParams)) {
      return false;
    }
    if (!Objects.equals(this.autoscalingEnabled, rpcDeployment.autoscalingEnabled)) {
      return false;
    }
    if (!Objects.equals(this.flowMetricsScalingEnabled, rpcDeployment.flowMetricsScalingEnabled)) {
      return false;
    }
    if (!Objects.equals(this.autoscaleMinNodes, rpcDeployment.autoscaleMinNodes)) {
      return false;
    }
    if (!Objects.equals(this.autoscaleMaxNodes, rpcDeployment.autoscaleMaxNodes)) {
      return false;
    }
    if (!Objects.equals(this.staticNodeCount, rpcDeployment.staticNodeCount)) {
      return false;
    }
    if (!Objects.equals(this.flowName, rpcDeployment.flowName)) {
      return false;
    }
    if (!Objects.equals(this.flowVersion, rpcDeployment.flowVersion)) {
      return false;
    }
    if (!Objects.equals(this.flowVersionCrn, rpcDeployment.flowVersionCrn)) {
      return false;
    }
    if (!Objects.equals(this.flowCrn, rpcDeployment.flowCrn)) {
      return false;
    }
    if (!Objects.equals(this.creatorCrn, rpcDeployment.creatorCrn)) {
      return false;
    }
    if (!Objects.equals(this.artifactTypeName, rpcDeployment.artifactTypeName)) {
      return false;
    }
    if (!Objects.equals(this.currentNodeCount, rpcDeployment.currentNodeCount)) {
      return false;
    }
    if (!Objects.equals(this.deployedByUsername, rpcDeployment.deployedByUsername)) {
      return false;
    }
    if (!Objects.equals(this.deployedByName, rpcDeployment.deployedByName)) {
      return false;
    }
    if (!Objects.equals(this.dfxLocalUrl, rpcDeployment.dfxLocalUrl)) {
      return false;
    }
    if (!Objects.equals(this.configurationVersion, rpcDeployment.configurationVersion)) {
      return false;
    }
    if (!Objects.equals(this.lastUpdatedByUsername, rpcDeployment.lastUpdatedByUsername)) {
      return false;
    }
    if (!Objects.equals(this.cfmNifiVersion, rpcDeployment.cfmNifiVersion)) {
      return false;
    }
    if (!Objects.equals(this.inboundConnectionEndpointId, rpcDeployment.inboundConnectionEndpointId)) {
      return false;
    }
    if (!Objects.equals(this.testSession, rpcDeployment.testSession)) {
      return false;
    }
    if (!Objects.equals(this.flowDesignerId, rpcDeployment.flowDesignerId)) {
      return false;
    }
    if (!Objects.equals(this.customNarConfigurationId, rpcDeployment.customNarConfigurationId)) {
      return false;
    }
    if (!Objects.equals(this.customPythonConfigurationId, rpcDeployment.customPythonConfigurationId)) {
      return false;
    }
    if (!Objects.equals(this.nodeStorageProfile, rpcDeployment.nodeStorageProfile)) {
      return false;
    }
    if (!Objects.equals(this.nodeStorage, rpcDeployment.nodeStorage)) {
      return false;
    }
    if (!Objects.equals(this.targetProcessGroupId, rpcDeployment.targetProcessGroupId)) {
      return false;
    }
    if (!Objects.equals(this.inboundConnectionAuthorizedIpRanges, rpcDeployment.inboundConnectionAuthorizedIpRanges)) {
      return false;
    }
    if (!Objects.equals(this.projectCrn, rpcDeployment.projectCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, service, crn, runtimeStatus, activeInfoAlertCount, activeWarningAlertCount, activeErrorAlertCount, created, updated, validActions, project, nifiUrl, clusterSizeParams, autoscalingEnabled, flowMetricsScalingEnabled, autoscaleMinNodes, autoscaleMaxNodes, staticNodeCount, flowName, flowVersion, flowVersionCrn, flowCrn, creatorCrn, artifactTypeName, currentNodeCount, deployedByUsername, deployedByName, dfxLocalUrl, configurationVersion, lastUpdatedByUsername, cfmNifiVersion, inboundConnectionEndpointId, testSession, flowDesignerId, customNarConfigurationId, customPythonConfigurationId, nodeStorageProfile, nodeStorage, targetProcessGroupId, inboundConnectionAuthorizedIpRanges, projectCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RpcDeployment {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    runtimeStatus: ").append(toIndentedString(runtimeStatus)).append("\n");
    sb.append("    activeInfoAlertCount: ").append(toIndentedString(activeInfoAlertCount)).append("\n");
    sb.append("    activeWarningAlertCount: ").append(toIndentedString(activeWarningAlertCount)).append("\n");
    sb.append("    activeErrorAlertCount: ").append(toIndentedString(activeErrorAlertCount)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    validActions: ").append(toIndentedString(validActions)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    nifiUrl: ").append(toIndentedString(nifiUrl)).append("\n");
    sb.append("    clusterSizeParams: ").append(toIndentedString(clusterSizeParams)).append("\n");
    sb.append("    autoscalingEnabled: ").append(toIndentedString(autoscalingEnabled)).append("\n");
    sb.append("    flowMetricsScalingEnabled: ").append(toIndentedString(flowMetricsScalingEnabled)).append("\n");
    sb.append("    autoscaleMinNodes: ").append(toIndentedString(autoscaleMinNodes)).append("\n");
    sb.append("    autoscaleMaxNodes: ").append(toIndentedString(autoscaleMaxNodes)).append("\n");
    sb.append("    staticNodeCount: ").append(toIndentedString(staticNodeCount)).append("\n");
    sb.append("    flowName: ").append(toIndentedString(flowName)).append("\n");
    sb.append("    flowVersion: ").append(toIndentedString(flowVersion)).append("\n");
    sb.append("    flowVersionCrn: ").append(toIndentedString(flowVersionCrn)).append("\n");
    sb.append("    flowCrn: ").append(toIndentedString(flowCrn)).append("\n");
    sb.append("    creatorCrn: ").append(toIndentedString(creatorCrn)).append("\n");
    sb.append("    artifactTypeName: ").append(toIndentedString(artifactTypeName)).append("\n");
    sb.append("    currentNodeCount: ").append(toIndentedString(currentNodeCount)).append("\n");
    sb.append("    deployedByUsername: ").append(toIndentedString(deployedByUsername)).append("\n");
    sb.append("    deployedByName: ").append(toIndentedString(deployedByName)).append("\n");
    sb.append("    dfxLocalUrl: ").append(toIndentedString(dfxLocalUrl)).append("\n");
    sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
    sb.append("    lastUpdatedByUsername: ").append(toIndentedString(lastUpdatedByUsername)).append("\n");
    sb.append("    cfmNifiVersion: ").append(toIndentedString(cfmNifiVersion)).append("\n");
    sb.append("    inboundConnectionEndpointId: ").append(toIndentedString(inboundConnectionEndpointId)).append("\n");
    sb.append("    testSession: ").append(toIndentedString(testSession)).append("\n");
    sb.append("    flowDesignerId: ").append(toIndentedString(flowDesignerId)).append("\n");
    sb.append("    customNarConfigurationId: ").append(toIndentedString(customNarConfigurationId)).append("\n");
    sb.append("    customPythonConfigurationId: ").append(toIndentedString(customPythonConfigurationId)).append("\n");
    sb.append("    nodeStorageProfile: ").append(toIndentedString(nodeStorageProfile)).append("\n");
    sb.append("    nodeStorage: ").append(toIndentedString(nodeStorage)).append("\n");
    sb.append("    targetProcessGroupId: ").append(toIndentedString(targetProcessGroupId)).append("\n");
    sb.append("    inboundConnectionAuthorizedIpRanges: ").append(toIndentedString(inboundConnectionAuthorizedIpRanges)).append("\n");
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

