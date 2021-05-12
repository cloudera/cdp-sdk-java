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
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-05-12T14:54:20.925-07:00")
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
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeName, backupLocation, backupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupDatalakeRequest {\n");
    sb.append("    datalakeName: ").append(toIndentedString(datalakeName)).append("\n");
    sb.append("    backupLocation: ").append(toIndentedString(backupLocation)).append("\n");
    sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
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

