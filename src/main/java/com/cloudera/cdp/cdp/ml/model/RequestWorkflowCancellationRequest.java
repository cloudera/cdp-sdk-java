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
 * Request object for RequestWorkflowCancellation.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-05-04T19:25:14.468-07:00")
public class RequestWorkflowCancellationRequest  {

  /**
   * The unique identifier of the resource.
   **/
  private String resourceId = null;

  /**
   * The workflow type.
   **/
  private String workflowType = null;

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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestWorkflowCancellationRequest requestWorkflowCancellationRequest = (RequestWorkflowCancellationRequest) o;
    if (!Objects.equals(this.resourceId, requestWorkflowCancellationRequest.resourceId)) {
      return false;
    }
    if (!Objects.equals(this.workflowType, requestWorkflowCancellationRequest.workflowType)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, workflowType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestWorkflowCancellationRequest {\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    workflowType: ").append(toIndentedString(workflowType)).append("\n");
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

