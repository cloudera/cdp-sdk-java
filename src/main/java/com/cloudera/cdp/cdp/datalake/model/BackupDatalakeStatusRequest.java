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
 * Request object to get the status of datalake backup. Returns the status of the latest backup that matches the provided input.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-08-18T19:29:51.006-07:00")
public class BackupDatalakeStatusRequest  {

  /**
   * The name of the datalake. When backupName and backupId are not provided, status request will get the status of the latest backup operation performed on the given datalake.
   **/
  private String datalakeName = null;

  /**
   * The name of the backup. When provided, the status request will get the status of the latest backup performed with the given backup name on the given datalake.
   **/
  private String backupName = null;

  /**
   * Unique identifier of the backup performed. When provided, the status request will get the status entry that has the backupid provided.
   **/
  private String backupId = null;

  /**
   * Getter for datalakeName.
   * The name of the datalake. When backupName and backupId are not provided, status request will get the status of the latest backup operation performed on the given datalake.
   **/
  @JsonProperty("datalakeName")
  public String getDatalakeName() {
    return datalakeName;
  }

  /**
   * Setter for datalakeName.
   * The name of the datalake. When backupName and backupId are not provided, status request will get the status of the latest backup operation performed on the given datalake.
   **/
  public void setDatalakeName(String datalakeName) {
    this.datalakeName = datalakeName;
  }

  /**
   * Getter for backupName.
   * The name of the backup. When provided, the status request will get the status of the latest backup performed with the given backup name on the given datalake.
   **/
  @JsonProperty("backupName")
  public String getBackupName() {
    return backupName;
  }

  /**
   * Setter for backupName.
   * The name of the backup. When provided, the status request will get the status of the latest backup performed with the given backup name on the given datalake.
   **/
  public void setBackupName(String backupName) {
    this.backupName = backupName;
  }

  /**
   * Getter for backupId.
   * Unique identifier of the backup performed. When provided, the status request will get the status entry that has the backupid provided.
   **/
  @JsonProperty("backupId")
  public String getBackupId() {
    return backupId;
  }

  /**
   * Setter for backupId.
   * Unique identifier of the backup performed. When provided, the status request will get the status entry that has the backupid provided.
   **/
  public void setBackupId(String backupId) {
    this.backupId = backupId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupDatalakeStatusRequest backupDatalakeStatusRequest = (BackupDatalakeStatusRequest) o;
    if (!Objects.equals(this.datalakeName, backupDatalakeStatusRequest.datalakeName)) {
      return false;
    }
    if (!Objects.equals(this.backupName, backupDatalakeStatusRequest.backupName)) {
      return false;
    }
    if (!Objects.equals(this.backupId, backupDatalakeStatusRequest.backupId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeName, backupName, backupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupDatalakeStatusRequest {\n");
    sb.append("    datalakeName: ").append(toIndentedString(datalakeName)).append("\n");
    sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
    sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
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

