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
import com.cloudera.cdp.environments.model.CreateAzureCredentialRequestAppBased;

/**
 * Request object for a create Azure credential request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-16T07:43:43.890-07:00")
public class CreateAzureCredentialRequest  {

  /**
   * The name of the credential.
   **/
  private String credentialName = null;

  /**
   * 
   **/
  private CreateAzureCredentialRequestAppBased appBased = null;

  /**
   * The Azure subscription ID. Required for secret based credentials and optional for certificate based ones.
   **/
  private String subscriptionId = null;

  /**
   * The Azure AD tenant ID for the Azure subscription. Required for secret based credentials and optional for certificate based ones.
   **/
  private String tenantId = null;

  /**
   * A description for the credential.
   **/
  private String description = null;

  /**
   * Getter for credentialName.
   * The name of the credential.
   **/
  @JsonProperty("credentialName")
  public String getCredentialName() {
    return credentialName;
  }

  /**
   * Setter for credentialName.
   * The name of the credential.
   **/
  public void setCredentialName(String credentialName) {
    this.credentialName = credentialName;
  }

  /**
   * Getter for appBased.
   * 
   **/
  @JsonProperty("appBased")
  public CreateAzureCredentialRequestAppBased getAppBased() {
    return appBased;
  }

  /**
   * Setter for appBased.
   * 
   **/
  public void setAppBased(CreateAzureCredentialRequestAppBased appBased) {
    this.appBased = appBased;
  }

  /**
   * Getter for subscriptionId.
   * The Azure subscription ID. Required for secret based credentials and optional for certificate based ones.
   **/
  @JsonProperty("subscriptionId")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  /**
   * Setter for subscriptionId.
   * The Azure subscription ID. Required for secret based credentials and optional for certificate based ones.
   **/
  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  /**
   * Getter for tenantId.
   * The Azure AD tenant ID for the Azure subscription. Required for secret based credentials and optional for certificate based ones.
   **/
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  /**
   * Setter for tenantId.
   * The Azure AD tenant ID for the Azure subscription. Required for secret based credentials and optional for certificate based ones.
   **/
  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  /**
   * Getter for description.
   * A description for the credential.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * A description for the credential.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAzureCredentialRequest createAzureCredentialRequest = (CreateAzureCredentialRequest) o;
    if (!Objects.equals(this.credentialName, createAzureCredentialRequest.credentialName)) {
      return false;
    }
    if (!Objects.equals(this.appBased, createAzureCredentialRequest.appBased)) {
      return false;
    }
    if (!Objects.equals(this.subscriptionId, createAzureCredentialRequest.subscriptionId)) {
      return false;
    }
    if (!Objects.equals(this.tenantId, createAzureCredentialRequest.tenantId)) {
      return false;
    }
    if (!Objects.equals(this.description, createAzureCredentialRequest.description)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialName, appBased, subscriptionId, tenantId, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAzureCredentialRequest {\n");
    sb.append("    credentialName: ").append(toIndentedString(credentialName)).append("\n");
    sb.append("    appBased: ").append(toIndentedString(appBased)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

