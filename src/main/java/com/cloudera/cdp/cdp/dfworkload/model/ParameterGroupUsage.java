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

package com.cloudera.cdp.dfworkload.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Represents a resource that uses a parameter group.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-05-27T09:29:04.223-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class ParameterGroupUsage  {

  /**
   * The ID of the resource that uses the parameter group.
   **/
  private String resourceId = null;

  /**
   * The type of the resource that uses the parameter group.
   **/
  private String resourceType = null;

  /**
   * The parent-resource ID (e.g., deploymentId when resourceType is DEPLOYED_FLOW).
   **/
  private String parentResourceId = null;

  /**
   * The name of the resource that uses the parameter group.
   **/
  private String resourceName = null;

  /**
   * The synchronization status between the parameter group and the resource.
   **/
  private String status = null;

  /**
   * Getter for resourceId.
   * The ID of the resource that uses the parameter group.
   **/
  @JsonProperty("resourceId")
  public String getResourceId() {
    return resourceId;
  }

  /**
   * Setter for resourceId.
   * The ID of the resource that uses the parameter group.
   **/
  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  /**
   * Getter for resourceType.
   * The type of the resource that uses the parameter group.
   **/
  @JsonProperty("resourceType")
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Setter for resourceType.
   * The type of the resource that uses the parameter group.
   **/
  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  /**
   * Getter for parentResourceId.
   * The parent-resource ID (e.g., deploymentId when resourceType is DEPLOYED_FLOW).
   **/
  @JsonProperty("parentResourceId")
  public String getParentResourceId() {
    return parentResourceId;
  }

  /**
   * Setter for parentResourceId.
   * The parent-resource ID (e.g., deploymentId when resourceType is DEPLOYED_FLOW).
   **/
  public void setParentResourceId(String parentResourceId) {
    this.parentResourceId = parentResourceId;
  }

  /**
   * Getter for resourceName.
   * The name of the resource that uses the parameter group.
   **/
  @JsonProperty("resourceName")
  public String getResourceName() {
    return resourceName;
  }

  /**
   * Setter for resourceName.
   * The name of the resource that uses the parameter group.
   **/
  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  /**
   * Getter for status.
   * The synchronization status between the parameter group and the resource.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The synchronization status between the parameter group and the resource.
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
    ParameterGroupUsage parameterGroupUsage = (ParameterGroupUsage) o;
    if (!Objects.equals(this.resourceId, parameterGroupUsage.resourceId)) {
      return false;
    }
    if (!Objects.equals(this.resourceType, parameterGroupUsage.resourceType)) {
      return false;
    }
    if (!Objects.equals(this.parentResourceId, parameterGroupUsage.parentResourceId)) {
      return false;
    }
    if (!Objects.equals(this.resourceName, parameterGroupUsage.resourceName)) {
      return false;
    }
    if (!Objects.equals(this.status, parameterGroupUsage.status)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, resourceType, parentResourceId, resourceName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterGroupUsage {\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    parentResourceId: ").append(toIndentedString(parentResourceId)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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

