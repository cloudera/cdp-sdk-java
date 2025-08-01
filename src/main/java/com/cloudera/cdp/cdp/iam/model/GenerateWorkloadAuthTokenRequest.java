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
 * Request object for GenerateWorkloadAuthToken method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:44.034-07:00")
public class GenerateWorkloadAuthTokenRequest  {

  /**
   * The workload name
   **/
  private String workloadName = null;

  /**
   * The environment CRN, required by DF.
   **/
  private String environmentCrn = null;

  /**
   * Getter for workloadName.
   * The workload name
   **/
  @JsonProperty("workloadName")
  public String getWorkloadName() {
    return workloadName;
  }

  /**
   * Setter for workloadName.
   * The workload name
   **/
  public void setWorkloadName(String workloadName) {
    this.workloadName = workloadName;
  }

  /**
   * Getter for environmentCrn.
   * The environment CRN, required by DF.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The environment CRN, required by DF.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateWorkloadAuthTokenRequest generateWorkloadAuthTokenRequest = (GenerateWorkloadAuthTokenRequest) o;
    if (!Objects.equals(this.workloadName, generateWorkloadAuthTokenRequest.workloadName)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, generateWorkloadAuthTokenRequest.environmentCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(workloadName, environmentCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateWorkloadAuthTokenRequest {\n");
    sb.append("    workloadName: ").append(toIndentedString(workloadName)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
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

