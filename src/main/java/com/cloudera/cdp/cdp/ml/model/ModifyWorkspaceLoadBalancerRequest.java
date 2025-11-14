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
import java.util.*;

/**
 * Request object for ModifyWorkspaceLoadBalancer.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-14T06:50:05.724-08:00")
public class ModifyWorkspaceLoadBalancerRequest  {

  /**
   * The CRN of the workbench cluster to modify.
   **/
  private String workspaceCrn = null;

  /**
   * The allowlist of CIDR blocks which can access the loadbalancer.
   **/
  private List<String> loadBalancerIPAllowLists = new ArrayList<String>();

  /**
   * Getter for workspaceCrn.
   * The CRN of the workbench cluster to modify.
   **/
  @JsonProperty("workspaceCrn")
  public String getWorkspaceCrn() {
    return workspaceCrn;
  }

  /**
   * Setter for workspaceCrn.
   * The CRN of the workbench cluster to modify.
   **/
  public void setWorkspaceCrn(String workspaceCrn) {
    this.workspaceCrn = workspaceCrn;
  }

  /**
   * Getter for loadBalancerIPAllowLists.
   * The allowlist of CIDR blocks which can access the loadbalancer.
   **/
  @JsonProperty("loadBalancerIPAllowLists")
  public List<String> getLoadBalancerIPAllowLists() {
    return loadBalancerIPAllowLists;
  }

  /**
   * Setter for loadBalancerIPAllowLists.
   * The allowlist of CIDR blocks which can access the loadbalancer.
   **/
  public void setLoadBalancerIPAllowLists(List<String> loadBalancerIPAllowLists) {
    this.loadBalancerIPAllowLists = loadBalancerIPAllowLists;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyWorkspaceLoadBalancerRequest modifyWorkspaceLoadBalancerRequest = (ModifyWorkspaceLoadBalancerRequest) o;
    if (!Objects.equals(this.workspaceCrn, modifyWorkspaceLoadBalancerRequest.workspaceCrn)) {
      return false;
    }
    if (!Objects.equals(this.loadBalancerIPAllowLists, modifyWorkspaceLoadBalancerRequest.loadBalancerIPAllowLists)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceCrn, loadBalancerIPAllowLists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyWorkspaceLoadBalancerRequest {\n");
    sb.append("    workspaceCrn: ").append(toIndentedString(workspaceCrn)).append("\n");
    sb.append("    loadBalancerIPAllowLists: ").append(toIndentedString(loadBalancerIPAllowLists)).append("\n");
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

