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

package com.cloudera.cdp.lakehouseopt.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.lakehouseopt.model.HealthCheckResult;
import java.util.*;
import java.util.Map;

/**
 * Response object for health check.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-05T07:54:46.717-07:00")
public class GetHealthResponse extends CdpResponse {

  /**
   * Map containing the service wise health check result.
   **/
  private Map<String, HealthCheckResult> result = new HashMap<String, HealthCheckResult>();

  /**
   * Action performed. For example, READ or NOOP or CREATE.
   **/
  private String action = null;

  /**
   * Getter for result.
   * Map containing the service wise health check result.
   **/
  @JsonProperty("result")
  public Map<String, HealthCheckResult> getResult() {
    return result;
  }

  /**
   * Setter for result.
   * Map containing the service wise health check result.
   **/
  public void setResult(Map<String, HealthCheckResult> result) {
    this.result = result;
  }

  /**
   * Getter for action.
   * Action performed. For example, READ or NOOP or CREATE.
   **/
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  /**
   * Setter for action.
   * Action performed. For example, READ or NOOP or CREATE.
   **/
  public void setAction(String action) {
    this.action = action;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetHealthResponse getHealthResponse = (GetHealthResponse) o;
    if (!Objects.equals(this.result, getHealthResponse.result)) {
      return false;
    }
    if (!Objects.equals(this.action, getHealthResponse.action)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, action, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetHealthResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

