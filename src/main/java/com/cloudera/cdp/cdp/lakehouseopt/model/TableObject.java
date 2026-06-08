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
 * The table object containing name, status and other details.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-05T07:54:46.717-07:00")
public class TableObject  {

  /**
   * The table status.
   **/
  private String status = null;

  /**
   * The name of the namespace.
   **/
  private String namespace = null;

  /**
   * The name of the table.
   **/
  private String tableName = null;

  /**
   * The list of associated policies.
   **/
  private List<String> policies = new ArrayList<String>();

  /**
   * The last task execution time in epoch milliseconds.
   **/
  private Long lastExecutionTime = null;

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
   * Getter for policies.
   * The list of associated policies.
   **/
  @JsonProperty("policies")
  public List<String> getPolicies() {
    return policies;
  }

  /**
   * Setter for policies.
   * The list of associated policies.
   **/
  public void setPolicies(List<String> policies) {
    this.policies = policies;
  }

  /**
   * Getter for lastExecutionTime.
   * The last task execution time in epoch milliseconds.
   **/
  @JsonProperty("lastExecutionTime")
  public Long getLastExecutionTime() {
    return lastExecutionTime;
  }

  /**
   * Setter for lastExecutionTime.
   * The last task execution time in epoch milliseconds.
   **/
  public void setLastExecutionTime(Long lastExecutionTime) {
    this.lastExecutionTime = lastExecutionTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableObject tableObject = (TableObject) o;
    if (!Objects.equals(this.status, tableObject.status)) {
      return false;
    }
    if (!Objects.equals(this.namespace, tableObject.namespace)) {
      return false;
    }
    if (!Objects.equals(this.tableName, tableObject.tableName)) {
      return false;
    }
    if (!Objects.equals(this.policies, tableObject.policies)) {
      return false;
    }
    if (!Objects.equals(this.lastExecutionTime, tableObject.lastExecutionTime)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, namespace, tableName, policies, lastExecutionTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableObject {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    lastExecutionTime: ").append(toIndentedString(lastExecutionTime)).append("\n");
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

