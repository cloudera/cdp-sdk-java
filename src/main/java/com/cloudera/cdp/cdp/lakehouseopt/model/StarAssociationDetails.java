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
import com.cloudera.cdp.lakehouseopt.model.NamespacePolicyAssociation;
import java.util.*;

/**
 * Describes policy to entire namespace association details per catalog.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-05T07:54:46.717-07:00")
public class StarAssociationDetails  {

  /**
   * The catalog.
   **/
  private String catalog = null;

  /**
   * The catalog status.
   **/
  private String status = "UNAVAILABLE";

  /**
   * The policy to namespace associations for a catalog.
   **/
  private List<NamespacePolicyAssociation> namespaces = new ArrayList<NamespacePolicyAssociation>();

  /**
   * Getter for catalog.
   * The catalog.
   **/
  @JsonProperty("catalog")
  public String getCatalog() {
    return catalog;
  }

  /**
   * Setter for catalog.
   * The catalog.
   **/
  public void setCatalog(String catalog) {
    this.catalog = catalog;
  }

  /**
   * Getter for status.
   * The catalog status.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The catalog status.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for namespaces.
   * The policy to namespace associations for a catalog.
   **/
  @JsonProperty("namespaces")
  public List<NamespacePolicyAssociation> getNamespaces() {
    return namespaces;
  }

  /**
   * Setter for namespaces.
   * The policy to namespace associations for a catalog.
   **/
  public void setNamespaces(List<NamespacePolicyAssociation> namespaces) {
    this.namespaces = namespaces;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarAssociationDetails starAssociationDetails = (StarAssociationDetails) o;
    if (!Objects.equals(this.catalog, starAssociationDetails.catalog)) {
      return false;
    }
    if (!Objects.equals(this.status, starAssociationDetails.status)) {
      return false;
    }
    if (!Objects.equals(this.namespaces, starAssociationDetails.namespaces)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalog, status, namespaces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarAssociationDetails {\n");
    sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
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

