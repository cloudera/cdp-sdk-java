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

package com.cloudera.cdp.lakehouseopt.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for health check.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-05T07:54:46.717-07:00")
public class GetHealthRequest  {

  /**
   * The CRN of the CLO Data Hub.
   **/
  private String datahubCrn = null;

  /**
   * Health check scope. The supported values are \"Full\" and \"Partial\". The \"Full\" performs a deep health check along with livy session creation. The \"Partial\" performs a shallow health check which doesn't involve session creation.
   **/
  private String scope = "Partial";

  /**
   * Getter for datahubCrn.
   * The CRN of the CLO Data Hub.
   **/
  @JsonProperty("datahubCrn")
  public String getDatahubCrn() {
    return datahubCrn;
  }

  /**
   * Setter for datahubCrn.
   * The CRN of the CLO Data Hub.
   **/
  public void setDatahubCrn(String datahubCrn) {
    this.datahubCrn = datahubCrn;
  }

  /**
   * Getter for scope.
   * Health check scope. The supported values are \&quot;Full\&quot; and \&quot;Partial\&quot;. The \&quot;Full\&quot; performs a deep health check along with livy session creation. The \&quot;Partial\&quot; performs a shallow health check which doesn&#39;t involve session creation.
   **/
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }

  /**
   * Setter for scope.
   * Health check scope. The supported values are \&quot;Full\&quot; and \&quot;Partial\&quot;. The \&quot;Full\&quot; performs a deep health check along with livy session creation. The \&quot;Partial\&quot; performs a shallow health check which doesn&#39;t involve session creation.
   **/
  public void setScope(String scope) {
    this.scope = scope;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetHealthRequest getHealthRequest = (GetHealthRequest) o;
    if (!Objects.equals(this.datahubCrn, getHealthRequest.datahubCrn)) {
      return false;
    }
    if (!Objects.equals(this.scope, getHealthRequest.scope)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datahubCrn, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetHealthRequest {\n");
    sb.append("    datahubCrn: ").append(toIndentedString(datahubCrn)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

