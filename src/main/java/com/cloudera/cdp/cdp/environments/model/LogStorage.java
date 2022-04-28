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
import com.cloudera.cdp.environments.model.LogStorageAwsDetails;
import com.cloudera.cdp.environments.model.LogStorageAzureDetails;
import com.cloudera.cdp.environments.model.LogStorageGcpDetails;

/**
 * Storage configuration for cluster and audit logs.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-04-28T14:39:23.779-07:00")
public class LogStorage  {

  /**
   * Whether external log storage is enabled.
   **/
  private Boolean enabled = null;

  /**
   * 
   **/
  private LogStorageAwsDetails awsDetails = null;

  /**
   * 
   **/
  private LogStorageAzureDetails azureDetails = null;

  /**
   * 
   **/
  private LogStorageGcpDetails gcpDetails = null;

  /**
   * Getter for enabled.
   * Whether external log storage is enabled.
   **/
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * Setter for enabled.
   * Whether external log storage is enabled.
   **/
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Getter for awsDetails.
   * 
   **/
  @JsonProperty("awsDetails")
  public LogStorageAwsDetails getAwsDetails() {
    return awsDetails;
  }

  /**
   * Setter for awsDetails.
   * 
   **/
  public void setAwsDetails(LogStorageAwsDetails awsDetails) {
    this.awsDetails = awsDetails;
  }

  /**
   * Getter for azureDetails.
   * 
   **/
  @JsonProperty("azureDetails")
  public LogStorageAzureDetails getAzureDetails() {
    return azureDetails;
  }

  /**
   * Setter for azureDetails.
   * 
   **/
  public void setAzureDetails(LogStorageAzureDetails azureDetails) {
    this.azureDetails = azureDetails;
  }

  /**
   * Getter for gcpDetails.
   * 
   **/
  @JsonProperty("gcpDetails")
  public LogStorageGcpDetails getGcpDetails() {
    return gcpDetails;
  }

  /**
   * Setter for gcpDetails.
   * 
   **/
  public void setGcpDetails(LogStorageGcpDetails gcpDetails) {
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
    LogStorage logStorage = (LogStorage) o;
    if (!Objects.equals(this.enabled, logStorage.enabled)) {
      return false;
    }
    if (!Objects.equals(this.awsDetails, logStorage.awsDetails)) {
      return false;
    }
    if (!Objects.equals(this.azureDetails, logStorage.azureDetails)) {
      return false;
    }
    if (!Objects.equals(this.gcpDetails, logStorage.gcpDetails)) {
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
    sb.append("class LogStorage {\n");
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

