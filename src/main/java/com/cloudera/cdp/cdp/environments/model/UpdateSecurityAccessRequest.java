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
 * The request object for updating security access of the given environment.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-03-27T12:18:19.900-07:00")
public class UpdateSecurityAccessRequest  {

  /**
   * The name or the CRN of the environment.
   **/
  private String environment = null;

  /**
   * Security group ID where Knox-enabled hosts are placed.
   **/
  private String gatewayNodeSecurityGroupId = null;

  /**
   * Security group ID for non-gateway nodes.
   **/
  private String defaultSecurityGroupId = null;

  /**
   * Getter for environment.
   * The name or the CRN of the environment.
   **/
  @JsonProperty("environment")
  public String getEnvironment() {
    return environment;
  }

  /**
   * Setter for environment.
   * The name or the CRN of the environment.
   **/
  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  /**
   * Getter for gatewayNodeSecurityGroupId.
   * Security group ID where Knox-enabled hosts are placed.
   **/
  @JsonProperty("gatewayNodeSecurityGroupId")
  public String getGatewayNodeSecurityGroupId() {
    return gatewayNodeSecurityGroupId;
  }

  /**
   * Setter for gatewayNodeSecurityGroupId.
   * Security group ID where Knox-enabled hosts are placed.
   **/
  public void setGatewayNodeSecurityGroupId(String gatewayNodeSecurityGroupId) {
    this.gatewayNodeSecurityGroupId = gatewayNodeSecurityGroupId;
  }

  /**
   * Getter for defaultSecurityGroupId.
   * Security group ID for non-gateway nodes.
   **/
  @JsonProperty("defaultSecurityGroupId")
  public String getDefaultSecurityGroupId() {
    return defaultSecurityGroupId;
  }

  /**
   * Setter for defaultSecurityGroupId.
   * Security group ID for non-gateway nodes.
   **/
  public void setDefaultSecurityGroupId(String defaultSecurityGroupId) {
    this.defaultSecurityGroupId = defaultSecurityGroupId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSecurityAccessRequest updateSecurityAccessRequest = (UpdateSecurityAccessRequest) o;
    if (!Objects.equals(this.environment, updateSecurityAccessRequest.environment)) {
      return false;
    }
    if (!Objects.equals(this.gatewayNodeSecurityGroupId, updateSecurityAccessRequest.gatewayNodeSecurityGroupId)) {
      return false;
    }
    if (!Objects.equals(this.defaultSecurityGroupId, updateSecurityAccessRequest.defaultSecurityGroupId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, gatewayNodeSecurityGroupId, defaultSecurityGroupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSecurityAccessRequest {\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    gatewayNodeSecurityGroupId: ").append(toIndentedString(gatewayNodeSecurityGroupId)).append("\n");
    sb.append("    defaultSecurityGroupId: ").append(toIndentedString(defaultSecurityGroupId)).append("\n");
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

