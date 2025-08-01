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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.environments.model.CustomDockerRegistryRequest;
import com.cloudera.cdp.environments.model.ExistingGCPNetworkRequest;
import com.cloudera.cdp.environments.model.GCPFreeIpaCreationRequest;
import com.cloudera.cdp.environments.model.GcpLogStorageRequest;
import com.cloudera.cdp.environments.model.GcpSecurityAccessRequest;
import com.cloudera.cdp.environments.model.GcpTagRequest;
import java.util.*;

/**
 * Request object for a create GCP environment request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:42.850-07:00")
public class CreateGCPEnvironmentRequest  {

  /**
   * The name of the environment. Must contain only lowercase letters, numbers and hyphens.
   **/
  private String environmentName = null;

  /**
   * Name of the credential to use for the environment.
   **/
  private String credentialName = null;

  /**
   * The region of the environment.
   **/
  private String region = null;

  /**
   * Public SSH key string. The associated private key can be used to get root-level access to the Data Lake instance and Data Hub cluster instances.
   **/
  private String publicKey = null;

  /**
   * Whether to associate public ip's to the resources within the network.
   **/
  private Boolean usePublicIp = null;

  /**
   * Parameters needed to use an existing VPC and Subnets. For now only existing network params is supported.
   **/
  private ExistingGCPNetworkRequest existingNetworkParams = null;

  /**
   * Firewall rules for FreeIPA, Data Lake and Data Hub deployment.
   **/
  private GcpSecurityAccessRequest securityAccess = null;

  /**
   * GCP storage configuration for cluster and audit logs.
   **/
  private GcpLogStorageRequest logStorage = null;

  /**
   * A description of the environment.
   **/
  private String description = null;

  /**
   * Whether to enable SSH tunneling for the environment.
   **/
  private Boolean enableTunnel = true;

  /**
   * When this is enabled, diagnostic information about job and query execution is sent to Workload Manager for Data Hub clusters created within this environment.
   **/
  private Boolean workloadAnalytics = null;

  /**
   * [Deprecated] When true, this will report additional diagnostic information back to Cloudera.
   **/
  private Boolean reportDeploymentLogs = false;

  /**
   * The FreeIPA creation request for the environment
   **/
  private GCPFreeIpaCreationRequest freeIpa = null;

  /**
   * The scheme for the endpoint gateway. PUBLIC creates an external endpoint that can be accessed over the Internet. Defaults to PRIVATE which restricts the traffic to be internal to the VPC.
   **/
  private String endpointAccessGatewayScheme = null;

  /**
   * The subnets to use for endpoint access gateway.
   **/
  private List<String> endpointAccessGatewaySubnetIds = new ArrayList<String>();

  /**
   * Tags that can be attached to GCP resources. Please refer to Google documentation for the rules https://cloud.google.com/compute/docs/labeling-resources#label_format.
   **/
  private List<GcpTagRequest> tags = new ArrayList<GcpTagRequest>();

  /**
   * Name of the proxy config to use for the environment.
   **/
  private String proxyConfigName = null;

  /**
   * Key Resource ID of the customer managed encryption key to encrypt GCP resources.
   **/
  private String encryptionKey = null;

  /**
   * The zones of the environment in the given region. Multi-zone selection is not supported in GCP yet. It accepts only one zone until support is added.
   **/
  private List<String> availabilityZones = new ArrayList<String>();

  /**
   * Configures the desired custom docker registry for data services.
   **/
  private CustomDockerRegistryRequest customDockerRegistry = null;

  /**
   * Getter for environmentName.
   * The name of the environment. Must contain only lowercase letters, numbers and hyphens.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The name of the environment. Must contain only lowercase letters, numbers and hyphens.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for credentialName.
   * Name of the credential to use for the environment.
   **/
  @JsonProperty("credentialName")
  public String getCredentialName() {
    return credentialName;
  }

  /**
   * Setter for credentialName.
   * Name of the credential to use for the environment.
   **/
  public void setCredentialName(String credentialName) {
    this.credentialName = credentialName;
  }

  /**
   * Getter for region.
   * The region of the environment.
   **/
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  /**
   * Setter for region.
   * The region of the environment.
   **/
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Getter for publicKey.
   * Public SSH key string. The associated private key can be used to get root-level access to the Data Lake instance and Data Hub cluster instances.
   **/
  @JsonProperty("publicKey")
  public String getPublicKey() {
    return publicKey;
  }

  /**
   * Setter for publicKey.
   * Public SSH key string. The associated private key can be used to get root-level access to the Data Lake instance and Data Hub cluster instances.
   **/
  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  /**
   * Getter for usePublicIp.
   * Whether to associate public ip&#39;s to the resources within the network.
   **/
  @JsonProperty("usePublicIp")
  public Boolean getUsePublicIp() {
    return usePublicIp;
  }

  /**
   * Setter for usePublicIp.
   * Whether to associate public ip&#39;s to the resources within the network.
   **/
  public void setUsePublicIp(Boolean usePublicIp) {
    this.usePublicIp = usePublicIp;
  }

  /**
   * Getter for existingNetworkParams.
   * Parameters needed to use an existing VPC and Subnets. For now only existing network params is supported.
   **/
  @JsonProperty("existingNetworkParams")
  public ExistingGCPNetworkRequest getExistingNetworkParams() {
    return existingNetworkParams;
  }

  /**
   * Setter for existingNetworkParams.
   * Parameters needed to use an existing VPC and Subnets. For now only existing network params is supported.
   **/
  public void setExistingNetworkParams(ExistingGCPNetworkRequest existingNetworkParams) {
    this.existingNetworkParams = existingNetworkParams;
  }

  /**
   * Getter for securityAccess.
   * Firewall rules for FreeIPA, Data Lake and Data Hub deployment.
   **/
  @JsonProperty("securityAccess")
  public GcpSecurityAccessRequest getSecurityAccess() {
    return securityAccess;
  }

  /**
   * Setter for securityAccess.
   * Firewall rules for FreeIPA, Data Lake and Data Hub deployment.
   **/
  public void setSecurityAccess(GcpSecurityAccessRequest securityAccess) {
    this.securityAccess = securityAccess;
  }

  /**
   * Getter for logStorage.
   * GCP storage configuration for cluster and audit logs.
   **/
  @JsonProperty("logStorage")
  public GcpLogStorageRequest getLogStorage() {
    return logStorage;
  }

  /**
   * Setter for logStorage.
   * GCP storage configuration for cluster and audit logs.
   **/
  public void setLogStorage(GcpLogStorageRequest logStorage) {
    this.logStorage = logStorage;
  }

  /**
   * Getter for description.
   * A description of the environment.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * A description of the environment.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for enableTunnel.
   * Whether to enable SSH tunneling for the environment.
   **/
  @JsonProperty("enableTunnel")
  public Boolean getEnableTunnel() {
    return enableTunnel;
  }

  /**
   * Setter for enableTunnel.
   * Whether to enable SSH tunneling for the environment.
   **/
  public void setEnableTunnel(Boolean enableTunnel) {
    this.enableTunnel = enableTunnel;
  }

  /**
   * Getter for workloadAnalytics.
   * When this is enabled, diagnostic information about job and query execution is sent to Workload Manager for Data Hub clusters created within this environment.
   **/
  @JsonProperty("workloadAnalytics")
  public Boolean getWorkloadAnalytics() {
    return workloadAnalytics;
  }

  /**
   * Setter for workloadAnalytics.
   * When this is enabled, diagnostic information about job and query execution is sent to Workload Manager for Data Hub clusters created within this environment.
   **/
  public void setWorkloadAnalytics(Boolean workloadAnalytics) {
    this.workloadAnalytics = workloadAnalytics;
  }

  /**
   * Getter for reportDeploymentLogs.
   * [Deprecated] When true, this will report additional diagnostic information back to Cloudera.
   **/
  @Deprecated
  @JsonProperty("reportDeploymentLogs")
  public Boolean getReportDeploymentLogs() {
    return reportDeploymentLogs;
  }

  /**
   * Setter for reportDeploymentLogs.
   * [Deprecated] When true, this will report additional diagnostic information back to Cloudera.
   **/
  @Deprecated
  public void setReportDeploymentLogs(Boolean reportDeploymentLogs) {
    this.reportDeploymentLogs = reportDeploymentLogs;
  }

  /**
   * Getter for freeIpa.
   * The FreeIPA creation request for the environment
   **/
  @JsonProperty("freeIpa")
  public GCPFreeIpaCreationRequest getFreeIpa() {
    return freeIpa;
  }

  /**
   * Setter for freeIpa.
   * The FreeIPA creation request for the environment
   **/
  public void setFreeIpa(GCPFreeIpaCreationRequest freeIpa) {
    this.freeIpa = freeIpa;
  }

  /**
   * Getter for endpointAccessGatewayScheme.
   * The scheme for the endpoint gateway. PUBLIC creates an external endpoint that can be accessed over the Internet. Defaults to PRIVATE which restricts the traffic to be internal to the VPC.
   **/
  @JsonProperty("endpointAccessGatewayScheme")
  public String getEndpointAccessGatewayScheme() {
    return endpointAccessGatewayScheme;
  }

  /**
   * Setter for endpointAccessGatewayScheme.
   * The scheme for the endpoint gateway. PUBLIC creates an external endpoint that can be accessed over the Internet. Defaults to PRIVATE which restricts the traffic to be internal to the VPC.
   **/
  public void setEndpointAccessGatewayScheme(String endpointAccessGatewayScheme) {
    this.endpointAccessGatewayScheme = endpointAccessGatewayScheme;
  }

  /**
   * Getter for endpointAccessGatewaySubnetIds.
   * The subnets to use for endpoint access gateway.
   **/
  @JsonProperty("endpointAccessGatewaySubnetIds")
  public List<String> getEndpointAccessGatewaySubnetIds() {
    return endpointAccessGatewaySubnetIds;
  }

  /**
   * Setter for endpointAccessGatewaySubnetIds.
   * The subnets to use for endpoint access gateway.
   **/
  public void setEndpointAccessGatewaySubnetIds(List<String> endpointAccessGatewaySubnetIds) {
    this.endpointAccessGatewaySubnetIds = endpointAccessGatewaySubnetIds;
  }

  /**
   * Getter for tags.
   * Tags that can be attached to GCP resources. Please refer to Google documentation for the rules https://cloud.google.com/compute/docs/labeling-resources#label_format.
   **/
  @JsonProperty("tags")
  public List<GcpTagRequest> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Tags that can be attached to GCP resources. Please refer to Google documentation for the rules https://cloud.google.com/compute/docs/labeling-resources#label_format.
   **/
  public void setTags(List<GcpTagRequest> tags) {
    this.tags = tags;
  }

  /**
   * Getter for proxyConfigName.
   * Name of the proxy config to use for the environment.
   **/
  @JsonProperty("proxyConfigName")
  public String getProxyConfigName() {
    return proxyConfigName;
  }

  /**
   * Setter for proxyConfigName.
   * Name of the proxy config to use for the environment.
   **/
  public void setProxyConfigName(String proxyConfigName) {
    this.proxyConfigName = proxyConfigName;
  }

  /**
   * Getter for encryptionKey.
   * Key Resource ID of the customer managed encryption key to encrypt GCP resources.
   **/
  @JsonProperty("encryptionKey")
  public String getEncryptionKey() {
    return encryptionKey;
  }

  /**
   * Setter for encryptionKey.
   * Key Resource ID of the customer managed encryption key to encrypt GCP resources.
   **/
  public void setEncryptionKey(String encryptionKey) {
    this.encryptionKey = encryptionKey;
  }

  /**
   * Getter for availabilityZones.
   * The zones of the environment in the given region. Multi-zone selection is not supported in GCP yet. It accepts only one zone until support is added.
   **/
  @JsonProperty("availabilityZones")
  public List<String> getAvailabilityZones() {
    return availabilityZones;
  }

  /**
   * Setter for availabilityZones.
   * The zones of the environment in the given region. Multi-zone selection is not supported in GCP yet. It accepts only one zone until support is added.
   **/
  public void setAvailabilityZones(List<String> availabilityZones) {
    this.availabilityZones = availabilityZones;
  }

  /**
   * Getter for customDockerRegistry.
   * Configures the desired custom docker registry for data services.
   **/
  @JsonProperty("customDockerRegistry")
  public CustomDockerRegistryRequest getCustomDockerRegistry() {
    return customDockerRegistry;
  }

  /**
   * Setter for customDockerRegistry.
   * Configures the desired custom docker registry for data services.
   **/
  public void setCustomDockerRegistry(CustomDockerRegistryRequest customDockerRegistry) {
    this.customDockerRegistry = customDockerRegistry;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGCPEnvironmentRequest createGCPEnvironmentRequest = (CreateGCPEnvironmentRequest) o;
    if (!Objects.equals(this.environmentName, createGCPEnvironmentRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.credentialName, createGCPEnvironmentRequest.credentialName)) {
      return false;
    }
    if (!Objects.equals(this.region, createGCPEnvironmentRequest.region)) {
      return false;
    }
    if (!Objects.equals(this.publicKey, createGCPEnvironmentRequest.publicKey)) {
      return false;
    }
    if (!Objects.equals(this.usePublicIp, createGCPEnvironmentRequest.usePublicIp)) {
      return false;
    }
    if (!Objects.equals(this.existingNetworkParams, createGCPEnvironmentRequest.existingNetworkParams)) {
      return false;
    }
    if (!Objects.equals(this.securityAccess, createGCPEnvironmentRequest.securityAccess)) {
      return false;
    }
    if (!Objects.equals(this.logStorage, createGCPEnvironmentRequest.logStorage)) {
      return false;
    }
    if (!Objects.equals(this.description, createGCPEnvironmentRequest.description)) {
      return false;
    }
    if (!Objects.equals(this.enableTunnel, createGCPEnvironmentRequest.enableTunnel)) {
      return false;
    }
    if (!Objects.equals(this.workloadAnalytics, createGCPEnvironmentRequest.workloadAnalytics)) {
      return false;
    }
    if (!Objects.equals(this.reportDeploymentLogs, createGCPEnvironmentRequest.reportDeploymentLogs)) {
      return false;
    }
    if (!Objects.equals(this.freeIpa, createGCPEnvironmentRequest.freeIpa)) {
      return false;
    }
    if (!Objects.equals(this.endpointAccessGatewayScheme, createGCPEnvironmentRequest.endpointAccessGatewayScheme)) {
      return false;
    }
    if (!Objects.equals(this.endpointAccessGatewaySubnetIds, createGCPEnvironmentRequest.endpointAccessGatewaySubnetIds)) {
      return false;
    }
    if (!Objects.equals(this.tags, createGCPEnvironmentRequest.tags)) {
      return false;
    }
    if (!Objects.equals(this.proxyConfigName, createGCPEnvironmentRequest.proxyConfigName)) {
      return false;
    }
    if (!Objects.equals(this.encryptionKey, createGCPEnvironmentRequest.encryptionKey)) {
      return false;
    }
    if (!Objects.equals(this.availabilityZones, createGCPEnvironmentRequest.availabilityZones)) {
      return false;
    }
    if (!Objects.equals(this.customDockerRegistry, createGCPEnvironmentRequest.customDockerRegistry)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, credentialName, region, publicKey, usePublicIp, existingNetworkParams, securityAccess, logStorage, description, enableTunnel, workloadAnalytics, reportDeploymentLogs, freeIpa, endpointAccessGatewayScheme, endpointAccessGatewaySubnetIds, tags, proxyConfigName, encryptionKey, availabilityZones, customDockerRegistry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGCPEnvironmentRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    credentialName: ").append(toIndentedString(credentialName)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    usePublicIp: ").append(toIndentedString(usePublicIp)).append("\n");
    sb.append("    existingNetworkParams: ").append(toIndentedString(existingNetworkParams)).append("\n");
    sb.append("    securityAccess: ").append(toIndentedString(securityAccess)).append("\n");
    sb.append("    logStorage: ").append(toIndentedString(logStorage)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enableTunnel: ").append(toIndentedString(enableTunnel)).append("\n");
    sb.append("    workloadAnalytics: ").append(toIndentedString(workloadAnalytics)).append("\n");
    sb.append("    reportDeploymentLogs: ").append(toIndentedString(reportDeploymentLogs)).append("\n");
    sb.append("    freeIpa: ").append(toIndentedString(freeIpa)).append("\n");
    sb.append("    endpointAccessGatewayScheme: ").append(toIndentedString(endpointAccessGatewayScheme)).append("\n");
    sb.append("    endpointAccessGatewaySubnetIds: ").append(toIndentedString(endpointAccessGatewaySubnetIds)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    proxyConfigName: ").append(toIndentedString(proxyConfigName)).append("\n");
    sb.append("    encryptionKey: ").append(toIndentedString(encryptionKey)).append("\n");
    sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
    sb.append("    customDockerRegistry: ").append(toIndentedString(customDockerRegistry)).append("\n");
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

