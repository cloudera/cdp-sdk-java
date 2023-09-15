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
import com.cloudera.cdp.dw.model.ConfigBlock;
import java.util.*;

/**
 * Request object for the updateDbcConfig method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-09-14T10:47:17.249-07:00")
public class UpdateDbcConfigRequest  {

  /**
   * ID of the cluster.
   **/
  private String clusterId = null;

  /**
   * ID of the Database Catalog.
   **/
  private String dbcId = null;

  /**
   * Database Catalog configuration component to update.
   **/
  private String component = null;

  /**
   * Configuration files of the selected component to update.
   **/
  private List<ConfigBlock> set = new ArrayList<ConfigBlock>();

  /**
   * Getter for clusterId.
   * ID of the cluster.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * ID of the cluster.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for dbcId.
   * ID of the Database Catalog.
   **/
  @JsonProperty("dbcId")
  public String getDbcId() {
    return dbcId;
  }

  /**
   * Setter for dbcId.
   * ID of the Database Catalog.
   **/
  public void setDbcId(String dbcId) {
    this.dbcId = dbcId;
  }

  /**
   * Getter for component.
   * Database Catalog configuration component to update.
   **/
  @JsonProperty("component")
  public String getComponent() {
    return component;
  }

  /**
   * Setter for component.
   * Database Catalog configuration component to update.
   **/
  public void setComponent(String component) {
    this.component = component;
  }

  /**
   * Getter for set.
   * Configuration files of the selected component to update.
   **/
  @JsonProperty("set")
  public List<ConfigBlock> getSet() {
    return set;
  }

  /**
   * Setter for set.
   * Configuration files of the selected component to update.
   **/
  public void setSet(List<ConfigBlock> set) {
    this.set = set;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDbcConfigRequest updateDbcConfigRequest = (UpdateDbcConfigRequest) o;
    if (!Objects.equals(this.clusterId, updateDbcConfigRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.dbcId, updateDbcConfigRequest.dbcId)) {
      return false;
    }
    if (!Objects.equals(this.component, updateDbcConfigRequest.component)) {
      return false;
    }
    if (!Objects.equals(this.set, updateDbcConfigRequest.set)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, dbcId, component, set);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDbcConfigRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    dbcId: ").append(toIndentedString(dbcId)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    set: ").append(toIndentedString(set)).append("\n");
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

