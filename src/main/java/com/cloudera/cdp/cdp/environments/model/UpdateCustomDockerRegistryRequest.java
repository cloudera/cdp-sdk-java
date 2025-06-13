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
 * The desired custom docker registry for data services to be used.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-06-12T15:05:27.960-07:00")
public class UpdateCustomDockerRegistryRequest  {

  /**
   * The name or CRN of the environment.
   **/
  private String environment = null;

  /**
   * The CRN of the desired custom docker registry for data services to be used.
   **/
  private String customDockerRegistry = null;

  /**
   * Getter for environment.
   * The name or CRN of the environment.
   **/
  @JsonProperty("environment")
  public String getEnvironment() {
    return environment;
  }

  /**
   * Setter for environment.
   * The name or CRN of the environment.
   **/
  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  /**
   * Getter for customDockerRegistry.
   * The CRN of the desired custom docker registry for data services to be used.
   **/
  @JsonProperty("customDockerRegistry")
  public String getCustomDockerRegistry() {
    return customDockerRegistry;
  }

  /**
   * Setter for customDockerRegistry.
   * The CRN of the desired custom docker registry for data services to be used.
   **/
  public void setCustomDockerRegistry(String customDockerRegistry) {
    this.customDockerRegistry = customDockerRegistry;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomDockerRegistryRequest updateCustomDockerRegistryRequest = (UpdateCustomDockerRegistryRequest) o;
    if (!Objects.equals(this.environment, updateCustomDockerRegistryRequest.environment)) {
      return false;
    }
    if (!Objects.equals(this.customDockerRegistry, updateCustomDockerRegistryRequest.customDockerRegistry)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, customDockerRegistry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomDockerRegistryRequest {\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    customDockerRegistry: ").append(toIndentedString(customDockerRegistry)).append("\n");
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

