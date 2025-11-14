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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * The properties of the secret.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-14T06:50:04.824-08:00")
public class SecretProperties  {

  /**
   * The cloud provider associated with the secret.
   **/
  private String cloudProvider = null;

  /**
   * The version of the secret.
   **/
  private String version = null;

  /**
   * The name of the Azure Key Vault.
   **/
  private String azureVaultName = null;

  /**
   * Getter for cloudProvider.
   * The cloud provider associated with the secret.
   **/
  @JsonProperty("cloudProvider")
  public String getCloudProvider() {
    return cloudProvider;
  }

  /**
   * Setter for cloudProvider.
   * The cloud provider associated with the secret.
   **/
  public void setCloudProvider(String cloudProvider) {
    this.cloudProvider = cloudProvider;
  }

  /**
   * Getter for version.
   * The version of the secret.
   **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  /**
   * Setter for version.
   * The version of the secret.
   **/
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Getter for azureVaultName.
   * The name of the Azure Key Vault.
   **/
  @JsonProperty("azureVaultName")
  public String getAzureVaultName() {
    return azureVaultName;
  }

  /**
   * Setter for azureVaultName.
   * The name of the Azure Key Vault.
   **/
  public void setAzureVaultName(String azureVaultName) {
    this.azureVaultName = azureVaultName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecretProperties secretProperties = (SecretProperties) o;
    if (!Objects.equals(this.cloudProvider, secretProperties.cloudProvider)) {
      return false;
    }
    if (!Objects.equals(this.version, secretProperties.version)) {
      return false;
    }
    if (!Objects.equals(this.azureVaultName, secretProperties.azureVaultName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudProvider, version, azureVaultName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecretProperties {\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    azureVaultName: ").append(toIndentedString(azureVaultName)).append("\n");
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

