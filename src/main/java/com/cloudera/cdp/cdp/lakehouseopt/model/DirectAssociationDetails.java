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
import com.cloudera.cdp.lakehouseopt.model.TablePolicyAssociation;
import java.util.*;

/**
 * Describes direct table to policy association details per namespace.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-05-01T09:59:31.533-07:00")
public class DirectAssociationDetails  {

  /**
   * The namespace.
   **/
  private String namespace = null;

  /**
   * The namespace status.
   **/
  private String status = "UNAVAILABLE";

  /**
   * The table to policy associations for a namespace
   **/
  private List<TablePolicyAssociation> tables = new ArrayList<TablePolicyAssociation>();

  /**
   * Getter for namespace.
   * The namespace.
   **/
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }

  /**
   * Setter for namespace.
   * The namespace.
   **/
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * Getter for status.
   * The namespace status.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The namespace status.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for tables.
   * The table to policy associations for a namespace
   **/
  @JsonProperty("tables")
  public List<TablePolicyAssociation> getTables() {
    return tables;
  }

  /**
   * Setter for tables.
   * The table to policy associations for a namespace
   **/
  public void setTables(List<TablePolicyAssociation> tables) {
    this.tables = tables;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectAssociationDetails directAssociationDetails = (DirectAssociationDetails) o;
    if (!Objects.equals(this.namespace, directAssociationDetails.namespace)) {
      return false;
    }
    if (!Objects.equals(this.status, directAssociationDetails.status)) {
      return false;
    }
    if (!Objects.equals(this.tables, directAssociationDetails.tables)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, status, tables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectAssociationDetails {\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
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

