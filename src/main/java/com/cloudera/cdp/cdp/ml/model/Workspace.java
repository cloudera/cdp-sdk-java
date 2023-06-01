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
import com.cloudera.cdp.ml.model.Tag;
import com.cloudera.cdp.ml.model.UpgradeState;
import com.cloudera.cdp.ml.model.WorkspaceInstanceGroup;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * A ML workspace, which includes the cluster and storage.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-06-01T14:27:20.832-07:00")
public class Workspace  {

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
   * To Display if Https is enabled or not.
   **/
  private Boolean httpsEnabled = null;

  /**
   * To check if the cluster is publicly accessible or not.
   **/
  private Boolean endpointPublicAccess = null;

  /**
   * filesystemID used by the workspace
   **/
  private String filesystemID = null;

  /**
   * Tags provided by the user at the time of workspace creation.
   **/
  private List<Tag> tags = new ArrayList<Tag>();

  /**
   * The instance groups.
   **/
  private List<WorkspaceInstanceGroup> instanceGroups = new ArrayList<WorkspaceInstanceGroup>();

  /**
   * The cloud platform of the environment that was used to create this workspace.
   **/
  private String cloudPlatform = null;

  /**
   * If usage monitoring is enabled or not on this workspace.
   **/
  private Boolean monitoringEnabled = null;

  /**
   * IP whitelist for loadBalancer.
   **/
  private List<String> loadBalancerIPWhitelists = new ArrayList<String>();

  /**
   * Creation date of workspace.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * The health info information of the workspace.
   **/
  private List<HealthInfo> healthInfoLists = new ArrayList<HealthInfo>();

  /**
   * Failure message from the most recent failure that has occurred during workspace provisioning.
   **/
  private String failureMessage = null;

  /**
   * The basedomain of the cluster.
   **/
  private String clusterBaseDomain = null;

  /**
   * Whether model metrics is enabled.
   **/
  private Boolean modelMetricsEnabled = null;

  /**
   * Whether governance is enabled.
   **/
  private Boolean governanceEnabled = null;

  /**
   * The subnets of the workspace.
   **/
  private List<String> subnets = new ArrayList<String>();

  /**
   * Whether to whitelist only 'authorizedIPRanges' given or all public IPs.
   **/
  private Boolean whitelistAuthorizedIPRanges = null;

  /**
   * The whitelist of CIDR blocks which can access the API server.
   **/
  private List<String> authorizedIPRanges = new ArrayList<String>();

  /**
   * NFS Version of the filesystem.
   **/
  private String nfsVersion = null;

  /**
   * The list of subnets used for the load balancer that CML creates.
   **/
  private List<String> subnetsForLoadBalancers = new ArrayList<String>();

  /**
   * The upgrade state contains the workspace upgrade information.
   **/
  private UpgradeState upgradeState = null;

  /**
   * The Backup MetaData for this Workspace
   **/
  private BackupMetadata backupMetadata = null;

  /**
   * The Cluster ID for the workspace.
   **/
  private String clusterID = null;

  /**
   * The value to indicate if the cluster is private or not.
   **/
  private Boolean isPrivate = null;

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
   * To Display if Https is enabled or not.
   **/
  @JsonProperty("httpsEnabled")
  public Boolean getHttpsEnabled() {
    return httpsEnabled;
  }

  /**
   * Setter for httpsEnabled.
   * To Display if Https is enabled or not.
   **/
  public void setHttpsEnabled(Boolean httpsEnabled) {
    this.httpsEnabled = httpsEnabled;
  }

  /**
   * Getter for endpointPublicAccess.
   * To check if the cluster is publicly accessible or not.
   **/
  @JsonProperty("endpointPublicAccess")
  public Boolean getEndpointPublicAccess() {
    return endpointPublicAccess;
  }

