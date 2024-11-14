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
import com.cloudera.cdp.compute.model.CommonDeploymentsResp;
import com.cloudera.cdp.compute.model.CommonSecurityResp;
import com.cloudera.cdp.compute.model.EksInstanceGroup;
import java.util.*;
import java.util.Map;

/**
 * EKS state response structure.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-11-13T12:48:28.434-08:00")
public class EksState  {

  /**
   * Provider.
   **/
  private String provider = null;

  /**
   * Cluster display name.
   **/
  private String clusterDisplayName = null;

  /**
   * User data for this cluster.
   **/
  private String userData = null;

  /**
   * Virtual network details.
   **/
  private String virtualNetwork = null;

  /**
   * Existing virtual network if used.
   **/
  private Boolean existingVirtualNetwork = null;

  /**
   * Subnets.
   **/
  private List<String> subnets = new ArrayList<String>();

  /**
   * Worker subnets.
   **/
  private List<String> workerSubnets = new ArrayList<String>();

  /**
   * Security groups.
   **/
  private List<String> securityGroups = new ArrayList<String>();

  /**
   * Service role.
   **/
  private String serviceRole = null;

  /**
   * Worker instance profile.
   **/
  private String workerInstanceProfile = null;

  /**
   * Associate worker node public IP.
   **/
  private Boolean associateWorkerNodePublicIp = null;

  /**
   * VPC CIDR.
   **/
  private String vpcCidr = null;

  /**
   * Ingress rules for worker nodes.
   **/
  private List<String> workerIngressRules = new ArrayList<String>();

  /**
   * Egress rules for worker nodes.
   **/
  private List<String> workerEgressRules = new ArrayList<String>();

  /**
   * Worker security group.
   **/
  private String workerSecurityGroup = null;

  /**
   * Telemetry enabled.
   **/
  private Boolean telemetryEnabled = null;

  /**
   * Telemetry logging enabled.
   **/
  private Boolean telemetryLoggingEnabled = null;

  /**
   * Telemetry logging storage location.
   **/
  private String telemetryLoggingStorageLocation = null;

  /**
   * Telemetry logging bucket.
   **/
  private String telemetryLoggingBucket = null;

  /**
   * Telemetry logging root dir.
   **/
  private String telemetryLoggingRootDir = null;

  /**
   * Telemetry logging root dir.
   **/
  private String telemetryKmsKeyArn = null;

  /**
   * Tags.
   **/
  private Map<String, String> tags = new HashMap<String, String>();

  /**
   * SSH key pair name.
   **/
  private String sshKeyPairName = null;

  /**
   * KMS key ARN.
   **/
  private String kmsKeyArn = null;

  /**
   * Instance groups.
   **/
  private Map<String, EksInstanceGroup> instanceGroups = new HashMap<String, EksInstanceGroup>();

  /**
   * Deployments.
   **/
  private CommonDeploymentsResp deployments = null;

  /**
   * SSH public key.
   **/
  private String sshPublicKey = null;

  /**
   * Network plugin.
   **/
  private String networkPlugin = null;

  /**
   * Service CIDR.
   **/
  private String serviceCidr = null;

  /**
   * Array of inbound proxy CIDRs.
   **/
  private List<String> inboundProxyCidrs = new ArrayList<String>();

  /**
   * Security.
   **/
  private CommonSecurityResp security = null;

  /**
   * Suspended processes.
   **/
  private List<String> suspendedProcesses = new ArrayList<String>();

  /**
   * Whether CSI is enabled.
   **/
  private Boolean csiEnabled = null;

  /**
   * Getter for provider.
   * Provider.
   **/
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }

  /**
   * Setter for provider.
   * Provider.
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
   * Getter for userData.
   * User data for this cluster.
   **/
  @JsonProperty("userData")
  public String getUserData() {
    return userData;
  }

  /**
   * Setter for userData.
   * User data for this cluster.
   **/
  public void setUserData(String userData) {
    this.userData = userData;
  }

  /**
   * Getter for virtualNetwork.
   * Virtual network details.
   **/
  @JsonProperty("virtualNetwork")
  public String getVirtualNetwork() {
    return virtualNetwork;
  }

  /**
   * Setter for virtualNetwork.
   * Virtual network details.
   **/
  public void setVirtualNetwork(String virtualNetwork) {
    this.virtualNetwork = virtualNetwork;
  }

  /**
   * Getter for existingVirtualNetwork.
   * Existing virtual network if used.
   **/
  @JsonProperty("existingVirtualNetwork")
  public Boolean getExistingVirtualNetwork() {
    return existingVirtualNetwork;
  }

  /**
   * Setter for existingVirtualNetwork.
   * Existing virtual network if used.
   **/
  public void setExistingVirtualNetwork(Boolean existingVirtualNetwork) {
    this.existingVirtualNetwork = existingVirtualNetwork;
  }

  /**
   * Getter for subnets.
   * Subnets.
   **/
  @JsonProperty("subnets")
  public List<String> getSubnets() {
    return subnets;
  }

  /**
   * Setter for subnets.
   * Subnets.
   **/
  public void setSubnets(List<String> subnets) {
    this.subnets = subnets;
  }

  /**
   * Getter for workerSubnets.
   * Worker subnets.
   **/
  @JsonProperty("workerSubnets")
  public List<String> getWorkerSubnets() {
    return workerSubnets;
  }

  /**
   * Setter for workerSubnets.
   * Worker subnets.
   **/
  public void setWorkerSubnets(List<String> workerSubnets) {
    this.workerSubnets = workerSubnets;
  }

  /**
   * Getter for securityGroups.
   * Security groups.
   **/
  @JsonProperty("securityGroups")
  public List<String> getSecurityGroups() {
    return securityGroups;
  }

  /**
   * Setter for securityGroups.
   * Security groups.
   **/
  public void setSecurityGroups(List<String> securityGroups) {
    this.securityGroups = securityGroups;
  }

  /**
   * Getter for serviceRole.
   * Service role.
   **/
  @JsonProperty("serviceRole")
  public String getServiceRole() {
    return serviceRole;
  }

  /**
   * Setter for serviceRole.
   * Service role.
   **/
  public void setServiceRole(String serviceRole) {
    this.serviceRole = serviceRole;
  }

  /**
   * Getter for workerInstanceProfile.
   * Worker instance profile.
   **/
  @JsonProperty("workerInstanceProfile")
  public String getWorkerInstanceProfile() {
    return workerInstanceProfile;
  }

  /**
   * Setter for workerInstanceProfile.
   * Worker instance profile.
   **/
  public void setWorkerInstanceProfile(String workerInstanceProfile) {
    this.workerInstanceProfile = workerInstanceProfile;
  }

  /**
   * Getter for associateWorkerNodePublicIp.
   * Associate worker node public IP.
   **/
  @JsonProperty("associateWorkerNodePublicIp")
  public Boolean getAssociateWorkerNodePublicIp() {
    return associateWorkerNodePublicIp;
  }

  /**
   * Setter for associateWorkerNodePublicIp.
   * Associate worker node public IP.
   **/
  public void setAssociateWorkerNodePublicIp(Boolean associateWorkerNodePublicIp) {
    this.associateWorkerNodePublicIp = associateWorkerNodePublicIp;
  }

  /**
   * Getter for vpcCidr.
   * VPC CIDR.
   **/
  @JsonProperty("vpcCidr")
  public String getVpcCidr() {
    return vpcCidr;
  }

  /**
   * Setter for vpcCidr.
   * VPC CIDR.
   **/
  public void setVpcCidr(String vpcCidr) {
    this.vpcCidr = vpcCidr;
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
   * Getter for workerSecurityGroup.
   * Worker security group.
   **/
  @JsonProperty("workerSecurityGroup")
  public String getWorkerSecurityGroup() {
    return workerSecurityGroup;
  }

  /**
   * Setter for workerSecurityGroup.
   * Worker security group.
   **/
  public void setWorkerSecurityGroup(String workerSecurityGroup) {
    this.workerSecurityGroup = workerSecurityGroup;
  }

  /**
   * Getter for telemetryEnabled.
   * Telemetry enabled.
   **/
  @JsonProperty("telemetryEnabled")
  public Boolean getTelemetryEnabled() {
    return telemetryEnabled;
  }

  /**
   * Setter for telemetryEnabled.
   * Telemetry enabled.
   **/
  public void setTelemetryEnabled(Boolean telemetryEnabled) {
    this.telemetryEnabled = telemetryEnabled;
  }

  /**
   * Getter for telemetryLoggingEnabled.
   * Telemetry logging enabled.
   **/
  @JsonProperty("telemetryLoggingEnabled")
  public Boolean getTelemetryLoggingEnabled() {
    return telemetryLoggingEnabled;
  }

  /**
   * Setter for telemetryLoggingEnabled.
   * Telemetry logging enabled.
   **/
  public void setTelemetryLoggingEnabled(Boolean telemetryLoggingEnabled) {
    this.telemetryLoggingEnabled = telemetryLoggingEnabled;
  }

  /**
   * Getter for telemetryLoggingStorageLocation.
   * Telemetry logging storage location.
   **/
  @JsonProperty("telemetryLoggingStorageLocation")
  public String getTelemetryLoggingStorageLocation() {
    return telemetryLoggingStorageLocation;
  }

  /**
   * Setter for telemetryLoggingStorageLocation.
   * Telemetry logging storage location.
   **/
  public void setTelemetryLoggingStorageLocation(String telemetryLoggingStorageLocation) {
    this.telemetryLoggingStorageLocation = telemetryLoggingStorageLocation;
  }

  /**
   * Getter for telemetryLoggingBucket.
   * Telemetry logging bucket.
   **/
  @JsonProperty("telemetryLoggingBucket")
  public String getTelemetryLoggingBucket() {
    return telemetryLoggingBucket;
  }

  /**
   * Setter for telemetryLoggingBucket.
   * Telemetry logging bucket.
   **/
  public void setTelemetryLoggingBucket(String telemetryLoggingBucket) {
    this.telemetryLoggingBucket = telemetryLoggingBucket;
  }

  /**
   * Getter for telemetryLoggingRootDir.
   * Telemetry logging root dir.
   **/
  @JsonProperty("telemetryLoggingRootDir")
  public String getTelemetryLoggingRootDir() {
    return telemetryLoggingRootDir;
  }

  /**
   * Setter for telemetryLoggingRootDir.
   * Telemetry logging root dir.
   **/
  public void setTelemetryLoggingRootDir(String telemetryLoggingRootDir) {
    this.telemetryLoggingRootDir = telemetryLoggingRootDir;
  }

  /**
   * Getter for telemetryKmsKeyArn.
   * Telemetry logging root dir.
   **/
  @JsonProperty("telemetryKmsKeyArn")
  public String getTelemetryKmsKeyArn() {
    return telemetryKmsKeyArn;
  }

  /**
   * Setter for telemetryKmsKeyArn.
   * Telemetry logging root dir.
   **/
  public void setTelemetryKmsKeyArn(String telemetryKmsKeyArn) {
    this.telemetryKmsKeyArn = telemetryKmsKeyArn;
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
   * Getter for sshKeyPairName.
   * SSH key pair name.
   **/
  @JsonProperty("sshKeyPairName")
  public String getSshKeyPairName() {
    return sshKeyPairName;
  }

  /**
   * Setter for sshKeyPairName.
   * SSH key pair name.
   **/
  public void setSshKeyPairName(String sshKeyPairName) {
    this.sshKeyPairName = sshKeyPairName;
  }

  /**
   * Getter for kmsKeyArn.
   * KMS key ARN.
   **/
  @JsonProperty("kmsKeyArn")
  public String getKmsKeyArn() {
    return kmsKeyArn;
  }

  /**
   * Setter for kmsKeyArn.
   * KMS key ARN.
   **/
  public void setKmsKeyArn(String kmsKeyArn) {
    this.kmsKeyArn = kmsKeyArn;
  }

  /**
   * Getter for instanceGroups.
   * Instance groups.
   **/
  @JsonProperty("instanceGroups")
  public Map<String, EksInstanceGroup> getInstanceGroups() {
    return instanceGroups;
  }

  /**
   * Setter for instanceGroups.
   * Instance groups.
   **/
  public void setInstanceGroups(Map<String, EksInstanceGroup> instanceGroups) {
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
   * Getter for sshPublicKey.
   * SSH public key.
   **/
  @JsonProperty("sshPublicKey")
  public String getSshPublicKey() {
    return sshPublicKey;
  }

  /**
   * Setter for sshPublicKey.
   * SSH public key.
   **/
  public void setSshPublicKey(String sshPublicKey) {
    this.sshPublicKey = sshPublicKey;
  }

  /**
   * Getter for networkPlugin.
   * Network plugin.
   **/
  @JsonProperty("networkPlugin")
  public String getNetworkPlugin() {
    return networkPlugin;
  }

  /**
   * Setter for networkPlugin.
   * Network plugin.
   **/
  public void setNetworkPlugin(String networkPlugin) {
    this.networkPlugin = networkPlugin;
  }

  /**
   * Getter for serviceCidr.
   * Service CIDR.
   **/
  @JsonProperty("serviceCidr")
  public String getServiceCidr() {
    return serviceCidr;
  }

  /**
   * Setter for serviceCidr.
   * Service CIDR.
   **/
  public void setServiceCidr(String serviceCidr) {
    this.serviceCidr = serviceCidr;
  }

  /**
   * Getter for inboundProxyCidrs.
   * Array of inbound proxy CIDRs.
   **/
  @JsonProperty("inboundProxyCidrs")
  public List<String> getInboundProxyCidrs() {
    return inboundProxyCidrs;
  }

  /**
   * Setter for inboundProxyCidrs.
   * Array of inbound proxy CIDRs.
   **/
  public void setInboundProxyCidrs(List<String> inboundProxyCidrs) {
    this.inboundProxyCidrs = inboundProxyCidrs;
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

  /**
   * Getter for suspendedProcesses.
   * Suspended processes.
   **/
  @JsonProperty("suspendedProcesses")
  public List<String> getSuspendedProcesses() {
    return suspendedProcesses;
  }

  /**
   * Setter for suspendedProcesses.
   * Suspended processes.
   **/
  public void setSuspendedProcesses(List<String> suspendedProcesses) {
    this.suspendedProcesses = suspendedProcesses;
  }

  /**
   * Getter for csiEnabled.
   * Whether CSI is enabled.
   **/
  @JsonProperty("csiEnabled")
  public Boolean getCsiEnabled() {
    return csiEnabled;
  }

  /**
   * Setter for csiEnabled.
   * Whether CSI is enabled.
   **/
  public void setCsiEnabled(Boolean csiEnabled) {
    this.csiEnabled = csiEnabled;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EksState eksState = (EksState) o;
    if (!Objects.equals(this.provider, eksState.provider)) {
      return false;
    }
    if (!Objects.equals(this.clusterDisplayName, eksState.clusterDisplayName)) {
      return false;
    }
    if (!Objects.equals(this.userData, eksState.userData)) {
      return false;
    }
    if (!Objects.equals(this.virtualNetwork, eksState.virtualNetwork)) {
      return false;
    }
    if (!Objects.equals(this.existingVirtualNetwork, eksState.existingVirtualNetwork)) {
      return false;
    }
    if (!Objects.equals(this.subnets, eksState.subnets)) {
      return false;
    }
    if (!Objects.equals(this.workerSubnets, eksState.workerSubnets)) {
      return false;
    }
    if (!Objects.equals(this.securityGroups, eksState.securityGroups)) {
      return false;
    }
    if (!Objects.equals(this.serviceRole, eksState.serviceRole)) {
      return false;
    }
    if (!Objects.equals(this.workerInstanceProfile, eksState.workerInstanceProfile)) {
      return false;
    }
    if (!Objects.equals(this.associateWorkerNodePublicIp, eksState.associateWorkerNodePublicIp)) {
      return false;
    }
    if (!Objects.equals(this.vpcCidr, eksState.vpcCidr)) {
      return false;
    }
    if (!Objects.equals(this.workerIngressRules, eksState.workerIngressRules)) {
      return false;
    }
    if (!Objects.equals(this.workerEgressRules, eksState.workerEgressRules)) {
      return false;
    }
    if (!Objects.equals(this.workerSecurityGroup, eksState.workerSecurityGroup)) {
      return false;
    }
    if (!Objects.equals(this.telemetryEnabled, eksState.telemetryEnabled)) {
      return false;
    }
    if (!Objects.equals(this.telemetryLoggingEnabled, eksState.telemetryLoggingEnabled)) {
      return false;
    }
    if (!Objects.equals(this.telemetryLoggingStorageLocation, eksState.telemetryLoggingStorageLocation)) {
      return false;
    }
    if (!Objects.equals(this.telemetryLoggingBucket, eksState.telemetryLoggingBucket)) {
      return false;
    }
    if (!Objects.equals(this.telemetryLoggingRootDir, eksState.telemetryLoggingRootDir)) {
      return false;
    }
    if (!Objects.equals(this.telemetryKmsKeyArn, eksState.telemetryKmsKeyArn)) {
      return false;
    }
    if (!Objects.equals(this.tags, eksState.tags)) {
      return false;
    }
    if (!Objects.equals(this.sshKeyPairName, eksState.sshKeyPairName)) {
      return false;
    }
    if (!Objects.equals(this.kmsKeyArn, eksState.kmsKeyArn)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroups, eksState.instanceGroups)) {
      return false;
    }
    if (!Objects.equals(this.deployments, eksState.deployments)) {
      return false;
    }
    if (!Objects.equals(this.sshPublicKey, eksState.sshPublicKey)) {
      return false;
    }
    if (!Objects.equals(this.networkPlugin, eksState.networkPlugin)) {
      return false;
    }
    if (!Objects.equals(this.serviceCidr, eksState.serviceCidr)) {
      return false;
    }
    if (!Objects.equals(this.inboundProxyCidrs, eksState.inboundProxyCidrs)) {
      return false;
    }
    if (!Objects.equals(this.security, eksState.security)) {
      return false;
    }
    if (!Objects.equals(this.suspendedProcesses, eksState.suspendedProcesses)) {
      return false;
    }
    if (!Objects.equals(this.csiEnabled, eksState.csiEnabled)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, clusterDisplayName, userData, virtualNetwork, existingVirtualNetwork, subnets, workerSubnets, securityGroups, serviceRole, workerInstanceProfile, associateWorkerNodePublicIp, vpcCidr, workerIngressRules, workerEgressRules, workerSecurityGroup, telemetryEnabled, telemetryLoggingEnabled, telemetryLoggingStorageLocation, telemetryLoggingBucket, telemetryLoggingRootDir, telemetryKmsKeyArn, tags, sshKeyPairName, kmsKeyArn, instanceGroups, deployments, sshPublicKey, networkPlugin, serviceCidr, inboundProxyCidrs, security, suspendedProcesses, csiEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EksState {\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    clusterDisplayName: ").append(toIndentedString(clusterDisplayName)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    virtualNetwork: ").append(toIndentedString(virtualNetwork)).append("\n");
    sb.append("    existingVirtualNetwork: ").append(toIndentedString(existingVirtualNetwork)).append("\n");
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
    sb.append("    workerSubnets: ").append(toIndentedString(workerSubnets)).append("\n");
    sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
    sb.append("    serviceRole: ").append(toIndentedString(serviceRole)).append("\n");
    sb.append("    workerInstanceProfile: ").append(toIndentedString(workerInstanceProfile)).append("\n");
    sb.append("    associateWorkerNodePublicIp: ").append(toIndentedString(associateWorkerNodePublicIp)).append("\n");
    sb.append("    vpcCidr: ").append(toIndentedString(vpcCidr)).append("\n");
    sb.append("    workerIngressRules: ").append(toIndentedString(workerIngressRules)).append("\n");
    sb.append("    workerEgressRules: ").append(toIndentedString(workerEgressRules)).append("\n");
    sb.append("    workerSecurityGroup: ").append(toIndentedString(workerSecurityGroup)).append("\n");
    sb.append("    telemetryEnabled: ").append(toIndentedString(telemetryEnabled)).append("\n");
    sb.append("    telemetryLoggingEnabled: ").append(toIndentedString(telemetryLoggingEnabled)).append("\n");
    sb.append("    telemetryLoggingStorageLocation: ").append(toIndentedString(telemetryLoggingStorageLocation)).append("\n");
    sb.append("    telemetryLoggingBucket: ").append(toIndentedString(telemetryLoggingBucket)).append("\n");
    sb.append("    telemetryLoggingRootDir: ").append(toIndentedString(telemetryLoggingRootDir)).append("\n");
    sb.append("    telemetryKmsKeyArn: ").append(toIndentedString(telemetryKmsKeyArn)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    sshKeyPairName: ").append(toIndentedString(sshKeyPairName)).append("\n");
    sb.append("    kmsKeyArn: ").append(toIndentedString(kmsKeyArn)).append("\n");
    sb.append("    instanceGroups: ").append(toIndentedString(instanceGroups)).append("\n");
    sb.append("    deployments: ").append(toIndentedString(deployments)).append("\n");
    sb.append("    sshPublicKey: ").append(toIndentedString(sshPublicKey)).append("\n");
    sb.append("    networkPlugin: ").append(toIndentedString(networkPlugin)).append("\n");
    sb.append("    serviceCidr: ").append(toIndentedString(serviceCidr)).append("\n");
    sb.append("    inboundProxyCidrs: ").append(toIndentedString(inboundProxyCidrs)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    suspendedProcesses: ").append(toIndentedString(suspendedProcesses)).append("\n");
    sb.append("    csiEnabled: ").append(toIndentedString(csiEnabled)).append("\n");
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

