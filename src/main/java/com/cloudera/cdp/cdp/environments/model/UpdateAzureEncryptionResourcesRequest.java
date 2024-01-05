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

/**
 * Request object for updating Azure encryption resources.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-01-05T09:16:31.175-08:00")
public class UpdateAzureEncryptionResourcesRequest  {

  /**
   * The name or CRN of the environment.
   **/
  private String environment = null;

  /**
   * The URL of an encryption key, which will be used to encrypt the Azure Managed Disks, if the entitlement has been granted.
   **/
  private String encryptionKeyUrl = null;

  /**
   * Name of the existing Azure resource group hosting the Azure Key Vault containing customer managed key which will be used to encrypt the Azure Managed Disks. It is required only when the entitlement is granted and the resource group of the key vault is different from the resource group in which the environment is to be created. Omitting it implies that, the key vault containing the encryption key is present in the same resource group where the environment would be created.
   **/
  private String encryptionKeyResourceGroupName = null;

  /**
   * Getter for environment.
   * The name or CRN of the environment.
   **/
  @JsonProperty("environment")
  public String getEnvironment() {
    return environment;
  }

  /**
   * Setter for environment.
   * The name or CRN of the environment.
   **/
  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  /**
   * Getter for encryptionKeyUrl.
   * The URL of an encryption key, which will be used to encrypt the Azure Managed Disks, if the entitlement has been granted.
   **/
  @JsonProperty("encryptionKeyUrl")
  public String getEncryptionKeyUrl() {
    return encryptionKeyUrl;
  }

  /**
   * Setter for encryptionKeyUrl.
   * The URL of an encryption key, which will be used to encrypt the Azure Managed Disks, if the entitlement has been granted.
   **/
  public void setEncryptionKeyUrl(String encryptionKeyUrl) {
    this.encryptionKeyUrl = encryptionKeyUrl;
  }

  /**
   * Getter for encryptionKeyResourceGroupName.
   * Name of the existing Azure resource group hosting the Azure Key Vault containing customer managed key which will be used to encrypt the Azure Managed Disks. It is required only when the entitlement is granted and the resource group of the key vault is different from the resource group in which the environment is to be created. Omitting it implies that, the key vault containing the encryption key is present in the same resource group where the environment would be created.
   **/
  @JsonProperty("encryptionKeyResourceGroupName")
  public String getEncryptionKeyResourceGroupName() {
    return encryptionKeyResourceGroupName;
  }

  /**
   * Setter for encryptionKeyResourceGroupName.
   * Name of the existing Azure resource group hosting the Azure Key Vault containing customer managed key which will be used to encrypt the Azure Managed Disks. It is required only when the entitlement is granted and the resource group of the key vault is different from the resource group in which the environment is to be created. Omitting it implies that, the key vault containing the encryption key is present in the same resource group where the environment would be created.
   **/
  public void setEncryptionKeyResourceGroupName(String encryptionKeyResourceGroupName) {
    this.encryptionKeyResourceGroupName = encryptionKeyResourceGroupName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAzureEncryptionResourcesRequest updateAzureEncryptionResourcesRequest = (UpdateAzureEncryptionResourcesRequest) o;
    if (!Objects.equals(this.environment, updateAzureEncryptionResourcesRequest.environment)) {
      return false;
    }
    if (!Objects.equals(this.encryptionKeyUrl, updateAzureEncryptionResourcesRequest.encryptionKeyUrl)) {
      return false;
    }
    if (!Objects.equals(this.encryptionKeyResourceGroupName, updateAzureEncryptionResourcesRequest.encryptionKeyResourceGroupName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, encryptionKeyUrl, encryptionKeyResourceGroupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAzureEncryptionResourcesRequest {\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    encryptionKeyUrl: ").append(toIndentedString(encryptionKeyUrl)).append("\n");
    sb.append("    encryptionKeyResourceGroupName: ").append(toIndentedString(encryptionKeyResourceGroupName)).append("\n");
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

