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
import com.cloudera.cdp.ml.model.ProvisionK8sRequest;

/**
 * Request object for the CreateWorkspace method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2019-09-05T21:16:03.171-07:00")
public class CreateWorkspaceRequest  {

  /**
   * The boolean flag to disable TLS setup for workspace. By default the TLS is enabled.
   **/
  private Boolean disableTLS = null;

  /**
   * The environment for the workspace to create.
   **/
  private String environmentName = null;

  /**
   * The version of ML workload app to install.
   **/
  private String mlVersion = null;

  /**
   * The request for k8s workspace provision.
   **/
  private ProvisionK8sRequest provisionK8sRequest = null;

  /**
   * The boolean flag to request public load balancer. By default private load balancer is used.
   **/
  private Boolean usePublicLoadBalancer = null;

  /**
   * The name of the workspace to create.
   **/
  private String workspaceName = null;

  /**
   * Getter for disableTLS.
   * The boolean flag to disable TLS setup for workspace. By default the TLS is enabled.
   **/
  @JsonProperty("disableTLS")
  public Boolean getDisableTLS() {
    return disableTLS;
  }

  /**
   * Setter for disableTLS.
   * The boolean flag to disable TLS setup for workspace. By default the TLS is enabled.
   **/
  public void setDisableTLS(Boolean disableTLS) {
    this.disableTLS = disableTLS;
  }

  /**
   * Getter for environmentName.
   * The environment for the workspace to create.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The environment for the workspace to create.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for mlVersion.
   * The version of ML workload app to install.
   **/
  @JsonProperty("mlVersion")
  public String getMlVersion() {
    return mlVersion;
  }

  /**
   * Setter for mlVersion.
   * The version of ML workload app to install.
   **/
  public void setMlVersion(String mlVersion) {
    this.mlVersion = mlVersion;
  }

  /**
   * Getter for provisionK8sRequest.
   * The request for k8s workspace provision.
   **/
  @JsonProperty("provisionK8sRequest")
  public ProvisionK8sRequest getProvisionK8sRequest() {
    return provisionK8sRequest;
  }

  /**
   * Setter for provisionK8sRequest.
   * The request for k8s workspace provision.
   **/
  public void setProvisionK8sRequest(ProvisionK8sRequest provisionK8sRequest) {
    this.provisionK8sRequest = provisionK8sRequest;
  }

  /**
   * Getter for usePublicLoadBalancer.
   * The boolean flag to request public load balancer. By default private load balancer is used.
   **/
  @JsonProperty("usePublicLoadBalancer")
  public Boolean getUsePublicLoadBalancer() {
    return usePublicLoadBalancer;
  }

  /**
   * Setter for usePublicLoadBalancer.
   * The boolean flag to request public load balancer. By default private load balancer is used.
   **/
  public void setUsePublicLoadBalancer(Boolean usePublicLoadBalancer) {
    this.usePublicLoadBalancer = usePublicLoadBalancer;
  }

  /**
   * Getter for workspaceName.
   * The name of the workspace to create.
   **/
  @JsonProperty("workspaceName")
  public String getWorkspaceName() {
    return workspaceName;
  }

  /**
   * Setter for workspaceName.
   * The name of the workspace to create.
   **/
  public void setWorkspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWorkspaceRequest createWorkspaceRequest = (CreateWorkspaceRequest) o;
    if (!Objects.equals(this.disableTLS, createWorkspaceRequest.disableTLS)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, createWorkspaceRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.mlVersion, createWorkspaceRequest.mlVersion)) {
      return false;
    }
    if (!Objects.equals(this.provisionK8sRequest, createWorkspaceRequest.provisionK8sRequest)) {
      return false;
    }
    if (!Objects.equals(this.usePublicLoadBalancer, createWorkspaceRequest.usePublicLoadBalancer)) {
      return false;
    }
    if (!Objects.equals(this.workspaceName, createWorkspaceRequest.workspaceName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(disableTLS, environmentName, mlVersion, provisionK8sRequest, usePublicLoadBalancer, workspaceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorkspaceRequest {\n");
    sb.append("    disableTLS: ").append(toIndentedString(disableTLS)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    mlVersion: ").append(toIndentedString(mlVersion)).append("\n");
    sb.append("    provisionK8sRequest: ").append(toIndentedString(provisionK8sRequest)).append("\n");
    sb.append("    usePublicLoadBalancer: ").append(toIndentedString(usePublicLoadBalancer)).append("\n");
    sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
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

