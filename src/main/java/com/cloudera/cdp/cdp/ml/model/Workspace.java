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
import com.cloudera.cdp.ml.model.ResourceQuota;
import com.cloudera.cdp.ml.model.Tag;
import com.cloudera.cdp.ml.model.UpgradeState;
import com.cloudera.cdp.ml.model.WorkspaceInstanceGroup;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * A ML workbench, which includes the cluster and storage.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-09T13:56:12.208-07:00")
public class Workspace  {

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
   * To Display if Https is enabled or not.
   **/
  private Boolean httpsEnabled = null;

  /**
   * To check if the cluster is publicly accessible or not.
   **/
  private Boolean endpointPublicAccess = null;

  /**
   * filesystemID used by the workbench
   **/
  private String filesystemID = null;

  /**
   * Tags provided by the user at the time of workbench creation.
   **/
  private List<Tag> tags = new ArrayList<Tag>();

  /**
   * The instance groups.
   **/
  private List<WorkspaceInstanceGroup> instanceGroups = new ArrayList<WorkspaceInstanceGroup>();

  /**
   * The cloud platform of the environment that was used to create this workbench.
   **/
  private String cloudPlatform = null;

  /**
   * If usage monitoring is enabled or not on this workbench.
   **/
  private Boolean monitoringEnabled = null;

  /**
   * IP whitelist for loadBalancer.
   **/
  private List<String> loadBalancerIPWhitelists = new ArrayList<String>();

  /**
   * Creation date of workbench.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * The health info information of the workbench.
   **/
  private List<HealthInfo> healthInfoLists = new ArrayList<HealthInfo>();

  /**
   * Failure message from the most recent failure that has occurred during workbench provisioning.
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
   * The subnets of the workbench.
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
   * The list of subnets used for the load balancer that Cloudera AI creates.
   **/
  private List<String> subnetsForLoadBalancers = new ArrayList<String>();

  /**
   * The upgrade state contains the workbench upgrade information.
   **/
  private UpgradeState upgradeState = null;

  /**
   * The Backup MetaData for this workbench
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
   * Resource Pool for the workbench.
   **/
  private String resourcePoolName = null;

  /**
   * Parent Resource Pool for the workbench.
   **/
  private String parentResourcePoolName = null;

  /**
   * Quota configured for the workbench.
   **/
  private ResourceQuota quota = null;

  /**
   * Available Quota for the workbench.
   **/
  private ResourceQuota availableQuota = null;

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
   * filesystemID used by the workbench
   **/
  @JsonProperty("filesystemID")
  public String getFilesystemID() {
    return filesystemID;
  }

  /**
   * Setter for filesystemID.
   * filesystemID used by the workbench
   **/
  public void setFilesystemID(String filesystemID) {
    this.filesystemID = filesystemID;
  }

  /**
   * Getter for tags.
   * Tags provided by the user at the time of workbench creation.
   **/
  @JsonProperty("tags")
  public List<Tag> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Tags provided by the user at the time of workbench creation.
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
   * The subnets of the workbench.
   **/
  @JsonProperty("subnets")
  public List<String> getSubnets() {
    return subnets;
  }

  /**
   * Setter for subnets.
   * The subnets of the workbench.
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
   * The list of subnets used for the load balancer that Cloudera AI creates.
   **/
  @JsonProperty("subnetsForLoadBalancers")
  public List<String> getSubnetsForLoadBalancers() {
    return subnetsForLoadBalancers;
  }

  /**
   * Setter for subnetsForLoadBalancers.
   * The list of subnets used for the load balancer that Cloudera AI creates.
   **/
  public void setSubnetsForLoadBalancers(List<String> subnetsForLoadBalancers) {
    this.subnetsForLoadBalancers = subnetsForLoadBalancers;
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
   * Getter for backupMetadata.
   * The Backup MetaData for this workbench
   **/
  @JsonProperty("backupMetadata")
  public BackupMetadata getBackupMetadata() {
    return backupMetadata;
  }

  /**
   * Setter for backupMetadata.
   * The Backup MetaData for this workbench
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
   * Getter for resourcePoolName.
   * Resource Pool for the workbench.
   **/
  @JsonProperty("resourcePoolName")
  public String getResourcePoolName() {
    return resourcePoolName;
  }

  /**
   * Setter for resourcePoolName.
   * Resource Pool for the workbench.
   **/
  public void setResourcePoolName(String resourcePoolName) {
    this.resourcePoolName = resourcePoolName;
  }

  /**
   * Getter for parentResourcePoolName.
   * Parent Resource Pool for the workbench.
   **/
  @JsonProperty("parentResourcePoolName")
  public String getParentResourcePoolName() {
    return parentResourcePoolName;
  }

  /**
   * Setter for parentResourcePoolName.
   * Parent Resource Pool for the workbench.
   **/
  public void setParentResourcePoolName(String parentResourcePoolName) {
    this.parentResourcePoolName = parentResourcePoolName;
  }

  /**
   * Getter for quota.
   * Quota configured for the workbench.
   **/
  @JsonProperty("quota")
  public ResourceQuota getQuota() {
    return quota;
  }

  /**
   * Setter for quota.
   * Quota configured for the workbench.
   **/
  public void setQuota(ResourceQuota quota) {
    this.quota = quota;
  }

  /**
   * Getter for availableQuota.
   * Available Quota for the workbench.
   **/
  @JsonProperty("availableQuota")
  public ResourceQuota getAvailableQuota() {
    return availableQuota;
  }

  /**
   * Setter for availableQuota.
   * Available Quota for the workbench.
   **/
  public void setAvailableQuota(ResourceQuota availableQuota) {
    this.availableQuota = availableQuota;
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
    if (!Objects.equals(this.resourcePoolName, workspace.resourcePoolName)) {
      return false;
    }
    if (!Objects.equals(this.parentResourcePoolName, workspace.parentResourcePoolName)) {
      return false;
    }
    if (!Objects.equals(this.quota, workspace.quota)) {
      return false;
    }
    if (!Objects.equals(this.availableQuota, workspace.availableQuota)) {
      return false;
    }
    if (!Objects.equals(this.isRestored, workspace.isRestored)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceName, environmentName, instanceStatus, instanceUrl, environmentCrn, crn, k8sClusterName, creatorCrn, version, httpsEnabled, endpointPublicAccess, filesystemID, tags, instanceGroups, cloudPlatform, monitoringEnabled, loadBalancerIPWhitelists, creationDate, healthInfoLists, failureMessage, clusterBaseDomain, modelMetricsEnabled, governanceEnabled, subnets, whitelistAuthorizedIPRanges, authorizedIPRanges, nfsVersion, subnetsForLoadBalancers, upgradeState, backupMetadata, clusterID, isPrivate, resourcePoolName, parentResourcePoolName, quota, availableQuota, isRestored);
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
    sb.append("    resourcePoolName: ").append(toIndentedString(resourcePoolName)).append("\n");
    sb.append("    parentResourcePoolName: ").append(toIndentedString(parentResourcePoolName)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    availableQuota: ").append(toIndentedString(availableQuota)).append("\n");
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

