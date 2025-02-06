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

/**
 * Request object for AWS environment cloud storage validation.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-02-06T11:00:50.150-08:00")
public class ValidateAwsCloudStorageRequest  {

  /**
   * The CRN of the credential.
   **/
  private String credentialCrn = null;

  /**
   * AWS S3 storage bucket location for logging.
   **/
  private String storageLocation = null;

  /**
   * AWS instance profile.
   **/
  private String instanceProfile = null;

  /**
   * Getter for credentialCrn.
   * The CRN of the credential.
   **/
  @JsonProperty("credentialCrn")
  public String getCredentialCrn() {
    return credentialCrn;
  }

  /**
   * Setter for credentialCrn.
   * The CRN of the credential.
   **/
  public void setCredentialCrn(String credentialCrn) {
    this.credentialCrn = credentialCrn;
  }

  /**
   * Getter for storageLocation.
   * AWS S3 storage bucket location for logging.
   **/
  @JsonProperty("storageLocation")
  public String getStorageLocation() {
    return storageLocation;
  }

  /**
   * Setter for storageLocation.
   * AWS S3 storage bucket location for logging.
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateAwsCloudStorageRequest validateAwsCloudStorageRequest = (ValidateAwsCloudStorageRequest) o;
    if (!Objects.equals(this.credentialCrn, validateAwsCloudStorageRequest.credentialCrn)) {
      return false;
    }
    if (!Objects.equals(this.storageLocation, validateAwsCloudStorageRequest.storageLocation)) {
      return false;
    }
    if (!Objects.equals(this.instanceProfile, validateAwsCloudStorageRequest.instanceProfile)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialCrn, storageLocation, instanceProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateAwsCloudStorageRequest {\n");
    sb.append("    credentialCrn: ").append(toIndentedString(credentialCrn)).append("\n");
    sb.append("    storageLocation: ").append(toIndentedString(storageLocation)).append("\n");
    sb.append("    instanceProfile: ").append(toIndentedString(instanceProfile)).append("\n");
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

