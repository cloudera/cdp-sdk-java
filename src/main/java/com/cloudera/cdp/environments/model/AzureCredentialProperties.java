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
 * The credential properties that closely related to those that have been created on Azure.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-04-29T14:24:31.002-07:00")
public class AzureCredentialProperties  {

  /**
   * The Azure subscription ID for the given credential.
   **/
  private String subscriptionId = null;

  /**
   * The Azure tenant ID for the given credential.
   **/
  private String tenantId = null;

  /**
   * The ID of the created Azure app.
   **/
  private String appId = null;

  /**
   * Getter for subscriptionId.
   * The Azure subscription ID for the given credential.
   **/
  @JsonProperty("subscriptionId")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  /**
   * Setter for subscriptionId.
   * The Azure subscription ID for the given credential.
   **/
  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  /**
   * Getter for tenantId.
   * The Azure tenant ID for the given credential.
   **/
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  /**
   * Setter for tenantId.
   * The Azure tenant ID for the given credential.
   **/
  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  /**
   * Getter for appId.
   * The ID of the created Azure app.
   **/
  @JsonProperty("appId")
  public String getAppId() {
    return appId;
  }

  /**
   * Setter for appId.
   * The ID of the created Azure app.
   **/
  public void setAppId(String appId) {
    this.appId = appId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureCredentialProperties azureCredentialProperties = (AzureCredentialProperties) o;
    if (!Objects.equals(this.subscriptionId, azureCredentialProperties.subscriptionId)) {
      return false;
    }
    if (!Objects.equals(this.tenantId, azureCredentialProperties.tenantId)) {
      return false;
    }
    if (!Objects.equals(this.appId, azureCredentialProperties.appId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, tenantId, appId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureCredentialProperties {\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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

