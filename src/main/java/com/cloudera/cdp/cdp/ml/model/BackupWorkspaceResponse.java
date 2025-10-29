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
import java.util.*;

/**
 * The response object for Cloudera AI workbench backup.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-28T14:00:27.700-07:00")
public class BackupWorkspaceResponse extends CdpResponse {

  /**
   * CRN of the backup generated.
   **/
  private String backupCrn = null;

  /**
   * Name of the vault where backup related volumes are stored.
   **/
  private String vaultName = null;

  /**
   * Warning messages about backup behavior.
   **/
  private List<String> warnings = new ArrayList<String>();

  /**
   * Getter for backupCrn.
   * CRN of the backup generated.
   **/
  @JsonProperty("backupCrn")
  public String getBackupCrn() {
    return backupCrn;
  }

  /**
   * Setter for backupCrn.
   * CRN of the backup generated.
   **/
  public void setBackupCrn(String backupCrn) {
    this.backupCrn = backupCrn;
  }

  /**
   * Getter for vaultName.
   * Name of the vault where backup related volumes are stored.
   **/
  @JsonProperty("vaultName")
  public String getVaultName() {
    return vaultName;
  }

  /**
   * Setter for vaultName.
   * Name of the vault where backup related volumes are stored.
   **/
  public void setVaultName(String vaultName) {
    this.vaultName = vaultName;
  }

  /**
   * Getter for warnings.
   * Warning messages about backup behavior.
   **/
  @JsonProperty("warnings")
  public List<String> getWarnings() {
    return warnings;
  }

  /**
   * Setter for warnings.
   * Warning messages about backup behavior.
   **/
  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupWorkspaceResponse backupWorkspaceResponse = (BackupWorkspaceResponse) o;
    if (!Objects.equals(this.backupCrn, backupWorkspaceResponse.backupCrn)) {
      return false;
    }
    if (!Objects.equals(this.vaultName, backupWorkspaceResponse.vaultName)) {
      return false;
    }
    if (!Objects.equals(this.warnings, backupWorkspaceResponse.warnings)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupCrn, vaultName, warnings, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupWorkspaceResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    backupCrn: ").append(toIndentedString(backupCrn)).append("\n");
    sb.append("    vaultName: ").append(toIndentedString(vaultName)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

