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
 * Object to store resources for a CDE service
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-09-13T18:00:50.755-07:00")
public class VcResources  {

  /**
   * The CPU requests for VC for running spark jobs.
   **/
  private String cpuRequests = null;

  /**
   * The Memory requests for VC for running spark jobs.
   **/
  private String memRequests = null;

  /**
   * Actual CPU request for the VC. This accounts for other dex apps(eg. livy, airflow), that run in the virtual cluster.
   **/
  private String actualCpuRequests = null;

  /**
   * Actual Memory request for the VC. This accounts for other dex apps(eg. livy, airflow), that run in the virtual cluster.
   **/
  private String actualMemoryRequests = null;

  /**
   * Getter for cpuRequests.
   * The CPU requests for VC for running spark jobs.
   **/
  @JsonProperty("cpuRequests")
  public String getCpuRequests() {
    return cpuRequests;
  }

  /**
   * Setter for cpuRequests.
   * The CPU requests for VC for running spark jobs.
   **/
  public void setCpuRequests(String cpuRequests) {
    this.cpuRequests = cpuRequests;
  }

  /**
   * Getter for memRequests.
   * The Memory requests for VC for running spark jobs.
   **/
  @JsonProperty("memRequests")
  public String getMemRequests() {
    return memRequests;
  }

  /**
   * Setter for memRequests.
   * The Memory requests for VC for running spark jobs.
   **/
  public void setMemRequests(String memRequests) {
    this.memRequests = memRequests;
  }

  /**
   * Getter for actualCpuRequests.
   * Actual CPU request for the VC. This accounts for other dex apps(eg. livy, airflow), that run in the virtual cluster.
   **/
  @JsonProperty("actualCpuRequests")
  public String getActualCpuRequests() {
    return actualCpuRequests;
  }

  /**
   * Setter for actualCpuRequests.
   * Actual CPU request for the VC. This accounts for other dex apps(eg. livy, airflow), that run in the virtual cluster.
   **/
  public void setActualCpuRequests(String actualCpuRequests) {
    this.actualCpuRequests = actualCpuRequests;
  }

  /**
   * Getter for actualMemoryRequests.
   * Actual Memory request for the VC. This accounts for other dex apps(eg. livy, airflow), that run in the virtual cluster.
   **/
  @JsonProperty("actualMemoryRequests")
  public String getActualMemoryRequests() {
    return actualMemoryRequests;
  }

  /**
   * Setter for actualMemoryRequests.
   * Actual Memory request for the VC. This accounts for other dex apps(eg. livy, airflow), that run in the virtual cluster.
   **/
  public void setActualMemoryRequests(String actualMemoryRequests) {
    this.actualMemoryRequests = actualMemoryRequests;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VcResources vcResources = (VcResources) o;
    if (!Objects.equals(this.cpuRequests, vcResources.cpuRequests)) {
      return false;
    }
    if (!Objects.equals(this.memRequests, vcResources.memRequests)) {
      return false;
    }
    if (!Objects.equals(this.actualCpuRequests, vcResources.actualCpuRequests)) {
      return false;
    }
    if (!Objects.equals(this.actualMemoryRequests, vcResources.actualMemoryRequests)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuRequests, memRequests, actualCpuRequests, actualMemoryRequests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VcResources {\n");
    sb.append("    cpuRequests: ").append(toIndentedString(cpuRequests)).append("\n");
    sb.append("    memRequests: ").append(toIndentedString(memRequests)).append("\n");
    sb.append("    actualCpuRequests: ").append(toIndentedString(actualCpuRequests)).append("\n");
    sb.append("    actualMemoryRequests: ").append(toIndentedString(actualMemoryRequests)).append("\n");
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

