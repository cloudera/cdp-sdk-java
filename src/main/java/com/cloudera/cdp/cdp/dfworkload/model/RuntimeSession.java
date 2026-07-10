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
import com.cloudera.cdp.dfworkload.model.DeploymentStatus;

/**
 * Provides details about a flow designer runtime session.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:56.373Z")
@com.cloudera.cdp.annotation.WorkloadApi
public class RuntimeSession  {

  /**
   * The workflow status of the deployment for the runtime session.
   **/
  private DeploymentStatus status = null;

  /**
   * The runtime status of the deployment for the runtime session.
   **/
  private DeploymentStatus runtimeStatus = null;

  /**
   * Runtime version of NiFi backing this session.
   **/
  private String runtimeVersion = null;

  /**
   * Timestamp of the creation of the runtime session.
   **/
  private Long createdTimestamp = null;

  /**
   * The CRN of the deployment for the runtime session.
   **/
  private String crn = null;

  /**
   * The name of the deployment for the runtime session.
   **/
  private String name = null;

  /**
   * Getter for status.
   * The workflow status of the deployment for the runtime session.
   **/
  @JsonProperty("status")
  public DeploymentStatus getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The workflow status of the deployment for the runtime session.
   **/
  public void setStatus(DeploymentStatus status) {
    this.status = status;
  }

  /**
   * Getter for runtimeStatus.
   * The runtime status of the deployment for the runtime session.
   **/
  @JsonProperty("runtimeStatus")
  public DeploymentStatus getRuntimeStatus() {
    return runtimeStatus;
  }

  /**
   * Setter for runtimeStatus.
   * The runtime status of the deployment for the runtime session.
   **/
  public void setRuntimeStatus(DeploymentStatus runtimeStatus) {
    this.runtimeStatus = runtimeStatus;
  }

  /**
   * Getter for runtimeVersion.
   * Runtime version of NiFi backing this session.
   **/
  @JsonProperty("runtimeVersion")
  public String getRuntimeVersion() {
    return runtimeVersion;
  }

  /**
   * Setter for runtimeVersion.
   * Runtime version of NiFi backing this session.
   **/
  public void setRuntimeVersion(String runtimeVersion) {
    this.runtimeVersion = runtimeVersion;
  }

  /**
   * Getter for createdTimestamp.
   * Timestamp of the creation of the runtime session.
   **/
  @JsonProperty("createdTimestamp")
  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

  /**
   * Setter for createdTimestamp.
   * Timestamp of the creation of the runtime session.
   **/
  public void setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }

  /**
   * Getter for crn.
   * The CRN of the deployment for the runtime session.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the deployment for the runtime session.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for name.
   * The name of the deployment for the runtime session.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the deployment for the runtime session.
   **/
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuntimeSession runtimeSession = (RuntimeSession) o;
    if (!Objects.equals(this.status, runtimeSession.status)) {
      return false;
    }
    if (!Objects.equals(this.runtimeStatus, runtimeSession.runtimeStatus)) {
      return false;
    }
    if (!Objects.equals(this.runtimeVersion, runtimeSession.runtimeVersion)) {
      return false;
    }
    if (!Objects.equals(this.createdTimestamp, runtimeSession.createdTimestamp)) {
      return false;
    }
    if (!Objects.equals(this.crn, runtimeSession.crn)) {
      return false;
    }
    if (!Objects.equals(this.name, runtimeSession.name)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, runtimeStatus, runtimeVersion, createdTimestamp, crn, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuntimeSession {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    runtimeStatus: ").append(toIndentedString(runtimeStatus)).append("\n");
    sb.append("    runtimeVersion: ").append(toIndentedString(runtimeVersion)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

