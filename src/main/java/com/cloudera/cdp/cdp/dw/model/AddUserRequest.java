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
 * Request object for the addUser method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:40.786-07:00")
public class AddUserRequest  {

  /**
   * The ID of the cluster to which the user must be added.
   **/
  private String clusterId = null;

  /**
   * A cloud based unique identifier of the user (ARN for AWS users, groupId for Azure users).
   **/
  private String userId = null;

  /**
   * Getter for clusterId.
   * The ID of the cluster to which the user must be added.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * The ID of the cluster to which the user must be added.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for userId.
   * A cloud based unique identifier of the user (ARN for AWS users, groupId for Azure users).
   **/
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  /**
   * Setter for userId.
   * A cloud based unique identifier of the user (ARN for AWS users, groupId for Azure users).
   **/
  public void setUserId(String userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddUserRequest addUserRequest = (AddUserRequest) o;
    if (!Objects.equals(this.clusterId, addUserRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.userId, addUserRequest.userId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddUserRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

