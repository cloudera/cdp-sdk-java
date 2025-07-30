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
 * Additional SSH key authentication configuration for accessing cluster node.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:42.850-07:00")
public class AuthenticationRequest  {

  /**
   * Public SSH key string. Mutually exclusive with publicKeyId.
   **/
  private String publicKey = null;

  /**
   * Public SSH key ID already registered in the cloud provider. Mutually exclusive with publicKey.
   **/
  private String publicKeyId = null;

  /**
   * Getter for publicKey.
   * Public SSH key string. Mutually exclusive with publicKeyId.
   **/
  @JsonProperty("publicKey")
  public String getPublicKey() {
    return publicKey;
  }

  /**
   * Setter for publicKey.
   * Public SSH key string. Mutually exclusive with publicKeyId.
   **/
  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  /**
   * Getter for publicKeyId.
   * Public SSH key ID already registered in the cloud provider. Mutually exclusive with publicKey.
   **/
  @JsonProperty("publicKeyId")
  public String getPublicKeyId() {
    return publicKeyId;
  }

  /**
   * Setter for publicKeyId.
   * Public SSH key ID already registered in the cloud provider. Mutually exclusive with publicKey.
   **/
  public void setPublicKeyId(String publicKeyId) {
    this.publicKeyId = publicKeyId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationRequest authenticationRequest = (AuthenticationRequest) o;
    if (!Objects.equals(this.publicKey, authenticationRequest.publicKey)) {
      return false;
    }
    if (!Objects.equals(this.publicKeyId, authenticationRequest.publicKeyId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicKey, publicKeyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationRequest {\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    publicKeyId: ").append(toIndentedString(publicKeyId)).append("\n");
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

