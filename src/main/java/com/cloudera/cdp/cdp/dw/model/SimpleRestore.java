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
 * A simple Restore entry for listRestore Usage
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:40.786-07:00")
public class SimpleRestore  {

  /**
   * The CRN of the restore.
   **/
  private String restoreCrn = null;

  /**
   * The CRN of the backup.
   **/
  private String backupCrn = null;

  /**
   * The time when the restore was created.
   **/
  private String restoreCreationTime = null;

  /**
   * The list of namespaces to be included in restore.
   **/
  private List<String> includedNamespaces = new ArrayList<String>();

  /**
   * Getter for restoreCrn.
   * The CRN of the restore.
   **/
  @JsonProperty("restoreCrn")
  public String getRestoreCrn() {
    return restoreCrn;
  }

  /**
   * Setter for restoreCrn.
   * The CRN of the restore.
   **/
  public void setRestoreCrn(String restoreCrn) {
    this.restoreCrn = restoreCrn;
  }

  /**
   * Getter for backupCrn.
   * The CRN of the backup.
   **/
  @JsonProperty("backupCrn")
  public String getBackupCrn() {
    return backupCrn;
  }

  /**
   * Setter for backupCrn.
   * The CRN of the backup.
   **/
  public void setBackupCrn(String backupCrn) {
    this.backupCrn = backupCrn;
  }

  /**
   * Getter for restoreCreationTime.
   * The time when the restore was created.
   **/
  @JsonProperty("restoreCreationTime")
  public String getRestoreCreationTime() {
    return restoreCreationTime;
  }

  /**
   * Setter for restoreCreationTime.
   * The time when the restore was created.
   **/
  public void setRestoreCreationTime(String restoreCreationTime) {
    this.restoreCreationTime = restoreCreationTime;
  }

  /**
   * Getter for includedNamespaces.
   * The list of namespaces to be included in restore.
   **/
  @JsonProperty("includedNamespaces")
  public List<String> getIncludedNamespaces() {
    return includedNamespaces;
  }

  /**
   * Setter for includedNamespaces.
   * The list of namespaces to be included in restore.
   **/
  public void setIncludedNamespaces(List<String> includedNamespaces) {
    this.includedNamespaces = includedNamespaces;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleRestore simpleRestore = (SimpleRestore) o;
    if (!Objects.equals(this.restoreCrn, simpleRestore.restoreCrn)) {
      return false;
    }
    if (!Objects.equals(this.backupCrn, simpleRestore.backupCrn)) {
      return false;
    }
    if (!Objects.equals(this.restoreCreationTime, simpleRestore.restoreCreationTime)) {
      return false;
    }
    if (!Objects.equals(this.includedNamespaces, simpleRestore.includedNamespaces)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(restoreCrn, backupCrn, restoreCreationTime, includedNamespaces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleRestore {\n");
    sb.append("    restoreCrn: ").append(toIndentedString(restoreCrn)).append("\n");
    sb.append("    backupCrn: ").append(toIndentedString(backupCrn)).append("\n");
    sb.append("    restoreCreationTime: ").append(toIndentedString(restoreCreationTime)).append("\n");
    sb.append("    includedNamespaces: ").append(toIndentedString(includedNamespaces)).append("\n");
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

