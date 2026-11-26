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
import com.cloudera.cdp.publicendpointmanagement.model.DnsTarget;

/**
 * Request object for the DeleteDnsEntry method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-11-25T15:42:55.372Z")
public class DeleteDnsEntryRequest  {

  /**
   * The CRN of the environment, for which the DNS entry is to be deleted.
   **/
  private String environmentCrn = null;

  /**
   * The DNS target set for this domain name.
   **/
  private DnsTarget dnsTarget = null;

  /**
   * The endpoint for this cluster.
   **/
  private String endpoint = null;

  /**
   * Removes the wildcard entry if TRUE.
   **/
  private Boolean removeWildcard = null;

  /**
   * Getter for environmentCrn.
   * The CRN of the environment, for which the DNS entry is to be deleted.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of the environment, for which the DNS entry is to be deleted.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for dnsTarget.
   * The DNS target set for this domain name.
   **/
  @JsonProperty("dnsTarget")
  public DnsTarget getDnsTarget() {
    return dnsTarget;
  }

  /**
   * Setter for dnsTarget.
   * The DNS target set for this domain name.
   **/
  public void setDnsTarget(DnsTarget dnsTarget) {
    this.dnsTarget = dnsTarget;
  }

  /**
   * Getter for endpoint.
   * The endpoint for this cluster.
   **/
  @JsonProperty("endpoint")
  public String getEndpoint() {
    return endpoint;
  }

  /**
   * Setter for endpoint.
   * The endpoint for this cluster.
   **/
  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  /**
   * Getter for removeWildcard.
   * Removes the wildcard entry if TRUE.
   **/
  @JsonProperty("removeWildcard")
  public Boolean getRemoveWildcard() {
    return removeWildcard;
  }

  /**
   * Setter for removeWildcard.
   * Removes the wildcard entry if TRUE.
   **/
  public void setRemoveWildcard(Boolean removeWildcard) {
    this.removeWildcard = removeWildcard;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteDnsEntryRequest deleteDnsEntryRequest = (DeleteDnsEntryRequest) o;
    if (!Objects.equals(this.environmentCrn, deleteDnsEntryRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.dnsTarget, deleteDnsEntryRequest.dnsTarget)) {
      return false;
    }
    if (!Objects.equals(this.endpoint, deleteDnsEntryRequest.endpoint)) {
      return false;
    }
    if (!Objects.equals(this.removeWildcard, deleteDnsEntryRequest.removeWildcard)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, dnsTarget, endpoint, removeWildcard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteDnsEntryRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    dnsTarget: ").append(toIndentedString(dnsTarget)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    removeWildcard: ").append(toIndentedString(removeWildcard)).append("\n");
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

