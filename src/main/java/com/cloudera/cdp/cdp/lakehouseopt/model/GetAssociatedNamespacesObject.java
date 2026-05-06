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
 * Describes association for a namespace.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-05-01T09:59:31.533-07:00")
public class GetAssociatedNamespacesObject  {

  /**
   * The namespace.
   **/
  private String namespace = null;

  /**
   * The flag to indicate if the namespace is associated with the policy. TRUE if associated else FALSE.
   **/
  private Boolean isAssociated = null;

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
   * Getter for isAssociated.
   * The flag to indicate if the namespace is associated with the policy. TRUE if associated else FALSE.
   **/
  @JsonProperty("isAssociated")
  public Boolean getIsAssociated() {
    return isAssociated;
  }

  /**
   * Setter for isAssociated.
   * The flag to indicate if the namespace is associated with the policy. TRUE if associated else FALSE.
   **/
  public void setIsAssociated(Boolean isAssociated) {
    this.isAssociated = isAssociated;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAssociatedNamespacesObject getAssociatedNamespacesObject = (GetAssociatedNamespacesObject) o;
    if (!Objects.equals(this.namespace, getAssociatedNamespacesObject.namespace)) {
      return false;
    }
    if (!Objects.equals(this.isAssociated, getAssociatedNamespacesObject.isAssociated)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, isAssociated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAssociatedNamespacesObject {\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    isAssociated: ").append(toIndentedString(isAssociated)).append("\n");
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

