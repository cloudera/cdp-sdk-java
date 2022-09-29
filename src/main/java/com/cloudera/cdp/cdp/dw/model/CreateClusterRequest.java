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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.dw.model.AwsActivationOptions;
import com.cloudera.cdp.dw.model.AzureActivationOptions;
import com.cloudera.cdp.dw.model.CustomRegistryOptions;
import com.cloudera.cdp.dw.model.PrivateCloudActivationOptions;

/**
 * Request object for the createCluster method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-09-28T16:30:04.902-07:00")
public class CreateClusterRequest  {

  /**
   * The CRN of the environment for the cluster to create.
   **/
  private String environmentCrn = null;

  /**
   * Using an overlay network will save IP addresses in the VPC by using a private IP address range for Pods in the cluster.
   **/
  private Boolean useOverlayNetwork = null;

  /**
   * PostgreSQL server backup retention days.
   **/
  private Integer databaseBackupRetentionPeriod = 30;

  /**
   * Comma separated list of IP address CIDRs to whitelist.
   **/
  private String whitelistIpCIDRs = null;

  /**
   * Set up load balancer with private IP address. In AWS it is created in private subnets. In Azure an internal load balancer gets created. Make sure there is connectivity between your client network and the network (VPC/VNet) where CDW environment is deployed.
   **/
  private Boolean usePrivateLoadBalancer = null;

  /**
   * Enable Storage Roles
   **/
  private Boolean enableStorageRoles = false;

  /**
   * Options for custom ACR/ECR/Docker registries.
   **/
  private CustomRegistryOptions customRegistryOptions = null;

  /**
   * Options for activating an AWS environment.
   **/
  private AwsActivationOptions awsOptions = null;

  /**
   * Options for activating an Azure environment.
   **/
  private AzureActivationOptions azureOptions = null;

  /**
   * Options for activating a Private Cloud environment.
   **/
  private PrivateCloudActivationOptions privateCloudOptions = null;

  /**
   * Custom environment ID provided to the cluster
   **/
  private String customId = null;

  /**
   * Custom environment subdomain. Overrides the environment subdomain using a customized domain either in the old subdomain format like ENV_ID.dw or the new format like dw-ENV_NAME.
   **/
  private String customSubdomain = null;

  /**
   * Getter for environmentCrn.
   * The CRN of the environment for the cluster to create.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of the environment for the cluster to create.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for useOverlayNetwork.
   * Using an overlay network will save IP addresses in the VPC by using a private IP address range for Pods in the cluster.
   **/
  @JsonProperty("useOverlayNetwork")
  public Boolean getUseOverlayNetwork() {
    return useOverlayNetwork;
  }

  /**
   * Setter for useOverlayNetwork.
   * Using an overlay network will save IP addresses in the VPC by using a private IP address range for Pods in the cluster.
   **/
  public void setUseOverlayNetwork(Boolean useOverlayNetwork) {
    this.useOverlayNetwork = useOverlayNetwork;
  }

  /**
   * Getter for databaseBackupRetentionPeriod.
   * PostgreSQL server backup retention days.
   **/
  @JsonProperty("databaseBackupRetentionPeriod")
  public Integer getDatabaseBackupRetentionPeriod() {
    return databaseBackupRetentionPeriod;
  }

  /**
   * Setter for databaseBackupRetentionPeriod.
   * PostgreSQL server backup retention days.
   **/
  public void setDatabaseBackupRetentionPeriod(Integer databaseBackupRetentionPeriod) {
    this.databaseBackupRetentionPeriod = databaseBackupRetentionPeriod;
  }

  /**
   * Getter for whitelistIpCIDRs.
   * Comma separated list of IP address CIDRs to whitelist.
   **/
  @JsonProperty("whitelistIpCIDRs")
  public String getWhitelistIpCIDRs() {
    return whitelistIpCIDRs;
  }

  /**
   * Setter for whitelistIpCIDRs.
   * Comma separated list of IP address CIDRs to whitelist.
   **/
  public void setWhitelistIpCIDRs(String whitelistIpCIDRs) {
    this.whitelistIpCIDRs = whitelistIpCIDRs;
  }

  /**
   * Getter for usePrivateLoadBalancer.
   * Set up load balancer with private IP address. In AWS it is created in private subnets. In Azure an internal load balancer gets created. Make sure there is connectivity between your client network and the network (VPC/VNet) where CDW environment is deployed.
   **/
  @JsonProperty("usePrivateLoadBalancer")
  public Boolean getUsePrivateLoadBalancer() {
    return usePrivateLoadBalancer;
  }

  /**
   * Setter for usePrivateLoadBalancer.
   * Set up load balancer with private IP address. In AWS it is created in private subnets. In Azure an internal load balancer gets created. Make sure there is connectivity between your client network and the network (VPC/VNet) where CDW environment is deployed.
   **/
  public void setUsePrivateLoadBalancer(Boolean usePrivateLoadBalancer) {
    this.usePrivateLoadBalancer = usePrivateLoadBalancer;
  }

  /**
   * Getter for enableStorageRoles.
   * Enable Storage Roles
   **/
  @JsonProperty("enableStorageRoles")
  public Boolean getEnableStorageRoles() {
    return enableStorageRoles;
  }

  /**
   * Setter for enableStorageRoles.
   * Enable Storage Roles
   **/
  public void setEnableStorageRoles(Boolean enableStorageRoles) {
    this.enableStorageRoles = enableStorageRoles;
  }

  /**
   * Getter for customRegistryOptions.
   * Options for custom ACR/ECR/Docker registries.
   **/
  @JsonProperty("customRegistryOptions")
  public CustomRegistryOptions getCustomRegistryOptions() {
    return customRegistryOptions;
  }

  /**
   * Setter for customRegistryOptions.
   * Options for custom ACR/ECR/Docker registries.
   **/
  public void setCustomRegistryOptions(CustomRegistryOptions customRegistryOptions) {
    this.customRegistryOptions = customRegistryOptions;
  }

  /**
   * Getter for awsOptions.
   * Options for activating an AWS environment.
   **/
  @JsonProperty("awsOptions")
  public AwsActivationOptions getAwsOptions() {
    return awsOptions;
  }

  /**
   * Setter for awsOptions.
   * Options for activating an AWS environment.
   **/
  public void setAwsOptions(AwsActivationOptions awsOptions) {
    this.awsOptions = awsOptions;
  }

  /**
   * Getter for azureOptions.
   * Options for activating an Azure environment.
   **/
  @JsonProperty("azureOptions")
  public AzureActivationOptions getAzureOptions() {
    return azureOptions;
  }

  /**
   * Setter for azureOptions.
   * Options for activating an Azure environment.
   **/
  public void setAzureOptions(AzureActivationOptions azureOptions) {
    this.azureOptions = azureOptions;
  }

  /**
   * Getter for privateCloudOptions.
   * Options for activating a Private Cloud environment.
   **/
  @JsonProperty("privateCloudOptions")
  public PrivateCloudActivationOptions getPrivateCloudOptions() {
    return privateCloudOptions;
  }

  /**
   * Setter for privateCloudOptions.
   * Options for activating a Private Cloud environment.
   **/
  public void setPrivateCloudOptions(PrivateCloudActivationOptions privateCloudOptions) {
    this.privateCloudOptions = privateCloudOptions;
  }

  /**
   * Getter for customId.
   * Custom environment ID provided to the cluster
   **/
  @JsonProperty("customId")
  public String getCustomId() {
    return customId;
  }

  /**
   * Setter for customId.
   * Custom environment ID provided to the cluster
   **/
  public void setCustomId(String customId) {
    this.customId = customId;
  }

  /**
   * Getter for customSubdomain.
   * Custom environment subdomain. Overrides the environment subdomain using a customized domain either in the old subdomain format like ENV_ID.dw or the new format like dw-ENV_NAME.
   **/
  @JsonProperty("customSubdomain")
  public String getCustomSubdomain() {
    return customSubdomain;
  }

  /**
   * Setter for customSubdomain.
   * Custom environment subdomain. Overrides the environment subdomain using a customized domain either in the old subdomain format like ENV_ID.dw or the new format like dw-ENV_NAME.
   **/
  public void setCustomSubdomain(String customSubdomain) {
    this.customSubdomain = customSubdomain;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateClusterRequest createClusterRequest = (CreateClusterRequest) o;
    if (!Objects.equals(this.environmentCrn, createClusterRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.useOverlayNetwork, createClusterRequest.useOverlayNetwork)) {
      return false;
    }
    if (!Objects.equals(this.databaseBackupRetentionPeriod, createClusterRequest.databaseBackupRetentionPeriod)) {
      return false;
    }
    if (!Objects.equals(this.whitelistIpCIDRs, createClusterRequest.whitelistIpCIDRs)) {
      return false;
    }
    if (!Objects.equals(this.usePrivateLoadBalancer, createClusterRequest.usePrivateLoadBalancer)) {
      return false;
    }
    if (!Objects.equals(this.enableStorageRoles, createClusterRequest.enableStorageRoles)) {
      return false;
    }
    if (!Objects.equals(this.customRegistryOptions, createClusterRequest.customRegistryOptions)) {
      return false;
    }
    if (!Objects.equals(this.awsOptions, createClusterRequest.awsOptions)) {
      return false;
    }
    if (!Objects.equals(this.azureOptions, createClusterRequest.azureOptions)) {
      return false;
    }
    if (!Objects.equals(this.privateCloudOptions, createClusterRequest.privateCloudOptions)) {
      return false;
    }
    if (!Objects.equals(this.customId, createClusterRequest.customId)) {
      return false;
    }
    if (!Objects.equals(this.customSubdomain, createClusterRequest.customSubdomain)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, useOverlayNetwork, databaseBackupRetentionPeriod, whitelistIpCIDRs, usePrivateLoadBalancer, enableStorageRoles, customRegistryOptions, awsOptions, azureOptions, privateCloudOptions, customId, customSubdomain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateClusterRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    useOverlayNetwork: ").append(toIndentedString(useOverlayNetwork)).append("\n");
    sb.append("    databaseBackupRetentionPeriod: ").append(toIndentedString(databaseBackupRetentionPeriod)).append("\n");
    sb.append("    whitelistIpCIDRs: ").append(toIndentedString(whitelistIpCIDRs)).append("\n");
    sb.append("    usePrivateLoadBalancer: ").append(toIndentedString(usePrivateLoadBalancer)).append("\n");
    sb.append("    enableStorageRoles: ").append(toIndentedString(enableStorageRoles)).append("\n");
    sb.append("    customRegistryOptions: ").append(toIndentedString(customRegistryOptions)).append("\n");
    sb.append("    awsOptions: ").append(toIndentedString(awsOptions)).append("\n");
    sb.append("    azureOptions: ").append(toIndentedString(azureOptions)).append("\n");
    sb.append("    privateCloudOptions: ").append(toIndentedString(privateCloudOptions)).append("\n");
    sb.append("    customId: ").append(toIndentedString(customId)).append("\n");
    sb.append("    customSubdomain: ").append(toIndentedString(customSubdomain)).append("\n");
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

