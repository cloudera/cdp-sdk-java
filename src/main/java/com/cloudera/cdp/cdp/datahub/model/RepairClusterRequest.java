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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datahub.model.RepairInstancesRequest;
import java.util.*;

/**
 * Request object for repair cluster request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-15T12:52:19.803-08:00")
public class RepairClusterRequest  {

  /**
   * The name or CRN of the cluster to be repaired.
   **/
  private String clusterName = null;

  /**
   * List of instance groups where the failed instances will be repaired.
   **/
  private List<String> instanceGroupNames = new ArrayList<String>();

  /**
   * List of instances.
   **/
  private RepairInstancesRequest instances = null;

  /**
   * If true, the failed instances will only be removed, otherwise the failed instances will be removed and new instances will be started.
   **/
  private Boolean removeOnly = null;

  /**
   * Getter for clusterName.
   * The name or CRN of the cluster to be repaired.
   **/
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }

  /**
   * Setter for clusterName.
   * The name or CRN of the cluster to be repaired.
   **/
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  /**
   * Getter for instanceGroupNames.
   * List of instance groups where the failed instances will be repaired.
   **/
  @JsonProperty("instanceGroupNames")
  public List<String> getInstanceGroupNames() {
    return instanceGroupNames;
  }

  /**
   * Setter for instanceGroupNames.
   * List of instance groups where the failed instances will be repaired.
   **/
  public void setInstanceGroupNames(List<String> instanceGroupNames) {
    this.instanceGroupNames = instanceGroupNames;
  }

  /**
   * Getter for instances.
   * List of instances.
   **/
  @JsonProperty("instances")
  public RepairInstancesRequest getInstances() {
    return instances;
  }

  /**
   * Setter for instances.
   * List of instances.
   **/
  public void setInstances(RepairInstancesRequest instances) {
    this.instances = instances;
  }

  /**
   * Getter for removeOnly.
   * If true, the failed instances will only be removed, otherwise the failed instances will be removed and new instances will be started.
   **/
  @JsonProperty("removeOnly")
  public Boolean getRemoveOnly() {
    return removeOnly;
  }

  /**
   * Setter for removeOnly.
   * If true, the failed instances will only be removed, otherwise the failed instances will be removed and new instances will be started.
   **/
  public void setRemoveOnly(Boolean removeOnly) {
    this.removeOnly = removeOnly;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepairClusterRequest repairClusterRequest = (RepairClusterRequest) o;
    if (!Objects.equals(this.clusterName, repairClusterRequest.clusterName)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroupNames, repairClusterRequest.instanceGroupNames)) {
      return false;
    }
    if (!Objects.equals(this.instances, repairClusterRequest.instances)) {
      return false;
    }
    if (!Objects.equals(this.removeOnly, repairClusterRequest.removeOnly)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterName, instanceGroupNames, instances, removeOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepairClusterRequest {\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    instanceGroupNames: ").append(toIndentedString(instanceGroupNames)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    removeOnly: ").append(toIndentedString(removeOnly)).append("\n");
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

