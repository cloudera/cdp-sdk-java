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
 * The state and state message associated with a deployment.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:44.928-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class DeploymentStatus  {

  /**
   * The detailed state that the deployment is currently in.
   **/
  private String detailedState = null;

  /**
   * The state that the deployment is currently in.
   **/
  private String state = null;

  /**
   * Detail message relating to the current status of the deployment.
   **/
  private String message = null;

  /**
   * Getter for detailedState.
   * The detailed state that the deployment is currently in.
   **/
  @JsonProperty("detailedState")
  public String getDetailedState() {
    return detailedState;
  }

  /**
   * Setter for detailedState.
   * The detailed state that the deployment is currently in.
   **/
  public void setDetailedState(String detailedState) {
    this.detailedState = detailedState;
  }

  /**
   * Getter for state.
   * The state that the deployment is currently in.
   **/
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  /**
   * Setter for state.
   * The state that the deployment is currently in.
   **/
  public void setState(String state) {
    this.state = state;
  }

  /**
   * Getter for message.
   * Detail message relating to the current status of the deployment.
   **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Setter for message.
   * Detail message relating to the current status of the deployment.
   **/
  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentStatus deploymentStatus = (DeploymentStatus) o;
    if (!Objects.equals(this.detailedState, deploymentStatus.detailedState)) {
      return false;
    }
    if (!Objects.equals(this.state, deploymentStatus.state)) {
      return false;
    }
    if (!Objects.equals(this.message, deploymentStatus.message)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(detailedState, state, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentStatus {\n");
    sb.append("    detailedState: ").append(toIndentedString(detailedState)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

