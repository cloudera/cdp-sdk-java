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

/**
 * Hive replication scope.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-14T11:34:38.989-07:00")
public class HiveDatabaseAndTables  {

  /**
   * Database to replicate.
   **/
  private String database = null;

  /**
   * Regex to match included tables.
   **/
  private String tablesIncludeRegex = null;

  /**
   * Regex to match excluded tables.
   **/
  private String tablesExcludeRegex = null;

  /**
   * Getter for database.
   * Database to replicate.
   **/
  @JsonProperty("database")
  public String getDatabase() {
    return database;
  }

  /**
   * Setter for database.
   * Database to replicate.
   **/
  public void setDatabase(String database) {
    this.database = database;
  }

  /**
   * Getter for tablesIncludeRegex.
   * Regex to match included tables.
   **/
  @JsonProperty("tablesIncludeRegex")
  public String getTablesIncludeRegex() {
    return tablesIncludeRegex;
  }

  /**
   * Setter for tablesIncludeRegex.
   * Regex to match included tables.
   **/
  public void setTablesIncludeRegex(String tablesIncludeRegex) {
    this.tablesIncludeRegex = tablesIncludeRegex;
  }

  /**
   * Getter for tablesExcludeRegex.
   * Regex to match excluded tables.
   **/
  @JsonProperty("tablesExcludeRegex")
  public String getTablesExcludeRegex() {
    return tablesExcludeRegex;
  }

  /**
   * Setter for tablesExcludeRegex.
   * Regex to match excluded tables.
   **/
  public void setTablesExcludeRegex(String tablesExcludeRegex) {
    this.tablesExcludeRegex = tablesExcludeRegex;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HiveDatabaseAndTables hiveDatabaseAndTables = (HiveDatabaseAndTables) o;
    if (!Objects.equals(this.database, hiveDatabaseAndTables.database)) {
      return false;
    }
    if (!Objects.equals(this.tablesIncludeRegex, hiveDatabaseAndTables.tablesIncludeRegex)) {
      return false;
    }
    if (!Objects.equals(this.tablesExcludeRegex, hiveDatabaseAndTables.tablesExcludeRegex)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(database, tablesIncludeRegex, tablesExcludeRegex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HiveDatabaseAndTables {\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    tablesIncludeRegex: ").append(toIndentedString(tablesIncludeRegex)).append("\n");
    sb.append("    tablesExcludeRegex: ").append(toIndentedString(tablesExcludeRegex)).append("\n");
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

