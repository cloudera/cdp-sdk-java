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
 * Request object for the updateVwConfig method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-06-01T14:27:20.055-07:00")
public class UpdateVwConfigRequest  {

  /**
   * ID of the cluster.
   **/
  private String clusterId = null;

  /**
   * ID of the Virtual Warehouse.
   **/
  private String vwId = null;

  /**
   * Configuration component to update. Hive components are [DasWebapp, Hiveserver2, QueryCoordinator, QueryExecutor, StandaloneQueryExecutor, TokenAuth, Hue]. Impala components are [Hue, ImpalaAutoscaler, ImpalaCatalogd, ImpalaCoordinator, ImpalaExecutor, ImpalaProxy, ImpalaStatestored, ImpalaTokenAuth].
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
   * Getter for vwId.
   * ID of the Virtual Warehouse.
   **/
  @JsonProperty("vwId")
  public String getVwId() {
    return vwId;
  }

  /**
   * Setter for vwId.
   * ID of the Virtual Warehouse.
   **/
  public void setVwId(String vwId) {
    this.vwId = vwId;
  }

  /**
   * Getter for component.
   * Configuration component to update. Hive components are [DasWebapp, Hiveserver2, QueryCoordinator, QueryExecutor, StandaloneQueryExecutor, TokenAuth, Hue]. Impala components are [Hue, ImpalaAutoscaler, ImpalaCatalogd, ImpalaCoordinator, ImpalaExecutor, ImpalaProxy, ImpalaStatestored, ImpalaTokenAuth].
   **/
  @JsonProperty("component")
  public String getComponent() {
    return component;
  }

  /**
   * Setter for component.
   * Configuration component to update. Hive components are [DasWebapp, Hiveserver2, QueryCoordinator, QueryExecutor, StandaloneQueryExecutor, TokenAuth, Hue]. Impala components are [Hue, ImpalaAutoscaler, ImpalaCatalogd, ImpalaCoordinator, ImpalaExecutor, ImpalaProxy, ImpalaStatestored, ImpalaTokenAuth].
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
    UpdateVwConfigRequest updateVwConfigRequest = (UpdateVwConfigRequest) o;
    if (!Objects.equals(this.clusterId, updateVwConfigRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.vwId, updateVwConfigRequest.vwId)) {
      return false;
    }
    if (!Objects.equals(this.component, updateVwConfigRequest.component)) {
      return false;
    }
    if (!Objects.equals(this.set, updateVwConfigRequest.set)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, vwId, component, set);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVwConfigRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    vwId: ").append(toIndentedString(vwId)).append("\n");
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

