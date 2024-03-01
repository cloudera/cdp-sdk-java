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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * Request object for collecting Datahub diagnostics.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-02-29T13:23:31.919-08:00")
public class CollectCmDiagnosticsRequest  {

  /**
   * CRN of the Datahub cluster.
   **/
  private String crn = null;

  /**
   * Destination of the diagnostics collection (Support, Own cloud storage, Engineering or collect only on the nodes)
   **/
  private String destination = null;

  /**
   * Additional information / title for the diagnostics collection.
   **/
  private String description = null;

  /**
   * Optional support case number in case of SUPPORT destination, otherwise only act as additional data.
   **/
  private String caseNumber = null;

  /**
   * Array of roles for which to get logs and metrics. If set, this restricts the roles for log and metrics collection.
   **/
  private List<String> roles = new ArrayList<String>();

  /**
   * Restrict collected logs and metrics (from the provided date timestamp).
   **/
  private ZonedDateTime startDate = null;

  /**
   * Restrict collected logs and metrics (until the provided date timestamp).
   **/
  private ZonedDateTime endDate = null;

  /**
   * If enabled, required package (cdp-telemetry) will be upgraded or installed on the nodes. (useful if package is not installed or needs to be upgraded) Network is required for this operation.
   **/
  private Boolean updatePackage = false;

  /**
   * Enable/disable node level storage validation (can be disabled for example, if you have too many hosts and do not want to do too much parallel writes to s3/abfs)
   **/
  private Boolean storageValidation = false;

  /**
   * Flag to enable collection of metrics for chart display in CM based diagnostics collection.
   **/
  private Boolean monitorMetricsCollection = false;

  /**
   * Diagnostics bundle size limit in MB.
   **/
  private Integer bundleSizeLimit = null;

  /**
   * Getter for crn.
   * CRN of the Datahub cluster.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * CRN of the Datahub cluster.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for destination.
   * Destination of the diagnostics collection (Support, Own cloud storage, Engineering or collect only on the nodes)
   **/
  @JsonProperty("destination")
  public String getDestination() {
    return destination;
  }

  /**
   * Setter for destination.
   * Destination of the diagnostics collection (Support, Own cloud storage, Engineering or collect only on the nodes)
   **/
  public void setDestination(String destination) {
    this.destination = destination;
  }

  /**
   * Getter for description.
   * Additional information / title for the diagnostics collection.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * Additional information / title for the diagnostics collection.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for caseNumber.
   * Optional support case number in case of SUPPORT destination, otherwise only act as additional data.
   **/
  @JsonProperty("caseNumber")
  public String getCaseNumber() {
    return caseNumber;
  }

  /**
   * Setter for caseNumber.
   * Optional support case number in case of SUPPORT destination, otherwise only act as additional data.
   **/
  public void setCaseNumber(String caseNumber) {
    this.caseNumber = caseNumber;
  }

  /**
   * Getter for roles.
   * Array of roles for which to get logs and metrics. If set, this restricts the roles for log and metrics collection.
   **/
  @JsonProperty("roles")
  public List<String> getRoles() {
    return roles;
  }

  /**
   * Setter for roles.
   * Array of roles for which to get logs and metrics. If set, this restricts the roles for log and metrics collection.
   **/
  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  /**
   * Getter for startDate.
   * Restrict collected logs and metrics (from the provided date timestamp).
   **/
  @JsonProperty("startDate")
  public ZonedDateTime getStartDate() {
    return startDate;
  }

  /**
   * Setter for startDate.
   * Restrict collected logs and metrics (from the provided date timestamp).
   **/
  public void setStartDate(ZonedDateTime startDate) {
    this.startDate = startDate;
  }

  /**
   * Getter for endDate.
   * Restrict collected logs and metrics (until the provided date timestamp).
   **/
  @JsonProperty("endDate")
  public ZonedDateTime getEndDate() {
    return endDate;
  }

  /**
   * Setter for endDate.
   * Restrict collected logs and metrics (until the provided date timestamp).
   **/
  public void setEndDate(ZonedDateTime endDate) {
    this.endDate = endDate;
  }

  /**
   * Getter for updatePackage.
   * If enabled, required package (cdp-telemetry) will be upgraded or installed on the nodes. (useful if package is not installed or needs to be upgraded) Network is required for this operation.
   **/
  @JsonProperty("updatePackage")
  public Boolean getUpdatePackage() {
    return updatePackage;
  }

