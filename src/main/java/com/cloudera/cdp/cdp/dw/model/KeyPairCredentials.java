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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Certificate and private key pair credentials, that could be used ie mutual TLS connections therefore these must belong together.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-26T09:46:33.654-07:00")
public class KeyPairCredentials  {

  /**
   * The content of certificate PEM file.
   **/
  private String certificate = null;

  /**
   * The content of private key PEM file.
   **/
  private String privateKey = null;

  /**
   * Getter for certificate.
   * The content of certificate PEM file.
   **/
  @JsonProperty("certificate")
  public String getCertificate() {
    return certificate;
  }

  /**
   * Setter for certificate.
   * The content of certificate PEM file.
   **/
  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  /**
   * Getter for privateKey.
   * The content of private key PEM file.
   **/
  @JsonProperty("privateKey")
  public String getPrivateKey() {
    return privateKey;
  }

  /**
   * Setter for privateKey.
   * The content of private key PEM file.
   **/
  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyPairCredentials keyPairCredentials = (KeyPairCredentials) o;
    if (!Objects.equals(this.certificate, keyPairCredentials.certificate)) {
      return false;
    }
    if (!Objects.equals(this.privateKey, keyPairCredentials.privateKey)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, privateKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyPairCredentials {\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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

