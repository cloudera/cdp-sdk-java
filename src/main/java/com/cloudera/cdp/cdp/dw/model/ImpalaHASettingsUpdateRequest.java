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

/**
 * High Availability settings update options for the Impala Virtual Warehouse.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-06-12T15:05:26.077-07:00")
public class ImpalaHASettingsUpdateRequest  {

  /**
   * Delay in seconds before the shutdown of coordinator event happens.
   **/
  private Integer shutdownOfCoordinatorDelaySeconds = null;

  /**
   * The number of active coordinators.
   **/
  private Integer numOfActiveCoordinators = null;

  /**
   * Getter for shutdownOfCoordinatorDelaySeconds.
   * Delay in seconds before the shutdown of coordinator event happens.
   **/
  @JsonProperty("shutdownOfCoordinatorDelaySeconds")
  public Integer getShutdownOfCoordinatorDelaySeconds() {
    return shutdownOfCoordinatorDelaySeconds;
  }

  /**
   * Setter for shutdownOfCoordinatorDelaySeconds.
   * Delay in seconds before the shutdown of coordinator event happens.
   **/
  public void setShutdownOfCoordinatorDelaySeconds(Integer shutdownOfCoordinatorDelaySeconds) {
    this.shutdownOfCoordinatorDelaySeconds = shutdownOfCoordinatorDelaySeconds;
  }

  /**
   * Getter for numOfActiveCoordinators.
   * The number of active coordinators.
   **/
  @JsonProperty("numOfActiveCoordinators")
  public Integer getNumOfActiveCoordinators() {
    return numOfActiveCoordinators;
  }

  /**
   * Setter for numOfActiveCoordinators.
   * The number of active coordinators.
   **/
  public void setNumOfActiveCoordinators(Integer numOfActiveCoordinators) {
    this.numOfActiveCoordinators = numOfActiveCoordinators;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImpalaHASettingsUpdateRequest impalaHASettingsUpdateRequest = (ImpalaHASettingsUpdateRequest) o;
    if (!Objects.equals(this.shutdownOfCoordinatorDelaySeconds, impalaHASettingsUpdateRequest.shutdownOfCoordinatorDelaySeconds)) {
      return false;
    }
    if (!Objects.equals(this.numOfActiveCoordinators, impalaHASettingsUpdateRequest.numOfActiveCoordinators)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(shutdownOfCoordinatorDelaySeconds, numOfActiveCoordinators);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpalaHASettingsUpdateRequest {\n");
    sb.append("    shutdownOfCoordinatorDelaySeconds: ").append(toIndentedString(shutdownOfCoordinatorDelaySeconds)).append("\n");
    sb.append("    numOfActiveCoordinators: ").append(toIndentedString(numOfActiveCoordinators)).append("\n");
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

