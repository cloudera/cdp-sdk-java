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
import com.cloudera.cdp.environments.model.AzureComputeClusterConfigurationRequest;
import com.cloudera.cdp.environments.model.AzureFreeIpaCreationRequest;
import com.cloudera.cdp.environments.model.AzureLogStorageRequest;
import com.cloudera.cdp.environments.model.CreateAzureEnvironmentRequestNewNetworkParams;
import com.cloudera.cdp.environments.model.CustomDockerRegistryRequest;
import com.cloudera.cdp.environments.model.DataServicesRequest;
import com.cloudera.cdp.environments.model.ExistingAzureNetworkRequest;
import com.cloudera.cdp.environments.model.FreeIpaImageRequest;
import com.cloudera.cdp.environments.model.SecurityAccessRequest;
import com.cloudera.cdp.environments.model.TagRequest;
import java.util.*;

/**
 * Request object for a create Azure environment request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-02-06T11:00:50.150-08:00")
public class CreateAzureEnvironmentRequest  {

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
   * Security control for FreeIPA and Data Lake deployment.
   **/
  private SecurityAccessRequest securityAccess = null;

  /**
   * Whether to associate public ip's to the resources within the network.
   **/
  private Boolean usePublicIp = null;

  /**
   * Azure storage configuration for cluster and audit logs.
   **/
  private AzureLogStorageRequest logStorage = null;

  /**
   * Parameters needed to use an existing VNet and Subnets.
   **/
  private ExistingAzureNetworkRequest existingNetworkParams = null;

  /**
   * 
   **/
  private CreateAzureEnvironmentRequestNewNetworkParams newNetworkParams = null;

  /**
   * An description of the environment.
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
  private AzureFreeIpaCreationRequest freeIpa = null;

  /**
   * Enable compute clusters for environment
   **/
  private Boolean enableComputeCluster = null;

  /**
   * The Externalized k8s configuration create request for the environment.
   **/
  private AzureComputeClusterConfigurationRequest computeClusterConfiguration = null;

  /**
   * The FreeIPA image request for the environment
   **/
  private FreeIpaImageRequest image = null;

  /**
   * Tags associated with the resources.
   **/
  private List<TagRequest> tags = new ArrayList<TagRequest>();

  /**
   * Name of the proxy config to use for the environment.
   **/
  private String proxyConfigName = null;

  /**
   * Name of an existing Azure resource group to be used for the environment. If it is not specified then new resource groups will be generated.
   **/
  private String resourceGroupName = null;

  /**
   * When this is enabled, then Azure Postgres will be configured with Private Endpoint and a Private DNS Zone. When this is disabled, then Azure Service Endpoints will be created. The default value is disabled.
   **/
  private Boolean createPrivateEndpoints = null;

  /**
   * The scheme for the endpoint gateway. PUBLIC creates an external endpoint that can be accessed over the Internet. Defaults to PRIVATE which restricts the traffic to be internal to the VNet.
   **/
  private String endpointAccessGatewayScheme = null;

  /**
   * The subnets to use for endpoint access gateway.
   **/
  private List<String> endpointAccessGatewaySubnetIds = new ArrayList<String>();

  /**
   * When this is enabled, we will provision resources with host encrypted true flag.
   **/
  private Boolean encryptionAtHost = null;

  /**
   * User managed identity for encryption. (deprecated)
   **/
  private String userManagedIdentity = null;

  /**
   * User managed identity for encryption.
   **/
  private String encryptionUserManagedIdentity = null;

  /**
   * URL of the key which will be used to encrypt the Azure Managed Disks, if entitlement has been granted.
   **/
  private String encryptionKeyUrl = null;

  /**
   * Name of the existing Azure resource group hosting the Azure Key Vault containing customer managed key which will be used to encrypt the Azure Managed Disks. It is required only when the entitlement is granted and the resource group of the key vault is different from the resource group in which the environment is to be created. Omitting it implies that, the key vault containing the encryption key is present in the same resource group where the environment would be created.
   **/
  private String encryptionKeyResourceGroupName = null;

  /**
   * Whether or not outbound load balancers should be created for Azure environments. The default behavior is to not create the outbound load balancer.
   **/
  private Boolean enableOutboundLoadBalancer = null;

  /**
   * The zones of the environment in the given region.
   **/
  private List<String> availabilityZones = new ArrayList<String>();

  /**
   * The subnets delegated for Flexible Server database. Accepts either the name or the full resource id.
   **/
  private List<String> flexibleServerSubnetIds = new ArrayList<String>();

  /**
   * Data Services parameters of the environment.
   **/
  private DataServicesRequest dataServices = null;

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
   * Getter for securityAccess.
   * Security control for FreeIPA and Data Lake deployment.
   **/
  @JsonProperty("securityAccess")
  public SecurityAccessRequest getSecurityAccess() {
    return securityAccess;
  }

  /**
   * Setter for securityAccess.
   * Security control for FreeIPA and Data Lake deployment.
   **/
  public void setSecurityAccess(SecurityAccessRequest securityAccess) {
    this.securityAccess = securityAccess;
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
   * Getter for logStorage.
   * Azure storage configuration for cluster and audit logs.
   **/
  @JsonProperty("logStorage")
  public AzureLogStorageRequest getLogStorage() {
    return logStorage;
  }

  /**
   * Setter for logStorage.
   * Azure storage configuration for cluster and audit logs.
   **/
  public void setLogStorage(AzureLogStorageRequest logStorage) {
    this.logStorage = logStorage;
  }

  /**
   * Getter for existingNetworkParams.
   * Parameters needed to use an existing VNet and Subnets.
   **/
  @JsonProperty("existingNetworkParams")
  public ExistingAzureNetworkRequest getExistingNetworkParams() {
    return existingNetworkParams;
  }

  /**
   * Setter for existingNetworkParams.
   * Parameters needed to use an existing VNet and Subnets.
   **/
  public void setExistingNetworkParams(ExistingAzureNetworkRequest existingNetworkParams) {
    this.existingNetworkParams = existingNetworkParams;
  }

  /**
   * Getter for newNetworkParams.
   * 
   **/
  @JsonProperty("newNetworkParams")
  public CreateAzureEnvironmentRequestNewNetworkParams getNewNetworkParams() {
    return newNetworkParams;
  }

  /**
   * Setter for newNetworkParams.
   * 
   **/
  public void setNewNetworkParams(CreateAzureEnvironmentRequestNewNetworkParams newNetworkParams) {
    this.newNetworkParams = newNetworkParams;
  }

  /**
   * Getter for description.
   * An description of the environment.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * An description of the environment.
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
  public AzureFreeIpaCreationRequest getFreeIpa() {
    return freeIpa;
  }

  /**
   * Setter for freeIpa.
   * The FreeIPA creation request for the environment
   **/
  public void setFreeIpa(AzureFreeIpaCreationRequest freeIpa) {
    this.freeIpa = freeIpa;
  }

  /**
   * Getter for enableComputeCluster.
   * Enable compute clusters for environment
   **/
  @JsonProperty("enableComputeCluster")
  public Boolean getEnableComputeCluster() {
    return enableComputeCluster;
  }

  /**
   * Setter for enableComputeCluster.
   * Enable compute clusters for environment
   **/
  public void setEnableComputeCluster(Boolean enableComputeCluster) {
    this.enableComputeCluster = enableComputeCluster;
  }

  /**
   * Getter for computeClusterConfiguration.
   * The Externalized k8s configuration create request for the environment.
   **/
  @JsonProperty("computeClusterConfiguration")
  public AzureComputeClusterConfigurationRequest getComputeClusterConfiguration() {
    return computeClusterConfiguration;
  }

  /**
   * Setter for computeClusterConfiguration.
   * The Externalized k8s configuration create request for the environment.
   **/
  public void setComputeClusterConfiguration(AzureComputeClusterConfigurationRequest computeClusterConfiguration) {
    this.computeClusterConfiguration = computeClusterConfiguration;
  }

  /**
   * Getter for image.
   * The FreeIPA image request for the environment
   **/
  @JsonProperty("image")
  public FreeIpaImageRequest getImage() {
    return image;
  }

  /**
   * Setter for image.
   * The FreeIPA image request for the environment
   **/
  public void setImage(FreeIpaImageRequest image) {
    this.image = image;
  }

  /**
   * Getter for tags.
   * Tags associated with the resources.
   **/
  @JsonProperty("tags")
  public List<TagRequest> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Tags associated with the resources.
   **/
  public void setTags(List<TagRequest> tags) {
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
   * Getter for resourceGroupName.
   * Name of an existing Azure resource group to be used for the environment. If it is not specified then new resource groups will be generated.
   **/
  @JsonProperty("resourceGroupName")
  public String getResourceGroupName() {
    return resourceGroupName;
  }

  /**
   * Setter for resourceGroupName.
   * Name of an existing Azure resource group to be used for the environment. If it is not specified then new resource groups will be generated.
   **/
  public void setResourceGroupName(String resourceGroupName) {
    this.resourceGroupName = resourceGroupName;
  }

  /**
   * Getter for createPrivateEndpoints.
   * When this is enabled, then Azure Postgres will be configured with Private Endpoint and a Private DNS Zone. When this is disabled, then Azure Service Endpoints will be created. The default value is disabled.
   **/
  @JsonProperty("createPrivateEndpoints")
  public Boolean getCreatePrivateEndpoints() {
    return createPrivateEndpoints;
  }

  /**
   * Setter for createPrivateEndpoints.
   * When this is enabled, then Azure Postgres will be configured with Private Endpoint and a Private DNS Zone. When this is disabled, then Azure Service Endpoints will be created. The default value is disabled.
   **/
  public void setCreatePrivateEndpoints(Boolean createPrivateEndpoints) {
    this.createPrivateEndpoints = createPrivateEndpoints;
  }

  /**
   * Getter for endpointAccessGatewayScheme.
   * The scheme for the endpoint gateway. PUBLIC creates an external endpoint that can be accessed over the Internet. Defaults to PRIVATE which restricts the traffic to be internal to the VNet.
   **/
  @JsonProperty("endpointAccessGatewayScheme")
  public String getEndpointAccessGatewayScheme() {
    return endpointAccessGatewayScheme;
  }

  /**
   * Setter for endpointAccessGatewayScheme.
   * The scheme for the endpoint gateway. PUBLIC creates an external endpoint that can be accessed over the Internet. Defaults to PRIVATE which restricts the traffic to be internal to the VNet.
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
   * Getter for encryptionAtHost.
   * When this is enabled, we will provision resources with host encrypted true flag.
   **/
  @JsonProperty("encryptionAtHost")
  public Boolean getEncryptionAtHost() {
    return encryptionAtHost;
  }

  /**
   * Setter for encryptionAtHost.
   * When this is enabled, we will provision resources with host encrypted true flag.
   **/
  public void setEncryptionAtHost(Boolean encryptionAtHost) {
    this.encryptionAtHost = encryptionAtHost;
  }

  /**
   * Getter for userManagedIdentity.
   * User managed identity for encryption. (deprecated)
   **/
  @Deprecated
  @JsonProperty("userManagedIdentity")
  public String getUserManagedIdentity() {
    return userManagedIdentity;
  }

  /**
   * Setter for userManagedIdentity.
   * User managed identity for encryption. (deprecated)
   **/
  @Deprecated
  public void setUserManagedIdentity(String userManagedIdentity) {
    this.userManagedIdentity = userManagedIdentity;
  }

  /**
   * Getter for encryptionUserManagedIdentity.
   * User managed identity for encryption.
   **/
  @JsonProperty("encryptionUserManagedIdentity")
  public String getEncryptionUserManagedIdentity() {
    return encryptionUserManagedIdentity;
  }

  /**
   * Setter for encryptionUserManagedIdentity.
   * User managed identity for encryption.
   **/
  public void setEncryptionUserManagedIdentity(String encryptionUserManagedIdentity) {
    this.encryptionUserManagedIdentity = encryptionUserManagedIdentity;
  }

  /**
   * Getter for encryptionKeyUrl.
   * URL of the key which will be used to encrypt the Azure Managed Disks, if entitlement has been granted.
   **/
  @JsonProperty("encryptionKeyUrl")
  public String getEncryptionKeyUrl() {
    return encryptionKeyUrl;
  }

  /**
   * Setter for encryptionKeyUrl.
   * URL of the key which will be used to encrypt the Azure Managed Disks, if entitlement has been granted.
   **/
  public void setEncryptionKeyUrl(String encryptionKeyUrl) {
    this.encryptionKeyUrl = encryptionKeyUrl;
  }

  /**
   * Getter for encryptionKeyResourceGroupName.
   * Name of the existing Azure resource group hosting the Azure Key Vault containing customer managed key which will be used to encrypt the Azure Managed Disks. It is required only when the entitlement is granted and the resource group of the key vault is different from the resource group in which the environment is to be created. Omitting it implies that, the key vault containing the encryption key is present in the same resource group where the environment would be created.
   **/
  @JsonProperty("encryptionKeyResourceGroupName")
  public String getEncryptionKeyResourceGroupName() {
    return encryptionKeyResourceGroupName;
  }

  /**
   * Setter for encryptionKeyResourceGroupName.
   * Name of the existing Azure resource group hosting the Azure Key Vault containing customer managed key which will be used to encrypt the Azure Managed Disks. It is required only when the entitlement is granted and the resource group of the key vault is different from the resource group in which the environment is to be created. Omitting it implies that, the key vault containing the encryption key is present in the same resource group where the environment would be created.
   **/
  public void setEncryptionKeyResourceGroupName(String encryptionKeyResourceGroupName) {
    this.encryptionKeyResourceGroupName = encryptionKeyResourceGroupName;
  }

  /**
   * Getter for enableOutboundLoadBalancer.
   * Whether or not outbound load balancers should be created for Azure environments. The default behavior is to not create the outbound load balancer.
   **/
  @JsonProperty("enableOutboundLoadBalancer")
  public Boolean getEnableOutboundLoadBalancer() {
    return enableOutboundLoadBalancer;
  }

  /**
   * Setter for enableOutboundLoadBalancer.
   * Whether or not outbound load balancers should be created for Azure environments. The default behavior is to not create the outbound load balancer.
   **/
  public void setEnableOutboundLoadBalancer(Boolean enableOutboundLoadBalancer) {
    this.enableOutboundLoadBalancer = enableOutboundLoadBalancer;
  }

  /**
   * Getter for availabilityZones.
   * The zones of the environment in the given region.
   **/
  @JsonProperty("availabilityZones")
  public List<String> getAvailabilityZones() {
    return availabilityZones;
  }

  /**
   * Setter for availabilityZones.
   * The zones of the environment in the given region.
   **/
  public void setAvailabilityZones(List<String> availabilityZones) {
    this.availabilityZones = availabilityZones;
  }

  /**
   * Getter for flexibleServerSubnetIds.
   * The subnets delegated for Flexible Server database. Accepts either the name or the full resource id.
   **/
  @JsonProperty("flexibleServerSubnetIds")
  public List<String> getFlexibleServerSubnetIds() {
    return flexibleServerSubnetIds;
  }

  /**
   * Setter for flexibleServerSubnetIds.
   * The subnets delegated for Flexible Server database. Accepts either the name or the full resource id.
   **/
  public void setFlexibleServerSubnetIds(List<String> flexibleServerSubnetIds) {
    this.flexibleServerSubnetIds = flexibleServerSubnetIds;
  }

  /**
   * Getter for dataServices.
   * Data Services parameters of the environment.
   **/
  @JsonProperty("dataServices")
  public DataServicesRequest getDataServices() {
    return dataServices;
  }

  /**
   * Setter for dataServices.
   * Data Services parameters of the environment.
   **/
  public void setDataServices(DataServicesRequest dataServices) {
    this.dataServices = dataServices;
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
    CreateAzureEnvironmentRequest createAzureEnvironmentRequest = (CreateAzureEnvironmentRequest) o;
    if (!Objects.equals(this.environmentName, createAzureEnvironmentRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.credentialName, createAzureEnvironmentRequest.credentialName)) {
      return false;
    }
    if (!Objects.equals(this.region, createAzureEnvironmentRequest.region)) {
      return false;
    }
    if (!Objects.equals(this.publicKey, createAzureEnvironmentRequest.publicKey)) {
      return false;
    }
    if (!Objects.equals(this.securityAccess, createAzureEnvironmentRequest.securityAccess)) {
      return false;
    }
    if (!Objects.equals(this.usePublicIp, createAzureEnvironmentRequest.usePublicIp)) {
      return false;
    }
    if (!Objects.equals(this.logStorage, createAzureEnvironmentRequest.logStorage)) {
      return false;
    }
    if (!Objects.equals(this.existingNetworkParams, createAzureEnvironmentRequest.existingNetworkParams)) {
      return false;
    }
    if (!Objects.equals(this.newNetworkParams, createAzureEnvironmentRequest.newNetworkParams)) {
      return false;
    }
    if (!Objects.equals(this.description, createAzureEnvironmentRequest.description)) {
      return false;
    }
    if (!Objects.equals(this.enableTunnel, createAzureEnvironmentRequest.enableTunnel)) {
      return false;
    }
    if (!Objects.equals(this.workloadAnalytics, createAzureEnvironmentRequest.workloadAnalytics)) {
      return false;
    }
    if (!Objects.equals(this.reportDeploymentLogs, createAzureEnvironmentRequest.reportDeploymentLogs)) {
      return false;
    }
    if (!Objects.equals(this.freeIpa, createAzureEnvironmentRequest.freeIpa)) {
      return false;
    }
    if (!Objects.equals(this.enableComputeCluster, createAzureEnvironmentRequest.enableComputeCluster)) {
      return false;
    }
    if (!Objects.equals(this.computeClusterConfiguration, createAzureEnvironmentRequest.computeClusterConfiguration)) {
      return false;
    }
    if (!Objects.equals(this.image, createAzureEnvironmentRequest.image)) {
      return false;
    }
    if (!Objects.equals(this.tags, createAzureEnvironmentRequest.tags)) {
      return false;
    }
    if (!Objects.equals(this.proxyConfigName, createAzureEnvironmentRequest.proxyConfigName)) {
      return false;
    }
    if (!Objects.equals(this.resourceGroupName, createAzureEnvironmentRequest.resourceGroupName)) {
      return false;
    }
    if (!Objects.equals(this.createPrivateEndpoints, createAzureEnvironmentRequest.createPrivateEndpoints)) {
      return false;
    }
    if (!Objects.equals(this.endpointAccessGatewayScheme, createAzureEnvironmentRequest.endpointAccessGatewayScheme)) {
      return false;
    }
    if (!Objects.equals(this.endpointAccessGatewaySubnetIds, createAzureEnvironmentRequest.endpointAccessGatewaySubnetIds)) {
      return false;
    }
    if (!Objects.equals(this.encryptionAtHost, createAzureEnvironmentRequest.encryptionAtHost)) {
      return false;
    }
    if (!Objects.equals(this.userManagedIdentity, createAzureEnvironmentRequest.userManagedIdentity)) {
      return false;
    }
    if (!Objects.equals(this.encryptionUserManagedIdentity, createAzureEnvironmentRequest.encryptionUserManagedIdentity)) {
      return false;
    }
    if (!Objects.equals(this.encryptionKeyUrl, createAzureEnvironmentRequest.encryptionKeyUrl)) {
      return false;
    }
    if (!Objects.equals(this.encryptionKeyResourceGroupName, createAzureEnvironmentRequest.encryptionKeyResourceGroupName)) {
      return false;
    }
    if (!Objects.equals(this.enableOutboundLoadBalancer, createAzureEnvironmentRequest.enableOutboundLoadBalancer)) {
      return false;
    }
    if (!Objects.equals(this.availabilityZones, createAzureEnvironmentRequest.availabilityZones)) {
      return false;
    }
    if (!Objects.equals(this.flexibleServerSubnetIds, createAzureEnvironmentRequest.flexibleServerSubnetIds)) {
      return false;
    }
    if (!Objects.equals(this.dataServices, createAzureEnvironmentRequest.dataServices)) {
      return false;
    }
    if (!Objects.equals(this.customDockerRegistry, createAzureEnvironmentRequest.customDockerRegistry)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, credentialName, region, publicKey, securityAccess, usePublicIp, logStorage, existingNetworkParams, newNetworkParams, description, enableTunnel, workloadAnalytics, reportDeploymentLogs, freeIpa, enableComputeCluster, computeClusterConfiguration, image, tags, proxyConfigName, resourceGroupName, createPrivateEndpoints, endpointAccessGatewayScheme, endpointAccessGatewaySubnetIds, encryptionAtHost, userManagedIdentity, encryptionUserManagedIdentity, encryptionKeyUrl, encryptionKeyResourceGroupName, enableOutboundLoadBalancer, availabilityZones, flexibleServerSubnetIds, dataServices, customDockerRegistry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAzureEnvironmentRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    credentialName: ").append(toIndentedString(credentialName)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    securityAccess: ").append(toIndentedString(securityAccess)).append("\n");
    sb.append("    usePublicIp: ").append(toIndentedString(usePublicIp)).append("\n");
    sb.append("    logStorage: ").append(toIndentedString(logStorage)).append("\n");
    sb.append("    existingNetworkParams: ").append(toIndentedString(existingNetworkParams)).append("\n");
    sb.append("    newNetworkParams: ").append(toIndentedString(newNetworkParams)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enableTunnel: ").append(toIndentedString(enableTunnel)).append("\n");
    sb.append("    workloadAnalytics: ").append(toIndentedString(workloadAnalytics)).append("\n");
    sb.append("    reportDeploymentLogs: ").append(toIndentedString(reportDeploymentLogs)).append("\n");
    sb.append("    freeIpa: ").append(toIndentedString(freeIpa)).append("\n");
    sb.append("    enableComputeCluster: ").append(toIndentedString(enableComputeCluster)).append("\n");
    sb.append("    computeClusterConfiguration: ").append(toIndentedString(computeClusterConfiguration)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    proxyConfigName: ").append(toIndentedString(proxyConfigName)).append("\n");
    sb.append("    resourceGroupName: ").append(toIndentedString(resourceGroupName)).append("\n");
    sb.append("    createPrivateEndpoints: ").append(toIndentedString(createPrivateEndpoints)).append("\n");
    sb.append("    endpointAccessGatewayScheme: ").append(toIndentedString(endpointAccessGatewayScheme)).append("\n");
    sb.append("    endpointAccessGatewaySubnetIds: ").append(toIndentedString(endpointAccessGatewaySubnetIds)).append("\n");
    sb.append("    encryptionAtHost: ").append(toIndentedString(encryptionAtHost)).append("\n");
    sb.append("    userManagedIdentity: ").append(toIndentedString(userManagedIdentity)).append("\n");
    sb.append("    encryptionUserManagedIdentity: ").append(toIndentedString(encryptionUserManagedIdentity)).append("\n");
    sb.append("    encryptionKeyUrl: ").append(toIndentedString(encryptionKeyUrl)).append("\n");
    sb.append("    encryptionKeyResourceGroupName: ").append(toIndentedString(encryptionKeyResourceGroupName)).append("\n");
    sb.append("    enableOutboundLoadBalancer: ").append(toIndentedString(enableOutboundLoadBalancer)).append("\n");
    sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
    sb.append("    flexibleServerSubnetIds: ").append(toIndentedString(flexibleServerSubnetIds)).append("\n");
    sb.append("    dataServices: ").append(toIndentedString(dataServices)).append("\n");
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

