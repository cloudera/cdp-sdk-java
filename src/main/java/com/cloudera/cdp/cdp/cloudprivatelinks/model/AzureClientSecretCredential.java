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

/**
 * Azure client secret credential, either this or credential CRN should be passed.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-15T17:00:49.632-07:00")
public class AzureClientSecretCredential  {

  /**
   * The client (application) ID of the service principal
   **/
  private String clientId = null;

  /**
   * A client secret that was generated for the App Registration used to authenticate the client.
   **/
  private String clientSecret = null;

  /**
   * The Azure Active Directory tenant (directory) Id of the service principal.
   **/
  private String tenantId = null;

  /**
   * Getter for clientId.
   * The client (application) ID of the service principal
   **/
  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }

  /**
   * Setter for clientId.
   * The client (application) ID of the service principal
   **/
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  /**
   * Getter for clientSecret.
   * A client secret that was generated for the App Registration used to authenticate the client.
   **/
  @JsonProperty("clientSecret")
  public String getClientSecret() {
    return clientSecret;
  }

  /**
   * Setter for clientSecret.
   * A client secret that was generated for the App Registration used to authenticate the client.
   **/
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  /**
   * Getter for tenantId.
   * The Azure Active Directory tenant (directory) Id of the service principal.
   **/
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  /**
   * Setter for tenantId.
   * The Azure Active Directory tenant (directory) Id of the service principal.
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
    AzureClientSecretCredential azureClientSecretCredential = (AzureClientSecretCredential) o;
    if (!Objects.equals(this.clientId, azureClientSecretCredential.clientId)) {
      return false;
    }
    if (!Objects.equals(this.clientSecret, azureClientSecretCredential.clientSecret)) {
      return false;
    }
    if (!Objects.equals(this.tenantId, azureClientSecretCredential.tenantId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureClientSecretCredential {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
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

