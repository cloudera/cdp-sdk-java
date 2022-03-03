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
 * Request object for a unset workload password policy request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-03-03T11:50:47.349-08:00")
public class UnsetWorkloadPasswordPolicyRequest  {

  /**
   * Whether to unset the global password policy. This will reset the global policy to its defaults.
   **/
  private Boolean unsetGlobalPasswordPolicy = null;

  /**
   * Whether to unset the machine user password policy, if one exists.
   **/
  private Boolean unsetMachineUsersPasswordPolicy = null;

  /**
   * Getter for unsetGlobalPasswordPolicy.
   * Whether to unset the global password policy. This will reset the global policy to its defaults.
   **/
  @JsonProperty("unsetGlobalPasswordPolicy")
  public Boolean getUnsetGlobalPasswordPolicy() {
    return unsetGlobalPasswordPolicy;
  }

  /**
   * Setter for unsetGlobalPasswordPolicy.
   * Whether to unset the global password policy. This will reset the global policy to its defaults.
   **/
  public void setUnsetGlobalPasswordPolicy(Boolean unsetGlobalPasswordPolicy) {
    this.unsetGlobalPasswordPolicy = unsetGlobalPasswordPolicy;
  }

  /**
   * Getter for unsetMachineUsersPasswordPolicy.
   * Whether to unset the machine user password policy, if one exists.
   **/
  @JsonProperty("unsetMachineUsersPasswordPolicy")
  public Boolean getUnsetMachineUsersPasswordPolicy() {
    return unsetMachineUsersPasswordPolicy;
  }

  /**
   * Setter for unsetMachineUsersPasswordPolicy.
   * Whether to unset the machine user password policy, if one exists.
   **/
  public void setUnsetMachineUsersPasswordPolicy(Boolean unsetMachineUsersPasswordPolicy) {
    this.unsetMachineUsersPasswordPolicy = unsetMachineUsersPasswordPolicy;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnsetWorkloadPasswordPolicyRequest unsetWorkloadPasswordPolicyRequest = (UnsetWorkloadPasswordPolicyRequest) o;
    if (!Objects.equals(this.unsetGlobalPasswordPolicy, unsetWorkloadPasswordPolicyRequest.unsetGlobalPasswordPolicy)) {
      return false;
    }
    if (!Objects.equals(this.unsetMachineUsersPasswordPolicy, unsetWorkloadPasswordPolicyRequest.unsetMachineUsersPasswordPolicy)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(unsetGlobalPasswordPolicy, unsetMachineUsersPasswordPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnsetWorkloadPasswordPolicyRequest {\n");
    sb.append("    unsetGlobalPasswordPolicy: ").append(toIndentedString(unsetGlobalPasswordPolicy)).append("\n");
    sb.append("    unsetMachineUsersPasswordPolicy: ").append(toIndentedString(unsetMachineUsersPasswordPolicy)).append("\n");
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

