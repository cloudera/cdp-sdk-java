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
 * The request object for updating the environment SSH key.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-02-29T13:23:34.230-08:00")
public class UpdateSshKeyRequest  {

  /**
   * The name or the CRN of the environment.
   **/
  private String environment = null;

  /**
   * A new SSH public key that is stored locally. Either this or an existing public key ID has to be given.
   **/
  private String newPublicKey = null;

  /**
   * The ID of the existing SSH public key that is stored on the cloud provider side. Either this or a new public key has to be given.
   **/
  private String existingPublicKeyId = null;

  /**
   * Getter for environment.
   * The name or the CRN of the environment.
   **/
  @JsonProperty("environment")
  public String getEnvironment() {
    return environment;
  }

  /**
   * Setter for environment.
   * The name or the CRN of the environment.
   **/
  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  /**
   * Getter for newPublicKey.
   * A new SSH public key that is stored locally. Either this or an existing public key ID has to be given.
   **/
  @JsonProperty("newPublicKey")
  public String getNewPublicKey() {
    return newPublicKey;
  }

  /**
   * Setter for newPublicKey.
   * A new SSH public key that is stored locally. Either this or an existing public key ID has to be given.
   **/
  public void setNewPublicKey(String newPublicKey) {
    this.newPublicKey = newPublicKey;
  }

  /**
   * Getter for existingPublicKeyId.
   * The ID of the existing SSH public key that is stored on the cloud provider side. Either this or a new public key has to be given.
   **/
  @JsonProperty("existingPublicKeyId")
  public String getExistingPublicKeyId() {
    return existingPublicKeyId;
  }

  /**
   * Setter for existingPublicKeyId.
   * The ID of the existing SSH public key that is stored on the cloud provider side. Either this or a new public key has to be given.
   **/
  public void setExistingPublicKeyId(String existingPublicKeyId) {
    this.existingPublicKeyId = existingPublicKeyId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSshKeyRequest updateSshKeyRequest = (UpdateSshKeyRequest) o;
    if (!Objects.equals(this.environment, updateSshKeyRequest.environment)) {
      return false;
    }
    if (!Objects.equals(this.newPublicKey, updateSshKeyRequest.newPublicKey)) {
      return false;
    }
    if (!Objects.equals(this.existingPublicKeyId, updateSshKeyRequest.existingPublicKeyId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, newPublicKey, existingPublicKeyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSshKeyRequest {\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    newPublicKey: ").append(toIndentedString(newPublicKey)).append("\n");
    sb.append("    existingPublicKeyId: ").append(toIndentedString(existingPublicKeyId)).append("\n");
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

