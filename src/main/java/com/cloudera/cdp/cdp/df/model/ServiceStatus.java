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
 * The status of a DataFlow enabled service.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-04-10T13:24:00.859-07:00")
public class ServiceStatus  {

  /**
   * The state of the service.
   **/
  private String state = null;

  /**
   * A status message for the service.
   **/
  private String message = null;

  /**
   * The detailed state of the service.
   **/
  private String detailedState = null;

  /**
   * Getter for state.
   * The state of the service.
   **/
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  /**
   * Setter for state.
   * The state of the service.
   **/
  public void setState(String state) {
    this.state = state;
  }

  /**
   * Getter for message.
   * A status message for the service.
   **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Setter for message.
   * A status message for the service.
   **/
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Getter for detailedState.
   * The detailed state of the service.
   **/
  @JsonProperty("detailedState")
  public String getDetailedState() {
    return detailedState;
  }

  /**
   * Setter for detailedState.
   * The detailed state of the service.
   **/
  public void setDetailedState(String detailedState) {
    this.detailedState = detailedState;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceStatus serviceStatus = (ServiceStatus) o;
    if (!Objects.equals(this.state, serviceStatus.state)) {
      return false;
    }
    if (!Objects.equals(this.message, serviceStatus.message)) {
      return false;
    }
    if (!Objects.equals(this.detailedState, serviceStatus.detailedState)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, message, detailedState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceStatus {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    detailedState: ").append(toIndentedString(detailedState)).append("\n");
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

