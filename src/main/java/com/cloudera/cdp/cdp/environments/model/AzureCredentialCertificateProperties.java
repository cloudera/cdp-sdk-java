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
import java.time.ZonedDateTime;

/**
 * The certificate used for the credential
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-02-18T18:28:45.237-08:00")
public class AzureCredentialCertificateProperties  {

  /**
   * The status of an Azure credential.
   **/
  private String status = null;

  /**
   * the expiration timestamp
   **/
  private String expiration = null;

  /**
   * the expiration in date format
   **/
  private ZonedDateTime expirationDate = null;

  /**
   * The SHA512 digest of the certificate
   **/
  private String sha512 = null;

  /**
   * The certificate (PEM) encoded in base64 format
   **/
  private String base64 = null;

  /**
   * Getter for status.
   * The status of an Azure credential.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The status of an Azure credential.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for expiration.
   * the expiration timestamp
   **/
  @JsonProperty("expiration")
  public String getExpiration() {
    return expiration;
  }

  /**
   * Setter for expiration.
   * the expiration timestamp
   **/
  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }

  /**
   * Getter for expirationDate.
   * the expiration in date format
   **/
  @JsonProperty("expirationDate")
  public ZonedDateTime getExpirationDate() {
    return expirationDate;
  }

  /**
   * Setter for expirationDate.
   * the expiration in date format
   **/
  public void setExpirationDate(ZonedDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  /**
   * Getter for sha512.
   * The SHA512 digest of the certificate
   **/
  @JsonProperty("sha512")
  public String getSha512() {
    return sha512;
  }

  /**
   * Setter for sha512.
   * The SHA512 digest of the certificate
   **/
  public void setSha512(String sha512) {
    this.sha512 = sha512;
  }

  /**
   * Getter for base64.
   * The certificate (PEM) encoded in base64 format
   **/
  @JsonProperty("base64")
  public String getBase64() {
    return base64;
  }

  /**
   * Setter for base64.
   * The certificate (PEM) encoded in base64 format
   **/
  public void setBase64(String base64) {
    this.base64 = base64;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureCredentialCertificateProperties azureCredentialCertificateProperties = (AzureCredentialCertificateProperties) o;
    if (!Objects.equals(this.status, azureCredentialCertificateProperties.status)) {
      return false;
    }
    if (!Objects.equals(this.expiration, azureCredentialCertificateProperties.expiration)) {
      return false;
    }
    if (!Objects.equals(this.expirationDate, azureCredentialCertificateProperties.expirationDate)) {
      return false;
    }
    if (!Objects.equals(this.sha512, azureCredentialCertificateProperties.sha512)) {
      return false;
    }
    if (!Objects.equals(this.base64, azureCredentialCertificateProperties.base64)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, expiration, expirationDate, sha512, base64);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureCredentialCertificateProperties {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    sha512: ").append(toIndentedString(sha512)).append("\n");
    sb.append("    base64: ").append(toIndentedString(base64)).append("\n");
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

