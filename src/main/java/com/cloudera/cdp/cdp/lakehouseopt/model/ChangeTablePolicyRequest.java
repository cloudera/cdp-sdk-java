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
 * Request object to perform policy change.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-05-01T09:59:31.533-07:00")
public class ChangeTablePolicyRequest  {

  /**
   * The CRN of the CLO Data Hub.
   **/
  private String datahubCrn = null;

  /**
   * The name of the namespace.
   **/
  private String namespace = null;

  /**
   * The name of the table.
   **/
  private String tableName = null;

  /**
   * The operation to be performed. APPEND will add provided policies to set of existing associated policies, REMOVEALL will delete all existing associations for this table, REPLACEALL will replace existing associations with provided set of policies.
   **/
  private String operation = "APPEND";

  /**
   * The list of policy names.
   **/
  private List<String> policies = new ArrayList<String>();

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
   * Getter for tableName.
   * The name of the table.
   **/
  @JsonProperty("tableName")
  public String getTableName() {
    return tableName;
  }

  /**
   * Setter for tableName.
   * The name of the table.
   **/
  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  /**
   * Getter for operation.
   * The operation to be performed. APPEND will add provided policies to set of existing associated policies, REMOVEALL will delete all existing associations for this table, REPLACEALL will replace existing associations with provided set of policies.
   **/
  @JsonProperty("operation")
  public String getOperation() {
    return operation;
  }

  /**
   * Setter for operation.
   * The operation to be performed. APPEND will add provided policies to set of existing associated policies, REMOVEALL will delete all existing associations for this table, REPLACEALL will replace existing associations with provided set of policies.
   **/
  public void setOperation(String operation) {
    this.operation = operation;
  }

  /**
   * Getter for policies.
   * The list of policy names.
   **/
  @JsonProperty("policies")
  public List<String> getPolicies() {
    return policies;
  }

  /**
   * Setter for policies.
   * The list of policy names.
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
    ChangeTablePolicyRequest changeTablePolicyRequest = (ChangeTablePolicyRequest) o;
    if (!Objects.equals(this.datahubCrn, changeTablePolicyRequest.datahubCrn)) {
      return false;
    }
    if (!Objects.equals(this.namespace, changeTablePolicyRequest.namespace)) {
      return false;
    }
    if (!Objects.equals(this.tableName, changeTablePolicyRequest.tableName)) {
      return false;
    }
    if (!Objects.equals(this.operation, changeTablePolicyRequest.operation)) {
      return false;
    }
    if (!Objects.equals(this.policies, changeTablePolicyRequest.policies)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datahubCrn, namespace, tableName, operation, policies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeTablePolicyRequest {\n");
    sb.append("    datahubCrn: ").append(toIndentedString(datahubCrn)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

