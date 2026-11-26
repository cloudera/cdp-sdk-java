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

package com.cloudera.cdp.publicendpointmanagement.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.publicendpointmanagement.model.DnsTargetRecord;

/**
 * DnsEntryResponse represents a DNS entry with its name, type, target records, and optional TTL.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-11-25T15:42:55.372Z")
public class DnsEntryResponse extends CdpResponse {

  /**
   * The DNS name for this entry, e.g. example.com.
   **/
  private String dnsRecordName = null;

  /**
   * The record type of the DNS entry, e.g. A, CNAME, etc.
   **/
  private String dnsRecordType = null;

  /**
   * The target for this DNS entry, which can be an IP address, CNAME, or AWS ELB DNS.
   **/
  private DnsTargetRecord dnsTargetRecords = null;

  /**
   * Time to live for the DNS entry, in seconds.
   **/
  private String dnsTTL = null;

  /**
   * Getter for dnsRecordName.
   * The DNS name for this entry, e.g. example.com.
   **/
  @JsonProperty("dnsRecordName")
  public String getDnsRecordName() {
    return dnsRecordName;
  }

  /**
   * Setter for dnsRecordName.
   * The DNS name for this entry, e.g. example.com.
   **/
  public void setDnsRecordName(String dnsRecordName) {
    this.dnsRecordName = dnsRecordName;
  }

  /**
   * Getter for dnsRecordType.
   * The record type of the DNS entry, e.g. A, CNAME, etc.
   **/
  @JsonProperty("dnsRecordType")
  public String getDnsRecordType() {
    return dnsRecordType;
  }

  /**
   * Setter for dnsRecordType.
   * The record type of the DNS entry, e.g. A, CNAME, etc.
   **/
  public void setDnsRecordType(String dnsRecordType) {
    this.dnsRecordType = dnsRecordType;
  }

  /**
   * Getter for dnsTargetRecords.
   * The target for this DNS entry, which can be an IP address, CNAME, or AWS ELB DNS.
   **/
  @JsonProperty("dnsTargetRecords")
  public DnsTargetRecord getDnsTargetRecords() {
    return dnsTargetRecords;
  }

  /**
   * Setter for dnsTargetRecords.
   * The target for this DNS entry, which can be an IP address, CNAME, or AWS ELB DNS.
   **/
  public void setDnsTargetRecords(DnsTargetRecord dnsTargetRecords) {
    this.dnsTargetRecords = dnsTargetRecords;
  }

  /**
   * Getter for dnsTTL.
   * Time to live for the DNS entry, in seconds.
   **/
  @JsonProperty("dnsTTL")
  public String getDnsTTL() {
    return dnsTTL;
  }

  /**
   * Setter for dnsTTL.
   * Time to live for the DNS entry, in seconds.
   **/
  public void setDnsTTL(String dnsTTL) {
    this.dnsTTL = dnsTTL;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsEntryResponse dnsEntryResponse = (DnsEntryResponse) o;
    if (!Objects.equals(this.dnsRecordName, dnsEntryResponse.dnsRecordName)) {
      return false;
    }
    if (!Objects.equals(this.dnsRecordType, dnsEntryResponse.dnsRecordType)) {
      return false;
    }
    if (!Objects.equals(this.dnsTargetRecords, dnsEntryResponse.dnsTargetRecords)) {
      return false;
    }
    if (!Objects.equals(this.dnsTTL, dnsEntryResponse.dnsTTL)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsRecordName, dnsRecordType, dnsTargetRecords, dnsTTL, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsEntryResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dnsRecordName: ").append(toIndentedString(dnsRecordName)).append("\n");
    sb.append("    dnsRecordType: ").append(toIndentedString(dnsRecordType)).append("\n");
    sb.append("    dnsTargetRecords: ").append(toIndentedString(dnsTargetRecords)).append("\n");
    sb.append("    dnsTTL: ").append(toIndentedString(dnsTTL)).append("\n");
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

