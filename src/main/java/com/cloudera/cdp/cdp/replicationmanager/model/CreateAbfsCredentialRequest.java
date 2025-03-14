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

package com.cloudera.cdp.replicationmanager.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Request object for creating ABFS cloud credentials. Currently supported cloud credentials: ABFS Access Key for Ambari clusters, ABFS Client Secret for CM clusters.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-13T11:52:48.923-07:00")
public class CreateAbfsCredentialRequest  {

  /**
   * Name of the credential.
   **/
  private String name = null;

  /**
   * List of cluster CRNs where the credential should be created.
   **/
  private List<String> clusters = new ArrayList<String>();

  /**
   * Type of the credential. Additional required parameters by type: ACCESSKEY: storageAccountName, accessKey; CLIENTKEY: clientId, clientSecretKey, tenantId. Superfluous parameters are ignored. Providing ACCESSKEY will create an ABFS Access Key based account in Ambari. Providing CLIENTKEY will create an Azure Active Directory Service Principal account in Cloudera Manager. ACCESSKEY is only supported on Ambari, while CLIENTKEY is only supported on Cloudera Manager.
   **/
  private String type = null;

  /**
   * ABFS access key.
   **/
  private String accessKey = null;

  /**
   * ABFS storage account name.
   **/
  private String storageAccountName = null;

  /**
   * Client ID of an Active Directory service principal account.
   **/
  private String clientId = null;

  /**
   * Client Key of an Active Directory service principal account.
   **/
  private String clientSecretKey = null;

  /**
   * Tenant ID of an Active Directory service principal account.
   **/
  private String tenantId = null;

  /**
   * Getter for name.
   * Name of the credential.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name of the credential.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for clusters.
   * List of cluster CRNs where the credential should be created.
   **/
  @JsonProperty("clusters")
  public List<String> getClusters() {
    return clusters;
  }

  /**
   * Setter for clusters.
   * List of cluster CRNs where the credential should be created.
   **/
  public void setClusters(List<String> clusters) {
    this.clusters = clusters;
  }

  /**
   * Getter for type.
   * Type of the credential. Additional required parameters by type: ACCESSKEY: storageAccountName, accessKey; CLIENTKEY: clientId, clientSecretKey, tenantId. Superfluous parameters are ignored. Providing ACCESSKEY will create an ABFS Access Key based account in Ambari. Providing CLIENTKEY will create an Azure Active Directory Service Principal account in Cloudera Manager. ACCESSKEY is only supported on Ambari, while CLIENTKEY is only supported on Cloudera Manager.
   **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Setter for type.
   * Type of the credential. Additional required parameters by type: ACCESSKEY: storageAccountName, accessKey; CLIENTKEY: clientId, clientSecretKey, tenantId. Superfluous parameters are ignored. Providing ACCESSKEY will create an ABFS Access Key based account in Ambari. Providing CLIENTKEY will create an Azure Active Directory Service Principal account in Cloudera Manager. ACCESSKEY is only supported on Ambari, while CLIENTKEY is only supported on Cloudera Manager.
   **/
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Getter for accessKey.
   * ABFS access key.
   **/
  @JsonProperty("accessKey")
  public String getAccessKey() {
    return accessKey;
  }

  /**
   * Setter for accessKey.
   * ABFS access key.
   **/
  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  /**
   * Getter for storageAccountName.
   * ABFS storage account name.
   **/
  @JsonProperty("storageAccountName")
  public String getStorageAccountName() {
    return storageAccountName;
  }

  /**
   * Setter for storageAccountName.
   * ABFS storage account name.
   **/
  public void setStorageAccountName(String storageAccountName) {
    this.storageAccountName = storageAccountName;
  }

  /**
   * Getter for clientId.
   * Client ID of an Active Directory service principal account.
   **/
  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }

  /**
   * Setter for clientId.
   * Client ID of an Active Directory service principal account.
   **/
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  /**
   * Getter for clientSecretKey.
   * Client Key of an Active Directory service principal account.
   **/
  @JsonProperty("clientSecretKey")
  public String getClientSecretKey() {
    return clientSecretKey;
  }

  /**
   * Setter for clientSecretKey.
   * Client Key of an Active Directory service principal account.
   **/
  public void setClientSecretKey(String clientSecretKey) {
    this.clientSecretKey = clientSecretKey;
  }

  /**
   * Getter for tenantId.
   * Tenant ID of an Active Directory service principal account.
   **/
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  /**
   * Setter for tenantId.
   * Tenant ID of an Active Directory service principal account.
   **/
  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAbfsCredentialRequest createAbfsCredentialRequest = (CreateAbfsCredentialRequest) o;
    if (!Objects.equals(this.name, createAbfsCredentialRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.clusters, createAbfsCredentialRequest.clusters)) {
      return false;
    }
    if (!Objects.equals(this.type, createAbfsCredentialRequest.type)) {
      return false;
    }
    if (!Objects.equals(this.accessKey, createAbfsCredentialRequest.accessKey)) {
      return false;
    }
    if (!Objects.equals(this.storageAccountName, createAbfsCredentialRequest.storageAccountName)) {
      return false;
    }
    if (!Objects.equals(this.clientId, createAbfsCredentialRequest.clientId)) {
      return false;
    }
    if (!Objects.equals(this.clientSecretKey, createAbfsCredentialRequest.clientSecretKey)) {
      return false;
    }
    if (!Objects.equals(this.tenantId, createAbfsCredentialRequest.tenantId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, clusters, type, accessKey, storageAccountName, clientId, clientSecretKey, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAbfsCredentialRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    storageAccountName: ").append(toIndentedString(storageAccountName)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecretKey: ").append(toIndentedString(clientSecretKey)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

