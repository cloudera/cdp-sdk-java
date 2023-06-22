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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.dw.model.ActorResponse;
import com.cloudera.cdp.dw.model.AwsOptionsResponse;
import com.cloudera.cdp.dw.model.AzureOptionsResponse;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * A Cloudera Data Warehouse cluster.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-06-21T23:16:15.495-07:00")
public class ClusterSummaryResponse extends CdpResponse {

  /**
   * The CRN of the cluster.
   **/
  private String crn = null;

  /**
   * The ID of the cluster.
   **/
  private String id = null;

  /**
   * The CRN of the environment where the cluster is located.
   **/
  private String environmentCrn = null;

  /**
   * Name of the cluster (same as the name of the environment).
   **/
  private String name = null;

  /**
   * Status of the cluster. Possible values are: Creating, Created, Accepted, Starting, Running, Stopping, Stopped, Updating, PreUpdate, Upgrading, PreUpgrade, Restarting, Deleting, Waiting, Failed, Error.
   **/
  private String status = null;

  /**
   * The creator of the cluster.
   **/
  private ActorResponse creator = null;

  /**
   * Creation date of cluster.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * The cloud platform of the environment that was used to create this cluster.
   **/
  private String cloudPlatform = null;

  /**
   * Enable Storage Roles checkbox was checked when creating/activating this cluster.
   **/
  private Boolean enableStorageRoles = null;

  /**
   * Denotes whether the spot instances have been enabled for the cluster. This value is only available for AWS and Azure clusters.
   **/
  private Boolean enableSpotInstances = null;

  /**
   * Compute instance types that the environment is restricted to use. This affects the creation of the virtual warehouses where this restriction will apply.
   **/
  private List<String> computeInstanceTypes = new ArrayList<String>();

  /**
   * Additional (fallback) instance types listed in their priority order. They are used instead of the primary compute instance type in case it is unavailable. Since additional instance types are not supported for Azure, this is always empty for it.
   **/
  private List<String> additionalInstanceTypes = new ArrayList<String>();

  /**
   * Response object of AWS related cluster options.
   **/
  private AwsOptionsResponse awsOptions = null;

  /**
   * Response object of Azure related cluster options.
   **/
  private AzureOptionsResponse azureOptions = null;

  /**
   * Getter for crn.
   * The CRN of the cluster.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the cluster.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for id.
   * The ID of the cluster.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * The ID of the cluster.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for environmentCrn.
   * The CRN of the environment where the cluster is located.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of the environment where the cluster is located.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for name.
   * Name of the cluster (same as the name of the environment).
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name of the cluster (same as the name of the environment).
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for status.
   * Status of the cluster. Possible values are: Creating, Created, Accepted, Starting, Running, Stopping, Stopped, Updating, PreUpdate, Upgrading, PreUpgrade, Restarting, Deleting, Waiting, Failed, Error.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of the cluster. Possible values are: Creating, Created, Accepted, Starting, Running, Stopping, Stopped, Updating, PreUpdate, Upgrading, PreUpgrade, Restarting, Deleting, Waiting, Failed, Error.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for creator.
   * The creator of the cluster.
   **/
  @JsonProperty("creator")
  public ActorResponse getCreator() {
    return creator;
  }

  /**
   * Setter for creator.
   * The creator of the cluster.
   **/
  public void setCreator(ActorResponse creator) {
    this.creator = creator;
  }

