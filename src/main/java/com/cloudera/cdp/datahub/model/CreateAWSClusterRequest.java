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
import com.cloudera.cdp.datahub.model.DatahubResourceTagRequest;
import com.cloudera.cdp.datahub.model.ImageRequest;
import com.cloudera.cdp.datahub.model.InstanceGroupRequest;
import java.util.*;

/**
 * Request object for create AWS cluster request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2019-08-21T15:22:35.104-07:00")
public class CreateAWSClusterRequest  {

  /**
   * The name of the cluster. This name must be unique, must have between 5 and 40 characters, and must contain only lowercase letters, numbers and hyphens. Names are case-sensitive.
   **/
  private String clusterName = null;

  /**
   * The username to login to cluster's Cloudera Manager as an administrator.
   **/
  private String clouderaManagerUsername = null;

  /**
   * The password to login to cluster's Cloudera Manager as an administrator. The password must have between 8 and 100 characters, and must contain atleast 1 character and 1 digit.
   **/
  private String clouderaManagerPassword = null;

  /**
   * The name or CRN of the cluster definition to use for cluster creation.
   **/
  private String clusterDefinitionName = null;

  /**
   * Name of the environment to use when creating the cluster. The environment must be an AWS environment.
   **/
  private String environmentName = null;

  /**
   * Name of the pre-defined or custom blueprint to use for cluster creation.
   **/
  private String blueprintName = null;

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
   * Tags to be added to Datahub related resources.
   **/
  private List<DatahubResourceTagRequest> tags = new ArrayList<DatahubResourceTagRequest>();

  /**
   * JSON template to use for cluster creation.
   **/
  private String clusterTemplate = null;

  /**
   * Getter for clusterName.
   * The name of the cluster. This name must be unique, must have between 5 and 40 characters, and must contain only lowercase letters, numbers and hyphens. Names are case-sensitive.
   **/
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }

  /**
   * Setter for clusterName.
   * The name of the cluster. This name must be unique, must have between 5 and 40 characters, and must contain only lowercase letters, numbers and hyphens. Names are case-sensitive.
   **/
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  /**
   * Getter for clouderaManagerUsername.
   * The username to login to cluster&#39;s Cloudera Manager as an administrator.
   **/
  @JsonProperty("clouderaManagerUsername")
  public String getClouderaManagerUsername() {
    return clouderaManagerUsername;
  }

  /**
   * Setter for clouderaManagerUsername.
   * The username to login to cluster&#39;s Cloudera Manager as an administrator.
   **/
  public void setClouderaManagerUsername(String clouderaManagerUsername) {
    this.clouderaManagerUsername = clouderaManagerUsername;
  }

  /**
   * Getter for clouderaManagerPassword.
   * The password to login to cluster&#39;s Cloudera Manager as an administrator. The password must have between 8 and 100 characters, and must contain atleast 1 character and 1 digit.
   **/
  @JsonProperty("clouderaManagerPassword")
  public String getClouderaManagerPassword() {
    return clouderaManagerPassword;
  }

  /**
   * Setter for clouderaManagerPassword.
   * The password to login to cluster&#39;s Cloudera Manager as an administrator. The password must have between 8 and 100 characters, and must contain atleast 1 character and 1 digit.
   **/
  public void setClouderaManagerPassword(String clouderaManagerPassword) {
    this.clouderaManagerPassword = clouderaManagerPassword;
  }

  /**
   * Getter for clusterDefinitionName.
   * The name or CRN of the cluster definition to use for cluster creation.
   **/
  @JsonProperty("clusterDefinitionName")
  public String getClusterDefinitionName() {
    return clusterDefinitionName;
  }

  /**
   * Setter for clusterDefinitionName.
   * The name or CRN of the cluster definition to use for cluster creation.
   **/
  public void setClusterDefinitionName(String clusterDefinitionName) {
    this.clusterDefinitionName = clusterDefinitionName;
  }

  /**
   * Getter for environmentName.
   * Name of the environment to use when creating the cluster. The environment must be an AWS environment.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * Name of the environment to use when creating the cluster. The environment must be an AWS environment.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for blueprintName.
   * Name of the pre-defined or custom blueprint to use for cluster creation.
   **/
  @JsonProperty("blueprintName")
  public String getBlueprintName() {
    return blueprintName;
  }

  /**
   * Setter for blueprintName.
   * Name of the pre-defined or custom blueprint to use for cluster creation.
   **/
  public void setBlueprintName(String blueprintName) {
    this.blueprintName = blueprintName;
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
   * Tags to be added to Datahub related resources.
   **/
  @JsonProperty("tags")
  public List<DatahubResourceTagRequest> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Tags to be added to Datahub related resources.
   **/
  public void setTags(List<DatahubResourceTagRequest> tags) {
    this.tags = tags;
  }

  /**
   * Getter for clusterTemplate.
   * JSON template to use for cluster creation.
   **/
  @JsonProperty("clusterTemplate")
  public String getClusterTemplate() {
    return clusterTemplate;
  }

  /**
   * Setter for clusterTemplate.
   * JSON template to use for cluster creation.
   **/
  public void setClusterTemplate(String clusterTemplate) {
    this.clusterTemplate = clusterTemplate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAWSClusterRequest createAWSClusterRequest = (CreateAWSClusterRequest) o;
    if (!Objects.equals(this.clusterName, createAWSClusterRequest.clusterName)) {
      return false;
    }
    if (!Objects.equals(this.clouderaManagerUsername, createAWSClusterRequest.clouderaManagerUsername)) {
      return false;
    }
    if (!Objects.equals(this.clouderaManagerPassword, createAWSClusterRequest.clouderaManagerPassword)) {
      return false;
    }
    if (!Objects.equals(this.clusterDefinitionName, createAWSClusterRequest.clusterDefinitionName)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, createAWSClusterRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.blueprintName, createAWSClusterRequest.blueprintName)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroups, createAWSClusterRequest.instanceGroups)) {
      return false;
    }
    if (!Objects.equals(this.subnetId, createAWSClusterRequest.subnetId)) {
      return false;
    }
    if (!Objects.equals(this.image, createAWSClusterRequest.image)) {
      return false;
    }
    if (!Objects.equals(this.tags, createAWSClusterRequest.tags)) {
      return false;
    }
    if (!Objects.equals(this.clusterTemplate, createAWSClusterRequest.clusterTemplate)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterName, clouderaManagerUsername, clouderaManagerPassword, clusterDefinitionName, environmentName, blueprintName, instanceGroups, subnetId, image, tags, clusterTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAWSClusterRequest {\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    clouderaManagerUsername: ").append(toIndentedString(clouderaManagerUsername)).append("\n");
    sb.append("    clouderaManagerPassword: ").append(toIndentedString(clouderaManagerPassword)).append("\n");
    sb.append("    clusterDefinitionName: ").append(toIndentedString(clusterDefinitionName)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    blueprintName: ").append(toIndentedString(blueprintName)).append("\n");
    sb.append("    instanceGroups: ").append(toIndentedString(instanceGroups)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    clusterTemplate: ").append(toIndentedString(clusterTemplate)).append("\n");
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

