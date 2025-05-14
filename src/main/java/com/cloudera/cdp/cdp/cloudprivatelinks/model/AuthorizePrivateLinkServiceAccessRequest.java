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

/**
 * Request object for the AuthorizePrivateLinkServicesAccess method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-14T11:34:39.239-07:00")
public class AuthorizePrivateLinkServiceAccessRequest  {

  /**
   * AWS account ID to authorize access for PrivateLink.
   **/
  private String cloudAccountId = null;

  /**
   * Azure subscription ID to authorize access for PrivateLink.
   **/
  private String subscriptionId = null;

  /**
   * Region where the private link service exists.
   **/
  private String region = null;

  /**
   * CDP service group. Currently supported \"CDP-CONTROL-PLANE\" for PaaS.
   **/
  private String serviceGroup = null;

  /**
   * Cloud Service Provider. Currently supporting AWS and AZURE.
   **/
  private String cloudServiceProvider = null;

  /**
   * Getter for cloudAccountId.
   * AWS account ID to authorize access for PrivateLink.
   **/
  @JsonProperty("cloudAccountId")
  public String getCloudAccountId() {
    return cloudAccountId;
  }

  /**
   * Setter for cloudAccountId.
   * AWS account ID to authorize access for PrivateLink.
   **/
  public void setCloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
  }

  /**
   * Getter for subscriptionId.
   * Azure subscription ID to authorize access for PrivateLink.
   **/
  @JsonProperty("subscriptionId")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  /**
   * Setter for subscriptionId.
   * Azure subscription ID to authorize access for PrivateLink.
   **/
  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  /**
   * Getter for region.
   * Region where the private link service exists.
   **/
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  /**
   * Setter for region.
   * Region where the private link service exists.
   **/
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Getter for serviceGroup.
   * CDP service group. Currently supported \&quot;CDP-CONTROL-PLANE\&quot; for PaaS.
   **/
  @JsonProperty("serviceGroup")
  public String getServiceGroup() {
    return serviceGroup;
  }

  /**
   * Setter for serviceGroup.
   * CDP service group. Currently supported \&quot;CDP-CONTROL-PLANE\&quot; for PaaS.
   **/
  public void setServiceGroup(String serviceGroup) {
    this.serviceGroup = serviceGroup;
  }

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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizePrivateLinkServiceAccessRequest authorizePrivateLinkServiceAccessRequest = (AuthorizePrivateLinkServiceAccessRequest) o;
    if (!Objects.equals(this.cloudAccountId, authorizePrivateLinkServiceAccessRequest.cloudAccountId)) {
      return false;
    }
    if (!Objects.equals(this.subscriptionId, authorizePrivateLinkServiceAccessRequest.subscriptionId)) {
      return false;
    }
    if (!Objects.equals(this.region, authorizePrivateLinkServiceAccessRequest.region)) {
      return false;
    }
    if (!Objects.equals(this.serviceGroup, authorizePrivateLinkServiceAccessRequest.serviceGroup)) {
      return false;
    }
    if (!Objects.equals(this.cloudServiceProvider, authorizePrivateLinkServiceAccessRequest.cloudServiceProvider)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudAccountId, subscriptionId, region, serviceGroup, cloudServiceProvider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizePrivateLinkServiceAccessRequest {\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    serviceGroup: ").append(toIndentedString(serviceGroup)).append("\n");
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

