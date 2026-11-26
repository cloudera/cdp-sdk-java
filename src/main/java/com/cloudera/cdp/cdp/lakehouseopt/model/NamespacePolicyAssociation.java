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
import java.util.*;

/**
 * Describes policy to namespace associations.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-11-25T15:42:54.450Z")
public class NamespacePolicyAssociation  {

  /**
   * The namespace.
   **/
  private String namespace = null;

  /**
   * The namespace status. Possible values are ERROR, SUCCESS, AUTO_PAUSED, USER_PAUSED, PAUSED, WARNING and UNAVAILABLE. ERROR indicates that a recent task has failed or a table is paused due to exceptions, SUCCESS indicates that there are no recent task failures or paused tables, AUTO_PAUSED indicates that the namespace is paused automatically due to errors, USER_PAUSED indicates that the namespace is paused by a user, PAUSED indicates that the namespace is paused for maintenance actions, WARNING indicates that a table is paused by a user, UNAVAILABLE indicates that no tasks have run yet.
   **/
  private String status = "UNAVAILABLE";

  /**
   * The list of associated policies for the namespace.
   **/
  private List<String> policies = new ArrayList<String>();

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
   * The namespace status. Possible values are ERROR, SUCCESS, AUTO_PAUSED, USER_PAUSED, PAUSED, WARNING and UNAVAILABLE. ERROR indicates that a recent task has failed or a table is paused due to exceptions, SUCCESS indicates that there are no recent task failures or paused tables, AUTO_PAUSED indicates that the namespace is paused automatically due to errors, USER_PAUSED indicates that the namespace is paused by a user, PAUSED indicates that the namespace is paused for maintenance actions, WARNING indicates that a table is paused by a user, UNAVAILABLE indicates that no tasks have run yet.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The namespace status. Possible values are ERROR, SUCCESS, AUTO_PAUSED, USER_PAUSED, PAUSED, WARNING and UNAVAILABLE. ERROR indicates that a recent task has failed or a table is paused due to exceptions, SUCCESS indicates that there are no recent task failures or paused tables, AUTO_PAUSED indicates that the namespace is paused automatically due to errors, USER_PAUSED indicates that the namespace is paused by a user, PAUSED indicates that the namespace is paused for maintenance actions, WARNING indicates that a table is paused by a user, UNAVAILABLE indicates that no tasks have run yet.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for policies.
   * The list of associated policies for the namespace.
   **/
  @JsonProperty("policies")
  public List<String> getPolicies() {
    return policies;
  }

  /**
   * Setter for policies.
   * The list of associated policies for the namespace.
   **/
  public void setPolicies(List<String> policies) {
    this.policies = policies;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamespacePolicyAssociation namespacePolicyAssociation = (NamespacePolicyAssociation) o;
    if (!Objects.equals(this.namespace, namespacePolicyAssociation.namespace)) {
      return false;
    }
    if (!Objects.equals(this.status, namespacePolicyAssociation.status)) {
      return false;
    }
    if (!Objects.equals(this.policies, namespacePolicyAssociation.policies)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, status, policies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamespacePolicyAssociation {\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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

