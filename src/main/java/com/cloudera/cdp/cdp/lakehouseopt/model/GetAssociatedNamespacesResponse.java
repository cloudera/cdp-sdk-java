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
import com.cloudera.cdp.lakehouseopt.model.GetAssociatedNamespacesObject;
import java.util.*;

/**
 * Response object containing all namespaces and a flag to indicate if it&#39;s associated with the particular namespace.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-05-01T09:59:31.533-07:00")
public class GetAssociatedNamespacesResponse extends CdpResponse {

  /**
   * The namespaces.
   **/
  private List<GetAssociatedNamespacesObject> associatedNamespaces = new ArrayList<GetAssociatedNamespacesObject>();

  /**
   * Getter for associatedNamespaces.
   * The namespaces.
   **/
  @JsonProperty("associatedNamespaces")
  public List<GetAssociatedNamespacesObject> getAssociatedNamespaces() {
    return associatedNamespaces;
  }

  /**
   * Setter for associatedNamespaces.
   * The namespaces.
   **/
  public void setAssociatedNamespaces(List<GetAssociatedNamespacesObject> associatedNamespaces) {
    this.associatedNamespaces = associatedNamespaces;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAssociatedNamespacesResponse getAssociatedNamespacesResponse = (GetAssociatedNamespacesResponse) o;
    if (!Objects.equals(this.associatedNamespaces, getAssociatedNamespacesResponse.associatedNamespaces)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedNamespaces, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAssociatedNamespacesResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    associatedNamespaces: ").append(toIndentedString(associatedNamespaces)).append("\n");
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

