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
import com.cloudera.cdp.datahub.model.AzureInstanceGroupRequest;
import com.cloudera.cdp.datahub.model.DatahubResourceTagRequest;
import com.cloudera.cdp.datahub.model.ImageRequest;
import java.util.*;

/**
 * Request object for create Azure cluster request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-11-03T17:11:10.154-07:00")
public class CreateAzureClusterRequest  {

  /**
   * The name of the cluster. This name must be unique, must have between 5 and 40 characters, and must contain only lowercase letters, numbers and hyphens. Names are case-sensitive.
   **/
  private String clusterName = null;

  /**
   * The name or CRN of the cluster definition to use for cluster creation.
   **/
  private String clusterDefinitionName = null;

  /**
   * Name or CRN of the environment to use when creating the cluster. The environment must be an Azure environment.
   **/
  private String environmentName = null;

  /**
   * Name or CRN of the cluster template to use for cluster creation.
   **/
  private String clusterTemplateName = null;

  /**
   * Instance group details.
   **/
  private List<AzureInstanceGroupRequest> instanceGroups = new ArrayList<AzureInstanceGroupRequest>();

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
   * JSON template to use for cluster creation. This is different from cluster template and would be removed in the future.
   **/
  private String requestTemplate = null;

  /**
   * Database type for datahub. Currently supported values: NONE, NON_HA, HA
   **/
  private String datahubDatabase = null;

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
   * Name or CRN of the environment to use when creating the cluster. The environment must be an Azure environment.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * Name or CRN of the environment to use when creating the cluster. The environment must be an Azure environment.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for clusterTemplateName.
   * Name or CRN of the cluster template to use for cluster creation.
   **/
  @JsonProperty("clusterTemplateName")
  public String getClusterTemplateName() {
    return clusterTemplateName;
  }

  /**
   * Setter for clusterTemplateName.
   * Name or CRN of the cluster template to use for cluster creation.
   **/
  public void setClusterTemplateName(String clusterTemplateName) {
    this.clusterTemplateName = clusterTemplateName;
  }

  /**
   * Getter for instanceGroups.
   * Instance group details.
   **/
  @JsonProperty("instanceGroups")
  public List<AzureInstanceGroupRequest> getInstanceGroups() {
    return instanceGroups;
  }

  /**
   * Setter for instanceGroups.
   * Instance group details.
   **/
  public void setInstanceGroups(List<AzureInstanceGroupRequest> instanceGroups) {
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
   * Getter for requestTemplate.
   * JSON template to use for cluster creation. This is different from cluster template and would be removed in the future.
   **/
  @JsonProperty("requestTemplate")
  public String getRequestTemplate() {
    return requestTemplate;
  }

  /**
   * Setter for requestTemplate.
   * JSON template to use for cluster creation. This is different from cluster template and would be removed in the future.
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAzureClusterRequest createAzureClusterRequest = (CreateAzureClusterRequest) o;
    if (!Objects.equals(this.clusterName, createAzureClusterRequest.clusterName)) {
      return false;
    }
    if (!Objects.equals(this.clusterDefinitionName, createAzureClusterRequest.clusterDefinitionName)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, createAzureClusterRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.clusterTemplateName, createAzureClusterRequest.clusterTemplateName)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroups, createAzureClusterRequest.instanceGroups)) {
      return false;
    }
    if (!Objects.equals(this.subnetId, createAzureClusterRequest.subnetId)) {
      return false;
    }
    if (!Objects.equals(this.image, createAzureClusterRequest.image)) {
      return false;
    }
    if (!Objects.equals(this.tags, createAzureClusterRequest.tags)) {
      return false;
    }
    if (!Objects.equals(this.requestTemplate, createAzureClusterRequest.requestTemplate)) {
      return false;
    }
    if (!Objects.equals(this.datahubDatabase, createAzureClusterRequest.datahubDatabase)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterName, clusterDefinitionName, environmentName, clusterTemplateName, instanceGroups, subnetId, image, tags, requestTemplate, datahubDatabase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAzureClusterRequest {\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    clusterDefinitionName: ").append(toIndentedString(clusterDefinitionName)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    clusterTemplateName: ").append(toIndentedString(clusterTemplateName)).append("\n");
    sb.append("    instanceGroups: ").append(toIndentedString(instanceGroups)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    requestTemplate: ").append(toIndentedString(requestTemplate)).append("\n");
    sb.append("    datahubDatabase: ").append(toIndentedString(datahubDatabase)).append("\n");
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

