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
 * Inbound Connection Endpoint Certificate Summary
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-08-14T10:18:51.848-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class InboundConnectionEndpointCertificateSummary  {

  /**
   * The timestamp of when the Inbound Connection Endpoint Certificate expires
   **/
  private Long expiration = null;

  /**
   * The type of the Inbound Connection Endpoint Certificate
   **/
  private String certificateType = null;

  /**
   * The state of the Inbound Connection Endpoint Certificate
   **/
  private String state = null;

  /**
   * The status message of the Inbound Connection Endpoint Certificate
   **/
  private String statusMessage = null;

  /**
   * Getter for expiration.
   * The timestamp of when the Inbound Connection Endpoint Certificate expires
   **/
  @JsonProperty("expiration")
  public Long getExpiration() {
    return expiration;
  }

  /**
   * Setter for expiration.
   * The timestamp of when the Inbound Connection Endpoint Certificate expires
   **/
  public void setExpiration(Long expiration) {
    this.expiration = expiration;
  }

  /**
   * Getter for certificateType.
   * The type of the Inbound Connection Endpoint Certificate
   **/
  @JsonProperty("certificateType")
  public String getCertificateType() {
    return certificateType;
  }

  /**
   * Setter for certificateType.
   * The type of the Inbound Connection Endpoint Certificate
   **/
  public void setCertificateType(String certificateType) {
    this.certificateType = certificateType;
  }

  /**
   * Getter for state.
   * The state of the Inbound Connection Endpoint Certificate
   **/
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  /**
   * Setter for state.
   * The state of the Inbound Connection Endpoint Certificate
   **/
  public void setState(String state) {
    this.state = state;
  }

  /**
   * Getter for statusMessage.
   * The status message of the Inbound Connection Endpoint Certificate
   **/
  @JsonProperty("statusMessage")
  public String getStatusMessage() {
    return statusMessage;
  }

  /**
   * Setter for statusMessage.
   * The status message of the Inbound Connection Endpoint Certificate
   **/
  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundConnectionEndpointCertificateSummary inboundConnectionEndpointCertificateSummary = (InboundConnectionEndpointCertificateSummary) o;
    if (!Objects.equals(this.expiration, inboundConnectionEndpointCertificateSummary.expiration)) {
      return false;
    }
    if (!Objects.equals(this.certificateType, inboundConnectionEndpointCertificateSummary.certificateType)) {
      return false;
    }
    if (!Objects.equals(this.state, inboundConnectionEndpointCertificateSummary.state)) {
      return false;
    }
    if (!Objects.equals(this.statusMessage, inboundConnectionEndpointCertificateSummary.statusMessage)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiration, certificateType, state, statusMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundConnectionEndpointCertificateSummary {\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
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

