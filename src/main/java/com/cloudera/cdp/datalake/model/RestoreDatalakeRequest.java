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
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2020-10-28T12:30:08.723-07:00")
public class RestoreDatalakeRequest  {

  /**
   * The name of the datalake to be restored. When backupId is not provided, the most recent successful backup on datalake with the provided name would be used.
   **/
  private String datalakeName = null;

  /**
   * The ID of the backup to be used to perform a restore. The ID could refer to backup of any datalake in the same account. This is the only way to restore from a backup that was taken on a datalake with a different name.
   **/
  private String backupId = null;

  /**
   * The name of the backup. When provided, the restore will be performed using the latest successful backup whose name matches the parameter, and that was taken from the datalake that is being restored.
   **/
  private String backupName = null;

  /**
   * Restore the database backing HMS/Ranger services. If this option is not provided, the HMS/Ranger services are restored by default.
   **/
  private Boolean includeDatabase = null;

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
   * The ID of the backup to be used to perform a restore. The ID could refer to backup of any datalake in the same account. This is the only way to restore from a backup that was taken on a datalake with a different name.
   **/
  @JsonProperty("backupId")
  public String getBackupId() {
    return backupId;
  }

  /**
   * Setter for backupId.
   * The ID of the backup to be used to perform a restore. The ID could refer to backup of any datalake in the same account. This is the only way to restore from a backup that was taken on a datalake with a different name.
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
   * Restore the database backing HMS/Ranger services. If this option is not provided, the HMS/Ranger services are restored by default.
   **/
  @JsonProperty("includeDatabase")
  public Boolean getIncludeDatabase() {
    return includeDatabase;
  }

  /**
   * Setter for includeDatabase.
   * Restore the database backing HMS/Ranger services. If this option is not provided, the HMS/Ranger services are restored by default.
   **/
  public void setIncludeDatabase(Boolean includeDatabase) {
    this.includeDatabase = includeDatabase;
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
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeName, backupId, backupName, includeDatabase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestoreDatalakeRequest {\n");
    sb.append("    datalakeName: ").append(toIndentedString(datalakeName)).append("\n");
    sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
    sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
    sb.append("    includeDatabase: ").append(toIndentedString(includeDatabase)).append("\n");
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

