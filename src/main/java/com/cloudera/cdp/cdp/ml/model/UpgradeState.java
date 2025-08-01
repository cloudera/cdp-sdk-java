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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Response object for the workbench summary.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:41.723-07:00")
public class UpgradeState  {

  /**
   * The current upgrade state of the workbench.
   **/
  private String state = null;

  /**
   * The reason for the current state.
   **/
  private String reason = null;

  /**
   * Getter for state.
   * The current upgrade state of the workbench.
   **/
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  /**
   * Setter for state.
   * The current upgrade state of the workbench.
   **/
  public void setState(String state) {
    this.state = state;
  }

  /**
   * Getter for reason.
   * The reason for the current state.
   **/
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  /**
   * Setter for reason.
   * The reason for the current state.
   **/
  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeState upgradeState = (UpgradeState) o;
    if (!Objects.equals(this.state, upgradeState.state)) {
      return false;
    }
    if (!Objects.equals(this.reason, upgradeState.reason)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeState {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

