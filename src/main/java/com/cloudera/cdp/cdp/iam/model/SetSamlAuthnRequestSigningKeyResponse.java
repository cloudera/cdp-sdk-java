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
import java.time.ZonedDateTime;

/**
 * Response object for setting the SAML AuthnRequest signing key and verification certificate.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-26T08:05:44.591-08:00")
public class SetSamlAuthnRequestSigningKeyResponse extends CdpResponse {

  /**
   * The date when SAML AuthnRequest signing key and verification certificates were set or cleared.
   **/
  private ZonedDateTime authnRequestConfigurationLastUpdated = null;

  /**
   * Whether the AuthnRequest signing key is set or cleared.
   **/
  private Boolean authnRequestSigningKeyDefined = null;

  /**
   * Whether the current AuthnRequest verification certificate is set or cleared.
   **/
  private Boolean currentAuthnRequestVerificationCertificateDefined = null;

  /**
   * Whether the next AuthnRequest verification certificate is set or cleared.
   **/
  private Boolean nextAuthnRequestVerificationCertificateDefined = null;

  /**
   * Getter for authnRequestConfigurationLastUpdated.
   * The date when SAML AuthnRequest signing key and verification certificates were set or cleared.
   **/
  @JsonProperty("authnRequestConfigurationLastUpdated")
  public ZonedDateTime getAuthnRequestConfigurationLastUpdated() {
    return authnRequestConfigurationLastUpdated;
  }

  /**
   * Setter for authnRequestConfigurationLastUpdated.
   * The date when SAML AuthnRequest signing key and verification certificates were set or cleared.
   **/
  public void setAuthnRequestConfigurationLastUpdated(ZonedDateTime authnRequestConfigurationLastUpdated) {
    this.authnRequestConfigurationLastUpdated = authnRequestConfigurationLastUpdated;
  }

  /**
   * Getter for authnRequestSigningKeyDefined.
   * Whether the AuthnRequest signing key is set or cleared.
   **/
  @JsonProperty("authnRequestSigningKeyDefined")
  public Boolean getAuthnRequestSigningKeyDefined() {
    return authnRequestSigningKeyDefined;
  }

  /**
   * Setter for authnRequestSigningKeyDefined.
   * Whether the AuthnRequest signing key is set or cleared.
   **/
  public void setAuthnRequestSigningKeyDefined(Boolean authnRequestSigningKeyDefined) {
    this.authnRequestSigningKeyDefined = authnRequestSigningKeyDefined;
  }

  /**
   * Getter for currentAuthnRequestVerificationCertificateDefined.
   * Whether the current AuthnRequest verification certificate is set or cleared.
   **/
  @JsonProperty("currentAuthnRequestVerificationCertificateDefined")
  public Boolean getCurrentAuthnRequestVerificationCertificateDefined() {
    return currentAuthnRequestVerificationCertificateDefined;
  }

  /**
   * Setter for currentAuthnRequestVerificationCertificateDefined.
   * Whether the current AuthnRequest verification certificate is set or cleared.
   **/
  public void setCurrentAuthnRequestVerificationCertificateDefined(Boolean currentAuthnRequestVerificationCertificateDefined) {
    this.currentAuthnRequestVerificationCertificateDefined = currentAuthnRequestVerificationCertificateDefined;
  }

  /**
   * Getter for nextAuthnRequestVerificationCertificateDefined.
   * Whether the next AuthnRequest verification certificate is set or cleared.
   **/
  @JsonProperty("nextAuthnRequestVerificationCertificateDefined")
  public Boolean getNextAuthnRequestVerificationCertificateDefined() {
    return nextAuthnRequestVerificationCertificateDefined;
  }

  /**
   * Setter for nextAuthnRequestVerificationCertificateDefined.
   * Whether the next AuthnRequest verification certificate is set or cleared.
   **/
  public void setNextAuthnRequestVerificationCertificateDefined(Boolean nextAuthnRequestVerificationCertificateDefined) {
    this.nextAuthnRequestVerificationCertificateDefined = nextAuthnRequestVerificationCertificateDefined;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetSamlAuthnRequestSigningKeyResponse setSamlAuthnRequestSigningKeyResponse = (SetSamlAuthnRequestSigningKeyResponse) o;
    if (!Objects.equals(this.authnRequestConfigurationLastUpdated, setSamlAuthnRequestSigningKeyResponse.authnRequestConfigurationLastUpdated)) {
      return false;
    }
    if (!Objects.equals(this.authnRequestSigningKeyDefined, setSamlAuthnRequestSigningKeyResponse.authnRequestSigningKeyDefined)) {
      return false;
    }
    if (!Objects.equals(this.currentAuthnRequestVerificationCertificateDefined, setSamlAuthnRequestSigningKeyResponse.currentAuthnRequestVerificationCertificateDefined)) {
      return false;
    }
    if (!Objects.equals(this.nextAuthnRequestVerificationCertificateDefined, setSamlAuthnRequestSigningKeyResponse.nextAuthnRequestVerificationCertificateDefined)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(authnRequestConfigurationLastUpdated, authnRequestSigningKeyDefined, currentAuthnRequestVerificationCertificateDefined, nextAuthnRequestVerificationCertificateDefined, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetSamlAuthnRequestSigningKeyResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    authnRequestConfigurationLastUpdated: ").append(toIndentedString(authnRequestConfigurationLastUpdated)).append("\n");
    sb.append("    authnRequestSigningKeyDefined: ").append(toIndentedString(authnRequestSigningKeyDefined)).append("\n");
    sb.append("    currentAuthnRequestVerificationCertificateDefined: ").append(toIndentedString(currentAuthnRequestVerificationCertificateDefined)).append("\n");
    sb.append("    nextAuthnRequestVerificationCertificateDefined: ").append(toIndentedString(nextAuthnRequestVerificationCertificateDefined)).append("\n");
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

