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
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-28T14:00:28.895-07:00")
public class UpdateAzureCredentialRequestAppBased  {

  /**
   * Authentication type of the credential
   **/
  private String authenticationType = null;

  /**
   * The id of the application registered in Azure.
   **/
  private String applicationId = null;

  /**
   * Getter for authenticationType.
   * Authentication type of the credential
   **/
  @JsonProperty("authenticationType")
  public String getAuthenticationType() {
    return authenticationType;
  }

  /**
   * Setter for authenticationType.
   * Authentication type of the credential
   **/
  public void setAuthenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
  }

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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAzureCredentialRequestAppBased updateAzureCredentialRequestAppBased = (UpdateAzureCredentialRequestAppBased) o;
    if (!Objects.equals(this.authenticationType, updateAzureCredentialRequestAppBased.authenticationType)) {
      return false;
    }
    if (!Objects.equals(this.applicationId, updateAzureCredentialRequestAppBased.applicationId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationType, applicationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAzureCredentialRequestAppBased {\n");
    sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
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

