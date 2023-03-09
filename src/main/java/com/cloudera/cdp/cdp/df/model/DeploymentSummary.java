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

package com.cloudera.cdp.df.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.df.model.DeploymentStatus;
import com.cloudera.cdp.df.model.ServiceMeta;

/**
 * A deployment summary
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-03-09T11:03:09.266-08:00")
public class DeploymentSummary  {

  /**
   * The deployment CRN
   **/
  private String crn = null;

  /**
   * The deployment name
   **/
  private String name = null;

  /**
   * The deployment status
   **/
  private DeploymentStatus status = null;

  /**
   * The DataFlow service information of the deployment
   **/
  private ServiceMeta service = null;

  /**
   * Timestamp of the last time the deployment was modified
   **/
  private Long updated = null;

  /**
   * Current count of active alerts classified as an info
   **/
  private Long activeInfoAlertCount = null;

  /**
   * Current count of active alerts classified as a warning
   **/
  private Long activeWarningAlertCount = null;

  /**
   * Current count of active alerts classified as an error
   **/
  private Long activeErrorAlertCount = null;

  /**
   * Getter for crn.
   * The deployment CRN
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The deployment CRN
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for name.
   * The deployment name
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The deployment name
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for status.
   * The deployment status
   **/
  @JsonProperty("status")
  public DeploymentStatus getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The deployment status
   **/
  public void setStatus(DeploymentStatus status) {
    this.status = status;
  }

  /**
   * Getter for service.
   * The DataFlow service information of the deployment
   **/
  @JsonProperty("service")
  public ServiceMeta getService() {
    return service;
  }

  /**
   * Setter for service.
   * The DataFlow service information of the deployment
   **/
  public void setService(ServiceMeta service) {
    this.service = service;
  }

  /**
   * Getter for updated.
   * Timestamp of the last time the deployment was modified
   **/
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }

  /**
   * Setter for updated.
   * Timestamp of the last time the deployment was modified
   **/
  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  /**
   * Getter for activeInfoAlertCount.
   * Current count of active alerts classified as an info
   **/
  @JsonProperty("activeInfoAlertCount")
  public Long getActiveInfoAlertCount() {
    return activeInfoAlertCount;
  }

  /**
   * Setter for activeInfoAlertCount.
   * Current count of active alerts classified as an info
   **/
  public void setActiveInfoAlertCount(Long activeInfoAlertCount) {
    this.activeInfoAlertCount = activeInfoAlertCount;
  }

  /**
   * Getter for activeWarningAlertCount.
   * Current count of active alerts classified as a warning
   **/
  @JsonProperty("activeWarningAlertCount")
  public Long getActiveWarningAlertCount() {
    return activeWarningAlertCount;
  }

  /**
   * Setter for activeWarningAlertCount.
   * Current count of active alerts classified as a warning
   **/
  public void setActiveWarningAlertCount(Long activeWarningAlertCount) {
    this.activeWarningAlertCount = activeWarningAlertCount;
  }

  /**
   * Getter for activeErrorAlertCount.
   * Current count of active alerts classified as an error
   **/
  @JsonProperty("activeErrorAlertCount")
  public Long getActiveErrorAlertCount() {
    return activeErrorAlertCount;
  }

  /**
   * Setter for activeErrorAlertCount.
   * Current count of active alerts classified as an error
   **/
  public void setActiveErrorAlertCount(Long activeErrorAlertCount) {
    this.activeErrorAlertCount = activeErrorAlertCount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentSummary deploymentSummary = (DeploymentSummary) o;
    if (!Objects.equals(this.crn, deploymentSummary.crn)) {
      return false;
    }
    if (!Objects.equals(this.name, deploymentSummary.name)) {
      return false;
    }
    if (!Objects.equals(this.status, deploymentSummary.status)) {
      return false;
    }
    if (!Objects.equals(this.service, deploymentSummary.service)) {
      return false;
    }
    if (!Objects.equals(this.updated, deploymentSummary.updated)) {
      return false;
    }
    if (!Objects.equals(this.activeInfoAlertCount, deploymentSummary.activeInfoAlertCount)) {
      return false;
    }
    if (!Objects.equals(this.activeWarningAlertCount, deploymentSummary.activeWarningAlertCount)) {
      return false;
    }
    if (!Objects.equals(this.activeErrorAlertCount, deploymentSummary.activeErrorAlertCount)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, name, status, service, updated, activeInfoAlertCount, activeWarningAlertCount, activeErrorAlertCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentSummary {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    activeInfoAlertCount: ").append(toIndentedString(activeInfoAlertCount)).append("\n");
    sb.append("    activeWarningAlertCount: ").append(toIndentedString(activeWarningAlertCount)).append("\n");
    sb.append("    activeErrorAlertCount: ").append(toIndentedString(activeErrorAlertCount)).append("\n");
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

