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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for Sync Status.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-23T07:12:40.736-08:00")
public class LastSyncStatusRequest  {

  /**
   * Name or Crn of the environment.
   **/
  private String envNameOrCrn = null;

  /**
   * Getter for envNameOrCrn.
   * Name or Crn of the environment.
   **/
  @JsonProperty("envNameOrCrn")
  public String getEnvNameOrCrn() {
    return envNameOrCrn;
  }

  /**
   * Setter for envNameOrCrn.
   * Name or Crn of the environment.
   **/
  public void setEnvNameOrCrn(String envNameOrCrn) {
    this.envNameOrCrn = envNameOrCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LastSyncStatusRequest lastSyncStatusRequest = (LastSyncStatusRequest) o;
    if (!Objects.equals(this.envNameOrCrn, lastSyncStatusRequest.envNameOrCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(envNameOrCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastSyncStatusRequest {\n");
    sb.append("    envNameOrCrn: ").append(toIndentedString(envNameOrCrn)).append("\n");
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

