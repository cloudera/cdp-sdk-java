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

/**
 * Instance group details for the All purpose Tier.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-23T07:12:41.669-08:00")
public class AllPurposeInstanceGroupDetailsResponse extends CdpResponse {

  /**
   * Instance type of the cluster for CDE Service.
   **/
  private String instanceType = null;

  /**
   * Minimum number of Instances for the CDE Service.
   **/
  private String minInstances = null;

  /**
   * Maximum number of Instances for the CDE Service.
   **/
  private String maxInstances = null;

  /**
   * Minimum number of Spot instances for the CDE Service.
   **/
  private String minSpotInstances = null;

  /**
   * Maximum number of Spot Instances for the CDE Service.
   **/
  private String maxSpotInstances = null;

  /**
   * Initial number of Instances when the service is enabled.
   **/
  private String initialInstances = null;

  /**
   * Initial number of spot Instances when the service is enabled.
   **/
  private String initialSpotInstances = null;

  /**
   * EBS volume size in GB.
   **/
  private String rootVolSize = null;

  /**
   * Getter for instanceType.
   * Instance type of the cluster for CDE Service.
   **/
  @JsonProperty("instance_type")
  public String getInstanceType() {
    return instanceType;
  }

  /**
   * Setter for instanceType.
   * Instance type of the cluster for CDE Service.
   **/
  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  /**
   * Getter for minInstances.
   * Minimum number of Instances for the CDE Service.
   **/
  @JsonProperty("min_instances")
  public String getMinInstances() {
    return minInstances;
  }

  /**
   * Setter for minInstances.
   * Minimum number of Instances for the CDE Service.
   **/
  public void setMinInstances(String minInstances) {
    this.minInstances = minInstances;
  }

  /**
   * Getter for maxInstances.
   * Maximum number of Instances for the CDE Service.
   **/
  @JsonProperty("max_instances")
  public String getMaxInstances() {
    return maxInstances;
  }

  /**
   * Setter for maxInstances.
   * Maximum number of Instances for the CDE Service.
   **/
  public void setMaxInstances(String maxInstances) {
    this.maxInstances = maxInstances;
  }

  /**
   * Getter for minSpotInstances.
   * Minimum number of Spot instances for the CDE Service.
   **/
  @JsonProperty("min_spot_instances")
  public String getMinSpotInstances() {
    return minSpotInstances;
  }

  /**
   * Setter for minSpotInstances.
   * Minimum number of Spot instances for the CDE Service.
   **/
  public void setMinSpotInstances(String minSpotInstances) {
    this.minSpotInstances = minSpotInstances;
  }

  /**
   * Getter for maxSpotInstances.
   * Maximum number of Spot Instances for the CDE Service.
   **/
  @JsonProperty("max_spot_instances")
  public String getMaxSpotInstances() {
    return maxSpotInstances;
  }

  /**
   * Setter for maxSpotInstances.
   * Maximum number of Spot Instances for the CDE Service.
   **/
  public void setMaxSpotInstances(String maxSpotInstances) {
    this.maxSpotInstances = maxSpotInstances;
  }

  /**
   * Getter for initialInstances.
   * Initial number of Instances when the service is enabled.
   **/
  @JsonProperty("initial_instances")
  public String getInitialInstances() {
    return initialInstances;
  }

  /**
   * Setter for initialInstances.
   * Initial number of Instances when the service is enabled.
   **/
  public void setInitialInstances(String initialInstances) {
    this.initialInstances = initialInstances;
  }

  /**
   * Getter for initialSpotInstances.
   * Initial number of spot Instances when the service is enabled.
   **/
  @JsonProperty("initial_spot_instances")
  public String getInitialSpotInstances() {
    return initialSpotInstances;
  }

  /**
   * Setter for initialSpotInstances.
   * Initial number of spot Instances when the service is enabled.
   **/
  public void setInitialSpotInstances(String initialSpotInstances) {
    this.initialSpotInstances = initialSpotInstances;
  }

  /**
   * Getter for rootVolSize.
   * EBS volume size in GB.
   **/
  @JsonProperty("root_vol_size")
  public String getRootVolSize() {
    return rootVolSize;
  }

  /**
   * Setter for rootVolSize.
   * EBS volume size in GB.
   **/
  public void setRootVolSize(String rootVolSize) {
    this.rootVolSize = rootVolSize;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllPurposeInstanceGroupDetailsResponse allPurposeInstanceGroupDetailsResponse = (AllPurposeInstanceGroupDetailsResponse) o;
    if (!Objects.equals(this.instanceType, allPurposeInstanceGroupDetailsResponse.instanceType)) {
      return false;
    }
    if (!Objects.equals(this.minInstances, allPurposeInstanceGroupDetailsResponse.minInstances)) {
      return false;
    }
    if (!Objects.equals(this.maxInstances, allPurposeInstanceGroupDetailsResponse.maxInstances)) {
      return false;
    }
    if (!Objects.equals(this.minSpotInstances, allPurposeInstanceGroupDetailsResponse.minSpotInstances)) {
      return false;
    }
    if (!Objects.equals(this.maxSpotInstances, allPurposeInstanceGroupDetailsResponse.maxSpotInstances)) {
      return false;
    }
    if (!Objects.equals(this.initialInstances, allPurposeInstanceGroupDetailsResponse.initialInstances)) {
      return false;
    }
    if (!Objects.equals(this.initialSpotInstances, allPurposeInstanceGroupDetailsResponse.initialSpotInstances)) {
      return false;
    }
    if (!Objects.equals(this.rootVolSize, allPurposeInstanceGroupDetailsResponse.rootVolSize)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceType, minInstances, maxInstances, minSpotInstances, maxSpotInstances, initialInstances, initialSpotInstances, rootVolSize, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllPurposeInstanceGroupDetailsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    minInstances: ").append(toIndentedString(minInstances)).append("\n");
    sb.append("    maxInstances: ").append(toIndentedString(maxInstances)).append("\n");
    sb.append("    minSpotInstances: ").append(toIndentedString(minSpotInstances)).append("\n");
    sb.append("    maxSpotInstances: ").append(toIndentedString(maxSpotInstances)).append("\n");
    sb.append("    initialInstances: ").append(toIndentedString(initialInstances)).append("\n");
    sb.append("    initialSpotInstances: ").append(toIndentedString(initialSpotInstances)).append("\n");
    sb.append("    rootVolSize: ").append(toIndentedString(rootVolSize)).append("\n");
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

