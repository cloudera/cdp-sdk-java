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

package com.cloudera.cdp.df.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * The status of a deployment
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-02-10T14:31:16.534-08:00")
public class DeploymentStatus  {

  /**
   * The detailed state that the deployment is currently in
   **/
  private String detailedState = null;

  /**
   * Detail message relating to the current status of the deployment
   **/
  private String message = null;

  /**
   * The state that the deployment is currently in
   **/
  private String state = null;

  /**
   * Getter for detailedState.
   * The detailed state that the deployment is currently in
   **/
  @JsonProperty("detailedState")
  public String getDetailedState() {
    return detailedState;
  }

  /**
   * Setter for detailedState.
   * The detailed state that the deployment is currently in
   **/
  public void setDetailedState(String detailedState) {
    this.detailedState = detailedState;
  }

  /**
   * Getter for message.
   * Detail message relating to the current status of the deployment
   **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Setter for message.
   * Detail message relating to the current status of the deployment
   **/
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Getter for state.
   * The state that the deployment is currently in
   **/
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  /**
   * Setter for state.
   * The state that the deployment is currently in
   **/
  public void setState(String state) {
    this.state = state;
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
    if (!Objects.equals(this.message, deploymentStatus.message)) {
      return false;
    }
    if (!Objects.equals(this.state, deploymentStatus.state)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(detailedState, message, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentStatus {\n");
    sb.append("    detailedState: ").append(toIndentedString(detailedState)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

