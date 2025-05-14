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

package com.cloudera.cdp.compute.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Azure Secret Encryption response structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-14T11:34:38.707-07:00")
public class AzureSecretEncryptionResp  {

  /**
   * Encryption key URI.
   **/
  private String encryptionKeyUrl = null;

  /**
   * Resource ID of the user managed identity.
   **/
  private String userManagedIdentity = null;

  /**
   * Getter for encryptionKeyUrl.
   * Encryption key URI.
   **/
  @JsonProperty("encryptionKeyUrl")
  public String getEncryptionKeyUrl() {
    return encryptionKeyUrl;
  }

  /**
   * Setter for encryptionKeyUrl.
   * Encryption key URI.
   **/
  public void setEncryptionKeyUrl(String encryptionKeyUrl) {
    this.encryptionKeyUrl = encryptionKeyUrl;
  }

  /**
   * Getter for userManagedIdentity.
   * Resource ID of the user managed identity.
   **/
  @JsonProperty("userManagedIdentity")
  public String getUserManagedIdentity() {
    return userManagedIdentity;
  }

  /**
   * Setter for userManagedIdentity.
   * Resource ID of the user managed identity.
   **/
  public void setUserManagedIdentity(String userManagedIdentity) {
    this.userManagedIdentity = userManagedIdentity;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureSecretEncryptionResp azureSecretEncryptionResp = (AzureSecretEncryptionResp) o;
    if (!Objects.equals(this.encryptionKeyUrl, azureSecretEncryptionResp.encryptionKeyUrl)) {
      return false;
    }
    if (!Objects.equals(this.userManagedIdentity, azureSecretEncryptionResp.userManagedIdentity)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptionKeyUrl, userManagedIdentity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureSecretEncryptionResp {\n");
    sb.append("    encryptionKeyUrl: ").append(toIndentedString(encryptionKeyUrl)).append("\n");
    sb.append("    userManagedIdentity: ").append(toIndentedString(userManagedIdentity)).append("\n");
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

