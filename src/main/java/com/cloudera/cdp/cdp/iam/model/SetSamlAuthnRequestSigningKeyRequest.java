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
 * Request object for setting the SAML AuthnRequest signing key and verification certificate.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-14T06:50:08.152-08:00")
public class SetSamlAuthnRequestSigningKeyRequest  {

  /**
   * The name or CRN of the SAML Provider associated with the signing key.
   **/
  private String samlProvider = null;

  /**
   * The private key used for signing AuthnRequests sent from CDP to the customer's SAML provider. It must be in PEM format. It must be non-empty and valid when 'currentAuthnRequestVerificationCertificate' is set. Omitting it from request will remove this key.
   **/
  private String authnRequestSigningKey = null;

  /**
   * The certificate used by SAML provider to verify AuthnRequests sent from CDP. It must be in PEM format. It must be non-empty and valid when 'authnRequestSigningKey' is set. Omitting it from request will remove this certificate.
   **/
  private String currentAuthnRequestVerificationCertificate = null;

  /**
   * The next verification certificate used by the SAML provider to verify AuthnRequests sent from CDP. It must be in PEM format. It is used for rotating verification certificate, and is expected to be empty after certification rotation completes. When both the current and next AuthnRequest certificates are set, both will appear in the CDP SP SAML metadata, indicating the Identity Provider should validate if either of the certificates validates the signature of the AuthnRequest. Both must be valid certificates, not expired. Once the Identity Provider has been updated with the new CDP SP SAML metadata to use both certificates, the signing key can be updated to correspond to the next certificate, the current certificate set to what had been next, and the next certificate cleared. The CDP SP SAML metadata can then be updated in the Identity Provider to use only a single certificate before the previous certificate expires. This allows rotating the signing key without downtime. Omitting it from request will remove this certificate.
   **/
  private String nextAuthnRequestVerificationCertificate = null;

  /**
   * Getter for samlProvider.
   * The name or CRN of the SAML Provider associated with the signing key.
   **/
  @JsonProperty("samlProvider")
  public String getSamlProvider() {
    return samlProvider;
  }

  /**
   * Setter for samlProvider.
   * The name or CRN of the SAML Provider associated with the signing key.
   **/
  public void setSamlProvider(String samlProvider) {
    this.samlProvider = samlProvider;
  }

  /**
   * Getter for authnRequestSigningKey.
   * The private key used for signing AuthnRequests sent from CDP to the customer&#39;s SAML provider. It must be in PEM format. It must be non-empty and valid when &#39;currentAuthnRequestVerificationCertificate&#39; is set. Omitting it from request will remove this key.
   **/
  @JsonProperty("authnRequestSigningKey")
  public String getAuthnRequestSigningKey() {
    return authnRequestSigningKey;
  }

  /**
   * Setter for authnRequestSigningKey.
   * The private key used for signing AuthnRequests sent from CDP to the customer&#39;s SAML provider. It must be in PEM format. It must be non-empty and valid when &#39;currentAuthnRequestVerificationCertificate&#39; is set. Omitting it from request will remove this key.
   **/
  public void setAuthnRequestSigningKey(String authnRequestSigningKey) {
    this.authnRequestSigningKey = authnRequestSigningKey;
  }

  /**
   * Getter for currentAuthnRequestVerificationCertificate.
   * The certificate used by SAML provider to verify AuthnRequests sent from CDP. It must be in PEM format. It must be non-empty and valid when &#39;authnRequestSigningKey&#39; is set. Omitting it from request will remove this certificate.
   **/
  @JsonProperty("currentAuthnRequestVerificationCertificate")
  public String getCurrentAuthnRequestVerificationCertificate() {
    return currentAuthnRequestVerificationCertificate;
  }

