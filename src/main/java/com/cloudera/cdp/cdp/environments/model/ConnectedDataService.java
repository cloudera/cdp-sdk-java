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
import java.util.*;

/**
 * A single entry that contains the name of the given Data Service and its related resource(s).
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-15T12:52:22.145-08:00")
public class ConnectedDataService  {

  /**
   * The name of the given Data Service.
   **/
  private String name = null;

  /**
   * List of resource names for the given Data Service.
   **/
  private List<String> clusters = new ArrayList<String>();

  /**
   * Getter for name.
   * The name of the given Data Service.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the given Data Service.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for clusters.
   * List of resource names for the given Data Service.
   **/
  @JsonProperty("clusters")
  public List<String> getClusters() {
    return clusters;
  }

  /**
   * Setter for clusters.
   * List of resource names for the given Data Service.
   **/
  public void setClusters(List<String> clusters) {
    this.clusters = clusters;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectedDataService connectedDataService = (ConnectedDataService) o;
    if (!Objects.equals(this.name, connectedDataService.name)) {
      return false;
    }
    if (!Objects.equals(this.clusters, connectedDataService.clusters)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, clusters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectedDataService {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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

