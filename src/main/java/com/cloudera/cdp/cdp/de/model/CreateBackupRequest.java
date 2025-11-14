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

package com.cloudera.cdp.de.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.de.model.BackupContentOptions;

/**
 * Request object for Create Backup command.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-14T06:50:08.005-08:00")
public class CreateBackupRequest  {

  /**
   * Service ID of the service to backup.
   **/
  private String serviceId = null;

  /**
   * Backup description.
   **/
  private String description = null;

  /**
   * Backup file relative path. The path should not include file name, and be relative to the service backup location. The service backup location can be found in the service description obtained via the 'describe-service' command.
   **/
  private String backupPath = null;

  /**
   * Whether to backup service virtual clusters. By default, virtual clusters are backed up.
   **/
  private Boolean includeVc = true;

  /**
   * Backup operation timeout in seconds.
   **/
  private Integer timeout = null;

  /**
   * Backup virtual cluster content options.
   **/
  private BackupContentOptions backupVcContentOptions = null;

  /**
   * Whether to ignore validation errors and proceed with the backup forcefully. By default, the backup operation is not forced.
   **/
  private Boolean force = false;

  /**
   * Getter for serviceId.
   * Service ID of the service to backup.
   **/
  @JsonProperty("serviceId")
  public String getServiceId() {
    return serviceId;
  }

  /**
   * Setter for serviceId.
   * Service ID of the service to backup.
   **/
  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  /**
   * Getter for description.
   * Backup description.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * Backup description.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for backupPath.
   * Backup file relative path. The path should not include file name, and be relative to the service backup location. The service backup location can be found in the service description obtained via the &#39;describe-service&#39; command.
   **/
  @JsonProperty("backupPath")
  public String getBackupPath() {
    return backupPath;
  }

  /**
   * Setter for backupPath.
   * Backup file relative path. The path should not include file name, and be relative to the service backup location. The service backup location can be found in the service description obtained via the &#39;describe-service&#39; command.
   **/
  public void setBackupPath(String backupPath) {
    this.backupPath = backupPath;
  }

  /**
   * Getter for includeVc.
   * Whether to backup service virtual clusters. By default, virtual clusters are backed up.
   **/
  @JsonProperty("includeVc")
  public Boolean getIncludeVc() {
    return includeVc;
  }

  /**
   * Setter for includeVc.
   * Whether to backup service virtual clusters. By default, virtual clusters are backed up.
   **/
  public void setIncludeVc(Boolean includeVc) {
    this.includeVc = includeVc;
  }

  /**
   * Getter for timeout.
   * Backup operation timeout in seconds.
   **/
  @JsonProperty("timeout")
  public Integer getTimeout() {
    return timeout;
  }

  /**
   * Setter for timeout.
   * Backup operation timeout in seconds.
   **/
  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  /**
   * Getter for backupVcContentOptions.
   * Backup virtual cluster content options.
   **/
  @JsonProperty("backupVcContentOptions")
  public BackupContentOptions getBackupVcContentOptions() {
    return backupVcContentOptions;
  }

  /**
   * Setter for backupVcContentOptions.
   * Backup virtual cluster content options.
   **/
  public void setBackupVcContentOptions(BackupContentOptions backupVcContentOptions) {
    this.backupVcContentOptions = backupVcContentOptions;
  }

  /**
   * Getter for force.
   * Whether to ignore validation errors and proceed with the backup forcefully. By default, the backup operation is not forced.
   **/
  @JsonProperty("force")
  public Boolean getForce() {
    return force;
  }

  /**
   * Setter for force.
   * Whether to ignore validation errors and proceed with the backup forcefully. By default, the backup operation is not forced.
   **/
  public void setForce(Boolean force) {
    this.force = force;
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
    if (!Objects.equals(this.serviceId, createBackupRequest.serviceId)) {
      return false;
    }
    if (!Objects.equals(this.description, createBackupRequest.description)) {
      return false;
    }
    if (!Objects.equals(this.backupPath, createBackupRequest.backupPath)) {
      return false;
    }
    if (!Objects.equals(this.includeVc, createBackupRequest.includeVc)) {
      return false;
    }
    if (!Objects.equals(this.timeout, createBackupRequest.timeout)) {
      return false;
    }
    if (!Objects.equals(this.backupVcContentOptions, createBackupRequest.backupVcContentOptions)) {
      return false;
    }
    if (!Objects.equals(this.force, createBackupRequest.force)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceId, description, backupPath, includeVc, timeout, backupVcContentOptions, force);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBackupRequest {\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    backupPath: ").append(toIndentedString(backupPath)).append("\n");
    sb.append("    includeVc: ").append(toIndentedString(includeVc)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    backupVcContentOptions: ").append(toIndentedString(backupVcContentOptions)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
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

