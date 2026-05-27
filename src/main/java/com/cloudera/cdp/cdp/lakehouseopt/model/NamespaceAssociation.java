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
import com.cloudera.cdp.lakehouseopt.model.TableAssociation;
import java.util.*;

/**
 * The table associations per namespace.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-05-27T09:29:05.230-07:00")
public class NamespaceAssociation  {

  /**
   * The name of the namespace.
   **/
  private String namespace = null;

  /**
   * The namespace status. Possible values are ERROR, SUCCESS, PAUSED, AUTO_PAUSED, USER_PAUSED, UNAVAILABLE and WARNING. PAUSED indicated that namespace is paused for maintenance actions, AUTO_PAUSED indicates namespace is paused automatically due to errors, USER_PAUSED indicates paused by user, ERROR indicates that recent task has failed or a table is in paused state due to exceptions, WARNING if a table is paused by user, SUCCESS if there are no recent task failures or paused tables, UNAVAILABLE if no tasks have run yet.
   **/
  private String status = "UNAVAILABLE";

  /**
   * The list of associated tables and their details for a namespace.
   **/
  private List<TableAssociation> tableAssociations = new ArrayList<TableAssociation>();

  /**
   * Getter for namespace.
   * The name of the namespace.
   **/
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }

  /**
   * Setter for namespace.
   * The name of the namespace.
   **/
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * Getter for status.
   * The namespace status. Possible values are ERROR, SUCCESS, PAUSED, AUTO_PAUSED, USER_PAUSED, UNAVAILABLE and WARNING. PAUSED indicated that namespace is paused for maintenance actions, AUTO_PAUSED indicates namespace is paused automatically due to errors, USER_PAUSED indicates paused by user, ERROR indicates that recent task has failed or a table is in paused state due to exceptions, WARNING if a table is paused by user, SUCCESS if there are no recent task failures or paused tables, UNAVAILABLE if no tasks have run yet.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The namespace status. Possible values are ERROR, SUCCESS, PAUSED, AUTO_PAUSED, USER_PAUSED, UNAVAILABLE and WARNING. PAUSED indicated that namespace is paused for maintenance actions, AUTO_PAUSED indicates namespace is paused automatically due to errors, USER_PAUSED indicates paused by user, ERROR indicates that recent task has failed or a table is in paused state due to exceptions, WARNING if a table is paused by user, SUCCESS if there are no recent task failures or paused tables, UNAVAILABLE if no tasks have run yet.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for tableAssociations.
   * The list of associated tables and their details for a namespace.
   **/
  @JsonProperty("tableAssociations")
  public List<TableAssociation> getTableAssociations() {
    return tableAssociations;
  }

  /**
   * Setter for tableAssociations.
   * The list of associated tables and their details for a namespace.
   **/
  public void setTableAssociations(List<TableAssociation> tableAssociations) {
    this.tableAssociations = tableAssociations;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamespaceAssociation namespaceAssociation = (NamespaceAssociation) o;
    if (!Objects.equals(this.namespace, namespaceAssociation.namespace)) {
      return false;
    }
    if (!Objects.equals(this.status, namespaceAssociation.status)) {
      return false;
    }
    if (!Objects.equals(this.tableAssociations, namespaceAssociation.tableAssociations)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, status, tableAssociations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamespaceAssociation {\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tableAssociations: ").append(toIndentedString(tableAssociations)).append("\n");
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

