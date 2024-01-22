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
import java.util.*;

/**
 * Request object to set endpoint access gateway settings.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-01-19T13:24:34.433-08:00")
public class SetEndpointAccessGatewayRequest  {

  /**
   * The name or CRN of the environment. Empty to get system wide settings.
   **/
  private String environment = null;

  /**
   * The scheme for the endpoint gateway. PUBLIC creates an external endpoint that can be accessed over internet. Defaults to PRIVATE which restricts the traffic to be internal to the VPC / Vnet.
   **/
  private String endpointAccessGatewayScheme = null;

  /**
   * The subnets to use for endpoint access gateway.
   **/
  private List<String> endpointAccessGatewaySubnetIds = new ArrayList<String>();

  /**
   * Getter for environment.
   * The name or CRN of the environment. Empty to get system wide settings.
   **/
  @JsonProperty("environment")
  public String getEnvironment() {
    return environment;
  }

  /**
   * Setter for environment.
   * The name or CRN of the environment. Empty to get system wide settings.
   **/
  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  /**
   * Getter for endpointAccessGatewayScheme.
   * The scheme for the endpoint gateway. PUBLIC creates an external endpoint that can be accessed over internet. Defaults to PRIVATE which restricts the traffic to be internal to the VPC / Vnet.
   **/
  @JsonProperty("endpointAccessGatewayScheme")
  public String getEndpointAccessGatewayScheme() {
    return endpointAccessGatewayScheme;
  }

  /**
   * Setter for endpointAccessGatewayScheme.
   * The scheme for the endpoint gateway. PUBLIC creates an external endpoint that can be accessed over internet. Defaults to PRIVATE which restricts the traffic to be internal to the VPC / Vnet.
   **/
  public void setEndpointAccessGatewayScheme(String endpointAccessGatewayScheme) {
    this.endpointAccessGatewayScheme = endpointAccessGatewayScheme;
  }

  /**
   * Getter for endpointAccessGatewaySubnetIds.
   * The subnets to use for endpoint access gateway.
   **/
  @JsonProperty("endpointAccessGatewaySubnetIds")
  public List<String> getEndpointAccessGatewaySubnetIds() {
    return endpointAccessGatewaySubnetIds;
  }

  /**
   * Setter for endpointAccessGatewaySubnetIds.
   * The subnets to use for endpoint access gateway.
   **/
  public void setEndpointAccessGatewaySubnetIds(List<String> endpointAccessGatewaySubnetIds) {
    this.endpointAccessGatewaySubnetIds = endpointAccessGatewaySubnetIds;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetEndpointAccessGatewayRequest setEndpointAccessGatewayRequest = (SetEndpointAccessGatewayRequest) o;
    if (!Objects.equals(this.environment, setEndpointAccessGatewayRequest.environment)) {
      return false;
    }
    if (!Objects.equals(this.endpointAccessGatewayScheme, setEndpointAccessGatewayRequest.endpointAccessGatewayScheme)) {
      return false;
    }
    if (!Objects.equals(this.endpointAccessGatewaySubnetIds, setEndpointAccessGatewayRequest.endpointAccessGatewaySubnetIds)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, endpointAccessGatewayScheme, endpointAccessGatewaySubnetIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetEndpointAccessGatewayRequest {\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    endpointAccessGatewayScheme: ").append(toIndentedString(endpointAccessGatewayScheme)).append("\n");
    sb.append("    endpointAccessGatewaySubnetIds: ").append(toIndentedString(endpointAccessGatewaySubnetIds)).append("\n");
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

