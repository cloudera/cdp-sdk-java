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
import java.util.*;

/**
 * Details of a FreeIPA cluster.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-11-10T17:48:32.513-08:00")
public class FreeipaDetails  {

  /**
   * CRN of the FreeIPA cluster.
   **/
  private String crn = null;

  /**
   * The domain name of the FreeIPA cluster.
   **/
  private String domain = null;

  /**
   * The hostname of the FreeIPA cluster.
   **/
  private String hostname = null;

  /**
   * The IP addresses of the FreeIPA cluster.
   **/
  private List<String> serverIP = new ArrayList<String>();

  /**
   * Getter for crn.
   * CRN of the FreeIPA cluster.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * CRN of the FreeIPA cluster.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for domain.
   * The domain name of the FreeIPA cluster.
   **/
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  /**
   * Setter for domain.
   * The domain name of the FreeIPA cluster.
   **/
  public void setDomain(String domain) {
    this.domain = domain;
  }

  /**
   * Getter for hostname.
   * The hostname of the FreeIPA cluster.
   **/
  @JsonProperty("hostname")
  public String getHostname() {
    return hostname;
  }

  /**
   * Setter for hostname.
   * The hostname of the FreeIPA cluster.
   **/
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  /**
   * Getter for serverIP.
   * The IP addresses of the FreeIPA cluster.
   **/
  @JsonProperty("serverIP")
  public List<String> getServerIP() {
    return serverIP;
  }

  /**
   * Setter for serverIP.
   * The IP addresses of the FreeIPA cluster.
   **/
  public void setServerIP(List<String> serverIP) {
    this.serverIP = serverIP;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeipaDetails freeipaDetails = (FreeipaDetails) o;
    if (!Objects.equals(this.crn, freeipaDetails.crn)) {
      return false;
    }
    if (!Objects.equals(this.domain, freeipaDetails.domain)) {
      return false;
    }
    if (!Objects.equals(this.hostname, freeipaDetails.hostname)) {
      return false;
    }
    if (!Objects.equals(this.serverIP, freeipaDetails.serverIP)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, domain, hostname, serverIP);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeipaDetails {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    serverIP: ").append(toIndentedString(serverIP)).append("\n");
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

