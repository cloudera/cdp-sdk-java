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
import java.util.Arrays;

/**
 * Task metadata for a policy on a table.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:58.300Z")
public class TaskObject  {

  /**
   * The task status. It can be INIT, SUBMITTED, COMPLETED, FAILED. Initially the task status would be INIT and transition to SUBMITTED after submitting to spark. Based on the spark execution it changed to COMPLETED, FAILED.
   **/
  private String status = "INIT";

  /**
   * Unique identified for task in UUID format.
   **/
  private String taskId = null;

  /**
   * The policy name.
   **/
  private String policy = null;

  /**
   * The catalog name.
   **/
  private String catalog = null;

  /**
   * The namespace name.
   **/
  private String namespace = null;

  /**
   * The table name.
   **/
  private String table = null;

  /**
   * The task creation time in epoch milliseconds.
   **/
  private Long createdAt = null;

  /**
   * A base64 encoded version of task details json.
   **/
  private byte[] details = null;

  /**
   * Getter for status.
   * The task status. It can be INIT, SUBMITTED, COMPLETED, FAILED. Initially the task status would be INIT and transition to SUBMITTED after submitting to spark. Based on the spark execution it changed to COMPLETED, FAILED.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The task status. It can be INIT, SUBMITTED, COMPLETED, FAILED. Initially the task status would be INIT and transition to SUBMITTED after submitting to spark. Based on the spark execution it changed to COMPLETED, FAILED.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for taskId.
   * Unique identified for task in UUID format.
   **/
  @JsonProperty("taskId")
  public String getTaskId() {
    return taskId;
  }

  /**
   * Setter for taskId.
   * Unique identified for task in UUID format.
   **/
  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  /**
   * Getter for policy.
   * The policy name.
   **/
  @JsonProperty("policy")
  public String getPolicy() {
    return policy;
  }

  /**
   * Setter for policy.
   * The policy name.
   **/
  public void setPolicy(String policy) {
    this.policy = policy;
  }

  /**
   * Getter for catalog.
   * The catalog name.
   **/
  @JsonProperty("catalog")
  public String getCatalog() {
    return catalog;
  }

  /**
   * Setter for catalog.
   * The catalog name.
   **/
  public void setCatalog(String catalog) {
    this.catalog = catalog;
  }

  /**
   * Getter for namespace.
   * The namespace name.
   **/
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }

  /**
   * Setter for namespace.
   * The namespace name.
   **/
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * Getter for table.
   * The table name.
   **/
  @JsonProperty("table")
  public String getTable() {
    return table;
  }

  /**
   * Setter for table.
   * The table name.
   **/
  public void setTable(String table) {
    this.table = table;
  }

  /**
   * Getter for createdAt.
   * The task creation time in epoch milliseconds.
   **/
  @JsonProperty("createdAt")
  public Long getCreatedAt() {
    return createdAt;
  }

  /**
   * Setter for createdAt.
   * The task creation time in epoch milliseconds.
   **/
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Getter for details.
   * A base64 encoded version of task details json.
   **/
  @JsonProperty("details")
  public byte[] getDetails() {
    return Arrays.copyOf(details, details.length);
  }

  /**
   * Setter for details.
   * A base64 encoded version of task details json.
   **/
  public void setDetails(byte[] details) {
    this.details = Arrays.copyOf(details, details.length);
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskObject taskObject = (TaskObject) o;
    if (!Objects.equals(this.status, taskObject.status)) {
      return false;
    }
    if (!Objects.equals(this.taskId, taskObject.taskId)) {
      return false;
    }
    if (!Objects.equals(this.policy, taskObject.policy)) {
      return false;
    }
    if (!Objects.equals(this.catalog, taskObject.catalog)) {
      return false;
    }
    if (!Objects.equals(this.namespace, taskObject.namespace)) {
      return false;
    }
    if (!Objects.equals(this.table, taskObject.table)) {
      return false;
    }
    if (!Objects.equals(this.createdAt, taskObject.createdAt)) {
      return false;
    }
    if (!Objects.deepEquals(this.details, taskObject.details)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, taskId, policy, catalog, namespace, table, createdAt, Arrays.hashCode(details));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskObject {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

