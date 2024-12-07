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
 * Request object to import deployment configuration.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-06T11:27:18.793-08:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class ImportDeploymentRequest  {

  /**
   * The CRN of an environment to execute the command.
   **/
  private String environmentCrn = null;

  /**
   * The CRN of the deployment request.
   **/
  private String deploymentRequestCrn = null;

  /**
   * Search term to filter exported archives by deployment name.
   **/
  private String archiveName = null;

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
   * Getter for deploymentRequestCrn.
   * The CRN of the deployment request.
   **/
  @JsonProperty("deploymentRequestCrn")
  public String getDeploymentRequestCrn() {
    return deploymentRequestCrn;
  }

  /**
   * Setter for deploymentRequestCrn.
   * The CRN of the deployment request.
   **/
  public void setDeploymentRequestCrn(String deploymentRequestCrn) {
    this.deploymentRequestCrn = deploymentRequestCrn;
  }

  /**
   * Getter for archiveName.
   * Search term to filter exported archives by deployment name.
   **/
  @JsonProperty("archiveName")
  public String getArchiveName() {
    return archiveName;
  }

  /**
   * Setter for archiveName.
   * Search term to filter exported archives by deployment name.
   **/
  public void setArchiveName(String archiveName) {
    this.archiveName = archiveName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportDeploymentRequest importDeploymentRequest = (ImportDeploymentRequest) o;
    if (!Objects.equals(this.environmentCrn, importDeploymentRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.deploymentRequestCrn, importDeploymentRequest.deploymentRequestCrn)) {
      return false;
    }
    if (!Objects.equals(this.archiveName, importDeploymentRequest.archiveName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, deploymentRequestCrn, archiveName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportDeploymentRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    deploymentRequestCrn: ").append(toIndentedString(deploymentRequestCrn)).append("\n");
    sb.append("    archiveName: ").append(toIndentedString(archiveName)).append("\n");
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

