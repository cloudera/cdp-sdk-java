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

package com.cloudera.cdp.df.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * A request to list past and present diagnostics for a given DataFlow Service.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-29T08:54:22.132-07:00")
public class ListDiagnosticsRequest  {

  /**
   * DataFlow Service CRN from which to list diagnostics.
   **/
  private String dfServiceCrn = null;

  /**
   * The page size.
   **/
  private Integer pageSize = null;

  /**
   * The token pointing to the next element to be retrieved.
   **/
  private String startingToken = null;

  /**
   * List of UUIDs to list in the response.
   **/
  private List<String> uuids = new ArrayList<String>();

  /**
   * Getter for dfServiceCrn.
   * DataFlow Service CRN from which to list diagnostics.
   **/
  @JsonProperty("dfServiceCrn")
  public String getDfServiceCrn() {
    return dfServiceCrn;
  }

  /**
   * Setter for dfServiceCrn.
   * DataFlow Service CRN from which to list diagnostics.
   **/
  public void setDfServiceCrn(String dfServiceCrn) {
    this.dfServiceCrn = dfServiceCrn;
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
   * Getter for startingToken.
   * The token pointing to the next element to be retrieved.
   **/
  @JsonProperty("startingToken")
  public String getStartingToken() {
    return startingToken;
  }

  /**
   * Setter for startingToken.
   * The token pointing to the next element to be retrieved.
   **/
  public void setStartingToken(String startingToken) {
    this.startingToken = startingToken;
  }

  /**
   * Getter for uuids.
   * List of UUIDs to list in the response.
   **/
  @JsonProperty("uuids")
  public List<String> getUuids() {
    return uuids;
  }

  /**
   * Setter for uuids.
   * List of UUIDs to list in the response.
   **/
  public void setUuids(List<String> uuids) {
    this.uuids = uuids;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDiagnosticsRequest listDiagnosticsRequest = (ListDiagnosticsRequest) o;
    if (!Objects.equals(this.dfServiceCrn, listDiagnosticsRequest.dfServiceCrn)) {
      return false;
    }
    if (!Objects.equals(this.pageSize, listDiagnosticsRequest.pageSize)) {
      return false;
    }
    if (!Objects.equals(this.startingToken, listDiagnosticsRequest.startingToken)) {
      return false;
    }
    if (!Objects.equals(this.uuids, listDiagnosticsRequest.uuids)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(dfServiceCrn, pageSize, startingToken, uuids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDiagnosticsRequest {\n");
    sb.append("    dfServiceCrn: ").append(toIndentedString(dfServiceCrn)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    startingToken: ").append(toIndentedString(startingToken)).append("\n");
    sb.append("    uuids: ").append(toIndentedString(uuids)).append("\n");
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

