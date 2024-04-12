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

package com.cloudera.cdp.audit.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for the ConfigureArchiving method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-04-11T13:44:53.622-07:00")
public class ConfigureArchivingRequest  {

  /**
   * The destination for the logs, e.g. S3 bucket name
   **/
  private String storageLocation = null;

  /**
   * The credential name or CRN to use
   **/
  private String credentialName = null;

  /**
   * Flag to enable/disable the archiving process
   **/
  private Boolean enabled = null;

  /**
   * The region to work with when accessing the logs, e.g. S3 region
   **/
  private String storageRegion = null;

  /**
   * Whether to only verify the configuration, and not update it.
   **/
  private Boolean verifyOnly = null;

  /**
   * Getter for storageLocation.
   * The destination for the logs, e.g. S3 bucket name
   **/
  @JsonProperty("storageLocation")
  public String getStorageLocation() {
    return storageLocation;
  }

  /**
   * Setter for storageLocation.
   * The destination for the logs, e.g. S3 bucket name
   **/
  public void setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
  }

  /**
   * Getter for credentialName.
   * The credential name or CRN to use
   **/
  @JsonProperty("credentialName")
  public String getCredentialName() {
    return credentialName;
  }

  /**
   * Setter for credentialName.
   * The credential name or CRN to use
   **/
  public void setCredentialName(String credentialName) {
    this.credentialName = credentialName;
  }

  /**
   * Getter for enabled.
   * Flag to enable/disable the archiving process
   **/
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * Setter for enabled.
   * Flag to enable/disable the archiving process
   **/
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Getter for storageRegion.
   * The region to work with when accessing the logs, e.g. S3 region
   **/
  @JsonProperty("storageRegion")
  public String getStorageRegion() {
    return storageRegion;
  }

  /**
   * Setter for storageRegion.
   * The region to work with when accessing the logs, e.g. S3 region
   **/
  public void setStorageRegion(String storageRegion) {
    this.storageRegion = storageRegion;
  }

  /**
   * Getter for verifyOnly.
   * Whether to only verify the configuration, and not update it.
   **/
  @JsonProperty("verifyOnly")
  public Boolean getVerifyOnly() {
    return verifyOnly;
  }

  /**
   * Setter for verifyOnly.
   * Whether to only verify the configuration, and not update it.
   **/
  public void setVerifyOnly(Boolean verifyOnly) {
    this.verifyOnly = verifyOnly;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigureArchivingRequest configureArchivingRequest = (ConfigureArchivingRequest) o;
    if (!Objects.equals(this.storageLocation, configureArchivingRequest.storageLocation)) {
      return false;
    }
    if (!Objects.equals(this.credentialName, configureArchivingRequest.credentialName)) {
      return false;
    }
    if (!Objects.equals(this.enabled, configureArchivingRequest.enabled)) {
      return false;
    }
    if (!Objects.equals(this.storageRegion, configureArchivingRequest.storageRegion)) {
      return false;
    }
    if (!Objects.equals(this.verifyOnly, configureArchivingRequest.verifyOnly)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageLocation, credentialName, enabled, storageRegion, verifyOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigureArchivingRequest {\n");
    sb.append("    storageLocation: ").append(toIndentedString(storageLocation)).append("\n");
    sb.append("    credentialName: ").append(toIndentedString(credentialName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    storageRegion: ").append(toIndentedString(storageRegion)).append("\n");
    sb.append("    verifyOnly: ").append(toIndentedString(verifyOnly)).append("\n");
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

