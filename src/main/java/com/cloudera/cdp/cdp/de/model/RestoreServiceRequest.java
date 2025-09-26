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

/**
 * Request object for Restore Service command.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-26T09:46:36.458-07:00")
public class RestoreServiceRequest  {

  /**
   * The ID of the backup to restore from.
   **/
  private Long backupID = null;

  /**
   * CRN of the CDP environment with which a restored CDE service will be associated. Currently, CDE service can be restored only to the same CDP environment, with which a backed-up service was associated.
   **/
  private String environmentCrn = null;

  /**
   * Specify the restored service ID. If not specified, a new service ID will be generated.
   **/
  private String serviceId = null;

  /**
   * Specify the restored service name. If not specified, the service name from the backup will be reused.
   **/
  private String serviceName = null;

  /**
   * Getter for backupID.
   * The ID of the backup to restore from.
   **/
  @JsonProperty("backupID")
  public Long getBackupID() {
    return backupID;
  }

  /**
   * Setter for backupID.
   * The ID of the backup to restore from.
   **/
  public void setBackupID(Long backupID) {
    this.backupID = backupID;
  }

  /**
   * Getter for environmentCrn.
   * CRN of the CDP environment with which a restored CDE service will be associated. Currently, CDE service can be restored only to the same CDP environment, with which a backed-up service was associated.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * CRN of the CDP environment with which a restored CDE service will be associated. Currently, CDE service can be restored only to the same CDP environment, with which a backed-up service was associated.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for serviceId.
   * Specify the restored service ID. If not specified, a new service ID will be generated.
   **/
  @JsonProperty("serviceId")
  public String getServiceId() {
    return serviceId;
  }

  /**
   * Setter for serviceId.
   * Specify the restored service ID. If not specified, a new service ID will be generated.
   **/
  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  /**
   * Getter for serviceName.
   * Specify the restored service name. If not specified, the service name from the backup will be reused.
   **/
  @JsonProperty("serviceName")
  public String getServiceName() {
    return serviceName;
  }

  /**
   * Setter for serviceName.
   * Specify the restored service name. If not specified, the service name from the backup will be reused.
   **/
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestoreServiceRequest restoreServiceRequest = (RestoreServiceRequest) o;
    if (!Objects.equals(this.backupID, restoreServiceRequest.backupID)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, restoreServiceRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.serviceId, restoreServiceRequest.serviceId)) {
      return false;
    }
    if (!Objects.equals(this.serviceName, restoreServiceRequest.serviceName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupID, environmentCrn, serviceId, serviceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestoreServiceRequest {\n");
    sb.append("    backupID: ").append(toIndentedString(backupID)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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

