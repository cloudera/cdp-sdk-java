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
 * Request object to perform a backup of datalake.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-11-10T17:48:32.277-08:00")
public class BackupDatalakeRequest  {

  /**
   * The name of the datalake.
   **/
  private String datalakeName = null;

  /**
   * Location where the back-up has to be stored. For example s3a://Location/of/the/backup.
   **/
  private String backupLocation = null;

  /**
   * The name of the backup.
   **/
  private String backupName = null;

  /**
   * Close the database connections while performing backup. Default is true.
   **/
  private Boolean closeDbConnections = true;

  /**
   * Skips the backup of the databases backing HMS/Ranger services. If this option is not provided, the HMS/Ranger services are backed up by default.
   **/
  private Boolean skipRangerHmsMetadata = null;

  /**
   * Skips the backup of the Atlas metadata. If this option is not provided, the Atlas metadata is backed up by default.
   **/
  private Boolean skipAtlasMetadata = null;

  /**
   * Skips the backup of the Ranger audits. If this option is not provided, Ranger audits are backed up by default.
   **/
  private Boolean skipRangerAudits = null;

  /**
   * Getter for datalakeName.
   * The name of the datalake.
   **/
  @JsonProperty("datalakeName")
  public String getDatalakeName() {
    return datalakeName;
  }

  /**
   * Setter for datalakeName.
   * The name of the datalake.
   **/
  public void setDatalakeName(String datalakeName) {
    this.datalakeName = datalakeName;
  }

  /**
   * Getter for backupLocation.
   * Location where the back-up has to be stored. For example s3a://Location/of/the/backup.
   **/
  @JsonProperty("backupLocation")
  public String getBackupLocation() {
    return backupLocation;
  }

  /**
   * Setter for backupLocation.
   * Location where the back-up has to be stored. For example s3a://Location/of/the/backup.
   **/
  public void setBackupLocation(String backupLocation) {
    this.backupLocation = backupLocation;
  }

  /**
   * Getter for backupName.
   * The name of the backup.
   **/
  @JsonProperty("backupName")
  public String getBackupName() {
    return backupName;
  }

  /**
   * Setter for backupName.
   * The name of the backup.
   **/
  public void setBackupName(String backupName) {
    this.backupName = backupName;
  }

  /**
   * Getter for closeDbConnections.
   * Close the database connections while performing backup. Default is true.
   **/
  @JsonProperty("closeDbConnections")
  public Boolean getCloseDbConnections() {
    return closeDbConnections;
  }

  /**
   * Setter for closeDbConnections.
   * Close the database connections while performing backup. Default is true.
   **/
  public void setCloseDbConnections(Boolean closeDbConnections) {
    this.closeDbConnections = closeDbConnections;
  }

  /**
   * Getter for skipRangerHmsMetadata.
   * Skips the backup of the databases backing HMS/Ranger services. If this option is not provided, the HMS/Ranger services are backed up by default.
   **/
  @JsonProperty("skipRangerHmsMetadata")
  public Boolean getSkipRangerHmsMetadata() {
    return skipRangerHmsMetadata;
  }

  /**
   * Setter for skipRangerHmsMetadata.
   * Skips the backup of the databases backing HMS/Ranger services. If this option is not provided, the HMS/Ranger services are backed up by default.
   **/
  public void setSkipRangerHmsMetadata(Boolean skipRangerHmsMetadata) {
    this.skipRangerHmsMetadata = skipRangerHmsMetadata;
  }

  /**
   * Getter for skipAtlasMetadata.
   * Skips the backup of the Atlas metadata. If this option is not provided, the Atlas metadata is backed up by default.
   **/
  @JsonProperty("skipAtlasMetadata")
  public Boolean getSkipAtlasMetadata() {
    return skipAtlasMetadata;
  }

  /**
   * Setter for skipAtlasMetadata.
   * Skips the backup of the Atlas metadata. If this option is not provided, the Atlas metadata is backed up by default.
   **/
  public void setSkipAtlasMetadata(Boolean skipAtlasMetadata) {
    this.skipAtlasMetadata = skipAtlasMetadata;
  }

  /**
   * Getter for skipRangerAudits.
   * Skips the backup of the Ranger audits. If this option is not provided, Ranger audits are backed up by default.
   **/
  @JsonProperty("skipRangerAudits")
  public Boolean getSkipRangerAudits() {
    return skipRangerAudits;
  }

  /**
   * Setter for skipRangerAudits.
   * Skips the backup of the Ranger audits. If this option is not provided, Ranger audits are backed up by default.
   **/
  public void setSkipRangerAudits(Boolean skipRangerAudits) {
    this.skipRangerAudits = skipRangerAudits;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupDatalakeRequest backupDatalakeRequest = (BackupDatalakeRequest) o;
    if (!Objects.equals(this.datalakeName, backupDatalakeRequest.datalakeName)) {
      return false;
    }
    if (!Objects.equals(this.backupLocation, backupDatalakeRequest.backupLocation)) {
      return false;
    }
    if (!Objects.equals(this.backupName, backupDatalakeRequest.backupName)) {
      return false;
    }
    if (!Objects.equals(this.closeDbConnections, backupDatalakeRequest.closeDbConnections)) {
      return false;
    }
    if (!Objects.equals(this.skipRangerHmsMetadata, backupDatalakeRequest.skipRangerHmsMetadata)) {
      return false;
    }
    if (!Objects.equals(this.skipAtlasMetadata, backupDatalakeRequest.skipAtlasMetadata)) {
      return false;
    }
    if (!Objects.equals(this.skipRangerAudits, backupDatalakeRequest.skipRangerAudits)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeName, backupLocation, backupName, closeDbConnections, skipRangerHmsMetadata, skipAtlasMetadata, skipRangerAudits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupDatalakeRequest {\n");
    sb.append("    datalakeName: ").append(toIndentedString(datalakeName)).append("\n");
    sb.append("    backupLocation: ").append(toIndentedString(backupLocation)).append("\n");
    sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
    sb.append("    closeDbConnections: ").append(toIndentedString(closeDbConnections)).append("\n");
    sb.append("    skipRangerHmsMetadata: ").append(toIndentedString(skipRangerHmsMetadata)).append("\n");
    sb.append("    skipAtlasMetadata: ").append(toIndentedString(skipAtlasMetadata)).append("\n");
    sb.append("    skipRangerAudits: ").append(toIndentedString(skipRangerAudits)).append("\n");
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

