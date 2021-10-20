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

package com.cloudera.cdp.iam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for create machine user request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-10-20T13:23:29.978-07:00")
public class CreateMachineUserRequest  {

  /**
   * The name to use for the new machine user. The name must be an alpha numeric string, including '-' and '_', cannot start with '__' (double underscore) and cannot be longer than 128 characters. Only one machine user with this name can exist in an account at a given time.
   **/
  private String machineUserName = null;

  /**
   * Getter for machineUserName.
   * The name to use for the new machine user. The name must be an alpha numeric string, including &#39;-&#39; and &#39;_&#39;, cannot start with &#39;__&#39; (double underscore) and cannot be longer than 128 characters. Only one machine user with this name can exist in an account at a given time.
   **/
  @JsonProperty("machineUserName")
  public String getMachineUserName() {
    return machineUserName;
  }

  /**
   * Setter for machineUserName.
   * The name to use for the new machine user. The name must be an alpha numeric string, including &#39;-&#39; and &#39;_&#39;, cannot start with &#39;__&#39; (double underscore) and cannot be longer than 128 characters. Only one machine user with this name can exist in an account at a given time.
   **/
  public void setMachineUserName(String machineUserName) {
    this.machineUserName = machineUserName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMachineUserRequest createMachineUserRequest = (CreateMachineUserRequest) o;
    if (!Objects.equals(this.machineUserName, createMachineUserRequest.machineUserName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(machineUserName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMachineUserRequest {\n");
    sb.append("    machineUserName: ").append(toIndentedString(machineUserName)).append("\n");
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

