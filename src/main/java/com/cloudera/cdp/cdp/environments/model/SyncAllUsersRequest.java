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
import java.util.*;

/**
 * Request object for a All Users and Groups Sync.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-28T14:00:28.895-07:00")
public class SyncAllUsersRequest  {

  /**
   * List of environments to be synced. If not present, all environments will be synced.
   **/
  private List<String> environmentNames = new ArrayList<String>();

  /**
   * Getter for environmentNames.
   * List of environments to be synced. If not present, all environments will be synced.
   **/
  @JsonProperty("environmentNames")
  public List<String> getEnvironmentNames() {
    return environmentNames;
  }

  /**
   * Setter for environmentNames.
   * List of environments to be synced. If not present, all environments will be synced.
   **/
  public void setEnvironmentNames(List<String> environmentNames) {
    this.environmentNames = environmentNames;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncAllUsersRequest syncAllUsersRequest = (SyncAllUsersRequest) o;
    if (!Objects.equals(this.environmentNames, syncAllUsersRequest.environmentNames)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncAllUsersRequest {\n");
    sb.append("    environmentNames: ").append(toIndentedString(environmentNames)).append("\n");
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

