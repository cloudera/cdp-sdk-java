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

package com.cloudera.cdp.compute.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;
import java.util.Map;

/**
 * List clusters item structure.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-10-05T12:07:37.405-07:00")
public class ListClusterItem  {

  /**
   * CDP environment name.
   **/
  private String envName = null;

  /**
   * CDP environment cloud provider.
   **/
  private String envCloudProvider = null;

  /**
   * Compute cluster name.
   **/
  private String clusterName = null;

  /**
   * Compute cluster CRN.
   **/
  private String clusterCrn = null;

  /**
   * Compute cluster status.
   **/
  private String status = null;

  /**
   * Compute cluster platform provider.
   **/
  private String computePlatform = null;

  /**
   * Compute cluster platform version.
   **/
  private String computePlatformVersion = null;

  /**
   * Kubernetes version.
   **/
  private String kubernetesVersion = null;

  /**
   * Number of nodes in the cluster.
   **/
  private Integer clusterSize = null;

  /**
   * Compute cluster ID.
   **/
  private String clusterId = null;

  /**
   * CDP environment CRN.
   **/
  private String envCrn = null;

  /**
   * Map of labels associated with this cluster.
   **/
  private Map<String, String> labels = new HashMap<String, String>();

  /**
   * Getter for envName.
   * CDP environment name.
   **/
  @JsonProperty("envName")
  public String getEnvName() {
    return envName;
  }

  /**
   * Setter for envName.
   * CDP environment name.
   **/
  public void setEnvName(String envName) {
    this.envName = envName;
  }

  /**
   * Getter for envCloudProvider.
   * CDP environment cloud provider.
   **/
  @JsonProperty("envCloudProvider")
  public String getEnvCloudProvider() {
    return envCloudProvider;
  }

  /**
   * Setter for envCloudProvider.
   * CDP environment cloud provider.
   **/
  public void setEnvCloudProvider(String envCloudProvider) {
    this.envCloudProvider = envCloudProvider;
  }

  /**
   * Getter for clusterName.
   * Compute cluster name.
   **/
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }

  /**
   * Setter for clusterName.
   * Compute cluster name.
   **/
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  /**
   * Getter for clusterCrn.
   * Compute cluster CRN.
   **/
  @JsonProperty("clusterCrn")
  public String getClusterCrn() {
    return clusterCrn;
  }

  /**
   * Setter for clusterCrn.
   * Compute cluster CRN.
   **/
  public void setClusterCrn(String clusterCrn) {
    this.clusterCrn = clusterCrn;
  }

  /**
   * Getter for status.
   * Compute cluster status.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Compute cluster status.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for computePlatform.
   * Compute cluster platform provider.
   **/
  @JsonProperty("computePlatform")
  public String getComputePlatform() {
    return computePlatform;
  }

  /**
   * Setter for computePlatform.
   * Compute cluster platform provider.
   **/
  public void setComputePlatform(String computePlatform) {
    this.computePlatform = computePlatform;
  }

  /**
   * Getter for computePlatformVersion.
   * Compute cluster platform version.
   **/
  @JsonProperty("computePlatformVersion")
  public String getComputePlatformVersion() {
    return computePlatformVersion;
  }

  /**
   * Setter for computePlatformVersion.
   * Compute cluster platform version.
   **/
  public void setComputePlatformVersion(String computePlatformVersion) {
    this.computePlatformVersion = computePlatformVersion;
  }

  /**
   * Getter for kubernetesVersion.
   * Kubernetes version.
   **/
  @JsonProperty("kubernetesVersion")
  public String getKubernetesVersion() {
    return kubernetesVersion;
  }

  /**
   * Setter for kubernetesVersion.
   * Kubernetes version.
   **/
  public void setKubernetesVersion(String kubernetesVersion) {
    this.kubernetesVersion = kubernetesVersion;
  }

  /**
   * Getter for clusterSize.
   * Number of nodes in the cluster.
   **/
  @JsonProperty("clusterSize")
  public Integer getClusterSize() {
    return clusterSize;
  }

  /**
   * Setter for clusterSize.
   * Number of nodes in the cluster.
   **/
  public void setClusterSize(Integer clusterSize) {
    this.clusterSize = clusterSize;
  }

  /**
   * Getter for clusterId.
   * Compute cluster ID.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * Compute cluster ID.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for envCrn.
   * CDP environment CRN.
   **/
  @JsonProperty("envCrn")
  public String getEnvCrn() {
    return envCrn;
  }

  /**
   * Setter for envCrn.
   * CDP environment CRN.
   **/
  public void setEnvCrn(String envCrn) {
    this.envCrn = envCrn;
  }

  /**
   * Getter for labels.
   * Map of labels associated with this cluster.
   **/
  @JsonProperty("labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  /**
   * Setter for labels.
   * Map of labels associated with this cluster.
   **/
  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListClusterItem listClusterItem = (ListClusterItem) o;
    if (!Objects.equals(this.envName, listClusterItem.envName)) {
      return false;
    }
    if (!Objects.equals(this.envCloudProvider, listClusterItem.envCloudProvider)) {
      return false;
    }
    if (!Objects.equals(this.clusterName, listClusterItem.clusterName)) {
      return false;
    }
    if (!Objects.equals(this.clusterCrn, listClusterItem.clusterCrn)) {
      return false;
    }
    if (!Objects.equals(this.status, listClusterItem.status)) {
      return false;
    }
    if (!Objects.equals(this.computePlatform, listClusterItem.computePlatform)) {
      return false;
    }
    if (!Objects.equals(this.computePlatformVersion, listClusterItem.computePlatformVersion)) {
      return false;
    }
    if (!Objects.equals(this.kubernetesVersion, listClusterItem.kubernetesVersion)) {
      return false;
    }
    if (!Objects.equals(this.clusterSize, listClusterItem.clusterSize)) {
      return false;
    }
    if (!Objects.equals(this.clusterId, listClusterItem.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.envCrn, listClusterItem.envCrn)) {
      return false;
    }
    if (!Objects.equals(this.labels, listClusterItem.labels)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(envName, envCloudProvider, clusterName, clusterCrn, status, computePlatform, computePlatformVersion, kubernetesVersion, clusterSize, clusterId, envCrn, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListClusterItem {\n");
    sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
    sb.append("    envCloudProvider: ").append(toIndentedString(envCloudProvider)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    clusterCrn: ").append(toIndentedString(clusterCrn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    computePlatform: ").append(toIndentedString(computePlatform)).append("\n");
    sb.append("    computePlatformVersion: ").append(toIndentedString(computePlatformVersion)).append("\n");
    sb.append("    kubernetesVersion: ").append(toIndentedString(kubernetesVersion)).append("\n");
    sb.append("    clusterSize: ").append(toIndentedString(clusterSize)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    envCrn: ").append(toIndentedString(envCrn)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

