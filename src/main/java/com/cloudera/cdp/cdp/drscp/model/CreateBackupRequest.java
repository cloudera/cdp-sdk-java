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

package com.cloudera.cdp.drscp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for the create backup request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-06-14T15:47:17.406-07:00")
public class CreateBackupRequest  {

  /**
   * Specified name for the backup.
   **/
  private String backupName = null;

  /**
   * Name of the potential candidate for backup. It is optional in the case of control plane.
   **/
  private String itemName = null;

  /**
   * Getter for backupName.
   * Specified name for the backup.
   **/
  @JsonProperty("backupName")
  public String getBackupName() {
    return backupName;
  }

  /**
   * Setter for backupName.
   * Specified name for the backup.
   **/
  public void setBackupName(String backupName) {
    this.backupName = backupName;
  }

  /**
   * Getter for itemName.
   * Name of the potential candidate for backup. It is optional in the case of control plane.
   **/
  @JsonProperty("itemName")
  public String getItemName() {
    return itemName;
  }

  /**
   * Setter for itemName.
   * Name of the potential candidate for backup. It is optional in the case of control plane.
   **/
  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBackupRequest createBackupRequest = (CreateBackupRequest) o;
    if (!Objects.equals(this.backupName, createBackupRequest.backupName)) {
      return false;
    }
    if (!Objects.equals(this.itemName, createBackupRequest.itemName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupName, itemName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBackupRequest {\n");
    sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
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

