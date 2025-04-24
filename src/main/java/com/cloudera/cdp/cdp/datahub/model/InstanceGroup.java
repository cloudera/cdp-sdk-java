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
import com.cloudera.cdp.datahub.model.Instance;
import java.util.*;

/**
 * The type of the instance group which also contains the actual instance(s)
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-04-23T14:14:32.339-07:00")
public class InstanceGroup  {

  /**
   * The name of the instance group where the given instance is located.
   **/
  private String name = null;

  /**
   * List of instances in this instance group.
   **/
  private List<Instance> instances = new ArrayList<Instance>();

  /**
   * The list of subnet IDs in case of multi-availability zone setup
   **/
  private List<String> subnetIds = new ArrayList<String>();

  /**
   * List of availability zones that this instance group is associated with.
   **/
  private List<String> availabilityZones = new ArrayList<String>();

  /**
   * The recipe names for the Data Hub cluster.
   **/
  private List<String> recipes = new ArrayList<String>();

  /**
   * Getter for name.
   * The name of the instance group where the given instance is located.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the instance group where the given instance is located.
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
   * Getter for subnetIds.
   * The list of subnet IDs in case of multi-availability zone setup
   **/
  @JsonProperty("subnetIds")
  public List<String> getSubnetIds() {
    return subnetIds;
  }

  /**
   * Setter for subnetIds.
   * The list of subnet IDs in case of multi-availability zone setup
   **/
  public void setSubnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
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

  /**
   * Getter for recipes.
   * The recipe names for the Data Hub cluster.
   **/
  @JsonProperty("recipes")
  public List<String> getRecipes() {
    return recipes;
  }

  /**
   * Setter for recipes.
   * The recipe names for the Data Hub cluster.
   **/
  public void setRecipes(List<String> recipes) {
    this.recipes = recipes;
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
    if (!Objects.equals(this.subnetIds, instanceGroup.subnetIds)) {
      return false;
    }
    if (!Objects.equals(this.availabilityZones, instanceGroup.availabilityZones)) {
      return false;
    }
    if (!Objects.equals(this.recipes, instanceGroup.recipes)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, instances, subnetIds, availabilityZones, recipes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceGroup {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
    sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
    sb.append("    recipes: ").append(toIndentedString(recipes)).append("\n");
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

