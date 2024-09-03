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
import com.cloudera.cdp.environments.model.BackupStorageAwsDetails;
import com.cloudera.cdp.environments.model.BackupStorageAzureDetails;
import com.cloudera.cdp.environments.model.BackupStorageGcpDetails;

/**
 * Storage configuration for backup.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-09-03T11:22:09.163-07:00")
public class BackupStorage  {

  /**
   * Whether external backup storage is enabled. The default value is disabled.
   **/
  private Boolean enabled = null;

  /**
   * 
   **/
  private BackupStorageAwsDetails awsDetails = null;

  /**
   * 
   **/
  private BackupStorageAzureDetails azureDetails = null;

  /**
   * 
   **/
  private BackupStorageGcpDetails gcpDetails = null;

  /**
   * Getter for enabled.
   * Whether external backup storage is enabled. The default value is disabled.
   **/
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * Setter for enabled.
   * Whether external backup storage is enabled. The default value is disabled.
   **/
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Getter for awsDetails.
   * 
   **/
  @JsonProperty("awsDetails")
  public BackupStorageAwsDetails getAwsDetails() {
    return awsDetails;
  }

  /**
   * Setter for awsDetails.
   * 
   **/
  public void setAwsDetails(BackupStorageAwsDetails awsDetails) {
    this.awsDetails = awsDetails;
  }

  /**
   * Getter for azureDetails.
   * 
   **/
  @JsonProperty("azureDetails")
  public BackupStorageAzureDetails getAzureDetails() {
    return azureDetails;
  }

  /**
   * Setter for azureDetails.
   * 
   **/
  public void setAzureDetails(BackupStorageAzureDetails azureDetails) {
    this.azureDetails = azureDetails;
  }

  /**
   * Getter for gcpDetails.
   * 
   **/
  @JsonProperty("gcpDetails")
  public BackupStorageGcpDetails getGcpDetails() {
    return gcpDetails;
  }

  /**
   * Setter for gcpDetails.
   * 
   **/
  public void setGcpDetails(BackupStorageGcpDetails gcpDetails) {
    this.gcpDetails = gcpDetails;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupStorage backupStorage = (BackupStorage) o;
    if (!Objects.equals(this.enabled, backupStorage.enabled)) {
      return false;
    }
    if (!Objects.equals(this.awsDetails, backupStorage.awsDetails)) {
      return false;
    }
    if (!Objects.equals(this.azureDetails, backupStorage.azureDetails)) {
      return false;
    }
    if (!Objects.equals(this.gcpDetails, backupStorage.gcpDetails)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, awsDetails, azureDetails, gcpDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupStorage {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    awsDetails: ").append(toIndentedString(awsDetails)).append("\n");
    sb.append("    azureDetails: ").append(toIndentedString(azureDetails)).append("\n");
    sb.append("    gcpDetails: ").append(toIndentedString(gcpDetails)).append("\n");
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

