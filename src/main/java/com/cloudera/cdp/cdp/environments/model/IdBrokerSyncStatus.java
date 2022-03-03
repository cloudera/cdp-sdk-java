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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.time.ZonedDateTime;

/**
 * Status of an ID Broker mappings sync operation.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-03-03T11:50:46.489-08:00")
public class IdBrokerSyncStatus  {

  /**
   * The mappings sync summary status.
   **/
  private String status = null;

  /**
   * The date when the mappings sync started executing. Omitted if status is NEVER_RUN.
   **/
  private ZonedDateTime startDate = null;

  /**
   * The date when the mappings sync completed or was terminated. Omitted if status is NEVER_RUN or RUNNING.
   **/
  private ZonedDateTime endDate = null;

  /**
   * The detail of the error. Omitted if status is not FAILED.
   **/
  private String errorDetail = null;

  /**
   * Getter for status.
   * The mappings sync summary status.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The mappings sync summary status.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for startDate.
   * The date when the mappings sync started executing. Omitted if status is NEVER_RUN.
   **/
  @JsonProperty("startDate")
  public ZonedDateTime getStartDate() {
    return startDate;
  }

  /**
   * Setter for startDate.
   * The date when the mappings sync started executing. Omitted if status is NEVER_RUN.
   **/
  public void setStartDate(ZonedDateTime startDate) {
    this.startDate = startDate;
  }

  /**
   * Getter for endDate.
   * The date when the mappings sync completed or was terminated. Omitted if status is NEVER_RUN or RUNNING.
   **/
  @JsonProperty("endDate")
  public ZonedDateTime getEndDate() {
    return endDate;
  }

  /**
   * Setter for endDate.
   * The date when the mappings sync completed or was terminated. Omitted if status is NEVER_RUN or RUNNING.
   **/
  public void setEndDate(ZonedDateTime endDate) {
    this.endDate = endDate;
  }

  /**
   * Getter for errorDetail.
   * The detail of the error. Omitted if status is not FAILED.
   **/
  @JsonProperty("errorDetail")
  public String getErrorDetail() {
    return errorDetail;
  }

  /**
   * Setter for errorDetail.
   * The detail of the error. Omitted if status is not FAILED.
   **/
  public void setErrorDetail(String errorDetail) {
    this.errorDetail = errorDetail;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdBrokerSyncStatus idBrokerSyncStatus = (IdBrokerSyncStatus) o;
    if (!Objects.equals(this.status, idBrokerSyncStatus.status)) {
      return false;
    }
    if (!Objects.equals(this.startDate, idBrokerSyncStatus.startDate)) {
      return false;
    }
    if (!Objects.equals(this.endDate, idBrokerSyncStatus.endDate)) {
      return false;
    }
    if (!Objects.equals(this.errorDetail, idBrokerSyncStatus.errorDetail)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, startDate, endDate, errorDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdBrokerSyncStatus {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
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

