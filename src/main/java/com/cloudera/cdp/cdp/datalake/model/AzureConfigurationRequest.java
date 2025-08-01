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

package com.cloudera.cdp.datalake.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for Azure configuration.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:42.225-07:00")
public class AzureConfigurationRequest  {

  /**
   * The managed identity to use. The assumer should have Virtual Machine Contributor and Managed Identity Operator roles on subscription level.
   **/
  private String managedIdentity = null;

  /**
   * The storage location to use. The location has to be in the following format abfs://filesystem@storage-account-name.dfs.core.windows.net. The filesystem must already exist and the storage account must be StorageV2.
   **/
  private String storageLocation = null;

  /**
   * Getter for managedIdentity.
   * The managed identity to use. The assumer should have Virtual Machine Contributor and Managed Identity Operator roles on subscription level.
   **/
  @JsonProperty("managedIdentity")
  public String getManagedIdentity() {
    return managedIdentity;
  }

  /**
   * Setter for managedIdentity.
   * The managed identity to use. The assumer should have Virtual Machine Contributor and Managed Identity Operator roles on subscription level.
   **/
  public void setManagedIdentity(String managedIdentity) {
    this.managedIdentity = managedIdentity;
  }

  /**
   * Getter for storageLocation.
   * The storage location to use. The location has to be in the following format abfs://filesystem@storage-account-name.dfs.core.windows.net. The filesystem must already exist and the storage account must be StorageV2.
   **/
  @JsonProperty("storageLocation")
  public String getStorageLocation() {
    return storageLocation;
  }

  /**
   * Setter for storageLocation.
   * The storage location to use. The location has to be in the following format abfs://filesystem@storage-account-name.dfs.core.windows.net. The filesystem must already exist and the storage account must be StorageV2.
   **/
  public void setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureConfigurationRequest azureConfigurationRequest = (AzureConfigurationRequest) o;
    if (!Objects.equals(this.managedIdentity, azureConfigurationRequest.managedIdentity)) {
      return false;
    }
    if (!Objects.equals(this.storageLocation, azureConfigurationRequest.storageLocation)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedIdentity, storageLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureConfigurationRequest {\n");
    sb.append("    managedIdentity: ").append(toIndentedString(managedIdentity)).append("\n");
    sb.append("    storageLocation: ").append(toIndentedString(storageLocation)).append("\n");
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

