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
 * Request object for the DeleteWorkspace method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-27T10:36:28.588-07:00")
public class DeleteWorkspaceRequest  {

  /**
   * Force delete a workbench even if errors occur during deletion. Force delete removes the guarantee that resources in your cloud account will be cleaned up.
   **/
  private Boolean force = null;

  /**
   * The remove storage flag indicates weather to keep the backing workbench filesystem storage or remove it during delete.
   **/
  private Boolean removeStorage = null;

  /**
   * The environment for the workbench to delete.
   **/
  private String environmentName = null;

  /**
   * The name of the workbench to delete.
   **/
  private String workspaceName = null;

  /**
   * The CRN of the workbench to delete. If CRN is specified only the CRN is used for identifying the workbench, environment and name arguments are ignored.
   **/
  private String workspaceCrn = null;

  /**
   * Getter for force.
   * Force delete a workbench even if errors occur during deletion. Force delete removes the guarantee that resources in your cloud account will be cleaned up.
   **/
  @JsonProperty("force")
  public Boolean getForce() {
    return force;
  }

  /**
   * Setter for force.
   * Force delete a workbench even if errors occur during deletion. Force delete removes the guarantee that resources in your cloud account will be cleaned up.
   **/
  public void setForce(Boolean force) {
    this.force = force;
  }

  /**
   * Getter for removeStorage.
   * The remove storage flag indicates weather to keep the backing workbench filesystem storage or remove it during delete.
   **/
  @JsonProperty("removeStorage")
  public Boolean getRemoveStorage() {
    return removeStorage;
  }

  /**
   * Setter for removeStorage.
   * The remove storage flag indicates weather to keep the backing workbench filesystem storage or remove it during delete.
   **/
  public void setRemoveStorage(Boolean removeStorage) {
    this.removeStorage = removeStorage;
  }

  /**
   * Getter for environmentName.
   * The environment for the workbench to delete.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The environment for the workbench to delete.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for workspaceName.
   * The name of the workbench to delete.
   **/
  @JsonProperty("workspaceName")
  public String getWorkspaceName() {
    return workspaceName;
  }

  /**
   * Setter for workspaceName.
   * The name of the workbench to delete.
   **/
  public void setWorkspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
  }

  /**
   * Getter for workspaceCrn.
   * The CRN of the workbench to delete. If CRN is specified only the CRN is used for identifying the workbench, environment and name arguments are ignored.
   **/
  @JsonProperty("workspaceCrn")
  public String getWorkspaceCrn() {
    return workspaceCrn;
  }

  /**
   * Setter for workspaceCrn.
   * The CRN of the workbench to delete. If CRN is specified only the CRN is used for identifying the workbench, environment and name arguments are ignored.
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
    DeleteWorkspaceRequest deleteWorkspaceRequest = (DeleteWorkspaceRequest) o;
    if (!Objects.equals(this.force, deleteWorkspaceRequest.force)) {
      return false;
    }
    if (!Objects.equals(this.removeStorage, deleteWorkspaceRequest.removeStorage)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, deleteWorkspaceRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.workspaceName, deleteWorkspaceRequest.workspaceName)) {
      return false;
    }
    if (!Objects.equals(this.workspaceCrn, deleteWorkspaceRequest.workspaceCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, removeStorage, environmentName, workspaceName, workspaceCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteWorkspaceRequest {\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
    sb.append("    removeStorage: ").append(toIndentedString(removeStorage)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
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

