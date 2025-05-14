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
import com.cloudera.cdp.compute.model.AcceleratorConfigResp;
import java.util.*;

/**
 * Instance requirements structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-14T11:34:38.707-07:00")
public class CommonInstanceRequirementsResp  {

  /**
   * Instance types to include.
   **/
  private List<String> allowedInstanceTypes = new ArrayList<String>();

  /**
   * CPU types required. For eg. intel, amd, amazon-web-services etc.
   **/
  private List<String> cpuTypes = new ArrayList<String>();

  /**
   * Instance types to exclude, ignored if AllowedInstanceTypes is set.
   **/
  private List<String> excludedInstanceTypes = new ArrayList<String>();

  /**
   * Maximum vCpu count.
   **/
  private Long maxCpu = null;

  /**
   * Minimum vCpu count.
   **/
  private Long minCpu = null;

  /**
   * Maximum memory requirement in MiB.
   **/
  private Long maxMemory = null;

  /**
   * Minimum memory requirement in MiB.
   **/
  private Long minMemory = null;

  /**
   * Accelerator Config for AWS.
   **/
  private AcceleratorConfigResp acceleratorConfig = null;

  /**
   * Getter for allowedInstanceTypes.
   * Instance types to include.
   **/
  @JsonProperty("allowedInstanceTypes")
  public List<String> getAllowedInstanceTypes() {
    return allowedInstanceTypes;
  }

  /**
   * Setter for allowedInstanceTypes.
   * Instance types to include.
   **/
  public void setAllowedInstanceTypes(List<String> allowedInstanceTypes) {
    this.allowedInstanceTypes = allowedInstanceTypes;
  }

  /**
   * Getter for cpuTypes.
   * CPU types required. For eg. intel, amd, amazon-web-services etc.
   **/
  @JsonProperty("cpuTypes")
  public List<String> getCpuTypes() {
    return cpuTypes;
  }

  /**
   * Setter for cpuTypes.
   * CPU types required. For eg. intel, amd, amazon-web-services etc.
   **/
  public void setCpuTypes(List<String> cpuTypes) {
    this.cpuTypes = cpuTypes;
  }

  /**
   * Getter for excludedInstanceTypes.
   * Instance types to exclude, ignored if AllowedInstanceTypes is set.
   **/
  @JsonProperty("excludedInstanceTypes")
  public List<String> getExcludedInstanceTypes() {
    return excludedInstanceTypes;
  }

  /**
   * Setter for excludedInstanceTypes.
   * Instance types to exclude, ignored if AllowedInstanceTypes is set.
   **/
  public void setExcludedInstanceTypes(List<String> excludedInstanceTypes) {
    this.excludedInstanceTypes = excludedInstanceTypes;
  }

  /**
   * Getter for maxCpu.
   * Maximum vCpu count.
   **/
  @JsonProperty("maxCpu")
  public Long getMaxCpu() {
    return maxCpu;
  }

  /**
   * Setter for maxCpu.
   * Maximum vCpu count.
   **/
  public void setMaxCpu(Long maxCpu) {
    this.maxCpu = maxCpu;
  }

  /**
   * Getter for minCpu.
   * Minimum vCpu count.
   **/
  @JsonProperty("minCpu")
  public Long getMinCpu() {
    return minCpu;
  }

  /**
   * Setter for minCpu.
   * Minimum vCpu count.
   **/
  public void setMinCpu(Long minCpu) {
    this.minCpu = minCpu;
  }

  /**
   * Getter for maxMemory.
   * Maximum memory requirement in MiB.
   **/
  @JsonProperty("maxMemory")
  public Long getMaxMemory() {
    return maxMemory;
  }

  /**
   * Setter for maxMemory.
   * Maximum memory requirement in MiB.
   **/
  public void setMaxMemory(Long maxMemory) {
    this.maxMemory = maxMemory;
  }

  /**
   * Getter for minMemory.
   * Minimum memory requirement in MiB.
   **/
  @JsonProperty("minMemory")
  public Long getMinMemory() {
    return minMemory;
  }

  /**
   * Setter for minMemory.
   * Minimum memory requirement in MiB.
   **/
  public void setMinMemory(Long minMemory) {
    this.minMemory = minMemory;
  }

  /**
   * Getter for acceleratorConfig.
   * Accelerator Config for AWS.
   **/
  @JsonProperty("acceleratorConfig")
  public AcceleratorConfigResp getAcceleratorConfig() {
    return acceleratorConfig;
  }

  /**
   * Setter for acceleratorConfig.
   * Accelerator Config for AWS.
   **/
  public void setAcceleratorConfig(AcceleratorConfigResp acceleratorConfig) {
    this.acceleratorConfig = acceleratorConfig;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonInstanceRequirementsResp commonInstanceRequirementsResp = (CommonInstanceRequirementsResp) o;
    if (!Objects.equals(this.allowedInstanceTypes, commonInstanceRequirementsResp.allowedInstanceTypes)) {
      return false;
    }
    if (!Objects.equals(this.cpuTypes, commonInstanceRequirementsResp.cpuTypes)) {
      return false;
    }
    if (!Objects.equals(this.excludedInstanceTypes, commonInstanceRequirementsResp.excludedInstanceTypes)) {
      return false;
    }
    if (!Objects.equals(this.maxCpu, commonInstanceRequirementsResp.maxCpu)) {
      return false;
    }
    if (!Objects.equals(this.minCpu, commonInstanceRequirementsResp.minCpu)) {
      return false;
    }
    if (!Objects.equals(this.maxMemory, commonInstanceRequirementsResp.maxMemory)) {
      return false;
    }
    if (!Objects.equals(this.minMemory, commonInstanceRequirementsResp.minMemory)) {
      return false;
    }
    if (!Objects.equals(this.acceleratorConfig, commonInstanceRequirementsResp.acceleratorConfig)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedInstanceTypes, cpuTypes, excludedInstanceTypes, maxCpu, minCpu, maxMemory, minMemory, acceleratorConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonInstanceRequirementsResp {\n");
    sb.append("    allowedInstanceTypes: ").append(toIndentedString(allowedInstanceTypes)).append("\n");
    sb.append("    cpuTypes: ").append(toIndentedString(cpuTypes)).append("\n");
    sb.append("    excludedInstanceTypes: ").append(toIndentedString(excludedInstanceTypes)).append("\n");
    sb.append("    maxCpu: ").append(toIndentedString(maxCpu)).append("\n");
    sb.append("    minCpu: ").append(toIndentedString(minCpu)).append("\n");
    sb.append("    maxMemory: ").append(toIndentedString(maxMemory)).append("\n");
    sb.append("    minMemory: ").append(toIndentedString(minMemory)).append("\n");
    sb.append("    acceleratorConfig: ").append(toIndentedString(acceleratorConfig)).append("\n");
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

