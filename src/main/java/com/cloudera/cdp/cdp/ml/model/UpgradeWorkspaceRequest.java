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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for the UpgradeWorkspace method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:41.723-07:00")
public class UpgradeWorkspaceRequest  {

  /**
   * The environment of the workbench.
   **/
  private String environmentName = null;

  /**
   * The name of the workbench.
   **/
  private String workspaceName = null;

  /**
   * The version of workbench to upgrade to.
   **/
  private String mlVersion = null;

  /**
   * The CRN of the workbench. If CRN is specified only the CRN is used for identifying the workbench, environment and name arguments are ignored.
   **/
  private String workspaceCrn = null;

  /**
   * Getter for environmentName.
   * The environment of the workbench.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The environment of the workbench.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for workspaceName.
   * The name of the workbench.
   **/
  @JsonProperty("workspaceName")
  public String getWorkspaceName() {
    return workspaceName;
  }

  /**
   * Setter for workspaceName.
   * The name of the workbench.
   **/
  public void setWorkspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
  }

  /**
   * Getter for mlVersion.
   * The version of workbench to upgrade to.
   **/
  @JsonProperty("mlVersion")
  public String getMlVersion() {
    return mlVersion;
  }

  /**
   * Setter for mlVersion.
   * The version of workbench to upgrade to.
   **/
  public void setMlVersion(String mlVersion) {
    this.mlVersion = mlVersion;
  }

  /**
   * Getter for workspaceCrn.
   * The CRN of the workbench. If CRN is specified only the CRN is used for identifying the workbench, environment and name arguments are ignored.
   **/
  @JsonProperty("workspaceCrn")
  public String getWorkspaceCrn() {
    return workspaceCrn;
  }

  /**
   * Setter for workspaceCrn.
   * The CRN of the workbench. If CRN is specified only the CRN is used for identifying the workbench, environment and name arguments are ignored.
   **/
  public void setWorkspaceCrn(String workspaceCrn) {
    this.workspaceCrn = workspaceCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeWorkspaceRequest upgradeWorkspaceRequest = (UpgradeWorkspaceRequest) o;
    if (!Objects.equals(this.environmentName, upgradeWorkspaceRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.workspaceName, upgradeWorkspaceRequest.workspaceName)) {
      return false;
    }
    if (!Objects.equals(this.mlVersion, upgradeWorkspaceRequest.mlVersion)) {
      return false;
    }
    if (!Objects.equals(this.workspaceCrn, upgradeWorkspaceRequest.workspaceCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, workspaceName, mlVersion, workspaceCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeWorkspaceRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
    sb.append("    mlVersion: ").append(toIndentedString(mlVersion)).append("\n");
    sb.append("    workspaceCrn: ").append(toIndentedString(workspaceCrn)).append("\n");
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

