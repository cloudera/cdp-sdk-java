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
 * The state of each HBase backup/restore operation.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:42.225-07:00")
public class HbaseBackupRestoreState  {

  /**
   * The status of the ATLAS_ENTITY_AUDIT_EVENTS_TABLE backup/restore.
   **/
  private BackupRestoreOperationStatus atlasEntityAuditEventTable = null;

  /**
   * The status of the ATLAS_JANUS_TABLE backup/restore.
   **/
  private BackupRestoreOperationStatus atlasJanusTable = null;

  /**
   * Getter for atlasEntityAuditEventTable.
   * The status of the ATLAS_ENTITY_AUDIT_EVENTS_TABLE backup/restore.
   **/
  @JsonProperty("atlasEntityAuditEventTable")
  public BackupRestoreOperationStatus getAtlasEntityAuditEventTable() {
    return atlasEntityAuditEventTable;
  }

  /**
   * Setter for atlasEntityAuditEventTable.
   * The status of the ATLAS_ENTITY_AUDIT_EVENTS_TABLE backup/restore.
   **/
  public void setAtlasEntityAuditEventTable(BackupRestoreOperationStatus atlasEntityAuditEventTable) {
    this.atlasEntityAuditEventTable = atlasEntityAuditEventTable;
  }

  /**
   * Getter for atlasJanusTable.
   * The status of the ATLAS_JANUS_TABLE backup/restore.
   **/
  @JsonProperty("atlasJanusTable")
  public BackupRestoreOperationStatus getAtlasJanusTable() {
    return atlasJanusTable;
  }

  /**
   * Setter for atlasJanusTable.
   * The status of the ATLAS_JANUS_TABLE backup/restore.
   **/
  public void setAtlasJanusTable(BackupRestoreOperationStatus atlasJanusTable) {
    this.atlasJanusTable = atlasJanusTable;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HbaseBackupRestoreState hbaseBackupRestoreState = (HbaseBackupRestoreState) o;
    if (!Objects.equals(this.atlasEntityAuditEventTable, hbaseBackupRestoreState.atlasEntityAuditEventTable)) {
      return false;
    }
    if (!Objects.equals(this.atlasJanusTable, hbaseBackupRestoreState.atlasJanusTable)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(atlasEntityAuditEventTable, atlasJanusTable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HbaseBackupRestoreState {\n");
    sb.append("    atlasEntityAuditEventTable: ").append(toIndentedString(atlasEntityAuditEventTable)).append("\n");
    sb.append("    atlasJanusTable: ").append(toIndentedString(atlasJanusTable)).append("\n");
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

