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
import com.cloudera.cdp.df.model.ServiceStatus;
import java.util.*;

/**
 * The summary of the DF Service enabled in a CDP Environment
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-16T07:43:45.562-07:00")
public class ServiceSummary  {

  /**
   * The service CRN.
   **/
  private String crn = null;

  /**
   * The CDP Environment CRN
   **/
  private String environmentCrn = null;

  /**
   * The service name.
   **/
  private String name = null;

  /**
   * The cloud platform of the service.
   **/
  private String cloudPlatform = null;

  /**
   * The region of the service.
   **/
  private String region = null;

  /**
   * The deployment count.
   **/
  private Integer deploymentCount = null;

  /**
   * The maximum number of kubernetes nodes that service may scale up under high-demand situations
   **/
  private Integer maxK8sNodeCount = null;

  /**
   * The DataFlow status of the service.
   **/
  private ServiceStatus status = null;

  /**
   * The workload version of the service.
   **/
  private String workloadVersion = null;

  /**
   * The upgrade deployments NiFi version flag value of the service.
   **/
  private Boolean upgradeDeploymentsNiFiVersion = null;

  /**
   * The number of kubernetes nodes currently running for this service.
   **/
  private Integer runningK8sNodeCount = null;

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
   * Cluster id of the service, if enabled
   **/
  private String clusterId = null;

  /**
   * The instance type of the kubernetes nodes currently in use by DataFlow for this service.
   **/
  private String instanceType = null;

  /**
   * Valid actions that can be applied based on the current state of the service
   **/
  private List<String> validActions = new ArrayList<String>();

  /**
   * The name of the proxy that is configured for the CDP environment
   **/
  private String proxyName = null;

  /**
   * Getter for crn.
   * The service CRN.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The service CRN.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for environmentCrn.
   * The CDP Environment CRN
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CDP Environment CRN
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for name.
   * The service name.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The service name.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for cloudPlatform.
   * The cloud platform of the service.
   **/
  @JsonProperty("cloudPlatform")
  public String getCloudPlatform() {
    return cloudPlatform;
  }

  /**
   * Setter for cloudPlatform.
   * The cloud platform of the service.
   **/
  public void setCloudPlatform(String cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
  }

  /**
   * Getter for region.
   * The region of the service.
   **/
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  /**
   * Setter for region.
   * The region of the service.
   **/
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Getter for deploymentCount.
   * The deployment count.
   **/
  @JsonProperty("deploymentCount")
  public Integer getDeploymentCount() {
    return deploymentCount;
  }

  /**
   * Setter for deploymentCount.
   * The deployment count.
   **/
  public void setDeploymentCount(Integer deploymentCount) {
    this.deploymentCount = deploymentCount;
  }

  /**
   * Getter for maxK8sNodeCount.
   * The maximum number of kubernetes nodes that service may scale up under high-demand situations
   **/
  @JsonProperty("maxK8sNodeCount")
  public Integer getMaxK8sNodeCount() {
    return maxK8sNodeCount;
  }

  /**
   * Setter for maxK8sNodeCount.
   * The maximum number of kubernetes nodes that service may scale up under high-demand situations
   **/
  public void setMaxK8sNodeCount(Integer maxK8sNodeCount) {
    this.maxK8sNodeCount = maxK8sNodeCount;
  }

  /**
   * Getter for status.
   * The DataFlow status of the service.
   **/
  @JsonProperty("status")
  public ServiceStatus getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The DataFlow status of the service.
   **/
  public void setStatus(ServiceStatus status) {
    this.status = status;
  }

  /**
   * Getter for workloadVersion.
   * The workload version of the service.
   **/
  @JsonProperty("workloadVersion")
  public String getWorkloadVersion() {
    return workloadVersion;
  }

  /**
   * Setter for workloadVersion.
   * The workload version of the service.
   **/
  public void setWorkloadVersion(String workloadVersion) {
    this.workloadVersion = workloadVersion;
  }

  /**
   * Getter for upgradeDeploymentsNiFiVersion.
   * The upgrade deployments NiFi version flag value of the service.
   **/
  @JsonProperty("upgradeDeploymentsNiFiVersion")
  public Boolean getUpgradeDeploymentsNiFiVersion() {
    return upgradeDeploymentsNiFiVersion;
  }

  /**
   * Setter for upgradeDeploymentsNiFiVersion.
   * The upgrade deployments NiFi version flag value of the service.
   **/
  public void setUpgradeDeploymentsNiFiVersion(Boolean upgradeDeploymentsNiFiVersion) {
    this.upgradeDeploymentsNiFiVersion = upgradeDeploymentsNiFiVersion;
  }

  /**
   * Getter for runningK8sNodeCount.
   * The number of kubernetes nodes currently running for this service.
   **/
  @JsonProperty("runningK8sNodeCount")
  public Integer getRunningK8sNodeCount() {
    return runningK8sNodeCount;
  }

  /**
   * Setter for runningK8sNodeCount.
   * The number of kubernetes nodes currently running for this service.
   **/
  public void setRunningK8sNodeCount(Integer runningK8sNodeCount) {
    this.runningK8sNodeCount = runningK8sNodeCount;
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
   * Getter for clusterId.
   * Cluster id of the service, if enabled
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * Cluster id of the service, if enabled
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for instanceType.
   * The instance type of the kubernetes nodes currently in use by DataFlow for this service.
   **/
  @JsonProperty("instanceType")
  public String getInstanceType() {
    return instanceType;
  }

  /**
   * Setter for instanceType.
   * The instance type of the kubernetes nodes currently in use by DataFlow for this service.
   **/
  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  /**
   * Getter for validActions.
   * Valid actions that can be applied based on the current state of the service
   **/
  @JsonProperty("validActions")
  public List<String> getValidActions() {
    return validActions;
  }

  /**
   * Setter for validActions.
   * Valid actions that can be applied based on the current state of the service
   **/
  public void setValidActions(List<String> validActions) {
    this.validActions = validActions;
  }

  /**
   * Getter for proxyName.
   * The name of the proxy that is configured for the CDP environment
   **/
  @JsonProperty("proxyName")
  public String getProxyName() {
    return proxyName;
  }

  /**
   * Setter for proxyName.
   * The name of the proxy that is configured for the CDP environment
   **/
  public void setProxyName(String proxyName) {
    this.proxyName = proxyName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceSummary serviceSummary = (ServiceSummary) o;
    if (!Objects.equals(this.crn, serviceSummary.crn)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, serviceSummary.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.name, serviceSummary.name)) {
      return false;
    }
    if (!Objects.equals(this.cloudPlatform, serviceSummary.cloudPlatform)) {
      return false;
    }
    if (!Objects.equals(this.region, serviceSummary.region)) {
      return false;
    }
    if (!Objects.equals(this.deploymentCount, serviceSummary.deploymentCount)) {
      return false;
    }
    if (!Objects.equals(this.maxK8sNodeCount, serviceSummary.maxK8sNodeCount)) {
      return false;
    }
    if (!Objects.equals(this.status, serviceSummary.status)) {
      return false;
    }
    if (!Objects.equals(this.workloadVersion, serviceSummary.workloadVersion)) {
      return false;
    }
    if (!Objects.equals(this.upgradeDeploymentsNiFiVersion, serviceSummary.upgradeDeploymentsNiFiVersion)) {
      return false;
    }
    if (!Objects.equals(this.runningK8sNodeCount, serviceSummary.runningK8sNodeCount)) {
      return false;
    }
    if (!Objects.equals(this.activeInfoAlertCount, serviceSummary.activeInfoAlertCount)) {
      return false;
    }
    if (!Objects.equals(this.activeWarningAlertCount, serviceSummary.activeWarningAlertCount)) {
      return false;
    }
    if (!Objects.equals(this.activeErrorAlertCount, serviceSummary.activeErrorAlertCount)) {
      return false;
    }
    if (!Objects.equals(this.clusterId, serviceSummary.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.instanceType, serviceSummary.instanceType)) {
      return false;
    }
    if (!Objects.equals(this.validActions, serviceSummary.validActions)) {
      return false;
    }
    if (!Objects.equals(this.proxyName, serviceSummary.proxyName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, environmentCrn, name, cloudPlatform, region, deploymentCount, maxK8sNodeCount, status, workloadVersion, upgradeDeploymentsNiFiVersion, runningK8sNodeCount, activeInfoAlertCount, activeWarningAlertCount, activeErrorAlertCount, clusterId, instanceType, validActions, proxyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSummary {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cloudPlatform: ").append(toIndentedString(cloudPlatform)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    deploymentCount: ").append(toIndentedString(deploymentCount)).append("\n");
    sb.append("    maxK8sNodeCount: ").append(toIndentedString(maxK8sNodeCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    workloadVersion: ").append(toIndentedString(workloadVersion)).append("\n");
    sb.append("    upgradeDeploymentsNiFiVersion: ").append(toIndentedString(upgradeDeploymentsNiFiVersion)).append("\n");
    sb.append("    runningK8sNodeCount: ").append(toIndentedString(runningK8sNodeCount)).append("\n");
    sb.append("    activeInfoAlertCount: ").append(toIndentedString(activeInfoAlertCount)).append("\n");
    sb.append("    activeWarningAlertCount: ").append(toIndentedString(activeWarningAlertCount)).append("\n");
    sb.append("    activeErrorAlertCount: ").append(toIndentedString(activeErrorAlertCount)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    validActions: ").append(toIndentedString(validActions)).append("\n");
    sb.append("    proxyName: ").append(toIndentedString(proxyName)).append("\n");
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

