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

package com.cloudera.cdp.datalake.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datalake.model.RepairInstancesRequest;
import java.util.*;

/**
 * Request object for repair datalake request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-10-12T14:16:20.158-07:00")
public class RepairDatalakeRequest  {

  /**
   * The name or CRN of the datalake.
   **/
  private String datalakeName = null;

  /**
   * List of instance groups where the failed instances will be repaired.
   **/
  private List<String> instanceGroupNames = new ArrayList<String>();

  /**
   * The instance group where the failed instances will be repaired.
   **/
  private String instanceGroupName = null;

  /**
   * List of instances.
   **/
  private RepairInstancesRequest instances = null;

  /**
   * Getter for datalakeName.
   * The name or CRN of the datalake.
   **/
  @JsonProperty("datalakeName")
  public String getDatalakeName() {
    return datalakeName;
  }

  /**
   * Setter for datalakeName.
   * The name or CRN of the datalake.
   **/
  public void setDatalakeName(String datalakeName) {
    this.datalakeName = datalakeName;
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
   * Getter for instanceGroupName.
   * The instance group where the failed instances will be repaired.
   **/
  @JsonProperty("instanceGroupName")
  public String getInstanceGroupName() {
    return instanceGroupName;
  }

  /**
   * Setter for instanceGroupName.
   * The instance group where the failed instances will be repaired.
   **/
  public void setInstanceGroupName(String instanceGroupName) {
    this.instanceGroupName = instanceGroupName;
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepairDatalakeRequest repairDatalakeRequest = (RepairDatalakeRequest) o;
    if (!Objects.equals(this.datalakeName, repairDatalakeRequest.datalakeName)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroupNames, repairDatalakeRequest.instanceGroupNames)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroupName, repairDatalakeRequest.instanceGroupName)) {
      return false;
    }
    if (!Objects.equals(this.instances, repairDatalakeRequest.instances)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeName, instanceGroupNames, instanceGroupName, instances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepairDatalakeRequest {\n");
    sb.append("    datalakeName: ").append(toIndentedString(datalakeName)).append("\n");
    sb.append("    instanceGroupNames: ").append(toIndentedString(instanceGroupNames)).append("\n");
    sb.append("    instanceGroupName: ").append(toIndentedString(instanceGroupName)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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

