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

package com.cloudera.cdp.opdb.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.opdb.model.AttachedStorageForWorkers;
import com.cloudera.cdp.opdb.model.AutoScalingParameters;
import com.cloudera.cdp.opdb.model.CustomRecipe;
import com.cloudera.cdp.opdb.model.Image;
import com.cloudera.cdp.opdb.model.KeyValuePair;
import com.cloudera.cdp.opdb.model.VolumeEncryption;
import java.util.*;

/**
 * A request to create the database
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-09-03T11:22:09.829-07:00")
public class CreateDatabaseRequest  {

  /**
   * environment name
   **/
  private String environmentName = null;

  /**
   * database name
   **/
  private String databaseName = null;

  /**
   * Parameters to configure the AutoScaling
   **/
  private AutoScalingParameters autoScalingParameters = null;

  /**
   * Override subnet where the database will be deployed. Disables Multi-AZ if set [only for AWS].
   **/
  private String subnetId = null;

  /**
   * Optional tags to apply to launched infrastructure resources
   **/
  private List<KeyValuePair> customUserTags = new ArrayList<KeyValuePair>();

  /**
   * Disable deployment into multiple availability-zones (the database will be deployed into one subnet).
   **/
  private Boolean disableMultiAz = null;

  /**
   * Attached storage for the worker nodes for AWS, Azure, and GCP cloud providers.
   **/
  private AttachedStorageForWorkers attachedStorageForWorkers = null;

  /**
   * Disable Kerberos authentication.
   **/
  private Boolean disableKerberos = null;

  /**
   * Number of edge nodes to be created for the database. A positive, non-zero number is required. The default value is 0.
   **/
  private Integer numEdgeNodes = null;

  /**
   * Image details for the database.
   **/
  private Image image = null;

  /**
   * Disable OAuth Bearer (JWT) authentication scheme.
   **/
  private Boolean disableJwtAuth = null;

  /**
   * To enable the region canary for the database.
   **/
  private Boolean enableRegionCanary = null;

  /**
   * Optional tags to choose one of the predefined cluster sizes.
   **/
  private String scaleType = null;

  /**
   * Optional tag to choose the storage types.
   **/
  private String storageType = null;

  /**
   * Custom recipes for the database.
   **/
  private List<CustomRecipe> recipes = new ArrayList<CustomRecipe>();

  /**
   * To enable grafana server for the database.
   **/
  private Boolean enableGrafana = null;

  /**
   * Root volume size in GiB.
   **/
  private Integer rootVolumeSize = null;

  /**
   * Specifies encryption key to encrypt volume for instance group. It is currently supported for AWS cloud provider only.
   **/
  private List<VolumeEncryption> volumeEncryptions = new ArrayList<VolumeEncryption>();

  /**
   * Getter for environmentName.
   * environment name
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * environment name
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for databaseName.
   * database name
   **/
  @JsonProperty("databaseName")
  public String getDatabaseName() {
    return databaseName;
  }

  /**
   * Setter for databaseName.
   * database name
   **/
  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }

  /**
   * Getter for autoScalingParameters.
   * Parameters to configure the AutoScaling
   **/
  @JsonProperty("autoScalingParameters")
  public AutoScalingParameters getAutoScalingParameters() {
    return autoScalingParameters;
  }

  /**
   * Setter for autoScalingParameters.
   * Parameters to configure the AutoScaling
   **/
  public void setAutoScalingParameters(AutoScalingParameters autoScalingParameters) {
    this.autoScalingParameters = autoScalingParameters;
  }

  /**
   * Getter for subnetId.
   * Override subnet where the database will be deployed. Disables Multi-AZ if set [only for AWS].
   **/
  @JsonProperty("subnetId")
  public String getSubnetId() {
    return subnetId;
  }

  /**
   * Setter for subnetId.
   * Override subnet where the database will be deployed. Disables Multi-AZ if set [only for AWS].
   **/
  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  /**
   * Getter for customUserTags.
   * Optional tags to apply to launched infrastructure resources
   **/
  @JsonProperty("customUserTags")
  public List<KeyValuePair> getCustomUserTags() {
    return customUserTags;
  }

  /**
   * Setter for customUserTags.
   * Optional tags to apply to launched infrastructure resources
   **/
  public void setCustomUserTags(List<KeyValuePair> customUserTags) {
    this.customUserTags = customUserTags;
  }

  /**
   * Getter for disableMultiAz.
   * Disable deployment into multiple availability-zones (the database will be deployed into one subnet).
   **/
  @JsonProperty("disableMultiAz")
  public Boolean getDisableMultiAz() {
    return disableMultiAz;
  }

  /**
   * Setter for disableMultiAz.
   * Disable deployment into multiple availability-zones (the database will be deployed into one subnet).
   **/
  public void setDisableMultiAz(Boolean disableMultiAz) {
    this.disableMultiAz = disableMultiAz;
  }

  /**
   * Getter for attachedStorageForWorkers.
   * Attached storage for the worker nodes for AWS, Azure, and GCP cloud providers.
   **/
  @JsonProperty("attachedStorageForWorkers")
  public AttachedStorageForWorkers getAttachedStorageForWorkers() {
    return attachedStorageForWorkers;
  }

  /**
   * Setter for attachedStorageForWorkers.
   * Attached storage for the worker nodes for AWS, Azure, and GCP cloud providers.
   **/
  public void setAttachedStorageForWorkers(AttachedStorageForWorkers attachedStorageForWorkers) {
    this.attachedStorageForWorkers = attachedStorageForWorkers;
  }

  /**
   * Getter for disableKerberos.
   * Disable Kerberos authentication.
   **/
  @JsonProperty("disableKerberos")
  public Boolean getDisableKerberos() {
    return disableKerberos;
  }

  /**
   * Setter for disableKerberos.
   * Disable Kerberos authentication.
   **/
  public void setDisableKerberos(Boolean disableKerberos) {
    this.disableKerberos = disableKerberos;
  }

  /**
   * Getter for numEdgeNodes.
   * Number of edge nodes to be created for the database. A positive, non-zero number is required. The default value is 0.
   **/
  @JsonProperty("numEdgeNodes")
  public Integer getNumEdgeNodes() {
    return numEdgeNodes;
  }

  /**
   * Setter for numEdgeNodes.
   * Number of edge nodes to be created for the database. A positive, non-zero number is required. The default value is 0.
   **/
  public void setNumEdgeNodes(Integer numEdgeNodes) {
    this.numEdgeNodes = numEdgeNodes;
  }

  /**
   * Getter for image.
   * Image details for the database.
   **/
  @JsonProperty("image")
  public Image getImage() {
    return image;
  }

  /**
   * Setter for image.
   * Image details for the database.
   **/
  public void setImage(Image image) {
    this.image = image;
  }

  /**
   * Getter for disableJwtAuth.
   * Disable OAuth Bearer (JWT) authentication scheme.
   **/
  @JsonProperty("disableJwtAuth")
  public Boolean getDisableJwtAuth() {
    return disableJwtAuth;
  }

  /**
   * Setter for disableJwtAuth.
   * Disable OAuth Bearer (JWT) authentication scheme.
   **/
  public void setDisableJwtAuth(Boolean disableJwtAuth) {
    this.disableJwtAuth = disableJwtAuth;
  }

  /**
   * Getter for enableRegionCanary.
   * To enable the region canary for the database.
   **/
  @JsonProperty("enableRegionCanary")
  public Boolean getEnableRegionCanary() {
    return enableRegionCanary;
  }

  /**
   * Setter for enableRegionCanary.
   * To enable the region canary for the database.
   **/
  public void setEnableRegionCanary(Boolean enableRegionCanary) {
    this.enableRegionCanary = enableRegionCanary;
  }

  /**
   * Getter for scaleType.
   * Optional tags to choose one of the predefined cluster sizes.
   **/
  @JsonProperty("scaleType")
  public String getScaleType() {
    return scaleType;
  }

  /**
   * Setter for scaleType.
   * Optional tags to choose one of the predefined cluster sizes.
   **/
  public void setScaleType(String scaleType) {
    this.scaleType = scaleType;
  }

  /**
   * Getter for storageType.
   * Optional tag to choose the storage types.
   **/
  @JsonProperty("storageType")
  public String getStorageType() {
    return storageType;
  }

  /**
   * Setter for storageType.
   * Optional tag to choose the storage types.
   **/
  public void setStorageType(String storageType) {
    this.storageType = storageType;
  }

  /**
   * Getter for recipes.
   * Custom recipes for the database.
   **/
  @JsonProperty("recipes")
  public List<CustomRecipe> getRecipes() {
    return recipes;
  }

  /**
   * Setter for recipes.
   * Custom recipes for the database.
   **/
  public void setRecipes(List<CustomRecipe> recipes) {
    this.recipes = recipes;
  }

  /**
   * Getter for enableGrafana.
   * To enable grafana server for the database.
   **/
  @JsonProperty("enableGrafana")
  public Boolean getEnableGrafana() {
    return enableGrafana;
  }

  /**
   * Setter for enableGrafana.
   * To enable grafana server for the database.
   **/
  public void setEnableGrafana(Boolean enableGrafana) {
    this.enableGrafana = enableGrafana;
  }

  /**
   * Getter for rootVolumeSize.
   * Root volume size in GiB.
   **/
  @JsonProperty("rootVolumeSize")
  public Integer getRootVolumeSize() {
    return rootVolumeSize;
  }

  /**
   * Setter for rootVolumeSize.
   * Root volume size in GiB.
   **/
  public void setRootVolumeSize(Integer rootVolumeSize) {
    this.rootVolumeSize = rootVolumeSize;
  }

  /**
   * Getter for volumeEncryptions.
   * Specifies encryption key to encrypt volume for instance group. It is currently supported for AWS cloud provider only.
   **/
  @JsonProperty("volumeEncryptions")
  public List<VolumeEncryption> getVolumeEncryptions() {
    return volumeEncryptions;
  }

  /**
   * Setter for volumeEncryptions.
   * Specifies encryption key to encrypt volume for instance group. It is currently supported for AWS cloud provider only.
   **/
  public void setVolumeEncryptions(List<VolumeEncryption> volumeEncryptions) {
    this.volumeEncryptions = volumeEncryptions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDatabaseRequest createDatabaseRequest = (CreateDatabaseRequest) o;
    if (!Objects.equals(this.environmentName, createDatabaseRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.databaseName, createDatabaseRequest.databaseName)) {
      return false;
    }
    if (!Objects.equals(this.autoScalingParameters, createDatabaseRequest.autoScalingParameters)) {
      return false;
    }
    if (!Objects.equals(this.subnetId, createDatabaseRequest.subnetId)) {
      return false;
    }
    if (!Objects.equals(this.customUserTags, createDatabaseRequest.customUserTags)) {
      return false;
    }
    if (!Objects.equals(this.disableMultiAz, createDatabaseRequest.disableMultiAz)) {
      return false;
    }
    if (!Objects.equals(this.attachedStorageForWorkers, createDatabaseRequest.attachedStorageForWorkers)) {
      return false;
    }
    if (!Objects.equals(this.disableKerberos, createDatabaseRequest.disableKerberos)) {
      return false;
    }
    if (!Objects.equals(this.numEdgeNodes, createDatabaseRequest.numEdgeNodes)) {
      return false;
    }
    if (!Objects.equals(this.image, createDatabaseRequest.image)) {
      return false;
    }
    if (!Objects.equals(this.disableJwtAuth, createDatabaseRequest.disableJwtAuth)) {
      return false;
    }
    if (!Objects.equals(this.enableRegionCanary, createDatabaseRequest.enableRegionCanary)) {
      return false;
    }
    if (!Objects.equals(this.scaleType, createDatabaseRequest.scaleType)) {
      return false;
    }
    if (!Objects.equals(this.storageType, createDatabaseRequest.storageType)) {
      return false;
    }
    if (!Objects.equals(this.recipes, createDatabaseRequest.recipes)) {
      return false;
    }
    if (!Objects.equals(this.enableGrafana, createDatabaseRequest.enableGrafana)) {
      return false;
    }
    if (!Objects.equals(this.rootVolumeSize, createDatabaseRequest.rootVolumeSize)) {
      return false;
    }
    if (!Objects.equals(this.volumeEncryptions, createDatabaseRequest.volumeEncryptions)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, databaseName, autoScalingParameters, subnetId, customUserTags, disableMultiAz, attachedStorageForWorkers, disableKerberos, numEdgeNodes, image, disableJwtAuth, enableRegionCanary, scaleType, storageType, recipes, enableGrafana, rootVolumeSize, volumeEncryptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDatabaseRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    autoScalingParameters: ").append(toIndentedString(autoScalingParameters)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    customUserTags: ").append(toIndentedString(customUserTags)).append("\n");
    sb.append("    disableMultiAz: ").append(toIndentedString(disableMultiAz)).append("\n");
    sb.append("    attachedStorageForWorkers: ").append(toIndentedString(attachedStorageForWorkers)).append("\n");
    sb.append("    disableKerberos: ").append(toIndentedString(disableKerberos)).append("\n");
    sb.append("    numEdgeNodes: ").append(toIndentedString(numEdgeNodes)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    disableJwtAuth: ").append(toIndentedString(disableJwtAuth)).append("\n");
    sb.append("    enableRegionCanary: ").append(toIndentedString(enableRegionCanary)).append("\n");
    sb.append("    scaleType: ").append(toIndentedString(scaleType)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
    sb.append("    recipes: ").append(toIndentedString(recipes)).append("\n");
    sb.append("    enableGrafana: ").append(toIndentedString(enableGrafana)).append("\n");
    sb.append("    rootVolumeSize: ").append(toIndentedString(rootVolumeSize)).append("\n");
    sb.append("    volumeEncryptions: ").append(toIndentedString(volumeEncryptions)).append("\n");
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

