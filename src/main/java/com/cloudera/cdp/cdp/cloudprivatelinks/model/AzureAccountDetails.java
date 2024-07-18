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
import com.cloudera.cdp.cloudprivatelinks.model.AzureClientSecretCredential;

/**
 * Details of the cloud network and the cross-account role required to create the PrivateLink endpoint.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-07-18T14:59:57.730-07:00")
public class AzureAccountDetails  {

  /**
   * Azure client secret credential, either this or credential CRN should be passed.
   **/
  private AzureClientSecretCredential azureClientSecretCredential = null;

  /**
   * CDP Credential CRN to fetch the Azure client secret credentials, either this or AzureClientSecretCredential should be passed.
   **/
  private String credentialCrn = null;

  /**
   * The Subscription for which the Private link service to be allowed/accessible.
   **/
  private String subscriptionId = null;

  /**
   * The Resource group under which the Private endpoint to be created.
   **/
  private String resourceGroup = null;

  /**
   * Azure location where endpoint should be created.
   **/
  private String location = null;

  /**
   * vNet ID in which the private link should be created.
   **/
  private String vNetId = null;

  /**
   * ID of the private subnet in which the private link should be created.
   **/
  private String subnetId = null;

  /**
   * Getter for azureClientSecretCredential.
   * Azure client secret credential, either this or credential CRN should be passed.
   **/
  @JsonProperty("azureClientSecretCredential")
  public AzureClientSecretCredential getAzureClientSecretCredential() {
    return azureClientSecretCredential;
  }

  /**
   * Setter for azureClientSecretCredential.
   * Azure client secret credential, either this or credential CRN should be passed.
   **/
  public void setAzureClientSecretCredential(AzureClientSecretCredential azureClientSecretCredential) {
    this.azureClientSecretCredential = azureClientSecretCredential;
  }

  /**
   * Getter for credentialCrn.
   * CDP Credential CRN to fetch the Azure client secret credentials, either this or AzureClientSecretCredential should be passed.
   **/
  @JsonProperty("credentialCrn")
  public String getCredentialCrn() {
    return credentialCrn;
  }

  /**
   * Setter for credentialCrn.
   * CDP Credential CRN to fetch the Azure client secret credentials, either this or AzureClientSecretCredential should be passed.
   **/
  public void setCredentialCrn(String credentialCrn) {
    this.credentialCrn = credentialCrn;
  }

  /**
   * Getter for subscriptionId.
   * The Subscription for which the Private link service to be allowed/accessible.
   **/
  @JsonProperty("subscriptionId")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  /**
   * Setter for subscriptionId.
   * The Subscription for which the Private link service to be allowed/accessible.
   **/
  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  /**
   * Getter for resourceGroup.
   * The Resource group under which the Private endpoint to be created.
   **/
  @JsonProperty("resourceGroup")
  public String getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Setter for resourceGroup.
   * The Resource group under which the Private endpoint to be created.
   **/
  public void setResourceGroup(String resourceGroup) {
    this.resourceGroup = resourceGroup;
  }

  /**
   * Getter for location.
   * Azure location where endpoint should be created.
   **/
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  /**
   * Setter for location.
   * Azure location where endpoint should be created.
   **/
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * Getter for vNetId.
   * vNet ID in which the private link should be created.
   **/
  @JsonProperty("vNetId")
  public String getVNetId() {
    return vNetId;
  }

  /**
   * Setter for vNetId.
   * vNet ID in which the private link should be created.
   **/
  public void setVNetId(String vNetId) {
    this.vNetId = vNetId;
  }

  /**
   * Getter for subnetId.
   * ID of the private subnet in which the private link should be created.
   **/
  @JsonProperty("subnetId")
  public String getSubnetId() {
    return subnetId;
  }

  /**
   * Setter for subnetId.
   * ID of the private subnet in which the private link should be created.
   **/
  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureAccountDetails azureAccountDetails = (AzureAccountDetails) o;
    if (!Objects.equals(this.azureClientSecretCredential, azureAccountDetails.azureClientSecretCredential)) {
      return false;
    }
    if (!Objects.equals(this.credentialCrn, azureAccountDetails.credentialCrn)) {
      return false;
    }
    if (!Objects.equals(this.subscriptionId, azureAccountDetails.subscriptionId)) {
      return false;
    }
    if (!Objects.equals(this.resourceGroup, azureAccountDetails.resourceGroup)) {
      return false;
    }
    if (!Objects.equals(this.location, azureAccountDetails.location)) {
      return false;
    }
    if (!Objects.equals(this.vNetId, azureAccountDetails.vNetId)) {
      return false;
    }
    if (!Objects.equals(this.subnetId, azureAccountDetails.subnetId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(azureClientSecretCredential, credentialCrn, subscriptionId, resourceGroup, location, vNetId, subnetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureAccountDetails {\n");
    sb.append("    azureClientSecretCredential: ").append(toIndentedString(azureClientSecretCredential)).append("\n");
    sb.append("    credentialCrn: ").append(toIndentedString(credentialCrn)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    resourceGroup: ").append(toIndentedString(resourceGroup)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    vNetId: ").append(toIndentedString(vNetId)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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

