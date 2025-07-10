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

package com.cloudera.cdp.compute.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.compute.model.CommonNetwork;
import java.util.*;
import java.util.Map;

/**
 * Request object for creating a cluster.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-09T13:56:16.086-07:00")
public class CreateClusterRequest  {

  /**
   * Environment CRN. Required.
   **/
  private String environment = null;

  /**
   * Cluster name. Required.
   **/
  private String name = null;

  /**
   * Cluster description.
   **/
  private String description = null;

  /**
   * Cluster level tags.
   **/
  private Map<String, String> tags = new HashMap<String, String>();

  /**
   * Network.
   **/
  private CommonNetwork network = null;

  /**
   * Skip validation.
   **/
  private Boolean skipValidation = null;

  /**
   * Getter for environment.
   * Environment CRN. Required.
   **/
  @JsonProperty("environment")
  public String getEnvironment() {
    return environment;
  }

  /**
   * Setter for environment.
   * Environment CRN. Required.
   **/
  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  /**
   * Getter for name.
   * Cluster name. Required.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Cluster name. Required.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for description.
   * Cluster description.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * Cluster description.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for tags.
   * Cluster level tags.
   **/
  @JsonProperty("tags")
  public Map<String, String> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Cluster level tags.
   **/
  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  /**
   * Getter for network.
   * Network.
   **/
  @JsonProperty("network")
  public CommonNetwork getNetwork() {
    return network;
  }

  /**
   * Setter for network.
   * Network.
   **/
  public void setNetwork(CommonNetwork network) {
    this.network = network;
  }

  /**
   * Getter for skipValidation.
   * Skip validation.
   **/
  @JsonProperty("skipValidation")
  public Boolean getSkipValidation() {
    return skipValidation;
  }

  /**
   * Setter for skipValidation.
   * Skip validation.
   **/
  public void setSkipValidation(Boolean skipValidation) {
    this.skipValidation = skipValidation;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateClusterRequest createClusterRequest = (CreateClusterRequest) o;
    if (!Objects.equals(this.environment, createClusterRequest.environment)) {
      return false;
    }
    if (!Objects.equals(this.name, createClusterRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.description, createClusterRequest.description)) {
      return false;
    }
    if (!Objects.equals(this.tags, createClusterRequest.tags)) {
      return false;
    }
    if (!Objects.equals(this.network, createClusterRequest.network)) {
      return false;
    }
    if (!Objects.equals(this.skipValidation, createClusterRequest.skipValidation)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, name, description, tags, network, skipValidation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateClusterRequest {\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    skipValidation: ").append(toIndentedString(skipValidation)).append("\n");
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

