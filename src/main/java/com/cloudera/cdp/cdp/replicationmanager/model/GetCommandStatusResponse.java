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
 * Response object for get command status.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-28T14:00:31.692-07:00")
public class GetCommandStatusResponse extends CdpResponse {

  /**
   * Id of the CM command.
   **/
  private Long commandId = null;

  /**
   * Whether the diagnostic collection is successful.
   **/
  private Boolean success = null;

  /**
   * Whether the command is still active.
   **/
  private Boolean active = null;

  /**
   * Name of the policy.
   **/
  private String name = null;

  /**
   * Start time of the CM command.
   **/
  private String startTime = null;

  /**
   * End time of the CM command.
   **/
  private String endTime = null;

  /**
   * Some commands have result data URL for downloading the diagnostic bundle. On certain CM versions the bundle download is only available through this URL, but not with download-diagnostic-bundle operation.
   **/
  private String resultDataUrl = null;

  /**
   * Result message of the command.
   **/
  private String resultMessage = null;

  /**
   * The current status of the command.
   **/
  private String bundleStatus = null;

  /**
   * Further information about the current command status.
   **/
  private String bundleStatusMessage = null;

  /**
   * Getter for commandId.
   * Id of the CM command.
   **/
  @JsonProperty("commandId")
  public Long getCommandId() {
    return commandId;
  }

  /**
   * Setter for commandId.
   * Id of the CM command.
   **/
  public void setCommandId(Long commandId) {
    this.commandId = commandId;
  }

  /**
   * Getter for success.
   * Whether the diagnostic collection is successful.
   **/
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }

  /**
   * Setter for success.
   * Whether the diagnostic collection is successful.
   **/
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  /**
   * Getter for active.
   * Whether the command is still active.
   **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  /**
   * Setter for active.
   * Whether the command is still active.
   **/
  public void setActive(Boolean active) {
    this.active = active;
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
   * Getter for startTime.
   * Start time of the CM command.
   **/
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }

  /**
   * Setter for startTime.
   * Start time of the CM command.
   **/
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  /**
   * Getter for endTime.
   * End time of the CM command.
   **/
  @JsonProperty("endTime")
  public String getEndTime() {
    return endTime;
  }

  /**
   * Setter for endTime.
   * End time of the CM command.
   **/
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  /**
   * Getter for resultDataUrl.
   * Some commands have result data URL for downloading the diagnostic bundle. On certain CM versions the bundle download is only available through this URL, but not with download-diagnostic-bundle operation.
   **/
  @JsonProperty("resultDataUrl")
  public String getResultDataUrl() {
    return resultDataUrl;
  }

  /**
   * Setter for resultDataUrl.
   * Some commands have result data URL for downloading the diagnostic bundle. On certain CM versions the bundle download is only available through this URL, but not with download-diagnostic-bundle operation.
   **/
  public void setResultDataUrl(String resultDataUrl) {
    this.resultDataUrl = resultDataUrl;
  }

  /**
   * Getter for resultMessage.
   * Result message of the command.
   **/
  @JsonProperty("resultMessage")
  public String getResultMessage() {
    return resultMessage;
  }

  /**
   * Setter for resultMessage.
   * Result message of the command.
   **/
  public void setResultMessage(String resultMessage) {
    this.resultMessage = resultMessage;
  }

  /**
   * Getter for bundleStatus.
   * The current status of the command.
   **/
  @JsonProperty("bundleStatus")
  public String getBundleStatus() {
    return bundleStatus;
  }

  /**
   * Setter for bundleStatus.
   * The current status of the command.
   **/
  public void setBundleStatus(String bundleStatus) {
    this.bundleStatus = bundleStatus;
  }

  /**
   * Getter for bundleStatusMessage.
   * Further information about the current command status.
   **/
  @JsonProperty("bundleStatusMessage")
  public String getBundleStatusMessage() {
    return bundleStatusMessage;
  }

  /**
   * Setter for bundleStatusMessage.
   * Further information about the current command status.
   **/
  public void setBundleStatusMessage(String bundleStatusMessage) {
    this.bundleStatusMessage = bundleStatusMessage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCommandStatusResponse getCommandStatusResponse = (GetCommandStatusResponse) o;
    if (!Objects.equals(this.commandId, getCommandStatusResponse.commandId)) {
      return false;
    }
    if (!Objects.equals(this.success, getCommandStatusResponse.success)) {
      return false;
    }
    if (!Objects.equals(this.active, getCommandStatusResponse.active)) {
      return false;
    }
    if (!Objects.equals(this.name, getCommandStatusResponse.name)) {
      return false;
    }
    if (!Objects.equals(this.startTime, getCommandStatusResponse.startTime)) {
      return false;
    }
    if (!Objects.equals(this.endTime, getCommandStatusResponse.endTime)) {
      return false;
    }
    if (!Objects.equals(this.resultDataUrl, getCommandStatusResponse.resultDataUrl)) {
      return false;
    }
    if (!Objects.equals(this.resultMessage, getCommandStatusResponse.resultMessage)) {
      return false;
    }
    if (!Objects.equals(this.bundleStatus, getCommandStatusResponse.bundleStatus)) {
      return false;
    }
    if (!Objects.equals(this.bundleStatusMessage, getCommandStatusResponse.bundleStatusMessage)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(commandId, success, active, name, startTime, endTime, resultDataUrl, resultMessage, bundleStatus, bundleStatusMessage, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCommandStatusResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    resultDataUrl: ").append(toIndentedString(resultDataUrl)).append("\n");
    sb.append("    resultMessage: ").append(toIndentedString(resultMessage)).append("\n");
    sb.append("    bundleStatus: ").append(toIndentedString(bundleStatus)).append("\n");
    sb.append("    bundleStatusMessage: ").append(toIndentedString(bundleStatusMessage)).append("\n");
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

