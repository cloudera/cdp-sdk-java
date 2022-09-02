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

/**
 * Request object for delete cluster request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-09-01T19:38:39.949-07:00")
public class DeleteClusterRequest  {

  /**
   * The name or CRN of the cluster to be deleted.
   **/
  private String clusterName = null;

  /**
   * Whether the cluster should be force deleted. This option can be used when cluster deletion fails. This removes the entry from Cloudera Datahub service. Any lingering resources have to be deleted from the cloud provider manually. The default is false.
   **/
  private Boolean force = null;

  /**
   * Getter for clusterName.
   * The name or CRN of the cluster to be deleted.
   **/
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }

  /**
   * Setter for clusterName.
   * The name or CRN of the cluster to be deleted.
   **/
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  /**
   * Getter for force.
   * Whether the cluster should be force deleted. This option can be used when cluster deletion fails. This removes the entry from Cloudera Datahub service. Any lingering resources have to be deleted from the cloud provider manually. The default is false.
   **/
  @JsonProperty("force")
  public Boolean getForce() {
    return force;
  }

  /**
   * Setter for force.
   * Whether the cluster should be force deleted. This option can be used when cluster deletion fails. This removes the entry from Cloudera Datahub service. Any lingering resources have to be deleted from the cloud provider manually. The default is false.
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
    if (!Objects.equals(this.clusterName, deleteClusterRequest.clusterName)) {
      return false;
    }
    if (!Objects.equals(this.force, deleteClusterRequest.force)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterName, force);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteClusterRequest {\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
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

