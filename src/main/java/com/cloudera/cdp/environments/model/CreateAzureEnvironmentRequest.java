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
import com.cloudera.cdp.environments.model.AzureFreeIpaCreationRequest;
import com.cloudera.cdp.environments.model.AzureLogStorageRequest;
import com.cloudera.cdp.environments.model.CreateAzureEnvironmentRequestNewNetworkParams;
import com.cloudera.cdp.environments.model.ExistingAzureNetworkRequest;
import com.cloudera.cdp.environments.model.SecurityAccessRequest;
import com.cloudera.cdp.environments.model.TagRequest;
import java.util.*;

/**
 * Request object for a create Azure environment request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-02-17T11:49:10.212-08:00")
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
   * Security control for FreeIPA and Datalake deployment.
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
   * Whether to enable SSH tunnelling for the environment.
   **/
  private Boolean enableTunnel = null;

  /**
   * When this is enabled, diagnostic information about job and query execution is sent to Workload Manager for Data Hub clusters created within this environment.
   **/
  private Boolean workloadAnalytics = null;

  /**
   * When true, this will report additional diagnostic information back to Cloudera.
   **/
  private Boolean reportDeploymentLogs = null;

  /**
   * The FreeIPA creation request for the environment
   **/
  private AzureFreeIpaCreationRequest freeIpa = null;

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
   * Security control for FreeIPA and Datalake deployment.
   **/
  @JsonProperty("securityAccess")
  public SecurityAccessRequest getSecurityAccess() {
    return securityAccess;
  }

  /**
   * Setter for securityAccess.
   * Security control for FreeIPA and Datalake deployment.
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
   * Whether to enable SSH tunnelling for the environment.
   **/
  @JsonProperty("enableTunnel")
  public Boolean getEnableTunnel() {
    return enableTunnel;
  }

  /**
   * Setter for enableTunnel.
   * Whether to enable SSH tunnelling for the environment.
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
   * When true, this will report additional diagnostic information back to Cloudera.
   **/
  @JsonProperty("reportDeploymentLogs")
  public Boolean getReportDeploymentLogs() {
    return reportDeploymentLogs;
  }

  /**
   * Setter for reportDeploymentLogs.
   * When true, this will report additional diagnostic information back to Cloudera.
   **/
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
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, credentialName, region, publicKey, securityAccess, usePublicIp, logStorage, existingNetworkParams, newNetworkParams, description, enableTunnel, workloadAnalytics, reportDeploymentLogs, freeIpa, tags, proxyConfigName, resourceGroupName, createPrivateEndpoints);
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
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    proxyConfigName: ").append(toIndentedString(proxyConfigName)).append("\n");
    sb.append("    resourceGroupName: ").append(toIndentedString(resourceGroupName)).append("\n");
    sb.append("    createPrivateEndpoints: ").append(toIndentedString(createPrivateEndpoints)).append("\n");
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

