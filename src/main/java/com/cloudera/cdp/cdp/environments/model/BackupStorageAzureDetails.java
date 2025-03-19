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
 * Azure-specific backup storage configuration information.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-19T13:03:29.236-07:00")
public class BackupStorageAzureDetails  {

  /**
   * The storage location to use. The location has to be in the following format abfs://filesystem@storage-account-name.dfs.core.windows.net.
   **/
  private String storageLocationBase = null;

  /**
   * The managed identity associated with the backup. This identity should have Storage Blob Data Contributor role on the given storage account.
   **/
  private String managedIdentity = null;

  /**
   * Getter for storageLocationBase.
   * The storage location to use. The location has to be in the following format abfs://filesystem@storage-account-name.dfs.core.windows.net.
   **/
  @JsonProperty("storageLocationBase")
  public String getStorageLocationBase() {
    return storageLocationBase;
  }

  /**
   * Setter for storageLocationBase.
   * The storage location to use. The location has to be in the following format abfs://filesystem@storage-account-name.dfs.core.windows.net.
   **/
  public void setStorageLocationBase(String storageLocationBase) {
    this.storageLocationBase = storageLocationBase;
  }

  /**
   * Getter for managedIdentity.
   * The managed identity associated with the backup. This identity should have Storage Blob Data Contributor role on the given storage account.
   **/
  @JsonProperty("managedIdentity")
  public String getManagedIdentity() {
    return managedIdentity;
  }

  /**
   * Setter for managedIdentity.
   * The managed identity associated with the backup. This identity should have Storage Blob Data Contributor role on the given storage account.
   **/
  public void setManagedIdentity(String managedIdentity) {
    this.managedIdentity = managedIdentity;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupStorageAzureDetails backupStorageAzureDetails = (BackupStorageAzureDetails) o;
    if (!Objects.equals(this.storageLocationBase, backupStorageAzureDetails.storageLocationBase)) {
      return false;
    }
    if (!Objects.equals(this.managedIdentity, backupStorageAzureDetails.managedIdentity)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageLocationBase, managedIdentity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupStorageAzureDetails {\n");
    sb.append("    storageLocationBase: ").append(toIndentedString(storageLocationBase)).append("\n");
    sb.append("    managedIdentity: ").append(toIndentedString(managedIdentity)).append("\n");
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

