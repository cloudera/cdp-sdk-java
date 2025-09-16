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

/**
 * Request object when assigning a flow to a catalog collection.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-16T07:43:45.562-07:00")
public class AssignToCollectionRequest  {

  /**
   * The flow CRN.
   **/
  private String flowCrn = null;

  /**
   * The catalog collection CRN. If omitted, the flow will be assigned to the UNASSIGNED catalog collection.
   **/
  private String catalogCollectionCrn = null;

  /**
   * Getter for flowCrn.
   * The flow CRN.
   **/
  @JsonProperty("flowCrn")
  public String getFlowCrn() {
    return flowCrn;
  }

  /**
   * Setter for flowCrn.
   * The flow CRN.
   **/
  public void setFlowCrn(String flowCrn) {
    this.flowCrn = flowCrn;
  }

  /**
   * Getter for catalogCollectionCrn.
   * The catalog collection CRN. If omitted, the flow will be assigned to the UNASSIGNED catalog collection.
   **/
  @JsonProperty("catalogCollectionCrn")
  public String getCatalogCollectionCrn() {
    return catalogCollectionCrn;
  }

  /**
   * Setter for catalogCollectionCrn.
   * The catalog collection CRN. If omitted, the flow will be assigned to the UNASSIGNED catalog collection.
   **/
  public void setCatalogCollectionCrn(String catalogCollectionCrn) {
    this.catalogCollectionCrn = catalogCollectionCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignToCollectionRequest assignToCollectionRequest = (AssignToCollectionRequest) o;
    if (!Objects.equals(this.flowCrn, assignToCollectionRequest.flowCrn)) {
      return false;
    }
    if (!Objects.equals(this.catalogCollectionCrn, assignToCollectionRequest.catalogCollectionCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowCrn, catalogCollectionCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignToCollectionRequest {\n");
    sb.append("    flowCrn: ").append(toIndentedString(flowCrn)).append("\n");
    sb.append("    catalogCollectionCrn: ").append(toIndentedString(catalogCollectionCrn)).append("\n");
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

