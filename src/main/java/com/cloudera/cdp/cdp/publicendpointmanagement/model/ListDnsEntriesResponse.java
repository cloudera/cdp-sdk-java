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
import com.cloudera.cdp.publicendpointmanagement.model.DnsEntryResponse;
import java.util.*;

/**
 * Response object for the ListDnsEntries method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-10-27T19:34:58.374Z")
public class ListDnsEntriesResponse extends CdpResponse {

  /**
   * List of DNS entries for the specified environment.
   **/
  private List<DnsEntryResponse> dnsEntries = new ArrayList<DnsEntryResponse>();

  /**
   * The page token for requesting the next page of results.
   **/
  private String nextPageToken = null;

  /**
   * Getter for dnsEntries.
   * List of DNS entries for the specified environment.
   **/
  @JsonProperty("dnsEntries")
  public List<DnsEntryResponse> getDnsEntries() {
    return dnsEntries;
  }

  /**
   * Setter for dnsEntries.
   * List of DNS entries for the specified environment.
   **/
  public void setDnsEntries(List<DnsEntryResponse> dnsEntries) {
    this.dnsEntries = dnsEntries;
  }

  /**
   * Getter for nextPageToken.
   * The page token for requesting the next page of results.
   **/
  @JsonProperty("nextPageToken")
  public String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Setter for nextPageToken.
   * The page token for requesting the next page of results.
   **/
  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDnsEntriesResponse listDnsEntriesResponse = (ListDnsEntriesResponse) o;
    if (!Objects.equals(this.dnsEntries, listDnsEntriesResponse.dnsEntries)) {
      return false;
    }
    if (!Objects.equals(this.nextPageToken, listDnsEntriesResponse.nextPageToken)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsEntries, nextPageToken, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDnsEntriesResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dnsEntries: ").append(toIndentedString(dnsEntries)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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

