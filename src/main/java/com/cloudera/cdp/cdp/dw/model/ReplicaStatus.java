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
 * Status information on the current state of replicas in the virtual warehouse.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-12-13T15:06:57.578-08:00")
public class ReplicaStatus  {

  /**
   * Total number of executor replicas scheduled for the virtual warehouse. This number contains the number of executor replicas in pending state, as well as the replicas that are already running. If this number is zero, then the executor functionality is stopped.
   **/
  private Integer totalExecutorReplicas = null;

  /**
   * Total number of ready executor replicas in the virtual warehouse. This number only contains the healthy executor replicas that have already started up and are ready to accept requests. If this number is less than the totalExecutorReplicas, then the virtual warehouse might still be starting up or there might be a problem scheduling these replicas.
   **/
  private Integer readyExecutorReplicas = null;

  /**
   * Total number of coordinator replicas scheduled for the virtual warehouse. This number contains the number of coordinator replicas in pending state, as well as the replicas that are already running. If this number is zero, then the coordinator functionality is stopped.
   **/
  private Integer totalCoordinatorReplicas = null;

  /**
   * Total number of ready coordinator replicas in the virtual warehouse. This number only contains the healthy executor replicas that have already started up and are ready to accept requests. If this number is less than the totalCoordinatorReplicas, then the virtual warehouse might still be starting up or there might be a problem scheduling these replicas.
   **/
  private Integer readyCoordinatorReplicas = null;

  /**
   * Getter for totalExecutorReplicas.
   * Total number of executor replicas scheduled for the virtual warehouse. This number contains the number of executor replicas in pending state, as well as the replicas that are already running. If this number is zero, then the executor functionality is stopped.
   **/
  @JsonProperty("totalExecutorReplicas")
  public Integer getTotalExecutorReplicas() {
    return totalExecutorReplicas;
  }

  /**
   * Setter for totalExecutorReplicas.
   * Total number of executor replicas scheduled for the virtual warehouse. This number contains the number of executor replicas in pending state, as well as the replicas that are already running. If this number is zero, then the executor functionality is stopped.
   **/
  public void setTotalExecutorReplicas(Integer totalExecutorReplicas) {
    this.totalExecutorReplicas = totalExecutorReplicas;
  }

  /**
   * Getter for readyExecutorReplicas.
   * Total number of ready executor replicas in the virtual warehouse. This number only contains the healthy executor replicas that have already started up and are ready to accept requests. If this number is less than the totalExecutorReplicas, then the virtual warehouse might still be starting up or there might be a problem scheduling these replicas.
   **/
  @JsonProperty("readyExecutorReplicas")
  public Integer getReadyExecutorReplicas() {
    return readyExecutorReplicas;
  }

  /**
   * Setter for readyExecutorReplicas.
   * Total number of ready executor replicas in the virtual warehouse. This number only contains the healthy executor replicas that have already started up and are ready to accept requests. If this number is less than the totalExecutorReplicas, then the virtual warehouse might still be starting up or there might be a problem scheduling these replicas.
   **/
  public void setReadyExecutorReplicas(Integer readyExecutorReplicas) {
    this.readyExecutorReplicas = readyExecutorReplicas;
  }

  /**
   * Getter for totalCoordinatorReplicas.
   * Total number of coordinator replicas scheduled for the virtual warehouse. This number contains the number of coordinator replicas in pending state, as well as the replicas that are already running. If this number is zero, then the coordinator functionality is stopped.
   **/
  @JsonProperty("totalCoordinatorReplicas")
  public Integer getTotalCoordinatorReplicas() {
    return totalCoordinatorReplicas;
  }

  /**
   * Setter for totalCoordinatorReplicas.
   * Total number of coordinator replicas scheduled for the virtual warehouse. This number contains the number of coordinator replicas in pending state, as well as the replicas that are already running. If this number is zero, then the coordinator functionality is stopped.
   **/
  public void setTotalCoordinatorReplicas(Integer totalCoordinatorReplicas) {
    this.totalCoordinatorReplicas = totalCoordinatorReplicas;
  }

  /**
   * Getter for readyCoordinatorReplicas.
   * Total number of ready coordinator replicas in the virtual warehouse. This number only contains the healthy executor replicas that have already started up and are ready to accept requests. If this number is less than the totalCoordinatorReplicas, then the virtual warehouse might still be starting up or there might be a problem scheduling these replicas.
   **/
  @JsonProperty("readyCoordinatorReplicas")
  public Integer getReadyCoordinatorReplicas() {
    return readyCoordinatorReplicas;
  }

  /**
   * Setter for readyCoordinatorReplicas.
   * Total number of ready coordinator replicas in the virtual warehouse. This number only contains the healthy executor replicas that have already started up and are ready to accept requests. If this number is less than the totalCoordinatorReplicas, then the virtual warehouse might still be starting up or there might be a problem scheduling these replicas.
   **/
  public void setReadyCoordinatorReplicas(Integer readyCoordinatorReplicas) {
    this.readyCoordinatorReplicas = readyCoordinatorReplicas;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplicaStatus replicaStatus = (ReplicaStatus) o;
    if (!Objects.equals(this.totalExecutorReplicas, replicaStatus.totalExecutorReplicas)) {
      return false;
    }
    if (!Objects.equals(this.readyExecutorReplicas, replicaStatus.readyExecutorReplicas)) {
      return false;
    }
    if (!Objects.equals(this.totalCoordinatorReplicas, replicaStatus.totalCoordinatorReplicas)) {
      return false;
    }
    if (!Objects.equals(this.readyCoordinatorReplicas, replicaStatus.readyCoordinatorReplicas)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalExecutorReplicas, readyExecutorReplicas, totalCoordinatorReplicas, readyCoordinatorReplicas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplicaStatus {\n");
    sb.append("    totalExecutorReplicas: ").append(toIndentedString(totalExecutorReplicas)).append("\n");
    sb.append("    readyExecutorReplicas: ").append(toIndentedString(readyExecutorReplicas)).append("\n");
    sb.append("    totalCoordinatorReplicas: ").append(toIndentedString(totalCoordinatorReplicas)).append("\n");
    sb.append("    readyCoordinatorReplicas: ").append(toIndentedString(readyCoordinatorReplicas)).append("\n");
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

