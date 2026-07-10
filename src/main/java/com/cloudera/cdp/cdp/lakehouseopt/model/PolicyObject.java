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
 * The policy object containing name, status and other details.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:58.300Z")
public class PolicyObject  {

  /**
   * The policy status.
   **/
  private String status = null;

  /**
   * The policy name.
   **/
  private String policyName = null;

  /**
   * The number of tasks ran for this policy.
   **/
  private Integer taskCount = null;

  /**
   * The number of tables associated with this policy.
   **/
  private Integer tableCount = null;

  /**
   * The policy creation time in epoch milliseconds.
   **/
  private Long creationTime = null;

  /**
   * The recent task execution time in epoch milliseconds.
   **/
  private Long lastExecutionTime = null;

  /**
   * Flag to indicate if the policy is a default one provided by Cloudera. Policy is default if true else false.
   **/
  private Boolean isDefault = null;

  /**
   * Getter for status.
   * The policy status.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The policy status.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for policyName.
   * The policy name.
   **/
  @JsonProperty("policyName")
  public String getPolicyName() {
    return policyName;
  }

  /**
   * Setter for policyName.
   * The policy name.
   **/
  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  /**
   * Getter for taskCount.
   * The number of tasks ran for this policy.
   **/
  @JsonProperty("taskCount")
  public Integer getTaskCount() {
    return taskCount;
  }

  /**
   * Setter for taskCount.
   * The number of tasks ran for this policy.
   **/
  public void setTaskCount(Integer taskCount) {
    this.taskCount = taskCount;
  }

  /**
   * Getter for tableCount.
   * The number of tables associated with this policy.
   **/
  @JsonProperty("tableCount")
  public Integer getTableCount() {
    return tableCount;
  }

  /**
   * Setter for tableCount.
   * The number of tables associated with this policy.
   **/
  public void setTableCount(Integer tableCount) {
    this.tableCount = tableCount;
  }

  /**
   * Getter for creationTime.
   * The policy creation time in epoch milliseconds.
   **/
  @JsonProperty("creationTime")
  public Long getCreationTime() {
    return creationTime;
  }

  /**
   * Setter for creationTime.
   * The policy creation time in epoch milliseconds.
   **/
  public void setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
  }

  /**
   * Getter for lastExecutionTime.
   * The recent task execution time in epoch milliseconds.
   **/
  @JsonProperty("lastExecutionTime")
  public Long getLastExecutionTime() {
    return lastExecutionTime;
  }

  /**
   * Setter for lastExecutionTime.
   * The recent task execution time in epoch milliseconds.
   **/
  public void setLastExecutionTime(Long lastExecutionTime) {
    this.lastExecutionTime = lastExecutionTime;
  }

  /**
   * Getter for isDefault.
   * Flag to indicate if the policy is a default one provided by Cloudera. Policy is default if true else false.
   **/
  @JsonProperty("isDefault")
  public Boolean getIsDefault() {
    return isDefault;
  }

  /**
   * Setter for isDefault.
   * Flag to indicate if the policy is a default one provided by Cloudera. Policy is default if true else false.
   **/
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyObject policyObject = (PolicyObject) o;
    if (!Objects.equals(this.status, policyObject.status)) {
      return false;
    }
    if (!Objects.equals(this.policyName, policyObject.policyName)) {
      return false;
    }
    if (!Objects.equals(this.taskCount, policyObject.taskCount)) {
      return false;
    }
    if (!Objects.equals(this.tableCount, policyObject.tableCount)) {
      return false;
    }
    if (!Objects.equals(this.creationTime, policyObject.creationTime)) {
      return false;
    }
    if (!Objects.equals(this.lastExecutionTime, policyObject.lastExecutionTime)) {
      return false;
    }
    if (!Objects.equals(this.isDefault, policyObject.isDefault)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, policyName, taskCount, tableCount, creationTime, lastExecutionTime, isDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyObject {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    taskCount: ").append(toIndentedString(taskCount)).append("\n");
    sb.append("    tableCount: ").append(toIndentedString(tableCount)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    lastExecutionTime: ").append(toIndentedString(lastExecutionTime)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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

