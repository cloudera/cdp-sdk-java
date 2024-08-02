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
 * Request object to renew Inbound Connection Endpoint certificate(s)
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-08-02T09:36:51.948-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class RenewInboundConnectionEndpointCertificateRequest  {

  /**
   * The CRN of an environment to execute the command.
   **/
  private String environmentCrn = null;

  /**
   * The CRN of the Inbound Connection Endpoint
   **/
  private String crn = null;

  /**
   * Whether to renew Inbound Connection Endpoint's server certificate
   **/
  private Boolean renewServerCertificate = null;

  /**
   * Whether to renew Inbound Connection Endpoint's client certificates
   **/
  private Boolean renewClientCertificates = null;

  /**
   * Whether to revoke existing Inbound Connection Endpoint's client certificates
   **/
  private Boolean revokeClientCertificates = null;

  /**
   * Getter for environmentCrn.
   * The CRN of an environment to execute the command.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of an environment to execute the command.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for crn.
   * The CRN of the Inbound Connection Endpoint
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the Inbound Connection Endpoint
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for renewServerCertificate.
   * Whether to renew Inbound Connection Endpoint&#39;s server certificate
   **/
  @JsonProperty("renewServerCertificate")
  public Boolean getRenewServerCertificate() {
    return renewServerCertificate;
  }

  /**
   * Setter for renewServerCertificate.
   * Whether to renew Inbound Connection Endpoint&#39;s server certificate
   **/
  public void setRenewServerCertificate(Boolean renewServerCertificate) {
    this.renewServerCertificate = renewServerCertificate;
  }

  /**
   * Getter for renewClientCertificates.
   * Whether to renew Inbound Connection Endpoint&#39;s client certificates
   **/
  @JsonProperty("renewClientCertificates")
  public Boolean getRenewClientCertificates() {
    return renewClientCertificates;
  }

  /**
   * Setter for renewClientCertificates.
   * Whether to renew Inbound Connection Endpoint&#39;s client certificates
   **/
  public void setRenewClientCertificates(Boolean renewClientCertificates) {
    this.renewClientCertificates = renewClientCertificates;
  }

  /**
   * Getter for revokeClientCertificates.
   * Whether to revoke existing Inbound Connection Endpoint&#39;s client certificates
   **/
  @JsonProperty("revokeClientCertificates")
  public Boolean getRevokeClientCertificates() {
    return revokeClientCertificates;
  }

  /**
   * Setter for revokeClientCertificates.
   * Whether to revoke existing Inbound Connection Endpoint&#39;s client certificates
   **/
  public void setRevokeClientCertificates(Boolean revokeClientCertificates) {
    this.revokeClientCertificates = revokeClientCertificates;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenewInboundConnectionEndpointCertificateRequest renewInboundConnectionEndpointCertificateRequest = (RenewInboundConnectionEndpointCertificateRequest) o;
    if (!Objects.equals(this.environmentCrn, renewInboundConnectionEndpointCertificateRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.crn, renewInboundConnectionEndpointCertificateRequest.crn)) {
      return false;
    }
    if (!Objects.equals(this.renewServerCertificate, renewInboundConnectionEndpointCertificateRequest.renewServerCertificate)) {
      return false;
    }
    if (!Objects.equals(this.renewClientCertificates, renewInboundConnectionEndpointCertificateRequest.renewClientCertificates)) {
      return false;
    }
    if (!Objects.equals(this.revokeClientCertificates, renewInboundConnectionEndpointCertificateRequest.revokeClientCertificates)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, crn, renewServerCertificate, renewClientCertificates, revokeClientCertificates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenewInboundConnectionEndpointCertificateRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    renewServerCertificate: ").append(toIndentedString(renewServerCertificate)).append("\n");
    sb.append("    renewClientCertificates: ").append(toIndentedString(renewClientCertificates)).append("\n");
    sb.append("    revokeClientCertificates: ").append(toIndentedString(revokeClientCertificates)).append("\n");
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

