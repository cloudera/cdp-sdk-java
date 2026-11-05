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

/**
 * AWSElbDnsTarget represents an AWS ELB (e.g. ALB/NLB) alias target for a DNS entry.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-10-27T19:34:58.374Z")
public class AWSElbDnsTarget  {

  /**
   * The DNS name of the AWS ELB, e.g. \"my-alb-123.elb.eu-west-1.amazonaws.com\".
   **/
  private String dnsName = null;

  /**
   * The Route53 hosted zone id of the AWS ELB.
   **/
  private String hostedZoneId = null;

  /**
   * Getter for dnsName.
   * The DNS name of the AWS ELB, e.g. \&quot;my-alb-123.elb.eu-west-1.amazonaws.com\&quot;.
   **/
  @JsonProperty("dnsName")
  public String getDnsName() {
    return dnsName;
  }

  /**
   * Setter for dnsName.
   * The DNS name of the AWS ELB, e.g. \&quot;my-alb-123.elb.eu-west-1.amazonaws.com\&quot;.
   **/
  public void setDnsName(String dnsName) {
    this.dnsName = dnsName;
  }

  /**
   * Getter for hostedZoneId.
   * The Route53 hosted zone id of the AWS ELB.
   **/
  @JsonProperty("hostedZoneId")
  public String getHostedZoneId() {
    return hostedZoneId;
  }

  /**
   * Setter for hostedZoneId.
   * The Route53 hosted zone id of the AWS ELB.
   **/
  public void setHostedZoneId(String hostedZoneId) {
    this.hostedZoneId = hostedZoneId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSElbDnsTarget aWSElbDnsTarget = (AWSElbDnsTarget) o;
    if (!Objects.equals(this.dnsName, aWSElbDnsTarget.dnsName)) {
      return false;
    }
    if (!Objects.equals(this.hostedZoneId, aWSElbDnsTarget.hostedZoneId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsName, hostedZoneId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSElbDnsTarget {\n");
    sb.append("    dnsName: ").append(toIndentedString(dnsName)).append("\n");
    sb.append("    hostedZoneId: ").append(toIndentedString(hostedZoneId)).append("\n");
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

