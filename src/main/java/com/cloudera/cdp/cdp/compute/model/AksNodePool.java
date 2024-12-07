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

package com.cloudera.cdp.compute.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.compute.model.AksPoolInstance;
import java.util.*;

/**
 * AKS node pool response structure.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-06T11:27:19.452-08:00")
public class AksNodePool  {

  /**
   * Name.
   **/
  private String name = null;

  /**
   * Type.
   **/
  private String type = null;

  /**
   * Provisioning state.
   **/
  private String provisioningState = null;

  /**
   * AKS pool instance.
   **/
  private List<AksPoolInstance> instances = new ArrayList<AksPoolInstance>();

  /**
   * Availability zones.
   **/
  private List<String> availabilityZones = new ArrayList<String>();

  /**
   * Getter for name.
   * Name.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for type.
   * Type.
   **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Setter for type.
   * Type.
   **/
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Getter for provisioningState.
   * Provisioning state.
   **/
  @JsonProperty("provisioningState")
  public String getProvisioningState() {
    return provisioningState;
  }

  /**
   * Setter for provisioningState.
   * Provisioning state.
   **/
  public void setProvisioningState(String provisioningState) {
    this.provisioningState = provisioningState;
  }

  /**
   * Getter for instances.
   * AKS pool instance.
   **/
  @JsonProperty("instances")
  public List<AksPoolInstance> getInstances() {
    return instances;
  }

  /**
   * Setter for instances.
   * AKS pool instance.
   **/
  public void setInstances(List<AksPoolInstance> instances) {
    this.instances = instances;
  }

  /**
   * Getter for availabilityZones.
   * Availability zones.
   **/
  @JsonProperty("availabilityZones")
  public List<String> getAvailabilityZones() {
    return availabilityZones;
  }

  /**
   * Setter for availabilityZones.
   * Availability zones.
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
    AksNodePool aksNodePool = (AksNodePool) o;
    if (!Objects.equals(this.name, aksNodePool.name)) {
      return false;
    }
    if (!Objects.equals(this.type, aksNodePool.type)) {
      return false;
    }
    if (!Objects.equals(this.provisioningState, aksNodePool.provisioningState)) {
      return false;
    }
    if (!Objects.equals(this.instances, aksNodePool.instances)) {
      return false;
    }
    if (!Objects.equals(this.availabilityZones, aksNodePool.availabilityZones)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, provisioningState, instances, availabilityZones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AksNodePool {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    provisioningState: ").append(toIndentedString(provisioningState)).append("\n");
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

