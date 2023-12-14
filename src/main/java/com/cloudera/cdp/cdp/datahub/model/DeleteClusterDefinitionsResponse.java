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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datahub.model.ClusterDefinition;
import java.util.*;

/**
 * Response object for delete cluster definition request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-12-13T15:06:56.917-08:00")
public class DeleteClusterDefinitionsResponse extends CdpResponse {

  /**
   * The clusterDefinitions.
   **/
  private List<ClusterDefinition> clusterDefinitions = new ArrayList<ClusterDefinition>();

  /**
   * Getter for clusterDefinitions.
   * The clusterDefinitions.
   **/
  @JsonProperty("clusterDefinitions")
  public List<ClusterDefinition> getClusterDefinitions() {
    return clusterDefinitions;
  }

  /**
   * Setter for clusterDefinitions.
   * The clusterDefinitions.
   **/
  public void setClusterDefinitions(List<ClusterDefinition> clusterDefinitions) {
    this.clusterDefinitions = clusterDefinitions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteClusterDefinitionsResponse deleteClusterDefinitionsResponse = (DeleteClusterDefinitionsResponse) o;
    if (!Objects.equals(this.clusterDefinitions, deleteClusterDefinitionsResponse.clusterDefinitions)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterDefinitions, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteClusterDefinitionsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    clusterDefinitions: ").append(toIndentedString(clusterDefinitions)).append("\n");
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

