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
 * Request object for the DeleteInstanceGroup method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-01-05T09:16:30.380-08:00")
public class DeleteInstanceGroupRequest  {

  /**
   * The CRN of the workspace from which instance group is to be deleted.
   **/
  private String workspaceCrn = null;

  /**
   * The instance group that we want to delete from the workspace.
   **/
  private String instanceGroupName = null;

  /**
   * Getter for workspaceCrn.
   * The CRN of the workspace from which instance group is to be deleted.
   **/
  @JsonProperty("workspaceCrn")
  public String getWorkspaceCrn() {
    return workspaceCrn;
  }

  /**
   * Setter for workspaceCrn.
   * The CRN of the workspace from which instance group is to be deleted.
   **/
  public void setWorkspaceCrn(String workspaceCrn) {
    this.workspaceCrn = workspaceCrn;
  }

  /**
   * Getter for instanceGroupName.
   * The instance group that we want to delete from the workspace.
   **/
  @JsonProperty("instanceGroupName")
  public String getInstanceGroupName() {
    return instanceGroupName;
  }

  /**
   * Setter for instanceGroupName.
   * The instance group that we want to delete from the workspace.
   **/
  public void setInstanceGroupName(String instanceGroupName) {
    this.instanceGroupName = instanceGroupName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteInstanceGroupRequest deleteInstanceGroupRequest = (DeleteInstanceGroupRequest) o;
    if (!Objects.equals(this.workspaceCrn, deleteInstanceGroupRequest.workspaceCrn)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroupName, deleteInstanceGroupRequest.instanceGroupName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceCrn, instanceGroupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteInstanceGroupRequest {\n");
    sb.append("    workspaceCrn: ").append(toIndentedString(workspaceCrn)).append("\n");
    sb.append("    instanceGroupName: ").append(toIndentedString(instanceGroupName)).append("\n");
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

