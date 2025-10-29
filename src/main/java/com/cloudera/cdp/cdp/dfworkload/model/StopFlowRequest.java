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

package com.cloudera.cdp.dfworkload.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for stopping the NiFi flow.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-28T14:00:31.001-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class StopFlowRequest  {

  /**
   * The CRN of an environment to execute the command.
   **/
  private String environmentCrn = null;

  /**
   * The deployment crn.
   **/
  private String deploymentCrn = null;

  /**
   * The max time in minutes to wait for flow to stop.
   **/
  private Integer waitForFlowToStopInMinutes = null;

  /**
   * Getter for environmentCrn.
   * The CRN of an environment to execute the command.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of an environment to execute the command.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for deploymentCrn.
   * The deployment crn.
   **/
  @JsonProperty("deploymentCrn")
  public String getDeploymentCrn() {
    return deploymentCrn;
  }

  /**
   * Setter for deploymentCrn.
   * The deployment crn.
   **/
  public void setDeploymentCrn(String deploymentCrn) {
    this.deploymentCrn = deploymentCrn;
  }

  /**
   * Getter for waitForFlowToStopInMinutes.
   * The max time in minutes to wait for flow to stop.
   **/
  @JsonProperty("waitForFlowToStopInMinutes")
  public Integer getWaitForFlowToStopInMinutes() {
    return waitForFlowToStopInMinutes;
  }

  /**
   * Setter for waitForFlowToStopInMinutes.
   * The max time in minutes to wait for flow to stop.
   **/
  public void setWaitForFlowToStopInMinutes(Integer waitForFlowToStopInMinutes) {
    this.waitForFlowToStopInMinutes = waitForFlowToStopInMinutes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopFlowRequest stopFlowRequest = (StopFlowRequest) o;
    if (!Objects.equals(this.environmentCrn, stopFlowRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.deploymentCrn, stopFlowRequest.deploymentCrn)) {
      return false;
    }
    if (!Objects.equals(this.waitForFlowToStopInMinutes, stopFlowRequest.waitForFlowToStopInMinutes)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, deploymentCrn, waitForFlowToStopInMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopFlowRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    deploymentCrn: ").append(toIndentedString(deploymentCrn)).append("\n");
    sb.append("    waitForFlowToStopInMinutes: ").append(toIndentedString(waitForFlowToStopInMinutes)).append("\n");
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

