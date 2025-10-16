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
import com.cloudera.cdp.ml.model.Accelerator;

/**
 * Request object for ModifyClusterInstanceGroup.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-15T17:00:45.776-07:00")
public class ModifyClusterInstanceGroupRequest  {

  /**
   * The CRN of the workbench cluster to modify.
   **/
  private String workspaceCrn = null;

  /**
   * The system-assigned name of the instance group in the workbench cluster to be modified.
   **/
  private String instanceGroupName = null;

  /**
   * The desired autoscaling min of the workbench cluster instance group.
   **/
  private Integer min = null;

  /**
   * The desired autoscaling min of the workbench cluster instance group.
   **/
  private Integer max = null;

  /**
   * The desired instance type of the workbench cluster instance group.
   **/
  private String instanceType = null;

  /**
   * The unique name for the instance or resource group of the workbench.
   **/
  private String name = null;

  /**
   * The accelerator, which refers to the GPU type configuration.
   **/
  private Accelerator accelerator = null;

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
   * Getter for instanceGroupName.
   * The system-assigned name of the instance group in the workbench cluster to be modified.
   **/
  @JsonProperty("instanceGroupName")
  public String getInstanceGroupName() {
    return instanceGroupName;
  }

  /**
   * Setter for instanceGroupName.
   * The system-assigned name of the instance group in the workbench cluster to be modified.
   **/
  public void setInstanceGroupName(String instanceGroupName) {
    this.instanceGroupName = instanceGroupName;
  }

  /**
   * Getter for min.
   * The desired autoscaling min of the workbench cluster instance group.
   **/
  @JsonProperty("min")
  public Integer getMin() {
    return min;
  }

  /**
   * Setter for min.
   * The desired autoscaling min of the workbench cluster instance group.
   **/
  public void setMin(Integer min) {
    this.min = min;
  }

  /**
   * Getter for max.
   * The desired autoscaling min of the workbench cluster instance group.
   **/
  @JsonProperty("max")
  public Integer getMax() {
    return max;
  }

  /**
   * Setter for max.
   * The desired autoscaling min of the workbench cluster instance group.
   **/
  public void setMax(Integer max) {
    this.max = max;
  }

  /**
   * Getter for instanceType.
   * The desired instance type of the workbench cluster instance group.
   **/
  @JsonProperty("instanceType")
  public String getInstanceType() {
    return instanceType;
  }

  /**
   * Setter for instanceType.
   * The desired instance type of the workbench cluster instance group.
   **/
  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  /**
   * Getter for name.
   * The unique name for the instance or resource group of the workbench.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The unique name for the instance or resource group of the workbench.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for accelerator.
   * The accelerator, which refers to the GPU type configuration.
   **/
  @JsonProperty("accelerator")
  public Accelerator getAccelerator() {
    return accelerator;
  }

  /**
   * Setter for accelerator.
   * The accelerator, which refers to the GPU type configuration.
   **/
  public void setAccelerator(Accelerator accelerator) {
    this.accelerator = accelerator;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyClusterInstanceGroupRequest modifyClusterInstanceGroupRequest = (ModifyClusterInstanceGroupRequest) o;
    if (!Objects.equals(this.workspaceCrn, modifyClusterInstanceGroupRequest.workspaceCrn)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroupName, modifyClusterInstanceGroupRequest.instanceGroupName)) {
      return false;
    }
    if (!Objects.equals(this.min, modifyClusterInstanceGroupRequest.min)) {
      return false;
    }
    if (!Objects.equals(this.max, modifyClusterInstanceGroupRequest.max)) {
      return false;
    }
    if (!Objects.equals(this.instanceType, modifyClusterInstanceGroupRequest.instanceType)) {
      return false;
    }
    if (!Objects.equals(this.name, modifyClusterInstanceGroupRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.accelerator, modifyClusterInstanceGroupRequest.accelerator)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceCrn, instanceGroupName, min, max, instanceType, name, accelerator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyClusterInstanceGroupRequest {\n");
    sb.append("    workspaceCrn: ").append(toIndentedString(workspaceCrn)).append("\n");
    sb.append("    instanceGroupName: ").append(toIndentedString(instanceGroupName)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accelerator: ").append(toIndentedString(accelerator)).append("\n");
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

