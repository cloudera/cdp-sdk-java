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

package com.cloudera.cdp.dfworkload.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Response object that contains the client&#39;s certificates.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-26T08:05:45.357-08:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class InboundConnectionEndpointClientCertificatesResponse extends CdpResponse {

  /**
   * The client's certificate.
   **/
  private String clientCertificate = null;

  /**
   * The client's private key.
   **/
  private String clientPrivateKey = null;

  /**
   * Getter for clientCertificate.
   * The client&#39;s certificate.
   **/
  @JsonProperty("clientCertificate")
  public String getClientCertificate() {
    return clientCertificate;
  }

  /**
   * Setter for clientCertificate.
   * The client&#39;s certificate.
   **/
  public void setClientCertificate(String clientCertificate) {
    this.clientCertificate = clientCertificate;
  }

  /**
   * Getter for clientPrivateKey.
   * The client&#39;s private key.
   **/
  @JsonProperty("clientPrivateKey")
  public String getClientPrivateKey() {
    return clientPrivateKey;
  }

  /**
   * Setter for clientPrivateKey.
   * The client&#39;s private key.
   **/
  public void setClientPrivateKey(String clientPrivateKey) {
    this.clientPrivateKey = clientPrivateKey;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundConnectionEndpointClientCertificatesResponse inboundConnectionEndpointClientCertificatesResponse = (InboundConnectionEndpointClientCertificatesResponse) o;
    if (!Objects.equals(this.clientCertificate, inboundConnectionEndpointClientCertificatesResponse.clientCertificate)) {
      return false;
    }
    if (!Objects.equals(this.clientPrivateKey, inboundConnectionEndpointClientCertificatesResponse.clientPrivateKey)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientCertificate, clientPrivateKey, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundConnectionEndpointClientCertificatesResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    clientCertificate: ").append(toIndentedString(clientCertificate)).append("\n");
    sb.append("    clientPrivateKey: ").append(toIndentedString(clientPrivateKey)).append("\n");
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

