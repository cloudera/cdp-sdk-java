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
import com.cloudera.cdp.lakehouseopt.model.TaskAction;
import java.util.*;

/**
 * The maintenance task that ran on a table.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-05-27T09:29:05.230-07:00")
public class Task  {

  /**
   * The list of actions that ran with a policy on a table.
   **/
  private List<TaskAction> actions = new ArrayList<TaskAction>();

  /**
   * Policy name.
   **/
  private String policyName = null;

  /**
   * Table name.
   **/
  private String tableName = null;

  /**
   * The recent policy execution epoch time in milliseconds.
   **/
  private Long lastExecutionTime = null;

  /**
   * Getter for actions.
   * The list of actions that ran with a policy on a table.
   **/
  @JsonProperty("actions")
  public List<TaskAction> getActions() {
    return actions;
  }

  /**
   * Setter for actions.
   * The list of actions that ran with a policy on a table.
   **/
  public void setActions(List<TaskAction> actions) {
    this.actions = actions;
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
   * Getter for lastExecutionTime.
   * The recent policy execution epoch time in milliseconds.
   **/
  @JsonProperty("lastExecutionTime")
  public Long getLastExecutionTime() {
    return lastExecutionTime;
  }

  /**
   * Setter for lastExecutionTime.
   * The recent policy execution epoch time in milliseconds.
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
    Task task = (Task) o;
    if (!Objects.equals(this.actions, task.actions)) {
      return false;
    }
    if (!Objects.equals(this.policyName, task.policyName)) {
      return false;
    }
    if (!Objects.equals(this.tableName, task.tableName)) {
      return false;
    }
    if (!Objects.equals(this.lastExecutionTime, task.lastExecutionTime)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, policyName, tableName, lastExecutionTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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

