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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Request object for the create backup request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:40.786-07:00")
public class CreateBackupRequest  {

  /**
   * Specified name for the backup. If not set, the name will be blank.
   **/
  private String backupName = null;

  /**
   * A list of namespace of the potential candidates for backup. If not set, all of the Data Warehouse namespaces will be backed up.
   **/
  private List<String> namespaceNames = new ArrayList<String>();

  /**
   * Getter for backupName.
   * Specified name for the backup. If not set, the name will be blank.
   **/
  @JsonProperty("backupName")
  public String getBackupName() {
    return backupName;
  }

  /**
   * Setter for backupName.
   * Specified name for the backup. If not set, the name will be blank.
   **/
  public void setBackupName(String backupName) {
    this.backupName = backupName;
  }

  /**
   * Getter for namespaceNames.
   * A list of namespace of the potential candidates for backup. If not set, all of the Data Warehouse namespaces will be backed up.
   **/
  @JsonProperty("namespaceNames")
  public List<String> getNamespaceNames() {
    return namespaceNames;
  }

  /**
   * Setter for namespaceNames.
   * A list of namespace of the potential candidates for backup. If not set, all of the Data Warehouse namespaces will be backed up.
   **/
  public void setNamespaceNames(List<String> namespaceNames) {
    this.namespaceNames = namespaceNames;
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
    if (!Objects.equals(this.namespaceNames, createBackupRequest.namespaceNames)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupName, namespaceNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBackupRequest {\n");
    sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
    sb.append("    namespaceNames: ").append(toIndentedString(namespaceNames)).append("\n");
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

