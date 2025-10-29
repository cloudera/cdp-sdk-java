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
import com.cloudera.cdp.ml.model.BackupMetadata;
import com.cloudera.cdp.ml.model.HealthInfo;
import com.cloudera.cdp.ml.model.UpgradeState;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * A Cloudera AI workbench which includes the deployed configuration details.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-28T14:00:27.700-07:00")
public class WorkspaceSummary  {

  /**
   * The name of the workbench.
   **/
  private String instanceName = null;

  /**
   * The name of the workbench's environment.
   **/
  private String environmentName = null;

  /**
   * The workbench's current status.
   **/
  private String instanceStatus = null;

  /**
   * URL of the workbench's user interface.
   **/
  private String instanceUrl = null;

  /**
   * CRN of the environment.
   **/
  private String environmentCrn = null;

  /**
   * The CRN of the workbench.
   **/
  private String crn = null;

  /**
   * The Kubernetes cluster name.
   **/
  private String k8sClusterName = null;

  /**
   * The CRN of the creator of the workbench.
   **/
  private String creatorCrn = null;

  /**
   * The version of Cloudera AI that was installed on the workbench.
   **/
  private String version = null;

  /**
   * Indicates if HTTPs communication was enabled on this workbench when provisioned.
   **/
  private Boolean httpsEnabled = null;

  /**
   * A filesystem ID referencing the filesystem that was created on the cloud provider environment that this workbench uses.
   **/
  private String filesystemID = null;

  /**
   * The cloud platform of the environment that was used to create this workbench.
   **/
  private String cloudPlatform = null;

  /**
   * If usage monitoring is enabled or not on this workbench.
   **/
  private Boolean monitoringEnabled = null;

  /**
   * The whitelist of IPs for load balancer.
   **/
  private List<String> loadBalancerIPWhitelists = new ArrayList<String>();

  /**
   * Creation date of workbench.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * Failure message from the most recent failure that has occurred during workbench provisioning.
   **/
  private String failureMessage = null;

  /**
   * The health info information of the workbench.
   **/
  private List<HealthInfo> healthInfoLists = new ArrayList<HealthInfo>();

  /**
   * The upgrade state contains the workbench upgrade information.
   **/
  private UpgradeState upgradeState = null;

  /**
   * NFS Version of the filesystem.
   **/
  private String nfsVersion = null;

  /**
   * The Backup Metadata for the workbench.
   **/
  private BackupMetadata backupMetadata = null;

  /**
   * The Cluster ID for the workbench.
   **/
  private String clusterID = null;

  /**
   * The value to indicate if the cluster is private or not.
   **/
  private Boolean isPrivate = null;

  /**
   * The value to indicate if the workbench is restored one or not
   **/
  private Boolean isRestored = null;

  /**
   * Getter for instanceName.
   * The name of the workbench.
   **/
  @JsonProperty("instanceName")
  public String getInstanceName() {
    return instanceName;
  }

  /**
   * Setter for instanceName.
   * The name of the workbench.
   **/
  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  /**
   * Getter for environmentName.
   * The name of the workbench&#39;s environment.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The name of the workbench&#39;s environment.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for instanceStatus.
   * The workbench&#39;s current status.
   **/
  @JsonProperty("instanceStatus")
  public String getInstanceStatus() {
    return instanceStatus;
  }

  /**
   * Setter for instanceStatus.
   * The workbench&#39;s current status.
   **/
  public void setInstanceStatus(String instanceStatus) {
    this.instanceStatus = instanceStatus;
  }

  /**
   * Getter for instanceUrl.
   * URL of the workbench&#39;s user interface.
   **/
  @JsonProperty("instanceUrl")
  public String getInstanceUrl() {
    return instanceUrl;
  }

  /**
   * Setter for instanceUrl.
   * URL of the workbench&#39;s user interface.
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
   * The CRN of the workbench.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the workbench.
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
   * The CRN of the creator of the workbench.
   **/
  @JsonProperty("creatorCrn")
  public String getCreatorCrn() {
    return creatorCrn;
  }

