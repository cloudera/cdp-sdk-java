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
 * Response object for setting the encryption certificate and decryption key for SAML response.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-26T08:05:44.591-08:00")
public class SetSamlResponseDecryptionKeyResponse extends CdpResponse {

  /**
   * The date when SAML response encryption certificate and decryption keys were set or cleared.
   **/
  private ZonedDateTime samlResponseEncryptionDecryptionConfigurationLastUpdated = null;

  /**
   * Whether the SAML response encryption certificate is set or cleared.
   **/
  private Boolean samlResponseEncryptionCertificateDefined = null;

  /**
   * Whether the current decryption key for SAML response is set or cleared.
   **/
  private Boolean currentSamlResponseDecryptionKeyDefined = null;

  /**
   * Whether the next decryption key for SAML response is set or cleared.
   **/
  private Boolean nextSamlResponseDecryptionKeyDefined = null;

  /**
   * Getter for samlResponseEncryptionDecryptionConfigurationLastUpdated.
   * The date when SAML response encryption certificate and decryption keys were set or cleared.
   **/
  @JsonProperty("samlResponseEncryptionDecryptionConfigurationLastUpdated")
  public ZonedDateTime getSamlResponseEncryptionDecryptionConfigurationLastUpdated() {
    return samlResponseEncryptionDecryptionConfigurationLastUpdated;
  }

  /**
   * Setter for samlResponseEncryptionDecryptionConfigurationLastUpdated.
   * The date when SAML response encryption certificate and decryption keys were set or cleared.
   **/
  public void setSamlResponseEncryptionDecryptionConfigurationLastUpdated(ZonedDateTime samlResponseEncryptionDecryptionConfigurationLastUpdated) {
    this.samlResponseEncryptionDecryptionConfigurationLastUpdated = samlResponseEncryptionDecryptionConfigurationLastUpdated;
  }

  /**
   * Getter for samlResponseEncryptionCertificateDefined.
   * Whether the SAML response encryption certificate is set or cleared.
   **/
  @JsonProperty("samlResponseEncryptionCertificateDefined")
  public Boolean getSamlResponseEncryptionCertificateDefined() {
    return samlResponseEncryptionCertificateDefined;
  }

  /**
   * Setter for samlResponseEncryptionCertificateDefined.
   * Whether the SAML response encryption certificate is set or cleared.
   **/
  public void setSamlResponseEncryptionCertificateDefined(Boolean samlResponseEncryptionCertificateDefined) {
    this.samlResponseEncryptionCertificateDefined = samlResponseEncryptionCertificateDefined;
  }

  /**
   * Getter for currentSamlResponseDecryptionKeyDefined.
   * Whether the current decryption key for SAML response is set or cleared.
   **/
  @JsonProperty("currentSamlResponseDecryptionKeyDefined")
  public Boolean getCurrentSamlResponseDecryptionKeyDefined() {
    return currentSamlResponseDecryptionKeyDefined;
  }

  /**
   * Setter for currentSamlResponseDecryptionKeyDefined.
   * Whether the current decryption key for SAML response is set or cleared.
   **/
  public void setCurrentSamlResponseDecryptionKeyDefined(Boolean currentSamlResponseDecryptionKeyDefined) {
    this.currentSamlResponseDecryptionKeyDefined = currentSamlResponseDecryptionKeyDefined;
  }

  /**
   * Getter for nextSamlResponseDecryptionKeyDefined.
   * Whether the next decryption key for SAML response is set or cleared.
   **/
  @JsonProperty("nextSamlResponseDecryptionKeyDefined")
  public Boolean getNextSamlResponseDecryptionKeyDefined() {
    return nextSamlResponseDecryptionKeyDefined;
  }

  /**
   * Setter for nextSamlResponseDecryptionKeyDefined.
   * Whether the next decryption key for SAML response is set or cleared.
   **/
  public void setNextSamlResponseDecryptionKeyDefined(Boolean nextSamlResponseDecryptionKeyDefined) {
    this.nextSamlResponseDecryptionKeyDefined = nextSamlResponseDecryptionKeyDefined;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetSamlResponseDecryptionKeyResponse setSamlResponseDecryptionKeyResponse = (SetSamlResponseDecryptionKeyResponse) o;
    if (!Objects.equals(this.samlResponseEncryptionDecryptionConfigurationLastUpdated, setSamlResponseDecryptionKeyResponse.samlResponseEncryptionDecryptionConfigurationLastUpdated)) {
      return false;
    }
    if (!Objects.equals(this.samlResponseEncryptionCertificateDefined, setSamlResponseDecryptionKeyResponse.samlResponseEncryptionCertificateDefined)) {
      return false;
    }
    if (!Objects.equals(this.currentSamlResponseDecryptionKeyDefined, setSamlResponseDecryptionKeyResponse.currentSamlResponseDecryptionKeyDefined)) {
      return false;
    }
    if (!Objects.equals(this.nextSamlResponseDecryptionKeyDefined, setSamlResponseDecryptionKeyResponse.nextSamlResponseDecryptionKeyDefined)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(samlResponseEncryptionDecryptionConfigurationLastUpdated, samlResponseEncryptionCertificateDefined, currentSamlResponseDecryptionKeyDefined, nextSamlResponseDecryptionKeyDefined, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetSamlResponseDecryptionKeyResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    samlResponseEncryptionDecryptionConfigurationLastUpdated: ").append(toIndentedString(samlResponseEncryptionDecryptionConfigurationLastUpdated)).append("\n");
    sb.append("    samlResponseEncryptionCertificateDefined: ").append(toIndentedString(samlResponseEncryptionCertificateDefined)).append("\n");
    sb.append("    currentSamlResponseDecryptionKeyDefined: ").append(toIndentedString(currentSamlResponseDecryptionKeyDefined)).append("\n");
    sb.append("    nextSamlResponseDecryptionKeyDefined: ").append(toIndentedString(nextSamlResponseDecryptionKeyDefined)).append("\n");
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

