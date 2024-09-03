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
 * Request object for GCP configuration.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-09-03T11:22:08.521-07:00")
public class GCPConfigurationRequest  {

  /**
   * Email id of the service account to be associated with the datalake IdBroker instance. This service account should have \"token.creator\" role for one or more storage accounts that has access to storage.
   **/
  private String serviceAccountEmail = null;

  /**
   * The location of the GCS bucket to be used as storage. The location has to start with gs:// followed by the bucket name.
   **/
  private String storageLocation = null;

  /**
   * Getter for serviceAccountEmail.
   * Email id of the service account to be associated with the datalake IdBroker instance. This service account should have \&quot;token.creator\&quot; role for one or more storage accounts that has access to storage.
   **/
  @JsonProperty("serviceAccountEmail")
  public String getServiceAccountEmail() {
    return serviceAccountEmail;
  }

  /**
   * Setter for serviceAccountEmail.
   * Email id of the service account to be associated with the datalake IdBroker instance. This service account should have \&quot;token.creator\&quot; role for one or more storage accounts that has access to storage.
   **/
  public void setServiceAccountEmail(String serviceAccountEmail) {
    this.serviceAccountEmail = serviceAccountEmail;
  }

  /**
   * Getter for storageLocation.
   * The location of the GCS bucket to be used as storage. The location has to start with gs:// followed by the bucket name.
   **/
  @JsonProperty("storageLocation")
  public String getStorageLocation() {
    return storageLocation;
  }

  /**
   * Setter for storageLocation.
   * The location of the GCS bucket to be used as storage. The location has to start with gs:// followed by the bucket name.
   **/
  public void setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPConfigurationRequest gCPConfigurationRequest = (GCPConfigurationRequest) o;
    if (!Objects.equals(this.serviceAccountEmail, gCPConfigurationRequest.serviceAccountEmail)) {
      return false;
    }
    if (!Objects.equals(this.storageLocation, gCPConfigurationRequest.storageLocation)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceAccountEmail, storageLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPConfigurationRequest {\n");
    sb.append("    serviceAccountEmail: ").append(toIndentedString(serviceAccountEmail)).append("\n");
    sb.append("    storageLocation: ").append(toIndentedString(storageLocation)).append("\n");
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

