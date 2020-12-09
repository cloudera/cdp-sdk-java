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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.ml.model.HealthInfo;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * A Cloudera Machine Learning workspace which includes the deployed configuration details.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2020-12-09T11:15:13.978-08:00")
public class WorkspaceSummary  {

  /**
   * The name of the workspace.
   **/
  private String instanceName = null;

  /**
   * The name of the workspace's environment.
   **/
  private String environmentName = null;

  /**
   * The workspace's current status.
   **/
  private String instanceStatus = null;

  /**
   * URL of the workspace's user interface.
   **/
  private String instanceUrl = null;

  /**
   * CRN of the environment.
   **/
  private String environmentCrn = null;

  /**
   * The CRN of the workspace.
   **/
  private String crn = null;

  /**
   * The Kubernetes cluster name.
   **/
  private String k8sClusterName = null;

  /**
   * The CRN of the creator of the workspace.
   **/
  private String creatorCrn = null;

  /**
   * The version of Cloudera Machine Learning that was installed on the workspace.
   **/
  private String version = null;

  /**
   * Indicates if HTTPs communication was enabled on this workspace when provisioned.
   **/
  private Boolean httpsEnabled = null;

  /**
   * A filesystem ID referencing the filesystem that was created on the cloud provider environment that this workspace uses.
   **/
  private String filesystemID = null;

  /**
   * The cloud platform of the environment that was used to create this workspace.
   **/
  private String cloudPlatform = null;

  /**
   * If usage monitoring is enabled or not on this workspace.
   **/
  private Boolean monitoringEnabled = null;

  /**
   * The whitelist of ips for loadBalancer.
   **/
  private List<String> loadBalancerIPWhitelists = new ArrayList<String>();

  /**
   * Creation date of workspace.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * Failure message from the most recent failure that has occurred during workspace provisioning.
   **/
  private String failureMessage = null;

  /**
   * The health info information of the workspace.
   **/
  private List<HealthInfo> healthInfoLists = new ArrayList<HealthInfo>();

  /**
   * Getter for instanceName.
   * The name of the workspace.
   **/
  @JsonProperty("instanceName")
  public String getInstanceName() {
    return instanceName;
  }

  /**
   * Setter for instanceName.
   * The name of the workspace.
   **/
  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  /**
   * Getter for environmentName.
   * The name of the workspace&#39;s environment.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The name of the workspace&#39;s environment.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for instanceStatus.
   * The workspace&#39;s current status.
   **/
  @JsonProperty("instanceStatus")
  public String getInstanceStatus() {
    return instanceStatus;
  }

  /**
   * Setter for instanceStatus.
   * The workspace&#39;s current status.
   **/
  public void setInstanceStatus(String instanceStatus) {
    this.instanceStatus = instanceStatus;
  }

  /**
   * Getter for instanceUrl.
   * URL of the workspace&#39;s user interface.
   **/
  @JsonProperty("instanceUrl")
  public String getInstanceUrl() {
    return instanceUrl;
  }

  /**
   * Setter for instanceUrl.
   * URL of the workspace&#39;s user interface.
   **/
  public void setInstanceUrl(String instanceUrl) {
    this.instanceUrl = instanceUrl;
  }

  /**
   * Getter for environmentCrn.
   * CRN of the environment.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * CRN of the environment.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for crn.
   * The CRN of the workspace.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the workspace.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for k8sClusterName.
   * The Kubernetes cluster name.
   **/
  @JsonProperty("k8sClusterName")
  public String getK8sClusterName() {
    return k8sClusterName;
  }

  /**
   * Setter for k8sClusterName.
   * The Kubernetes cluster name.
   **/
  public void setK8sClusterName(String k8sClusterName) {
    this.k8sClusterName = k8sClusterName;
  }

  /**
   * Getter for creatorCrn.
   * The CRN of the creator of the workspace.
   **/
  @JsonProperty("creatorCrn")
  public String getCreatorCrn() {
    return creatorCrn;
  }

  /**
   * Setter for creatorCrn.
   * The CRN of the creator of the workspace.
   **/
  public void setCreatorCrn(String creatorCrn) {
    this.creatorCrn = creatorCrn;
  }

  /**
   * Getter for version.
   * The version of Cloudera Machine Learning that was installed on the workspace.
   **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  /**
   * Setter for version.
   * The version of Cloudera Machine Learning that was installed on the workspace.
   **/
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Getter for httpsEnabled.
   * Indicates if HTTPs communication was enabled on this workspace when provisioned.
   **/
  @JsonProperty("httpsEnabled")
  public Boolean getHttpsEnabled() {
    return httpsEnabled;
  }

  /**
   * Setter for httpsEnabled.
   * Indicates if HTTPs communication was enabled on this workspace when provisioned.
   **/
  public void setHttpsEnabled(Boolean httpsEnabled) {
    this.httpsEnabled = httpsEnabled;
  }

  /**
   * Getter for filesystemID.
   * A filesystem ID referencing the filesystem that was created on the cloud provider environment that this workspace uses.
   **/
  @JsonProperty("filesystemID")
  public String getFilesystemID() {
    return filesystemID;
  }

  /**
   * Setter for filesystemID.
   * A filesystem ID referencing the filesystem that was created on the cloud provider environment that this workspace uses.
   **/
  public void setFilesystemID(String filesystemID) {
    this.filesystemID = filesystemID;
  }

