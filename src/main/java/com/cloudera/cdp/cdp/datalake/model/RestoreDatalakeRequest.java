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

/**
 * Request to restore datalake from backup. Restore does not restore the database by default.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-10-05T12:07:35.674-07:00")
public class RestoreDatalakeRequest  {

  /**
   * The name of the datalake to be restored. When backupId is not provided, the most recent successful backup on datalake with the provided name would be used.
   **/
  private String datalakeName = null;

  /**
   * The ID of the backup to be used to perform a restore. The ID could refer to backup of any datalake in the same account. This is the only way to restore from a backup that was taken on a datalake with a different name. This field is required if the --backup-location-override field is used.
   **/
  private String backupId = null;

  /**
   * The name of the backup. When provided, the restore will be performed using the latest successful backup whose name matches the parameter, and that was taken from the datalake that is being restored.
   **/
  private String backupName = null;

  /**
   * DEPRECATED - The database is included in the restore by default. To skip it, use the --skip-database flag.
   **/
  private Boolean includeDatabase = null;

  /**
   * Skips the restore of the databases backing HMS/Ranger services. If this option is not provided, then by default the Atlas lineage will be restored if the backup used includes the Atlas lineage information.
   **/
  private Boolean skipRangerHmsMetadata = null;

  /**
   * Skips the restore of the Atlas metadata. If this option is not provided, then by default the Atlas metadata will be restored if the backup used includes the Atlas metadata.
   **/
  private Boolean skipAtlasMetadata = null;

  /**
   * Skips the restore of the Ranger audits. If this option is not provided, then by default the Ranger audits will be restored if the backup used includes the Ranger audits.
   **/
  private Boolean skipRangerAudits = null;

  /**
   * Backup location. When provided, will be used to lookup the backup. If provided, the --backup-id parameter is required.
   **/
  private String backupLocationOverride = null;

  /**
   * Getter for datalakeName.
   * The name of the datalake to be restored. When backupId is not provided, the most recent successful backup on datalake with the provided name would be used.
   **/
  @JsonProperty("datalakeName")
  public String getDatalakeName() {
    return datalakeName;
  }

  /**
   * Setter for datalakeName.
   * The name of the datalake to be restored. When backupId is not provided, the most recent successful backup on datalake with the provided name would be used.
   **/
  public void setDatalakeName(String datalakeName) {
    this.datalakeName = datalakeName;
  }

  /**
   * Getter for backupId.
   * The ID of the backup to be used to perform a restore. The ID could refer to backup of any datalake in the same account. This is the only way to restore from a backup that was taken on a datalake with a different name. This field is required if the --backup-location-override field is used.
   **/
  @JsonProperty("backupId")
  public String getBackupId() {
    return backupId;
  }

  /**
   * Setter for backupId.
   * The ID of the backup to be used to perform a restore. The ID could refer to backup of any datalake in the same account. This is the only way to restore from a backup that was taken on a datalake with a different name. This field is required if the --backup-location-override field is used.
   **/
  public void setBackupId(String backupId) {
    this.backupId = backupId;
  }

  /**
   * Getter for backupName.
   * The name of the backup. When provided, the restore will be performed using the latest successful backup whose name matches the parameter, and that was taken from the datalake that is being restored.
   **/
  @JsonProperty("backupName")
  public String getBackupName() {
    return backupName;
  }

  /**
   * Setter for backupName.
   * The name of the backup. When provided, the restore will be performed using the latest successful backup whose name matches the parameter, and that was taken from the datalake that is being restored.
   **/
  public void setBackupName(String backupName) {
    this.backupName = backupName;
  }

  /**
   * Getter for includeDatabase.
   * DEPRECATED - The database is included in the restore by default. To skip it, use the --skip-database flag.
   **/
  @JsonProperty("includeDatabase")
  public Boolean getIncludeDatabase() {
    return includeDatabase;
  }

  /**
   * Setter for includeDatabase.
   * DEPRECATED - The database is included in the restore by default. To skip it, use the --skip-database flag.
   **/
  public void setIncludeDatabase(Boolean includeDatabase) {
    this.includeDatabase = includeDatabase;
  }

  /**
   * Getter for skipRangerHmsMetadata.
   * Skips the restore of the databases backing HMS/Ranger services. If this option is not provided, then by default the Atlas lineage will be restored if the backup used includes the Atlas lineage information.
   **/
  @JsonProperty("skipRangerHmsMetadata")
  public Boolean getSkipRangerHmsMetadata() {
    return skipRangerHmsMetadata;
  }

  /**
   * Setter for skipRangerHmsMetadata.
   * Skips the restore of the databases backing HMS/Ranger services. If this option is not provided, then by default the Atlas lineage will be restored if the backup used includes the Atlas lineage information.
   **/
  public void setSkipRangerHmsMetadata(Boolean skipRangerHmsMetadata) {
    this.skipRangerHmsMetadata = skipRangerHmsMetadata;
  }

  /**
   * Getter for skipAtlasMetadata.
   * Skips the restore of the Atlas metadata. If this option is not provided, then by default the Atlas metadata will be restored if the backup used includes the Atlas metadata.
   **/
  @JsonProperty("skipAtlasMetadata")
  public Boolean getSkipAtlasMetadata() {
    return skipAtlasMetadata;
  }

  /**
   * Setter for skipAtlasMetadata.
   * Skips the restore of the Atlas metadata. If this option is not provided, then by default the Atlas metadata will be restored if the backup used includes the Atlas metadata.
   **/
  public void setSkipAtlasMetadata(Boolean skipAtlasMetadata) {
    this.skipAtlasMetadata = skipAtlasMetadata;
  }

  /**
   * Getter for skipRangerAudits.
   * Skips the restore of the Ranger audits. If this option is not provided, then by default the Ranger audits will be restored if the backup used includes the Ranger audits.
   **/
  @JsonProperty("skipRangerAudits")
  public Boolean getSkipRangerAudits() {
    return skipRangerAudits;
  }

  /**
   * Setter for skipRangerAudits.
   * Skips the restore of the Ranger audits. If this option is not provided, then by default the Ranger audits will be restored if the backup used includes the Ranger audits.
   **/
  public void setSkipRangerAudits(Boolean skipRangerAudits) {
    this.skipRangerAudits = skipRangerAudits;
  }

  /**
   * Getter for backupLocationOverride.
   * Backup location. When provided, will be used to lookup the backup. If provided, the --backup-id parameter is required.
   **/
  @JsonProperty("backupLocationOverride")
  public String getBackupLocationOverride() {
    return backupLocationOverride;
  }

  /**
   * Setter for backupLocationOverride.
   * Backup location. When provided, will be used to lookup the backup. If provided, the --backup-id parameter is required.
   **/
  public void setBackupLocationOverride(String backupLocationOverride) {
    this.backupLocationOverride = backupLocationOverride;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestoreDatalakeRequest restoreDatalakeRequest = (RestoreDatalakeRequest) o;
    if (!Objects.equals(this.datalakeName, restoreDatalakeRequest.datalakeName)) {
      return false;
    }
    if (!Objects.equals(this.backupId, restoreDatalakeRequest.backupId)) {
      return false;
    }
    if (!Objects.equals(this.backupName, restoreDatalakeRequest.backupName)) {
      return false;
    }
    if (!Objects.equals(this.includeDatabase, restoreDatalakeRequest.includeDatabase)) {
      return false;
    }
    if (!Objects.equals(this.skipRangerHmsMetadata, restoreDatalakeRequest.skipRangerHmsMetadata)) {
      return false;
    }
    if (!Objects.equals(this.skipAtlasMetadata, restoreDatalakeRequest.skipAtlasMetadata)) {
      return false;
    }
    if (!Objects.equals(this.skipRangerAudits, restoreDatalakeRequest.skipRangerAudits)) {
      return false;
    }
    if (!Objects.equals(this.backupLocationOverride, restoreDatalakeRequest.backupLocationOverride)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeName, backupId, backupName, includeDatabase, skipRangerHmsMetadata, skipAtlasMetadata, skipRangerAudits, backupLocationOverride);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestoreDatalakeRequest {\n");
    sb.append("    datalakeName: ").append(toIndentedString(datalakeName)).append("\n");
    sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
    sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
    sb.append("    includeDatabase: ").append(toIndentedString(includeDatabase)).append("\n");
    sb.append("    skipRangerHmsMetadata: ").append(toIndentedString(skipRangerHmsMetadata)).append("\n");
    sb.append("    skipAtlasMetadata: ").append(toIndentedString(skipAtlasMetadata)).append("\n");
    sb.append("    skipRangerAudits: ").append(toIndentedString(skipRangerAudits)).append("\n");
    sb.append("    backupLocationOverride: ").append(toIndentedString(backupLocationOverride)).append("\n");
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

