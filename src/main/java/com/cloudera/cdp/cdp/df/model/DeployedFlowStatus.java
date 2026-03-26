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
 * The status of the flow being deployed.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-25T09:53:07.561-07:00")
public class DeployedFlowStatus  {

  /**
   * The detailed state that the deployed flow is currently in.
   **/
  private String detailedState = null;

  /**
   * The state that the deployed flow is currently in.
   **/
  private String state = null;

  /**
   * Detail message relating to the current status of the deployed flow.
   **/
  private String message = null;

  /**
   * Getter for detailedState.
   * The detailed state that the deployed flow is currently in.
   **/
  @JsonProperty("detailedState")
  public String getDetailedState() {
    return detailedState;
  }

  /**
   * Setter for detailedState.
   * The detailed state that the deployed flow is currently in.
   **/
  public void setDetailedState(String detailedState) {
    this.detailedState = detailedState;
  }

  /**
   * Getter for state.
   * The state that the deployed flow is currently in.
   **/
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  /**
   * Setter for state.
   * The state that the deployed flow is currently in.
   **/
  public void setState(String state) {
    this.state = state;
  }

  /**
   * Getter for message.
   * Detail message relating to the current status of the deployed flow.
   **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Setter for message.
   * Detail message relating to the current status of the deployed flow.
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
    DeployedFlowStatus deployedFlowStatus = (DeployedFlowStatus) o;
    if (!Objects.equals(this.detailedState, deployedFlowStatus.detailedState)) {
      return false;
    }
    if (!Objects.equals(this.state, deployedFlowStatus.state)) {
      return false;
    }
    if (!Objects.equals(this.message, deployedFlowStatus.message)) {
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
    sb.append("class DeployedFlowStatus {\n");
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

