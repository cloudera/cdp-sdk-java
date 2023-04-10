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
 * Request object for the RevokeWorkspace method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-04-10T13:23:59.155-07:00")
public class RevokeWorkspaceAccessRequest  {

  /**
   * The aws user ARN to revoke access to the corresponding EKS cluster. (Deprecated: Use identifier instead).
   **/
  private String arn = null;

  /**
   * The environment that the workspace is a member of.
   **/
  private String environmentName = null;

  /**
   * The name of the workspace to revoke access to.
   **/
  private String workspaceName = null;

  /**
   * The CRN of the workspace to revoke access to. If CRN is specified only the CRN is used for identifying the workspace, environment and name arguments are ignored.
   **/
  private String workspaceCrn = null;

  /**
   * The cloud provider user id which will be granted access to the workspace's Kubernetes cluster.
   **/
  private String identifier = null;

  /**
   * Getter for arn.
   * The aws user ARN to revoke access to the corresponding EKS cluster. (Deprecated: Use identifier instead).
   **/
  @Deprecated
  @JsonProperty("arn")
  public String getArn() {
    return arn;
  }

  /**
   * Setter for arn.
   * The aws user ARN to revoke access to the corresponding EKS cluster. (Deprecated: Use identifier instead).
   **/
  @Deprecated
  public void setArn(String arn) {
    this.arn = arn;
  }

  /**
   * Getter for environmentName.
   * The environment that the workspace is a member of.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The environment that the workspace is a member of.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for workspaceName.
   * The name of the workspace to revoke access to.
   **/
  @JsonProperty("workspaceName")
  public String getWorkspaceName() {
    return workspaceName;
  }

  /**
   * Setter for workspaceName.
   * The name of the workspace to revoke access to.
   **/
  public void setWorkspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
  }

  /**
   * Getter for workspaceCrn.
   * The CRN of the workspace to revoke access to. If CRN is specified only the CRN is used for identifying the workspace, environment and name arguments are ignored.
   **/
  @JsonProperty("workspaceCrn")
  public String getWorkspaceCrn() {
    return workspaceCrn;
  }

  /**
   * Setter for workspaceCrn.
   * The CRN of the workspace to revoke access to. If CRN is specified only the CRN is used for identifying the workspace, environment and name arguments are ignored.
   **/
  public void setWorkspaceCrn(String workspaceCrn) {
    this.workspaceCrn = workspaceCrn;
  }

  /**
   * Getter for identifier.
   * The cloud provider user id which will be granted access to the workspace&#39;s Kubernetes cluster.
   **/
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }

  /**
   * Setter for identifier.
   * The cloud provider user id which will be granted access to the workspace&#39;s Kubernetes cluster.
   **/
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevokeWorkspaceAccessRequest revokeWorkspaceAccessRequest = (RevokeWorkspaceAccessRequest) o;
    if (!Objects.equals(this.arn, revokeWorkspaceAccessRequest.arn)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, revokeWorkspaceAccessRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.workspaceName, revokeWorkspaceAccessRequest.workspaceName)) {
      return false;
    }
    if (!Objects.equals(this.workspaceCrn, revokeWorkspaceAccessRequest.workspaceCrn)) {
      return false;
    }
    if (!Objects.equals(this.identifier, revokeWorkspaceAccessRequest.identifier)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(arn, environmentName, workspaceName, workspaceCrn, identifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevokeWorkspaceAccessRequest {\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
    sb.append("    workspaceCrn: ").append(toIndentedString(workspaceCrn)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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

