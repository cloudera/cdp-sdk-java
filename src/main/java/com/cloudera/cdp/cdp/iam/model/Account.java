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
import com.cloudera.cdp.iam.model.WorkloadPasswordPolicy;

/**
 * Information about a Cloudera CDP account.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-26T09:46:36.718-07:00")
public class Account  {

  /**
   * Whether interactive login using Cloudera SSO is enabled for users who are not account administrators. Its default value is 'true'. When it is 'true', the account administrators, as well as non-administrator users can login through Cloudera SSO. When it is 'false', Cloudera SSO users who are not account administrators will not be able to login.
   **/
  private Boolean clouderaSSOLoginEnabled = null;

  /**
   * Whether login is enabled for Cloudera SSO users. It can only be set by Cloudera upon request and disables interactive login through Cloudera SSO. Note that restricting Cloudera SSO login will prevent account administrators from logging in interactively. Its default value is 'true'. When it is 'true', the Cloudera SSO interactive login behavior is controlled according to the existing `clouderaSSOLoginEnabled` flag. When it is 'false', it overrides the setting for `clouderaSSOLoginEnabled`.
   **/
  private Boolean clouderaSSOAllLoginEnabled = null;

  /**
   * The workload password policy object.
   **/
  private WorkloadPasswordPolicy workloadPasswordPolicy = null;

  /**
   * The machine user workload password policy object. May be omitted if no such policy was defined.
   **/
  private WorkloadPasswordPolicy machineUserWorkloadPasswordPolicy = null;

  /**
   * Getter for clouderaSSOLoginEnabled.
   * Whether interactive login using Cloudera SSO is enabled for users who are not account administrators. Its default value is &#39;true&#39;. When it is &#39;true&#39;, the account administrators, as well as non-administrator users can login through Cloudera SSO. When it is &#39;false&#39;, Cloudera SSO users who are not account administrators will not be able to login.
   **/
  @JsonProperty("clouderaSSOLoginEnabled")
  public Boolean getClouderaSSOLoginEnabled() {
    return clouderaSSOLoginEnabled;
  }

  /**
   * Setter for clouderaSSOLoginEnabled.
   * Whether interactive login using Cloudera SSO is enabled for users who are not account administrators. Its default value is &#39;true&#39;. When it is &#39;true&#39;, the account administrators, as well as non-administrator users can login through Cloudera SSO. When it is &#39;false&#39;, Cloudera SSO users who are not account administrators will not be able to login.
   **/
  public void setClouderaSSOLoginEnabled(Boolean clouderaSSOLoginEnabled) {
    this.clouderaSSOLoginEnabled = clouderaSSOLoginEnabled;
  }

  /**
   * Getter for clouderaSSOAllLoginEnabled.
   * Whether login is enabled for Cloudera SSO users. It can only be set by Cloudera upon request and disables interactive login through Cloudera SSO. Note that restricting Cloudera SSO login will prevent account administrators from logging in interactively. Its default value is &#39;true&#39;. When it is &#39;true&#39;, the Cloudera SSO interactive login behavior is controlled according to the existing &#x60;clouderaSSOLoginEnabled&#x60; flag. When it is &#39;false&#39;, it overrides the setting for &#x60;clouderaSSOLoginEnabled&#x60;.
   **/
  @JsonProperty("clouderaSSOAllLoginEnabled")
  public Boolean getClouderaSSOAllLoginEnabled() {
    return clouderaSSOAllLoginEnabled;
  }

  /**
   * Setter for clouderaSSOAllLoginEnabled.
   * Whether login is enabled for Cloudera SSO users. It can only be set by Cloudera upon request and disables interactive login through Cloudera SSO. Note that restricting Cloudera SSO login will prevent account administrators from logging in interactively. Its default value is &#39;true&#39;. When it is &#39;true&#39;, the Cloudera SSO interactive login behavior is controlled according to the existing &#x60;clouderaSSOLoginEnabled&#x60; flag. When it is &#39;false&#39;, it overrides the setting for &#x60;clouderaSSOLoginEnabled&#x60;.
   **/
  public void setClouderaSSOAllLoginEnabled(Boolean clouderaSSOAllLoginEnabled) {
    this.clouderaSSOAllLoginEnabled = clouderaSSOAllLoginEnabled;
  }

  /**
   * Getter for workloadPasswordPolicy.
   * The workload password policy object.
   **/
  @JsonProperty("workloadPasswordPolicy")
  public WorkloadPasswordPolicy getWorkloadPasswordPolicy() {
    return workloadPasswordPolicy;
  }

  /**
   * Setter for workloadPasswordPolicy.
   * The workload password policy object.
   **/
  public void setWorkloadPasswordPolicy(WorkloadPasswordPolicy workloadPasswordPolicy) {
    this.workloadPasswordPolicy = workloadPasswordPolicy;
  }

  /**
   * Getter for machineUserWorkloadPasswordPolicy.
   * The machine user workload password policy object. May be omitted if no such policy was defined.
   **/
  @JsonProperty("machineUserWorkloadPasswordPolicy")
  public WorkloadPasswordPolicy getMachineUserWorkloadPasswordPolicy() {
    return machineUserWorkloadPasswordPolicy;
  }

  /**
   * Setter for machineUserWorkloadPasswordPolicy.
   * The machine user workload password policy object. May be omitted if no such policy was defined.
   **/
  public void setMachineUserWorkloadPasswordPolicy(WorkloadPasswordPolicy machineUserWorkloadPasswordPolicy) {
    this.machineUserWorkloadPasswordPolicy = machineUserWorkloadPasswordPolicy;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    if (!Objects.equals(this.clouderaSSOLoginEnabled, account.clouderaSSOLoginEnabled)) {
      return false;
    }
    if (!Objects.equals(this.clouderaSSOAllLoginEnabled, account.clouderaSSOAllLoginEnabled)) {
      return false;
    }
    if (!Objects.equals(this.workloadPasswordPolicy, account.workloadPasswordPolicy)) {
      return false;
    }
    if (!Objects.equals(this.machineUserWorkloadPasswordPolicy, account.machineUserWorkloadPasswordPolicy)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clouderaSSOLoginEnabled, clouderaSSOAllLoginEnabled, workloadPasswordPolicy, machineUserWorkloadPasswordPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    clouderaSSOLoginEnabled: ").append(toIndentedString(clouderaSSOLoginEnabled)).append("\n");
    sb.append("    clouderaSSOAllLoginEnabled: ").append(toIndentedString(clouderaSSOAllLoginEnabled)).append("\n");
    sb.append("    workloadPasswordPolicy: ").append(toIndentedString(workloadPasswordPolicy)).append("\n");
    sb.append("    machineUserWorkloadPasswordPolicy: ").append(toIndentedString(machineUserWorkloadPasswordPolicy)).append("\n");
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

