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

/**
 * Request object for a start environment request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-09-27T13:27:53.061-07:00")
public class StartEnvironmentRequest  {

  /**
   * The name or CRN of the environment.
   **/
  private String environmentName = null;

  /**
   * Whether the Data Hub clusters should start or not at the environment (re-)start
   **/
  private Boolean withDatahubStart = null;

  /**
   * Getter for environmentName.
   * The name or CRN of the environment.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The name or CRN of the environment.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for withDatahubStart.
   * Whether the Data Hub clusters should start or not at the environment (re-)start
   **/
  @JsonProperty("withDatahubStart")
  public Boolean getWithDatahubStart() {
    return withDatahubStart;
  }

  /**
   * Setter for withDatahubStart.
   * Whether the Data Hub clusters should start or not at the environment (re-)start
   **/
  public void setWithDatahubStart(Boolean withDatahubStart) {
    this.withDatahubStart = withDatahubStart;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartEnvironmentRequest startEnvironmentRequest = (StartEnvironmentRequest) o;
    if (!Objects.equals(this.environmentName, startEnvironmentRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.withDatahubStart, startEnvironmentRequest.withDatahubStart)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, withDatahubStart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartEnvironmentRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    withDatahubStart: ").append(toIndentedString(withDatahubStart)).append("\n");
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

