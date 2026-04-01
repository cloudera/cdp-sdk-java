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

package com.cloudera.cdp.datacatalog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Details of an asset to be included in the Data Share.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-31T14:25:30.688-07:00")
public class AssetRequest  {

  /**
   * The name of the database containing the asset.
   **/
  private String databaseName = null;

  /**
   * The name of the table containing the asset.
   **/
  private String tableName = null;

  /**
   * The unique identifier of the asset (asset guid from the Atlas).
   **/
  private String guid = null;

  /**
   * List of columns in the asset (default all is included).
   **/
  private List<String> columns = new ArrayList<String>();

  /**
   * Getter for databaseName.
   * The name of the database containing the asset.
   **/
  @JsonProperty("databaseName")
  public String getDatabaseName() {
    return databaseName;
  }

  /**
   * Setter for databaseName.
   * The name of the database containing the asset.
   **/
  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }

  /**
   * Getter for tableName.
   * The name of the table containing the asset.
   **/
  @JsonProperty("tableName")
  public String getTableName() {
    return tableName;
  }

  /**
   * Setter for tableName.
   * The name of the table containing the asset.
   **/
  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  /**
   * Getter for guid.
   * The unique identifier of the asset (asset guid from the Atlas).
   **/
  @JsonProperty("guid")
  public String getGuid() {
    return guid;
  }

  /**
   * Setter for guid.
   * The unique identifier of the asset (asset guid from the Atlas).
   **/
  public void setGuid(String guid) {
    this.guid = guid;
  }

  /**
   * Getter for columns.
   * List of columns in the asset (default all is included).
   **/
  @JsonProperty("columns")
  public List<String> getColumns() {
    return columns;
  }

  /**
   * Setter for columns.
   * List of columns in the asset (default all is included).
   **/
  public void setColumns(List<String> columns) {
    this.columns = columns;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetRequest assetRequest = (AssetRequest) o;
    if (!Objects.equals(this.databaseName, assetRequest.databaseName)) {
      return false;
    }
    if (!Objects.equals(this.tableName, assetRequest.tableName)) {
      return false;
    }
    if (!Objects.equals(this.guid, assetRequest.guid)) {
      return false;
    }
    if (!Objects.equals(this.columns, assetRequest.columns)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseName, tableName, guid, columns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetRequest {\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
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

