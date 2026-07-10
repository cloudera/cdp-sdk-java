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
 * Request object to get list of tables for a particular namespace.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:58.300Z")
public class ListTablesRequest  {

  /**
   * The CRN of the CLO Data Hub.
   **/
  private String datahubCrn = null;

  /**
   * The namespace name for which table and it's policies will be listed.
   **/
  private String namespace = null;

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
   * Getter for namespace.
   * The namespace name for which table and it&#39;s policies will be listed.
   **/
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }

  /**
   * Setter for namespace.
   * The namespace name for which table and it&#39;s policies will be listed.
   **/
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTablesRequest listTablesRequest = (ListTablesRequest) o;
    if (!Objects.equals(this.datahubCrn, listTablesRequest.datahubCrn)) {
      return false;
    }
    if (!Objects.equals(this.namespace, listTablesRequest.namespace)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datahubCrn, namespace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTablesRequest {\n");
    sb.append("    datahubCrn: ").append(toIndentedString(datahubCrn)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

