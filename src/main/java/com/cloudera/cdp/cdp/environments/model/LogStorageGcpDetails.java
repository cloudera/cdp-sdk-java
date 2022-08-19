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
 * GCP-specific log storage configuration information.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-08-18T19:29:51.335-07:00")
public class LogStorageGcpDetails  {

  /**
   * The storage location to use. This should be a gs:// url.
   **/
  private String storageLocationBase = null;

  /**
   * Email ID of the service account associated with the logging instances.
   **/
  private String serviceAccountEmail = null;

  /**
   * Getter for storageLocationBase.
   * The storage location to use. This should be a gs:// url.
   **/
  @JsonProperty("storageLocationBase")
  public String getStorageLocationBase() {
    return storageLocationBase;
  }

  /**
   * Setter for storageLocationBase.
   * The storage location to use. This should be a gs:// url.
   **/
  public void setStorageLocationBase(String storageLocationBase) {
    this.storageLocationBase = storageLocationBase;
  }

  /**
   * Getter for serviceAccountEmail.
   * Email ID of the service account associated with the logging instances.
   **/
  @JsonProperty("serviceAccountEmail")
  public String getServiceAccountEmail() {
    return serviceAccountEmail;
  }

  /**
   * Setter for serviceAccountEmail.
   * Email ID of the service account associated with the logging instances.
   **/
  public void setServiceAccountEmail(String serviceAccountEmail) {
    this.serviceAccountEmail = serviceAccountEmail;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogStorageGcpDetails logStorageGcpDetails = (LogStorageGcpDetails) o;
    if (!Objects.equals(this.storageLocationBase, logStorageGcpDetails.storageLocationBase)) {
      return false;
    }
    if (!Objects.equals(this.serviceAccountEmail, logStorageGcpDetails.serviceAccountEmail)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageLocationBase, serviceAccountEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogStorageGcpDetails {\n");
    sb.append("    storageLocationBase: ").append(toIndentedString(storageLocationBase)).append("\n");
    sb.append("    serviceAccountEmail: ").append(toIndentedString(serviceAccountEmail)).append("\n");
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

