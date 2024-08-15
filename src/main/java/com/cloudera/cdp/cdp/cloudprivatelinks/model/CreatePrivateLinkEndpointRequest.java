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
import com.cloudera.cdp.cloudprivatelinks.model.AWSAccountDetails;
import com.cloudera.cdp.cloudprivatelinks.model.AzureAccountDetails;

/**
 * Request object for the CreatePrivateLinkEndpoint method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-08-15T13:42:20.381-07:00")
public class CreatePrivateLinkEndpointRequest  {

  /**
   * Cloud Service Provider. Currently supporting AWS and AZURE.
   **/
  private String cloudServiceProvider = null;

  /**
   * Enable Private DNS for PrivateLink endpoint.
   **/
  private Boolean enablePrivateDns = null;

  /**
   * CDP service group.
   **/
  private String serviceGroup = null;

  /**
   * AWS account details where the PrivateLink endpoint is created.
   **/
  private AWSAccountDetails awsAccountDetails = null;

  /**
   * Azure account details where PrivateLink endpoint is created.
   **/
  private AzureAccountDetails azureAccountDetails = null;

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
   * Getter for enablePrivateDns.
   * Enable Private DNS for PrivateLink endpoint.
   **/
  @JsonProperty("enablePrivateDns")
  public Boolean getEnablePrivateDns() {
    return enablePrivateDns;
  }

  /**
   * Setter for enablePrivateDns.
   * Enable Private DNS for PrivateLink endpoint.
   **/
  public void setEnablePrivateDns(Boolean enablePrivateDns) {
    this.enablePrivateDns = enablePrivateDns;
  }

  /**
   * Getter for serviceGroup.
   * CDP service group.
   **/
  @JsonProperty("serviceGroup")
  public String getServiceGroup() {
    return serviceGroup;
  }

  /**
   * Setter for serviceGroup.
   * CDP service group.
   **/
  public void setServiceGroup(String serviceGroup) {
    this.serviceGroup = serviceGroup;
  }

  /**
   * Getter for awsAccountDetails.
   * AWS account details where the PrivateLink endpoint is created.
   **/
  @JsonProperty("awsAccountDetails")
  public AWSAccountDetails getAwsAccountDetails() {
    return awsAccountDetails;
  }

  /**
   * Setter for awsAccountDetails.
   * AWS account details where the PrivateLink endpoint is created.
   **/
  public void setAwsAccountDetails(AWSAccountDetails awsAccountDetails) {
    this.awsAccountDetails = awsAccountDetails;
  }

  /**
   * Getter for azureAccountDetails.
   * Azure account details where PrivateLink endpoint is created.
   **/
  @JsonProperty("azureAccountDetails")
  public AzureAccountDetails getAzureAccountDetails() {
    return azureAccountDetails;
  }

  /**
   * Setter for azureAccountDetails.
   * Azure account details where PrivateLink endpoint is created.
   **/
  public void setAzureAccountDetails(AzureAccountDetails azureAccountDetails) {
    this.azureAccountDetails = azureAccountDetails;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePrivateLinkEndpointRequest createPrivateLinkEndpointRequest = (CreatePrivateLinkEndpointRequest) o;
    if (!Objects.equals(this.cloudServiceProvider, createPrivateLinkEndpointRequest.cloudServiceProvider)) {
      return false;
    }
    if (!Objects.equals(this.enablePrivateDns, createPrivateLinkEndpointRequest.enablePrivateDns)) {
      return false;
    }
    if (!Objects.equals(this.serviceGroup, createPrivateLinkEndpointRequest.serviceGroup)) {
      return false;
    }
    if (!Objects.equals(this.awsAccountDetails, createPrivateLinkEndpointRequest.awsAccountDetails)) {
      return false;
    }
    if (!Objects.equals(this.azureAccountDetails, createPrivateLinkEndpointRequest.azureAccountDetails)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudServiceProvider, enablePrivateDns, serviceGroup, awsAccountDetails, azureAccountDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePrivateLinkEndpointRequest {\n");
    sb.append("    cloudServiceProvider: ").append(toIndentedString(cloudServiceProvider)).append("\n");
    sb.append("    enablePrivateDns: ").append(toIndentedString(enablePrivateDns)).append("\n");
    sb.append("    serviceGroup: ").append(toIndentedString(serviceGroup)).append("\n");
    sb.append("    awsAccountDetails: ").append(toIndentedString(awsAccountDetails)).append("\n");
    sb.append("    azureAccountDetails: ").append(toIndentedString(azureAccountDetails)).append("\n");
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

