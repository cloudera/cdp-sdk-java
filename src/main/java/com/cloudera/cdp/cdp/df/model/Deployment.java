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

package com.cloudera.cdp.df.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.df.model.DeploymentStatus;
import com.cloudera.cdp.df.model.ServiceMeta;

/**
 * A deployment
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-06-10T11:26:36.502-07:00")
public class Deployment  {

  /**
   * The deployment CRN
   **/
  private String crn = null;

  /**
   * The deployment name
   **/
  private String name = null;

  /**
   * The deployment status
   **/
  private DeploymentStatus status = null;

  /**
   * The DataFlow service information of the deployment
   **/
  private ServiceMeta service = null;

  /**
   * Timestamp of the last time the deployment was modified
   **/
  private Long updated = null;

  /**
   * The initial size of the deployment
   **/
  private String clusterSize = null;

  /**
   * The deployment's current flow version CRN
   **/
  private String flowVersionCrn = null;

  /**
   * The deployment's current flow CRN
   **/
  private String flowCrn = null;

  /**
   * The url to open the deployed flow in NiFi
   **/
  private String nifiUrl = null;

  /**
   * The maximum number of nodes that the deployment can scale up to, or null if autoscaling is not enabled for this deployment
   **/
  private Integer autoscaleMaxNodes = null;

  /**
   * The name of the flow
   **/
  private String flowName = null;

  /**
   * The version of the flow
   **/
  private Integer flowVersion = null;

  /**
   * The current node count
   **/
  private Integer currentNodeCount = null;

  /**
   * The actor CRN of the person who deployed the flow
   **/
  private String deployedByCrn = null;

  /**
   * The name of the person who deployed the flow
   **/
  private String deployedByName = null;

  /**
   * Whether or not to autoscale the deployment.
   **/
  private Boolean autoscalingEnabled = null;

  /**
   * The minimum number of nodes that the deployment will allocate. May only be specified when autoscalingEnabled is true.
   **/
  private Integer autoscaleMinNodes = null;

  /**
   * Current count of active alerts classified as an info
   **/
  private Long activeInfoAlertCount = null;

  /**
   * Current count of active alerts classified as a warning
   **/
  private Long activeWarningAlertCount = null;

  /**
   * Current count of active alerts classified as an error
   **/
  private Long activeErrorAlertCount = null;

  /**
   * The static number of nodes that the deployment will allocate. May only be specified when autoscalingEnabled is false.
   **/
  private Integer staticNodeCount = null;

  /**
   * Base URL to the dfx-local instance running this deployment
   **/
  private String dfxLocalUrl = null;

  /**
   * The name of the person who last updated the deployment
   **/
  private String lastUpdatedByName = null;

  /**
   * The version of the configuration for this deployment
   **/
  private Long configurationVersion = null;

  /**
   * Getter for crn.
   * The deployment CRN
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The deployment CRN
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for name.
   * The deployment name
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The deployment name
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for status.
   * The deployment status
   **/
  @JsonProperty("status")
  public DeploymentStatus getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The deployment status
   **/
  public void setStatus(DeploymentStatus status) {
    this.status = status;
  }

  /**
   * Getter for service.
   * The DataFlow service information of the deployment
   **/
  @JsonProperty("service")
  public ServiceMeta getService() {
    return service;
  }

  /**
   * Setter for service.
   * The DataFlow service information of the deployment
   **/
  public void setService(ServiceMeta service) {
    this.service = service;
  }

  /**
   * Getter for updated.
   * Timestamp of the last time the deployment was modified
   **/
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }

  /**
   * Setter for updated.
   * Timestamp of the last time the deployment was modified
   **/
  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  /**
   * Getter for clusterSize.
   * The initial size of the deployment
   **/
  @JsonProperty("clusterSize")
  public String getClusterSize() {
    return clusterSize;
  }

  /**
   * Setter for clusterSize.
   * The initial size of the deployment
   **/
  public void setClusterSize(String clusterSize) {
    this.clusterSize = clusterSize;
  }

  /**
   * Getter for flowVersionCrn.
   * The deployment&#39;s current flow version CRN
   **/
  @JsonProperty("flowVersionCrn")
  public String getFlowVersionCrn() {
    return flowVersionCrn;
  }

  /**
   * Setter for flowVersionCrn.
   * The deployment&#39;s current flow version CRN
   **/
  public void setFlowVersionCrn(String flowVersionCrn) {
    this.flowVersionCrn = flowVersionCrn;
  }

  /**
   * Getter for flowCrn.
   * The deployment&#39;s current flow CRN
   **/
  @JsonProperty("flowCrn")
  public String getFlowCrn() {
    return flowCrn;
  }

  /**
   * Setter for flowCrn.
   * The deployment&#39;s current flow CRN
   **/
  public void setFlowCrn(String flowCrn) {
    this.flowCrn = flowCrn;
  }

  /**
   * Getter for nifiUrl.
   * The url to open the deployed flow in NiFi
   **/
  @JsonProperty("nifiUrl")
  public String getNifiUrl() {
    return nifiUrl;
  }

  /**
   * Setter for nifiUrl.
   * The url to open the deployed flow in NiFi
   **/
  public void setNifiUrl(String nifiUrl) {
    this.nifiUrl = nifiUrl;
  }

  /**
   * Getter for autoscaleMaxNodes.
   * The maximum number of nodes that the deployment can scale up to, or null if autoscaling is not enabled for this deployment
   **/
  @JsonProperty("autoscaleMaxNodes")
  public Integer getAutoscaleMaxNodes() {
    return autoscaleMaxNodes;
  }

  /**
   * Setter for autoscaleMaxNodes.
   * The maximum number of nodes that the deployment can scale up to, or null if autoscaling is not enabled for this deployment
   **/
  public void setAutoscaleMaxNodes(Integer autoscaleMaxNodes) {
    this.autoscaleMaxNodes = autoscaleMaxNodes;
  }

  /**
   * Getter for flowName.
   * The name of the flow
   **/
  @JsonProperty("flowName")
  public String getFlowName() {
    return flowName;
  }

  /**
   * Setter for flowName.
   * The name of the flow
   **/
  public void setFlowName(String flowName) {
    this.flowName = flowName;
  }

  /**
   * Getter for flowVersion.
   * The version of the flow
   **/
  @JsonProperty("flowVersion")
  public Integer getFlowVersion() {
    return flowVersion;
  }

  /**
   * Setter for flowVersion.
   * The version of the flow
   **/
  public void setFlowVersion(Integer flowVersion) {
    this.flowVersion = flowVersion;
  }

  /**
   * Getter for currentNodeCount.
   * The current node count
   **/
  @JsonProperty("currentNodeCount")
  public Integer getCurrentNodeCount() {
    return currentNodeCount;
  }

  /**
   * Setter for currentNodeCount.
   * The current node count
   **/
  public void setCurrentNodeCount(Integer currentNodeCount) {
    this.currentNodeCount = currentNodeCount;
  }

  /**
   * Getter for deployedByCrn.
   * The actor CRN of the person who deployed the flow
   **/
  @JsonProperty("deployedByCrn")
  public String getDeployedByCrn() {
    return deployedByCrn;
  }

  /**
   * Setter for deployedByCrn.
   * The actor CRN of the person who deployed the flow
   **/
  public void setDeployedByCrn(String deployedByCrn) {
    this.deployedByCrn = deployedByCrn;
  }

  /**
   * Getter for deployedByName.
   * The name of the person who deployed the flow
   **/
  @JsonProperty("deployedByName")
  public String getDeployedByName() {
    return deployedByName;
  }

  /**
   * Setter for deployedByName.
   * The name of the person who deployed the flow
   **/
  public void setDeployedByName(String deployedByName) {
    this.deployedByName = deployedByName;
  }

  /**
   * Getter for autoscalingEnabled.
   * Whether or not to autoscale the deployment.
   **/
  @JsonProperty("autoscalingEnabled")
  public Boolean getAutoscalingEnabled() {
    return autoscalingEnabled;
  }

  /**
   * Setter for autoscalingEnabled.
   * Whether or not to autoscale the deployment.
   **/
  public void setAutoscalingEnabled(Boolean autoscalingEnabled) {
    this.autoscalingEnabled = autoscalingEnabled;
  }

  /**
   * Getter for autoscaleMinNodes.
   * The minimum number of nodes that the deployment will allocate. May only be specified when autoscalingEnabled is true.
   **/
  @JsonProperty("autoscaleMinNodes")
  public Integer getAutoscaleMinNodes() {
    return autoscaleMinNodes;
  }

  /**
   * Setter for autoscaleMinNodes.
   * The minimum number of nodes that the deployment will allocate. May only be specified when autoscalingEnabled is true.
   **/
  public void setAutoscaleMinNodes(Integer autoscaleMinNodes) {
    this.autoscaleMinNodes = autoscaleMinNodes;
  }

  /**
   * Getter for activeInfoAlertCount.
   * Current count of active alerts classified as an info
   **/
  @JsonProperty("activeInfoAlertCount")
  public Long getActiveInfoAlertCount() {
    return activeInfoAlertCount;
  }

  /**
   * Setter for activeInfoAlertCount.
   * Current count of active alerts classified as an info
   **/
  public void setActiveInfoAlertCount(Long activeInfoAlertCount) {
    this.activeInfoAlertCount = activeInfoAlertCount;
  }

  /**
   * Getter for activeWarningAlertCount.
   * Current count of active alerts classified as a warning
   **/
  @JsonProperty("activeWarningAlertCount")
  public Long getActiveWarningAlertCount() {
    return activeWarningAlertCount;
  }

  /**
   * Setter for activeWarningAlertCount.
   * Current count of active alerts classified as a warning
   **/
  public void setActiveWarningAlertCount(Long activeWarningAlertCount) {
    this.activeWarningAlertCount = activeWarningAlertCount;
  }

  /**
   * Getter for activeErrorAlertCount.
   * Current count of active alerts classified as an error
   **/
  @JsonProperty("activeErrorAlertCount")
  public Long getActiveErrorAlertCount() {
    return activeErrorAlertCount;
  }

  /**
   * Setter for activeErrorAlertCount.
   * Current count of active alerts classified as an error
   **/
  public void setActiveErrorAlertCount(Long activeErrorAlertCount) {
    this.activeErrorAlertCount = activeErrorAlertCount;
  }

  /**
   * Getter for staticNodeCount.
   * The static number of nodes that the deployment will allocate. May only be specified when autoscalingEnabled is false.
   **/
  @JsonProperty("staticNodeCount")
  public Integer getStaticNodeCount() {
    return staticNodeCount;
  }

  /**
   * Setter for staticNodeCount.
   * The static number of nodes that the deployment will allocate. May only be specified when autoscalingEnabled is false.
   **/
  public void setStaticNodeCount(Integer staticNodeCount) {
    this.staticNodeCount = staticNodeCount;
  }

  /**
   * Getter for dfxLocalUrl.
   * Base URL to the dfx-local instance running this deployment
   **/
  @JsonProperty("dfxLocalUrl")
  public String getDfxLocalUrl() {
    return dfxLocalUrl;
  }

  /**
   * Setter for dfxLocalUrl.
   * Base URL to the dfx-local instance running this deployment
   **/
  public void setDfxLocalUrl(String dfxLocalUrl) {
    this.dfxLocalUrl = dfxLocalUrl;
  }

  /**
   * Getter for lastUpdatedByName.
   * The name of the person who last updated the deployment
   **/
  @JsonProperty("lastUpdatedByName")
  public String getLastUpdatedByName() {
    return lastUpdatedByName;
  }

  /**
   * Setter for lastUpdatedByName.
   * The name of the person who last updated the deployment
   **/
  public void setLastUpdatedByName(String lastUpdatedByName) {
    this.lastUpdatedByName = lastUpdatedByName;
  }

  /**
   * Getter for configurationVersion.
   * The version of the configuration for this deployment
   **/
  @JsonProperty("configurationVersion")
  public Long getConfigurationVersion() {
    return configurationVersion;
  }

  /**
   * Setter for configurationVersion.
   * The version of the configuration for this deployment
   **/
  public void setConfigurationVersion(Long configurationVersion) {
    this.configurationVersion = configurationVersion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deployment deployment = (Deployment) o;
    if (!Objects.equals(this.crn, deployment.crn)) {
      return false;
    }
    if (!Objects.equals(this.name, deployment.name)) {
      return false;
    }
    if (!Objects.equals(this.status, deployment.status)) {
      return false;
    }
    if (!Objects.equals(this.service, deployment.service)) {
      return false;
    }
    if (!Objects.equals(this.updated, deployment.updated)) {
      return false;
    }
    if (!Objects.equals(this.clusterSize, deployment.clusterSize)) {
      return false;
    }
    if (!Objects.equals(this.flowVersionCrn, deployment.flowVersionCrn)) {
      return false;
    }
    if (!Objects.equals(this.flowCrn, deployment.flowCrn)) {
      return false;
    }
    if (!Objects.equals(this.nifiUrl, deployment.nifiUrl)) {
      return false;
    }
    if (!Objects.equals(this.autoscaleMaxNodes, deployment.autoscaleMaxNodes)) {
      return false;
    }
    if (!Objects.equals(this.flowName, deployment.flowName)) {
      return false;
    }
    if (!Objects.equals(this.flowVersion, deployment.flowVersion)) {
      return false;
    }
    if (!Objects.equals(this.currentNodeCount, deployment.currentNodeCount)) {
      return false;
    }
    if (!Objects.equals(this.deployedByCrn, deployment.deployedByCrn)) {
      return false;
    }
    if (!Objects.equals(this.deployedByName, deployment.deployedByName)) {
      return false;
    }
    if (!Objects.equals(this.autoscalingEnabled, deployment.autoscalingEnabled)) {
      return false;
    }
    if (!Objects.equals(this.autoscaleMinNodes, deployment.autoscaleMinNodes)) {
      return false;
    }
    if (!Objects.equals(this.activeInfoAlertCount, deployment.activeInfoAlertCount)) {
      return false;
    }
    if (!Objects.equals(this.activeWarningAlertCount, deployment.activeWarningAlertCount)) {
      return false;
    }
    if (!Objects.equals(this.activeErrorAlertCount, deployment.activeErrorAlertCount)) {
      return false;
    }
    if (!Objects.equals(this.staticNodeCount, deployment.staticNodeCount)) {
      return false;
    }
    if (!Objects.equals(this.dfxLocalUrl, deployment.dfxLocalUrl)) {
      return false;
    }
    if (!Objects.equals(this.lastUpdatedByName, deployment.lastUpdatedByName)) {
      return false;
    }
    if (!Objects.equals(this.configurationVersion, deployment.configurationVersion)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, name, status, service, updated, clusterSize, flowVersionCrn, flowCrn, nifiUrl, autoscaleMaxNodes, flowName, flowVersion, currentNodeCount, deployedByCrn, deployedByName, autoscalingEnabled, autoscaleMinNodes, activeInfoAlertCount, activeWarningAlertCount, activeErrorAlertCount, staticNodeCount, dfxLocalUrl, lastUpdatedByName, configurationVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deployment {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    clusterSize: ").append(toIndentedString(clusterSize)).append("\n");
    sb.append("    flowVersionCrn: ").append(toIndentedString(flowVersionCrn)).append("\n");
    sb.append("    flowCrn: ").append(toIndentedString(flowCrn)).append("\n");
    sb.append("    nifiUrl: ").append(toIndentedString(nifiUrl)).append("\n");
    sb.append("    autoscaleMaxNodes: ").append(toIndentedString(autoscaleMaxNodes)).append("\n");
    sb.append("    flowName: ").append(toIndentedString(flowName)).append("\n");
    sb.append("    flowVersion: ").append(toIndentedString(flowVersion)).append("\n");
    sb.append("    currentNodeCount: ").append(toIndentedString(currentNodeCount)).append("\n");
    sb.append("    deployedByCrn: ").append(toIndentedString(deployedByCrn)).append("\n");
    sb.append("    deployedByName: ").append(toIndentedString(deployedByName)).append("\n");
    sb.append("    autoscalingEnabled: ").append(toIndentedString(autoscalingEnabled)).append("\n");
    sb.append("    autoscaleMinNodes: ").append(toIndentedString(autoscaleMinNodes)).append("\n");
    sb.append("    activeInfoAlertCount: ").append(toIndentedString(activeInfoAlertCount)).append("\n");
    sb.append("    activeWarningAlertCount: ").append(toIndentedString(activeWarningAlertCount)).append("\n");
    sb.append("    activeErrorAlertCount: ").append(toIndentedString(activeErrorAlertCount)).append("\n");
    sb.append("    staticNodeCount: ").append(toIndentedString(staticNodeCount)).append("\n");
    sb.append("    dfxLocalUrl: ").append(toIndentedString(dfxLocalUrl)).append("\n");
    sb.append("    lastUpdatedByName: ").append(toIndentedString(lastUpdatedByName)).append("\n");
    sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
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

