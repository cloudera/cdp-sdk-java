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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.time.ZonedDateTime;

/**
 * Backup metadata response object for the workbench summary.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-28T14:00:27.700-07:00")
public class BackupMetadata  {

  /**
   * The backup vault name.
   **/
  private String backupVaultName = null;

  /**
   * The time when the last successful backup was taken.
   **/
  private ZonedDateTime lastSuccessfulBackupTime = null;

  /**
   * Whether successful backups are available for the workbench.
   **/
  private Boolean isSuccessfulBackupAvailable = null;

  /**
   * The status of the last backup initiated.
   **/
  private String lastBackupStatus = null;

  /**
   * The number of backups available.
   **/
  private Long numberOfAvailableBackups = null;

  /**
   * Getter for backupVaultName.
   * The backup vault name.
   **/
  @JsonProperty("backupVaultName")
  public String getBackupVaultName() {
    return backupVaultName;
  }

  /**
   * Setter for backupVaultName.
   * The backup vault name.
   **/
  public void setBackupVaultName(String backupVaultName) {
    this.backupVaultName = backupVaultName;
  }

  /**
   * Getter for lastSuccessfulBackupTime.
   * The time when the last successful backup was taken.
   **/
  @JsonProperty("lastSuccessfulBackupTime")
  public ZonedDateTime getLastSuccessfulBackupTime() {
    return lastSuccessfulBackupTime;
  }

  /**
   * Setter for lastSuccessfulBackupTime.
   * The time when the last successful backup was taken.
   **/
  public void setLastSuccessfulBackupTime(ZonedDateTime lastSuccessfulBackupTime) {
    this.lastSuccessfulBackupTime = lastSuccessfulBackupTime;
  }

  /**
   * Getter for isSuccessfulBackupAvailable.
   * Whether successful backups are available for the workbench.
   **/
  @JsonProperty("isSuccessfulBackupAvailable")
  public Boolean getIsSuccessfulBackupAvailable() {
    return isSuccessfulBackupAvailable;
  }

  /**
   * Setter for isSuccessfulBackupAvailable.
   * Whether successful backups are available for the workbench.
   **/
  public void setIsSuccessfulBackupAvailable(Boolean isSuccessfulBackupAvailable) {
    this.isSuccessfulBackupAvailable = isSuccessfulBackupAvailable;
  }

  /**
   * Getter for lastBackupStatus.
   * The status of the last backup initiated.
   **/
  @JsonProperty("lastBackupStatus")
  public String getLastBackupStatus() {
    return lastBackupStatus;
  }

  /**
   * Setter for lastBackupStatus.
   * The status of the last backup initiated.
   **/
  public void setLastBackupStatus(String lastBackupStatus) {
    this.lastBackupStatus = lastBackupStatus;
  }

  /**
   * Getter for numberOfAvailableBackups.
   * The number of backups available.
   **/
  @JsonProperty("numberOfAvailableBackups")
  public Long getNumberOfAvailableBackups() {
    return numberOfAvailableBackups;
  }

  /**
   * Setter for numberOfAvailableBackups.
   * The number of backups available.
   **/
  public void setNumberOfAvailableBackups(Long numberOfAvailableBackups) {
    this.numberOfAvailableBackups = numberOfAvailableBackups;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupMetadata backupMetadata = (BackupMetadata) o;
    if (!Objects.equals(this.backupVaultName, backupMetadata.backupVaultName)) {
      return false;
    }
    if (!Objects.equals(this.lastSuccessfulBackupTime, backupMetadata.lastSuccessfulBackupTime)) {
      return false;
    }
    if (!Objects.equals(this.isSuccessfulBackupAvailable, backupMetadata.isSuccessfulBackupAvailable)) {
      return false;
    }
    if (!Objects.equals(this.lastBackupStatus, backupMetadata.lastBackupStatus)) {
      return false;
    }
    if (!Objects.equals(this.numberOfAvailableBackups, backupMetadata.numberOfAvailableBackups)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupVaultName, lastSuccessfulBackupTime, isSuccessfulBackupAvailable, lastBackupStatus, numberOfAvailableBackups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupMetadata {\n");
    sb.append("    backupVaultName: ").append(toIndentedString(backupVaultName)).append("\n");
    sb.append("    lastSuccessfulBackupTime: ").append(toIndentedString(lastSuccessfulBackupTime)).append("\n");
    sb.append("    isSuccessfulBackupAvailable: ").append(toIndentedString(isSuccessfulBackupAvailable)).append("\n");
    sb.append("    lastBackupStatus: ").append(toIndentedString(lastBackupStatus)).append("\n");
    sb.append("    numberOfAvailableBackups: ").append(toIndentedString(numberOfAvailableBackups)).append("\n");
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

