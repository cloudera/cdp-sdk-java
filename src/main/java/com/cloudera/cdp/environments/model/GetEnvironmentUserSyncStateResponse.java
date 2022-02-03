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
 * Response object for retrieving the user sync state of an environment.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-02-02T18:44:24.591-08:00")
public class GetEnvironmentUserSyncStateResponse extends CdpResponse {

  /**
   * The user sync state of the environment.
   **/
  private String state = null;

  /**
   * Operation Id for the latest user sync operation, if any, run for this environment.
   **/
  private String userSyncOperationId = null;

  /**
   * Getter for state.
   * The user sync state of the environment.
   **/
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  /**
   * Setter for state.
   * The user sync state of the environment.
   **/
  public void setState(String state) {
    this.state = state;
  }

  /**
   * Getter for userSyncOperationId.
   * Operation Id for the latest user sync operation, if any, run for this environment.
   **/
  @JsonProperty("userSyncOperationId")
  public String getUserSyncOperationId() {
    return userSyncOperationId;
  }

  /**
   * Setter for userSyncOperationId.
   * Operation Id for the latest user sync operation, if any, run for this environment.
   **/
  public void setUserSyncOperationId(String userSyncOperationId) {
    this.userSyncOperationId = userSyncOperationId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEnvironmentUserSyncStateResponse getEnvironmentUserSyncStateResponse = (GetEnvironmentUserSyncStateResponse) o;
    if (!Objects.equals(this.state, getEnvironmentUserSyncStateResponse.state)) {
      return false;
    }
    if (!Objects.equals(this.userSyncOperationId, getEnvironmentUserSyncStateResponse.userSyncOperationId)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, userSyncOperationId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEnvironmentUserSyncStateResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    userSyncOperationId: ").append(toIndentedString(userSyncOperationId)).append("\n");
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

