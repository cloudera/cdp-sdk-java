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
 * Filter object for Virtual Warehouses.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-29T08:54:18.456-07:00")
public class VwFilter  {

  /**
   * Virtual Warehouse type.
   **/
  private String vwType = null;

  /**
   * Filter Virtual Warehouses by Database Catalog Id.
   **/
  private String dbcId = null;

  /**
   * Filter Virtual Warehouses whether it is a Compactor or not.
   **/
  private Boolean compactor = null;

  /**
   * Filter the Virtual Warehouses based on whether it has Data Visualisation.
   **/
  private Boolean viz = null;

  /**
   * Getter for vwType.
   * Virtual Warehouse type.
   **/
  @JsonProperty("vwType")
  public String getVwType() {
    return vwType;
  }

  /**
   * Setter for vwType.
   * Virtual Warehouse type.
   **/
  public void setVwType(String vwType) {
    this.vwType = vwType;
  }

  /**
   * Getter for dbcId.
   * Filter Virtual Warehouses by Database Catalog Id.
   **/
  @JsonProperty("dbcId")
  public String getDbcId() {
    return dbcId;
  }

  /**
   * Setter for dbcId.
   * Filter Virtual Warehouses by Database Catalog Id.
   **/
  public void setDbcId(String dbcId) {
    this.dbcId = dbcId;
  }

  /**
   * Getter for compactor.
   * Filter Virtual Warehouses whether it is a Compactor or not.
   **/
  @JsonProperty("compactor")
  public Boolean getCompactor() {
    return compactor;
  }

  /**
   * Setter for compactor.
   * Filter Virtual Warehouses whether it is a Compactor or not.
   **/
  public void setCompactor(Boolean compactor) {
    this.compactor = compactor;
  }

  /**
   * Getter for viz.
   * Filter the Virtual Warehouses based on whether it has Data Visualisation.
   **/
  @JsonProperty("viz")
  public Boolean getViz() {
    return viz;
  }

  /**
   * Setter for viz.
   * Filter the Virtual Warehouses based on whether it has Data Visualisation.
   **/
  public void setViz(Boolean viz) {
    this.viz = viz;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VwFilter vwFilter = (VwFilter) o;
    if (!Objects.equals(this.vwType, vwFilter.vwType)) {
      return false;
    }
    if (!Objects.equals(this.dbcId, vwFilter.dbcId)) {
      return false;
    }
    if (!Objects.equals(this.compactor, vwFilter.compactor)) {
      return false;
    }
    if (!Objects.equals(this.viz, vwFilter.viz)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(vwType, dbcId, compactor, viz);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VwFilter {\n");
    sb.append("    vwType: ").append(toIndentedString(vwType)).append("\n");
    sb.append("    dbcId: ").append(toIndentedString(dbcId)).append("\n");
    sb.append("    compactor: ").append(toIndentedString(compactor)).append("\n");
    sb.append("    viz: ").append(toIndentedString(viz)).append("\n");
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