  /**
   * Getter for creationDate.
   * Creation date of cluster.
   **/
  @JsonProperty("creationDate")
  public ZonedDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * Setter for creationDate.
   * Creation date of cluster.
   **/
  public void setCreationDate(ZonedDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Getter for cloudPlatform.
   * The cloud platform of the environment that was used to create this cluster.
   **/
  @JsonProperty("cloudPlatform")
  public String getCloudPlatform() {
    return cloudPlatform;
  }

  /**
   * Setter for cloudPlatform.
   * The cloud platform of the environment that was used to create this cluster.
   **/
  public void setCloudPlatform(String cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
  }

  /**
   * Getter for enableStorageRoles.
   * Enable Storage Roles checkbox was checked when creating/activating this cluster.
   **/
  @JsonProperty("enableStorageRoles")
  public Boolean getEnableStorageRoles() {
    return enableStorageRoles;
  }

  /**
   * Setter for enableStorageRoles.
   * Enable Storage Roles checkbox was checked when creating/activating this cluster.
   **/
  public void setEnableStorageRoles(Boolean enableStorageRoles) {
    this.enableStorageRoles = enableStorageRoles;
  }

  /**
   * Getter for enableSpotInstances.
   * Denotes whether the spot instances have been enabled for the cluster. This value is only available for AWS and Azure clusters.
   **/
  @JsonProperty("enableSpotInstances")
  public Boolean getEnableSpotInstances() {
    return enableSpotInstances;
  }

  /**
   * Setter for enableSpotInstances.
   * Denotes whether the spot instances have been enabled for the cluster. This value is only available for AWS and Azure clusters.
   **/
  public void setEnableSpotInstances(Boolean enableSpotInstances) {
    this.enableSpotInstances = enableSpotInstances;
  }

  /**
   * Getter for computeInstanceTypes.
   * Compute instance types that the environment is restricted to use. This affects the creation of the virtual warehouses where this restriction will apply.
   **/
  @JsonProperty("computeInstanceTypes")
  public List<String> getComputeInstanceTypes() {
    return computeInstanceTypes;
  }

  /**
   * Setter for computeInstanceTypes.
   * Compute instance types that the environment is restricted to use. This affects the creation of the virtual warehouses where this restriction will apply.
   **/
  public void setComputeInstanceTypes(List<String> computeInstanceTypes) {
    this.computeInstanceTypes = computeInstanceTypes;
  }

  /**
   * Getter for additionalInstanceTypes.
   * Additional (fallback) instance types listed in their priority order. They are used instead of the primary compute instance type in case it is unavailable. Since additional instance types are not supported for Azure, this is always empty for it.
   **/
  @JsonProperty("additionalInstanceTypes")
  public List<String> getAdditionalInstanceTypes() {
    return additionalInstanceTypes;
  }

  /**
   * Setter for additionalInstanceTypes.
   * Additional (fallback) instance types listed in their priority order. They are used instead of the primary compute instance type in case it is unavailable. Since additional instance types are not supported for Azure, this is always empty for it.
   **/
  public void setAdditionalInstanceTypes(List<String> additionalInstanceTypes) {
    this.additionalInstanceTypes = additionalInstanceTypes;
  }

  /**
   * Getter for awsOptions.
   * Response object of AWS related cluster options.
   **/
  @JsonProperty("awsOptions")
  public AwsOptionsResponse getAwsOptions() {
    return awsOptions;
  }

  /**
   * Setter for awsOptions.
   * Response object of AWS related cluster options.
   **/
  public void setAwsOptions(AwsOptionsResponse awsOptions) {
    this.awsOptions = awsOptions;
  }

  /**
   * Getter for azureOptions.
   * Response object of Azure related cluster options.
   **/
  @JsonProperty("azureOptions")
  public AzureOptionsResponse getAzureOptions() {
    return azureOptions;
  }

  /**
   * Setter for azureOptions.
   * Response object of Azure related cluster options.
   **/
  public void setAzureOptions(AzureOptionsResponse azureOptions) {
    this.azureOptions = azureOptions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterSummaryResponse clusterSummaryResponse = (ClusterSummaryResponse) o;
    if (!Objects.equals(this.crn, clusterSummaryResponse.crn)) {
      return false;
    }
    if (!Objects.equals(this.id, clusterSummaryResponse.id)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, clusterSummaryResponse.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.name, clusterSummaryResponse.name)) {
      return false;
    }
    if (!Objects.equals(this.status, clusterSummaryResponse.status)) {
      return false;
    }
    if (!Objects.equals(this.creator, clusterSummaryResponse.creator)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, clusterSummaryResponse.creationDate)) {
      return false;
    }
    if (!Objects.equals(this.cloudPlatform, clusterSummaryResponse.cloudPlatform)) {
      return false;
    }
    if (!Objects.equals(this.enableStorageRoles, clusterSummaryResponse.enableStorageRoles)) {
      return false;
    }
    if (!Objects.equals(this.enableSpotInstances, clusterSummaryResponse.enableSpotInstances)) {
      return false;
    }
    if (!Objects.equals(this.computeInstanceTypes, clusterSummaryResponse.computeInstanceTypes)) {
      return false;
    }
    if (!Objects.equals(this.additionalInstanceTypes, clusterSummaryResponse.additionalInstanceTypes)) {
      return false;
    }
    if (!Objects.equals(this.awsOptions, clusterSummaryResponse.awsOptions)) {
      return false;
    }
    if (!Objects.equals(this.azureOptions, clusterSummaryResponse.azureOptions)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, id, environmentCrn, name, status, creator, creationDate, cloudPlatform, enableStorageRoles, enableSpotInstances, computeInstanceTypes, additionalInstanceTypes, awsOptions, azureOptions, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterSummaryResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    cloudPlatform: ").append(toIndentedString(cloudPlatform)).append("\n");
    sb.append("    enableStorageRoles: ").append(toIndentedString(enableStorageRoles)).append("\n");
    sb.append("    enableSpotInstances: ").append(toIndentedString(enableSpotInstances)).append("\n");
    sb.append("    computeInstanceTypes: ").append(toIndentedString(computeInstanceTypes)).append("\n");
    sb.append("    additionalInstanceTypes: ").append(toIndentedString(additionalInstanceTypes)).append("\n");
    sb.append("    awsOptions: ").append(toIndentedString(awsOptions)).append("\n");
    sb.append("    azureOptions: ").append(toIndentedString(azureOptions)).append("\n");
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

