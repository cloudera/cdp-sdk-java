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
import java.time.ZonedDateTime;

/**
 * Information about a datalake.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-01-05T15:43:59.736-08:00")
public class Datalake  {

  /**
   * The name of the datalake.
   **/
  private String datalakeName = null;

  /**
   * The CRN of the datalake.
   **/
  private String crn = null;

  /**
   * The status of the datalake.
   **/
  private String status = null;

  /**
   * The CRN of the environment.
   **/
  private String environmentCrn = null;

  /**
   * The date when the datalake was created.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * The reason for the status of the datalake.
   **/
  private String statusReason = null;

  /**
   * Whether Ranger RAZ is enabled for the datalake.
   **/
  private Boolean enableRangerRaz = null;

  /**
   * Indicates the certificate status on the cluster.
   **/
  private String certificateExpirationState = null;

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
   * Getter for crn.
   * The CRN of the datalake.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the datalake.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for status.
   * The status of the datalake.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The status of the datalake.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for environmentCrn.
   * The CRN of the environment.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of the environment.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for creationDate.
   * The date when the datalake was created.
   **/
  @JsonProperty("creationDate")
  public ZonedDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * Setter for creationDate.
   * The date when the datalake was created.
   **/
  public void setCreationDate(ZonedDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Getter for statusReason.
   * The reason for the status of the datalake.
   **/
  @JsonProperty("statusReason")
  public String getStatusReason() {
    return statusReason;
  }

  /**
   * Setter for statusReason.
   * The reason for the status of the datalake.
   **/
  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }

  /**
   * Getter for enableRangerRaz.
   * Whether Ranger RAZ is enabled for the datalake.
   **/
  @JsonProperty("enableRangerRaz")
  public Boolean getEnableRangerRaz() {
    return enableRangerRaz;
  }

  /**
   * Setter for enableRangerRaz.
   * Whether Ranger RAZ is enabled for the datalake.
   **/
  public void setEnableRangerRaz(Boolean enableRangerRaz) {
    this.enableRangerRaz = enableRangerRaz;
  }

  /**
   * Getter for certificateExpirationState.
   * Indicates the certificate status on the cluster.
   **/
  @JsonProperty("certificateExpirationState")
  public String getCertificateExpirationState() {
    return certificateExpirationState;
  }

  /**
   * Setter for certificateExpirationState.
   * Indicates the certificate status on the cluster.
   **/
  public void setCertificateExpirationState(String certificateExpirationState) {
    this.certificateExpirationState = certificateExpirationState;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Datalake datalake = (Datalake) o;
    if (!Objects.equals(this.datalakeName, datalake.datalakeName)) {
      return false;
    }
    if (!Objects.equals(this.crn, datalake.crn)) {
      return false;
    }
    if (!Objects.equals(this.status, datalake.status)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, datalake.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, datalake.creationDate)) {
      return false;
    }
    if (!Objects.equals(this.statusReason, datalake.statusReason)) {
      return false;
    }
    if (!Objects.equals(this.enableRangerRaz, datalake.enableRangerRaz)) {
      return false;
    }
    if (!Objects.equals(this.certificateExpirationState, datalake.certificateExpirationState)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeName, crn, status, environmentCrn, creationDate, statusReason, enableRangerRaz, certificateExpirationState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Datalake {\n");
    sb.append("    datalakeName: ").append(toIndentedString(datalakeName)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    enableRangerRaz: ").append(toIndentedString(enableRangerRaz)).append("\n");
    sb.append("    certificateExpirationState: ").append(toIndentedString(certificateExpirationState)).append("\n");
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

