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

package com.cloudera.cdp.iam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for add user ssh public key.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-07-28T07:53:31.657-07:00")
public class AddSshPublicKeyRequest  {

  /**
   * The RSA or ED25519 public ssh key to add. DSA and ECDSA public keys are not supported. The public key should be in RFC4253 format. (e.g. ssh-rsa AAAAB3NzaC1yc2EAAA.. user@host) as produced, for example, by ssh-keygen.
   **/
  private String publicKey = null;

  /**
   * The CRN of the user or machine user for whom the SSH public key will be added. If it is not included, it defaults to the user making the request.
   **/
  private String actorCrn = null;

  /**
   * An optional description for the public key.
   **/
  private String description = null;

  /**
   * Getter for publicKey.
   * The RSA or ED25519 public ssh key to add. DSA and ECDSA public keys are not supported. The public key should be in RFC4253 format. (e.g. ssh-rsa AAAAB3NzaC1yc2EAAA.. user@host) as produced, for example, by ssh-keygen.
   **/
  @JsonProperty("publicKey")
  public String getPublicKey() {
    return publicKey;
  }

  /**
   * Setter for publicKey.
   * The RSA or ED25519 public ssh key to add. DSA and ECDSA public keys are not supported. The public key should be in RFC4253 format. (e.g. ssh-rsa AAAAB3NzaC1yc2EAAA.. user@host) as produced, for example, by ssh-keygen.
   **/
  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  /**
   * Getter for actorCrn.
   * The CRN of the user or machine user for whom the SSH public key will be added. If it is not included, it defaults to the user making the request.
   **/
  @JsonProperty("actorCrn")
  public String getActorCrn() {
    return actorCrn;
  }

  /**
   * Setter for actorCrn.
   * The CRN of the user or machine user for whom the SSH public key will be added. If it is not included, it defaults to the user making the request.
   **/
  public void setActorCrn(String actorCrn) {
    this.actorCrn = actorCrn;
  }

  /**
   * Getter for description.
   * An optional description for the public key.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * An optional description for the public key.
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
    AddSshPublicKeyRequest addSshPublicKeyRequest = (AddSshPublicKeyRequest) o;
    if (!Objects.equals(this.publicKey, addSshPublicKeyRequest.publicKey)) {
      return false;
    }
    if (!Objects.equals(this.actorCrn, addSshPublicKeyRequest.actorCrn)) {
      return false;
    }
    if (!Objects.equals(this.description, addSshPublicKeyRequest.description)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicKey, actorCrn, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddSshPublicKeyRequest {\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    actorCrn: ").append(toIndentedString(actorCrn)).append("\n");
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

