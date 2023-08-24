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
 * Response object of the upgradeDbc call.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-08-24T14:47:21.855-07:00")
public class UpgradeDbcResponse extends CdpResponse {

  /**
   * The upgrade status. Possible values are: Upgrading, Error, Failed.
   **/
  private String status = null;

  /**
   * The Upgrade message.
   **/
  private String message = null;

  /**
   * True if the upgrade timed out, false or omitted otherwise.
   **/
  private Boolean timedOut = null;

  /**
   * True, if the service is in unhealthy state, false or omitted otherwise.
   **/
  private Boolean serviceUnhealthy = null;

  /**
   * Getter for status.
   * The upgrade status. Possible values are: Upgrading, Error, Failed.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The upgrade status. Possible values are: Upgrading, Error, Failed.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for message.
   * The Upgrade message.
   **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Setter for message.
   * The Upgrade message.
   **/
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Getter for timedOut.
   * True if the upgrade timed out, false or omitted otherwise.
   **/
  @JsonProperty("timedOut")
  public Boolean getTimedOut() {
    return timedOut;
  }

  /**
   * Setter for timedOut.
   * True if the upgrade timed out, false or omitted otherwise.
   **/
  public void setTimedOut(Boolean timedOut) {
    this.timedOut = timedOut;
  }

  /**
   * Getter for serviceUnhealthy.
   * True, if the service is in unhealthy state, false or omitted otherwise.
   **/
  @JsonProperty("serviceUnhealthy")
  public Boolean getServiceUnhealthy() {
    return serviceUnhealthy;
  }

  /**
   * Setter for serviceUnhealthy.
   * True, if the service is in unhealthy state, false or omitted otherwise.
   **/
  public void setServiceUnhealthy(Boolean serviceUnhealthy) {
    this.serviceUnhealthy = serviceUnhealthy;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeDbcResponse upgradeDbcResponse = (UpgradeDbcResponse) o;
    if (!Objects.equals(this.status, upgradeDbcResponse.status)) {
      return false;
    }
    if (!Objects.equals(this.message, upgradeDbcResponse.message)) {
      return false;
    }
    if (!Objects.equals(this.timedOut, upgradeDbcResponse.timedOut)) {
      return false;
    }
    if (!Objects.equals(this.serviceUnhealthy, upgradeDbcResponse.serviceUnhealthy)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, timedOut, serviceUnhealthy, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeDbcResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    timedOut: ").append(toIndentedString(timedOut)).append("\n");
    sb.append("    serviceUnhealthy: ").append(toIndentedString(serviceUnhealthy)).append("\n");
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

