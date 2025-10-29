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
import com.cloudera.cdp.datalake.model.DatalakeResourceTag;
import java.util.*;

/**
 * Datalake resize response.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-28T14:00:28.143-07:00")
public class ResizeDatalakeResponse extends CdpResponse {

  /**
   * The name of the datalake. This will remain the same for the datalake created by the resize process.
   **/
  private String datalakeName = null;

  /**
   * The CRN of the datalake. This will remain the same for the datalake created by the resize process.
   **/
  private String datalakeCrn = null;

  /**
   * The CRN of the environment the datalake is attached to. This will remain the same for the datalake created by the resize process.
   **/
  private String environmentCrn = null;

  /**
   * The runtime of the datalake. This will remain the same for the datalake created by the resize process.
   **/
  private String runtime = null;

  /**
   * The current status of the datalake.
   **/
  private String status = null;

  /**
   * The reason for the current status of the datalake.
   **/
  private String statusReason = null;

  /**
   * The Cloudbreak version used to create the data lake.
   **/
  private String cloudbreakVersion = null;

  /**
   * Datalake tags object containing the tag values defined for the datalake.
   **/
  private List<DatalakeResourceTag> tags = new ArrayList<DatalakeResourceTag>();

  /**
   * Unique operation ID assigned to this command execution. Use this identifier with 'get-operation' to track status and retrieve detailed results.
   **/
  private String operationId = null;

  /**
   * Getter for datalakeName.
   * The name of the datalake. This will remain the same for the datalake created by the resize process.
   **/
  @JsonProperty("datalakeName")
  public String getDatalakeName() {
    return datalakeName;
  }

  /**
   * Setter for datalakeName.
   * The name of the datalake. This will remain the same for the datalake created by the resize process.
   **/
  public void setDatalakeName(String datalakeName) {
    this.datalakeName = datalakeName;
  }

  /**
   * Getter for datalakeCrn.
   * The CRN of the datalake. This will remain the same for the datalake created by the resize process.
   **/
  @JsonProperty("datalakeCrn")
  public String getDatalakeCrn() {
    return datalakeCrn;
  }

  /**
   * Setter for datalakeCrn.
   * The CRN of the datalake. This will remain the same for the datalake created by the resize process.
   **/
  public void setDatalakeCrn(String datalakeCrn) {
    this.datalakeCrn = datalakeCrn;
  }

  /**
   * Getter for environmentCrn.
   * The CRN of the environment the datalake is attached to. This will remain the same for the datalake created by the resize process.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of the environment the datalake is attached to. This will remain the same for the datalake created by the resize process.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for runtime.
   * The runtime of the datalake. This will remain the same for the datalake created by the resize process.
   **/
  @JsonProperty("runtime")
  public String getRuntime() {
    return runtime;
  }

  /**
   * Setter for runtime.
   * The runtime of the datalake. This will remain the same for the datalake created by the resize process.
   **/
  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }

  /**
   * Getter for status.
   * The current status of the datalake.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The current status of the datalake.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for statusReason.
   * The reason for the current status of the datalake.
   **/
  @JsonProperty("statusReason")
  public String getStatusReason() {
    return statusReason;
  }

  /**
   * Setter for statusReason.
   * The reason for the current status of the datalake.
   **/
  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }

  /**
   * Getter for cloudbreakVersion.
   * The Cloudbreak version used to create the data lake.
   **/
  @JsonProperty("cloudbreakVersion")
  public String getCloudbreakVersion() {
    return cloudbreakVersion;
  }

  /**
   * Setter for cloudbreakVersion.
   * The Cloudbreak version used to create the data lake.
   **/
  public void setCloudbreakVersion(String cloudbreakVersion) {
    this.cloudbreakVersion = cloudbreakVersion;
  }

  /**
   * Getter for tags.
   * Datalake tags object containing the tag values defined for the datalake.
   **/
  @JsonProperty("tags")
  public List<DatalakeResourceTag> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Datalake tags object containing the tag values defined for the datalake.
   **/
  public void setTags(List<DatalakeResourceTag> tags) {
    this.tags = tags;
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
    ResizeDatalakeResponse resizeDatalakeResponse = (ResizeDatalakeResponse) o;
    if (!Objects.equals(this.datalakeName, resizeDatalakeResponse.datalakeName)) {
      return false;
    }
    if (!Objects.equals(this.datalakeCrn, resizeDatalakeResponse.datalakeCrn)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, resizeDatalakeResponse.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.runtime, resizeDatalakeResponse.runtime)) {
      return false;
    }
    if (!Objects.equals(this.status, resizeDatalakeResponse.status)) {
      return false;
    }
    if (!Objects.equals(this.statusReason, resizeDatalakeResponse.statusReason)) {
      return false;
    }
    if (!Objects.equals(this.cloudbreakVersion, resizeDatalakeResponse.cloudbreakVersion)) {
      return false;
    }
    if (!Objects.equals(this.tags, resizeDatalakeResponse.tags)) {
      return false;
    }
    if (!Objects.equals(this.operationId, resizeDatalakeResponse.operationId)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeName, datalakeCrn, environmentCrn, runtime, status, statusReason, cloudbreakVersion, tags, operationId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResizeDatalakeResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    datalakeName: ").append(toIndentedString(datalakeName)).append("\n");
    sb.append("    datalakeCrn: ").append(toIndentedString(datalakeCrn)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    cloudbreakVersion: ").append(toIndentedString(cloudbreakVersion)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

