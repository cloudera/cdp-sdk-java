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
import com.cloudera.cdp.ml.model.CreateWorkspaceRequest;

/**
 * Request object for RestoreWorkspace method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-19T13:03:28.401-07:00")
public class RestoreWorkspaceRequest  {

  /**
   * The parameters required for a new Cloudera AI workbench.
   **/
  private CreateWorkspaceRequest newWorkspaceParameters = null;

  /**
   * The CRN of the backup snapshot to used for restoring.
   **/
  private String backupCrn = null;

  /**
   * A boolean value to check if subdomain must be used or not.
   **/
  private Boolean useStaticSubdomain = null;

  /**
   * The timeout to restore the backup snapshots, in minutes.
   **/
  private Integer restoreJobTimeoutMinutes = null;

  /**
   * Getter for newWorkspaceParameters.
   * The parameters required for a new Cloudera AI workbench.
   **/
  @JsonProperty("newWorkspaceParameters")
  public CreateWorkspaceRequest getNewWorkspaceParameters() {
    return newWorkspaceParameters;
  }

  /**
   * Setter for newWorkspaceParameters.
   * The parameters required for a new Cloudera AI workbench.
   **/
  public void setNewWorkspaceParameters(CreateWorkspaceRequest newWorkspaceParameters) {
    this.newWorkspaceParameters = newWorkspaceParameters;
  }

  /**
   * Getter for backupCrn.
   * The CRN of the backup snapshot to used for restoring.
   **/
  @JsonProperty("backupCrn")
  public String getBackupCrn() {
    return backupCrn;
  }

  /**
   * Setter for backupCrn.
   * The CRN of the backup snapshot to used for restoring.
   **/
  public void setBackupCrn(String backupCrn) {
    this.backupCrn = backupCrn;
  }

  /**
   * Getter for useStaticSubdomain.
   * A boolean value to check if subdomain must be used or not.
   **/
  @JsonProperty("useStaticSubdomain")
  public Boolean getUseStaticSubdomain() {
    return useStaticSubdomain;
  }

  /**
   * Setter for useStaticSubdomain.
   * A boolean value to check if subdomain must be used or not.
   **/
  public void setUseStaticSubdomain(Boolean useStaticSubdomain) {
    this.useStaticSubdomain = useStaticSubdomain;
  }

  /**
   * Getter for restoreJobTimeoutMinutes.
   * The timeout to restore the backup snapshots, in minutes.
   **/
  @JsonProperty("restoreJobTimeoutMinutes")
  public Integer getRestoreJobTimeoutMinutes() {
    return restoreJobTimeoutMinutes;
  }

  /**
   * Setter for restoreJobTimeoutMinutes.
   * The timeout to restore the backup snapshots, in minutes.
   **/
  public void setRestoreJobTimeoutMinutes(Integer restoreJobTimeoutMinutes) {
    this.restoreJobTimeoutMinutes = restoreJobTimeoutMinutes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestoreWorkspaceRequest restoreWorkspaceRequest = (RestoreWorkspaceRequest) o;
    if (!Objects.equals(this.newWorkspaceParameters, restoreWorkspaceRequest.newWorkspaceParameters)) {
      return false;
    }
    if (!Objects.equals(this.backupCrn, restoreWorkspaceRequest.backupCrn)) {
      return false;
    }
    if (!Objects.equals(this.useStaticSubdomain, restoreWorkspaceRequest.useStaticSubdomain)) {
      return false;
    }
    if (!Objects.equals(this.restoreJobTimeoutMinutes, restoreWorkspaceRequest.restoreJobTimeoutMinutes)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(newWorkspaceParameters, backupCrn, useStaticSubdomain, restoreJobTimeoutMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestoreWorkspaceRequest {\n");
    sb.append("    newWorkspaceParameters: ").append(toIndentedString(newWorkspaceParameters)).append("\n");
    sb.append("    backupCrn: ").append(toIndentedString(backupCrn)).append("\n");
    sb.append("    useStaticSubdomain: ").append(toIndentedString(useStaticSubdomain)).append("\n");
    sb.append("    restoreJobTimeoutMinutes: ").append(toIndentedString(restoreJobTimeoutMinutes)).append("\n");
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

