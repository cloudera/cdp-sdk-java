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
 * Request object for setting the encryption certificate and decryption key for SAML response.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-26T08:05:44.591-08:00")
public class SetSamlResponseDecryptionKeyRequest  {

  /**
   * The name or CRN of the SAML Provider associated with the decryption key.
   **/
  private String samlProvider = null;

  /**
   * The certificate used by Identity Provider for encrypting SAML responses. It must be in PEM format. It must be non-empty and valid when 'currentSamlResponseDecryptionKey' is also set. Setting it to an empty string will remove this certificate.
   **/
  private String samlResponseEncryptionCertificate = null;

  /**
   * The current private key used for decrypting incoming encrypted SAML responses from the customer's Identity Provider to CDP. It must be in PEM format. It must be non-empty and valid when 'samlResponseEncryptionCertificate' is set. Setting it to an empty string will remove this key.
   **/
  private String currentSamlResponseDecryptionKey = null;

  /**
   * The next private key used for decrypting incoming encrypted SAML responses from the customer's IdP to CDP, during key rotation. It must be in PEM format. It is used for rotating keys without downtime, and is expected to be empty after key rotation completes. When both the current and next decryption keys are set, CDP will try to decrypt with both the keys. Both must be valid keys. Omitting this parameter from the request will remove it.
   **/
  private String nextSamlResponseDecryptionKey = null;

  /**
   * Getter for samlProvider.
   * The name or CRN of the SAML Provider associated with the decryption key.
   **/
  @JsonProperty("samlProvider")
  public String getSamlProvider() {
    return samlProvider;
  }

  /**
   * Setter for samlProvider.
   * The name or CRN of the SAML Provider associated with the decryption key.
   **/
  public void setSamlProvider(String samlProvider) {
    this.samlProvider = samlProvider;
  }

  /**
   * Getter for samlResponseEncryptionCertificate.
   * The certificate used by Identity Provider for encrypting SAML responses. It must be in PEM format. It must be non-empty and valid when &#39;currentSamlResponseDecryptionKey&#39; is also set. Setting it to an empty string will remove this certificate.
   **/
  @JsonProperty("samlResponseEncryptionCertificate")
  public String getSamlResponseEncryptionCertificate() {
    return samlResponseEncryptionCertificate;
  }

  /**
   * Setter for samlResponseEncryptionCertificate.
   * The certificate used by Identity Provider for encrypting SAML responses. It must be in PEM format. It must be non-empty and valid when &#39;currentSamlResponseDecryptionKey&#39; is also set. Setting it to an empty string will remove this certificate.
   **/
  public void setSamlResponseEncryptionCertificate(String samlResponseEncryptionCertificate) {
    this.samlResponseEncryptionCertificate = samlResponseEncryptionCertificate;
  }

  /**
   * Getter for currentSamlResponseDecryptionKey.
   * The current private key used for decrypting incoming encrypted SAML responses from the customer&#39;s Identity Provider to CDP. It must be in PEM format. It must be non-empty and valid when &#39;samlResponseEncryptionCertificate&#39; is set. Setting it to an empty string will remove this key.
   **/
  @JsonProperty("currentSamlResponseDecryptionKey")
  public String getCurrentSamlResponseDecryptionKey() {
    return currentSamlResponseDecryptionKey;
  }

  /**
   * Setter for currentSamlResponseDecryptionKey.
   * The current private key used for decrypting incoming encrypted SAML responses from the customer&#39;s Identity Provider to CDP. It must be in PEM format. It must be non-empty and valid when &#39;samlResponseEncryptionCertificate&#39; is set. Setting it to an empty string will remove this key.
   **/
  public void setCurrentSamlResponseDecryptionKey(String currentSamlResponseDecryptionKey) {
    this.currentSamlResponseDecryptionKey = currentSamlResponseDecryptionKey;
  }

  /**
   * Getter for nextSamlResponseDecryptionKey.
   * The next private key used for decrypting incoming encrypted SAML responses from the customer&#39;s IdP to CDP, during key rotation. It must be in PEM format. It is used for rotating keys without downtime, and is expected to be empty after key rotation completes. When both the current and next decryption keys are set, CDP will try to decrypt with both the keys. Both must be valid keys. Omitting this parameter from the request will remove it.
   **/
  @JsonProperty("nextSamlResponseDecryptionKey")
  public String getNextSamlResponseDecryptionKey() {
    return nextSamlResponseDecryptionKey;
  }

  /**
   * Setter for nextSamlResponseDecryptionKey.
   * The next private key used for decrypting incoming encrypted SAML responses from the customer&#39;s IdP to CDP, during key rotation. It must be in PEM format. It is used for rotating keys without downtime, and is expected to be empty after key rotation completes. When both the current and next decryption keys are set, CDP will try to decrypt with both the keys. Both must be valid keys. Omitting this parameter from the request will remove it.
   **/
  public void setNextSamlResponseDecryptionKey(String nextSamlResponseDecryptionKey) {
    this.nextSamlResponseDecryptionKey = nextSamlResponseDecryptionKey;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetSamlResponseDecryptionKeyRequest setSamlResponseDecryptionKeyRequest = (SetSamlResponseDecryptionKeyRequest) o;
    if (!Objects.equals(this.samlProvider, setSamlResponseDecryptionKeyRequest.samlProvider)) {
      return false;
    }
    if (!Objects.equals(this.samlResponseEncryptionCertificate, setSamlResponseDecryptionKeyRequest.samlResponseEncryptionCertificate)) {
      return false;
    }
    if (!Objects.equals(this.currentSamlResponseDecryptionKey, setSamlResponseDecryptionKeyRequest.currentSamlResponseDecryptionKey)) {
      return false;
    }
    if (!Objects.equals(this.nextSamlResponseDecryptionKey, setSamlResponseDecryptionKeyRequest.nextSamlResponseDecryptionKey)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(samlProvider, samlResponseEncryptionCertificate, currentSamlResponseDecryptionKey, nextSamlResponseDecryptionKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetSamlResponseDecryptionKeyRequest {\n");
    sb.append("    samlProvider: ").append(toIndentedString(samlProvider)).append("\n");
    sb.append("    samlResponseEncryptionCertificate: ").append(toIndentedString(samlResponseEncryptionCertificate)).append("\n");
    sb.append("    currentSamlResponseDecryptionKey: ").append(toIndentedString(currentSamlResponseDecryptionKey)).append("\n");
    sb.append("    nextSamlResponseDecryptionKey: ").append(toIndentedString(nextSamlResponseDecryptionKey)).append("\n");
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

