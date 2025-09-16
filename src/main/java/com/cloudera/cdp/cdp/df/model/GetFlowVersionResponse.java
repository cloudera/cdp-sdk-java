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

package com.cloudera.cdp.df.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.Arrays;

/**
 * Response object for the GetFlowVersion method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-16T07:43:45.562-07:00")
public class GetFlowVersionResponse extends CdpResponse {

  /**
   * the flow definition.
   **/
  private byte[] flowDefinition = null;

  /**
   * Getter for flowDefinition.
   * the flow definition.
   **/
  @JsonProperty("flowDefinition")
  public byte[] getFlowDefinition() {
    return Arrays.copyOf(flowDefinition, flowDefinition.length);
  }

  /**
   * Setter for flowDefinition.
   * the flow definition.
   **/
  public void setFlowDefinition(byte[] flowDefinition) {
    this.flowDefinition = Arrays.copyOf(flowDefinition, flowDefinition.length);
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFlowVersionResponse getFlowVersionResponse = (GetFlowVersionResponse) o;
    if (!Objects.deepEquals(this.flowDefinition, getFlowVersionResponse.flowDefinition)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(flowDefinition), super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFlowVersionResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    flowDefinition: ").append(toIndentedString(flowDefinition)).append("\n");
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

