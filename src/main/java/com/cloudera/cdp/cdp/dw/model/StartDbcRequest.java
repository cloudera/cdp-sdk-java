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
 * Request object for the restartDbc method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-15T17:00:44.787-07:00")
public class StartDbcRequest  {

  /**
   * The ID of the Database Catalog's cluster.
   **/
  private String clusterId = null;

  /**
   * The ID of the Database Catalog to restart.
   **/
  private String dbcId = null;

  /**
   * Enforce refreshing configurations.
   **/
  private Boolean forceRefresh = null;

  /**
   * Getter for clusterId.
   * The ID of the Database Catalog&#39;s cluster.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * The ID of the Database Catalog&#39;s cluster.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for dbcId.
   * The ID of the Database Catalog to restart.
   **/
  @JsonProperty("dbcId")
  public String getDbcId() {
    return dbcId;
  }

  /**
   * Setter for dbcId.
   * The ID of the Database Catalog to restart.
   **/
  public void setDbcId(String dbcId) {
    this.dbcId = dbcId;
  }

  /**
   * Getter for forceRefresh.
   * Enforce refreshing configurations.
   **/
  @JsonProperty("forceRefresh")
  public Boolean getForceRefresh() {
    return forceRefresh;
  }

  /**
   * Setter for forceRefresh.
   * Enforce refreshing configurations.
   **/
  public void setForceRefresh(Boolean forceRefresh) {
    this.forceRefresh = forceRefresh;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartDbcRequest startDbcRequest = (StartDbcRequest) o;
    if (!Objects.equals(this.clusterId, startDbcRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.dbcId, startDbcRequest.dbcId)) {
      return false;
    }
    if (!Objects.equals(this.forceRefresh, startDbcRequest.forceRefresh)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, dbcId, forceRefresh);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartDbcRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    dbcId: ").append(toIndentedString(dbcId)).append("\n");
    sb.append("    forceRefresh: ").append(toIndentedString(forceRefresh)).append("\n");
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

