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
 * Information about a Cloudera Altus account.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2020-04-07T22:32:19.282-07:00")
public class Account  {

  /**
   * Whether interactive login using Cloudera SSO is enabled.
   **/
  private Boolean clouderaSSOLoginEnabled = null;

  /**
   * The workload password policy object.
   **/
  private WorkloadPasswordPolicy workloadPasswordPolicy = null;

  /**
   * Getter for clouderaSSOLoginEnabled.
   * Whether interactive login using Cloudera SSO is enabled.
   **/
  @JsonProperty("clouderaSSOLoginEnabled")
  public Boolean getClouderaSSOLoginEnabled() {
    return clouderaSSOLoginEnabled;
  }

  /**
   * Setter for clouderaSSOLoginEnabled.
   * Whether interactive login using Cloudera SSO is enabled.
   **/
  public void setClouderaSSOLoginEnabled(Boolean clouderaSSOLoginEnabled) {
    this.clouderaSSOLoginEnabled = clouderaSSOLoginEnabled;
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
    if (!Objects.equals(this.workloadPasswordPolicy, account.workloadPasswordPolicy)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clouderaSSOLoginEnabled, workloadPasswordPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    clouderaSSOLoginEnabled: ").append(toIndentedString(clouderaSSOLoginEnabled)).append("\n");
    sb.append("    workloadPasswordPolicy: ").append(toIndentedString(workloadPasswordPolicy)).append("\n");
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

