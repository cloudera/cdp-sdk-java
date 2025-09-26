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

/**
 * Request object for AWS cloud storage validation.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-26T09:46:34.917-07:00")
public class ValidateAwsCloudStorageRequest  {

  /**
   * Datalake cluster name.
   **/
  private String clusterName = null;

  /**
   * Data access role.
   **/
  private String dataAccessRole = null;

  /**
   * Ranger audit role.
   **/
  private String rangerAuditRole = null;

  /**
   * Credential CRN.
   **/
  private String credentialCrn = null;

  /**
   * Name of the blueprint.
   **/
  private String blueprintName = null;

  /**
   * AWS S3 storage bucket base location.
   **/
  private String storageLocation = null;

  /**
   * AWS instance profile.
   **/
  private String instanceProfile = null;

  /**
   * Ranger RAZ role.
   **/
  private String rangerCloudAccessAuthorizerRole = null;

  /**
   * Getter for clusterName.
   * Datalake cluster name.
   **/
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }

  /**
   * Setter for clusterName.
   * Datalake cluster name.
   **/
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  /**
   * Getter for dataAccessRole.
   * Data access role.
   **/
  @JsonProperty("dataAccessRole")
  public String getDataAccessRole() {
    return dataAccessRole;
  }

  /**
   * Setter for dataAccessRole.
   * Data access role.
   **/
  public void setDataAccessRole(String dataAccessRole) {
    this.dataAccessRole = dataAccessRole;
  }

  /**
   * Getter for rangerAuditRole.
   * Ranger audit role.
   **/
  @JsonProperty("rangerAuditRole")
  public String getRangerAuditRole() {
    return rangerAuditRole;
  }

  /**
   * Setter for rangerAuditRole.
   * Ranger audit role.
   **/
  public void setRangerAuditRole(String rangerAuditRole) {
    this.rangerAuditRole = rangerAuditRole;
  }

  /**
   * Getter for credentialCrn.
   * Credential CRN.
   **/
  @JsonProperty("credentialCrn")
  public String getCredentialCrn() {
    return credentialCrn;
  }

  /**
   * Setter for credentialCrn.
   * Credential CRN.
   **/
  public void setCredentialCrn(String credentialCrn) {
    this.credentialCrn = credentialCrn;
  }

  /**
   * Getter for blueprintName.
   * Name of the blueprint.
   **/
  @JsonProperty("blueprintName")
  public String getBlueprintName() {
    return blueprintName;
  }

  /**
   * Setter for blueprintName.
   * Name of the blueprint.
   **/
  public void setBlueprintName(String blueprintName) {
    this.blueprintName = blueprintName;
  }

  /**
   * Getter for storageLocation.
   * AWS S3 storage bucket base location.
   **/
  @JsonProperty("storageLocation")
  public String getStorageLocation() {
    return storageLocation;
  }

  /**
   * Setter for storageLocation.
   * AWS S3 storage bucket base location.
   **/
  public void setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
  }

  /**
   * Getter for instanceProfile.
   * AWS instance profile.
   **/
  @JsonProperty("instanceProfile")
  public String getInstanceProfile() {
    return instanceProfile;
  }

  /**
   * Setter for instanceProfile.
   * AWS instance profile.
   **/
  public void setInstanceProfile(String instanceProfile) {
    this.instanceProfile = instanceProfile;
  }

  /**
   * Getter for rangerCloudAccessAuthorizerRole.
   * Ranger RAZ role.
   **/
  @JsonProperty("rangerCloudAccessAuthorizerRole")
  public String getRangerCloudAccessAuthorizerRole() {
    return rangerCloudAccessAuthorizerRole;
  }

  /**
   * Setter for rangerCloudAccessAuthorizerRole.
   * Ranger RAZ role.
   **/
  public void setRangerCloudAccessAuthorizerRole(String rangerCloudAccessAuthorizerRole) {
    this.rangerCloudAccessAuthorizerRole = rangerCloudAccessAuthorizerRole;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateAwsCloudStorageRequest validateAwsCloudStorageRequest = (ValidateAwsCloudStorageRequest) o;
    if (!Objects.equals(this.clusterName, validateAwsCloudStorageRequest.clusterName)) {
      return false;
    }
    if (!Objects.equals(this.dataAccessRole, validateAwsCloudStorageRequest.dataAccessRole)) {
      return false;
    }
    if (!Objects.equals(this.rangerAuditRole, validateAwsCloudStorageRequest.rangerAuditRole)) {
      return false;
    }
    if (!Objects.equals(this.credentialCrn, validateAwsCloudStorageRequest.credentialCrn)) {
      return false;
    }
    if (!Objects.equals(this.blueprintName, validateAwsCloudStorageRequest.blueprintName)) {
      return false;
    }
    if (!Objects.equals(this.storageLocation, validateAwsCloudStorageRequest.storageLocation)) {
      return false;
    }
    if (!Objects.equals(this.instanceProfile, validateAwsCloudStorageRequest.instanceProfile)) {
      return false;
    }
    if (!Objects.equals(this.rangerCloudAccessAuthorizerRole, validateAwsCloudStorageRequest.rangerCloudAccessAuthorizerRole)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterName, dataAccessRole, rangerAuditRole, credentialCrn, blueprintName, storageLocation, instanceProfile, rangerCloudAccessAuthorizerRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateAwsCloudStorageRequest {\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    dataAccessRole: ").append(toIndentedString(dataAccessRole)).append("\n");
    sb.append("    rangerAuditRole: ").append(toIndentedString(rangerAuditRole)).append("\n");
    sb.append("    credentialCrn: ").append(toIndentedString(credentialCrn)).append("\n");
    sb.append("    blueprintName: ").append(toIndentedString(blueprintName)).append("\n");
    sb.append("    storageLocation: ").append(toIndentedString(storageLocation)).append("\n");
    sb.append("    instanceProfile: ").append(toIndentedString(instanceProfile)).append("\n");
    sb.append("    rangerCloudAccessAuthorizerRole: ").append(toIndentedString(rangerCloudAccessAuthorizerRole)).append("\n");
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

