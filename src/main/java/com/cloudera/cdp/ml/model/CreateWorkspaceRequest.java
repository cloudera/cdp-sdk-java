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
import com.cloudera.cdp.ml.model.ExistingDatabaseConfig;
import com.cloudera.cdp.ml.model.ProvisionK8sRequest;
import java.util.*;

/**
 * Request object for the CreateWorkspace method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-01-20T11:27:18.626-08:00")
public class CreateWorkspaceRequest  {

  /**
   * The environment for the workspace to create.
   **/
  private String environmentName = null;

  /**
   * The name of the workspace to create.
   **/
  private String workspaceName = null;

  /**
   * The boolean flag to request public load balancer. By default private load balancer is used.
   **/
  private Boolean usePublicLoadBalancer = null;

  /**
   * The boolean flag to disable TLS setup for workspace. By default the TLS is enabled.
   **/
  private Boolean disableTLS = null;

  /**
   * The request for Kubernetes workspace provision.
   **/
  private ProvisionK8sRequest provisionK8sRequest = null;

  /**
   * The boolean flag is used to enable mlonitoring. By default monitoring is disabled.
   **/
  private Boolean enableMonitoring = null;

  /**
   * Optionally use an existing NFS by providing the hostname and desired path (Azure and Private Cloud only).
   **/
  private String existingNFS = null;

  /**
   * The whitelist of ips for loadBalancer.
   **/
  private List<String> loadBalancerIPWhitelists = new ArrayList<String>();

  /**
   * Optional configurations for an existing Postgres to export model metrics to.
   **/
  private ExistingDatabaseConfig existingDatabaseConfig = null;

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
   * Getter for provisionK8sRequest.
   * The request for Kubernetes workspace provision.
   **/
  @JsonProperty("provisionK8sRequest")
  public ProvisionK8sRequest getProvisionK8sRequest() {
    return provisionK8sRequest;
  }

  /**
   * Setter for provisionK8sRequest.
   * The request for Kubernetes workspace provision.
   **/
  public void setProvisionK8sRequest(ProvisionK8sRequest provisionK8sRequest) {
    this.provisionK8sRequest = provisionK8sRequest;
  }

  /**
   * Getter for enableMonitoring.
   * The boolean flag is used to enable mlonitoring. By default monitoring is disabled.
   **/
  @JsonProperty("enableMonitoring")
  public Boolean getEnableMonitoring() {
    return enableMonitoring;
  }

  /**
   * Setter for enableMonitoring.
   * The boolean flag is used to enable mlonitoring. By default monitoring is disabled.
   **/
  public void setEnableMonitoring(Boolean enableMonitoring) {
    this.enableMonitoring = enableMonitoring;
  }

  /**
   * Getter for existingNFS.
   * Optionally use an existing NFS by providing the hostname and desired path (Azure and Private Cloud only).
   **/
  @JsonProperty("existingNFS")
  public String getExistingNFS() {
    return existingNFS;
  }

  /**
   * Setter for existingNFS.
   * Optionally use an existing NFS by providing the hostname and desired path (Azure and Private Cloud only).
   **/
  public void setExistingNFS(String existingNFS) {
    this.existingNFS = existingNFS;
  }

  /**
   * Getter for loadBalancerIPWhitelists.
   * The whitelist of ips for loadBalancer.
   **/
  @JsonProperty("loadBalancerIPWhitelists")
  public List<String> getLoadBalancerIPWhitelists() {
    return loadBalancerIPWhitelists;
  }

  /**
   * Setter for loadBalancerIPWhitelists.
   * The whitelist of ips for loadBalancer.
   **/
  public void setLoadBalancerIPWhitelists(List<String> loadBalancerIPWhitelists) {
    this.loadBalancerIPWhitelists = loadBalancerIPWhitelists;
  }

  /**
   * Getter for existingDatabaseConfig.
   * Optional configurations for an existing Postgres to export model metrics to.
   **/
  @JsonProperty("existingDatabaseConfig")
  public ExistingDatabaseConfig getExistingDatabaseConfig() {
    return existingDatabaseConfig;
  }

  /**
   * Setter for existingDatabaseConfig.
   * Optional configurations for an existing Postgres to export model metrics to.
   **/
  public void setExistingDatabaseConfig(ExistingDatabaseConfig existingDatabaseConfig) {
    this.existingDatabaseConfig = existingDatabaseConfig;
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
    if (!Objects.equals(this.environmentName, createWorkspaceRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.workspaceName, createWorkspaceRequest.workspaceName)) {
      return false;
    }
    if (!Objects.equals(this.usePublicLoadBalancer, createWorkspaceRequest.usePublicLoadBalancer)) {
      return false;
    }
    if (!Objects.equals(this.disableTLS, createWorkspaceRequest.disableTLS)) {
      return false;
    }
    if (!Objects.equals(this.provisionK8sRequest, createWorkspaceRequest.provisionK8sRequest)) {
      return false;
    }
    if (!Objects.equals(this.enableMonitoring, createWorkspaceRequest.enableMonitoring)) {
      return false;
    }
    if (!Objects.equals(this.existingNFS, createWorkspaceRequest.existingNFS)) {
      return false;
    }
    if (!Objects.equals(this.loadBalancerIPWhitelists, createWorkspaceRequest.loadBalancerIPWhitelists)) {
      return false;
    }
    if (!Objects.equals(this.existingDatabaseConfig, createWorkspaceRequest.existingDatabaseConfig)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, workspaceName, usePublicLoadBalancer, disableTLS, provisionK8sRequest, enableMonitoring, existingNFS, loadBalancerIPWhitelists, existingDatabaseConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorkspaceRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
    sb.append("    usePublicLoadBalancer: ").append(toIndentedString(usePublicLoadBalancer)).append("\n");
    sb.append("    disableTLS: ").append(toIndentedString(disableTLS)).append("\n");
    sb.append("    provisionK8sRequest: ").append(toIndentedString(provisionK8sRequest)).append("\n");
    sb.append("    enableMonitoring: ").append(toIndentedString(enableMonitoring)).append("\n");
    sb.append("    existingNFS: ").append(toIndentedString(existingNFS)).append("\n");
    sb.append("    loadBalancerIPWhitelists: ").append(toIndentedString(loadBalancerIPWhitelists)).append("\n");
    sb.append("    existingDatabaseConfig: ").append(toIndentedString(existingDatabaseConfig)).append("\n");
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

