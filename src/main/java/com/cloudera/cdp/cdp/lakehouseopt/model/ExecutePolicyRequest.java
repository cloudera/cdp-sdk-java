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
 * Request object for executing a policy on a table.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:58.300Z")
public class ExecutePolicyRequest  {

  /**
   * The CRN of the Cloudera Lakehouse Optimizer Data Hub.
   **/
  private String datahubCrn = null;

  /**
   * Namespace name.
   **/
  private String namespace = null;

  /**
   * Table name.
   **/
  private String tableName = null;

  /**
   * Policy name.
   **/
  private String policyName = null;

  /**
   * Flag to indicate if the execution is a dry run. If true, it will perform a dry run else actual execution.
   **/
  private Boolean dryRun = true;

  /**
   * Getter for datahubCrn.
   * The CRN of the Cloudera Lakehouse Optimizer Data Hub.
   **/
  @JsonProperty("datahubCrn")
  public String getDatahubCrn() {
    return datahubCrn;
  }

  /**
   * Setter for datahubCrn.
   * The CRN of the Cloudera Lakehouse Optimizer Data Hub.
   **/
  public void setDatahubCrn(String datahubCrn) {
    this.datahubCrn = datahubCrn;
  }

  /**
   * Getter for namespace.
   * Namespace name.
   **/
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }

  /**
   * Setter for namespace.
   * Namespace name.
   **/
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * Getter for tableName.
   * Table name.
   **/
  @JsonProperty("tableName")
  public String getTableName() {
    return tableName;
  }

  /**
   * Setter for tableName.
   * Table name.
   **/
  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  /**
   * Getter for policyName.
   * Policy name.
   **/
  @JsonProperty("policyName")
  public String getPolicyName() {
    return policyName;
  }

  /**
   * Setter for policyName.
   * Policy name.
   **/
  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  /**
   * Getter for dryRun.
   * Flag to indicate if the execution is a dry run. If true, it will perform a dry run else actual execution.
   **/
  @JsonProperty("dryRun")
  public Boolean getDryRun() {
    return dryRun;
  }

  /**
   * Setter for dryRun.
   * Flag to indicate if the execution is a dry run. If true, it will perform a dry run else actual execution.
   **/
  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutePolicyRequest executePolicyRequest = (ExecutePolicyRequest) o;
    if (!Objects.equals(this.datahubCrn, executePolicyRequest.datahubCrn)) {
      return false;
    }
    if (!Objects.equals(this.namespace, executePolicyRequest.namespace)) {
      return false;
    }
    if (!Objects.equals(this.tableName, executePolicyRequest.tableName)) {
      return false;
    }
    if (!Objects.equals(this.policyName, executePolicyRequest.policyName)) {
      return false;
    }
    if (!Objects.equals(this.dryRun, executePolicyRequest.dryRun)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datahubCrn, namespace, tableName, policyName, dryRun);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutePolicyRequest {\n");
    sb.append("    datahubCrn: ").append(toIndentedString(datahubCrn)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
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

