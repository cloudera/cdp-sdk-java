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
import com.cloudera.cdp.datalake.model.Instance;
import java.util.*;

/**
 * The type of the instance group which also contains the actual instance(s)
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-06-21T23:16:16.408-07:00")
public class InstanceGroup  {

  /**
   * The name of the instance group.
   **/
  private String name = null;

  /**
   * List of instances in this instance group.
   **/
  private List<Instance> instances = new ArrayList<Instance>();

  /**
   * List of availability zones that this instance group is associated with.
   **/
  private List<String> availabilityZones = new ArrayList<String>();

  /**
   * Getter for name.
   * The name of the instance group.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the instance group.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for instances.
   * List of instances in this instance group.
   **/
  @JsonProperty("instances")
  public List<Instance> getInstances() {
    return instances;
  }

  /**
   * Setter for instances.
   * List of instances in this instance group.
   **/
  public void setInstances(List<Instance> instances) {
    this.instances = instances;
  }

  /**
   * Getter for availabilityZones.
   * List of availability zones that this instance group is associated with.
   **/
  @JsonProperty("availabilityZones")
  public List<String> getAvailabilityZones() {
    return availabilityZones;
  }

  /**
   * Setter for availabilityZones.
   * List of availability zones that this instance group is associated with.
   **/
  public void setAvailabilityZones(List<String> availabilityZones) {
    this.availabilityZones = availabilityZones;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceGroup instanceGroup = (InstanceGroup) o;
    if (!Objects.equals(this.name, instanceGroup.name)) {
      return false;
    }
    if (!Objects.equals(this.instances, instanceGroup.instances)) {
      return false;
    }
    if (!Objects.equals(this.availabilityZones, instanceGroup.availabilityZones)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, instances, availabilityZones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceGroup {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
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

