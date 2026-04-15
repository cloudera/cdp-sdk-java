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
import java.time.ZonedDateTime;
import java.util.*;

/**
 * Details of an asset to be included in the Data Share.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-04-15T08:44:50.980-07:00")
public class AssetResponse extends CdpResponse {

  /**
   * The unique identifier of the resource.
   **/
  private String resourceId = null;

  /**
   * The unique identifier of the asset (asset guid from the Atlas).
   **/
  private String guid = null;

  /**
   * The date and time when the asset was created.
   **/
  private ZonedDateTime createTime = null;

  /**
   * The user who created the asset.
   **/
  private String createdBy = null;

  /**
   * The date and time when the asset was last updated.
   **/
  private ZonedDateTime updateTime = null;

  /**
   * The user who last updated the asset.
   **/
  private String updatedBy = null;

  /**
   * The name of the database containing the asset.
   **/
  private String databaseName = null;

  /**
   * The name of the table containing the asset.
   **/
  private String tableName = null;

  /**
   * List of columns in the asset (default all is included).
   **/
  private List<String> columns = new ArrayList<String>();

  /**
   * Getter for resourceId.
   * The unique identifier of the resource.
   **/
  @JsonProperty("resourceId")
  public String getResourceId() {
    return resourceId;
  }

  /**
   * Setter for resourceId.
   * The unique identifier of the resource.
   **/
  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
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
   * Getter for createTime.
   * The date and time when the asset was created.
   **/
  @JsonProperty("createTime")
  public ZonedDateTime getCreateTime() {
    return createTime;
  }

  /**
   * Setter for createTime.
   * The date and time when the asset was created.
   **/
  public void setCreateTime(ZonedDateTime createTime) {
    this.createTime = createTime;
  }

  /**
   * Getter for createdBy.
   * The user who created the asset.
   **/
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Setter for createdBy.
   * The user who created the asset.
   **/
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * Getter for updateTime.
   * The date and time when the asset was last updated.
   **/
  @JsonProperty("updateTime")
  public ZonedDateTime getUpdateTime() {
    return updateTime;
  }

  /**
   * Setter for updateTime.
   * The date and time when the asset was last updated.
   **/
  public void setUpdateTime(ZonedDateTime updateTime) {
    this.updateTime = updateTime;
  }

  /**
   * Getter for updatedBy.
   * The user who last updated the asset.
   **/
  @JsonProperty("updatedBy")
  public String getUpdatedBy() {
    return updatedBy;
  }

  /**
   * Setter for updatedBy.
   * The user who last updated the asset.
   **/
  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

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
    AssetResponse assetResponse = (AssetResponse) o;
    if (!Objects.equals(this.resourceId, assetResponse.resourceId)) {
      return false;
    }
    if (!Objects.equals(this.guid, assetResponse.guid)) {
      return false;
    }
    if (!Objects.equals(this.createTime, assetResponse.createTime)) {
      return false;
    }
    if (!Objects.equals(this.createdBy, assetResponse.createdBy)) {
      return false;
    }
    if (!Objects.equals(this.updateTime, assetResponse.updateTime)) {
      return false;
    }
    if (!Objects.equals(this.updatedBy, assetResponse.updatedBy)) {
      return false;
    }
    if (!Objects.equals(this.databaseName, assetResponse.databaseName)) {
      return false;
    }
    if (!Objects.equals(this.tableName, assetResponse.tableName)) {
      return false;
    }
    if (!Objects.equals(this.columns, assetResponse.columns)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, guid, createTime, createdBy, updateTime, updatedBy, databaseName, tableName, columns, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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

