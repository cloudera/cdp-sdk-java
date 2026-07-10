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
 * The object containing information about a table to policy association.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:58.300Z")
public class TableAssociation  {

  /**
   * The table name.
   **/
  private String name = null;

  /**
   * The namespace name.
   **/
  private String namespace = null;

  /**
   * The count of CLO tasks ran for the table.
   **/
  private Integer taskCount = null;

  /**
   * The time in epoch milliseconds of recent CLO task that ran for the table.
   **/
  private Long lastExecutionTime = null;

  /**
   * The policy version applicable to this table.
   **/
  private String version = null;

  /**
   * The table status.
   **/
  private String status = null;

  /**
   * Getter for name.
   * The table name.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The table name.
   **/
  public void setName(String name) {
    this.name = name;
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
   * Getter for taskCount.
   * The count of CLO tasks ran for the table.
   **/
  @JsonProperty("taskCount")
  public Integer getTaskCount() {
    return taskCount;
  }

  /**
   * Setter for taskCount.
   * The count of CLO tasks ran for the table.
   **/
  public void setTaskCount(Integer taskCount) {
    this.taskCount = taskCount;
  }

  /**
   * Getter for lastExecutionTime.
   * The time in epoch milliseconds of recent CLO task that ran for the table.
   **/
  @JsonProperty("lastExecutionTime")
  public Long getLastExecutionTime() {
    return lastExecutionTime;
  }

  /**
   * Setter for lastExecutionTime.
   * The time in epoch milliseconds of recent CLO task that ran for the table.
   **/
  public void setLastExecutionTime(Long lastExecutionTime) {
    this.lastExecutionTime = lastExecutionTime;
  }

  /**
   * Getter for version.
   * The policy version applicable to this table.
   **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  /**
   * Setter for version.
   * The policy version applicable to this table.
   **/
  public void setVersion(String version) {
    this.version = version;
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
    TableAssociation tableAssociation = (TableAssociation) o;
    if (!Objects.equals(this.name, tableAssociation.name)) {
      return false;
    }
    if (!Objects.equals(this.namespace, tableAssociation.namespace)) {
      return false;
    }
    if (!Objects.equals(this.taskCount, tableAssociation.taskCount)) {
      return false;
    }
    if (!Objects.equals(this.lastExecutionTime, tableAssociation.lastExecutionTime)) {
      return false;
    }
    if (!Objects.equals(this.version, tableAssociation.version)) {
      return false;
    }
    if (!Objects.equals(this.status, tableAssociation.status)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace, taskCount, lastExecutionTime, version, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableAssociation {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    taskCount: ").append(toIndentedString(taskCount)).append("\n");
    sb.append("    lastExecutionTime: ").append(toIndentedString(lastExecutionTime)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

