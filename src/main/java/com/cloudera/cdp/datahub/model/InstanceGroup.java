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
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2020-11-12T10:44:15.453-08:00")
public class InstanceGroup  {

  /**
   * The name of the instance group where the given instance is located.
   **/
  private String name = null;

  /**
   * Some information about the given instance.
   **/
  private List<Instance> instances = new ArrayList<Instance>();

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
   * Some information about the given instance.
   **/
  @JsonProperty("instances")
  public List<Instance> getInstances() {
    return instances;
  }

  /**
   * Setter for instances.
   * Some information about the given instance.
   **/
  public void setInstances(List<Instance> instances) {
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
    InstanceGroup instanceGroup = (InstanceGroup) o;
    if (!Objects.equals(this.name, instanceGroup.name)) {
      return false;
    }
    if (!Objects.equals(this.instances, instanceGroup.instances)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, instances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceGroup {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

