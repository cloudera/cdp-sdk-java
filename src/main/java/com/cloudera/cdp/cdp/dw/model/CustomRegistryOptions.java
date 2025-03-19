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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Options for custom ACR, ECR registry.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-19T13:03:27.345-07:00")
public class CustomRegistryOptions  {

  /**
   * Custom registry type.
   **/
  private String registryType = null;

  /**
   * URL of the custom image repository.
   **/
  private String repositoryUrl = null;

  /**
   * Getter for registryType.
   * Custom registry type.
   **/
  @JsonProperty("registryType")
  public String getRegistryType() {
    return registryType;
  }

  /**
   * Setter for registryType.
   * Custom registry type.
   **/
  public void setRegistryType(String registryType) {
    this.registryType = registryType;
  }

  /**
   * Getter for repositoryUrl.
   * URL of the custom image repository.
   **/
  @JsonProperty("repositoryUrl")
  public String getRepositoryUrl() {
    return repositoryUrl;
  }

  /**
   * Setter for repositoryUrl.
   * URL of the custom image repository.
   **/
  public void setRepositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomRegistryOptions customRegistryOptions = (CustomRegistryOptions) o;
    if (!Objects.equals(this.registryType, customRegistryOptions.registryType)) {
      return false;
    }
    if (!Objects.equals(this.repositoryUrl, customRegistryOptions.repositoryUrl)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(registryType, repositoryUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomRegistryOptions {\n");
    sb.append("    registryType: ").append(toIndentedString(registryType)).append("\n");
    sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
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

