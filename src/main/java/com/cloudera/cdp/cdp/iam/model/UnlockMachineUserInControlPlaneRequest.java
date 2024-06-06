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
 * Request object for unlocking the machine user in the control plane.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-06-05T15:30:59.971-07:00")
public class UnlockMachineUserInControlPlaneRequest  {

  /**
   * The name or CRN of the machine user to be unlocked in the CDP control plane.
   **/
  private String machineUser = null;

  /**
   * Getter for machineUser.
   * The name or CRN of the machine user to be unlocked in the CDP control plane.
   **/
  @JsonProperty("machineUser")
  public String getMachineUser() {
    return machineUser;
  }

  /**
   * Setter for machineUser.
   * The name or CRN of the machine user to be unlocked in the CDP control plane.
   **/
  public void setMachineUser(String machineUser) {
    this.machineUser = machineUser;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnlockMachineUserInControlPlaneRequest unlockMachineUserInControlPlaneRequest = (UnlockMachineUserInControlPlaneRequest) o;
    if (!Objects.equals(this.machineUser, unlockMachineUserInControlPlaneRequest.machineUser)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(machineUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnlockMachineUserInControlPlaneRequest {\n");
    sb.append("    machineUser: ").append(toIndentedString(machineUser)).append("\n");
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

