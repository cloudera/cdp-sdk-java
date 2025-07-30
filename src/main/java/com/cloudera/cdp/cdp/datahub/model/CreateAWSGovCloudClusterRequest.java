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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datahub.model.ClusterExtension;
import com.cloudera.cdp.datahub.model.DatahubResourceTagRequest;
import com.cloudera.cdp.datahub.model.ImageRequest;
import com.cloudera.cdp.datahub.model.InstanceGroupRequest;
import java.util.*;

/**
 * Request object for creating AWS  Data Hub cluster request on GovCloud.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:39.671-07:00")
public class CreateAWSGovCloudClusterRequest  {

  /**
   * The name of the cluster. This name must be unique, must have between 5 and 40 characters, and must contain only lowercase letters, numbers, and hyphens. Names are case-sensitive.
   **/
  private String clusterName = null;

  /**
   * The name or CRN of the cluster definition to use for cluster creation.
   **/
  private String clusterDefinition = null;

  /**
   * Name or CRN of the environment to use when creating the cluster. The environment must be an AWS GovCloud environment.
   **/
  private String environment = null;

  /**
   * Name or CRN of the cluster template to use for cluster creation.
   **/
  private String clusterTemplate = null;

  /**
   * Instance group details.
   **/
  private List<InstanceGroupRequest> instanceGroups = new ArrayList<InstanceGroupRequest>();

  /**
   * The subnet ID.
   **/
  private String subnetId = null;

  /**
   * The image to be used for cluster creation.
   **/
  private ImageRequest image = null;

  /**
   * Tags to be added to  Data Hub related resources.
   **/
  private List<DatahubResourceTagRequest> tags = new ArrayList<DatahubResourceTagRequest>();

  /**
   * JSON template to use for cluster creation. This is different from the cluster template and would be removed in the future.
   **/
  private String requestTemplate = null;

  /**
   * Database type for datahub. Currently supported values: NONE, NON_HA, HA
   **/
  private String datahubDatabase = null;

  /**
   * List of subnet IDs in case of multi availability zone setup.
   **/
  private List<String> subnetIds = new ArrayList<String>();

  /**
   * Flag that toggles the multi availability zone for the given Data Hub cluster when you are not sure what subnet IDs can be used. This way the subnet IDs will be used what the environment suggests.
   **/
  private Boolean multiAz = null;

  /**
   * Cluster extensions for the given Data Hub cluster.
   **/
  private ClusterExtension clusterExtension = null;

  /**
   * Flag that decides whether to provision a load-balancer to front various service endpoints for the given datahub. This will typically be used for HA cluster shapes.
   **/
  private Boolean enableLoadBalancer = null;

  /**
   * Configure the major version of Java on the cluster.
   **/
  private Integer javaVersion = null;

  /**
   * Getter for clusterName.
   * The name of the cluster. This name must be unique, must have between 5 and 40 characters, and must contain only lowercase letters, numbers, and hyphens. Names are case-sensitive.
   **/
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }

  /**
   * Setter for clusterName.
   * The name of the cluster. This name must be unique, must have between 5 and 40 characters, and must contain only lowercase letters, numbers, and hyphens. Names are case-sensitive.
   **/
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  /**
   * Getter for clusterDefinition.
   * The name or CRN of the cluster definition to use for cluster creation.
   **/
  @JsonProperty("clusterDefinition")
  public String getClusterDefinition() {
    return clusterDefinition;
  }

  /**
   * Setter for clusterDefinition.
   * The name or CRN of the cluster definition to use for cluster creation.
   **/
  public void setClusterDefinition(String clusterDefinition) {
    this.clusterDefinition = clusterDefinition;
  }

  /**
   * Getter for environment.
   * Name or CRN of the environment to use when creating the cluster. The environment must be an AWS GovCloud environment.
   **/
  @JsonProperty("environment")
  public String getEnvironment() {
    return environment;
  }

  /**
   * Setter for environment.
   * Name or CRN of the environment to use when creating the cluster. The environment must be an AWS GovCloud environment.
   **/
  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  /**
   * Getter for clusterTemplate.
   * Name or CRN of the cluster template to use for cluster creation.
   **/
  @JsonProperty("clusterTemplate")
  public String getClusterTemplate() {
    return clusterTemplate;
  }

  /**
   * Setter for clusterTemplate.
   * Name or CRN of the cluster template to use for cluster creation.
   **/
  public void setClusterTemplate(String clusterTemplate) {
    this.clusterTemplate = clusterTemplate;
  }

  /**
   * Getter for instanceGroups.
   * Instance group details.
   **/
  @JsonProperty("instanceGroups")
  public List<InstanceGroupRequest> getInstanceGroups() {
    return instanceGroups;
  }

  /**
   * Setter for instanceGroups.
   * Instance group details.
   **/
  public void setInstanceGroups(List<InstanceGroupRequest> instanceGroups) {
    this.instanceGroups = instanceGroups;
  }

  /**
   * Getter for subnetId.
   * The subnet ID.
   **/
  @JsonProperty("subnetId")
  public String getSubnetId() {
    return subnetId;
  }

  /**
   * Setter for subnetId.
   * The subnet ID.
   **/
  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  /**
   * Getter for image.
   * The image to be used for cluster creation.
   **/
  @JsonProperty("image")
  public ImageRequest getImage() {
    return image;
  }

  /**
   * Setter for image.
   * The image to be used for cluster creation.
   **/
  public void setImage(ImageRequest image) {
    this.image = image;
  }

  /**
   * Getter for tags.
   * Tags to be added to  Data Hub related resources.
   **/
  @JsonProperty("tags")
  public List<DatahubResourceTagRequest> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Tags to be added to  Data Hub related resources.
   **/
  public void setTags(List<DatahubResourceTagRequest> tags) {
    this.tags = tags;
  }

  /**
   * Getter for requestTemplate.
   * JSON template to use for cluster creation. This is different from the cluster template and would be removed in the future.
   **/
  @JsonProperty("requestTemplate")
  public String getRequestTemplate() {
    return requestTemplate;
  }

  /**
   * Setter for requestTemplate.
   * JSON template to use for cluster creation. This is different from the cluster template and would be removed in the future.
   **/
  public void setRequestTemplate(String requestTemplate) {
    this.requestTemplate = requestTemplate;
  }

  /**
   * Getter for datahubDatabase.
   * Database type for datahub. Currently supported values: NONE, NON_HA, HA
   **/
  @JsonProperty("datahubDatabase")
  public String getDatahubDatabase() {
    return datahubDatabase;
  }

  /**
   * Setter for datahubDatabase.
   * Database type for datahub. Currently supported values: NONE, NON_HA, HA
   **/
  public void setDatahubDatabase(String datahubDatabase) {
    this.datahubDatabase = datahubDatabase;
  }

  /**
   * Getter for subnetIds.
   * List of subnet IDs in case of multi availability zone setup.
   **/
  @JsonProperty("subnetIds")
  public List<String> getSubnetIds() {
    return subnetIds;
  }

  /**
   * Setter for subnetIds.
   * List of subnet IDs in case of multi availability zone setup.
   **/
  public void setSubnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
  }

  /**
   * Getter for multiAz.
   * Flag that toggles the multi availability zone for the given Data Hub cluster when you are not sure what subnet IDs can be used. This way the subnet IDs will be used what the environment suggests.
   **/
  @JsonProperty("multiAz")
  public Boolean getMultiAz() {
    return multiAz;
  }

  /**
   * Setter for multiAz.
   * Flag that toggles the multi availability zone for the given Data Hub cluster when you are not sure what subnet IDs can be used. This way the subnet IDs will be used what the environment suggests.
   **/
  public void setMultiAz(Boolean multiAz) {
    this.multiAz = multiAz;
  }

  /**
   * Getter for clusterExtension.
   * Cluster extensions for the given Data Hub cluster.
   **/
  @JsonProperty("clusterExtension")
  public ClusterExtension getClusterExtension() {
    return clusterExtension;
  }

  /**
   * Setter for clusterExtension.
   * Cluster extensions for the given Data Hub cluster.
   **/
  public void setClusterExtension(ClusterExtension clusterExtension) {
    this.clusterExtension = clusterExtension;
  }

  /**
   * Getter for enableLoadBalancer.
   * Flag that decides whether to provision a load-balancer to front various service endpoints for the given datahub. This will typically be used for HA cluster shapes.
   **/
  @JsonProperty("enableLoadBalancer")
  public Boolean getEnableLoadBalancer() {
    return enableLoadBalancer;
  }

  /**
   * Setter for enableLoadBalancer.
   * Flag that decides whether to provision a load-balancer to front various service endpoints for the given datahub. This will typically be used for HA cluster shapes.
   **/
  public void setEnableLoadBalancer(Boolean enableLoadBalancer) {
    this.enableLoadBalancer = enableLoadBalancer;
  }

  /**
   * Getter for javaVersion.
   * Configure the major version of Java on the cluster.
   **/
  @JsonProperty("javaVersion")
  public Integer getJavaVersion() {
    return javaVersion;
  }

  /**
   * Setter for javaVersion.
   * Configure the major version of Java on the cluster.
   **/
  public void setJavaVersion(Integer javaVersion) {
    this.javaVersion = javaVersion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAWSGovCloudClusterRequest createAWSGovCloudClusterRequest = (CreateAWSGovCloudClusterRequest) o;
    if (!Objects.equals(this.clusterName, createAWSGovCloudClusterRequest.clusterName)) {
      return false;
    }
    if (!Objects.equals(this.clusterDefinition, createAWSGovCloudClusterRequest.clusterDefinition)) {
      return false;
    }
    if (!Objects.equals(this.environment, createAWSGovCloudClusterRequest.environment)) {
      return false;
    }
    if (!Objects.equals(this.clusterTemplate, createAWSGovCloudClusterRequest.clusterTemplate)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroups, createAWSGovCloudClusterRequest.instanceGroups)) {
      return false;
    }
    if (!Objects.equals(this.subnetId, createAWSGovCloudClusterRequest.subnetId)) {
      return false;
    }
    if (!Objects.equals(this.image, createAWSGovCloudClusterRequest.image)) {
      return false;
    }
    if (!Objects.equals(this.tags, createAWSGovCloudClusterRequest.tags)) {
      return false;
    }
    if (!Objects.equals(this.requestTemplate, createAWSGovCloudClusterRequest.requestTemplate)) {
      return false;
    }
    if (!Objects.equals(this.datahubDatabase, createAWSGovCloudClusterRequest.datahubDatabase)) {
      return false;
    }
    if (!Objects.equals(this.subnetIds, createAWSGovCloudClusterRequest.subnetIds)) {
      return false;
    }
    if (!Objects.equals(this.multiAz, createAWSGovCloudClusterRequest.multiAz)) {
      return false;
    }
    if (!Objects.equals(this.clusterExtension, createAWSGovCloudClusterRequest.clusterExtension)) {
      return false;
    }
    if (!Objects.equals(this.enableLoadBalancer, createAWSGovCloudClusterRequest.enableLoadBalancer)) {
      return false;
    }
    if (!Objects.equals(this.javaVersion, createAWSGovCloudClusterRequest.javaVersion)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterName, clusterDefinition, environment, clusterTemplate, instanceGroups, subnetId, image, tags, requestTemplate, datahubDatabase, subnetIds, multiAz, clusterExtension, enableLoadBalancer, javaVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAWSGovCloudClusterRequest {\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    clusterDefinition: ").append(toIndentedString(clusterDefinition)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    clusterTemplate: ").append(toIndentedString(clusterTemplate)).append("\n");
    sb.append("    instanceGroups: ").append(toIndentedString(instanceGroups)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    requestTemplate: ").append(toIndentedString(requestTemplate)).append("\n");
    sb.append("    datahubDatabase: ").append(toIndentedString(datahubDatabase)).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
    sb.append("    multiAz: ").append(toIndentedString(multiAz)).append("\n");
    sb.append("    clusterExtension: ").append(toIndentedString(clusterExtension)).append("\n");
    sb.append("    enableLoadBalancer: ").append(toIndentedString(enableLoadBalancer)).append("\n");
    sb.append("    javaVersion: ").append(toIndentedString(javaVersion)).append("\n");
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

