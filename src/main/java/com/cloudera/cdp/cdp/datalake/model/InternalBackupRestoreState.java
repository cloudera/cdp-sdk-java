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

package com.cloudera.cdp.datalake.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datalake.model.AdminOperationsBackupRestoreState;
import com.cloudera.cdp.datalake.model.DatabaseBackupRestoreState;
import com.cloudera.cdp.datalake.model.HbaseBackupRestoreState;
import com.cloudera.cdp.datalake.model.SolrBackupRestoreState;

/**
 * Object representing the state of each service running a backup.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-04-30T10:56:33.904-07:00")
public class InternalBackupRestoreState  {

  /**
   * Admin operations executed via Cloudera Manager for starting and stopping services.
   **/
  private AdminOperationsBackupRestoreState adminOperations = null;

  /**
   * Hbase operations to backup or restore Atlas metadata tables.
   **/
  private HbaseBackupRestoreState hbase = null;

  /**
   * Solr operations to backup up the edge, fulltext, ranger_audit, and vertex tables, or to delete/restore those tables.
   **/
  private SolrBackupRestoreState solr = null;

  /**
   * Postgres operations to backup or restore the data lake metadata.
   **/
  private DatabaseBackupRestoreState database = null;

  /**
   * Getter for adminOperations.
   * Admin operations executed via Cloudera Manager for starting and stopping services.
   **/
  @JsonProperty("adminOperations")
  public AdminOperationsBackupRestoreState getAdminOperations() {
    return adminOperations;
  }

  /**
   * Setter for adminOperations.
   * Admin operations executed via Cloudera Manager for starting and stopping services.
   **/
  public void setAdminOperations(AdminOperationsBackupRestoreState adminOperations) {
    this.adminOperations = adminOperations;
  }

  /**
   * Getter for hbase.
   * Hbase operations to backup or restore Atlas metadata tables.
   **/
  @JsonProperty("hbase")
  public HbaseBackupRestoreState getHbase() {
    return hbase;
  }

  /**
   * Setter for hbase.
   * Hbase operations to backup or restore Atlas metadata tables.
   **/
  public void setHbase(HbaseBackupRestoreState hbase) {
    this.hbase = hbase;
  }

  /**
   * Getter for solr.
   * Solr operations to backup up the edge, fulltext, ranger_audit, and vertex tables, or to delete/restore those tables.
   **/
  @JsonProperty("solr")
  public SolrBackupRestoreState getSolr() {
    return solr;
  }

  /**
   * Setter for solr.
   * Solr operations to backup up the edge, fulltext, ranger_audit, and vertex tables, or to delete/restore those tables.
   **/
  public void setSolr(SolrBackupRestoreState solr) {
    this.solr = solr;
  }

  /**
   * Getter for database.
   * Postgres operations to backup or restore the data lake metadata.
   **/
  @JsonProperty("database")
  public DatabaseBackupRestoreState getDatabase() {
    return database;
  }

  /**
   * Setter for database.
   * Postgres operations to backup or restore the data lake metadata.
   **/
  public void setDatabase(DatabaseBackupRestoreState database) {
    this.database = database;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalBackupRestoreState internalBackupRestoreState = (InternalBackupRestoreState) o;
    if (!Objects.equals(this.adminOperations, internalBackupRestoreState.adminOperations)) {
      return false;
    }
    if (!Objects.equals(this.hbase, internalBackupRestoreState.hbase)) {
      return false;
    }
    if (!Objects.equals(this.solr, internalBackupRestoreState.solr)) {
      return false;
    }
    if (!Objects.equals(this.database, internalBackupRestoreState.database)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminOperations, hbase, solr, database);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalBackupRestoreState {\n");
    sb.append("    adminOperations: ").append(toIndentedString(adminOperations)).append("\n");
    sb.append("    hbase: ").append(toIndentedString(hbase)).append("\n");
    sb.append("    solr: ").append(toIndentedString(solr)).append("\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
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

