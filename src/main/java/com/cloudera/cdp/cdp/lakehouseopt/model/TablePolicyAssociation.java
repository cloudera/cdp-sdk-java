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
 * Describes table to policy associations.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:58.300Z")
public class TablePolicyAssociation  {

  /**
   * The table name.
   **/
  private String tableName = null;

  /**
   * The list of associated policies for the table.
   **/
  private List<String> policies = new ArrayList<String>();

  /**
   * The last executed maintenance task in epoch milliseconds.
   **/
  private Long lastExecutionEpoch = null;

  /**
   * The table status.
   **/
  private String status = "UNAVAILABLE";

  /**
   * Getter for tableName.
   * The table name.
   **/
  @JsonProperty("tableName")
  public String getTableName() {
    return tableName;
  }

  /**
   * Setter for tableName.
   * The table name.
   **/
  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  /**
   * Getter for policies.
   * The list of associated policies for the table.
   **/
  @JsonProperty("policies")
  public List<String> getPolicies() {
    return policies;
  }

  /**
   * Setter for policies.
   * The list of associated policies for the table.
   **/
  public void setPolicies(List<String> policies) {
    this.policies = policies;
  }

  /**
   * Getter for lastExecutionEpoch.
   * The last executed maintenance task in epoch milliseconds.
   **/
  @JsonProperty("lastExecutionEpoch")
  public Long getLastExecutionEpoch() {
    return lastExecutionEpoch;
  }

  /**
   * Setter for lastExecutionEpoch.
   * The last executed maintenance task in epoch milliseconds.
   **/
  public void setLastExecutionEpoch(Long lastExecutionEpoch) {
    this.lastExecutionEpoch = lastExecutionEpoch;
  }

  /**
   * Getter for status.
   * The table status.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The table status.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TablePolicyAssociation tablePolicyAssociation = (TablePolicyAssociation) o;
    if (!Objects.equals(this.tableName, tablePolicyAssociation.tableName)) {
      return false;
    }
    if (!Objects.equals(this.policies, tablePolicyAssociation.policies)) {
      return false;
    }
    if (!Objects.equals(this.lastExecutionEpoch, tablePolicyAssociation.lastExecutionEpoch)) {
      return false;
    }
    if (!Objects.equals(this.status, tablePolicyAssociation.status)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableName, policies, lastExecutionEpoch, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TablePolicyAssociation {\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    lastExecutionEpoch: ").append(toIndentedString(lastExecutionEpoch)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

