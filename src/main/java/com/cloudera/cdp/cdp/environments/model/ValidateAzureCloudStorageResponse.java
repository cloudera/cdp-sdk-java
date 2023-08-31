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
 * Response object for Azure environment cloud storage validation.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-08-30T17:23:16.951-07:00")
public class ValidateAzureCloudStorageResponse extends CdpResponse {

  /**
   * Validation result. Allowed values are \"OK\", \"ACCESS_DENIED\", \"ERROR\", \"RESOURCE_NOT_FOUND\".
   **/
  private String status = null;

  /**
   * Error message if validation failed.
   **/
  private String error = null;

  /**
   * Getter for status.
   * Validation result. Allowed values are \&quot;OK\&quot;, \&quot;ACCESS_DENIED\&quot;, \&quot;ERROR\&quot;, \&quot;RESOURCE_NOT_FOUND\&quot;.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Validation result. Allowed values are \&quot;OK\&quot;, \&quot;ACCESS_DENIED\&quot;, \&quot;ERROR\&quot;, \&quot;RESOURCE_NOT_FOUND\&quot;.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for error.
   * Error message if validation failed.
   **/
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  /**
   * Setter for error.
   * Error message if validation failed.
   **/
  public void setError(String error) {
    this.error = error;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateAzureCloudStorageResponse validateAzureCloudStorageResponse = (ValidateAzureCloudStorageResponse) o;
    if (!Objects.equals(this.status, validateAzureCloudStorageResponse.status)) {
      return false;
    }
    if (!Objects.equals(this.error, validateAzureCloudStorageResponse.error)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, error, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateAzureCloudStorageResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

