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

/**
 * Request object for creating a reporting task
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-14T06:50:08.936-08:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class CreateReportingTaskRequest  {

  /**
   * The CRN of an environment to execute the command.
   **/
  private String environmentCrn = null;

  /**
   * The full local path to the file containing the reporting task definition
   **/
  private String filePath = null;

  /**
   * The CRN of the deployment.
   **/
  private String deploymentCrn = null;

  /**
   * Getter for environmentCrn.
   * The CRN of an environment to execute the command.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of an environment to execute the command.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for filePath.
   * The full local path to the file containing the reporting task definition
   **/
  @JsonProperty("filePath")
  public String getFilePath() {
    return filePath;
  }

  /**
   * Setter for filePath.
   * The full local path to the file containing the reporting task definition
   **/
  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  /**
   * Getter for deploymentCrn.
   * The CRN of the deployment.
   **/
  @JsonProperty("deploymentCrn")
  public String getDeploymentCrn() {
    return deploymentCrn;
  }

  /**
   * Setter for deploymentCrn.
   * The CRN of the deployment.
   **/
  public void setDeploymentCrn(String deploymentCrn) {
    this.deploymentCrn = deploymentCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateReportingTaskRequest createReportingTaskRequest = (CreateReportingTaskRequest) o;
    if (!Objects.equals(this.environmentCrn, createReportingTaskRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.filePath, createReportingTaskRequest.filePath)) {
      return false;
    }
    if (!Objects.equals(this.deploymentCrn, createReportingTaskRequest.deploymentCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, filePath, deploymentCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReportingTaskRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    deploymentCrn: ").append(toIndentedString(deploymentCrn)).append("\n");
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

