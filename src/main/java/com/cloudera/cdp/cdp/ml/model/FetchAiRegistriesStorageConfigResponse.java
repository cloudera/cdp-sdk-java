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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.ml.model.AiRegistryStorageConfigEntry;
import java.util.*;
import java.util.Map;

/**
 * Response object for the FetchAiRegistriesStorageConfig method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:49.791Z")
public class FetchAiRegistriesStorageConfigResponse extends CdpResponse {

  /**
   * Map from AI Registry Kubernetes namespace to storage config.
   **/
  private Map<String, AiRegistryStorageConfigEntry> registries = new HashMap<String, AiRegistryStorageConfigEntry>();

  /**
   * Getter for registries.
   * Map from AI Registry Kubernetes namespace to storage config.
   **/
  @JsonProperty("registries")
  public Map<String, AiRegistryStorageConfigEntry> getRegistries() {
    return registries;
  }

  /**
   * Setter for registries.
   * Map from AI Registry Kubernetes namespace to storage config.
   **/
  public void setRegistries(Map<String, AiRegistryStorageConfigEntry> registries) {
    this.registries = registries;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FetchAiRegistriesStorageConfigResponse fetchAiRegistriesStorageConfigResponse = (FetchAiRegistriesStorageConfigResponse) o;
    if (!Objects.equals(this.registries, fetchAiRegistriesStorageConfigResponse.registries)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(registries, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FetchAiRegistriesStorageConfigResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    registries: ").append(toIndentedString(registries)).append("\n");
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

