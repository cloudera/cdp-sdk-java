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
 * Request object for the rebuildDbc method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-02-10T14:31:14.380-08:00")
public class RebuildDbcRequest  {

  /**
   * ID of the Database Catalog's cluster.
   **/
  private String clusterId = null;

  /**
   * ID of the Database Catalog to rebuild.
   **/
  private String dbcId = null;

  /**
   * true - keep the current image version. false - set to latest image version when rebuilding the Database Catalog. If not provided, the latest image version will be set.
   **/
  private Boolean keepImageVersion = null;

  /**
   * Getter for clusterId.
   * ID of the Database Catalog&#39;s cluster.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * ID of the Database Catalog&#39;s cluster.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for dbcId.
   * ID of the Database Catalog to rebuild.
   **/
  @JsonProperty("dbcId")
  public String getDbcId() {
    return dbcId;
  }

  /**
   * Setter for dbcId.
   * ID of the Database Catalog to rebuild.
   **/
  public void setDbcId(String dbcId) {
    this.dbcId = dbcId;
  }

  /**
   * Getter for keepImageVersion.
   * true - keep the current image version. false - set to latest image version when rebuilding the Database Catalog. If not provided, the latest image version will be set.
   **/
  @JsonProperty("keepImageVersion")
  public Boolean getKeepImageVersion() {
    return keepImageVersion;
  }

  /**
   * Setter for keepImageVersion.
   * true - keep the current image version. false - set to latest image version when rebuilding the Database Catalog. If not provided, the latest image version will be set.
   **/
  public void setKeepImageVersion(Boolean keepImageVersion) {
    this.keepImageVersion = keepImageVersion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RebuildDbcRequest rebuildDbcRequest = (RebuildDbcRequest) o;
    if (!Objects.equals(this.clusterId, rebuildDbcRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.dbcId, rebuildDbcRequest.dbcId)) {
      return false;
    }
    if (!Objects.equals(this.keepImageVersion, rebuildDbcRequest.keepImageVersion)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, dbcId, keepImageVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RebuildDbcRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    dbcId: ").append(toIndentedString(dbcId)).append("\n");
    sb.append("    keepImageVersion: ").append(toIndentedString(keepImageVersion)).append("\n");
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

