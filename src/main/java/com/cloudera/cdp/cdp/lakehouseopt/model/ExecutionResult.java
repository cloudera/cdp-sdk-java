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
 * The execution result metadata.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-05-27T09:29:05.230-07:00")
public class ExecutionResult  {

  /**
   * The unique identifier for the maintenance task in UUID format.
   **/
  private String taskId = null;

  /**
   * The detailed output of the execution task metadata in a base64 encoded string.
   **/
  private byte[] details = null;

  /**
   * Getter for taskId.
   * The unique identifier for the maintenance task in UUID format.
   **/
  @JsonProperty("taskId")
  public String getTaskId() {
    return taskId;
  }

  /**
   * Setter for taskId.
   * The unique identifier for the maintenance task in UUID format.
   **/
  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  /**
   * Getter for details.
   * The detailed output of the execution task metadata in a base64 encoded string.
   **/
  @JsonProperty("details")
  public byte[] getDetails() {
    return Arrays.copyOf(details, details.length);
  }

  /**
   * Setter for details.
   * The detailed output of the execution task metadata in a base64 encoded string.
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
    ExecutionResult executionResult = (ExecutionResult) o;
    if (!Objects.equals(this.taskId, executionResult.taskId)) {
      return false;
    }
    if (!Objects.deepEquals(this.details, executionResult.details)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskId, Arrays.hashCode(details));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutionResult {\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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

