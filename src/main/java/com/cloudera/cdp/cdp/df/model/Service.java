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
import com.cloudera.cdp.df.model.EncryptionParameters;
import com.cloudera.cdp.df.model.ServiceStatus;
import java.util.*;
import java.util.Map;

/**
 * The DataFlow view of a CDP service.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-15T17:00:48.252-07:00")
public class Service  {

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
   * The minimum number of Kubernetes nodes that need to be provisioned in the service
   **/
  private Integer minK8sNodeCount = null;

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
   * The instance type of the kubernetes nodes currently in use by DataFlow for this service.
   **/
  private String instanceType = null;

  /**
   * The URL of the service local DataFlow application.
   **/
  private String dfLocalUrl = null;

  /**
   * The IP Ranges authorized to connect to the Kubernetes API Server.
   **/
  private List<String> kubeApiAuthorizedIpRanges = new ArrayList<String>();

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
   * Valid actions that can be applied based on the current state of the service
   **/
  private List<String> validActions = new ArrayList<String>();

  /**
   * Whether or not a public load balancer is exposed.
   **/
  private Boolean usePublicLoadBalancer = null;

  /**
   * The tags to apply to service related resources created
   **/
  private Map<String, String> tags = new HashMap<String, String>();

  /**
   * IP Ranges that are authorized to access CDF local endpoints.
   **/
  private List<String> loadBalancerAuthorizedIpRanges = new ArrayList<String>();

  /**
   * Subnets to use for the Kubernetes cluster
   **/
  private List<String> clusterSubnets = new ArrayList<String>();

  /**
   * The number of kubernetes nodes currently under creation for this service.
   **/
  private Integer creatingK8sNodeCount = null;

  /**
   * The number of kubernetes nodes currently terminating for this service.
   **/
  private Integer terminatingK8sNodeCount = null;

  /**
   * Subnets to use for the Load Balancer
   **/
  private List<String> loadBalancerSubnets = new ArrayList<String>();

  /**
   * Whether the k8s cluster is private or not.
   **/
  private Boolean privateCluster = null;

  /**
   * The name of the proxy that is configured for the CDP environment
   **/
  private String proxyName = null;

  /**
   * The kubernetes version of the cluster
   **/
  private String k8sServerVersion = null;

  /**
   * The available kubernetes version that cluster can be upgraded to.
   **/
  private String availableK8sVersionUpgrade = null;

  /**
   * Whether User Defined Routing (UDR) mode is enabled for AKS clusters or not.
   **/
  private Boolean userDefinedRouting = null;

  /**
   * CIDR range from which to assign IPs to pods in the kubernetes cluster.
   **/
  private String podCidr = null;

  /**
   * CIDR range from which to assign IPs to internal services in the kubernetes cluster.
   **/
  private String serviceCidr = null;

  /**
   * The encryption parameters used by DataFlow service for encrypting K8s secrets and EBS volumes.
   **/
  private EncryptionParameters encryptionParameters = null;

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
   * Getter for minK8sNodeCount.
   * The minimum number of Kubernetes nodes that need to be provisioned in the service
   **/
  @JsonProperty("minK8sNodeCount")
  public Integer getMinK8sNodeCount() {
    return minK8sNodeCount;
  }

  /**
   * Setter for minK8sNodeCount.
   * The minimum number of Kubernetes nodes that need to be provisioned in the service
   **/
  public void setMinK8sNodeCount(Integer minK8sNodeCount) {
    this.minK8sNodeCount = minK8sNodeCount;
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
   * Getter for dfLocalUrl.
   * The URL of the service local DataFlow application.
   **/
  @JsonProperty("dfLocalUrl")
  public String getDfLocalUrl() {
    return dfLocalUrl;
  }

  /**
   * Setter for dfLocalUrl.
   * The URL of the service local DataFlow application.
   **/
  public void setDfLocalUrl(String dfLocalUrl) {
    this.dfLocalUrl = dfLocalUrl;
  }

  /**
   * Getter for kubeApiAuthorizedIpRanges.
   * The IP Ranges authorized to connect to the Kubernetes API Server.
   **/
  @JsonProperty("kubeApiAuthorizedIpRanges")
  public List<String> getKubeApiAuthorizedIpRanges() {
    return kubeApiAuthorizedIpRanges;
  }

  /**
   * Setter for kubeApiAuthorizedIpRanges.
   * The IP Ranges authorized to connect to the Kubernetes API Server.
   **/
  public void setKubeApiAuthorizedIpRanges(List<String> kubeApiAuthorizedIpRanges) {
    this.kubeApiAuthorizedIpRanges = kubeApiAuthorizedIpRanges;
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
   * Getter for usePublicLoadBalancer.
   * Whether or not a public load balancer is exposed.
   **/
  @JsonProperty("usePublicLoadBalancer")
  public Boolean getUsePublicLoadBalancer() {
    return usePublicLoadBalancer;
  }

  /**
   * Setter for usePublicLoadBalancer.
   * Whether or not a public load balancer is exposed.
   **/
  public void setUsePublicLoadBalancer(Boolean usePublicLoadBalancer) {
    this.usePublicLoadBalancer = usePublicLoadBalancer;
  }

  /**
   * Getter for tags.
   * The tags to apply to service related resources created
   **/
  @JsonProperty("tags")
  public Map<String, String> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * The tags to apply to service related resources created
   **/
  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  /**
   * Getter for loadBalancerAuthorizedIpRanges.
   * IP Ranges that are authorized to access CDF local endpoints.
   **/
  @JsonProperty("loadBalancerAuthorizedIpRanges")
  public List<String> getLoadBalancerAuthorizedIpRanges() {
    return loadBalancerAuthorizedIpRanges;
  }

  /**
   * Setter for loadBalancerAuthorizedIpRanges.
   * IP Ranges that are authorized to access CDF local endpoints.
   **/
  public void setLoadBalancerAuthorizedIpRanges(List<String> loadBalancerAuthorizedIpRanges) {
    this.loadBalancerAuthorizedIpRanges = loadBalancerAuthorizedIpRanges;
  }

  /**
   * Getter for clusterSubnets.
   * Subnets to use for the Kubernetes cluster
   **/
  @JsonProperty("clusterSubnets")
  public List<String> getClusterSubnets() {
    return clusterSubnets;
  }

  /**
   * Setter for clusterSubnets.
   * Subnets to use for the Kubernetes cluster
   **/
  public void setClusterSubnets(List<String> clusterSubnets) {
    this.clusterSubnets = clusterSubnets;
  }

  /**
   * Getter for creatingK8sNodeCount.
   * The number of kubernetes nodes currently under creation for this service.
   **/
  @JsonProperty("creatingK8sNodeCount")
  public Integer getCreatingK8sNodeCount() {
    return creatingK8sNodeCount;
  }

  /**
   * Setter for creatingK8sNodeCount.
   * The number of kubernetes nodes currently under creation for this service.
   **/
  public void setCreatingK8sNodeCount(Integer creatingK8sNodeCount) {
    this.creatingK8sNodeCount = creatingK8sNodeCount;
  }

  /**
   * Getter for terminatingK8sNodeCount.
   * The number of kubernetes nodes currently terminating for this service.
   **/
  @JsonProperty("terminatingK8sNodeCount")
  public Integer getTerminatingK8sNodeCount() {
    return terminatingK8sNodeCount;
  }

  /**
   * Setter for terminatingK8sNodeCount.
   * The number of kubernetes nodes currently terminating for this service.
   **/
  public void setTerminatingK8sNodeCount(Integer terminatingK8sNodeCount) {
    this.terminatingK8sNodeCount = terminatingK8sNodeCount;
  }

  /**
   * Getter for loadBalancerSubnets.
   * Subnets to use for the Load Balancer
   **/
  @JsonProperty("loadBalancerSubnets")
  public List<String> getLoadBalancerSubnets() {
    return loadBalancerSubnets;
  }

  /**
   * Setter for loadBalancerSubnets.
   * Subnets to use for the Load Balancer
   **/
  public void setLoadBalancerSubnets(List<String> loadBalancerSubnets) {
    this.loadBalancerSubnets = loadBalancerSubnets;
  }

  /**
   * Getter for privateCluster.
   * Whether the k8s cluster is private or not.
   **/
  @JsonProperty("privateCluster")
  public Boolean getPrivateCluster() {
    return privateCluster;
  }

  /**
   * Setter for privateCluster.
   * Whether the k8s cluster is private or not.
   **/
  public void setPrivateCluster(Boolean privateCluster) {
    this.privateCluster = privateCluster;
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

  /**
   * Getter for k8sServerVersion.
   * The kubernetes version of the cluster
   **/
  @JsonProperty("k8sServerVersion")
  public String getK8sServerVersion() {
    return k8sServerVersion;
  }

  /**
   * Setter for k8sServerVersion.
   * The kubernetes version of the cluster
   **/
  public void setK8sServerVersion(String k8sServerVersion) {
    this.k8sServerVersion = k8sServerVersion;
  }

  /**
   * Getter for availableK8sVersionUpgrade.
   * The available kubernetes version that cluster can be upgraded to.
   **/
  @JsonProperty("availableK8sVersionUpgrade")
  public String getAvailableK8sVersionUpgrade() {
    return availableK8sVersionUpgrade;
  }

  /**
   * Setter for availableK8sVersionUpgrade.
   * The available kubernetes version that cluster can be upgraded to.
   **/
  public void setAvailableK8sVersionUpgrade(String availableK8sVersionUpgrade) {
    this.availableK8sVersionUpgrade = availableK8sVersionUpgrade;
  }

  /**
   * Getter for userDefinedRouting.
   * Whether User Defined Routing (UDR) mode is enabled for AKS clusters or not.
   **/
  @JsonProperty("userDefinedRouting")
  public Boolean getUserDefinedRouting() {
    return userDefinedRouting;
  }

  /**
   * Setter for userDefinedRouting.
   * Whether User Defined Routing (UDR) mode is enabled for AKS clusters or not.
   **/
  public void setUserDefinedRouting(Boolean userDefinedRouting) {
    this.userDefinedRouting = userDefinedRouting;
  }

  /**
   * Getter for podCidr.
   * CIDR range from which to assign IPs to pods in the kubernetes cluster.
   **/
  @JsonProperty("podCidr")
  public String getPodCidr() {
    return podCidr;
  }

  /**
   * Setter for podCidr.
   * CIDR range from which to assign IPs to pods in the kubernetes cluster.
   **/
  public void setPodCidr(String podCidr) {
    this.podCidr = podCidr;
  }

  /**
   * Getter for serviceCidr.
   * CIDR range from which to assign IPs to internal services in the kubernetes cluster.
   **/
  @JsonProperty("serviceCidr")
  public String getServiceCidr() {
    return serviceCidr;
  }

  /**
   * Setter for serviceCidr.
   * CIDR range from which to assign IPs to internal services in the kubernetes cluster.
   **/
  public void setServiceCidr(String serviceCidr) {
    this.serviceCidr = serviceCidr;
  }

  /**
   * Getter for encryptionParameters.
   * The encryption parameters used by DataFlow service for encrypting K8s secrets and EBS volumes.
   **/
  @JsonProperty("encryptionParameters")
  public EncryptionParameters getEncryptionParameters() {
    return encryptionParameters;
  }

  /**
   * Setter for encryptionParameters.
   * The encryption parameters used by DataFlow service for encrypting K8s secrets and EBS volumes.
   **/
  public void setEncryptionParameters(EncryptionParameters encryptionParameters) {
    this.encryptionParameters = encryptionParameters;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    if (!Objects.equals(this.crn, service.crn)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, service.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.name, service.name)) {
      return false;
    }
    if (!Objects.equals(this.cloudPlatform, service.cloudPlatform)) {
      return false;
    }
    if (!Objects.equals(this.region, service.region)) {
      return false;
    }
    if (!Objects.equals(this.deploymentCount, service.deploymentCount)) {
      return false;
    }
    if (!Objects.equals(this.minK8sNodeCount, service.minK8sNodeCount)) {
      return false;
    }
    if (!Objects.equals(this.maxK8sNodeCount, service.maxK8sNodeCount)) {
      return false;
    }
    if (!Objects.equals(this.status, service.status)) {
      return false;
    }
    if (!Objects.equals(this.workloadVersion, service.workloadVersion)) {
      return false;
    }
    if (!Objects.equals(this.upgradeDeploymentsNiFiVersion, service.upgradeDeploymentsNiFiVersion)) {
      return false;
    }
    if (!Objects.equals(this.runningK8sNodeCount, service.runningK8sNodeCount)) {
      return false;
    }
    if (!Objects.equals(this.instanceType, service.instanceType)) {
      return false;
    }
    if (!Objects.equals(this.dfLocalUrl, service.dfLocalUrl)) {
      return false;
    }
    if (!Objects.equals(this.kubeApiAuthorizedIpRanges, service.kubeApiAuthorizedIpRanges)) {
      return false;
    }
    if (!Objects.equals(this.activeInfoAlertCount, service.activeInfoAlertCount)) {
      return false;
    }
    if (!Objects.equals(this.activeWarningAlertCount, service.activeWarningAlertCount)) {
      return false;
    }
    if (!Objects.equals(this.activeErrorAlertCount, service.activeErrorAlertCount)) {
      return false;
    }
    if (!Objects.equals(this.clusterId, service.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.validActions, service.validActions)) {
      return false;
    }
    if (!Objects.equals(this.usePublicLoadBalancer, service.usePublicLoadBalancer)) {
      return false;
    }
    if (!Objects.equals(this.tags, service.tags)) {
      return false;
    }
    if (!Objects.equals(this.loadBalancerAuthorizedIpRanges, service.loadBalancerAuthorizedIpRanges)) {
      return false;
    }
    if (!Objects.equals(this.clusterSubnets, service.clusterSubnets)) {
      return false;
    }
    if (!Objects.equals(this.creatingK8sNodeCount, service.creatingK8sNodeCount)) {
      return false;
    }
    if (!Objects.equals(this.terminatingK8sNodeCount, service.terminatingK8sNodeCount)) {
      return false;
    }
    if (!Objects.equals(this.loadBalancerSubnets, service.loadBalancerSubnets)) {
      return false;
    }
    if (!Objects.equals(this.privateCluster, service.privateCluster)) {
      return false;
    }
    if (!Objects.equals(this.proxyName, service.proxyName)) {
      return false;
    }
    if (!Objects.equals(this.k8sServerVersion, service.k8sServerVersion)) {
      return false;
    }
    if (!Objects.equals(this.availableK8sVersionUpgrade, service.availableK8sVersionUpgrade)) {
      return false;
    }
    if (!Objects.equals(this.userDefinedRouting, service.userDefinedRouting)) {
      return false;
    }
    if (!Objects.equals(this.podCidr, service.podCidr)) {
      return false;
    }
    if (!Objects.equals(this.serviceCidr, service.serviceCidr)) {
      return false;
    }
    if (!Objects.equals(this.encryptionParameters, service.encryptionParameters)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, environmentCrn, name, cloudPlatform, region, deploymentCount, minK8sNodeCount, maxK8sNodeCount, status, workloadVersion, upgradeDeploymentsNiFiVersion, runningK8sNodeCount, instanceType, dfLocalUrl, kubeApiAuthorizedIpRanges, activeInfoAlertCount, activeWarningAlertCount, activeErrorAlertCount, clusterId, validActions, usePublicLoadBalancer, tags, loadBalancerAuthorizedIpRanges, clusterSubnets, creatingK8sNodeCount, terminatingK8sNodeCount, loadBalancerSubnets, privateCluster, proxyName, k8sServerVersion, availableK8sVersionUpgrade, userDefinedRouting, podCidr, serviceCidr, encryptionParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cloudPlatform: ").append(toIndentedString(cloudPlatform)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    deploymentCount: ").append(toIndentedString(deploymentCount)).append("\n");
    sb.append("    minK8sNodeCount: ").append(toIndentedString(minK8sNodeCount)).append("\n");
    sb.append("    maxK8sNodeCount: ").append(toIndentedString(maxK8sNodeCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    workloadVersion: ").append(toIndentedString(workloadVersion)).append("\n");
    sb.append("    upgradeDeploymentsNiFiVersion: ").append(toIndentedString(upgradeDeploymentsNiFiVersion)).append("\n");
    sb.append("    runningK8sNodeCount: ").append(toIndentedString(runningK8sNodeCount)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    dfLocalUrl: ").append(toIndentedString(dfLocalUrl)).append("\n");
    sb.append("    kubeApiAuthorizedIpRanges: ").append(toIndentedString(kubeApiAuthorizedIpRanges)).append("\n");
    sb.append("    activeInfoAlertCount: ").append(toIndentedString(activeInfoAlertCount)).append("\n");
    sb.append("    activeWarningAlertCount: ").append(toIndentedString(activeWarningAlertCount)).append("\n");
    sb.append("    activeErrorAlertCount: ").append(toIndentedString(activeErrorAlertCount)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    validActions: ").append(toIndentedString(validActions)).append("\n");
    sb.append("    usePublicLoadBalancer: ").append(toIndentedString(usePublicLoadBalancer)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    loadBalancerAuthorizedIpRanges: ").append(toIndentedString(loadBalancerAuthorizedIpRanges)).append("\n");
    sb.append("    clusterSubnets: ").append(toIndentedString(clusterSubnets)).append("\n");
    sb.append("    creatingK8sNodeCount: ").append(toIndentedString(creatingK8sNodeCount)).append("\n");
    sb.append("    terminatingK8sNodeCount: ").append(toIndentedString(terminatingK8sNodeCount)).append("\n");
    sb.append("    loadBalancerSubnets: ").append(toIndentedString(loadBalancerSubnets)).append("\n");
    sb.append("    privateCluster: ").append(toIndentedString(privateCluster)).append("\n");
    sb.append("    proxyName: ").append(toIndentedString(proxyName)).append("\n");
    sb.append("    k8sServerVersion: ").append(toIndentedString(k8sServerVersion)).append("\n");
    sb.append("    availableK8sVersionUpgrade: ").append(toIndentedString(availableK8sVersionUpgrade)).append("\n");
    sb.append("    userDefinedRouting: ").append(toIndentedString(userDefinedRouting)).append("\n");
    sb.append("    podCidr: ").append(toIndentedString(podCidr)).append("\n");
    sb.append("    serviceCidr: ").append(toIndentedString(serviceCidr)).append("\n");
    sb.append("    encryptionParameters: ").append(toIndentedString(encryptionParameters)).append("\n");
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

