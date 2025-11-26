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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * The request object for FreeIPA downscale. Either targetAvailabilityType or instances
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-26T08:05:43.397-08:00")
public class DownscaleFreeipaRequest  {

  /**
   * The name or CRN of the environment.
   **/
  private String environmentName = null;

  /**
   * The target FreeIPA availability type.
   **/
  private String targetAvailabilityType = null;

  /**
   * The instance Ids to downscale.
   **/
  private List<String> instances = new ArrayList<String>();

  /**
   * Force the downscale regardless of the status of the FreeIPA nodes and skip some validations.
   **/
  private Boolean force = false;

  /**
   * Getter for environmentName.
   * The name or CRN of the environment.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The name or CRN of the environment.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for targetAvailabilityType.
   * The target FreeIPA availability type.
   **/
  @JsonProperty("targetAvailabilityType")
  public String getTargetAvailabilityType() {
    return targetAvailabilityType;
  }

  /**
   * Setter for targetAvailabilityType.
   * The target FreeIPA availability type.
   **/
  public void setTargetAvailabilityType(String targetAvailabilityType) {
    this.targetAvailabilityType = targetAvailabilityType;
  }

  /**
   * Getter for instances.
   * The instance Ids to downscale.
   **/
  @JsonProperty("instances")
  public List<String> getInstances() {
    return instances;
  }

  /**
   * Setter for instances.
   * The instance Ids to downscale.
   **/
  public void setInstances(List<String> instances) {
    this.instances = instances;
  }

  /**
   * Getter for force.
   * Force the downscale regardless of the status of the FreeIPA nodes and skip some validations.
   **/
  @JsonProperty("force")
  public Boolean getForce() {
    return force;
  }

  /**
   * Setter for force.
   * Force the downscale regardless of the status of the FreeIPA nodes and skip some validations.
   **/
  public void setForce(Boolean force) {
    this.force = force;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownscaleFreeipaRequest downscaleFreeipaRequest = (DownscaleFreeipaRequest) o;
    if (!Objects.equals(this.environmentName, downscaleFreeipaRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.targetAvailabilityType, downscaleFreeipaRequest.targetAvailabilityType)) {
      return false;
    }
    if (!Objects.equals(this.instances, downscaleFreeipaRequest.instances)) {
      return false;
    }
    if (!Objects.equals(this.force, downscaleFreeipaRequest.force)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, targetAvailabilityType, instances, force);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownscaleFreeipaRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    targetAvailabilityType: ").append(toIndentedString(targetAvailabilityType)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
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

