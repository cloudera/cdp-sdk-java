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
 * Details of the cloud network and the cross-account role required to delete the PrivateLink endpoint.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-14T11:34:39.239-07:00")
public class AzureAccountInfo  {

  /**
   * Azure client secret credential, either this or credential CRN should be passed.
   **/
  private AzureClientSecretCredential azureClientSecretCredential = null;

  /**
   * CDP Credential CRN to fetch the Azure client secret credentials, either this or AzureClientSecretCredential should be passed.
   **/
  private String credentialCrn = null;

  /**
   * Region in which VPC exists.
   **/
  private String location = null;

  /**
   * vNet ID in which the private link should be created.
   **/
  private String vNetId = null;

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
   * Getter for location.
   * Region in which VPC exists.
   **/
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  /**
   * Setter for location.
   * Region in which VPC exists.
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureAccountInfo azureAccountInfo = (AzureAccountInfo) o;
    if (!Objects.equals(this.azureClientSecretCredential, azureAccountInfo.azureClientSecretCredential)) {
      return false;
    }
    if (!Objects.equals(this.credentialCrn, azureAccountInfo.credentialCrn)) {
      return false;
    }
    if (!Objects.equals(this.location, azureAccountInfo.location)) {
      return false;
    }
    if (!Objects.equals(this.vNetId, azureAccountInfo.vNetId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(azureClientSecretCredential, credentialCrn, location, vNetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureAccountInfo {\n");
    sb.append("    azureClientSecretCredential: ").append(toIndentedString(azureClientSecretCredential)).append("\n");
    sb.append("    credentialCrn: ").append(toIndentedString(credentialCrn)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    vNetId: ").append(toIndentedString(vNetId)).append("\n");
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

