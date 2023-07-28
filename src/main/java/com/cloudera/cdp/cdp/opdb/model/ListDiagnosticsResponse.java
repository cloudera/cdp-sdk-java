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

package com.cloudera.cdp.opdb.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.opdb.model.DiagnosticsBundle;
import java.util.*;

/**
 * The list of in-progress diagnostic bundle operations
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-07-28T07:53:31.262-07:00")
public class ListDiagnosticsResponse extends CdpResponse {

  /**
   * List of diagnostics operations
   **/
  private List<DiagnosticsBundle> diagnosticsBundles = new ArrayList<DiagnosticsBundle>();

  /**
   * Getter for diagnosticsBundles.
   * List of diagnostics operations
   **/
  @JsonProperty("diagnosticsBundles")
  public List<DiagnosticsBundle> getDiagnosticsBundles() {
    return diagnosticsBundles;
  }

  /**
   * Setter for diagnosticsBundles.
   * List of diagnostics operations
   **/
  public void setDiagnosticsBundles(List<DiagnosticsBundle> diagnosticsBundles) {
    this.diagnosticsBundles = diagnosticsBundles;
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
    if (!Objects.equals(this.diagnosticsBundles, listDiagnosticsResponse.diagnosticsBundles)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(diagnosticsBundles, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDiagnosticsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    diagnosticsBundles: ").append(toIndentedString(diagnosticsBundles)).append("\n");
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

