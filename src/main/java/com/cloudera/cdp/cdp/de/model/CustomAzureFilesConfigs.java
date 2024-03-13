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

package com.cloudera.cdp.de.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Override Azure Files Configs.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-03-13T13:08:48.068-07:00")
public class CustomAzureFilesConfigs  {

  /**
   * Azure Storage Account of the File Share.
   **/
  private String storageAccountName = null;

  /**
   * Resource Group of the Storage Account.
   **/
  private String resourceGroup = null;

  /**
   * Azure File Share's server address. Defaults to '<storageaccount>.file.core.windows.net'.
   **/
  private String azureFilesFQDN = null;

  /**
   * Getter for storageAccountName.
   * Azure Storage Account of the File Share.
   **/
  @JsonProperty("storageAccountName")
  public String getStorageAccountName() {
    return storageAccountName;
  }

  /**
   * Setter for storageAccountName.
   * Azure Storage Account of the File Share.
   **/
  public void setStorageAccountName(String storageAccountName) {
    this.storageAccountName = storageAccountName;
  }

  /**
   * Getter for resourceGroup.
   * Resource Group of the Storage Account.
   **/
  @JsonProperty("resourceGroup")
  public String getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Setter for resourceGroup.
   * Resource Group of the Storage Account.
   **/
  public void setResourceGroup(String resourceGroup) {
    this.resourceGroup = resourceGroup;
  }

  /**
   * Getter for azureFilesFQDN.
   * Azure File Share&#39;s server address. Defaults to &#39;&lt;storageaccount&gt;.file.core.windows.net&#39;.
   **/
  @JsonProperty("azureFilesFQDN")
  public String getAzureFilesFQDN() {
    return azureFilesFQDN;
  }

  /**
   * Setter for azureFilesFQDN.
   * Azure File Share&#39;s server address. Defaults to &#39;&lt;storageaccount&gt;.file.core.windows.net&#39;.
   **/
  public void setAzureFilesFQDN(String azureFilesFQDN) {
    this.azureFilesFQDN = azureFilesFQDN;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAzureFilesConfigs customAzureFilesConfigs = (CustomAzureFilesConfigs) o;
    if (!Objects.equals(this.storageAccountName, customAzureFilesConfigs.storageAccountName)) {
      return false;
    }
    if (!Objects.equals(this.resourceGroup, customAzureFilesConfigs.resourceGroup)) {
      return false;
    }
    if (!Objects.equals(this.azureFilesFQDN, customAzureFilesConfigs.azureFilesFQDN)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageAccountName, resourceGroup, azureFilesFQDN);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAzureFilesConfigs {\n");
    sb.append("    storageAccountName: ").append(toIndentedString(storageAccountName)).append("\n");
    sb.append("    resourceGroup: ").append(toIndentedString(resourceGroup)).append("\n");
    sb.append("    azureFilesFQDN: ").append(toIndentedString(azureFilesFQDN)).append("\n");
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

