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
import java.util.*;

/**
 * Request object for retrieving the status of a Private Link.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-26T08:05:46.268-08:00")
public class GetPrivateLinkStatusRequest  {

  /**
   * List of subnets in the given cloud network to query PrivateLink status. This field has been deprecated.
   **/
  private List<String> subnetIds = new ArrayList<String>();

  /**
   * Virtual Network Id to query the status of PrivateLink in Azure.
   **/
  private String vNetId = null;

  /**
   * VPC ID to query the status of Private Link in AWS.
   **/
  private String vpcId = null;

  /**
   * Cloud Service Provider. Supports AWS and AZURE.
   **/
  private String cloudServiceProvider = null;

  /**
   * Getter for subnetIds.
   * List of subnets in the given cloud network to query PrivateLink status. This field has been deprecated.
   **/
  @Deprecated
  @JsonProperty("subnetIds")
  public List<String> getSubnetIds() {
    return subnetIds;
  }

  /**
   * Setter for subnetIds.
   * List of subnets in the given cloud network to query PrivateLink status. This field has been deprecated.
   **/
  @Deprecated
  public void setSubnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
  }

  /**
   * Getter for vNetId.
   * Virtual Network Id to query the status of PrivateLink in Azure.
   **/
  @JsonProperty("vNetId")
  public String getVNetId() {
    return vNetId;
  }

  /**
   * Setter for vNetId.
   * Virtual Network Id to query the status of PrivateLink in Azure.
   **/
  public void setVNetId(String vNetId) {
    this.vNetId = vNetId;
  }

  /**
   * Getter for vpcId.
   * VPC ID to query the status of Private Link in AWS.
   **/
  @JsonProperty("vpcId")
  public String getVpcId() {
    return vpcId;
  }

  /**
   * Setter for vpcId.
   * VPC ID to query the status of Private Link in AWS.
   **/
  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }

  /**
   * Getter for cloudServiceProvider.
   * Cloud Service Provider. Supports AWS and AZURE.
   **/
  @JsonProperty("cloudServiceProvider")
  public String getCloudServiceProvider() {
    return cloudServiceProvider;
  }

  /**
   * Setter for cloudServiceProvider.
   * Cloud Service Provider. Supports AWS and AZURE.
   **/
  public void setCloudServiceProvider(String cloudServiceProvider) {
    this.cloudServiceProvider = cloudServiceProvider;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPrivateLinkStatusRequest getPrivateLinkStatusRequest = (GetPrivateLinkStatusRequest) o;
    if (!Objects.equals(this.subnetIds, getPrivateLinkStatusRequest.subnetIds)) {
      return false;
    }
    if (!Objects.equals(this.vNetId, getPrivateLinkStatusRequest.vNetId)) {
      return false;
    }
    if (!Objects.equals(this.vpcId, getPrivateLinkStatusRequest.vpcId)) {
      return false;
    }
    if (!Objects.equals(this.cloudServiceProvider, getPrivateLinkStatusRequest.cloudServiceProvider)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnetIds, vNetId, vpcId, cloudServiceProvider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPrivateLinkStatusRequest {\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
    sb.append("    vNetId: ").append(toIndentedString(vNetId)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    cloudServiceProvider: ").append(toIndentedString(cloudServiceProvider)).append("\n");
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