  /**
   * Setter for endpointPublicAccess.
   * To check if the cluster is publicly accessible or not.
   **/
  public void setEndpointPublicAccess(Boolean endpointPublicAccess) {
    this.endpointPublicAccess = endpointPublicAccess;
  }

  /**
   * Getter for filesystemID.
   * filesystemID used by the workspace
   **/
  @JsonProperty("filesystemID")
  public String getFilesystemID() {
    return filesystemID;
  }

  /**
   * Setter for filesystemID.
   * filesystemID used by the workspace
   **/
  public void setFilesystemID(String filesystemID) {
    this.filesystemID = filesystemID;
  }

  /**
   * Getter for tags.
   * Tags provided by the user at the time of workspace creation.
   **/
  @JsonProperty("tags")
  public List<Tag> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Tags provided by the user at the time of workspace creation.
   **/
  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  /**
   * Getter for instanceGroups.
   * The instance groups.
   **/
  @JsonProperty("instanceGroups")
  public List<WorkspaceInstanceGroup> getInstanceGroups() {
    return instanceGroups;
  }

  /**
   * Setter for instanceGroups.
   * The instance groups.
   **/
  public void setInstanceGroups(List<WorkspaceInstanceGroup> instanceGroups) {
    this.instanceGroups = instanceGroups;
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
   * IP whitelist for loadBalancer.
   **/
  @JsonProperty("loadBalancerIPWhitelists")
  public List<String> getLoadBalancerIPWhitelists() {
    return loadBalancerIPWhitelists;
  }

  /**
   * Setter for loadBalancerIPWhitelists.
   * IP whitelist for loadBalancer.
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
   * Getter for clusterBaseDomain.
   * The basedomain of the cluster.
   **/
  @JsonProperty("clusterBaseDomain")
  public String getClusterBaseDomain() {
    return clusterBaseDomain;
  }

  /**
   * Setter for clusterBaseDomain.
   * The basedomain of the cluster.
   **/
  public void setClusterBaseDomain(String clusterBaseDomain) {
    this.clusterBaseDomain = clusterBaseDomain;
  }

  /**
   * Getter for modelMetricsEnabled.
   * Whether model metrics is enabled.
   **/
  @JsonProperty("modelMetricsEnabled")
  public Boolean getModelMetricsEnabled() {
    return modelMetricsEnabled;
  }

  /**
   * Setter for modelMetricsEnabled.
   * Whether model metrics is enabled.
   **/
  public void setModelMetricsEnabled(Boolean modelMetricsEnabled) {
    this.modelMetricsEnabled = modelMetricsEnabled;
  }

  /**
   * Getter for governanceEnabled.
   * Whether governance is enabled.
   **/
  @JsonProperty("governanceEnabled")
  public Boolean getGovernanceEnabled() {
    return governanceEnabled;
  }

  /**
   * Setter for governanceEnabled.
   * Whether governance is enabled.
   **/
  public void setGovernanceEnabled(Boolean governanceEnabled) {
    this.governanceEnabled = governanceEnabled;
  }

  /**
   * Getter for subnets.
   * The subnets of the workspace.
   **/
  @JsonProperty("subnets")
  public List<String> getSubnets() {
    return subnets;
  }

  /**
   * Setter for subnets.
   * The subnets of the workspace.
   **/
  public void setSubnets(List<String> subnets) {
    this.subnets = subnets;
  }

  /**
   * Getter for whitelistAuthorizedIPRanges.
   * Whether to whitelist only &#39;authorizedIPRanges&#39; given or all public IPs.
   **/
  @JsonProperty("whitelistAuthorizedIPRanges")
  public Boolean getWhitelistAuthorizedIPRanges() {
    return whitelistAuthorizedIPRanges;
  }

  /**
   * Setter for whitelistAuthorizedIPRanges.
   * Whether to whitelist only &#39;authorizedIPRanges&#39; given or all public IPs.
   **/
  public void setWhitelistAuthorizedIPRanges(Boolean whitelistAuthorizedIPRanges) {
    this.whitelistAuthorizedIPRanges = whitelistAuthorizedIPRanges;
  }

  /**
   * Getter for authorizedIPRanges.
   * The whitelist of CIDR blocks which can access the API server.
   **/
  @JsonProperty("authorizedIPRanges")
  public List<String> getAuthorizedIPRanges() {
    return authorizedIPRanges;
  }

  /**
   * Setter for authorizedIPRanges.
   * The whitelist of CIDR blocks which can access the API server.
   **/
  public void setAuthorizedIPRanges(List<String> authorizedIPRanges) {
    this.authorizedIPRanges = authorizedIPRanges;
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
   * Getter for subnetsForLoadBalancers.
   * The list of subnets used for the load balancer that CML creates.
   **/
  @JsonProperty("subnetsForLoadBalancers")
  public List<String> getSubnetsForLoadBalancers() {
    return subnetsForLoadBalancers;
  }

  /**
   * Setter for subnetsForLoadBalancers.
   * The list of subnets used for the load balancer that CML creates.
   **/
  public void setSubnetsForLoadBalancers(List<String> subnetsForLoadBalancers) {
    this.subnetsForLoadBalancers = subnetsForLoadBalancers;
  }

  /**
   * Getter for upgradeState.
   * The upgrade state contains the workspace upgrade information.
   **/
  @JsonProperty("upgradeState")
  public UpgradeState getUpgradeState() {
    return upgradeState;
  }

  /**
   * Setter for upgradeState.
   * The upgrade state contains the workspace upgrade information.
   **/
  public void setUpgradeState(UpgradeState upgradeState) {
    this.upgradeState = upgradeState;
  }

  /**
   * Getter for backupMetadata.
   * The Backup MetaData for this Workspace
   **/
  @JsonProperty("backupMetadata")
  public BackupMetadata getBackupMetadata() {
    return backupMetadata;
  }

  /**
   * Setter for backupMetadata.
   * The Backup MetaData for this Workspace
   **/
  public void setBackupMetadata(BackupMetadata backupMetadata) {
    this.backupMetadata = backupMetadata;
  }

  /**
   * Getter for clusterID.
   * The Cluster ID for the workspace.
   **/
  @JsonProperty("clusterID")
  public String getClusterID() {
    return clusterID;
  }

  /**
   * Setter for clusterID.
   * The Cluster ID for the workspace.
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workspace workspace = (Workspace) o;
    if (!Objects.equals(this.instanceName, workspace.instanceName)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, workspace.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.instanceStatus, workspace.instanceStatus)) {
      return false;
    }
    if (!Objects.equals(this.instanceUrl, workspace.instanceUrl)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, workspace.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.crn, workspace.crn)) {
      return false;
    }
    if (!Objects.equals(this.k8sClusterName, workspace.k8sClusterName)) {
      return false;
    }
    if (!Objects.equals(this.creatorCrn, workspace.creatorCrn)) {
      return false;
    }
    if (!Objects.equals(this.version, workspace.version)) {
      return false;
    }
    if (!Objects.equals(this.httpsEnabled, workspace.httpsEnabled)) {
      return false;
    }
    if (!Objects.equals(this.endpointPublicAccess, workspace.endpointPublicAccess)) {
      return false;
    }
    if (!Objects.equals(this.filesystemID, workspace.filesystemID)) {
      return false;
    }
    if (!Objects.equals(this.tags, workspace.tags)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroups, workspace.instanceGroups)) {
      return false;
    }
    if (!Objects.equals(this.cloudPlatform, workspace.cloudPlatform)) {
      return false;
    }
    if (!Objects.equals(this.monitoringEnabled, workspace.monitoringEnabled)) {
      return false;
    }
    if (!Objects.equals(this.loadBalancerIPWhitelists, workspace.loadBalancerIPWhitelists)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, workspace.creationDate)) {
      return false;
    }
    if (!Objects.equals(this.healthInfoLists, workspace.healthInfoLists)) {
      return false;
    }
    if (!Objects.equals(this.failureMessage, workspace.failureMessage)) {
      return false;
    }
    if (!Objects.equals(this.clusterBaseDomain, workspace.clusterBaseDomain)) {
      return false;
    }
    if (!Objects.equals(this.modelMetricsEnabled, workspace.modelMetricsEnabled)) {
      return false;
    }
    if (!Objects.equals(this.governanceEnabled, workspace.governanceEnabled)) {
      return false;
    }
    if (!Objects.equals(this.subnets, workspace.subnets)) {
      return false;
    }
    if (!Objects.equals(this.whitelistAuthorizedIPRanges, workspace.whitelistAuthorizedIPRanges)) {
      return false;
    }
    if (!Objects.equals(this.authorizedIPRanges, workspace.authorizedIPRanges)) {
      return false;
    }
    if (!Objects.equals(this.nfsVersion, workspace.nfsVersion)) {
      return false;
    }
    if (!Objects.equals(this.subnetsForLoadBalancers, workspace.subnetsForLoadBalancers)) {
      return false;
    }
    if (!Objects.equals(this.upgradeState, workspace.upgradeState)) {
      return false;
    }
    if (!Objects.equals(this.backupMetadata, workspace.backupMetadata)) {
      return false;
    }
    if (!Objects.equals(this.clusterID, workspace.clusterID)) {
      return false;
    }
    if (!Objects.equals(this.isPrivate, workspace.isPrivate)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceName, environmentName, instanceStatus, instanceUrl, environmentCrn, crn, k8sClusterName, creatorCrn, version, httpsEnabled, endpointPublicAccess, filesystemID, tags, instanceGroups, cloudPlatform, monitoringEnabled, loadBalancerIPWhitelists, creationDate, healthInfoLists, failureMessage, clusterBaseDomain, modelMetricsEnabled, governanceEnabled, subnets, whitelistAuthorizedIPRanges, authorizedIPRanges, nfsVersion, subnetsForLoadBalancers, upgradeState, backupMetadata, clusterID, isPrivate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workspace {\n");
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
    sb.append("    endpointPublicAccess: ").append(toIndentedString(endpointPublicAccess)).append("\n");
    sb.append("    filesystemID: ").append(toIndentedString(filesystemID)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    instanceGroups: ").append(toIndentedString(instanceGroups)).append("\n");
    sb.append("    cloudPlatform: ").append(toIndentedString(cloudPlatform)).append("\n");
    sb.append("    monitoringEnabled: ").append(toIndentedString(monitoringEnabled)).append("\n");
    sb.append("    loadBalancerIPWhitelists: ").append(toIndentedString(loadBalancerIPWhitelists)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    healthInfoLists: ").append(toIndentedString(healthInfoLists)).append("\n");
    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
    sb.append("    clusterBaseDomain: ").append(toIndentedString(clusterBaseDomain)).append("\n");
    sb.append("    modelMetricsEnabled: ").append(toIndentedString(modelMetricsEnabled)).append("\n");
    sb.append("    governanceEnabled: ").append(toIndentedString(governanceEnabled)).append("\n");
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
    sb.append("    whitelistAuthorizedIPRanges: ").append(toIndentedString(whitelistAuthorizedIPRanges)).append("\n");
    sb.append("    authorizedIPRanges: ").append(toIndentedString(authorizedIPRanges)).append("\n");
    sb.append("    nfsVersion: ").append(toIndentedString(nfsVersion)).append("\n");
    sb.append("    subnetsForLoadBalancers: ").append(toIndentedString(subnetsForLoadBalancers)).append("\n");
    sb.append("    upgradeState: ").append(toIndentedString(upgradeState)).append("\n");
    sb.append("    backupMetadata: ").append(toIndentedString(backupMetadata)).append("\n");
    sb.append("    clusterID: ").append(toIndentedString(clusterID)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
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

