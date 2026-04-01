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

/**
 * Key Distribution Center (KDC) server properties.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-31T14:25:32.123-07:00")
public class KdcServerRequest  {

  /**
   * Key Distribution Center (KDC) server Fully Qualified Domain Name.
   **/
  private String fqdn = null;

  /**
   * Key Distribution Center (KDC) server IPv4 address.
   **/
  private String ip = null;

  /**
   * Getter for fqdn.
   * Key Distribution Center (KDC) server Fully Qualified Domain Name.
   **/
  @JsonProperty("fqdn")
  public String getFqdn() {
    return fqdn;
  }

  /**
   * Setter for fqdn.
   * Key Distribution Center (KDC) server Fully Qualified Domain Name.
   **/
  public void setFqdn(String fqdn) {
    this.fqdn = fqdn;
  }

  /**
   * Getter for ip.
   * Key Distribution Center (KDC) server IPv4 address.
   **/
  @JsonProperty("ip")
  public String getIp() {
    return ip;
  }

  /**
   * Setter for ip.
   * Key Distribution Center (KDC) server IPv4 address.
   **/
  public void setIp(String ip) {
    this.ip = ip;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KdcServerRequest kdcServerRequest = (KdcServerRequest) o;
    if (!Objects.equals(this.fqdn, kdcServerRequest.fqdn)) {
      return false;
    }
    if (!Objects.equals(this.ip, kdcServerRequest.ip)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(fqdn, ip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KdcServerRequest {\n");
    sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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

