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
import com.cloudera.cdp.environments.model.KdcServerRequest;
import java.util.*;

/**
 * Request object to Setting up Active Directory Trust.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-25T09:53:05.855-07:00")
public class SetupActiveDirectoryTrustRequest  {

  /**
   * Environment name or CRN that identifies the Hybrid Environment.
   **/
  private String environment = null;

  /**
   * The list of the Key Distribution Center (KDC) servers (currently only one KDC server is supported; multi-server support is under development).
   **/
  private List<KdcServerRequest> kdcServers = new ArrayList<KdcServerRequest>();

  /**
   * Cross-realm trust REALM name (uppercase by convention).
   **/
  private String kdcRealm = null;

  /**
   * Environment CRN that identifies an on-premises cluster.
   **/
  private String remoteEnvironmentCrn = null;

  /**
   * Domain Name System (DNS) server IPv4 addresses (currently only a single address is supported; multi-server support is under development).
   **/
  private List<String> dnsServerIps = new ArrayList<String>();

  /**
   * Existing trust secret. If not provided, CDP will generate a secure random secret.
   **/
  private String trustSecret = null;

  /**
   * Getter for environment.
   * Environment name or CRN that identifies the Hybrid Environment.
   **/
  @JsonProperty("environment")
  public String getEnvironment() {
    return environment;
  }

  /**
   * Setter for environment.
   * Environment name or CRN that identifies the Hybrid Environment.
   **/
  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  /**
   * Getter for kdcServers.
   * The list of the Key Distribution Center (KDC) servers (currently only one KDC server is supported; multi-server support is under development).
   **/
  @JsonProperty("kdcServers")
  public List<KdcServerRequest> getKdcServers() {
    return kdcServers;
  }

  /**
   * Setter for kdcServers.
   * The list of the Key Distribution Center (KDC) servers (currently only one KDC server is supported; multi-server support is under development).
   **/
  public void setKdcServers(List<KdcServerRequest> kdcServers) {
    this.kdcServers = kdcServers;
  }

  /**
   * Getter for kdcRealm.
   * Cross-realm trust REALM name (uppercase by convention).
   **/
  @JsonProperty("kdcRealm")
  public String getKdcRealm() {
    return kdcRealm;
  }

  /**
   * Setter for kdcRealm.
   * Cross-realm trust REALM name (uppercase by convention).
   **/
  public void setKdcRealm(String kdcRealm) {
    this.kdcRealm = kdcRealm;
  }

  /**
   * Getter for remoteEnvironmentCrn.
   * Environment CRN that identifies an on-premises cluster.
   **/
  @JsonProperty("remoteEnvironmentCrn")
  public String getRemoteEnvironmentCrn() {
    return remoteEnvironmentCrn;
  }

  /**
   * Setter for remoteEnvironmentCrn.
   * Environment CRN that identifies an on-premises cluster.
   **/
  public void setRemoteEnvironmentCrn(String remoteEnvironmentCrn) {
    this.remoteEnvironmentCrn = remoteEnvironmentCrn;
  }

  /**
   * Getter for dnsServerIps.
   * Domain Name System (DNS) server IPv4 addresses (currently only a single address is supported; multi-server support is under development).
   **/
  @JsonProperty("dnsServerIps")
  public List<String> getDnsServerIps() {
    return dnsServerIps;
  }

  /**
   * Setter for dnsServerIps.
   * Domain Name System (DNS) server IPv4 addresses (currently only a single address is supported; multi-server support is under development).
   **/
  public void setDnsServerIps(List<String> dnsServerIps) {
    this.dnsServerIps = dnsServerIps;
  }

  /**
   * Getter for trustSecret.
   * Existing trust secret. If not provided, CDP will generate a secure random secret.
   **/
  @JsonProperty("trustSecret")
  public String getTrustSecret() {
    return trustSecret;
  }

  /**
   * Setter for trustSecret.
   * Existing trust secret. If not provided, CDP will generate a secure random secret.
   **/
  public void setTrustSecret(String trustSecret) {
    this.trustSecret = trustSecret;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetupActiveDirectoryTrustRequest setupActiveDirectoryTrustRequest = (SetupActiveDirectoryTrustRequest) o;
    if (!Objects.equals(this.environment, setupActiveDirectoryTrustRequest.environment)) {
      return false;
    }
    if (!Objects.equals(this.kdcServers, setupActiveDirectoryTrustRequest.kdcServers)) {
      return false;
    }
    if (!Objects.equals(this.kdcRealm, setupActiveDirectoryTrustRequest.kdcRealm)) {
      return false;
    }
    if (!Objects.equals(this.remoteEnvironmentCrn, setupActiveDirectoryTrustRequest.remoteEnvironmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.dnsServerIps, setupActiveDirectoryTrustRequest.dnsServerIps)) {
      return false;
    }
    if (!Objects.equals(this.trustSecret, setupActiveDirectoryTrustRequest.trustSecret)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, kdcServers, kdcRealm, remoteEnvironmentCrn, dnsServerIps, trustSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetupActiveDirectoryTrustRequest {\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    kdcServers: ").append(toIndentedString(kdcServers)).append("\n");
    sb.append("    kdcRealm: ").append(toIndentedString(kdcRealm)).append("\n");
    sb.append("    remoteEnvironmentCrn: ").append(toIndentedString(remoteEnvironmentCrn)).append("\n");
    sb.append("    dnsServerIps: ").append(toIndentedString(dnsServerIps)).append("\n");
    sb.append("    trustSecret: ").append(toIndentedString(trustSecret)).append("\n");
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

