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
 * Request object for creating secret.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-26T08:05:41.567-08:00")
public class RegisterSecretRequest  {

  /**
   * Name of the secret.
   **/
  private String secretName = null;

  /**
   * The ID of the cluster.
   **/
  private String clusterId = null;

  /**
   * Key of the Secret Provider.
   **/
  private String secretProviderKey = null;

  /**
   * Name of the Azure vault.
   **/
  private String azureVaultName = null;

  /**
   * Getter for secretName.
   * Name of the secret.
   **/
  @JsonProperty("secretName")
  public String getSecretName() {
    return secretName;
  }

  /**
   * Setter for secretName.
   * Name of the secret.
   **/
  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }

  /**
   * Getter for clusterId.
   * The ID of the cluster.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * The ID of the cluster.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for secretProviderKey.
   * Key of the Secret Provider.
   **/
  @JsonProperty("secretProviderKey")
  public String getSecretProviderKey() {
    return secretProviderKey;
  }

  /**
   * Setter for secretProviderKey.
   * Key of the Secret Provider.
   **/
  public void setSecretProviderKey(String secretProviderKey) {
    this.secretProviderKey = secretProviderKey;
  }

  /**
   * Getter for azureVaultName.
   * Name of the Azure vault.
   **/
  @JsonProperty("azureVaultName")
  public String getAzureVaultName() {
    return azureVaultName;
  }

  /**
   * Setter for azureVaultName.
   * Name of the Azure vault.
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
    RegisterSecretRequest registerSecretRequest = (RegisterSecretRequest) o;
    if (!Objects.equals(this.secretName, registerSecretRequest.secretName)) {
      return false;
    }
    if (!Objects.equals(this.clusterId, registerSecretRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.secretProviderKey, registerSecretRequest.secretProviderKey)) {
      return false;
    }
    if (!Objects.equals(this.azureVaultName, registerSecretRequest.azureVaultName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(secretName, clusterId, secretProviderKey, azureVaultName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterSecretRequest {\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    secretProviderKey: ").append(toIndentedString(secretProviderKey)).append("\n");
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

