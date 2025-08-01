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

package com.cloudera.cdp.replicationmanager.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request to download the diagnostic bundle for the given cluster and command id.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:45.641-07:00")
public class DownloadDiagnosticBundleRequest  {

  /**
   * The CRN of the target cluster.
   **/
  private String clusterCrn = null;

  /**
   * The command ID from the response of collect-diagnostic-bundle command.
   **/
  private String commandId = null;

  /**
   * Getter for clusterCrn.
   * The CRN of the target cluster.
   **/
  @JsonProperty("clusterCrn")
  public String getClusterCrn() {
    return clusterCrn;
  }

  /**
   * Setter for clusterCrn.
   * The CRN of the target cluster.
   **/
  public void setClusterCrn(String clusterCrn) {
    this.clusterCrn = clusterCrn;
  }

  /**
   * Getter for commandId.
   * The command ID from the response of collect-diagnostic-bundle command.
   **/
  @JsonProperty("commandId")
  public String getCommandId() {
    return commandId;
  }

  /**
   * Setter for commandId.
   * The command ID from the response of collect-diagnostic-bundle command.
   **/
  public void setCommandId(String commandId) {
    this.commandId = commandId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadDiagnosticBundleRequest downloadDiagnosticBundleRequest = (DownloadDiagnosticBundleRequest) o;
    if (!Objects.equals(this.clusterCrn, downloadDiagnosticBundleRequest.clusterCrn)) {
      return false;
    }
    if (!Objects.equals(this.commandId, downloadDiagnosticBundleRequest.commandId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterCrn, commandId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadDiagnosticBundleRequest {\n");
    sb.append("    clusterCrn: ").append(toIndentedString(clusterCrn)).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
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

