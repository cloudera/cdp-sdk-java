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
import com.cloudera.cdp.compute.model.CommonImageCatalogResp;
import com.cloudera.cdp.compute.model.CommonStorageSpecResp;
import com.cloudera.cdp.compute.model.ComputeClusterOwner;
import java.util.*;
import java.util.Map;

/**
 * List clusters item structure.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-06T11:27:19.452-08:00")
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
   * Compute cluster type.
   **/
  private String clusterType = null;

  /**
   * Compute cluster creation time in ISO format.
   **/
  private String creationTime = null;

  /**
   * Compute cluster deletion time in ISO format.
   **/
  private String deletionTime = null;

  /**
   * Compute cluster update time in ISO format.
   **/
  private String updateTime = null;

  /**
   * Cluster state version.
   **/
  private Integer clusterStateVersion = null;

  /**
   * Cluster owner.
   **/
  private ComputeClusterOwner clusterOwner = null;

  /**
   * Region.
   **/
  private String region = null;

  /**
   * Message with additional details about the cluster status.
   **/
  private String message = null;

  /**
   * / CDP account ID.
   **/
  private String account = null;

  /**
   * List of available kubernetes upgrades.
   **/
  private List<String> availableUpgrades = new ArrayList<String>();

  /**
   * The image catalog details.
   **/
  private CommonImageCatalogResp imageCatalog = null;

  /**
   * The storage specifications.
   **/
  private CommonStorageSpecResp storage = null;

  /**
   * Map of labels associated with this cluster.
   **/
  private Map<String, String> labels = new HashMap<String, String>();

  /**
   * The cluster which is automatically created for every containerized environment.
   **/
  private Boolean isDefault = null;

  /**
   * The clusterShape represents the shape of the cluster, which can be \"Embedded\" or \"Externalized\".
   **/
  private String clusterShape = null;

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
   * Getter for clusterType.
   * Compute cluster type.
   **/
  @JsonProperty("clusterType")
  public String getClusterType() {
    return clusterType;
  }

  /**
   * Setter for clusterType.
   * Compute cluster type.
   **/
  public void setClusterType(String clusterType) {
    this.clusterType = clusterType;
  }

  /**
   * Getter for creationTime.
   * Compute cluster creation time in ISO format.
   **/
  @JsonProperty("creationTime")
  public String getCreationTime() {
    return creationTime;
  }

  /**
   * Setter for creationTime.
   * Compute cluster creation time in ISO format.
   **/
  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  /**
   * Getter for deletionTime.
   * Compute cluster deletion time in ISO format.
   **/
  @JsonProperty("deletionTime")
  public String getDeletionTime() {
    return deletionTime;
  }

  /**
   * Setter for deletionTime.
   * Compute cluster deletion time in ISO format.
   **/
  public void setDeletionTime(String deletionTime) {
    this.deletionTime = deletionTime;
  }

  /**
   * Getter for updateTime.
   * Compute cluster update time in ISO format.
   **/
  @JsonProperty("updateTime")
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Setter for updateTime.
   * Compute cluster update time in ISO format.
   **/
  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  /**
   * Getter for clusterStateVersion.
   * Cluster state version.
   **/
  @JsonProperty("clusterStateVersion")
  public Integer getClusterStateVersion() {
    return clusterStateVersion;
  }

  /**
   * Setter for clusterStateVersion.
   * Cluster state version.
   **/
  public void setClusterStateVersion(Integer clusterStateVersion) {
    this.clusterStateVersion = clusterStateVersion;
  }

  /**
   * Getter for clusterOwner.
   * Cluster owner.
   **/
  @JsonProperty("clusterOwner")
  public ComputeClusterOwner getClusterOwner() {
    return clusterOwner;
  }

  /**
   * Setter for clusterOwner.
   * Cluster owner.
   **/
  public void setClusterOwner(ComputeClusterOwner clusterOwner) {
    this.clusterOwner = clusterOwner;
  }

  /**
   * Getter for region.
   * Region.
   **/
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  /**
   * Setter for region.
   * Region.
   **/
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Getter for message.
   * Message with additional details about the cluster status.
   **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Setter for message.
   * Message with additional details about the cluster status.
   **/
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Getter for account.
   * / CDP account ID.
   **/
  @JsonProperty("account")
  public String getAccount() {
    return account;
  }

  /**
   * Setter for account.
   * / CDP account ID.
   **/
  public void setAccount(String account) {
    this.account = account;
  }

  /**
   * Getter for availableUpgrades.
   * List of available kubernetes upgrades.
   **/
  @JsonProperty("availableUpgrades")
  public List<String> getAvailableUpgrades() {
    return availableUpgrades;
  }

  /**
   * Setter for availableUpgrades.
   * List of available kubernetes upgrades.
   **/
  public void setAvailableUpgrades(List<String> availableUpgrades) {
    this.availableUpgrades = availableUpgrades;
  }

  /**
   * Getter for imageCatalog.
   * The image catalog details.
   **/
  @JsonProperty("imageCatalog")
  public CommonImageCatalogResp getImageCatalog() {
    return imageCatalog;
  }

  /**
   * Setter for imageCatalog.
   * The image catalog details.
   **/
  public void setImageCatalog(CommonImageCatalogResp imageCatalog) {
    this.imageCatalog = imageCatalog;
  }

  /**
   * Getter for storage.
   * The storage specifications.
   **/
  @JsonProperty("storage")
  public CommonStorageSpecResp getStorage() {
    return storage;
  }

  /**
   * Setter for storage.
   * The storage specifications.
   **/
  public void setStorage(CommonStorageSpecResp storage) {
    this.storage = storage;
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

  /**
   * Getter for isDefault.
   * The cluster which is automatically created for every containerized environment.
   **/
  @JsonProperty("isDefault")
  public Boolean getIsDefault() {
    return isDefault;
  }

  /**
   * Setter for isDefault.
   * The cluster which is automatically created for every containerized environment.
   **/
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * Getter for clusterShape.
   * The clusterShape represents the shape of the cluster, which can be \&quot;Embedded\&quot; or \&quot;Externalized\&quot;.
   **/
  @JsonProperty("clusterShape")
  public String getClusterShape() {
    return clusterShape;
  }

  /**
   * Setter for clusterShape.
   * The clusterShape represents the shape of the cluster, which can be \&quot;Embedded\&quot; or \&quot;Externalized\&quot;.
   **/
  public void setClusterShape(String clusterShape) {
    this.clusterShape = clusterShape;
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
    if (!Objects.equals(this.clusterType, listClusterItem.clusterType)) {
      return false;
    }
    if (!Objects.equals(this.creationTime, listClusterItem.creationTime)) {
      return false;
    }
    if (!Objects.equals(this.deletionTime, listClusterItem.deletionTime)) {
      return false;
    }
    if (!Objects.equals(this.updateTime, listClusterItem.updateTime)) {
      return false;
    }
    if (!Objects.equals(this.clusterStateVersion, listClusterItem.clusterStateVersion)) {
      return false;
    }
    if (!Objects.equals(this.clusterOwner, listClusterItem.clusterOwner)) {
      return false;
    }
    if (!Objects.equals(this.region, listClusterItem.region)) {
      return false;
    }
    if (!Objects.equals(this.message, listClusterItem.message)) {
      return false;
    }
    if (!Objects.equals(this.account, listClusterItem.account)) {
      return false;
    }
    if (!Objects.equals(this.availableUpgrades, listClusterItem.availableUpgrades)) {
      return false;
    }
    if (!Objects.equals(this.imageCatalog, listClusterItem.imageCatalog)) {
      return false;
    }
    if (!Objects.equals(this.storage, listClusterItem.storage)) {
      return false;
    }
    if (!Objects.equals(this.labels, listClusterItem.labels)) {
      return false;
    }
    if (!Objects.equals(this.isDefault, listClusterItem.isDefault)) {
      return false;
    }
    if (!Objects.equals(this.clusterShape, listClusterItem.clusterShape)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(envName, envCloudProvider, clusterName, clusterCrn, status, computePlatform, computePlatformVersion, kubernetesVersion, clusterSize, clusterId, envCrn, clusterType, creationTime, deletionTime, updateTime, clusterStateVersion, clusterOwner, region, message, account, availableUpgrades, imageCatalog, storage, labels, isDefault, clusterShape);
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
    sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    deletionTime: ").append(toIndentedString(deletionTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    clusterStateVersion: ").append(toIndentedString(clusterStateVersion)).append("\n");
    sb.append("    clusterOwner: ").append(toIndentedString(clusterOwner)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    availableUpgrades: ").append(toIndentedString(availableUpgrades)).append("\n");
    sb.append("    imageCatalog: ").append(toIndentedString(imageCatalog)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    clusterShape: ").append(toIndentedString(clusterShape)).append("\n");
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

