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
 * Request object for the deleteCluster method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-02-16T12:25:47.690-08:00")
public class DeleteClusterRequest  {

  /**
   * The ID of the cluster to delete.
   **/
  private String clusterId = null;

  /**
   * Force delete cluster (default: false). Force delete means CDW will delete the cluster even if there are attached DB Catalogs and Virtual Warehouses. All managed data will be lost and won't be recoverable. Force delete attampts all steps of the deletion even if previous steps have failed.
   **/
  private Boolean force = null;

  /**
   * Getter for clusterId.
   * The ID of the cluster to delete.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * The ID of the cluster to delete.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for force.
   * Force delete cluster (default: false). Force delete means CDW will delete the cluster even if there are attached DB Catalogs and Virtual Warehouses. All managed data will be lost and won&#39;t be recoverable. Force delete attampts all steps of the deletion even if previous steps have failed.
   **/
  @JsonProperty("force")
  public Boolean getForce() {
    return force;
  }

  /**
   * Setter for force.
   * Force delete cluster (default: false). Force delete means CDW will delete the cluster even if there are attached DB Catalogs and Virtual Warehouses. All managed data will be lost and won&#39;t be recoverable. Force delete attampts all steps of the deletion even if previous steps have failed.
   **/
  public void setForce(Boolean force) {
    this.force = force;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteClusterRequest deleteClusterRequest = (DeleteClusterRequest) o;
    if (!Objects.equals(this.clusterId, deleteClusterRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.force, deleteClusterRequest.force)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, force);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteClusterRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
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

