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
import com.cloudera.cdp.df.model.ListDiagnosticsResponseItem;
import java.util.*;

/**
 * Response object for ListDiagnostics.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-06-14T15:47:18.822-07:00")
public class ListDiagnosticsResponse extends CdpResponse {

  /**
   * List of previous and current diagnostics requests for a given DataFlow Service.
   **/
  private List<ListDiagnosticsResponseItem> diagnostics = new ArrayList<ListDiagnosticsResponseItem>();

  /**
   * The page token for requesting the next page of results.
   **/
  private String nextToken = null;

  /**
   * Getter for diagnostics.
   * List of previous and current diagnostics requests for a given DataFlow Service.
   **/
  @JsonProperty("diagnostics")
  public List<ListDiagnosticsResponseItem> getDiagnostics() {
    return diagnostics;
  }

  /**
   * Setter for diagnostics.
   * List of previous and current diagnostics requests for a given DataFlow Service.
   **/
  public void setDiagnostics(List<ListDiagnosticsResponseItem> diagnostics) {
    this.diagnostics = diagnostics;
  }

  /**
   * Getter for nextToken.
   * The page token for requesting the next page of results.
   **/
  @JsonProperty("nextToken")
  public String getNextToken() {
    return nextToken;
  }

  /**
   * Setter for nextToken.
   * The page token for requesting the next page of results.
   **/
  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDiagnosticsResponse listDiagnosticsResponse = (ListDiagnosticsResponse) o;
    if (!Objects.equals(this.diagnostics, listDiagnosticsResponse.diagnostics)) {
      return false;
    }
    if (!Objects.equals(this.nextToken, listDiagnosticsResponse.nextToken)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(diagnostics, nextToken, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDiagnosticsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    diagnostics: ").append(toIndentedString(diagnostics)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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

