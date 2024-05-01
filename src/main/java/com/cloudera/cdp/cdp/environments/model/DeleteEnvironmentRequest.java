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
 * Request object for a delete environment request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-04-30T10:56:34.387-07:00")
public class DeleteEnvironmentRequest  {

  /**
   * The name or CRN of the environment.
   **/
  private String environmentName = null;

  /**
   * Delete all connected resources too.
   **/
  private Boolean cascading = null;

  /**
   * Force delete action removes CDP resources and may leave cloud provider resources running even if the deletion did not succeed.
   **/
  private Boolean forced = null;

  /**
   * Getter for environmentName.
   * The name or CRN of the environment.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The name or CRN of the environment.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for cascading.
   * Delete all connected resources too.
   **/
  @JsonProperty("cascading")
  public Boolean getCascading() {
    return cascading;
  }

  /**
   * Setter for cascading.
   * Delete all connected resources too.
   **/
  public void setCascading(Boolean cascading) {
    this.cascading = cascading;
  }

  /**
   * Getter for forced.
   * Force delete action removes CDP resources and may leave cloud provider resources running even if the deletion did not succeed.
   **/
  @JsonProperty("forced")
  public Boolean getForced() {
    return forced;
  }

  /**
   * Setter for forced.
   * Force delete action removes CDP resources and may leave cloud provider resources running even if the deletion did not succeed.
   **/
  public void setForced(Boolean forced) {
    this.forced = forced;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteEnvironmentRequest deleteEnvironmentRequest = (DeleteEnvironmentRequest) o;
    if (!Objects.equals(this.environmentName, deleteEnvironmentRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.cascading, deleteEnvironmentRequest.cascading)) {
      return false;
    }
    if (!Objects.equals(this.forced, deleteEnvironmentRequest.forced)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, cascading, forced);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteEnvironmentRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    cascading: ").append(toIndentedString(cascading)).append("\n");
    sb.append("    forced: ").append(toIndentedString(forced)).append("\n");
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

