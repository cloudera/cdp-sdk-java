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

/**
 * Request object for the DeletePrivateLinkEndpoint method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-10-31T09:45:13.298-07:00")
public class DeletePrivateLinkEndpointRequest  {

  /**
   * Cloud Service Provider. Currently supporting AWS and AZURE.
   **/
  private String cloudServiceProvider = null;

  /**
   * AWS account details to delete the PrivateLink endpoint from.
   **/
  private AWSAccountInfo awsAccountInfo = null;

  /**
   * Azure account details to delete the PrivateLink endpoint from.
   **/
  private AzureAccountInfo azureAccountInfo = null;

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
   * AWS account details to delete the PrivateLink endpoint from.
   **/
  @JsonProperty("awsAccountInfo")
  public AWSAccountInfo getAwsAccountInfo() {
    return awsAccountInfo;
  }

  /**
   * Setter for awsAccountInfo.
   * AWS account details to delete the PrivateLink endpoint from.
   **/
  public void setAwsAccountInfo(AWSAccountInfo awsAccountInfo) {
    this.awsAccountInfo = awsAccountInfo;
  }

  /**
   * Getter for azureAccountInfo.
   * Azure account details to delete the PrivateLink endpoint from.
   **/
  @JsonProperty("azureAccountInfo")
  public AzureAccountInfo getAzureAccountInfo() {
    return azureAccountInfo;
  }

  /**
   * Setter for azureAccountInfo.
   * Azure account details to delete the PrivateLink endpoint from.
   **/
  public void setAzureAccountInfo(AzureAccountInfo azureAccountInfo) {
    this.azureAccountInfo = azureAccountInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletePrivateLinkEndpointRequest deletePrivateLinkEndpointRequest = (DeletePrivateLinkEndpointRequest) o;
    if (!Objects.equals(this.cloudServiceProvider, deletePrivateLinkEndpointRequest.cloudServiceProvider)) {
      return false;
    }
    if (!Objects.equals(this.awsAccountInfo, deletePrivateLinkEndpointRequest.awsAccountInfo)) {
      return false;
    }
    if (!Objects.equals(this.azureAccountInfo, deletePrivateLinkEndpointRequest.azureAccountInfo)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudServiceProvider, awsAccountInfo, azureAccountInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePrivateLinkEndpointRequest {\n");
    sb.append("    cloudServiceProvider: ").append(toIndentedString(cloudServiceProvider)).append("\n");
    sb.append("    awsAccountInfo: ").append(toIndentedString(awsAccountInfo)).append("\n");
    sb.append("    azureAccountInfo: ").append(toIndentedString(azureAccountInfo)).append("\n");
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

