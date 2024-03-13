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
import com.cloudera.cdp.datalake.model.AWSConfiguration;
import com.cloudera.cdp.datalake.model.AzureConfiguration;
import com.cloudera.cdp.datalake.model.ClouderaManagerDetails;
import com.cloudera.cdp.datalake.model.Endpoints;
import com.cloudera.cdp.datalake.model.GCPConfiguration;
import com.cloudera.cdp.datalake.model.InstanceGroup;
import com.cloudera.cdp.datalake.model.ProductVersion;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * Details about a datalake
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-03-13T13:08:46.862-07:00")
public class DatalakeDetails  {

  /**
   * The CRN of the datalake.
   **/
  private String crn = null;

  /**
   * The name of the datalake.
   **/
  private String datalakeName = null;

  /**
   * The status of the datalake.
   **/
  private String status = null;

  /**
   * The shape of the datalake (either LIGHT_DUTY or MEDIUM_DUTY_HA).
   **/
  private String shape = null;

  /**
   * The CRN of the environment.
   **/
  private String environmentCrn = null;

  /**
   * The CRN of credentials.
   **/
  private String credentialCrn = null;

  /**
   * The cloud platform.
   **/
  private String cloudPlatform = null;

  /**
   * The instance details.
   **/
  private List<InstanceGroup> instanceGroups = new ArrayList<InstanceGroup>();

  /**
   * The date when the datalake was created.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * The Cloudera Manager details.
   **/
  private ClouderaManagerDetails clouderaManager = null;

  /**
   * The product versions.
   **/
  private List<ProductVersion> productVersions = new ArrayList<ProductVersion>();

  /**
   * The region of the datalake.
   **/
  private String region = null;

  /**
   * The reason for the status of the datalake.
   **/
  private String statusReason = null;

  /**
   * The AWS configuration.
   **/
  private AWSConfiguration awsConfiguration = null;

  /**
   * The Azure configuration.
   **/
  private AzureConfiguration azureConfiguration = null;

  /**
   * The GCP configuration.
   **/
  private GCPConfiguration gcpConfiguration = null;

  /**
   * The exposed service api endpoints.
   **/
  private Endpoints endpoints = null;

  /**
   * The base location for the cloud storage used for the datalake.
   **/
  private String cloudStorageBaseLocation = null;

  /**
   * Whether Ranger RAZ is enabled for the datalake.
   **/
  private Boolean enableRangerRaz = null;

  /**
   * Getter for crn.
   * The CRN of the datalake.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the datalake.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for datalakeName.
   * The name of the datalake.
   **/
  @JsonProperty("datalakeName")
  public String getDatalakeName() {
    return datalakeName;
  }

  /**
   * Setter for datalakeName.
   * The name of the datalake.
   **/
  public void setDatalakeName(String datalakeName) {
    this.datalakeName = datalakeName;
  }

  /**
   * Getter for status.
   * The status of the datalake.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The status of the datalake.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for shape.
   * The shape of the datalake (either LIGHT_DUTY or MEDIUM_DUTY_HA).
   **/
  @JsonProperty("shape")
  public String getShape() {
    return shape;
  }

  /**
   * Setter for shape.
   * The shape of the datalake (either LIGHT_DUTY or MEDIUM_DUTY_HA).
   **/
  public void setShape(String shape) {
    this.shape = shape;
  }

  /**
   * Getter for environmentCrn.
   * The CRN of the environment.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of the environment.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for credentialCrn.
   * The CRN of credentials.
   **/
  @JsonProperty("credentialCrn")
  public String getCredentialCrn() {
    return credentialCrn;
  }

  /**
   * Setter for credentialCrn.
   * The CRN of credentials.
   **/
  public void setCredentialCrn(String credentialCrn) {
    this.credentialCrn = credentialCrn;
  }

  /**
   * Getter for cloudPlatform.
   * The cloud platform.
   **/
  @JsonProperty("cloudPlatform")
  public String getCloudPlatform() {
    return cloudPlatform;
  }

