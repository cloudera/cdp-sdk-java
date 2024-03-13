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

/**
 * Information about diagnostic bundle generation
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-03-13T13:08:47.791-07:00")
public class CollectDiagnosticsResponse extends CdpResponse {

  /**
   * Details of requested diagnostic bundle collection
   **/
  private DiagnosticsBundle diagnosticsBundle = null;

  /**
   * Getter for diagnosticsBundle.
   * Details of requested diagnostic bundle collection
   **/
  @JsonProperty("diagnosticsBundle")
  public DiagnosticsBundle getDiagnosticsBundle() {
    return diagnosticsBundle;
  }

  /**
   * Setter for diagnosticsBundle.
   * Details of requested diagnostic bundle collection
   **/
  public void setDiagnosticsBundle(DiagnosticsBundle diagnosticsBundle) {
    this.diagnosticsBundle = diagnosticsBundle;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectDiagnosticsResponse collectDiagnosticsResponse = (CollectDiagnosticsResponse) o;
    if (!Objects.equals(this.diagnosticsBundle, collectDiagnosticsResponse.diagnosticsBundle)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(diagnosticsBundle, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectDiagnosticsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    diagnosticsBundle: ").append(toIndentedString(diagnosticsBundle)).append("\n");
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

