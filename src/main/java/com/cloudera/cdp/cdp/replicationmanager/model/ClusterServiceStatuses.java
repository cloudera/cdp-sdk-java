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

package com.cloudera.cdp.replicationmanager.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.replicationmanager.model.ServiceInfo;
import java.util.*;

/**
 * Describes the status of services running on a cluster.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-04-30T10:56:36.742-07:00")
public class ClusterServiceStatuses  {

  /**
   * Cluster CRN.
   **/
  private String clusterCrn = null;

  /**
   * List of service statuses.
   **/
  private List<ServiceInfo> serviceStatuses = new ArrayList<ServiceInfo>();

  /**
   * Getter for clusterCrn.
   * Cluster CRN.
   **/
  @JsonProperty("clusterCrn")
  public String getClusterCrn() {
    return clusterCrn;
  }

  /**
   * Setter for clusterCrn.
   * Cluster CRN.
   **/
  public void setClusterCrn(String clusterCrn) {
    this.clusterCrn = clusterCrn;
  }

  /**
   * Getter for serviceStatuses.
   * List of service statuses.
   **/
  @JsonProperty("serviceStatuses")
  public List<ServiceInfo> getServiceStatuses() {
    return serviceStatuses;
  }

  /**
   * Setter for serviceStatuses.
   * List of service statuses.
   **/
  public void setServiceStatuses(List<ServiceInfo> serviceStatuses) {
    this.serviceStatuses = serviceStatuses;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterServiceStatuses clusterServiceStatuses = (ClusterServiceStatuses) o;
    if (!Objects.equals(this.clusterCrn, clusterServiceStatuses.clusterCrn)) {
      return false;
    }
    if (!Objects.equals(this.serviceStatuses, clusterServiceStatuses.serviceStatuses)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterCrn, serviceStatuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterServiceStatuses {\n");
    sb.append("    clusterCrn: ").append(toIndentedString(clusterCrn)).append("\n");
    sb.append("    serviceStatuses: ").append(toIndentedString(serviceStatuses)).append("\n");
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