  /**
   * Setter for cloudPlatform.
   * The cloud platform.
   **/
  public void setCloudPlatform(String cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
  }

  /**
   * Getter for instanceGroups.
   * The instance details.
   **/
  @JsonProperty("instanceGroups")
  public List<InstanceGroup> getInstanceGroups() {
    return instanceGroups;
  }

  /**
   * Setter for instanceGroups.
   * The instance details.
   **/
  public void setInstanceGroups(List<InstanceGroup> instanceGroups) {
    this.instanceGroups = instanceGroups;
  }

  /**
   * Getter for creationDate.
   * The date when the datalake was created.
   **/
  @JsonProperty("creationDate")
  public ZonedDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * Setter for creationDate.
   * The date when the datalake was created.
   **/
  public void setCreationDate(ZonedDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Getter for clouderaManager.
   * The Cloudera Manager details.
   **/
  @JsonProperty("clouderaManager")
  public ClouderaManagerDetails getClouderaManager() {
    return clouderaManager;
  }

  /**
   * Setter for clouderaManager.
   * The Cloudera Manager details.
   **/
  public void setClouderaManager(ClouderaManagerDetails clouderaManager) {
    this.clouderaManager = clouderaManager;
  }

  /**
   * Getter for productVersions.
   * The product versions.
   **/
  @JsonProperty("productVersions")
  public List<ProductVersion> getProductVersions() {
    return productVersions;
  }

  /**
   * Setter for productVersions.
   * The product versions.
   **/
  public void setProductVersions(List<ProductVersion> productVersions) {
    this.productVersions = productVersions;
  }

  /**
   * Getter for region.
   * The region of the datalake.
   **/
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  /**
   * Setter for region.
   * The region of the datalake.
   **/
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Getter for statusReason.
   * The reason for the status of the datalake.
   **/
  @JsonProperty("statusReason")
  public String getStatusReason() {
    return statusReason;
  }

  /**
   * Setter for statusReason.
   * The reason for the status of the datalake.
   **/
  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }

  /**
   * Getter for awsConfiguration.
   * The AWS configuration.
   **/
  @JsonProperty("awsConfiguration")
  public AWSConfiguration getAwsConfiguration() {
    return awsConfiguration;
  }

  /**
   * Setter for awsConfiguration.
   * The AWS configuration.
   **/
  public void setAwsConfiguration(AWSConfiguration awsConfiguration) {
    this.awsConfiguration = awsConfiguration;
  }

  /**
   * Getter for azureConfiguration.
   * The Azure configuration.
   **/
  @JsonProperty("azureConfiguration")
  public AzureConfiguration getAzureConfiguration() {
    return azureConfiguration;
  }

  /**
   * Setter for azureConfiguration.
   * The Azure configuration.
   **/
  public void setAzureConfiguration(AzureConfiguration azureConfiguration) {
    this.azureConfiguration = azureConfiguration;
  }

  /**
   * Getter for gcpConfiguration.
   * The GCP configuration.
   **/
  @JsonProperty("gcpConfiguration")
  public GCPConfiguration getGcpConfiguration() {
    return gcpConfiguration;
  }

  /**
   * Setter for gcpConfiguration.
   * The GCP configuration.
   **/
  public void setGcpConfiguration(GCPConfiguration gcpConfiguration) {
    this.gcpConfiguration = gcpConfiguration;
  }

  /**
   * Getter for endpoints.
   * The exposed service api endpoints.
   **/
  @JsonProperty("endpoints")
  public Endpoints getEndpoints() {
    return endpoints;
  }

  /**
   * Setter for endpoints.
   * The exposed service api endpoints.
   **/
  public void setEndpoints(Endpoints endpoints) {
    this.endpoints = endpoints;
  }

  /**
   * Getter for cloudStorageBaseLocation.
   * The base location for the cloud storage used for the datalake.
   **/
  @JsonProperty("cloudStorageBaseLocation")
  public String getCloudStorageBaseLocation() {
    return cloudStorageBaseLocation;
  }