  /**
   * Setter for creatorCrn.
   * The CRN of the creator of the workbench.
   **/
  public void setCreatorCrn(String creatorCrn) {
    this.creatorCrn = creatorCrn;
  }

  /**
   * Getter for version.
   * The version of Cloudera AI that was installed on the workbench.
   **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  /**
   * Setter for version.
   * The version of Cloudera AI that was installed on the workbench.
   **/
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Getter for httpsEnabled.
   * Indicates if HTTPs communication was enabled on this workbench when provisioned.
   **/
  @JsonProperty("httpsEnabled")
  public Boolean getHttpsEnabled() {
    return httpsEnabled;
  }

  /**
   * Setter for httpsEnabled.
   * Indicates if HTTPs communication was enabled on this workbench when provisioned.
   **/
  public void setHttpsEnabled(Boolean httpsEnabled) {
    this.httpsEnabled = httpsEnabled;
  }

  /**
   * Getter for filesystemID.
   * A filesystem ID referencing the filesystem that was created on the cloud provider environment that this workbench uses.
   **/
  @JsonProperty("filesystemID")
  public String getFilesystemID() {
    return filesystemID;
  }

  /**
   * Setter for filesystemID.
   * A filesystem ID referencing the filesystem that was created on the cloud provider environment that this workbench uses.
   **/
  public void setFilesystemID(String filesystemID) {
    this.filesystemID = filesystemID;
  }

  /**
   * Getter for cloudPlatform.
   * The cloud platform of the environment that was used to create this workbench.
   **/
  @JsonProperty("cloudPlatform")
  public String getCloudPlatform() {
    return cloudPlatform;
  }

  /**
   * Setter for cloudPlatform.
   * The cloud platform of the environment that was used to create this workbench.
   **/
  public void setCloudPlatform(String cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
  }

  /**
   * Getter for monitoringEnabled.
   * If usage monitoring is enabled or not on this workbench.
   **/
  @JsonProperty("monitoringEnabled")
  public Boolean getMonitoringEnabled() {
    return monitoringEnabled;
  }

  /**
   * Setter for monitoringEnabled.
   * If usage monitoring is enabled or not on this workbench.
   **/
  public void setMonitoringEnabled(Boolean monitoringEnabled) {
    this.monitoringEnabled = monitoringEnabled;
  }

  /**
   * Getter for loadBalancerIPWhitelists.
   * The whitelist of IPs for load balancer.
   **/
  @JsonProperty("loadBalancerIPWhitelists")
  public List<String> getLoadBalancerIPWhitelists() {
    return loadBalancerIPWhitelists;
  }

  /**
   * Setter for loadBalancerIPWhitelists.
   * The whitelist of IPs for load balancer.
   **/
  public void setLoadBalancerIPWhitelists(List<String> loadBalancerIPWhitelists) {
    this.loadBalancerIPWhitelists = loadBalancerIPWhitelists;
  }

  /**
   * Getter for creationDate.
   * Creation date of workbench.
   **/
  @JsonProperty("creationDate")
  public ZonedDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * Setter for creationDate.
   * Creation date of workbench.
   **/
  public void setCreationDate(ZonedDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Getter for failureMessage.
   * Failure message from the most recent failure that has occurred during workbench provisioning.
   **/
  @JsonProperty("failureMessage")
  public String getFailureMessage() {
    return failureMessage;
  }

  /**
   * Setter for failureMessage.
   * Failure message from the most recent failure that has occurred during workbench provisioning.
   **/
  public void setFailureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
  }

  /**
   * Getter for healthInfoLists.
   * The health info information of the workbench.
   **/
  @JsonProperty("healthInfoLists")
  public List<HealthInfo> getHealthInfoLists() {
    return healthInfoLists;
  }

  /**
   * Setter for healthInfoLists.
   * The health info information of the workbench.
   **/
  public void setHealthInfoLists(List<HealthInfo> healthInfoLists) {
    this.healthInfoLists = healthInfoLists;
  }

