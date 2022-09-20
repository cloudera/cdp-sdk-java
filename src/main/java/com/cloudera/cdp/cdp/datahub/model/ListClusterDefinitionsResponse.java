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
import com.cloudera.cdp.datahub.model.ClusterDefinitionSummary;
import java.util.*;

/**
 * Response object for list cluster definition response.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-09-20T12:01:38.868-07:00")
public class ListClusterDefinitionsResponse extends CdpResponse {

  /**
   * The clusterDefinitions.
   **/
  private List<ClusterDefinitionSummary> clusterDefinitions = new ArrayList<ClusterDefinitionSummary>();

  /**
   * Getter for clusterDefinitions.
   * The clusterDefinitions.
   **/
  @JsonProperty("clusterDefinitions")
  public List<ClusterDefinitionSummary> getClusterDefinitions() {
    return clusterDefinitions;
  }

  /**
   * Setter for clusterDefinitions.
   * The clusterDefinitions.
   **/
  public void setClusterDefinitions(List<ClusterDefinitionSummary> clusterDefinitions) {
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
    ListClusterDefinitionsResponse listClusterDefinitionsResponse = (ListClusterDefinitionsResponse) o;
    if (!Objects.equals(this.clusterDefinitions, listClusterDefinitionsResponse.clusterDefinitions)) {
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
    sb.append("class ListClusterDefinitionsResponse {\n");
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

