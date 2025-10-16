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
 * Request object for uploading an asset
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-15T17:00:48.641-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class UploadAssetRequest  {

  /**
   * The CRN of an environment to execute the command.
   **/
  private String environmentCrn = null;

  /**
   * The name of the parameter group
   **/
  private String parameterGroup = null;

  /**
   * The name of the parameter within the parameter group
   **/
  private String parameterName = null;

  /**
   * The full local path to the file being uploaded
   **/
  private String filePath = null;

  /**
   * The CRN of the deployment request. Required during initial deployment.
   **/
  private String deploymentRequestCrn = null;

  /**
   * The name of the deployment. Required during initial deployment.
   **/
  private String deploymentName = null;

  /**
   * The CRN of the asset update request. Required when updating assets of an existing deployment.
   **/
  private String assetUpdateRequestCrn = null;

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
   * Getter for parameterGroup.
   * The name of the parameter group
   **/
  @JsonProperty("parameterGroup")
  public String getParameterGroup() {
    return parameterGroup;
  }

  /**
   * Setter for parameterGroup.
   * The name of the parameter group
   **/
  public void setParameterGroup(String parameterGroup) {
    this.parameterGroup = parameterGroup;
  }

  /**
   * Getter for parameterName.
   * The name of the parameter within the parameter group
   **/
  @JsonProperty("parameterName")
  public String getParameterName() {
    return parameterName;
  }

  /**
   * Setter for parameterName.
   * The name of the parameter within the parameter group
   **/
  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }

  /**
   * Getter for filePath.
   * The full local path to the file being uploaded
   **/
  @JsonProperty("filePath")
  public String getFilePath() {
    return filePath;
  }

  /**
   * Setter for filePath.
   * The full local path to the file being uploaded
   **/
  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  /**
   * Getter for deploymentRequestCrn.
   * The CRN of the deployment request. Required during initial deployment.
   **/
  @JsonProperty("deploymentRequestCrn")
  public String getDeploymentRequestCrn() {
    return deploymentRequestCrn;
  }

  /**
   * Setter for deploymentRequestCrn.
   * The CRN of the deployment request. Required during initial deployment.
   **/
  public void setDeploymentRequestCrn(String deploymentRequestCrn) {
    this.deploymentRequestCrn = deploymentRequestCrn;
  }

  /**
   * Getter for deploymentName.
   * The name of the deployment. Required during initial deployment.
   **/
  @JsonProperty("deploymentName")
  public String getDeploymentName() {
    return deploymentName;
  }

  /**
   * Setter for deploymentName.
   * The name of the deployment. Required during initial deployment.
   **/
  public void setDeploymentName(String deploymentName) {
    this.deploymentName = deploymentName;
  }

  /**
   * Getter for assetUpdateRequestCrn.
   * The CRN of the asset update request. Required when updating assets of an existing deployment.
   **/
  @JsonProperty("assetUpdateRequestCrn")
  public String getAssetUpdateRequestCrn() {
    return assetUpdateRequestCrn;
  }

  /**
   * Setter for assetUpdateRequestCrn.
   * The CRN of the asset update request. Required when updating assets of an existing deployment.
   **/
  public void setAssetUpdateRequestCrn(String assetUpdateRequestCrn) {
    this.assetUpdateRequestCrn = assetUpdateRequestCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadAssetRequest uploadAssetRequest = (UploadAssetRequest) o;
    if (!Objects.equals(this.environmentCrn, uploadAssetRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.parameterGroup, uploadAssetRequest.parameterGroup)) {
      return false;
    }
    if (!Objects.equals(this.parameterName, uploadAssetRequest.parameterName)) {
      return false;
    }
    if (!Objects.equals(this.filePath, uploadAssetRequest.filePath)) {
      return false;
    }
    if (!Objects.equals(this.deploymentRequestCrn, uploadAssetRequest.deploymentRequestCrn)) {
      return false;
    }
    if (!Objects.equals(this.deploymentName, uploadAssetRequest.deploymentName)) {
      return false;
    }
    if (!Objects.equals(this.assetUpdateRequestCrn, uploadAssetRequest.assetUpdateRequestCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, parameterGroup, parameterName, filePath, deploymentRequestCrn, deploymentName, assetUpdateRequestCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadAssetRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    parameterGroup: ").append(toIndentedString(parameterGroup)).append("\n");
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    deploymentRequestCrn: ").append(toIndentedString(deploymentRequestCrn)).append("\n");
    sb.append("    deploymentName: ").append(toIndentedString(deploymentName)).append("\n");
    sb.append("    assetUpdateRequestCrn: ").append(toIndentedString(assetUpdateRequestCrn)).append("\n");
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

