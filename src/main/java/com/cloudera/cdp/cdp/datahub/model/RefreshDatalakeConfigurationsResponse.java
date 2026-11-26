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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Response object for refreshing Data Lake configurations.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-11-25T15:42:43.982Z")
public class RefreshDatalakeConfigurationsResponse extends CdpResponse {

  /**
   * Flow ID of started operation.
   **/
  private String flowId = null;

  /**
   * Flow Type of started operation.
   **/
  private String type = null;

  /**
   * Getter for flowId.
   * Flow ID of started operation.
   **/
  @JsonProperty("flowId")
  public String getFlowId() {
    return flowId;
  }

  /**
   * Setter for flowId.
   * Flow ID of started operation.
   **/
  public void setFlowId(String flowId) {
    this.flowId = flowId;
  }

  /**
   * Getter for type.
   * Flow Type of started operation.
   **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Setter for type.
   * Flow Type of started operation.
   **/
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefreshDatalakeConfigurationsResponse refreshDatalakeConfigurationsResponse = (RefreshDatalakeConfigurationsResponse) o;
    if (!Objects.equals(this.flowId, refreshDatalakeConfigurationsResponse.flowId)) {
      return false;
    }
    if (!Objects.equals(this.type, refreshDatalakeConfigurationsResponse.type)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowId, type, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefreshDatalakeConfigurationsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

