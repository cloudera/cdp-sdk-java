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
 * Information about the workload password policy for an account.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-03-17T13:24:57.399-07:00")
public class WorkloadPasswordPolicy  {

  /**
   * The max lifetime, in days, of the password. If '0' passwords never expire.
   **/
  private Integer maxPasswordLifetimeDays = null;

  /**
   * Getter for maxPasswordLifetimeDays.
   * The max lifetime, in days, of the password. If &#39;0&#39; passwords never expire.
   **/
  @JsonProperty("maxPasswordLifetimeDays")
  public Integer getMaxPasswordLifetimeDays() {
    return maxPasswordLifetimeDays;
  }

  /**
   * Setter for maxPasswordLifetimeDays.
   * The max lifetime, in days, of the password. If &#39;0&#39; passwords never expire.
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
    WorkloadPasswordPolicy workloadPasswordPolicy = (WorkloadPasswordPolicy) o;
    if (!Objects.equals(this.maxPasswordLifetimeDays, workloadPasswordPolicy.maxPasswordLifetimeDays)) {
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
    sb.append("class WorkloadPasswordPolicy {\n");
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

