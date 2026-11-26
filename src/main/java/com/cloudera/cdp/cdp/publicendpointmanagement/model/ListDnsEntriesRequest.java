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
 * Request object for the ListDnsEntries method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-11-25T15:42:55.372Z")
public class ListDnsEntriesRequest  {

  /**
   * The CRN of the environment, for which the DNS entries are being listed.
   **/
  private String environmentCrn = null;

  /**
   * The record type to filter on, e.g. A, CNAME, etc.
   **/
  private String recordType = null;

  /**
   * The page size.
   **/
  private Integer pageSize = null;

  /**
   * The page token.
   **/
  private String pageToken = null;

  /**
   * Getter for environmentCrn.
   * The CRN of the environment, for which the DNS entries are being listed.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of the environment, for which the DNS entries are being listed.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for recordType.
   * The record type to filter on, e.g. A, CNAME, etc.
   **/
  @JsonProperty("recordType")
  public String getRecordType() {
    return recordType;
  }

  /**
   * Setter for recordType.
   * The record type to filter on, e.g. A, CNAME, etc.
   **/
  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }

  /**
   * Getter for pageSize.
   * The page size.
   **/
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  /**
   * Setter for pageSize.
   * The page size.
   **/
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  /**
   * Getter for pageToken.
   * The page token.
   **/
  @JsonProperty("pageToken")
  public String getPageToken() {
    return pageToken;
  }

  /**
   * Setter for pageToken.
   * The page token.
   **/
  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDnsEntriesRequest listDnsEntriesRequest = (ListDnsEntriesRequest) o;
    if (!Objects.equals(this.environmentCrn, listDnsEntriesRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.recordType, listDnsEntriesRequest.recordType)) {
      return false;
    }
    if (!Objects.equals(this.pageSize, listDnsEntriesRequest.pageSize)) {
      return false;
    }
    if (!Objects.equals(this.pageToken, listDnsEntriesRequest.pageToken)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, recordType, pageSize, pageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDnsEntriesRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
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

