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
import com.cloudera.cdp.dfworkload.model.DeployedFlowStatus;
import com.cloudera.cdp.dfworkload.model.DfxLocalMeta;
import com.cloudera.cdp.dfworkload.model.MetricValue;
import com.cloudera.cdp.dfworkload.model.ProjectMeta;
import java.util.*;

/**
 * Provides details about a deployed flow.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-04-15T08:44:54.268-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class RpcDeployedFlow  {

  /**
   * The status of the deployed flow.
   **/
  private DeployedFlowStatus status = null;

  /**
   * The version of this configuration.
   **/
  private Integer configurationVersion = null;

  /**
   * The id of the process group in NiFi.
   **/
  private String targetProcessGroupId = null;

  /**
   * The name of the deployed flow.
   **/
  private String name = null;

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
   * The id of the environment.
   **/
  private String environmentId = null;

  /**
   * Simple information about the environment of the deployment.
   **/
  private DfxLocalMeta environment = null;

  /**
   * The name of the deployment.
   **/
  private String deploymentName = null;

  /**
   * The CRN of the deployed flow.
   **/
  private String crn = null;

  /**
   * Simple information about the project this deployment belongs to, or null if does not belong to a project.
   **/
  private ProjectMeta project = null;

  /**
   * The name of the flow definition.
   **/
  private String artifactName = null;

  /**
   * The id of the catalog item. Will either be the flow definition id or the id of the imported ready flow.
   **/
  private String catalogItemId = null;

  /**
   * The version of the flow.
   **/
  private Integer flowVersion = null;

  /**
   * The deployed flow definition version CRN.
   **/
  private String flowVersionCrn = null;

  /**
   * The deployed flow definition CRN.
   **/
  private String flowCrn = null;

  /**
   * The CRN of the user who deployed the flow.
   **/
  private String creatorCrn = null;

  /**
   * The type of artifact of the flow definition.
   **/
  private String artifactTypeName = null;

  /**
   * The username of the person who deployed the flow.
   **/
  private String deployedByUsername = null;

  /**
   * The name of the person who deployed the flow.
   **/
  private String deployedByName = null;

  /**
   * Timestamp of the first time the flow deployed into a NiFi cluster.
   **/
  private Long created = null;

  /**
   * Timestamp of the last time the deployed flow was modified.
   **/
  private Long updated = null;

  /**
   * Valid actions that can be applied to the deployed flow in its current state.
   **/
  private List<String> validActions = new ArrayList<String>();

  /**
   * The dataSent values, if requested.
   **/
  private List<MetricValue> dataSent = new ArrayList<MetricValue>();

  /**
   * The dataReceived values, if requested.
   **/
  private List<MetricValue> dataReceived = new ArrayList<MetricValue>();

  /**
   * The crn of the project this flow belongs to, or null if does not belong to a project.
   **/
  private String projectCrn = null;

  /**
   * The crn of the deployment this flow belongs to.
   **/
  private String deploymentCrn = null;

  /**
   * Getter for status.
   * The status of the deployed flow.
   **/
  @JsonProperty("status")
  public DeployedFlowStatus getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The status of the deployed flow.
   **/
  public void setStatus(DeployedFlowStatus status) {
    this.status = status;
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
   * Getter for targetProcessGroupId.
   * The id of the process group in NiFi.
   **/
  @JsonProperty("targetProcessGroupId")
  public String getTargetProcessGroupId() {
    return targetProcessGroupId;
  }

  /**
   * Setter for targetProcessGroupId.
   * The id of the process group in NiFi.
   **/
  public void setTargetProcessGroupId(String targetProcessGroupId) {
    this.targetProcessGroupId = targetProcessGroupId;
  }

  /**
   * Getter for name.
   * The name of the deployed flow.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the deployed flow.
   **/
  public void setName(String name) {
    this.name = name;
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
   * Getter for environmentId.
   * The id of the environment.
   **/
  @JsonProperty("environmentId")
  public String getEnvironmentId() {
    return environmentId;
  }

  /**
   * Setter for environmentId.
   * The id of the environment.
   **/
  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }

  /**
   * Getter for environment.
   * Simple information about the environment of the deployment.
   **/
  @JsonProperty("environment")
  public DfxLocalMeta getEnvironment() {
    return environment;
  }

  /**
   * Setter for environment.
   * Simple information about the environment of the deployment.
   **/
  public void setEnvironment(DfxLocalMeta environment) {
    this.environment = environment;
  }

  /**
   * Getter for deploymentName.
   * The name of the deployment.
   **/
  @JsonProperty("deploymentName")
  public String getDeploymentName() {
    return deploymentName;
  }

  /**
   * Setter for deploymentName.
   * The name of the deployment.
   **/
  public void setDeploymentName(String deploymentName) {
    this.deploymentName = deploymentName;
  }

  /**
   * Getter for crn.
   * The CRN of the deployed flow.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the deployed flow.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
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
   * Getter for artifactName.
   * The name of the flow definition.
   **/
  @JsonProperty("artifactName")
  public String getArtifactName() {
    return artifactName;
  }

  /**
   * Setter for artifactName.
   * The name of the flow definition.
   **/
  public void setArtifactName(String artifactName) {
    this.artifactName = artifactName;
  }

  /**
   * Getter for catalogItemId.
   * The id of the catalog item. Will either be the flow definition id or the id of the imported ready flow.
   **/
  @JsonProperty("catalogItemId")
  public String getCatalogItemId() {
    return catalogItemId;
  }

  /**
   * Setter for catalogItemId.
   * The id of the catalog item. Will either be the flow definition id or the id of the imported ready flow.
   **/
  public void setCatalogItemId(String catalogItemId) {
    this.catalogItemId = catalogItemId;
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
   * The deployed flow definition version CRN.
   **/
  @JsonProperty("flowVersionCrn")
  public String getFlowVersionCrn() {
    return flowVersionCrn;
  }

  /**
   * Setter for flowVersionCrn.
   * The deployed flow definition version CRN.
   **/
  public void setFlowVersionCrn(String flowVersionCrn) {
    this.flowVersionCrn = flowVersionCrn;
  }

  /**
   * Getter for flowCrn.
   * The deployed flow definition CRN.
   **/
  @JsonProperty("flowCrn")
  public String getFlowCrn() {
    return flowCrn;
  }

  /**
   * Setter for flowCrn.
   * The deployed flow definition CRN.
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
   * The type of artifact of the flow definition.
   **/
  @JsonProperty("artifactTypeName")
  public String getArtifactTypeName() {
    return artifactTypeName;
  }

  /**
   * Setter for artifactTypeName.
   * The type of artifact of the flow definition.
   **/
  public void setArtifactTypeName(String artifactTypeName) {
    this.artifactTypeName = artifactTypeName;
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
   * Getter for created.
   * Timestamp of the first time the flow deployed into a NiFi cluster.
   **/
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }

  /**
   * Setter for created.
   * Timestamp of the first time the flow deployed into a NiFi cluster.
   **/
  public void setCreated(Long created) {
    this.created = created;
  }

  /**
   * Getter for updated.
   * Timestamp of the last time the deployed flow was modified.
   **/
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }

  /**
   * Setter for updated.
   * Timestamp of the last time the deployed flow was modified.
   **/
  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  /**
   * Getter for validActions.
   * Valid actions that can be applied to the deployed flow in its current state.
   **/
  @JsonProperty("validActions")
  public List<String> getValidActions() {
    return validActions;
  }

  /**
   * Setter for validActions.
   * Valid actions that can be applied to the deployed flow in its current state.
   **/
  public void setValidActions(List<String> validActions) {
    this.validActions = validActions;
  }

  /**
   * Getter for dataSent.
   * The dataSent values, if requested.
   **/
  @JsonProperty("dataSent")
  public List<MetricValue> getDataSent() {
    return dataSent;
  }

  /**
   * Setter for dataSent.
   * The dataSent values, if requested.
   **/
  public void setDataSent(List<MetricValue> dataSent) {
    this.dataSent = dataSent;
  }

  /**
   * Getter for dataReceived.
   * The dataReceived values, if requested.
   **/
  @JsonProperty("dataReceived")
  public List<MetricValue> getDataReceived() {
    return dataReceived;
  }

  /**
   * Setter for dataReceived.
   * The dataReceived values, if requested.
   **/
  public void setDataReceived(List<MetricValue> dataReceived) {
    this.dataReceived = dataReceived;
  }

  /**
   * Getter for projectCrn.
   * The crn of the project this flow belongs to, or null if does not belong to a project.
   **/
  @JsonProperty("projectCrn")
  public String getProjectCrn() {
    return projectCrn;
  }

  /**
   * Setter for projectCrn.
   * The crn of the project this flow belongs to, or null if does not belong to a project.
   **/
  public void setProjectCrn(String projectCrn) {
    this.projectCrn = projectCrn;
  }

  /**
   * Getter for deploymentCrn.
   * The crn of the deployment this flow belongs to.
   **/
  @JsonProperty("deploymentCrn")
  public String getDeploymentCrn() {
    return deploymentCrn;
  }

  /**
   * Setter for deploymentCrn.
   * The crn of the deployment this flow belongs to.
   **/
  public void setDeploymentCrn(String deploymentCrn) {
    this.deploymentCrn = deploymentCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RpcDeployedFlow rpcDeployedFlow = (RpcDeployedFlow) o;
    if (!Objects.equals(this.status, rpcDeployedFlow.status)) {
      return false;
    }
    if (!Objects.equals(this.configurationVersion, rpcDeployedFlow.configurationVersion)) {
      return false;
    }
    if (!Objects.equals(this.targetProcessGroupId, rpcDeployedFlow.targetProcessGroupId)) {
      return false;
    }
    if (!Objects.equals(this.name, rpcDeployedFlow.name)) {
      return false;
    }
    if (!Objects.equals(this.activeInfoAlertCount, rpcDeployedFlow.activeInfoAlertCount)) {
      return false;
    }
    if (!Objects.equals(this.activeWarningAlertCount, rpcDeployedFlow.activeWarningAlertCount)) {
      return false;
    }
    if (!Objects.equals(this.activeErrorAlertCount, rpcDeployedFlow.activeErrorAlertCount)) {
      return false;
    }
    if (!Objects.equals(this.environmentId, rpcDeployedFlow.environmentId)) {
      return false;
    }
    if (!Objects.equals(this.environment, rpcDeployedFlow.environment)) {
      return false;
    }
    if (!Objects.equals(this.deploymentName, rpcDeployedFlow.deploymentName)) {
      return false;
    }
    if (!Objects.equals(this.crn, rpcDeployedFlow.crn)) {
      return false;
    }
    if (!Objects.equals(this.project, rpcDeployedFlow.project)) {
      return false;
    }
    if (!Objects.equals(this.artifactName, rpcDeployedFlow.artifactName)) {
      return false;
    }
    if (!Objects.equals(this.catalogItemId, rpcDeployedFlow.catalogItemId)) {
      return false;
    }
    if (!Objects.equals(this.flowVersion, rpcDeployedFlow.flowVersion)) {
      return false;
    }
    if (!Objects.equals(this.flowVersionCrn, rpcDeployedFlow.flowVersionCrn)) {
      return false;
    }
    if (!Objects.equals(this.flowCrn, rpcDeployedFlow.flowCrn)) {
      return false;
    }
    if (!Objects.equals(this.creatorCrn, rpcDeployedFlow.creatorCrn)) {
      return false;
    }
    if (!Objects.equals(this.artifactTypeName, rpcDeployedFlow.artifactTypeName)) {
      return false;
    }
    if (!Objects.equals(this.deployedByUsername, rpcDeployedFlow.deployedByUsername)) {
      return false;
    }
    if (!Objects.equals(this.deployedByName, rpcDeployedFlow.deployedByName)) {
      return false;
    }
    if (!Objects.equals(this.created, rpcDeployedFlow.created)) {
      return false;
    }
    if (!Objects.equals(this.updated, rpcDeployedFlow.updated)) {
      return false;
    }
    if (!Objects.equals(this.validActions, rpcDeployedFlow.validActions)) {
      return false;
    }
    if (!Objects.equals(this.dataSent, rpcDeployedFlow.dataSent)) {
      return false;
    }
    if (!Objects.equals(this.dataReceived, rpcDeployedFlow.dataReceived)) {
      return false;
    }
    if (!Objects.equals(this.projectCrn, rpcDeployedFlow.projectCrn)) {
      return false;
    }
    if (!Objects.equals(this.deploymentCrn, rpcDeployedFlow.deploymentCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, configurationVersion, targetProcessGroupId, name, activeInfoAlertCount, activeWarningAlertCount, activeErrorAlertCount, environmentId, environment, deploymentName, crn, project, artifactName, catalogItemId, flowVersion, flowVersionCrn, flowCrn, creatorCrn, artifactTypeName, deployedByUsername, deployedByName, created, updated, validActions, dataSent, dataReceived, projectCrn, deploymentCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RpcDeployedFlow {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
    sb.append("    targetProcessGroupId: ").append(toIndentedString(targetProcessGroupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    activeInfoAlertCount: ").append(toIndentedString(activeInfoAlertCount)).append("\n");
    sb.append("    activeWarningAlertCount: ").append(toIndentedString(activeWarningAlertCount)).append("\n");
    sb.append("    activeErrorAlertCount: ").append(toIndentedString(activeErrorAlertCount)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    deploymentName: ").append(toIndentedString(deploymentName)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    artifactName: ").append(toIndentedString(artifactName)).append("\n");
    sb.append("    catalogItemId: ").append(toIndentedString(catalogItemId)).append("\n");
    sb.append("    flowVersion: ").append(toIndentedString(flowVersion)).append("\n");
    sb.append("    flowVersionCrn: ").append(toIndentedString(flowVersionCrn)).append("\n");
    sb.append("    flowCrn: ").append(toIndentedString(flowCrn)).append("\n");
    sb.append("    creatorCrn: ").append(toIndentedString(creatorCrn)).append("\n");
    sb.append("    artifactTypeName: ").append(toIndentedString(artifactTypeName)).append("\n");
    sb.append("    deployedByUsername: ").append(toIndentedString(deployedByUsername)).append("\n");
    sb.append("    deployedByName: ").append(toIndentedString(deployedByName)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    validActions: ").append(toIndentedString(validActions)).append("\n");
    sb.append("    dataSent: ").append(toIndentedString(dataSent)).append("\n");
    sb.append("    dataReceived: ").append(toIndentedString(dataReceived)).append("\n");
    sb.append("    projectCrn: ").append(toIndentedString(projectCrn)).append("\n");
    sb.append("    deploymentCrn: ").append(toIndentedString(deploymentCrn)).append("\n");
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

