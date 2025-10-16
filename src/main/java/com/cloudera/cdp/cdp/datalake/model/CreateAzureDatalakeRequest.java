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

package com.cloudera.cdp.datalake.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datalake.model.AzureConfigurationRequest;
import com.cloudera.cdp.datalake.model.DatalakeResourceTagRequest;
import com.cloudera.cdp.datalake.model.ImageRequest;
import com.cloudera.cdp.datalake.model.InstanceGroupRecipeRequest;
import com.cloudera.cdp.datalake.model.SdxInstanceGroupRequest;
import java.util.*;

/**
 * Request object for create Azure datalake request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-15T17:00:46.127-07:00")
public class CreateAzureDatalakeRequest  {

  /**
   * The datalake name. This name must be unique, must have between 5 and 40 characters, and must contain only lowercase letters, numbers and hyphens. Names are case-sensitive.
   **/
  private String datalakeName = null;

  /**
   * The environment name or CRN.
   **/
  private String environmentName = null;

  /**
   * Azure configuration.
   **/
  private AzureConfigurationRequest cloudProviderConfiguration = null;

  /**
   * The scale of the datalake. Allowed values are \"LIGHT_DUTY\" or \"MEDIUM_DUTY_HA\". Defaults to \"LIGHT_DUTY\" if not set.
   **/
  private String scale = null;

  /**
   * Tags to be added to Data Lake related resources.
   **/
  private List<DatalakeResourceTagRequest> tags = new ArrayList<DatalakeResourceTagRequest>();

  /**
   * Cloudera Runtime version.
   **/
  private String runtime = null;

  /**
   * The image to use for the datalake. This must not be set if the runtime parameter is provided.
   **/
  private ImageRequest image = null;

  /**
   * The SKU for the datalake load balancer. Allowed values are \"BASIC\", \"STANDARD\", or \"NONE\".
   **/
  private String loadBalancerSku = null;

  /**
   * Whether to enable Ranger RAZ for the datalake. Defaults to not being enabled.
   **/
  private Boolean enableRangerRaz = null;

  /**
   * The type of the azure database. FLEXIBLE_SERVER is the next generation managed PostgreSQL service in Azure that provides maximum flexibility over your database, built-in cost-optimizations. SINGLE_SERVER is a fully managed database service with minimal requirements for customizations of the database.
   **/
  private String databaseType = null;

  /**
   * This argument allows you to specify the subnet ID for the subnet within which you want to configure your Azure Flexible Server.
   **/
  private String flexibleServerDelegatedSubnetId = null;

  /**
   * Additional recipes that will be attached on the datalake instances (by instance groups, most common ones are like 'master' or 'idbroker').
   **/
  private List<InstanceGroupRecipeRequest> recipes = new ArrayList<InstanceGroupRecipeRequest>();

  /**
   * Configure custom properties on an instance group level.
   **/
  private List<SdxInstanceGroupRequest> customInstanceGroups = new ArrayList<SdxInstanceGroupRequest>();

  /**
   * Configure the major version of Java on the cluster.
   **/
  private Integer javaVersion = null;

  /**
   * Creates CDP datalake distributed across multiple availability zones in an Azure region.
   **/
  private Boolean multiAz = false;

  /**
   * Getter for datalakeName.
   * The datalake name. This name must be unique, must have between 5 and 40 characters, and must contain only lowercase letters, numbers and hyphens. Names are case-sensitive.
   **/
  @JsonProperty("datalakeName")
  public String getDatalakeName() {
    return datalakeName;
  }

  /**
   * Setter for datalakeName.
   * The datalake name. This name must be unique, must have between 5 and 40 characters, and must contain only lowercase letters, numbers and hyphens. Names are case-sensitive.
   **/
  public void setDatalakeName(String datalakeName) {
    this.datalakeName = datalakeName;
  }

  /**
   * Getter for environmentName.
   * The environment name or CRN.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The environment name or CRN.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for cloudProviderConfiguration.
   * Azure configuration.
   **/
  @JsonProperty("cloudProviderConfiguration")
  public AzureConfigurationRequest getCloudProviderConfiguration() {
    return cloudProviderConfiguration;
  }

  /**
   * Setter for cloudProviderConfiguration.
   * Azure configuration.
   **/
  public void setCloudProviderConfiguration(AzureConfigurationRequest cloudProviderConfiguration) {
    this.cloudProviderConfiguration = cloudProviderConfiguration;
  }

  /**
   * Getter for scale.
   * The scale of the datalake. Allowed values are \&quot;LIGHT_DUTY\&quot; or \&quot;MEDIUM_DUTY_HA\&quot;. Defaults to \&quot;LIGHT_DUTY\&quot; if not set.
   **/
  @JsonProperty("scale")
  public String getScale() {
    return scale;
  }

  /**
   * Setter for scale.
   * The scale of the datalake. Allowed values are \&quot;LIGHT_DUTY\&quot; or \&quot;MEDIUM_DUTY_HA\&quot;. Defaults to \&quot;LIGHT_DUTY\&quot; if not set.
   **/
  public void setScale(String scale) {
    this.scale = scale;
  }

  /**
   * Getter for tags.
   * Tags to be added to Data Lake related resources.
   **/
  @JsonProperty("tags")
  public List<DatalakeResourceTagRequest> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Tags to be added to Data Lake related resources.
   **/
  public void setTags(List<DatalakeResourceTagRequest> tags) {
    this.tags = tags;
  }

  /**
   * Getter for runtime.
   * Cloudera Runtime version.
   **/
  @JsonProperty("runtime")
  public String getRuntime() {
    return runtime;
  }

  /**
   * Setter for runtime.
   * Cloudera Runtime version.
   **/
  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }

  /**
   * Getter for image.
   * The image to use for the datalake. This must not be set if the runtime parameter is provided.
   **/
  @JsonProperty("image")
  public ImageRequest getImage() {
    return image;
  }

  /**
   * Setter for image.
   * The image to use for the datalake. This must not be set if the runtime parameter is provided.
   **/
  public void setImage(ImageRequest image) {
    this.image = image;
  }

  /**
   * Getter for loadBalancerSku.
   * The SKU for the datalake load balancer. Allowed values are \&quot;BASIC\&quot;, \&quot;STANDARD\&quot;, or \&quot;NONE\&quot;.
   **/
  @JsonProperty("loadBalancerSku")
  public String getLoadBalancerSku() {
    return loadBalancerSku;
  }

  /**
   * Setter for loadBalancerSku.
   * The SKU for the datalake load balancer. Allowed values are \&quot;BASIC\&quot;, \&quot;STANDARD\&quot;, or \&quot;NONE\&quot;.
   **/
  public void setLoadBalancerSku(String loadBalancerSku) {
    this.loadBalancerSku = loadBalancerSku;
  }

  /**
   * Getter for enableRangerRaz.
   * Whether to enable Ranger RAZ for the datalake. Defaults to not being enabled.
   **/
  @JsonProperty("enableRangerRaz")
  public Boolean getEnableRangerRaz() {
    return enableRangerRaz;
  }

  /**
   * Setter for enableRangerRaz.
   * Whether to enable Ranger RAZ for the datalake. Defaults to not being enabled.
   **/
  public void setEnableRangerRaz(Boolean enableRangerRaz) {
    this.enableRangerRaz = enableRangerRaz;
  }

  /**
   * Getter for databaseType.
   * The type of the azure database. FLEXIBLE_SERVER is the next generation managed PostgreSQL service in Azure that provides maximum flexibility over your database, built-in cost-optimizations. SINGLE_SERVER is a fully managed database service with minimal requirements for customizations of the database.
   **/
  @JsonProperty("databaseType")
  public String getDatabaseType() {
    return databaseType;
  }

  /**
   * Setter for databaseType.
   * The type of the azure database. FLEXIBLE_SERVER is the next generation managed PostgreSQL service in Azure that provides maximum flexibility over your database, built-in cost-optimizations. SINGLE_SERVER is a fully managed database service with minimal requirements for customizations of the database.
   **/
  public void setDatabaseType(String databaseType) {
    this.databaseType = databaseType;
  }

  /**
   * Getter for flexibleServerDelegatedSubnetId.
   * This argument allows you to specify the subnet ID for the subnet within which you want to configure your Azure Flexible Server.
   **/
  @JsonProperty("flexibleServerDelegatedSubnetId")
  public String getFlexibleServerDelegatedSubnetId() {
    return flexibleServerDelegatedSubnetId;
  }

  /**
   * Setter for flexibleServerDelegatedSubnetId.
   * This argument allows you to specify the subnet ID for the subnet within which you want to configure your Azure Flexible Server.
   **/
  public void setFlexibleServerDelegatedSubnetId(String flexibleServerDelegatedSubnetId) {
    this.flexibleServerDelegatedSubnetId = flexibleServerDelegatedSubnetId;
  }

  /**
   * Getter for recipes.
   * Additional recipes that will be attached on the datalake instances (by instance groups, most common ones are like &#39;master&#39; or &#39;idbroker&#39;).
   **/
  @JsonProperty("recipes")
  public List<InstanceGroupRecipeRequest> getRecipes() {
    return recipes;
  }

  /**
   * Setter for recipes.
   * Additional recipes that will be attached on the datalake instances (by instance groups, most common ones are like &#39;master&#39; or &#39;idbroker&#39;).
   **/
  public void setRecipes(List<InstanceGroupRecipeRequest> recipes) {
    this.recipes = recipes;
  }

  /**
   * Getter for customInstanceGroups.
   * Configure custom properties on an instance group level.
   **/
  @JsonProperty("customInstanceGroups")
  public List<SdxInstanceGroupRequest> getCustomInstanceGroups() {
    return customInstanceGroups;
  }

  /**
   * Setter for customInstanceGroups.
   * Configure custom properties on an instance group level.
   **/
  public void setCustomInstanceGroups(List<SdxInstanceGroupRequest> customInstanceGroups) {
    this.customInstanceGroups = customInstanceGroups;
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

  /**
   * Getter for multiAz.
   * Creates CDP datalake distributed across multiple availability zones in an Azure region.
   **/
  @JsonProperty("multiAz")
  public Boolean getMultiAz() {
    return multiAz;
  }

  /**
   * Setter for multiAz.
   * Creates CDP datalake distributed across multiple availability zones in an Azure region.
   **/
  public void setMultiAz(Boolean multiAz) {
    this.multiAz = multiAz;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAzureDatalakeRequest createAzureDatalakeRequest = (CreateAzureDatalakeRequest) o;
    if (!Objects.equals(this.datalakeName, createAzureDatalakeRequest.datalakeName)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, createAzureDatalakeRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.cloudProviderConfiguration, createAzureDatalakeRequest.cloudProviderConfiguration)) {
      return false;
    }
    if (!Objects.equals(this.scale, createAzureDatalakeRequest.scale)) {
      return false;
    }
    if (!Objects.equals(this.tags, createAzureDatalakeRequest.tags)) {
      return false;
    }
    if (!Objects.equals(this.runtime, createAzureDatalakeRequest.runtime)) {
      return false;
    }
    if (!Objects.equals(this.image, createAzureDatalakeRequest.image)) {
      return false;
    }
    if (!Objects.equals(this.loadBalancerSku, createAzureDatalakeRequest.loadBalancerSku)) {
      return false;
    }
    if (!Objects.equals(this.enableRangerRaz, createAzureDatalakeRequest.enableRangerRaz)) {
      return false;
    }
    if (!Objects.equals(this.databaseType, createAzureDatalakeRequest.databaseType)) {
      return false;
    }
    if (!Objects.equals(this.flexibleServerDelegatedSubnetId, createAzureDatalakeRequest.flexibleServerDelegatedSubnetId)) {
      return false;
    }
    if (!Objects.equals(this.recipes, createAzureDatalakeRequest.recipes)) {
      return false;
    }
    if (!Objects.equals(this.customInstanceGroups, createAzureDatalakeRequest.customInstanceGroups)) {
      return false;
    }
    if (!Objects.equals(this.javaVersion, createAzureDatalakeRequest.javaVersion)) {
      return false;
    }
    if (!Objects.equals(this.multiAz, createAzureDatalakeRequest.multiAz)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeName, environmentName, cloudProviderConfiguration, scale, tags, runtime, image, loadBalancerSku, enableRangerRaz, databaseType, flexibleServerDelegatedSubnetId, recipes, customInstanceGroups, javaVersion, multiAz);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAzureDatalakeRequest {\n");
    sb.append("    datalakeName: ").append(toIndentedString(datalakeName)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    cloudProviderConfiguration: ").append(toIndentedString(cloudProviderConfiguration)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    loadBalancerSku: ").append(toIndentedString(loadBalancerSku)).append("\n");
    sb.append("    enableRangerRaz: ").append(toIndentedString(enableRangerRaz)).append("\n");
    sb.append("    databaseType: ").append(toIndentedString(databaseType)).append("\n");
    sb.append("    flexibleServerDelegatedSubnetId: ").append(toIndentedString(flexibleServerDelegatedSubnetId)).append("\n");
    sb.append("    recipes: ").append(toIndentedString(recipes)).append("\n");
    sb.append("    customInstanceGroups: ").append(toIndentedString(customInstanceGroups)).append("\n");
    sb.append("    javaVersion: ").append(toIndentedString(javaVersion)).append("\n");
    sb.append("    multiAz: ").append(toIndentedString(multiAz)).append("\n");
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

