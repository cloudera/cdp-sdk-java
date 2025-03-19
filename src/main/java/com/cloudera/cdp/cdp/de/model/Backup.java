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

package com.cloudera.cdp.de.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Service backup object.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-19T13:03:30.222-07:00")
public class Backup  {

  /**
   * Backup ID.
   **/
  private Long id = null;

  /**
   * Service ID of a backed-up CDE service.
   **/
  private String serviceID = null;

  /**
   * Name of a backed-up CDE service.
   **/
  private String serviceName = null;

  /**
   * Version of a backed-up CDE service.
   **/
  private String serviceVersion = null;

  /**
   * Name of CDP environment with which a backed-up CDE service was associated.
   **/
  private String environmentName = null;

  /**
   * CRN of CDP environment with which a backed-up CDE service was associated.
   **/
  private String environmentCrn = null;

  /**
   * The workload name of the user who created this backup.
   **/
  private String creator = null;

  /**
   * CRN of of the user who created this backup.
   **/
  private String creatorCrn = null;

  /**
   * The cloud platform where a backed-up CDE service was enabled.
   **/
  private String cloudPlatform = null;

  /**
   * Backup status.
   **/
  private String status = null;

  /**
   * The time when the backup was created.
   **/
  private String created = null;

  /**
   * Backup description.
   **/
  private String description = null;

  /**
   * Error message, only set when there is an error.
   **/
  private String errorMessage = null;

  /**
   * The path to the base location where the backups are stored.
   **/
  private String archiveBasePath = null;

  /**
   * Archive location under the base path.
   **/
  private String archiveLocation = null;

  /**
   * Getter for id.
   * Backup ID.
   **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  /**
   * Setter for id.
   * Backup ID.
   **/
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Getter for serviceID.
   * Service ID of a backed-up CDE service.
   **/
  @JsonProperty("serviceID")
  public String getServiceID() {
    return serviceID;
  }

  /**
   * Setter for serviceID.
   * Service ID of a backed-up CDE service.
   **/
  public void setServiceID(String serviceID) {
    this.serviceID = serviceID;
  }

  /**
   * Getter for serviceName.
   * Name of a backed-up CDE service.
   **/
  @JsonProperty("serviceName")
  public String getServiceName() {
    return serviceName;
  }

  /**
   * Setter for serviceName.
   * Name of a backed-up CDE service.
   **/
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  /**
   * Getter for serviceVersion.
   * Version of a backed-up CDE service.
   **/
  @JsonProperty("serviceVersion")
  public String getServiceVersion() {
    return serviceVersion;
  }

  /**
   * Setter for serviceVersion.
   * Version of a backed-up CDE service.
   **/
  public void setServiceVersion(String serviceVersion) {
    this.serviceVersion = serviceVersion;
  }

  /**
   * Getter for environmentName.
   * Name of CDP environment with which a backed-up CDE service was associated.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * Name of CDP environment with which a backed-up CDE service was associated.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for environmentCrn.
   * CRN of CDP environment with which a backed-up CDE service was associated.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * CRN of CDP environment with which a backed-up CDE service was associated.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for creator.
   * The workload name of the user who created this backup.
   **/
  @JsonProperty("creator")
  public String getCreator() {
    return creator;
  }

  /**
   * Setter for creator.
   * The workload name of the user who created this backup.
   **/
  public void setCreator(String creator) {
    this.creator = creator;
  }

  /**
   * Getter for creatorCrn.
   * CRN of of the user who created this backup.
   **/
  @JsonProperty("creatorCrn")
  public String getCreatorCrn() {
    return creatorCrn;
  }

  /**
   * Setter for creatorCrn.
   * CRN of of the user who created this backup.
   **/
  public void setCreatorCrn(String creatorCrn) {
    this.creatorCrn = creatorCrn;
  }

  /**
   * Getter for cloudPlatform.
   * The cloud platform where a backed-up CDE service was enabled.
   **/
  @JsonProperty("cloudPlatform")
  public String getCloudPlatform() {
    return cloudPlatform;
  }

  /**
   * Setter for cloudPlatform.
   * The cloud platform where a backed-up CDE service was enabled.
   **/
  public void setCloudPlatform(String cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
  }

  /**
   * Getter for status.
   * Backup status.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Backup status.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for created.
   * The time when the backup was created.
   **/
  @JsonProperty("created")
  public String getCreated() {
    return created;
  }

  /**
   * Setter for created.
   * The time when the backup was created.
   **/
  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * Getter for description.
   * Backup description.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * Backup description.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for errorMessage.
   * Error message, only set when there is an error.
   **/
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * Setter for errorMessage.
   * Error message, only set when there is an error.
   **/
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * Getter for archiveBasePath.
   * The path to the base location where the backups are stored.
   **/
  @JsonProperty("archiveBasePath")
  public String getArchiveBasePath() {
    return archiveBasePath;
  }

  /**
   * Setter for archiveBasePath.
   * The path to the base location where the backups are stored.
   **/
  public void setArchiveBasePath(String archiveBasePath) {
    this.archiveBasePath = archiveBasePath;
  }

  /**
   * Getter for archiveLocation.
   * Archive location under the base path.
   **/
  @JsonProperty("archiveLocation")
  public String getArchiveLocation() {
    return archiveLocation;
  }

  /**
   * Setter for archiveLocation.
   * Archive location under the base path.
   **/
  public void setArchiveLocation(String archiveLocation) {
    this.archiveLocation = archiveLocation;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Backup backup = (Backup) o;
    if (!Objects.equals(this.id, backup.id)) {
      return false;
    }
    if (!Objects.equals(this.serviceID, backup.serviceID)) {
      return false;
    }
    if (!Objects.equals(this.serviceName, backup.serviceName)) {
      return false;
    }
    if (!Objects.equals(this.serviceVersion, backup.serviceVersion)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, backup.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, backup.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.creator, backup.creator)) {
      return false;
    }
    if (!Objects.equals(this.creatorCrn, backup.creatorCrn)) {
      return false;
    }
    if (!Objects.equals(this.cloudPlatform, backup.cloudPlatform)) {
      return false;
    }
    if (!Objects.equals(this.status, backup.status)) {
      return false;
    }
    if (!Objects.equals(this.created, backup.created)) {
      return false;
    }
    if (!Objects.equals(this.description, backup.description)) {
      return false;
    }
    if (!Objects.equals(this.errorMessage, backup.errorMessage)) {
      return false;
    }
    if (!Objects.equals(this.archiveBasePath, backup.archiveBasePath)) {
      return false;
    }
    if (!Objects.equals(this.archiveLocation, backup.archiveLocation)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, serviceID, serviceName, serviceVersion, environmentName, environmentCrn, creator, creatorCrn, cloudPlatform, status, created, description, errorMessage, archiveBasePath, archiveLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Backup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serviceID: ").append(toIndentedString(serviceID)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceVersion: ").append(toIndentedString(serviceVersion)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    creatorCrn: ").append(toIndentedString(creatorCrn)).append("\n");
    sb.append("    cloudPlatform: ").append(toIndentedString(cloudPlatform)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    archiveBasePath: ").append(toIndentedString(archiveBasePath)).append("\n");
    sb.append("    archiveLocation: ").append(toIndentedString(archiveLocation)).append("\n");
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

