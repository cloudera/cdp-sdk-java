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
 * Request object for uploading an asset to a parameter.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-05T07:54:45.482-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class UploadParameterAssetRequest  {

  /**
   * The CRN of an environment to execute the command.
   **/
  private String environmentCrn = null;

  /**
   * The CRN of the parameter group.
   **/
  private String parameterGroupCrn = null;

  /**
   * The name of the parameter.
   **/
  private String parameterName = null;

  /**
   * The full local path to the file being uploaded.
   **/
  private String filePath = null;

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
   * Getter for parameterGroupCrn.
   * The CRN of the parameter group.
   **/
  @JsonProperty("parameterGroupCrn")
  public String getParameterGroupCrn() {
    return parameterGroupCrn;
  }

  /**
   * Setter for parameterGroupCrn.
   * The CRN of the parameter group.
   **/
  public void setParameterGroupCrn(String parameterGroupCrn) {
    this.parameterGroupCrn = parameterGroupCrn;
  }

  /**
   * Getter for parameterName.
   * The name of the parameter.
   **/
  @JsonProperty("parameterName")
  public String getParameterName() {
    return parameterName;
  }

  /**
   * Setter for parameterName.
   * The name of the parameter.
   **/
  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }

  /**
   * Getter for filePath.
   * The full local path to the file being uploaded.
   **/
  @JsonProperty("filePath")
  public String getFilePath() {
    return filePath;
  }

  /**
   * Setter for filePath.
   * The full local path to the file being uploaded.
   **/
  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadParameterAssetRequest uploadParameterAssetRequest = (UploadParameterAssetRequest) o;
    if (!Objects.equals(this.environmentCrn, uploadParameterAssetRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.parameterGroupCrn, uploadParameterAssetRequest.parameterGroupCrn)) {
      return false;
    }
    if (!Objects.equals(this.parameterName, uploadParameterAssetRequest.parameterName)) {
      return false;
    }
    if (!Objects.equals(this.filePath, uploadParameterAssetRequest.filePath)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, parameterGroupCrn, parameterName, filePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadParameterAssetRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    parameterGroupCrn: ").append(toIndentedString(parameterGroupCrn)).append("\n");
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
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

