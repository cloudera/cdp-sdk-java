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
import com.cloudera.cdp.dw.model.ServiceConfigReq;

/**
 * Request object for the updateDbc method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-11-10T17:48:31.643-08:00")
public class UpdateDbcRequest  {

  /**
   * ID of the Database Catalog's cluster.
   **/
  private String clusterId = null;

  /**
   * ID of the Database Catalog.
   **/
  private String dbcId = null;

  /**
   * The service configuration to update the DBC with. This will be applied on top of the existing configuration so there's no need to list configurations that stay the same.
   **/
  private ServiceConfigReq config = null;

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
   * Getter for config.
   * The service configuration to update the DBC with. This will be applied on top of the existing configuration so there&#39;s no need to list configurations that stay the same.
   **/
  @JsonProperty("config")
  public ServiceConfigReq getConfig() {
    return config;
  }

  /**
   * Setter for config.
   * The service configuration to update the DBC with. This will be applied on top of the existing configuration so there&#39;s no need to list configurations that stay the same.
   **/
  public void setConfig(ServiceConfigReq config) {
    this.config = config;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDbcRequest updateDbcRequest = (UpdateDbcRequest) o;
    if (!Objects.equals(this.clusterId, updateDbcRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.dbcId, updateDbcRequest.dbcId)) {
      return false;
    }
    if (!Objects.equals(this.config, updateDbcRequest.config)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, dbcId, config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDbcRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    dbcId: ").append(toIndentedString(dbcId)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

