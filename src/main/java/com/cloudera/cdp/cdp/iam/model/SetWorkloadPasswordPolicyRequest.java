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
import com.cloudera.cdp.iam.model.PasswordPolicy;

/**
 * Request object for a set workload password policy request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-11T11:26:11.241-08:00")
public class SetWorkloadPasswordPolicyRequest  {

  /**
   * The global password policy object. If set, maxPasswordLifetimeDays is ignored, and if not set the default values for the different password policies are used. See PasswordPolicy for more details on the different default values.
   **/
  private PasswordPolicy globalPasswordPolicy = null;

  /**
   * The password policy object for machine users. If set, this will be used for enforcing password complexity for machine users instead of the global password policy.
   **/
  private PasswordPolicy machineUsersPasswordPolicy = null;

  /**
   * Getter for globalPasswordPolicy.
   * The global password policy object. If set, maxPasswordLifetimeDays is ignored, and if not set the default values for the different password policies are used. See PasswordPolicy for more details on the different default values.
   **/
  @JsonProperty("globalPasswordPolicy")
  public PasswordPolicy getGlobalPasswordPolicy() {
    return globalPasswordPolicy;
  }

  /**
   * Setter for globalPasswordPolicy.
   * The global password policy object. If set, maxPasswordLifetimeDays is ignored, and if not set the default values for the different password policies are used. See PasswordPolicy for more details on the different default values.
   **/
  public void setGlobalPasswordPolicy(PasswordPolicy globalPasswordPolicy) {
    this.globalPasswordPolicy = globalPasswordPolicy;
  }

  /**
   * Getter for machineUsersPasswordPolicy.
   * The password policy object for machine users. If set, this will be used for enforcing password complexity for machine users instead of the global password policy.
   **/
  @JsonProperty("machineUsersPasswordPolicy")
  public PasswordPolicy getMachineUsersPasswordPolicy() {
    return machineUsersPasswordPolicy;
  }

  /**
   * Setter for machineUsersPasswordPolicy.
   * The password policy object for machine users. If set, this will be used for enforcing password complexity for machine users instead of the global password policy.
   **/
  public void setMachineUsersPasswordPolicy(PasswordPolicy machineUsersPasswordPolicy) {
    this.machineUsersPasswordPolicy = machineUsersPasswordPolicy;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetWorkloadPasswordPolicyRequest setWorkloadPasswordPolicyRequest = (SetWorkloadPasswordPolicyRequest) o;
    if (!Objects.equals(this.globalPasswordPolicy, setWorkloadPasswordPolicyRequest.globalPasswordPolicy)) {
      return false;
    }
    if (!Objects.equals(this.machineUsersPasswordPolicy, setWorkloadPasswordPolicyRequest.machineUsersPasswordPolicy)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(globalPasswordPolicy, machineUsersPasswordPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetWorkloadPasswordPolicyRequest {\n");
    sb.append("    globalPasswordPolicy: ").append(toIndentedString(globalPasswordPolicy)).append("\n");
    sb.append("    machineUsersPasswordPolicy: ").append(toIndentedString(machineUsersPasswordPolicy)).append("\n");
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

