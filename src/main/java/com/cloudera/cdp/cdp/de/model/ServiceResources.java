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

package com.cloudera.cdp.de.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.de.model.AllPurposeInstanceGroupDetailsResponse;

/**
 * Object to store resources for a CDE service.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:43.816-07:00")
public class ServiceResources  {

  /**
   * Instance type of the CDE service.
   **/
  private String instanceType = null;

  /**
   * Minimum Instances for the CDE service.
   **/
  private String minInstances = null;

  /**
   * Maximum instances for the CDE service.
   **/
  private String maxInstances = null;

  /**
   * Initial instances for the CDE service.
   **/
  private String initialInstances = null;

  /**
   * Minimum number of spot instances for the CDE service.
   **/
  private String minSpotInstances = null;

  /**
   * Maximum Number of Spot instances.
   **/
  private String maxSpotInstances = null;

  /**
   * Initial Spot Instances for the CDE Service.
   **/
  private String initialSpotInstances = null;

  /**
   * Root Volume Size.
   **/
  private String rootVolSize = null;

  /**
   * CPU Requests for the entire CDE service quota.
   **/
  private String cpuRequests = null;

  /**
   * Memory requests for the entire CDE service quota, eg. 100Gi.
   **/
  private String memoryRequests = null;

  /**
   * Resource Pool for the CDE service.
   **/
  private String resourcePool = null;

  /**
   * Resource details for the nodes used in All Purpose Virtual Clusters.
   **/
  private AllPurposeInstanceGroupDetailsResponse allPurposeInstanceGroupDetails = null;

  /**
   * Getter for instanceType.
   * Instance type of the CDE service.
   **/
  @JsonProperty("instance_type")
  public String getInstanceType() {
    return instanceType;
  }

  /**
   * Setter for instanceType.
   * Instance type of the CDE service.
   **/
  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  /**
   * Getter for minInstances.
   * Minimum Instances for the CDE service.
   **/
  @JsonProperty("min_instances")
  public String getMinInstances() {
    return minInstances;
  }

  /**
   * Setter for minInstances.
   * Minimum Instances for the CDE service.
   **/
  public void setMinInstances(String minInstances) {
    this.minInstances = minInstances;
  }

  /**
   * Getter for maxInstances.
   * Maximum instances for the CDE service.
   **/
  @JsonProperty("max_instances")
  public String getMaxInstances() {
    return maxInstances;
  }

  /**
   * Setter for maxInstances.
   * Maximum instances for the CDE service.
   **/
  public void setMaxInstances(String maxInstances) {
    this.maxInstances = maxInstances;
  }

  /**
   * Getter for initialInstances.
   * Initial instances for the CDE service.
   **/
  @JsonProperty("initial_instances")
  public String getInitialInstances() {
    return initialInstances;
  }

  /**
   * Setter for initialInstances.
   * Initial instances for the CDE service.
   **/
  public void setInitialInstances(String initialInstances) {
    this.initialInstances = initialInstances;
  }

  /**
   * Getter for minSpotInstances.
   * Minimum number of spot instances for the CDE service.
   **/
  @JsonProperty("min_spot_instances")
  public String getMinSpotInstances() {
    return minSpotInstances;
  }

  /**
   * Setter for minSpotInstances.
   * Minimum number of spot instances for the CDE service.
   **/
  public void setMinSpotInstances(String minSpotInstances) {
    this.minSpotInstances = minSpotInstances;
  }

  /**
   * Getter for maxSpotInstances.
   * Maximum Number of Spot instances.
   **/
  @JsonProperty("max_spot_instances")
  public String getMaxSpotInstances() {
    return maxSpotInstances;
  }

  /**
   * Setter for maxSpotInstances.
   * Maximum Number of Spot instances.
   **/
  public void setMaxSpotInstances(String maxSpotInstances) {
    this.maxSpotInstances = maxSpotInstances;
  }

  /**
   * Getter for initialSpotInstances.
   * Initial Spot Instances for the CDE Service.
   **/
  @JsonProperty("initial_spot_instances")
  public String getInitialSpotInstances() {
    return initialSpotInstances;
  }

  /**
   * Setter for initialSpotInstances.
   * Initial Spot Instances for the CDE Service.
   **/
  public void setInitialSpotInstances(String initialSpotInstances) {
    this.initialSpotInstances = initialSpotInstances;
  }

  /**
   * Getter for rootVolSize.
   * Root Volume Size.
   **/
  @JsonProperty("root_vol_size")
  public String getRootVolSize() {
    return rootVolSize;
  }

  /**
   * Setter for rootVolSize.
   * Root Volume Size.
   **/
  public void setRootVolSize(String rootVolSize) {
    this.rootVolSize = rootVolSize;
  }

  /**
   * Getter for cpuRequests.
   * CPU Requests for the entire CDE service quota.
   **/
  @JsonProperty("cpuRequests")
  public String getCpuRequests() {
    return cpuRequests;
  }

  /**
   * Setter for cpuRequests.
   * CPU Requests for the entire CDE service quota.
   **/
  public void setCpuRequests(String cpuRequests) {
    this.cpuRequests = cpuRequests;
  }

  /**
   * Getter for memoryRequests.
   * Memory requests for the entire CDE service quota, eg. 100Gi.
   **/
  @JsonProperty("memoryRequests")
  public String getMemoryRequests() {
    return memoryRequests;
  }

  /**
   * Setter for memoryRequests.
   * Memory requests for the entire CDE service quota, eg. 100Gi.
   **/
  public void setMemoryRequests(String memoryRequests) {
    this.memoryRequests = memoryRequests;
  }

  /**
   * Getter for resourcePool.
   * Resource Pool for the CDE service.
   **/
  @JsonProperty("resourcePool")
  public String getResourcePool() {
    return resourcePool;
  }

  /**
   * Setter for resourcePool.
   * Resource Pool for the CDE service.
   **/
  public void setResourcePool(String resourcePool) {
    this.resourcePool = resourcePool;
  }

  /**
   * Getter for allPurposeInstanceGroupDetails.
   * Resource details for the nodes used in All Purpose Virtual Clusters.
   **/
  @JsonProperty("allPurposeInstanceGroupDetails")
  public AllPurposeInstanceGroupDetailsResponse getAllPurposeInstanceGroupDetails() {
    return allPurposeInstanceGroupDetails;
  }

  /**
   * Setter for allPurposeInstanceGroupDetails.
   * Resource details for the nodes used in All Purpose Virtual Clusters.
   **/
  public void setAllPurposeInstanceGroupDetails(AllPurposeInstanceGroupDetailsResponse allPurposeInstanceGroupDetails) {
    this.allPurposeInstanceGroupDetails = allPurposeInstanceGroupDetails;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceResources serviceResources = (ServiceResources) o;
    if (!Objects.equals(this.instanceType, serviceResources.instanceType)) {
      return false;
    }
    if (!Objects.equals(this.minInstances, serviceResources.minInstances)) {
      return false;
    }
    if (!Objects.equals(this.maxInstances, serviceResources.maxInstances)) {
      return false;
    }
    if (!Objects.equals(this.initialInstances, serviceResources.initialInstances)) {
      return false;
    }
    if (!Objects.equals(this.minSpotInstances, serviceResources.minSpotInstances)) {
      return false;
    }
    if (!Objects.equals(this.maxSpotInstances, serviceResources.maxSpotInstances)) {
      return false;
    }
    if (!Objects.equals(this.initialSpotInstances, serviceResources.initialSpotInstances)) {
      return false;
    }
    if (!Objects.equals(this.rootVolSize, serviceResources.rootVolSize)) {
      return false;
    }
    if (!Objects.equals(this.cpuRequests, serviceResources.cpuRequests)) {
      return false;
    }
    if (!Objects.equals(this.memoryRequests, serviceResources.memoryRequests)) {
      return false;
    }
    if (!Objects.equals(this.resourcePool, serviceResources.resourcePool)) {
      return false;
    }
    if (!Objects.equals(this.allPurposeInstanceGroupDetails, serviceResources.allPurposeInstanceGroupDetails)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceType, minInstances, maxInstances, initialInstances, minSpotInstances, maxSpotInstances, initialSpotInstances, rootVolSize, cpuRequests, memoryRequests, resourcePool, allPurposeInstanceGroupDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceResources {\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    minInstances: ").append(toIndentedString(minInstances)).append("\n");
    sb.append("    maxInstances: ").append(toIndentedString(maxInstances)).append("\n");
    sb.append("    initialInstances: ").append(toIndentedString(initialInstances)).append("\n");
    sb.append("    minSpotInstances: ").append(toIndentedString(minSpotInstances)).append("\n");
    sb.append("    maxSpotInstances: ").append(toIndentedString(maxSpotInstances)).append("\n");
    sb.append("    initialSpotInstances: ").append(toIndentedString(initialSpotInstances)).append("\n");
    sb.append("    rootVolSize: ").append(toIndentedString(rootVolSize)).append("\n");
    sb.append("    cpuRequests: ").append(toIndentedString(cpuRequests)).append("\n");
    sb.append("    memoryRequests: ").append(toIndentedString(memoryRequests)).append("\n");
    sb.append("    resourcePool: ").append(toIndentedString(resourcePool)).append("\n");
    sb.append("    allPurposeInstanceGroupDetails: ").append(toIndentedString(allPurposeInstanceGroupDetails)).append("\n");
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