  /**
   * Getter for upgradeState.
   * The upgrade state contains the workbench upgrade information.
   **/
  @JsonProperty("upgradeState")
  public UpgradeState getUpgradeState() {
    return upgradeState;
  }

  /**
   * Setter for upgradeState.
   * The upgrade state contains the workbench upgrade information.
   **/
  public void setUpgradeState(UpgradeState upgradeState) {
    this.upgradeState = upgradeState;
  }

  /**
   * Getter for nfsVersion.
   * NFS Version of the filesystem.
   **/
  @JsonProperty("nfsVersion")
  public String getNfsVersion() {
    return nfsVersion;
  }

  /**
   * Setter for nfsVersion.
   * NFS Version of the filesystem.
   **/
  public void setNfsVersion(String nfsVersion) {
    this.nfsVersion = nfsVersion;
  }

  /**
   * Getter for backupMetadata.
   * The Backup Metadata for the workbench.
   **/
  @JsonProperty("backupMetadata")
  public BackupMetadata getBackupMetadata() {
    return backupMetadata;
  }

  /**
   * Setter for backupMetadata.
   * The Backup Metadata for the workbench.
   **/
  public void setBackupMetadata(BackupMetadata backupMetadata) {
    this.backupMetadata = backupMetadata;
  }

  /**
   * Getter for clusterID.
   * The Cluster ID for the workbench.
   **/
  @JsonProperty("clusterID")
  public String getClusterID() {
    return clusterID;
  }

  /**
   * Setter for clusterID.
   * The Cluster ID for the workbench.
   **/
  public void setClusterID(String clusterID) {
    this.clusterID = clusterID;
  }

  /**
   * Getter for isPrivate.
   * The value to indicate if the cluster is private or not.
   **/
  @JsonProperty("isPrivate")
  public Boolean getIsPrivate() {
    return isPrivate;
  }

  /**
   * Setter for isPrivate.
   * The value to indicate if the cluster is private or not.
   **/
  public void setIsPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
  }

  /**
   * Getter for isRestored.
   * The value to indicate if the workbench is restored one or not
   **/
  @JsonProperty("isRestored")
  public Boolean getIsRestored() {
    return isRestored;
  }

  /**
   * Setter for isRestored.
   * The value to indicate if the workbench is restored one or not
   **/
  public void setIsRestored(Boolean isRestored) {
    this.isRestored = isRestored;
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
    if (!Objects.equals(this.upgradeState, workspaceSummary.upgradeState)) {
      return false;
    }
    if (!Objects.equals(this.nfsVersion, workspaceSummary.nfsVersion)) {
      return false;
    }
    if (!Objects.equals(this.backupMetadata, workspaceSummary.backupMetadata)) {
      return false;
    }
    if (!Objects.equals(this.clusterID, workspaceSummary.clusterID)) {
      return false;
    }
    if (!Objects.equals(this.isPrivate, workspaceSummary.isPrivate)) {
      return false;
    }
    if (!Objects.equals(this.isRestored, workspaceSummary.isRestored)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceName, environmentName, instanceStatus, instanceUrl, environmentCrn, crn, k8sClusterName, creatorCrn, version, httpsEnabled, filesystemID, cloudPlatform, monitoringEnabled, loadBalancerIPWhitelists, creationDate, failureMessage, healthInfoLists, upgradeState, nfsVersion, backupMetadata, clusterID, isPrivate, isRestored);
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
    sb.append("    upgradeState: ").append(toIndentedString(upgradeState)).append("\n");
    sb.append("    nfsVersion: ").append(toIndentedString(nfsVersion)).append("\n");
    sb.append("    backupMetadata: ").append(toIndentedString(backupMetadata)).append("\n");
    sb.append("    clusterID: ").append(toIndentedString(clusterID)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
    sb.append("    isRestored: ").append(toIndentedString(isRestored)).append("\n");
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