  /**
   * Setter for cloudStorageBaseLocation.
   * The base location for the cloud storage used for the datalake.
   **/
  public void setCloudStorageBaseLocation(String cloudStorageBaseLocation) {
    this.cloudStorageBaseLocation = cloudStorageBaseLocation;
  }

  /**
   * Getter for enableRangerRaz.
   * Whether Ranger RAZ is enabled for the datalake.
   **/
  @JsonProperty("enableRangerRaz")
  public Boolean getEnableRangerRaz() {
    return enableRangerRaz;
  }

  /**
   * Setter for enableRangerRaz.
   * Whether Ranger RAZ is enabled for the datalake.
   **/
  public void setEnableRangerRaz(Boolean enableRangerRaz) {
    this.enableRangerRaz = enableRangerRaz;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatalakeDetails datalakeDetails = (DatalakeDetails) o;
    if (!Objects.equals(this.crn, datalakeDetails.crn)) {
      return false;
    }
    if (!Objects.equals(this.datalakeName, datalakeDetails.datalakeName)) {
      return false;
    }
    if (!Objects.equals(this.status, datalakeDetails.status)) {
      return false;
    }
    if (!Objects.equals(this.shape, datalakeDetails.shape)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, datalakeDetails.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.credentialCrn, datalakeDetails.credentialCrn)) {
      return false;
    }
    if (!Objects.equals(this.cloudPlatform, datalakeDetails.cloudPlatform)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroups, datalakeDetails.instanceGroups)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, datalakeDetails.creationDate)) {
      return false;
    }
    if (!Objects.equals(this.clouderaManager, datalakeDetails.clouderaManager)) {
      return false;
    }
    if (!Objects.equals(this.productVersions, datalakeDetails.productVersions)) {
      return false;
    }
    if (!Objects.equals(this.region, datalakeDetails.region)) {
      return false;
    }
    if (!Objects.equals(this.statusReason, datalakeDetails.statusReason)) {
      return false;
    }
    if (!Objects.equals(this.awsConfiguration, datalakeDetails.awsConfiguration)) {
      return false;
    }
    if (!Objects.equals(this.azureConfiguration, datalakeDetails.azureConfiguration)) {
      return false;
    }
    if (!Objects.equals(this.gcpConfiguration, datalakeDetails.gcpConfiguration)) {
      return false;
    }
    if (!Objects.equals(this.endpoints, datalakeDetails.endpoints)) {
      return false;
    }
    if (!Objects.equals(this.cloudStorageBaseLocation, datalakeDetails.cloudStorageBaseLocation)) {
      return false;
    }
    if (!Objects.equals(this.enableRangerRaz, datalakeDetails.enableRangerRaz)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, datalakeName, status, shape, environmentCrn, credentialCrn, cloudPlatform, instanceGroups, creationDate, clouderaManager, productVersions, region, statusReason, awsConfiguration, azureConfiguration, gcpConfiguration, endpoints, cloudStorageBaseLocation, enableRangerRaz);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatalakeDetails {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    datalakeName: ").append(toIndentedString(datalakeName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    credentialCrn: ").append(toIndentedString(credentialCrn)).append("\n");
    sb.append("    cloudPlatform: ").append(toIndentedString(cloudPlatform)).append("\n");
    sb.append("    instanceGroups: ").append(toIndentedString(instanceGroups)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    clouderaManager: ").append(toIndentedString(clouderaManager)).append("\n");
    sb.append("    productVersions: ").append(toIndentedString(productVersions)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    awsConfiguration: ").append(toIndentedString(awsConfiguration)).append("\n");
    sb.append("    azureConfiguration: ").append(toIndentedString(azureConfiguration)).append("\n");
    sb.append("    gcpConfiguration: ").append(toIndentedString(gcpConfiguration)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    cloudStorageBaseLocation: ").append(toIndentedString(cloudStorageBaseLocation)).append("\n");
    sb.append("    enableRangerRaz: ").append(toIndentedString(enableRangerRaz)).append("\n");
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

