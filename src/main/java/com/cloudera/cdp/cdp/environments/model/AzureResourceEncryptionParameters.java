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
 * Object containing details of encryption parameters for Azure cloud.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-23T07:12:40.736-08:00")
public class AzureResourceEncryptionParameters  {

  /**
   * URL of the key which is used to encrypt the Azure Managed Disks.
   **/
  private String encryptionKeyUrl = null;

  /**
   * Name of the existing Azure resource group hosting the Azure Key Vault containing customer managed key which is used to encrypt the Azure Managed Disks.
   **/
  private String encryptionKeyResourceGroupName = null;

  /**
   * ID of the Disk Encryption Set created in Azure which is used to encrypt Managed Disks of FreeIPA, Data Lake, Data Hub and PostgreSQL.
   **/
  private String diskEncryptionSetId = null;

  /**
   * User managed identity for encryption.
   **/
  private String encryptionUserManagedIdentity = null;

  /**
   * Getter for encryptionKeyUrl.
   * URL of the key which is used to encrypt the Azure Managed Disks.
   **/
  @JsonProperty("encryptionKeyUrl")
  public String getEncryptionKeyUrl() {
    return encryptionKeyUrl;
  }

  /**
   * Setter for encryptionKeyUrl.
   * URL of the key which is used to encrypt the Azure Managed Disks.
   **/
  public void setEncryptionKeyUrl(String encryptionKeyUrl) {
    this.encryptionKeyUrl = encryptionKeyUrl;
  }

  /**
   * Getter for encryptionKeyResourceGroupName.
   * Name of the existing Azure resource group hosting the Azure Key Vault containing customer managed key which is used to encrypt the Azure Managed Disks.
   **/
  @JsonProperty("encryptionKeyResourceGroupName")
  public String getEncryptionKeyResourceGroupName() {
    return encryptionKeyResourceGroupName;
  }

  /**
   * Setter for encryptionKeyResourceGroupName.
   * Name of the existing Azure resource group hosting the Azure Key Vault containing customer managed key which is used to encrypt the Azure Managed Disks.
   **/
  public void setEncryptionKeyResourceGroupName(String encryptionKeyResourceGroupName) {
    this.encryptionKeyResourceGroupName = encryptionKeyResourceGroupName;
  }

  /**
   * Getter for diskEncryptionSetId.
   * ID of the Disk Encryption Set created in Azure which is used to encrypt Managed Disks of FreeIPA, Data Lake, Data Hub and PostgreSQL.
   **/
  @JsonProperty("diskEncryptionSetId")
  public String getDiskEncryptionSetId() {
    return diskEncryptionSetId;
  }

  /**
   * Setter for diskEncryptionSetId.
   * ID of the Disk Encryption Set created in Azure which is used to encrypt Managed Disks of FreeIPA, Data Lake, Data Hub and PostgreSQL.
   **/
  public void setDiskEncryptionSetId(String diskEncryptionSetId) {
    this.diskEncryptionSetId = diskEncryptionSetId;
  }

  /**
   * Getter for encryptionUserManagedIdentity.
   * User managed identity for encryption.
   **/
  @JsonProperty("encryptionUserManagedIdentity")
  public String getEncryptionUserManagedIdentity() {
    return encryptionUserManagedIdentity;
  }

  /**
   * Setter for encryptionUserManagedIdentity.
   * User managed identity for encryption.
   **/
  public void setEncryptionUserManagedIdentity(String encryptionUserManagedIdentity) {
    this.encryptionUserManagedIdentity = encryptionUserManagedIdentity;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureResourceEncryptionParameters azureResourceEncryptionParameters = (AzureResourceEncryptionParameters) o;
    if (!Objects.equals(this.encryptionKeyUrl, azureResourceEncryptionParameters.encryptionKeyUrl)) {
      return false;
    }
    if (!Objects.equals(this.encryptionKeyResourceGroupName, azureResourceEncryptionParameters.encryptionKeyResourceGroupName)) {
      return false;
    }
    if (!Objects.equals(this.diskEncryptionSetId, azureResourceEncryptionParameters.diskEncryptionSetId)) {
      return false;
    }
    if (!Objects.equals(this.encryptionUserManagedIdentity, azureResourceEncryptionParameters.encryptionUserManagedIdentity)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptionKeyUrl, encryptionKeyResourceGroupName, diskEncryptionSetId, encryptionUserManagedIdentity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureResourceEncryptionParameters {\n");
    sb.append("    encryptionKeyUrl: ").append(toIndentedString(encryptionKeyUrl)).append("\n");
    sb.append("    encryptionKeyResourceGroupName: ").append(toIndentedString(encryptionKeyResourceGroupName)).append("\n");
    sb.append("    diskEncryptionSetId: ").append(toIndentedString(diskEncryptionSetId)).append("\n");
    sb.append("    encryptionUserManagedIdentity: ").append(toIndentedString(encryptionUserManagedIdentity)).append("\n");
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

