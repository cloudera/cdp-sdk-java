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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.environments.model.AwsCredentialProperties;
import com.cloudera.cdp.environments.model.AzureCredentialProperties;
import com.cloudera.cdp.environments.model.GCPCredentialProperties;
import java.time.ZonedDateTime;

/**
 * A credential object.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-04-17T06:49:13.601-07:00")
public class Credential  {

  /**
   * The name of the credential.
   **/
  private String credentialName = null;

  /**
   * The CRN of the credential.
   **/
  private String crn = null;

  /**
   * The cloud provider.
   **/
  private String cloudPlatform = null;

  /**
   * Creation date
   **/
  private ZonedDateTime created = null;

  /**
   * A description for the credential.
   **/
  private String description = null;

  /**
   * Skips organization policy decisions during cloud storage validation.
   **/
  private Boolean skipOrgPolicyDecisions = false;

  /**
   * When true, verifies credential permissions.
   **/
  private Boolean verifyPermissions = false;

  /**
   * The credential properties that closely related to those that have been created on AWS.
   **/
  private AwsCredentialProperties awsCredentialProperties = null;

  /**
   * The credential properties that closely related to those that have been created on Azure.
   **/
  private AzureCredentialProperties azureCredentialProperties = null;

  /**
   * The credential properties that closely related to those that have been created on GCP.
   **/
  private GCPCredentialProperties gcpCredentialProperties = null;

  /**
   * Getter for credentialName.
   * The name of the credential.
   **/
  @JsonProperty("credentialName")
  public String getCredentialName() {
    return credentialName;
  }

  /**
   * Setter for credentialName.
   * The name of the credential.
   **/
  public void setCredentialName(String credentialName) {
    this.credentialName = credentialName;
  }

  /**
   * Getter for crn.
   * The CRN of the credential.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the credential.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for cloudPlatform.
   * The cloud provider.
   **/
  @JsonProperty("cloudPlatform")
  public String getCloudPlatform() {
    return cloudPlatform;
  }

  /**
   * Setter for cloudPlatform.
   * The cloud provider.
   **/
  public void setCloudPlatform(String cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
  }

  /**
   * Getter for created.
   * Creation date
   **/
  @JsonProperty("created")
  public ZonedDateTime getCreated() {
    return created;
  }

  /**
   * Setter for created.
   * Creation date
   **/
  public void setCreated(ZonedDateTime created) {
    this.created = created;
  }

  /**
   * Getter for description.
   * A description for the credential.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * A description for the credential.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for skipOrgPolicyDecisions.
   * Skips organization policy decisions during cloud storage validation.
   **/
  @JsonProperty("skipOrgPolicyDecisions")
  public Boolean getSkipOrgPolicyDecisions() {
    return skipOrgPolicyDecisions;
  }

  /**
   * Setter for skipOrgPolicyDecisions.
   * Skips organization policy decisions during cloud storage validation.
   **/
  public void setSkipOrgPolicyDecisions(Boolean skipOrgPolicyDecisions) {
    this.skipOrgPolicyDecisions = skipOrgPolicyDecisions;
  }

  /**
   * Getter for verifyPermissions.
   * When true, verifies credential permissions.
   **/
  @JsonProperty("verifyPermissions")
  public Boolean getVerifyPermissions() {
    return verifyPermissions;
  }

  /**
   * Setter for verifyPermissions.
   * When true, verifies credential permissions.
   **/
  public void setVerifyPermissions(Boolean verifyPermissions) {
    this.verifyPermissions = verifyPermissions;
  }

  /**
   * Getter for awsCredentialProperties.
   * The credential properties that closely related to those that have been created on AWS.
   **/
  @JsonProperty("awsCredentialProperties")
  public AwsCredentialProperties getAwsCredentialProperties() {
    return awsCredentialProperties;
  }

  /**
   * Setter for awsCredentialProperties.
   * The credential properties that closely related to those that have been created on AWS.
   **/
  public void setAwsCredentialProperties(AwsCredentialProperties awsCredentialProperties) {
    this.awsCredentialProperties = awsCredentialProperties;
  }

  /**
   * Getter for azureCredentialProperties.
   * The credential properties that closely related to those that have been created on Azure.
   **/
  @JsonProperty("azureCredentialProperties")
  public AzureCredentialProperties getAzureCredentialProperties() {
    return azureCredentialProperties;
  }

  /**
   * Setter for azureCredentialProperties.
   * The credential properties that closely related to those that have been created on Azure.
   **/
  public void setAzureCredentialProperties(AzureCredentialProperties azureCredentialProperties) {
    this.azureCredentialProperties = azureCredentialProperties;
  }

  /**
   * Getter for gcpCredentialProperties.
   * The credential properties that closely related to those that have been created on GCP.
   **/
  @JsonProperty("gcpCredentialProperties")
  public GCPCredentialProperties getGcpCredentialProperties() {
    return gcpCredentialProperties;
  }

  /**
   * Setter for gcpCredentialProperties.
   * The credential properties that closely related to those that have been created on GCP.
   **/
  public void setGcpCredentialProperties(GCPCredentialProperties gcpCredentialProperties) {
    this.gcpCredentialProperties = gcpCredentialProperties;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Credential credential = (Credential) o;
    if (!Objects.equals(this.credentialName, credential.credentialName)) {
      return false;
    }
    if (!Objects.equals(this.crn, credential.crn)) {
      return false;
    }
    if (!Objects.equals(this.cloudPlatform, credential.cloudPlatform)) {
      return false;
    }
    if (!Objects.equals(this.created, credential.created)) {
      return false;
    }
    if (!Objects.equals(this.description, credential.description)) {
      return false;
    }
    if (!Objects.equals(this.skipOrgPolicyDecisions, credential.skipOrgPolicyDecisions)) {
      return false;
    }
    if (!Objects.equals(this.verifyPermissions, credential.verifyPermissions)) {
      return false;
    }
    if (!Objects.equals(this.awsCredentialProperties, credential.awsCredentialProperties)) {
      return false;
    }
    if (!Objects.equals(this.azureCredentialProperties, credential.azureCredentialProperties)) {
      return false;
    }
    if (!Objects.equals(this.gcpCredentialProperties, credential.gcpCredentialProperties)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialName, crn, cloudPlatform, created, description, skipOrgPolicyDecisions, verifyPermissions, awsCredentialProperties, azureCredentialProperties, gcpCredentialProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Credential {\n");
    sb.append("    credentialName: ").append(toIndentedString(credentialName)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    cloudPlatform: ").append(toIndentedString(cloudPlatform)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    skipOrgPolicyDecisions: ").append(toIndentedString(skipOrgPolicyDecisions)).append("\n");
    sb.append("    verifyPermissions: ").append(toIndentedString(verifyPermissions)).append("\n");
    sb.append("    awsCredentialProperties: ").append(toIndentedString(awsCredentialProperties)).append("\n");
    sb.append("    azureCredentialProperties: ").append(toIndentedString(azureCredentialProperties)).append("\n");
    sb.append("    gcpCredentialProperties: ").append(toIndentedString(gcpCredentialProperties)).append("\n");
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

