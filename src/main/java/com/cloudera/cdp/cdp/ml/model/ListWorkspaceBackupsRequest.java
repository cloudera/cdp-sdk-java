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
import com.cloudera.cdp.ml.model.ListWorkspaceBackupsQueryOptions;

/**
 * Request object for ListWorkspaceBackups method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-11-09T15:08:28.788-08:00")
public class ListWorkspaceBackupsRequest  {

  /**
   * The environment for the workspace to list backups for.
   **/
  private String environmentName = null;

  /**
   * The name of the workspace to list backups for.
   **/
  private String workspaceName = null;

  /**
   * The CRN of the workspace to list backups for. If this field is specified, environmentName and workspaceName are ignored.
   **/
  private String workspaceCrn = null;

  /**
   * Additional query options to enhance/mutate the API response.
   **/
  private ListWorkspaceBackupsQueryOptions queryOptions = null;

  /**
   * Getter for environmentName.
   * The environment for the workspace to list backups for.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The environment for the workspace to list backups for.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for workspaceName.
   * The name of the workspace to list backups for.
   **/
  @JsonProperty("workspaceName")
  public String getWorkspaceName() {
    return workspaceName;
  }

  /**
   * Setter for workspaceName.
   * The name of the workspace to list backups for.
   **/
  public void setWorkspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
  }

  /**
   * Getter for workspaceCrn.
   * The CRN of the workspace to list backups for. If this field is specified, environmentName and workspaceName are ignored.
   **/
  @JsonProperty("workspaceCrn")
  public String getWorkspaceCrn() {
    return workspaceCrn;
  }

  /**
   * Setter for workspaceCrn.
   * The CRN of the workspace to list backups for. If this field is specified, environmentName and workspaceName are ignored.
   **/
  public void setWorkspaceCrn(String workspaceCrn) {
    this.workspaceCrn = workspaceCrn;
  }

  /**
   * Getter for queryOptions.
   * Additional query options to enhance/mutate the API response.
   **/
  @JsonProperty("queryOptions")
  public ListWorkspaceBackupsQueryOptions getQueryOptions() {
    return queryOptions;
  }

  /**
   * Setter for queryOptions.
   * Additional query options to enhance/mutate the API response.
   **/
  public void setQueryOptions(ListWorkspaceBackupsQueryOptions queryOptions) {
    this.queryOptions = queryOptions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListWorkspaceBackupsRequest listWorkspaceBackupsRequest = (ListWorkspaceBackupsRequest) o;
    if (!Objects.equals(this.environmentName, listWorkspaceBackupsRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.workspaceName, listWorkspaceBackupsRequest.workspaceName)) {
      return false;
    }
    if (!Objects.equals(this.workspaceCrn, listWorkspaceBackupsRequest.workspaceCrn)) {
      return false;
    }
    if (!Objects.equals(this.queryOptions, listWorkspaceBackupsRequest.queryOptions)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, workspaceName, workspaceCrn, queryOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListWorkspaceBackupsRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
    sb.append("    workspaceCrn: ").append(toIndentedString(workspaceCrn)).append("\n");
    sb.append("    queryOptions: ").append(toIndentedString(queryOptions)).append("\n");
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

