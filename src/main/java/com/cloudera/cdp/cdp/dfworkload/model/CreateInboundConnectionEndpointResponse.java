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

package com.cloudera.cdp.dfworkload.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.dfworkload.model.InboundConnectionEndpointSummary;

/**
 * Response object returned during Inbound Connection Endpoint creation
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-01-05T09:16:32.783-08:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class CreateInboundConnectionEndpointResponse extends CdpResponse {

  /**
   * Data that describes the Inbound Connection Endpoint.
   **/
  private InboundConnectionEndpointSummary inboundConnectionEndpointSummary = null;

  /**
   * Getter for inboundConnectionEndpointSummary.
   * Data that describes the Inbound Connection Endpoint.
   **/
  @JsonProperty("inboundConnectionEndpointSummary")
  public InboundConnectionEndpointSummary getInboundConnectionEndpointSummary() {
    return inboundConnectionEndpointSummary;
  }

  /**
   * Setter for inboundConnectionEndpointSummary.
   * Data that describes the Inbound Connection Endpoint.
   **/
  public void setInboundConnectionEndpointSummary(InboundConnectionEndpointSummary inboundConnectionEndpointSummary) {
    this.inboundConnectionEndpointSummary = inboundConnectionEndpointSummary;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInboundConnectionEndpointResponse createInboundConnectionEndpointResponse = (CreateInboundConnectionEndpointResponse) o;
    if (!Objects.equals(this.inboundConnectionEndpointSummary, createInboundConnectionEndpointResponse.inboundConnectionEndpointSummary)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(inboundConnectionEndpointSummary, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInboundConnectionEndpointResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inboundConnectionEndpointSummary: ").append(toIndentedString(inboundConnectionEndpointSummary)).append("\n");
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

