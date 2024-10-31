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
 * Request object for the deleteDataVisualization method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-10-31T09:45:08.143-07:00")
public class DeleteDataVisualizationRequest  {

  /**
   * ID of the Cloudera Data Visualization's cluster.
   **/
  private String clusterId = null;

  /**
   * ID of the Cloudera Data Visualization to delete from the cluster.
   **/
  private String dataVisualizationId = null;

  /**
   * Getter for clusterId.
   * ID of the Cloudera Data Visualization&#39;s cluster.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * ID of the Cloudera Data Visualization&#39;s cluster.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for dataVisualizationId.
   * ID of the Cloudera Data Visualization to delete from the cluster.
   **/
  @JsonProperty("dataVisualizationId")
  public String getDataVisualizationId() {
    return dataVisualizationId;
  }

  /**
   * Setter for dataVisualizationId.
   * ID of the Cloudera Data Visualization to delete from the cluster.
   **/
  public void setDataVisualizationId(String dataVisualizationId) {
    this.dataVisualizationId = dataVisualizationId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteDataVisualizationRequest deleteDataVisualizationRequest = (DeleteDataVisualizationRequest) o;
    if (!Objects.equals(this.clusterId, deleteDataVisualizationRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.dataVisualizationId, deleteDataVisualizationRequest.dataVisualizationId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, dataVisualizationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteDataVisualizationRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    dataVisualizationId: ").append(toIndentedString(dataVisualizationId)).append("\n");
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

