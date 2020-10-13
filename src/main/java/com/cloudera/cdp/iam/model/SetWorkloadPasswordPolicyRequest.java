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
 * Request object for a set workload password policy request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2020-10-13T09:35:49.549-07:00")
public class SetWorkloadPasswordPolicyRequest  {

  /**
   * The max lifetime of passwords, in days. If set to '0' passwords never expires.
   **/
  private Integer maxPasswordLifetimeDays = null;

  /**
   * Getter for maxPasswordLifetimeDays.
   * The max lifetime of passwords, in days. If set to &#39;0&#39; passwords never expires.
   **/
  @JsonProperty("maxPasswordLifetimeDays")
  public Integer getMaxPasswordLifetimeDays() {
    return maxPasswordLifetimeDays;
  }

  /**
   * Setter for maxPasswordLifetimeDays.
   * The max lifetime of passwords, in days. If set to &#39;0&#39; passwords never expires.
   **/
  public void setMaxPasswordLifetimeDays(Integer maxPasswordLifetimeDays) {
    this.maxPasswordLifetimeDays = maxPasswordLifetimeDays;
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
    if (!Objects.equals(this.maxPasswordLifetimeDays, setWorkloadPasswordPolicyRequest.maxPasswordLifetimeDays)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxPasswordLifetimeDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetWorkloadPasswordPolicyRequest {\n");
    sb.append("    maxPasswordLifetimeDays: ").append(toIndentedString(maxPasswordLifetimeDays)).append("\n");
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

