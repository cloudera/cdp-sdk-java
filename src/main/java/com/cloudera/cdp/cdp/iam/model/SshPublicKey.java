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
 * Information about an SSH public key.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-09T16:18:25.896-07:00")
public class SshPublicKey  {

  /**
   * The SSH public key CRN.
   **/
  private String crn = null;

  /**
   * The SSH public key SHA256 fingerprint. This is identical to the SHA256 produced by running the following command on a public key named 'key.pub'; ssh-keygen -l -E SHA256 -f /home/user/.ssh/key.pub. Note that ssh-keygen removes any padding bytes from the BASE64 fingerprint encoding (the '=' characters at the end of the fingerprint) which is also true for this fingerprint.
   **/
  private String publicKeyFingerprint = null;

  /**
   * An optional description for the public key.
   **/
  private String description = null;

  /**
   * The SSH public key string. Only populated for DescribeSshPublicKeyResponses. This is the same string that was used when the key was added.
   **/
  private String publicKey = null;

  /**
   * Getter for crn.
   * The SSH public key CRN.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The SSH public key CRN.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for publicKeyFingerprint.
   * The SSH public key SHA256 fingerprint. This is identical to the SHA256 produced by running the following command on a public key named &#39;key.pub&#39;; ssh-keygen -l -E SHA256 -f /home/user/.ssh/key.pub. Note that ssh-keygen removes any padding bytes from the BASE64 fingerprint encoding (the &#39;&#x3D;&#39; characters at the end of the fingerprint) which is also true for this fingerprint.
   **/
  @JsonProperty("publicKeyFingerprint")
  public String getPublicKeyFingerprint() {
    return publicKeyFingerprint;
  }

  /**
   * Setter for publicKeyFingerprint.
   * The SSH public key SHA256 fingerprint. This is identical to the SHA256 produced by running the following command on a public key named &#39;key.pub&#39;; ssh-keygen -l -E SHA256 -f /home/user/.ssh/key.pub. Note that ssh-keygen removes any padding bytes from the BASE64 fingerprint encoding (the &#39;&#x3D;&#39; characters at the end of the fingerprint) which is also true for this fingerprint.
   **/
  public void setPublicKeyFingerprint(String publicKeyFingerprint) {
    this.publicKeyFingerprint = publicKeyFingerprint;
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

  /**
   * Getter for publicKey.
   * The SSH public key string. Only populated for DescribeSshPublicKeyResponses. This is the same string that was used when the key was added.
   **/
  @JsonProperty("publicKey")
  public String getPublicKey() {
    return publicKey;
  }

  /**
   * Setter for publicKey.
   * The SSH public key string. Only populated for DescribeSshPublicKeyResponses. This is the same string that was used when the key was added.
   **/
  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SshPublicKey sshPublicKey = (SshPublicKey) o;
    if (!Objects.equals(this.crn, sshPublicKey.crn)) {
      return false;
    }
    if (!Objects.equals(this.publicKeyFingerprint, sshPublicKey.publicKeyFingerprint)) {
      return false;
    }
    if (!Objects.equals(this.description, sshPublicKey.description)) {
      return false;
    }
    if (!Objects.equals(this.publicKey, sshPublicKey.publicKey)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, publicKeyFingerprint, description, publicKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SshPublicKey {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    publicKeyFingerprint: ").append(toIndentedString(publicKeyFingerprint)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
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

