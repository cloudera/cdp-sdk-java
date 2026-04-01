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

package com.cloudera.cdp.cloudprivatelinks.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.cloudprivatelinks.model.AWSAccountInfo;
import com.cloudera.cdp.cloudprivatelinks.model.AzureAccountInfo;
import com.cloudera.cdp.cloudprivatelinks.model.ResourceTag;
import java.util.*;

/**
 * Request object for the UpdatePrivateLinkEndpoints method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-31T14:25:35.389-07:00")
public class UpdatePrivateLinkEndpointRequest  {

  /**
   * Cloud Service Provider. Currently supporting AWS and AZURE.
   **/
  private String cloudServiceProvider = null;

  /**
   * AWS account information in which the private endpoint is already created.
   **/
  private AWSAccountInfo awsAccountInfo = null;

  /**
   * Azure account information in which the private endpoint is already created.
   **/
  private AzureAccountInfo azureAccountInfo = null;

  /**
   * New subnet IDs to be applied during the private endpoint update.
   **/
  private List<String> subnetIds = new ArrayList<String>();

  /**
   * New tags that are to be applied during the private endpoint update.
   **/
  private List<ResourceTag> resourceTags = new ArrayList<ResourceTag>();

  /**
   * Update operation to perform - APPEND/REPLACE subnet IDs.
   **/
  private String updateOperation = null;

  /**
   * The resource group in which the private endpoint is already created.
   **/
  private String resourceGroup = null;

  /**
   * Getter for cloudServiceProvider.
   * Cloud Service Provider. Currently supporting AWS and AZURE.
   **/
  @JsonProperty("cloudServiceProvider")
  public String getCloudServiceProvider() {
    return cloudServiceProvider;
  }

  /**
   * Setter for cloudServiceProvider.
   * Cloud Service Provider. Currently supporting AWS and AZURE.
   **/
  public void setCloudServiceProvider(String cloudServiceProvider) {
    this.cloudServiceProvider = cloudServiceProvider;
  }

  /**
   * Getter for awsAccountInfo.
   * AWS account information in which the private endpoint is already created.
   **/
  @JsonProperty("awsAccountInfo")
  public AWSAccountInfo getAwsAccountInfo() {
    return awsAccountInfo;
  }

  /**
   * Setter for awsAccountInfo.
   * AWS account information in which the private endpoint is already created.
   **/
  public void setAwsAccountInfo(AWSAccountInfo awsAccountInfo) {
    this.awsAccountInfo = awsAccountInfo;
  }

  /**
   * Getter for azureAccountInfo.
   * Azure account information in which the private endpoint is already created.
   **/
  @JsonProperty("azureAccountInfo")
  public AzureAccountInfo getAzureAccountInfo() {
    return azureAccountInfo;
  }

  /**
   * Setter for azureAccountInfo.
   * Azure account information in which the private endpoint is already created.
   **/
  public void setAzureAccountInfo(AzureAccountInfo azureAccountInfo) {
    this.azureAccountInfo = azureAccountInfo;
  }

  /**
   * Getter for subnetIds.
   * New subnet IDs to be applied during the private endpoint update.
   **/
  @JsonProperty("subnetIds")
  public List<String> getSubnetIds() {
    return subnetIds;
  }

  /**
   * Setter for subnetIds.
   * New subnet IDs to be applied during the private endpoint update.
   **/
  public void setSubnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
  }

  /**
   * Getter for resourceTags.
   * New tags that are to be applied during the private endpoint update.
   **/
  @JsonProperty("resourceTags")
  public List<ResourceTag> getResourceTags() {
    return resourceTags;
  }

  /**
   * Setter for resourceTags.
   * New tags that are to be applied during the private endpoint update.
   **/
  public void setResourceTags(List<ResourceTag> resourceTags) {
    this.resourceTags = resourceTags;
  }

  /**
   * Getter for updateOperation.
   * Update operation to perform - APPEND/REPLACE subnet IDs.
   **/
  @JsonProperty("updateOperation")
  public String getUpdateOperation() {
    return updateOperation;
  }

  /**
   * Setter for updateOperation.
   * Update operation to perform - APPEND/REPLACE subnet IDs.
   **/
  public void setUpdateOperation(String updateOperation) {
    this.updateOperation = updateOperation;
  }

  /**
   * Getter for resourceGroup.
   * The resource group in which the private endpoint is already created.
   **/
  @JsonProperty("resourceGroup")
  public String getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Setter for resourceGroup.
   * The resource group in which the private endpoint is already created.
   **/
  public void setResourceGroup(String resourceGroup) {
    this.resourceGroup = resourceGroup;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePrivateLinkEndpointRequest updatePrivateLinkEndpointRequest = (UpdatePrivateLinkEndpointRequest) o;
    if (!Objects.equals(this.cloudServiceProvider, updatePrivateLinkEndpointRequest.cloudServiceProvider)) {
      return false;
    }
    if (!Objects.equals(this.awsAccountInfo, updatePrivateLinkEndpointRequest.awsAccountInfo)) {
      return false;
    }
    if (!Objects.equals(this.azureAccountInfo, updatePrivateLinkEndpointRequest.azureAccountInfo)) {
      return false;
    }
    if (!Objects.equals(this.subnetIds, updatePrivateLinkEndpointRequest.subnetIds)) {
      return false;
    }
    if (!Objects.equals(this.resourceTags, updatePrivateLinkEndpointRequest.resourceTags)) {
      return false;
    }
    if (!Objects.equals(this.updateOperation, updatePrivateLinkEndpointRequest.updateOperation)) {
      return false;
    }
    if (!Objects.equals(this.resourceGroup, updatePrivateLinkEndpointRequest.resourceGroup)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudServiceProvider, awsAccountInfo, azureAccountInfo, subnetIds, resourceTags, updateOperation, resourceGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePrivateLinkEndpointRequest {\n");
    sb.append("    cloudServiceProvider: ").append(toIndentedString(cloudServiceProvider)).append("\n");
    sb.append("    awsAccountInfo: ").append(toIndentedString(awsAccountInfo)).append("\n");
    sb.append("    azureAccountInfo: ").append(toIndentedString(azureAccountInfo)).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
    sb.append("    resourceTags: ").append(toIndentedString(resourceTags)).append("\n");
    sb.append("    updateOperation: ").append(toIndentedString(updateOperation)).append("\n");
    sb.append("    resourceGroup: ").append(toIndentedString(resourceGroup)).append("\n");
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

