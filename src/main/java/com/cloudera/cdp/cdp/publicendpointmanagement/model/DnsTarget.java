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
import com.cloudera.cdp.publicendpointmanagement.model.AWSElbDnsTarget;
import com.cloudera.cdp.publicendpointmanagement.model.IPs;

/**
 * DnsTarget represents the target of a DNS entry, which can be a set of IPs, a CNAME, or an AWS ELB DNS target.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-11-25T15:42:55.372Z")
public class DnsTarget  {

  /**
   * IP addresses for the DNS entry, e.g. [\"192.168.1.1\", \"10.0.0.1\"].
   **/
  private IPs targetIPs = null;

  /**
   * CNAME target for the DNS entry, e.g. \"example.com\".
   **/
  private String targetCname = null;

  /**
   * AWS ELB alias target for the DNS entry, used to point the record at a customer-owned ALB/NLB.
   **/
  private AWSElbDnsTarget targetAWSELBDns = null;

  /**
   * Getter for targetIPs.
   * IP addresses for the DNS entry, e.g. [\&quot;192.168.1.1\&quot;, \&quot;10.0.0.1\&quot;].
   **/
  @JsonProperty("targetIPs")
  public IPs getTargetIPs() {
    return targetIPs;
  }

  /**
   * Setter for targetIPs.
   * IP addresses for the DNS entry, e.g. [\&quot;192.168.1.1\&quot;, \&quot;10.0.0.1\&quot;].
   **/
  public void setTargetIPs(IPs targetIPs) {
    this.targetIPs = targetIPs;
  }

  /**
   * Getter for targetCname.
   * CNAME target for the DNS entry, e.g. \&quot;example.com\&quot;.
   **/
  @JsonProperty("targetCname")
  public String getTargetCname() {
    return targetCname;
  }

  /**
   * Setter for targetCname.
   * CNAME target for the DNS entry, e.g. \&quot;example.com\&quot;.
   **/
  public void setTargetCname(String targetCname) {
    this.targetCname = targetCname;
  }

  /**
   * Getter for targetAWSELBDns.
   * AWS ELB alias target for the DNS entry, used to point the record at a customer-owned ALB/NLB.
   **/
  @JsonProperty("targetAWSELBDns")
  public AWSElbDnsTarget getTargetAWSELBDns() {
    return targetAWSELBDns;
  }

  /**
   * Setter for targetAWSELBDns.
   * AWS ELB alias target for the DNS entry, used to point the record at a customer-owned ALB/NLB.
   **/
  public void setTargetAWSELBDns(AWSElbDnsTarget targetAWSELBDns) {
    this.targetAWSELBDns = targetAWSELBDns;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsTarget dnsTarget = (DnsTarget) o;
    if (!Objects.equals(this.targetIPs, dnsTarget.targetIPs)) {
      return false;
    }
    if (!Objects.equals(this.targetCname, dnsTarget.targetCname)) {
      return false;
    }
    if (!Objects.equals(this.targetAWSELBDns, dnsTarget.targetAWSELBDns)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetIPs, targetCname, targetAWSELBDns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsTarget {\n");
    sb.append("    targetIPs: ").append(toIndentedString(targetIPs)).append("\n");
    sb.append("    targetCname: ").append(toIndentedString(targetCname)).append("\n");
    sb.append("    targetAWSELBDns: ").append(toIndentedString(targetAWSELBDns)).append("\n");
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

