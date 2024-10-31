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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.dw.model.ApplicationResourcesBreakdown;
import com.cloudera.cdp.dw.model.ApplicationResourcesLocalStorageSize;

/**
 * The resource requirements of a component.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-10-31T09:45:08.143-07:00")
public class ApplicationResources  {

  /**
   * Overall CPU requirements.
   **/
  private Float cpu = null;

  /**
   * Overall memory requirements.
   **/
  private String memory = null;

  /**
   * Breakdown of the service memory requirements.
   **/
  private ApplicationResourcesBreakdown breakdown = null;

  /**
   * Temporary storage for CDW pods, used for storing configurations and temporary data needed during a process. The lifespan of ephemeral storage is tied to the pod.
   **/
  private String ephemeralStorage = null;

  /**
   * Local disk size requirements.
   **/
  private ApplicationResourcesLocalStorageSize localStorageSize = null;

  /**
   * Getter for cpu.
   * Overall CPU requirements.
   **/
  @JsonProperty("cpu")
  public Float getCpu() {
    return cpu;
  }

  /**
   * Setter for cpu.
   * Overall CPU requirements.
   **/
  public void setCpu(Float cpu) {
    this.cpu = cpu;
  }

  /**
   * Getter for memory.
   * Overall memory requirements.
   **/
  @JsonProperty("memory")
  public String getMemory() {
    return memory;
  }

  /**
   * Setter for memory.
   * Overall memory requirements.
   **/
  public void setMemory(String memory) {
    this.memory = memory;
  }

  /**
   * Getter for breakdown.
   * Breakdown of the service memory requirements.
   **/
  @JsonProperty("breakdown")
  public ApplicationResourcesBreakdown getBreakdown() {
    return breakdown;
  }

  /**
   * Setter for breakdown.
   * Breakdown of the service memory requirements.
   **/
  public void setBreakdown(ApplicationResourcesBreakdown breakdown) {
    this.breakdown = breakdown;
  }

  /**
   * Getter for ephemeralStorage.
   * Temporary storage for CDW pods, used for storing configurations and temporary data needed during a process. The lifespan of ephemeral storage is tied to the pod.
   **/
  @JsonProperty("ephemeralStorage")
  public String getEphemeralStorage() {
    return ephemeralStorage;
  }

  /**
   * Setter for ephemeralStorage.
   * Temporary storage for CDW pods, used for storing configurations and temporary data needed during a process. The lifespan of ephemeral storage is tied to the pod.
   **/
  public void setEphemeralStorage(String ephemeralStorage) {
    this.ephemeralStorage = ephemeralStorage;
  }

  /**
   * Getter for localStorageSize.
   * Local disk size requirements.
   **/
  @JsonProperty("localStorageSize")
  public ApplicationResourcesLocalStorageSize getLocalStorageSize() {
    return localStorageSize;
  }

  /**
   * Setter for localStorageSize.
   * Local disk size requirements.
   **/
  public void setLocalStorageSize(ApplicationResourcesLocalStorageSize localStorageSize) {
    this.localStorageSize = localStorageSize;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationResources applicationResources = (ApplicationResources) o;
    if (!Objects.equals(this.cpu, applicationResources.cpu)) {
      return false;
    }
    if (!Objects.equals(this.memory, applicationResources.memory)) {
      return false;
    }
    if (!Objects.equals(this.breakdown, applicationResources.breakdown)) {
      return false;
    }
    if (!Objects.equals(this.ephemeralStorage, applicationResources.ephemeralStorage)) {
      return false;
    }
    if (!Objects.equals(this.localStorageSize, applicationResources.localStorageSize)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpu, memory, breakdown, ephemeralStorage, localStorageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationResources {\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    breakdown: ").append(toIndentedString(breakdown)).append("\n");
    sb.append("    ephemeralStorage: ").append(toIndentedString(ephemeralStorage)).append("\n");
    sb.append("    localStorageSize: ").append(toIndentedString(localStorageSize)).append("\n");
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