  /**
   * Getter for cloudPlatform.
   * The cloud platform of the environment that was used to create this workspace.
   **/
  @JsonProperty("cloudPlatform")
  public String getCloudPlatform() {
    return cloudPlatform;
  }

  /**
   * Setter for cloudPlatform.
   * The cloud platform of the environment that was used to create this workspace.
   **/
  public void setCloudPlatform(String cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
  }

  /**
   * Getter for monitoringEnabled.
   * If usage monitoring is enabled or not on this workspace.
   **/
  @JsonProperty("monitoringEnabled")
  public Boolean getMonitoringEnabled() {
    return monitoringEnabled;
  }

  /**
   * Setter for monitoringEnabled.
   * If usage monitoring is enabled or not on this workspace.
   **/
  public void setMonitoringEnabled(Boolean monitoringEnabled) {
    this.monitoringEnabled = monitoringEnabled;
  }

  /**
   * Getter for loadBalancerIPWhitelists.
   * The whitelist of ips for loadBalancer.
   **/
  @JsonProperty("loadBalancerIPWhitelists")
  public List<String> getLoadBalancerIPWhitelists() {
    return loadBalancerIPWhitelists;
  }

  /**
   * Setter for loadBalancerIPWhitelists.
   * The whitelist of ips for loadBalancer.
   **/
  public void setLoadBalancerIPWhitelists(List<String> loadBalancerIPWhitelists) {
    this.loadBalancerIPWhitelists = loadBalancerIPWhitelists;
  }

  /**
   * Getter for creationDate.
   * Creation date of workspace.
   **/
  @JsonProperty("creationDate")
  public ZonedDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * Setter for creationDate.
   * Creation date of workspace.
   **/
  public void setCreationDate(ZonedDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Getter for failureMessage.
   * Failure message from the most recent failure that has occurred during workspace provisioning.
   **/
  @JsonProperty("failureMessage")
  public String getFailureMessage() {
    return failureMessage;
  }

  /**
   * Setter for failureMessage.
   * Failure message from the most recent failure that has occurred during workspace provisioning.
   **/
  public void setFailureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
  }

  /**
   * Getter for healthInfoLists.
   * The health info information of the workspace.
   **/
  @JsonProperty("healthInfoLists")
  public List<HealthInfo> getHealthInfoLists() {
    return healthInfoLists;
  }

  /**
   * Setter for healthInfoLists.
   * The health info information of the workspace.
   **/
  public void setHealthInfoLists(List<HealthInfo> healthInfoLists) {
    this.healthInfoLists = healthInfoLists;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceSummary workspaceSummary = (WorkspaceSummary) o;
    if (!Objects.equals(this.instanceName, workspaceSummary.instanceName)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, workspaceSummary.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.instanceStatus, workspaceSummary.instanceStatus)) {
      return false;
    }
    if (!Objects.equals(this.instanceUrl, workspaceSummary.instanceUrl)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, workspaceSummary.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.crn, workspaceSummary.crn)) {
      return false;
    }
    if (!Objects.equals(this.k8sClusterName, workspaceSummary.k8sClusterName)) {
      return false;
    }
    if (!Objects.equals(this.creatorCrn, workspaceSummary.creatorCrn)) {
      return false;
    }
    if (!Objects.equals(this.version, workspaceSummary.version)) {
      return false;
    }
    if (!Objects.equals(this.httpsEnabled, workspaceSummary.httpsEnabled)) {
      return false;
    }
    if (!Objects.equals(this.filesystemID, workspaceSummary.filesystemID)) {
      return false;
    }
    if (!Objects.equals(this.cloudPlatform, workspaceSummary.cloudPlatform)) {
      return false;
    }
    if (!Objects.equals(this.monitoringEnabled, workspaceSummary.monitoringEnabled)) {
      return false;
    }
    if (!Objects.equals(this.loadBalancerIPWhitelists, workspaceSummary.loadBalancerIPWhitelists)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, workspaceSummary.creationDate)) {
      return false;
    }
    if (!Objects.equals(this.failureMessage, workspaceSummary.failureMessage)) {
      return false;
    }
    if (!Objects.equals(this.healthInfoLists, workspaceSummary.healthInfoLists)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceName, environmentName, instanceStatus, instanceUrl, environmentCrn, crn, k8sClusterName, creatorCrn, version, httpsEnabled, filesystemID, cloudPlatform, monitoringEnabled, loadBalancerIPWhitelists, creationDate, failureMessage, healthInfoLists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceSummary {\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
    sb.append("    instanceUrl: ").append(toIndentedString(instanceUrl)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    k8sClusterName: ").append(toIndentedString(k8sClusterName)).append("\n");
    sb.append("    creatorCrn: ").append(toIndentedString(creatorCrn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    httpsEnabled: ").append(toIndentedString(httpsEnabled)).append("\n");
    sb.append("    filesystemID: ").append(toIndentedString(filesystemID)).append("\n");
    sb.append("    cloudPlatform: ").append(toIndentedString(cloudPlatform)).append("\n");
    sb.append("    monitoringEnabled: ").append(toIndentedString(monitoringEnabled)).append("\n");
    sb.append("    loadBalancerIPWhitelists: ").append(toIndentedString(loadBalancerIPWhitelists)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
    sb.append("    healthInfoLists: ").append(toIndentedString(healthInfoLists)).append("\n");
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

