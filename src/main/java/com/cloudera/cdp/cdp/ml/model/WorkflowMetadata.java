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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * The workflow metadata.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-09-03T11:22:08.202-07:00")
public class WorkflowMetadata  {

  /**
   * The unique identifier of the resource.
   **/
  private String resourceId = null;

  /**
   * The workflow index. Monotonically increases for each subsequent workflow for a resource.
   **/
  private Long workflowIndex = null;

  /**
   * The workflow type.
   **/
  private String workflowType = null;

  /**
   * The workflow identifier.
   **/
  private String workflowId = null;

  /**
   * The last known status of the workflow.
   **/
  private String lastKnownStatus = null;

  /**
   * Getter for resourceId.
   * The unique identifier of the resource.
   **/
  @JsonProperty("resourceId")
  public String getResourceId() {
    return resourceId;
  }

  /**
   * Setter for resourceId.
   * The unique identifier of the resource.
   **/
  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  /**
   * Getter for workflowIndex.
   * The workflow index. Monotonically increases for each subsequent workflow for a resource.
   **/
  @JsonProperty("workflowIndex")
  public Long getWorkflowIndex() {
    return workflowIndex;
  }

  /**
   * Setter for workflowIndex.
   * The workflow index. Monotonically increases for each subsequent workflow for a resource.
   **/
  public void setWorkflowIndex(Long workflowIndex) {
    this.workflowIndex = workflowIndex;
  }

  /**
   * Getter for workflowType.
   * The workflow type.
   **/
  @JsonProperty("workflowType")
  public String getWorkflowType() {
    return workflowType;
  }

  /**
   * Setter for workflowType.
   * The workflow type.
   **/
  public void setWorkflowType(String workflowType) {
    this.workflowType = workflowType;
  }

  /**
   * Getter for workflowId.
   * The workflow identifier.
   **/
  @JsonProperty("workflowId")
  public String getWorkflowId() {
    return workflowId;
  }

  /**
   * Setter for workflowId.
   * The workflow identifier.
   **/
  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
  }

  /**
   * Getter for lastKnownStatus.
   * The last known status of the workflow.
   **/
  @JsonProperty("lastKnownStatus")
  public String getLastKnownStatus() {
    return lastKnownStatus;
  }

  /**
   * Setter for lastKnownStatus.
   * The last known status of the workflow.
   **/
  public void setLastKnownStatus(String lastKnownStatus) {
    this.lastKnownStatus = lastKnownStatus;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowMetadata workflowMetadata = (WorkflowMetadata) o;
    if (!Objects.equals(this.resourceId, workflowMetadata.resourceId)) {
      return false;
    }
    if (!Objects.equals(this.workflowIndex, workflowMetadata.workflowIndex)) {
      return false;
    }
    if (!Objects.equals(this.workflowType, workflowMetadata.workflowType)) {
      return false;
    }
    if (!Objects.equals(this.workflowId, workflowMetadata.workflowId)) {
      return false;
    }
    if (!Objects.equals(this.lastKnownStatus, workflowMetadata.lastKnownStatus)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, workflowIndex, workflowType, workflowId, lastKnownStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowMetadata {\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    workflowIndex: ").append(toIndentedString(workflowIndex)).append("\n");
    sb.append("    workflowType: ").append(toIndentedString(workflowType)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    lastKnownStatus: ").append(toIndentedString(lastKnownStatus)).append("\n");
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

