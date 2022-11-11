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
import com.cloudera.cdp.datalake.model.BackupRestoreOperationStatus;

/**
 * The state of the database backup/restore operation.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-11-10T17:48:32.277-08:00")
public class DatabaseBackupRestoreState  {

  /**
   * The status of the database backup/restore.
   **/
  private BackupRestoreOperationStatus database = null;

  /**
   * Getter for database.
   * The status of the database backup/restore.
   **/
  @JsonProperty("database")
  public BackupRestoreOperationStatus getDatabase() {
    return database;
  }

  /**
   * Setter for database.
   * The status of the database backup/restore.
   **/
  public void setDatabase(BackupRestoreOperationStatus database) {
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
    DatabaseBackupRestoreState databaseBackupRestoreState = (DatabaseBackupRestoreState) o;
    if (!Objects.equals(this.database, databaseBackupRestoreState.database)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(database);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseBackupRestoreState {\n");
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

