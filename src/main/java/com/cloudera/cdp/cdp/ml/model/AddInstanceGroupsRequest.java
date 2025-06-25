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
import com.cloudera.cdp.ml.model.InstanceGroup;
import java.util.*;

/**
 * Request object for AddInstanceGroups.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-06-24T14:06:21.852-07:00")
public class AddInstanceGroupsRequest  {

  /**
   * The CRN of the workbench to which the instance groups are to be added.
   **/
  private String workspaceCrn = null;

  /**
   * The instance groups that we want to add to the workbench.
   **/
  private List<InstanceGroup> instanceGroups = new ArrayList<InstanceGroup>();

  /**
   * Getter for workspaceCrn.
   * The CRN of the workbench to which the instance groups are to be added.
   **/
  @JsonProperty("workspaceCrn")
  public String getWorkspaceCrn() {
    return workspaceCrn;
  }

  /**
   * Setter for workspaceCrn.
   * The CRN of the workbench to which the instance groups are to be added.
   **/
  public void setWorkspaceCrn(String workspaceCrn) {
    this.workspaceCrn = workspaceCrn;
  }

  /**
   * Getter for instanceGroups.
   * The instance groups that we want to add to the workbench.
   **/
  @JsonProperty("instanceGroups")
  public List<InstanceGroup> getInstanceGroups() {
    return instanceGroups;
  }

  /**
   * Setter for instanceGroups.
   * The instance groups that we want to add to the workbench.
   **/
  public void setInstanceGroups(List<InstanceGroup> instanceGroups) {
    this.instanceGroups = instanceGroups;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddInstanceGroupsRequest addInstanceGroupsRequest = (AddInstanceGroupsRequest) o;
    if (!Objects.equals(this.workspaceCrn, addInstanceGroupsRequest.workspaceCrn)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroups, addInstanceGroupsRequest.instanceGroups)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceCrn, instanceGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddInstanceGroupsRequest {\n");
    sb.append("    workspaceCrn: ").append(toIndentedString(workspaceCrn)).append("\n");
    sb.append("    instanceGroups: ").append(toIndentedString(instanceGroups)).append("\n");
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

