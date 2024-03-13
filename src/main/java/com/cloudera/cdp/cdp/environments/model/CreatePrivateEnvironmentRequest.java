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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.environments.model.CreatePrivateEnvironmentRequestDockerUserPass;
import java.util.*;

/**
 * Request object for a create private cloud environment request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-03-13T13:08:47.341-07:00")
public class CreatePrivateEnvironmentRequest  {

  /**
   * The name of the environment. Must contain only lowercase letters, numbers and hyphens.
   **/
  private String environmentName = null;

  /**
   * The address of the Cloudera Manager managing the Datalake cluster.
   **/
  private String address = null;

  /**
   * User name for accessing the Cloudera Manager.
   **/
  private String user = null;

  /**
   * A string (text or json) used to authenticate to the Cloudera Manager.
   **/
  private String authenticationToken = null;

  /**
   * The name of the cluster(s) to use as a Datalake for the environment.
   **/
  private List<String> clusterNames = new ArrayList<String>();

  /**
   * Name of credentials holding kubeconfig for access to the kubernetes cluster paired with this Environment.
   **/
  private String kubeConfig = null;

  /**
   * How to interpret the authenticationToken field. Defaults to CLEARTEXT_PASSWORD.
   **/
  private String authenticationTokenType = null;

  /**
   * Prefix for all namespaces created by Cloudera Data Platform within this cluster.
   **/
  private String namespacePrefix = "cdp";

  /**
   * default domain suffix to work workload applications to use.
   **/
  private String domain = null;

  /**
   * the K8s cluster type used for the environment.
   **/
  private String platform = "OPENSHIFT";

  /**
   * docker pull secrets for the K8s cluster. This is expected to be a docker config json.
   **/
  private String dockerConfigJson = null;

  /**
   * 
   **/
  private CreatePrivateEnvironmentRequestDockerUserPass dockerUserPass = null;

  /**
   * An description of the environment.
   **/
  private String description = null;

  /**
   * An existing storage class on this kubernetes cluster. If not specified, the default storage class will be used.
   **/
  private String storageClass = null;

  /**
   * Getter for environmentName.
   * The name of the environment. Must contain only lowercase letters, numbers and hyphens.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The name of the environment. Must contain only lowercase letters, numbers and hyphens.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for address.
   * The address of the Cloudera Manager managing the Datalake cluster.
   **/
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }

  /**
   * Setter for address.
   * The address of the Cloudera Manager managing the Datalake cluster.
   **/
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Getter for user.
   * User name for accessing the Cloudera Manager.
   **/
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  /**
   * Setter for user.
   * User name for accessing the Cloudera Manager.
   **/
  public void setUser(String user) {
    this.user = user;
  }

  /**
   * Getter for authenticationToken.
   * A string (text or json) used to authenticate to the Cloudera Manager.
   **/
  @JsonProperty("authenticationToken")
  public String getAuthenticationToken() {
    return authenticationToken;
  }

  /**
   * Setter for authenticationToken.
   * A string (text or json) used to authenticate to the Cloudera Manager.
   **/
  public void setAuthenticationToken(String authenticationToken) {
    this.authenticationToken = authenticationToken;
  }

  /**
   * Getter for clusterNames.
   * The name of the cluster(s) to use as a Datalake for the environment.
   **/
  @JsonProperty("clusterNames")
  public List<String> getClusterNames() {
    return clusterNames;
  }

  /**
   * Setter for clusterNames.
   * The name of the cluster(s) to use as a Datalake for the environment.
   **/
  public void setClusterNames(List<String> clusterNames) {
    this.clusterNames = clusterNames;
  }

  /**
   * Getter for kubeConfig.
   * Name of credentials holding kubeconfig for access to the kubernetes cluster paired with this Environment.
   **/
  @JsonProperty("kubeConfig")
  public String getKubeConfig() {
    return kubeConfig;
  }

  /**
   * Setter for kubeConfig.
   * Name of credentials holding kubeconfig for access to the kubernetes cluster paired with this Environment.
   **/
  public void setKubeConfig(String kubeConfig) {
    this.kubeConfig = kubeConfig;
  }

  /**
   * Getter for authenticationTokenType.
   * How to interpret the authenticationToken field. Defaults to CLEARTEXT_PASSWORD.
   **/
  @JsonProperty("authenticationTokenType")
  public String getAuthenticationTokenType() {
    return authenticationTokenType;
  }

  /**
   * Setter for authenticationTokenType.
   * How to interpret the authenticationToken field. Defaults to CLEARTEXT_PASSWORD.
   **/
  public void setAuthenticationTokenType(String authenticationTokenType) {
    this.authenticationTokenType = authenticationTokenType;
  }

  /**
   * Getter for namespacePrefix.
   * Prefix for all namespaces created by Cloudera Data Platform within this cluster.
   **/
  @JsonProperty("namespacePrefix")
  public String getNamespacePrefix() {
    return namespacePrefix;
  }

  /**
   * Setter for namespacePrefix.
   * Prefix for all namespaces created by Cloudera Data Platform within this cluster.
   **/
  public void setNamespacePrefix(String namespacePrefix) {
    this.namespacePrefix = namespacePrefix;
  }

  /**
   * Getter for domain.
   * default domain suffix to work workload applications to use.
   **/
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  /**
   * Setter for domain.
   * default domain suffix to work workload applications to use.
   **/
  public void setDomain(String domain) {
    this.domain = domain;
  }

  /**
   * Getter for platform.
   * the K8s cluster type used for the environment.
   **/
  @JsonProperty("platform")
  public String getPlatform() {
    return platform;
  }

  /**
   * Setter for platform.
   * the K8s cluster type used for the environment.
   **/
  public void setPlatform(String platform) {
    this.platform = platform;
  }

  /**
   * Getter for dockerConfigJson.
   * docker pull secrets for the K8s cluster. This is expected to be a docker config json.
   **/
  @JsonProperty("dockerConfigJson")
  public String getDockerConfigJson() {
    return dockerConfigJson;
  }

  /**
   * Setter for dockerConfigJson.
   * docker pull secrets for the K8s cluster. This is expected to be a docker config json.
   **/
  public void setDockerConfigJson(String dockerConfigJson) {
    this.dockerConfigJson = dockerConfigJson;
  }

  /**
   * Getter for dockerUserPass.
   * 
   **/
  @JsonProperty("dockerUserPass")
  public CreatePrivateEnvironmentRequestDockerUserPass getDockerUserPass() {
    return dockerUserPass;
  }

  /**
   * Setter for dockerUserPass.
   * 
   **/
  public void setDockerUserPass(CreatePrivateEnvironmentRequestDockerUserPass dockerUserPass) {
    this.dockerUserPass = dockerUserPass;
  }

  /**
   * Getter for description.
   * An description of the environment.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * An description of the environment.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for storageClass.
   * An existing storage class on this kubernetes cluster. If not specified, the default storage class will be used.
   **/
  @JsonProperty("storageClass")
  public String getStorageClass() {
    return storageClass;
  }

  /**
   * Setter for storageClass.
   * An existing storage class on this kubernetes cluster. If not specified, the default storage class will be used.
   **/
  public void setStorageClass(String storageClass) {
    this.storageClass = storageClass;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePrivateEnvironmentRequest createPrivateEnvironmentRequest = (CreatePrivateEnvironmentRequest) o;
    if (!Objects.equals(this.environmentName, createPrivateEnvironmentRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.address, createPrivateEnvironmentRequest.address)) {
      return false;
    }
    if (!Objects.equals(this.user, createPrivateEnvironmentRequest.user)) {
      return false;
    }
    if (!Objects.equals(this.authenticationToken, createPrivateEnvironmentRequest.authenticationToken)) {
      return false;
    }
    if (!Objects.equals(this.clusterNames, createPrivateEnvironmentRequest.clusterNames)) {
      return false;
    }
    if (!Objects.equals(this.kubeConfig, createPrivateEnvironmentRequest.kubeConfig)) {
      return false;
    }
    if (!Objects.equals(this.authenticationTokenType, createPrivateEnvironmentRequest.authenticationTokenType)) {
      return false;
    }
    if (!Objects.equals(this.namespacePrefix, createPrivateEnvironmentRequest.namespacePrefix)) {
      return false;
    }
    if (!Objects.equals(this.domain, createPrivateEnvironmentRequest.domain)) {
      return false;
    }
    if (!Objects.equals(this.platform, createPrivateEnvironmentRequest.platform)) {
      return false;
    }
    if (!Objects.equals(this.dockerConfigJson, createPrivateEnvironmentRequest.dockerConfigJson)) {
      return false;
    }
    if (!Objects.equals(this.dockerUserPass, createPrivateEnvironmentRequest.dockerUserPass)) {
      return false;
    }
    if (!Objects.equals(this.description, createPrivateEnvironmentRequest.description)) {
      return false;
    }
    if (!Objects.equals(this.storageClass, createPrivateEnvironmentRequest.storageClass)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, address, user, authenticationToken, clusterNames, kubeConfig, authenticationTokenType, namespacePrefix, domain, platform, dockerConfigJson, dockerUserPass, description, storageClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePrivateEnvironmentRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    authenticationToken: ").append(toIndentedString(authenticationToken)).append("\n");
    sb.append("    clusterNames: ").append(toIndentedString(clusterNames)).append("\n");
    sb.append("    kubeConfig: ").append(toIndentedString(kubeConfig)).append("\n");
    sb.append("    authenticationTokenType: ").append(toIndentedString(authenticationTokenType)).append("\n");
    sb.append("    namespacePrefix: ").append(toIndentedString(namespacePrefix)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    dockerConfigJson: ").append(toIndentedString(dockerConfigJson)).append("\n");
    sb.append("    dockerUserPass: ").append(toIndentedString(dockerUserPass)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    storageClass: ").append(toIndentedString(storageClass)).append("\n");
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

