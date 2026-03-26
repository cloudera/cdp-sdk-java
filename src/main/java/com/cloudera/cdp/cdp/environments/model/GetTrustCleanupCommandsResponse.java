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
import com.cloudera.cdp.environments.model.ActiveDirectoryCommands;
import com.cloudera.cdp.environments.model.BaseClusterCommands;

/**
 * Response object to get trust clean up commands.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-25T09:53:05.855-07:00")
public class GetTrustCleanupCommandsResponse extends CdpResponse {

  /**
   * The Environment name or CRN.
   **/
  private String environment = null;

  /**
   * The KDC type of the environment.
   **/
  private String kdcType = null;

  /**
   * The commands to be run on the Active Directory server to cancel trust.
   **/
  private ActiveDirectoryCommands activeDirectoryCommands = null;

  /**
   * The commands to be run on the base cluster to cancel trust.
   **/
  private BaseClusterCommands baseClusterCommands = null;

  /**
   * Getter for environment.
   * The Environment name or CRN.
   **/
  @JsonProperty("environment")
  public String getEnvironment() {
    return environment;
  }

  /**
   * Setter for environment.
   * The Environment name or CRN.
   **/
  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  /**
   * Getter for kdcType.
   * The KDC type of the environment.
   **/
  @JsonProperty("kdcType")
  public String getKdcType() {
    return kdcType;
  }

  /**
   * Setter for kdcType.
   * The KDC type of the environment.
   **/
  public void setKdcType(String kdcType) {
    this.kdcType = kdcType;
  }

  /**
   * Getter for activeDirectoryCommands.
   * The commands to be run on the Active Directory server to cancel trust.
   **/
  @JsonProperty("activeDirectoryCommands")
  public ActiveDirectoryCommands getActiveDirectoryCommands() {
    return activeDirectoryCommands;
  }

  /**
   * Setter for activeDirectoryCommands.
   * The commands to be run on the Active Directory server to cancel trust.
   **/
  public void setActiveDirectoryCommands(ActiveDirectoryCommands activeDirectoryCommands) {
    this.activeDirectoryCommands = activeDirectoryCommands;
  }

  /**
   * Getter for baseClusterCommands.
   * The commands to be run on the base cluster to cancel trust.
   **/
  @JsonProperty("baseClusterCommands")
  public BaseClusterCommands getBaseClusterCommands() {
    return baseClusterCommands;
  }

  /**
   * Setter for baseClusterCommands.
   * The commands to be run on the base cluster to cancel trust.
   **/
  public void setBaseClusterCommands(BaseClusterCommands baseClusterCommands) {
    this.baseClusterCommands = baseClusterCommands;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTrustCleanupCommandsResponse getTrustCleanupCommandsResponse = (GetTrustCleanupCommandsResponse) o;
    if (!Objects.equals(this.environment, getTrustCleanupCommandsResponse.environment)) {
      return false;
    }
    if (!Objects.equals(this.kdcType, getTrustCleanupCommandsResponse.kdcType)) {
      return false;
    }
    if (!Objects.equals(this.activeDirectoryCommands, getTrustCleanupCommandsResponse.activeDirectoryCommands)) {
      return false;
    }
    if (!Objects.equals(this.baseClusterCommands, getTrustCleanupCommandsResponse.baseClusterCommands)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, kdcType, activeDirectoryCommands, baseClusterCommands, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTrustCleanupCommandsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    kdcType: ").append(toIndentedString(kdcType)).append("\n");
    sb.append("    activeDirectoryCommands: ").append(toIndentedString(activeDirectoryCommands)).append("\n");
    sb.append("    baseClusterCommands: ").append(toIndentedString(baseClusterCommands)).append("\n");
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

