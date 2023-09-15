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

package com.cloudera.cdp.replicationmanager.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.replicationmanager.model.CodProperties;
import com.cloudera.cdp.replicationmanager.model.Location;

/**
 * Describes a Datalake, Datahub or Classic cluster.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-09-14T10:47:20.396-07:00")
public class Cluster  {

  /**
   * Cluster CRN.
   **/
  private String crn = null;

  /**
   * Cluster name.
   **/
  private String name = null;

  /**
   * Cluster data center.
   **/
  private String dataCenter = null;

  /**
   * Cluster type.
   **/
  private String clusterType = null;

  /**
   * Replication engine type.
   **/
  private String replicationEngineType = null;

  /**
   * Cluster Manager type.
   **/
  private String clusterManagerType = null;

  /**
   * Cluster Manager URL.
   **/
  private String clusterManagerUrl = null;

  /**
   * Cluster URL.
   **/
  private String clusterUrl = null;

  /**
   * Total hosts on the cluster.
   **/
  private Integer totalHosts = null;

  /**
   * Cluster location.
   **/
  private Location location = null;

  /**
   * Stack CRN.
   **/
  private String stackCrn = null;

  /**
   * Cluster description.
   **/
  private String description = null;

  /**
   * Stack major version.
   **/
  private String stackMajorVersion = null;

  /**
   * Stack version.
   **/
  private String stackVersion = null;

  /**
   * Cluster UUID from Cloudera Manager if the cluster has CM backend.
   **/
  private String uuid = null;

  /**
   * CRN of the cluster's environment.
   **/
  private String environmentCrn = null;

  /**
   * Knox URL if the cluster was registered with one, null otherwise.
   **/
  private String knoxUrl = null;

  /**
   * Cloud account provider.
   **/
  private String cloudAccountProvider = null;

  /**
   * Cloudera Manager name.
   **/
  private String cmName = null;

  /**
   * Additional properties for operational databases.
   **/
  private CodProperties codProperties = null;

  /**
   * Getter for crn.
   * Cluster CRN.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * Cluster CRN.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for name.
   * Cluster name.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Cluster name.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for dataCenter.
   * Cluster data center.
   **/
  @JsonProperty("dataCenter")
  public String getDataCenter() {
    return dataCenter;
  }

  /**
   * Setter for dataCenter.
   * Cluster data center.
   **/
  public void setDataCenter(String dataCenter) {
    this.dataCenter = dataCenter;
  }

  /**
   * Getter for clusterType.
   * Cluster type.
   **/
  @JsonProperty("clusterType")
  public String getClusterType() {
    return clusterType;
  }

  /**
   * Setter for clusterType.
   * Cluster type.
   **/
  public void setClusterType(String clusterType) {
    this.clusterType = clusterType;
  }

  /**
   * Getter for replicationEngineType.
   * Replication engine type.
   **/
  @JsonProperty("replicationEngineType")
  public String getReplicationEngineType() {
    return replicationEngineType;
  }

  /**
   * Setter for replicationEngineType.
   * Replication engine type.
   **/
  public void setReplicationEngineType(String replicationEngineType) {
    this.replicationEngineType = replicationEngineType;
  }

  /**
   * Getter for clusterManagerType.
   * Cluster Manager type.
   **/
  @JsonProperty("clusterManagerType")
  public String getClusterManagerType() {
    return clusterManagerType;
  }

  /**
   * Setter for clusterManagerType.
   * Cluster Manager type.
   **/
  public void setClusterManagerType(String clusterManagerType) {
    this.clusterManagerType = clusterManagerType;
  }

  /**
   * Getter for clusterManagerUrl.
   * Cluster Manager URL.
   **/
  @JsonProperty("clusterManagerUrl")
  public String getClusterManagerUrl() {
    return clusterManagerUrl;
  }

  /**
   * Setter for clusterManagerUrl.
   * Cluster Manager URL.
   **/
  public void setClusterManagerUrl(String clusterManagerUrl) {
    this.clusterManagerUrl = clusterManagerUrl;
  }

  /**
   * Getter for clusterUrl.
   * Cluster URL.
   **/
  @JsonProperty("clusterUrl")
  public String getClusterUrl() {
    return clusterUrl;
  }

  /**
   * Setter for clusterUrl.
   * Cluster URL.
   **/
  public void setClusterUrl(String clusterUrl) {
    this.clusterUrl = clusterUrl;
  }

  /**
   * Getter for totalHosts.
   * Total hosts on the cluster.
   **/
  @JsonProperty("totalHosts")
  public Integer getTotalHosts() {
    return totalHosts;
  }

  /**
   * Setter for totalHosts.
   * Total hosts on the cluster.
   **/
  public void setTotalHosts(Integer totalHosts) {
    this.totalHosts = totalHosts;
  }

  /**
   * Getter for location.
   * Cluster location.
   **/
  @JsonProperty("location")
  public Location getLocation() {
    return location;
  }

  /**
   * Setter for location.
   * Cluster location.
   **/
  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * Getter for stackCrn.
   * Stack CRN.
   **/
  @JsonProperty("stackCrn")
  public String getStackCrn() {
    return stackCrn;
  }

  /**
   * Setter for stackCrn.
   * Stack CRN.
   **/
  public void setStackCrn(String stackCrn) {
    this.stackCrn = stackCrn;
  }

  /**
   * Getter for description.
   * Cluster description.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * Cluster description.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for stackMajorVersion.
   * Stack major version.
   **/
  @JsonProperty("stackMajorVersion")
  public String getStackMajorVersion() {
    return stackMajorVersion;
  }

  /**
   * Setter for stackMajorVersion.
   * Stack major version.
   **/
  public void setStackMajorVersion(String stackMajorVersion) {
    this.stackMajorVersion = stackMajorVersion;
  }

  /**
   * Getter for stackVersion.
   * Stack version.
   **/
  @JsonProperty("stackVersion")
  public String getStackVersion() {
    return stackVersion;
  }

  /**
   * Setter for stackVersion.
   * Stack version.
   **/
  public void setStackVersion(String stackVersion) {
    this.stackVersion = stackVersion;
  }

  /**
   * Getter for uuid.
   * Cluster UUID from Cloudera Manager if the cluster has CM backend.
   **/
  @JsonProperty("uuid")
  public String getUuid() {
    return uuid;
  }

  /**
   * Setter for uuid.
   * Cluster UUID from Cloudera Manager if the cluster has CM backend.
   **/
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * Getter for environmentCrn.
   * CRN of the cluster&#39;s environment.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * CRN of the cluster&#39;s environment.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for knoxUrl.
   * Knox URL if the cluster was registered with one, null otherwise.
   **/
  @JsonProperty("knoxUrl")
  public String getKnoxUrl() {
    return knoxUrl;
  }

  /**
   * Setter for knoxUrl.
   * Knox URL if the cluster was registered with one, null otherwise.
   **/
  public void setKnoxUrl(String knoxUrl) {
    this.knoxUrl = knoxUrl;
  }

  /**
   * Getter for cloudAccountProvider.
   * Cloud account provider.
   **/
  @JsonProperty("cloudAccountProvider")
  public String getCloudAccountProvider() {
    return cloudAccountProvider;
  }

  /**
   * Setter for cloudAccountProvider.
   * Cloud account provider.
   **/
  public void setCloudAccountProvider(String cloudAccountProvider) {
    this.cloudAccountProvider = cloudAccountProvider;
  }

  /**
   * Getter for cmName.
   * Cloudera Manager name.
   **/
  @JsonProperty("cmName")
  public String getCmName() {
    return cmName;
  }

  /**
   * Setter for cmName.
   * Cloudera Manager name.
   **/
  public void setCmName(String cmName) {
    this.cmName = cmName;
  }

  /**
   * Getter for codProperties.
   * Additional properties for operational databases.
   **/
  @JsonProperty("codProperties")
  public CodProperties getCodProperties() {
    return codProperties;
  }

  /**
   * Setter for codProperties.
   * Additional properties for operational databases.
   **/
  public void setCodProperties(CodProperties codProperties) {
    this.codProperties = codProperties;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cluster cluster = (Cluster) o;
    if (!Objects.equals(this.crn, cluster.crn)) {
      return false;
    }
    if (!Objects.equals(this.name, cluster.name)) {
      return false;
    }
    if (!Objects.equals(this.dataCenter, cluster.dataCenter)) {
      return false;
    }
    if (!Objects.equals(this.clusterType, cluster.clusterType)) {
      return false;
    }
    if (!Objects.equals(this.replicationEngineType, cluster.replicationEngineType)) {
      return false;
    }
    if (!Objects.equals(this.clusterManagerType, cluster.clusterManagerType)) {
      return false;
    }
    if (!Objects.equals(this.clusterManagerUrl, cluster.clusterManagerUrl)) {
      return false;
    }
    if (!Objects.equals(this.clusterUrl, cluster.clusterUrl)) {
      return false;
    }
    if (!Objects.equals(this.totalHosts, cluster.totalHosts)) {
      return false;
    }
    if (!Objects.equals(this.location, cluster.location)) {
      return false;
    }
    if (!Objects.equals(this.stackCrn, cluster.stackCrn)) {
      return false;
    }
    if (!Objects.equals(this.description, cluster.description)) {
      return false;
    }
    if (!Objects.equals(this.stackMajorVersion, cluster.stackMajorVersion)) {
      return false;
    }
    if (!Objects.equals(this.stackVersion, cluster.stackVersion)) {
      return false;
    }
    if (!Objects.equals(this.uuid, cluster.uuid)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, cluster.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.knoxUrl, cluster.knoxUrl)) {
      return false;
    }
    if (!Objects.equals(this.cloudAccountProvider, cluster.cloudAccountProvider)) {
      return false;
    }
    if (!Objects.equals(this.cmName, cluster.cmName)) {
      return false;
    }
    if (!Objects.equals(this.codProperties, cluster.codProperties)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, name, dataCenter, clusterType, replicationEngineType, clusterManagerType, clusterManagerUrl, clusterUrl, totalHosts, location, stackCrn, description, stackMajorVersion, stackVersion, uuid, environmentCrn, knoxUrl, cloudAccountProvider, cmName, codProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cluster {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dataCenter: ").append(toIndentedString(dataCenter)).append("\n");
    sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
    sb.append("    replicationEngineType: ").append(toIndentedString(replicationEngineType)).append("\n");
    sb.append("    clusterManagerType: ").append(toIndentedString(clusterManagerType)).append("\n");
    sb.append("    clusterManagerUrl: ").append(toIndentedString(clusterManagerUrl)).append("\n");
    sb.append("    clusterUrl: ").append(toIndentedString(clusterUrl)).append("\n");
    sb.append("    totalHosts: ").append(toIndentedString(totalHosts)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    stackCrn: ").append(toIndentedString(stackCrn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    stackMajorVersion: ").append(toIndentedString(stackMajorVersion)).append("\n");
    sb.append("    stackVersion: ").append(toIndentedString(stackVersion)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    knoxUrl: ").append(toIndentedString(knoxUrl)).append("\n");
    sb.append("    cloudAccountProvider: ").append(toIndentedString(cloudAccountProvider)).append("\n");
    sb.append("    cmName: ").append(toIndentedString(cmName)).append("\n");
    sb.append("    codProperties: ").append(toIndentedString(codProperties)).append("\n");
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