  /**
   * Setter for currentAuthnRequestVerificationCertificate.
   * The certificate used by SAML provider to verify AuthnRequests sent from CDP. It must be in PEM format. It must be non-empty and valid when &#39;authnRequestSigningKey&#39; is set. Omitting it from request will remove this certificate.
   **/
  public void setCurrentAuthnRequestVerificationCertificate(String currentAuthnRequestVerificationCertificate) {
    this.currentAuthnRequestVerificationCertificate = currentAuthnRequestVerificationCertificate;
  }

  /**
   * Getter for nextAuthnRequestVerificationCertificate.
   * The next verification certificate used by the SAML provider to verify AuthnRequests sent from CDP. It must be in PEM format. It is used for rotating verification certificate, and is expected to be empty after certification rotation completes. When both the current and next AuthnRequest certificates are set, both will appear in the CDP SP SAML metadata, indicating the Identity Provider should validate if either of the certificates validates the signature of the AuthnRequest. Both must be valid certificates, not expired. Once the Identity Provider has been updated with the new CDP SP SAML metadata to use both certificates, the signing key can be updated to correspond to the next certificate, the current certificate set to what had been next, and the next certificate cleared. The CDP SP SAML metadata can then be updated in the Identity Provider to use only a single certificate before the previous certificate expires. This allows rotating the signing key without downtime. Omitting it from request will remove this certificate.
   **/
  @JsonProperty("nextAuthnRequestVerificationCertificate")
  public String getNextAuthnRequestVerificationCertificate() {
    return nextAuthnRequestVerificationCertificate;
  }

  /**
   * Setter for nextAuthnRequestVerificationCertificate.
   * The next verification certificate used by the SAML provider to verify AuthnRequests sent from CDP. It must be in PEM format. It is used for rotating verification certificate, and is expected to be empty after certification rotation completes. When both the current and next AuthnRequest certificates are set, both will appear in the CDP SP SAML metadata, indicating the Identity Provider should validate if either of the certificates validates the signature of the AuthnRequest. Both must be valid certificates, not expired. Once the Identity Provider has been updated with the new CDP SP SAML metadata to use both certificates, the signing key can be updated to correspond to the next certificate, the current certificate set to what had been next, and the next certificate cleared. The CDP SP SAML metadata can then be updated in the Identity Provider to use only a single certificate before the previous certificate expires. This allows rotating the signing key without downtime. Omitting it from request will remove this certificate.
   **/
  public void setNextAuthnRequestVerificationCertificate(String nextAuthnRequestVerificationCertificate) {
    this.nextAuthnRequestVerificationCertificate = nextAuthnRequestVerificationCertificate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetSamlAuthnRequestSigningKeyRequest setSamlAuthnRequestSigningKeyRequest = (SetSamlAuthnRequestSigningKeyRequest) o;
    if (!Objects.equals(this.samlProvider, setSamlAuthnRequestSigningKeyRequest.samlProvider)) {
      return false;
    }
    if (!Objects.equals(this.authnRequestSigningKey, setSamlAuthnRequestSigningKeyRequest.authnRequestSigningKey)) {
      return false;
    }
    if (!Objects.equals(this.currentAuthnRequestVerificationCertificate, setSamlAuthnRequestSigningKeyRequest.currentAuthnRequestVerificationCertificate)) {
      return false;
    }
    if (!Objects.equals(this.nextAuthnRequestVerificationCertificate, setSamlAuthnRequestSigningKeyRequest.nextAuthnRequestVerificationCertificate)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(samlProvider, authnRequestSigningKey, currentAuthnRequestVerificationCertificate, nextAuthnRequestVerificationCertificate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetSamlAuthnRequestSigningKeyRequest {\n");
    sb.append("    samlProvider: ").append(toIndentedString(samlProvider)).append("\n");
    sb.append("    authnRequestSigningKey: ").append(toIndentedString(authnRequestSigningKey)).append("\n");
    sb.append("    currentAuthnRequestVerificationCertificate: ").append(toIndentedString(currentAuthnRequestVerificationCertificate)).append("\n");
    sb.append("    nextAuthnRequestVerificationCertificate: ").append(toIndentedString(nextAuthnRequestVerificationCertificate)).append("\n");
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

