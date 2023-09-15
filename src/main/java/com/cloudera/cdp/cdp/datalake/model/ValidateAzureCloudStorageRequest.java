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
 * Request object for Azure cloud storage validation.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-09-14T10:47:18.056-07:00")
public class ValidateAzureCloudStorageRequest  {

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
   * Azure storage base location.
   **/
  private String storageLocation = null;

  /**
   * Azure managed identity.
   **/
  private String managedIdentity = null;

  /**
   * Azure account key.
   **/
  private String accountKey = null;

  /**
   * Azure account name.
   **/
  private String accountName = null;

  /**
   * Azure secure flag.
   **/
  private Boolean secure = null;

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
   * Azure storage base location.
   **/
  @JsonProperty("storageLocation")
  public String getStorageLocation() {
    return storageLocation;
  }

  /**
   * Setter for storageLocation.
   * Azure storage base location.
   **/
  public void setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
  }

  /**
   * Getter for managedIdentity.
   * Azure managed identity.
   **/
  @JsonProperty("managedIdentity")
  public String getManagedIdentity() {
    return managedIdentity;
  }

  /**
   * Setter for managedIdentity.
   * Azure managed identity.
   **/
  public void setManagedIdentity(String managedIdentity) {
    this.managedIdentity = managedIdentity;
  }

  /**
   * Getter for accountKey.
   * Azure account key.
   **/
  @JsonProperty("accountKey")
  public String getAccountKey() {
    return accountKey;
  }

  /**
   * Setter for accountKey.
   * Azure account key.
   **/
  public void setAccountKey(String accountKey) {
    this.accountKey = accountKey;
  }

  /**
   * Getter for accountName.
   * Azure account name.
   **/
  @JsonProperty("accountName")
  public String getAccountName() {
    return accountName;
  }

  /**
   * Setter for accountName.
   * Azure account name.
   **/
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  /**
   * Getter for secure.
   * Azure secure flag.
   **/
  @JsonProperty("secure")
  public Boolean getSecure() {
    return secure;
  }

  /**
   * Setter for secure.
   * Azure secure flag.
   **/
  public void setSecure(Boolean secure) {
    this.secure = secure;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateAzureCloudStorageRequest validateAzureCloudStorageRequest = (ValidateAzureCloudStorageRequest) o;
    if (!Objects.equals(this.clusterName, validateAzureCloudStorageRequest.clusterName)) {
      return false;
    }
    if (!Objects.equals(this.dataAccessRole, validateAzureCloudStorageRequest.dataAccessRole)) {
      return false;
    }
    if (!Objects.equals(this.rangerAuditRole, validateAzureCloudStorageRequest.rangerAuditRole)) {
      return false;
    }
    if (!Objects.equals(this.credentialCrn, validateAzureCloudStorageRequest.credentialCrn)) {
      return false;
    }
    if (!Objects.equals(this.blueprintName, validateAzureCloudStorageRequest.blueprintName)) {
      return false;
    }
    if (!Objects.equals(this.storageLocation, validateAzureCloudStorageRequest.storageLocation)) {
      return false;
    }
    if (!Objects.equals(this.managedIdentity, validateAzureCloudStorageRequest.managedIdentity)) {
      return false;
    }
    if (!Objects.equals(this.accountKey, validateAzureCloudStorageRequest.accountKey)) {
      return false;
    }
    if (!Objects.equals(this.accountName, validateAzureCloudStorageRequest.accountName)) {
      return false;
    }
    if (!Objects.equals(this.secure, validateAzureCloudStorageRequest.secure)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterName, dataAccessRole, rangerAuditRole, credentialCrn, blueprintName, storageLocation, managedIdentity, accountKey, accountName, secure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateAzureCloudStorageRequest {\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    dataAccessRole: ").append(toIndentedString(dataAccessRole)).append("\n");
    sb.append("    rangerAuditRole: ").append(toIndentedString(rangerAuditRole)).append("\n");
    sb.append("    credentialCrn: ").append(toIndentedString(credentialCrn)).append("\n");
    sb.append("    blueprintName: ").append(toIndentedString(blueprintName)).append("\n");
    sb.append("    storageLocation: ").append(toIndentedString(storageLocation)).append("\n");
    sb.append("    managedIdentity: ").append(toIndentedString(managedIdentity)).append("\n");
    sb.append("    accountKey: ").append(toIndentedString(accountKey)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
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