  /**
   * Setter for updatePackage.
   * If enabled, required package (cdp-telemetry) will be upgraded or installed on the nodes. (useful if package is not installed or needs to be upgraded) Network is required for this operation.
   **/
  public void setUpdatePackage(Boolean updatePackage) {
    this.updatePackage = updatePackage;
  }

  /**
   * Getter for storageValidation.
   * Enable/disable node level storage validation (can be disabled for example, if you have too many hosts and do not want to do too much parallel writes to s3/abfs)
   **/
  @JsonProperty("storageValidation")
  public Boolean getStorageValidation() {
    return storageValidation;
  }

  /**
   * Setter for storageValidation.
   * Enable/disable node level storage validation (can be disabled for example, if you have too many hosts and do not want to do too much parallel writes to s3/abfs)
   **/
  public void setStorageValidation(Boolean storageValidation) {
    this.storageValidation = storageValidation;
  }

  /**
   * Getter for monitorMetricsCollection.
   * Flag to enable collection of metrics for chart display in CM based diagnostics collection.
   **/
  @JsonProperty("monitorMetricsCollection")
  public Boolean getMonitorMetricsCollection() {
    return monitorMetricsCollection;
  }

  /**
   * Setter for monitorMetricsCollection.
   * Flag to enable collection of metrics for chart display in CM based diagnostics collection.
   **/
  public void setMonitorMetricsCollection(Boolean monitorMetricsCollection) {
    this.monitorMetricsCollection = monitorMetricsCollection;
  }

  /**
   * Getter for bundleSizeLimit.
   * Diagnostics bundle size limit in MB.
   **/
  @JsonProperty("bundleSizeLimit")
  public Integer getBundleSizeLimit() {
    return bundleSizeLimit;
  }

  /**
   * Setter for bundleSizeLimit.
   * Diagnostics bundle size limit in MB.
   **/
  public void setBundleSizeLimit(Integer bundleSizeLimit) {
    this.bundleSizeLimit = bundleSizeLimit;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectCmDiagnosticsRequest collectCmDiagnosticsRequest = (CollectCmDiagnosticsRequest) o;
    if (!Objects.equals(this.crn, collectCmDiagnosticsRequest.crn)) {
      return false;
    }
    if (!Objects.equals(this.destination, collectCmDiagnosticsRequest.destination)) {
      return false;
    }
    if (!Objects.equals(this.description, collectCmDiagnosticsRequest.description)) {
      return false;
    }
    if (!Objects.equals(this.caseNumber, collectCmDiagnosticsRequest.caseNumber)) {
      return false;
    }
    if (!Objects.equals(this.roles, collectCmDiagnosticsRequest.roles)) {
      return false;
    }
    if (!Objects.equals(this.startDate, collectCmDiagnosticsRequest.startDate)) {
      return false;
    }
    if (!Objects.equals(this.endDate, collectCmDiagnosticsRequest.endDate)) {
      return false;
    }
    if (!Objects.equals(this.updatePackage, collectCmDiagnosticsRequest.updatePackage)) {
      return false;
    }
    if (!Objects.equals(this.storageValidation, collectCmDiagnosticsRequest.storageValidation)) {
      return false;
    }
    if (!Objects.equals(this.monitorMetricsCollection, collectCmDiagnosticsRequest.monitorMetricsCollection)) {
      return false;
    }
    if (!Objects.equals(this.bundleSizeLimit, collectCmDiagnosticsRequest.bundleSizeLimit)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, destination, description, caseNumber, roles, startDate, endDate, updatePackage, storageValidation, monitorMetricsCollection, bundleSizeLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectCmDiagnosticsRequest {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    caseNumber: ").append(toIndentedString(caseNumber)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    updatePackage: ").append(toIndentedString(updatePackage)).append("\n");
    sb.append("    storageValidation: ").append(toIndentedString(storageValidation)).append("\n");
    sb.append("    monitorMetricsCollection: ").append(toIndentedString(monitorMetricsCollection)).append("\n");
    sb.append("    bundleSizeLimit: ").append(toIndentedString(bundleSizeLimit)).append("\n");
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

