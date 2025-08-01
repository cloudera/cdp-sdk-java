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

package com.cloudera.cdp.datalake.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Response object to Data Lake database upgrade.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:42.225-07:00")
public class StartDatabaseUpgradeResponse extends CdpResponse {

  /**
   * The database engine major version to upgrade to.
   **/
  private String targetVersion = null;

  /**
   * Unique operation ID assigned to this command execution. Use this identifier with 'get-operation' to track status and retrieve detailed results.
   **/
  private String operationId = null;

  /**
   * Getter for targetVersion.
   * The database engine major version to upgrade to.
   **/
  @JsonProperty("targetVersion")
  public String getTargetVersion() {
    return targetVersion;
  }

  /**
   * Setter for targetVersion.
   * The database engine major version to upgrade to.
   **/
  public void setTargetVersion(String targetVersion) {
    this.targetVersion = targetVersion;
  }

  /**
   * Getter for operationId.
   * Unique operation ID assigned to this command execution. Use this identifier with &#39;get-operation&#39; to track status and retrieve detailed results.
   **/
  @JsonProperty("operationId")
  public String getOperationId() {
    return operationId;
  }

  /**
   * Setter for operationId.
   * Unique operation ID assigned to this command execution. Use this identifier with &#39;get-operation&#39; to track status and retrieve detailed results.
   **/
  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartDatabaseUpgradeResponse startDatabaseUpgradeResponse = (StartDatabaseUpgradeResponse) o;
    if (!Objects.equals(this.targetVersion, startDatabaseUpgradeResponse.targetVersion)) {
      return false;
    }
    if (!Objects.equals(this.operationId, startDatabaseUpgradeResponse.operationId)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetVersion, operationId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartDatabaseUpgradeResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
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

