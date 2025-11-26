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

package com.cloudera.cdp.replicationmanager.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Response object for collect-diagnostic-bundle.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-26T08:05:46.098-08:00")
public class CollectDiagnosticBundleResponse extends CdpResponse {

  /**
   * ID of the diagnostic bundle collection command issued against the CM. Polling get-command-status with this command id returns the current state of the command.
   **/
  private Long commandId = null;

  /**
   * Name of the policy.
   **/
  private String name = null;

  /**
   * Whether the diagnostic bundle command is active.
   **/
  private Boolean active = null;

  /**
   * Start time of the diagnostic bundle collection command.
   **/
  private String startTime = null;

  /**
   * Diagnostic bundle collection command result message.
   **/
  private String resultMessage = null;

  /**
   * Getter for commandId.
   * ID of the diagnostic bundle collection command issued against the CM. Polling get-command-status with this command id returns the current state of the command.
   **/
  @JsonProperty("commandId")
  public Long getCommandId() {
    return commandId;
  }

  /**
   * Setter for commandId.
   * ID of the diagnostic bundle collection command issued against the CM. Polling get-command-status with this command id returns the current state of the command.
   **/
  public void setCommandId(Long commandId) {
    this.commandId = commandId;
  }

  /**
   * Getter for name.
   * Name of the policy.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name of the policy.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for active.
   * Whether the diagnostic bundle command is active.
   **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  /**
   * Setter for active.
   * Whether the diagnostic bundle command is active.
   **/
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   * Getter for startTime.
   * Start time of the diagnostic bundle collection command.
   **/
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }

  /**
   * Setter for startTime.
   * Start time of the diagnostic bundle collection command.
   **/
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  /**
   * Getter for resultMessage.
   * Diagnostic bundle collection command result message.
   **/
  @JsonProperty("resultMessage")
  public String getResultMessage() {
    return resultMessage;
  }

  /**
   * Setter for resultMessage.
   * Diagnostic bundle collection command result message.
   **/
  public void setResultMessage(String resultMessage) {
    this.resultMessage = resultMessage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectDiagnosticBundleResponse collectDiagnosticBundleResponse = (CollectDiagnosticBundleResponse) o;
    if (!Objects.equals(this.commandId, collectDiagnosticBundleResponse.commandId)) {
      return false;
    }
    if (!Objects.equals(this.name, collectDiagnosticBundleResponse.name)) {
      return false;
    }
    if (!Objects.equals(this.active, collectDiagnosticBundleResponse.active)) {
      return false;
    }
    if (!Objects.equals(this.startTime, collectDiagnosticBundleResponse.startTime)) {
      return false;
    }
    if (!Objects.equals(this.resultMessage, collectDiagnosticBundleResponse.resultMessage)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(commandId, name, active, startTime, resultMessage, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectDiagnosticBundleResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    resultMessage: ").append(toIndentedString(resultMessage)).append("\n");
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

