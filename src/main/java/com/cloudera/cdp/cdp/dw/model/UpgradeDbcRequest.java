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
 * Request object for the upgradeDbc method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-05-16T09:57:44.653-07:00")
public class UpgradeDbcRequest  {

  /**
   * The ID of the Database Catalog's cluster.
   **/
  private String clusterId = null;

  /**
   * The ID of the Database Catalog.
   **/
  private String dbcId = null;

  /**
   * The version to which the Database Catalog should be upgraded.
   **/
  private String imageVersion = null;

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
   * The ID of the Database Catalog.
   **/
  @JsonProperty("dbcId")
  public String getDbcId() {
    return dbcId;
  }

  /**
   * Setter for dbcId.
   * The ID of the Database Catalog.
   **/
  public void setDbcId(String dbcId) {
    this.dbcId = dbcId;
  }

  /**
   * Getter for imageVersion.
   * The version to which the Database Catalog should be upgraded.
   **/
  @JsonProperty("imageVersion")
  public String getImageVersion() {
    return imageVersion;
  }

  /**
   * Setter for imageVersion.
   * The version to which the Database Catalog should be upgraded.
   **/
  public void setImageVersion(String imageVersion) {
    this.imageVersion = imageVersion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeDbcRequest upgradeDbcRequest = (UpgradeDbcRequest) o;
    if (!Objects.equals(this.clusterId, upgradeDbcRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.dbcId, upgradeDbcRequest.dbcId)) {
      return false;
    }
    if (!Objects.equals(this.imageVersion, upgradeDbcRequest.imageVersion)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, dbcId, imageVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeDbcRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    dbcId: ").append(toIndentedString(dbcId)).append("\n");
    sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
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

