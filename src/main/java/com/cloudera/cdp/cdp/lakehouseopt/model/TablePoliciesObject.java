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
 * The table object containing details of policy association.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-05T07:54:46.717-07:00")
public class TablePoliciesObject  {

  /**
   * The status of the policy on this table.
   **/
  private String status = null;

  /**
   * The name of the policy.
   **/
  private String policyName = null;

  /**
   * The number of tasks ran for this policies on this table.
   **/
  private Integer taskCount = null;

  /**
   * The last task execution time in epoch milliseconds.
   **/
  private Long lastExecutionTime = null;

  /**
   * Getter for status.
   * The status of the policy on this table.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The status of the policy on this table.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for policyName.
   * The name of the policy.
   **/
  @JsonProperty("policyName")
  public String getPolicyName() {
    return policyName;
  }

  /**
   * Setter for policyName.
   * The name of the policy.
   **/
  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  /**
   * Getter for taskCount.
   * The number of tasks ran for this policies on this table.
   **/
  @JsonProperty("taskCount")
  public Integer getTaskCount() {
    return taskCount;
  }

  /**
   * Setter for taskCount.
   * The number of tasks ran for this policies on this table.
   **/
  public void setTaskCount(Integer taskCount) {
    this.taskCount = taskCount;
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
    TablePoliciesObject tablePoliciesObject = (TablePoliciesObject) o;
    if (!Objects.equals(this.status, tablePoliciesObject.status)) {
      return false;
    }
    if (!Objects.equals(this.policyName, tablePoliciesObject.policyName)) {
      return false;
    }
    if (!Objects.equals(this.taskCount, tablePoliciesObject.taskCount)) {
      return false;
    }
    if (!Objects.equals(this.lastExecutionTime, tablePoliciesObject.lastExecutionTime)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, policyName, taskCount, lastExecutionTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TablePoliciesObject {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    taskCount: ").append(toIndentedString(taskCount)).append("\n");
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

