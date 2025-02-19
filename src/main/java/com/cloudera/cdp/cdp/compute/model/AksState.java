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

package com.cloudera.cdp.compute.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.compute.model.AksInstanceGroup;
import com.cloudera.cdp.compute.model.CommonDeploymentsResp;
import com.cloudera.cdp.compute.model.CommonSecurityResp;
import java.util.*;
import java.util.Map;

/**
 * AKS state response structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-02-18T18:28:47.390-08:00")
public class AksState  {

  /**
   * Cloud provider.
   **/
  private String provider = null;

  /**
   * Cluster display name.
   **/
  private String clusterDisplayName = null;

  /**
   * The Cluster ResourceGroup. Filled based on Parent ResourceGroup or ClusterDisplayName.
   **/
  private String clusterResourceGroup = null;

  /**
   * Specifies whether ClusterResourceGroup was created or not.
   **/
  private Boolean clusterResourceGroupCreated = null;

  /**
   * Specifies whether httpApplicationRouting addon is enabled or not.
   **/
  private Boolean enableHttpApplicationRouting = null;

  /**
   * Specifies whether monitoring addon is enabled or not.
   **/
  private Boolean enableMonitoring = null;

  /**
   * The resource group for the Azure Log Analytics Workspace.
   **/
  private String logAnalyticsWorkspaceResourceGroup = null;

  /**
   * An existing Azure Log Analytics Workspace for monitoring addon.
   **/
  private String logAnalyticsWorkspace = null;

  /**
   * The resource group for the Azure Virtual Network. Composite of agent virtual network subnet ID.
   **/
  private String virtualNetworkResourceGroup = null;

  /**
   * An existing Azure Virtual Network. Composite of agent virtual network subnet ID.
   **/
  private String virtualNetwork = null;

  /**
   * An array specifying existing Azure Virtual Subnets. Composite of agent virtual network subnet IDs.
   **/
  private List<String> subnets = new ArrayList<String>();

  /**
   * Selected Subnet from the list that is provided
   **/
  private String selectedSubnet = null;

  /**
   * The ResourceGroup which may be used for almost all the Azure resources created (with VirtualNetwork and Node ResourceGroup being exceptions).
   **/
  private String parentResourceGroup = null;

  /**
   * The username to use for Linux VMs.
   **/
  private String adminUsername = null;

  /**
   * The content of the SSH configuration for Linux VMs, Opposite to sshPublicKey.
   **/
  private String sshPublicKeyContents = null;

  /**
   * The local path of the SSH configuration for Linux VMs, Opposite to sshPublicKeyContents.
   **/
  private String sshPublicKey = null;

  /**
   * An IP address assigned to the kubernetes DNS service, it must be within the kubernetes service address range specified in serviceCidr.
   **/
  private String dnsServiceIp = null;

  /**
   * A CIDR notation IP range assigned to the Docker bridge network, it must not overlap with any Azure Subnet IP ranges or the kubernetes service address range.
   **/
  private String dockerBridgeCidr = null;

  /**
   * The plugin used for kubernetes network.
   **/
  private String networkPlugin = null;

  /**
   * The policy used for kubernetes network.
   **/
  private String networkPolicy = null;

  /**
   * A CIDR notation IP range from which to assign pod IPs when networkPlugin is using kubenet.
   **/
  private String podCidr = null;

  /**
   * A CIDR notation IP range from which to assign service cluster IPs, it must not overlap with any Azure Subnet IP ranges.
   **/
  private String serviceCidr = null;

  /**
   * The actual CIDR ranges of the virtual network.
   **/
  private List<String> networkCidrs = new ArrayList<String>();

  /**
   * Ingress rules for worker nodes.
   **/
  private List<String> workerIngressRules = new ArrayList<String>();

  /**
   * Egress rules for worker nodes.
   **/
  private List<String> workerEgressRules = new ArrayList<String>();

  /**
   * DNS prefix used for hostnames in the cluster.
   **/
  private String masterDnsPrefix = null;

  /**
   * Tags.
   **/
  private Map<String, String> tags = new HashMap<String, String>();

  /**
   * Instance groups.
   **/
  private Map<String, AksInstanceGroup> instanceGroups = new HashMap<String, AksInstanceGroup>();

  /**
   * Deployments.
   **/
  private CommonDeploymentsResp deployments = null;

  /**
   * User data.
   **/
  private String userData = null;

  /**
   * Security.
   **/
  private CommonSecurityResp security = null;

  /**
   * Getter for provider.
   * Cloud provider.
   **/
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }

  /**
   * Setter for provider.
   * Cloud provider.
   **/
  public void setProvider(String provider) {
    this.provider = provider;
  }

  /**
   * Getter for clusterDisplayName.
   * Cluster display name.
   **/
  @JsonProperty("clusterDisplayName")
  public String getClusterDisplayName() {
    return clusterDisplayName;
  }

  /**
   * Setter for clusterDisplayName.
   * Cluster display name.
   **/
  public void setClusterDisplayName(String clusterDisplayName) {
    this.clusterDisplayName = clusterDisplayName;
  }

  /**
   * Getter for clusterResourceGroup.
   * The Cluster ResourceGroup. Filled based on Parent ResourceGroup or ClusterDisplayName.
   **/
  @JsonProperty("clusterResourceGroup")
  public String getClusterResourceGroup() {
    return clusterResourceGroup;
  }

  /**
   * Setter for clusterResourceGroup.
   * The Cluster ResourceGroup. Filled based on Parent ResourceGroup or ClusterDisplayName.
   **/
  public void setClusterResourceGroup(String clusterResourceGroup) {
    this.clusterResourceGroup = clusterResourceGroup;
  }

  /**
   * Getter for clusterResourceGroupCreated.
   * Specifies whether ClusterResourceGroup was created or not.
   **/
  @JsonProperty("clusterResourceGroupCreated")
  public Boolean getClusterResourceGroupCreated() {
    return clusterResourceGroupCreated;
  }

  /**
   * Setter for clusterResourceGroupCreated.
   * Specifies whether ClusterResourceGroup was created or not.
   **/
  public void setClusterResourceGroupCreated(Boolean clusterResourceGroupCreated) {
    this.clusterResourceGroupCreated = clusterResourceGroupCreated;
  }

  /**
   * Getter for enableHttpApplicationRouting.
   * Specifies whether httpApplicationRouting addon is enabled or not.
   **/
  @JsonProperty("enableHttpApplicationRouting")
  public Boolean getEnableHttpApplicationRouting() {
    return enableHttpApplicationRouting;
  }

  /**
   * Setter for enableHttpApplicationRouting.
   * Specifies whether httpApplicationRouting addon is enabled or not.
   **/
  public void setEnableHttpApplicationRouting(Boolean enableHttpApplicationRouting) {
    this.enableHttpApplicationRouting = enableHttpApplicationRouting;
  }

  /**
   * Getter for enableMonitoring.
   * Specifies whether monitoring addon is enabled or not.
   **/
  @JsonProperty("enableMonitoring")
  public Boolean getEnableMonitoring() {
    return enableMonitoring;
  }

  /**
   * Setter for enableMonitoring.
   * Specifies whether monitoring addon is enabled or not.
   **/
  public void setEnableMonitoring(Boolean enableMonitoring) {
    this.enableMonitoring = enableMonitoring;
  }

  /**
   * Getter for logAnalyticsWorkspaceResourceGroup.
   * The resource group for the Azure Log Analytics Workspace.
   **/
  @JsonProperty("logAnalyticsWorkspaceResourceGroup")
  public String getLogAnalyticsWorkspaceResourceGroup() {
    return logAnalyticsWorkspaceResourceGroup;
  }

  /**
   * Setter for logAnalyticsWorkspaceResourceGroup.
   * The resource group for the Azure Log Analytics Workspace.
   **/
  public void setLogAnalyticsWorkspaceResourceGroup(String logAnalyticsWorkspaceResourceGroup) {
    this.logAnalyticsWorkspaceResourceGroup = logAnalyticsWorkspaceResourceGroup;
  }

  /**
   * Getter for logAnalyticsWorkspace.
   * An existing Azure Log Analytics Workspace for monitoring addon.
   **/
  @JsonProperty("logAnalyticsWorkspace")
  public String getLogAnalyticsWorkspace() {
    return logAnalyticsWorkspace;
  }

  /**
   * Setter for logAnalyticsWorkspace.
   * An existing Azure Log Analytics Workspace for monitoring addon.
   **/
  public void setLogAnalyticsWorkspace(String logAnalyticsWorkspace) {
    this.logAnalyticsWorkspace = logAnalyticsWorkspace;
  }

  /**
   * Getter for virtualNetworkResourceGroup.
   * The resource group for the Azure Virtual Network. Composite of agent virtual network subnet ID.
   **/
  @JsonProperty("virtualNetworkResourceGroup")
  public String getVirtualNetworkResourceGroup() {
    return virtualNetworkResourceGroup;
  }

  /**
   * Setter for virtualNetworkResourceGroup.
   * The resource group for the Azure Virtual Network. Composite of agent virtual network subnet ID.
   **/
  public void setVirtualNetworkResourceGroup(String virtualNetworkResourceGroup) {
    this.virtualNetworkResourceGroup = virtualNetworkResourceGroup;
  }

  /**
   * Getter for virtualNetwork.
   * An existing Azure Virtual Network. Composite of agent virtual network subnet ID.
   **/
  @JsonProperty("virtualNetwork")
  public String getVirtualNetwork() {
    return virtualNetwork;
  }

  /**
   * Setter for virtualNetwork.
   * An existing Azure Virtual Network. Composite of agent virtual network subnet ID.
   **/
  public void setVirtualNetwork(String virtualNetwork) {
    this.virtualNetwork = virtualNetwork;
  }

  /**
   * Getter for subnets.
   * An array specifying existing Azure Virtual Subnets. Composite of agent virtual network subnet IDs.
   **/
  @JsonProperty("subnets")
  public List<String> getSubnets() {
    return subnets;
  }

  /**
   * Setter for subnets.
   * An array specifying existing Azure Virtual Subnets. Composite of agent virtual network subnet IDs.
   **/
  public void setSubnets(List<String> subnets) {
    this.subnets = subnets;
  }

  /**
   * Getter for selectedSubnet.
   * Selected Subnet from the list that is provided
   **/
  @JsonProperty("selectedSubnet")
  public String getSelectedSubnet() {
    return selectedSubnet;
  }

  /**
   * Setter for selectedSubnet.
   * Selected Subnet from the list that is provided
   **/
  public void setSelectedSubnet(String selectedSubnet) {
    this.selectedSubnet = selectedSubnet;
  }

  /**
   * Getter for parentResourceGroup.
   * The ResourceGroup which may be used for almost all the Azure resources created (with VirtualNetwork and Node ResourceGroup being exceptions).
   **/
  @JsonProperty("parentResourceGroup")
  public String getParentResourceGroup() {
    return parentResourceGroup;
  }

  /**
   * Setter for parentResourceGroup.
   * The ResourceGroup which may be used for almost all the Azure resources created (with VirtualNetwork and Node ResourceGroup being exceptions).
   **/
  public void setParentResourceGroup(String parentResourceGroup) {
    this.parentResourceGroup = parentResourceGroup;
  }

  /**
   * Getter for adminUsername.
   * The username to use for Linux VMs.
   **/
  @JsonProperty("adminUsername")
  public String getAdminUsername() {
    return adminUsername;
  }

  /**
   * Setter for adminUsername.
   * The username to use for Linux VMs.
   **/
  public void setAdminUsername(String adminUsername) {
    this.adminUsername = adminUsername;
  }

  /**
   * Getter for sshPublicKeyContents.
   * The content of the SSH configuration for Linux VMs, Opposite to sshPublicKey.
   **/
  @JsonProperty("sshPublicKeyContents")
  public String getSshPublicKeyContents() {
    return sshPublicKeyContents;
  }

  /**
   * Setter for sshPublicKeyContents.
   * The content of the SSH configuration for Linux VMs, Opposite to sshPublicKey.
   **/
  public void setSshPublicKeyContents(String sshPublicKeyContents) {
    this.sshPublicKeyContents = sshPublicKeyContents;
  }

  /**
   * Getter for sshPublicKey.
   * The local path of the SSH configuration for Linux VMs, Opposite to sshPublicKeyContents.
   **/
  @JsonProperty("sshPublicKey")
  public String getSshPublicKey() {
    return sshPublicKey;
  }

  /**
   * Setter for sshPublicKey.
   * The local path of the SSH configuration for Linux VMs, Opposite to sshPublicKeyContents.
   **/
  public void setSshPublicKey(String sshPublicKey) {
    this.sshPublicKey = sshPublicKey;
  }

  /**
   * Getter for dnsServiceIp.
   * An IP address assigned to the kubernetes DNS service, it must be within the kubernetes service address range specified in serviceCidr.
   **/
  @JsonProperty("dnsServiceIp")
  public String getDnsServiceIp() {
    return dnsServiceIp;
  }

  /**
   * Setter for dnsServiceIp.
   * An IP address assigned to the kubernetes DNS service, it must be within the kubernetes service address range specified in serviceCidr.
   **/
  public void setDnsServiceIp(String dnsServiceIp) {
    this.dnsServiceIp = dnsServiceIp;
  }

  /**
   * Getter for dockerBridgeCidr.
   * A CIDR notation IP range assigned to the Docker bridge network, it must not overlap with any Azure Subnet IP ranges or the kubernetes service address range.
   **/
  @JsonProperty("dockerBridgeCidr")
  public String getDockerBridgeCidr() {
    return dockerBridgeCidr;
  }

  /**
   * Setter for dockerBridgeCidr.
   * A CIDR notation IP range assigned to the Docker bridge network, it must not overlap with any Azure Subnet IP ranges or the kubernetes service address range.
   **/
  public void setDockerBridgeCidr(String dockerBridgeCidr) {
    this.dockerBridgeCidr = dockerBridgeCidr;
  }

  /**
   * Getter for networkPlugin.
   * The plugin used for kubernetes network.
   **/
  @JsonProperty("networkPlugin")
  public String getNetworkPlugin() {
    return networkPlugin;
  }

  /**
   * Setter for networkPlugin.
   * The plugin used for kubernetes network.
   **/
  public void setNetworkPlugin(String networkPlugin) {
    this.networkPlugin = networkPlugin;
  }

  /**
   * Getter for networkPolicy.
   * The policy used for kubernetes network.
   **/
  @JsonProperty("networkPolicy")
  public String getNetworkPolicy() {
    return networkPolicy;
  }

  /**
   * Setter for networkPolicy.
   * The policy used for kubernetes network.
   **/
  public void setNetworkPolicy(String networkPolicy) {
    this.networkPolicy = networkPolicy;
  }

  /**
   * Getter for podCidr.
   * A CIDR notation IP range from which to assign pod IPs when networkPlugin is using kubenet.
   **/
  @JsonProperty("podCidr")
  public String getPodCidr() {
    return podCidr;
  }

  /**
   * Setter for podCidr.
   * A CIDR notation IP range from which to assign pod IPs when networkPlugin is using kubenet.
   **/
  public void setPodCidr(String podCidr) {
    this.podCidr = podCidr;
  }

  /**
   * Getter for serviceCidr.
   * A CIDR notation IP range from which to assign service cluster IPs, it must not overlap with any Azure Subnet IP ranges.
   **/
  @JsonProperty("serviceCidr")
  public String getServiceCidr() {
    return serviceCidr;
  }

  /**
   * Setter for serviceCidr.
   * A CIDR notation IP range from which to assign service cluster IPs, it must not overlap with any Azure Subnet IP ranges.
   **/
  public void setServiceCidr(String serviceCidr) {
    this.serviceCidr = serviceCidr;
  }

  /**
   * Getter for networkCidrs.
   * The actual CIDR ranges of the virtual network.
   **/
  @JsonProperty("networkCidrs")
  public List<String> getNetworkCidrs() {
    return networkCidrs;
  }

  /**
   * Setter for networkCidrs.
   * The actual CIDR ranges of the virtual network.
   **/
  public void setNetworkCidrs(List<String> networkCidrs) {
    this.networkCidrs = networkCidrs;
  }

  /**
   * Getter for workerIngressRules.
   * Ingress rules for worker nodes.
   **/
  @JsonProperty("workerIngressRules")
  public List<String> getWorkerIngressRules() {
    return workerIngressRules;
  }

  /**
   * Setter for workerIngressRules.
   * Ingress rules for worker nodes.
   **/
  public void setWorkerIngressRules(List<String> workerIngressRules) {
    this.workerIngressRules = workerIngressRules;
  }

  /**
   * Getter for workerEgressRules.
   * Egress rules for worker nodes.
   **/
  @JsonProperty("workerEgressRules")
  public List<String> getWorkerEgressRules() {
    return workerEgressRules;
  }

  /**
   * Setter for workerEgressRules.
   * Egress rules for worker nodes.
   **/
  public void setWorkerEgressRules(List<String> workerEgressRules) {
    this.workerEgressRules = workerEgressRules;
  }

  /**
   * Getter for masterDnsPrefix.
   * DNS prefix used for hostnames in the cluster.
   **/
  @JsonProperty("masterDnsPrefix")
  public String getMasterDnsPrefix() {
    return masterDnsPrefix;
  }

  /**
   * Setter for masterDnsPrefix.
   * DNS prefix used for hostnames in the cluster.
   **/
  public void setMasterDnsPrefix(String masterDnsPrefix) {
    this.masterDnsPrefix = masterDnsPrefix;
  }

  /**
   * Getter for tags.
   * Tags.
   **/
  @JsonProperty("tags")
  public Map<String, String> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Tags.
   **/
  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  /**
   * Getter for instanceGroups.
   * Instance groups.
   **/
  @JsonProperty("instanceGroups")
  public Map<String, AksInstanceGroup> getInstanceGroups() {
    return instanceGroups;
  }

  /**
   * Setter for instanceGroups.
   * Instance groups.
   **/
  public void setInstanceGroups(Map<String, AksInstanceGroup> instanceGroups) {
    this.instanceGroups = instanceGroups;
  }

  /**
   * Getter for deployments.
   * Deployments.
   **/
  @JsonProperty("deployments")
  public CommonDeploymentsResp getDeployments() {
    return deployments;
  }

  /**
   * Setter for deployments.
   * Deployments.
   **/
  public void setDeployments(CommonDeploymentsResp deployments) {
    this.deployments = deployments;
  }

  /**
   * Getter for userData.
   * User data.
   **/
  @JsonProperty("userData")
  public String getUserData() {
    return userData;
  }

  /**
   * Setter for userData.
   * User data.
   **/
  public void setUserData(String userData) {
    this.userData = userData;
  }

  /**
   * Getter for security.
   * Security.
   **/
  @JsonProperty("security")
  public CommonSecurityResp getSecurity() {
    return security;
  }

  /**
   * Setter for security.
   * Security.
   **/
  public void setSecurity(CommonSecurityResp security) {
    this.security = security;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AksState aksState = (AksState) o;
    if (!Objects.equals(this.provider, aksState.provider)) {
      return false;
    }
    if (!Objects.equals(this.clusterDisplayName, aksState.clusterDisplayName)) {
      return false;
    }
    if (!Objects.equals(this.clusterResourceGroup, aksState.clusterResourceGroup)) {
      return false;
    }
    if (!Objects.equals(this.clusterResourceGroupCreated, aksState.clusterResourceGroupCreated)) {
      return false;
    }
    if (!Objects.equals(this.enableHttpApplicationRouting, aksState.enableHttpApplicationRouting)) {
      return false;
    }
    if (!Objects.equals(this.enableMonitoring, aksState.enableMonitoring)) {
      return false;
    }
    if (!Objects.equals(this.logAnalyticsWorkspaceResourceGroup, aksState.logAnalyticsWorkspaceResourceGroup)) {
      return false;
    }
    if (!Objects.equals(this.logAnalyticsWorkspace, aksState.logAnalyticsWorkspace)) {
      return false;
    }
    if (!Objects.equals(this.virtualNetworkResourceGroup, aksState.virtualNetworkResourceGroup)) {
      return false;
    }
    if (!Objects.equals(this.virtualNetwork, aksState.virtualNetwork)) {
      return false;
    }
    if (!Objects.equals(this.subnets, aksState.subnets)) {
      return false;
    }
    if (!Objects.equals(this.selectedSubnet, aksState.selectedSubnet)) {
      return false;
    }
    if (!Objects.equals(this.parentResourceGroup, aksState.parentResourceGroup)) {
      return false;
    }
    if (!Objects.equals(this.adminUsername, aksState.adminUsername)) {
      return false;
    }
    if (!Objects.equals(this.sshPublicKeyContents, aksState.sshPublicKeyContents)) {
      return false;
    }
    if (!Objects.equals(this.sshPublicKey, aksState.sshPublicKey)) {
      return false;
    }
    if (!Objects.equals(this.dnsServiceIp, aksState.dnsServiceIp)) {
      return false;
    }
    if (!Objects.equals(this.dockerBridgeCidr, aksState.dockerBridgeCidr)) {
      return false;
    }
    if (!Objects.equals(this.networkPlugin, aksState.networkPlugin)) {
      return false;
    }
    if (!Objects.equals(this.networkPolicy, aksState.networkPolicy)) {
      return false;
    }
    if (!Objects.equals(this.podCidr, aksState.podCidr)) {
      return false;
    }
    if (!Objects.equals(this.serviceCidr, aksState.serviceCidr)) {
      return false;
    }
    if (!Objects.equals(this.networkCidrs, aksState.networkCidrs)) {
      return false;
    }
    if (!Objects.equals(this.workerIngressRules, aksState.workerIngressRules)) {
      return false;
    }
    if (!Objects.equals(this.workerEgressRules, aksState.workerEgressRules)) {
      return false;
    }
    if (!Objects.equals(this.masterDnsPrefix, aksState.masterDnsPrefix)) {
      return false;
    }
    if (!Objects.equals(this.tags, aksState.tags)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroups, aksState.instanceGroups)) {
      return false;
    }
    if (!Objects.equals(this.deployments, aksState.deployments)) {
      return false;
    }
    if (!Objects.equals(this.userData, aksState.userData)) {
      return false;
    }
    if (!Objects.equals(this.security, aksState.security)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, clusterDisplayName, clusterResourceGroup, clusterResourceGroupCreated, enableHttpApplicationRouting, enableMonitoring, logAnalyticsWorkspaceResourceGroup, logAnalyticsWorkspace, virtualNetworkResourceGroup, virtualNetwork, subnets, selectedSubnet, parentResourceGroup, adminUsername, sshPublicKeyContents, sshPublicKey, dnsServiceIp, dockerBridgeCidr, networkPlugin, networkPolicy, podCidr, serviceCidr, networkCidrs, workerIngressRules, workerEgressRules, masterDnsPrefix, tags, instanceGroups, deployments, userData, security);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AksState {\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    clusterDisplayName: ").append(toIndentedString(clusterDisplayName)).append("\n");
    sb.append("    clusterResourceGroup: ").append(toIndentedString(clusterResourceGroup)).append("\n");
    sb.append("    clusterResourceGroupCreated: ").append(toIndentedString(clusterResourceGroupCreated)).append("\n");
    sb.append("    enableHttpApplicationRouting: ").append(toIndentedString(enableHttpApplicationRouting)).append("\n");
    sb.append("    enableMonitoring: ").append(toIndentedString(enableMonitoring)).append("\n");
    sb.append("    logAnalyticsWorkspaceResourceGroup: ").append(toIndentedString(logAnalyticsWorkspaceResourceGroup)).append("\n");
    sb.append("    logAnalyticsWorkspace: ").append(toIndentedString(logAnalyticsWorkspace)).append("\n");
    sb.append("    virtualNetworkResourceGroup: ").append(toIndentedString(virtualNetworkResourceGroup)).append("\n");
    sb.append("    virtualNetwork: ").append(toIndentedString(virtualNetwork)).append("\n");
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
    sb.append("    selectedSubnet: ").append(toIndentedString(selectedSubnet)).append("\n");
    sb.append("    parentResourceGroup: ").append(toIndentedString(parentResourceGroup)).append("\n");
    sb.append("    adminUsername: ").append(toIndentedString(adminUsername)).append("\n");
    sb.append("    sshPublicKeyContents: ").append(toIndentedString(sshPublicKeyContents)).append("\n");
    sb.append("    sshPublicKey: ").append(toIndentedString(sshPublicKey)).append("\n");
    sb.append("    dnsServiceIp: ").append(toIndentedString(dnsServiceIp)).append("\n");
    sb.append("    dockerBridgeCidr: ").append(toIndentedString(dockerBridgeCidr)).append("\n");
    sb.append("    networkPlugin: ").append(toIndentedString(networkPlugin)).append("\n");
    sb.append("    networkPolicy: ").append(toIndentedString(networkPolicy)).append("\n");
    sb.append("    podCidr: ").append(toIndentedString(podCidr)).append("\n");
    sb.append("    serviceCidr: ").append(toIndentedString(serviceCidr)).append("\n");
    sb.append("    networkCidrs: ").append(toIndentedString(networkCidrs)).append("\n");
    sb.append("    workerIngressRules: ").append(toIndentedString(workerIngressRules)).append("\n");
    sb.append("    workerEgressRules: ").append(toIndentedString(workerEgressRules)).append("\n");
    sb.append("    masterDnsPrefix: ").append(toIndentedString(masterDnsPrefix)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    instanceGroups: ").append(toIndentedString(instanceGroups)).append("\n");
    sb.append("    deployments: ").append(toIndentedString(deployments)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
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

