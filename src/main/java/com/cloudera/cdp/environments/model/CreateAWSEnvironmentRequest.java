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
import com.cloudera.cdp.environments.model.AWSFreeIpaCreationRequest;
import com.cloudera.cdp.environments.model.AuthenticationRequest;
import com.cloudera.cdp.environments.model.AwsLogStorageRequest;
import com.cloudera.cdp.environments.model.FreeIpaImageRequest;
import com.cloudera.cdp.environments.model.SecurityAccessRequest;
import com.cloudera.cdp.environments.model.TagRequest;
import java.util.*;

/**
 * Request object for a create AWS environment request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-12-16T17:38:09.322-08:00")
public class CreateAWSEnvironmentRequest  {

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
   * Security control for FreeIPA and Datalake deployment.
   **/
  private SecurityAccessRequest securityAccess = null;

  /**
   * SSH authentication information for accessing cluster node instances. Users with access to this authentication information have root level access to the Data Lake and Data Hub cluster instances.
   **/
  private AuthenticationRequest authentication = null;

  /**
   * AWS storage configuration for cluster and audit logs.
   **/
  private AwsLogStorageRequest logStorage = null;

  /**
   * The network CIDR. This will create a VPC along with subnets in multiple Availability Zones.
   **/
  private String networkCidr = null;

  /**
   * The Amazon VPC ID. Mutually exclusive with networkCidr.
   **/
  private String vpcId = null;

  /**
   * One or more subnet ids within the VPC. Mutually exclusive with networkCidr.
   **/
  private List<String> subnetIds = new ArrayList<String>();

  /**
   * Whether to create private subnets or not.
   **/
  private Boolean createPrivateSubnets = null;

  /**
   * The scheme for the endpoint gateway. PUBLIC creates an external endpoint that can be accessed over the Internet. Defaults to PRIVATE which restricts the traffic to be internal to the VPC / Vnet.
   **/
  private String endpointAccessGatewayScheme = null;

  /**
   * The subnets to use for endpoint access gateway.
   **/
  private List<String> endpointAccessGatewaySubnetIds = new ArrayList<String>();

  /**
   * The name for the DynamoDB table backing S3Guard.
   **/
  private String s3GuardTableName = null;

  /**
   * An description of the environment.
   **/
  private String description = null;

  /**
   * Whether to enable SSH tunneling for the environment.
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
  private AWSFreeIpaCreationRequest freeIpa = null;

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
   * Getter for authentication.
   * SSH authentication information for accessing cluster node instances. Users with access to this authentication information have root level access to the Data Lake and Data Hub cluster instances.
   **/
  @JsonProperty("authentication")
  public AuthenticationRequest getAuthentication() {
    return authentication;
  }

  /**
   * Setter for authentication.
   * SSH authentication information for accessing cluster node instances. Users with access to this authentication information have root level access to the Data Lake and Data Hub cluster instances.
   **/
  public void setAuthentication(AuthenticationRequest authentication) {
    this.authentication = authentication;
  }

  /**
   * Getter for logStorage.
   * AWS storage configuration for cluster and audit logs.
   **/
  @JsonProperty("logStorage")
  public AwsLogStorageRequest getLogStorage() {
    return logStorage;
  }

  /**
   * Setter for logStorage.
   * AWS storage configuration for cluster and audit logs.
   **/
  public void setLogStorage(AwsLogStorageRequest logStorage) {
    this.logStorage = logStorage;
  }

  /**
   * Getter for networkCidr.
   * The network CIDR. This will create a VPC along with subnets in multiple Availability Zones.
   **/
  @JsonProperty("networkCidr")
  public String getNetworkCidr() {
    return networkCidr;
  }

  /**
   * Setter for networkCidr.
   * The network CIDR. This will create a VPC along with subnets in multiple Availability Zones.
   **/
  public void setNetworkCidr(String networkCidr) {
    this.networkCidr = networkCidr;
  }

  /**
   * Getter for vpcId.
   * The Amazon VPC ID. Mutually exclusive with networkCidr.
   **/
  @JsonProperty("vpcId")
  public String getVpcId() {
    return vpcId;
  }

  /**
   * Setter for vpcId.
   * The Amazon VPC ID. Mutually exclusive with networkCidr.
   **/
  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }

  /**
   * Getter for subnetIds.
   * One or more subnet ids within the VPC. Mutually exclusive with networkCidr.
   **/
  @JsonProperty("subnetIds")
  public List<String> getSubnetIds() {
    return subnetIds;
  }

  /**
   * Setter for subnetIds.
   * One or more subnet ids within the VPC. Mutually exclusive with networkCidr.
   **/
  public void setSubnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
  }

  /**
   * Getter for createPrivateSubnets.
   * Whether to create private subnets or not.
   **/
  @JsonProperty("createPrivateSubnets")
  public Boolean getCreatePrivateSubnets() {
    return createPrivateSubnets;
  }

  /**
   * Setter for createPrivateSubnets.
   * Whether to create private subnets or not.
   **/
  public void setCreatePrivateSubnets(Boolean createPrivateSubnets) {
    this.createPrivateSubnets = createPrivateSubnets;
  }

  /**
   * Getter for endpointAccessGatewayScheme.
   * The scheme for the endpoint gateway. PUBLIC creates an external endpoint that can be accessed over the Internet. Defaults to PRIVATE which restricts the traffic to be internal to the VPC / Vnet.
   **/
  @JsonProperty("endpointAccessGatewayScheme")
  public String getEndpointAccessGatewayScheme() {
    return endpointAccessGatewayScheme;
  }

  /**
   * Setter for endpointAccessGatewayScheme.
   * The scheme for the endpoint gateway. PUBLIC creates an external endpoint that can be accessed over the Internet. Defaults to PRIVATE which restricts the traffic to be internal to the VPC / Vnet.
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
   * Getter for s3GuardTableName.
   * The name for the DynamoDB table backing S3Guard.
   **/
  @JsonProperty("s3GuardTableName")
  public String getS3GuardTableName() {
    return s3GuardTableName;
  }

  /**
   * Setter for s3GuardTableName.
   * The name for the DynamoDB table backing S3Guard.
   **/
  public void setS3GuardTableName(String s3GuardTableName) {
    this.s3GuardTableName = s3GuardTableName;
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
  public AWSFreeIpaCreationRequest getFreeIpa() {
    return freeIpa;
  }

  /**
   * Setter for freeIpa.
   * The FreeIPA creation request for the environment
   **/
  public void setFreeIpa(AWSFreeIpaCreationRequest freeIpa) {
    this.freeIpa = freeIpa;
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAWSEnvironmentRequest createAWSEnvironmentRequest = (CreateAWSEnvironmentRequest) o;
    if (!Objects.equals(this.environmentName, createAWSEnvironmentRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.credentialName, createAWSEnvironmentRequest.credentialName)) {
      return false;
    }
    if (!Objects.equals(this.region, createAWSEnvironmentRequest.region)) {
      return false;
    }
    if (!Objects.equals(this.securityAccess, createAWSEnvironmentRequest.securityAccess)) {
      return false;
    }
    if (!Objects.equals(this.authentication, createAWSEnvironmentRequest.authentication)) {
      return false;
    }
    if (!Objects.equals(this.logStorage, createAWSEnvironmentRequest.logStorage)) {
      return false;
    }
    if (!Objects.equals(this.networkCidr, createAWSEnvironmentRequest.networkCidr)) {
      return false;
    }
    if (!Objects.equals(this.vpcId, createAWSEnvironmentRequest.vpcId)) {
      return false;
    }
    if (!Objects.equals(this.subnetIds, createAWSEnvironmentRequest.subnetIds)) {
      return false;
    }
    if (!Objects.equals(this.createPrivateSubnets, createAWSEnvironmentRequest.createPrivateSubnets)) {
      return false;
    }
    if (!Objects.equals(this.endpointAccessGatewayScheme, createAWSEnvironmentRequest.endpointAccessGatewayScheme)) {
      return false;
    }
    if (!Objects.equals(this.endpointAccessGatewaySubnetIds, createAWSEnvironmentRequest.endpointAccessGatewaySubnetIds)) {
      return false;
    }
    if (!Objects.equals(this.s3GuardTableName, createAWSEnvironmentRequest.s3GuardTableName)) {
      return false;
    }
    if (!Objects.equals(this.description, createAWSEnvironmentRequest.description)) {
      return false;
    }
    if (!Objects.equals(this.enableTunnel, createAWSEnvironmentRequest.enableTunnel)) {
      return false;
    }
    if (!Objects.equals(this.workloadAnalytics, createAWSEnvironmentRequest.workloadAnalytics)) {
      return false;
    }
    if (!Objects.equals(this.reportDeploymentLogs, createAWSEnvironmentRequest.reportDeploymentLogs)) {
      return false;
    }
    if (!Objects.equals(this.freeIpa, createAWSEnvironmentRequest.freeIpa)) {
      return false;
    }
    if (!Objects.equals(this.image, createAWSEnvironmentRequest.image)) {
      return false;
    }
    if (!Objects.equals(this.tags, createAWSEnvironmentRequest.tags)) {
      return false;
    }
    if (!Objects.equals(this.proxyConfigName, createAWSEnvironmentRequest.proxyConfigName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, credentialName, region, securityAccess, authentication, logStorage, networkCidr, vpcId, subnetIds, createPrivateSubnets, endpointAccessGatewayScheme, endpointAccessGatewaySubnetIds, s3GuardTableName, description, enableTunnel, workloadAnalytics, reportDeploymentLogs, freeIpa, image, tags, proxyConfigName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAWSEnvironmentRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    credentialName: ").append(toIndentedString(credentialName)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    securityAccess: ").append(toIndentedString(securityAccess)).append("\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    logStorage: ").append(toIndentedString(logStorage)).append("\n");
    sb.append("    networkCidr: ").append(toIndentedString(networkCidr)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
    sb.append("    createPrivateSubnets: ").append(toIndentedString(createPrivateSubnets)).append("\n");
    sb.append("    endpointAccessGatewayScheme: ").append(toIndentedString(endpointAccessGatewayScheme)).append("\n");
    sb.append("    endpointAccessGatewaySubnetIds: ").append(toIndentedString(endpointAccessGatewaySubnetIds)).append("\n");
    sb.append("    s3GuardTableName: ").append(toIndentedString(s3GuardTableName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enableTunnel: ").append(toIndentedString(enableTunnel)).append("\n");
    sb.append("    workloadAnalytics: ").append(toIndentedString(workloadAnalytics)).append("\n");
    sb.append("    reportDeploymentLogs: ").append(toIndentedString(reportDeploymentLogs)).append("\n");
    sb.append("    freeIpa: ").append(toIndentedString(freeIpa)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    proxyConfigName: ").append(toIndentedString(proxyConfigName)).append("\n");
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

