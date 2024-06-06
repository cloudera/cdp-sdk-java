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
 * Additional configurations needed for app-based authentication.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-06-05T15:30:58.948-07:00")
public class SetAzureAuditCredentialRequestAppBased  {

  /**
   * The id of the application registered in Azure.
   **/
  private String applicationId = null;

  /**
   * The client secret key (also referred to as application password) for the registered application.
   **/
  private String secretKey = null;

  /**
   * Getter for applicationId.
   * The id of the application registered in Azure.
   **/
  @JsonProperty("applicationId")
  public String getApplicationId() {
    return applicationId;
  }

  /**
   * Setter for applicationId.
   * The id of the application registered in Azure.
   **/
  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  /**
   * Getter for secretKey.
   * The client secret key (also referred to as application password) for the registered application.
   **/
  @JsonProperty("secretKey")
  public String getSecretKey() {
    return secretKey;
  }

  /**
   * Setter for secretKey.
   * The client secret key (also referred to as application password) for the registered application.
   **/
  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetAzureAuditCredentialRequestAppBased setAzureAuditCredentialRequestAppBased = (SetAzureAuditCredentialRequestAppBased) o;
    if (!Objects.equals(this.applicationId, setAzureAuditCredentialRequestAppBased.applicationId)) {
      return false;
    }
    if (!Objects.equals(this.secretKey, setAzureAuditCredentialRequestAppBased.secretKey)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, secretKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetAzureAuditCredentialRequestAppBased {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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

