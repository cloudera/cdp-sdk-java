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
import com.cloudera.cdp.df.model.DeployedFlowStatus;

/**
 * A deployed flow summary.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-04-15T08:44:53.893-07:00")
public class DeployedFlowSummary  {

  /**
   * The deployed flow CRN.
   **/
  private String crn = null;

  /**
   * The deployed flow name.
   **/
  private String name = null;

  /**
   * The deployment CRN.
   **/
  private String deploymentCrn = null;

  /**
   * The deployed flow status.
   **/
  private DeployedFlowStatus status = null;

  /**
   * Timestamp of the last time the deployed flow was modified.
   **/
  private Long updated = null;

  /**
   * Current count of active alerts classified as informational.
   **/
  private Long activeInfoAlertCount = null;

  /**
   * Current count of active alerts classified as warnings.
   **/
  private Long activeWarningAlertCount = null;

  /**
   * Current count of active alerts classified as errors.
   **/
  private Long activeErrorAlertCount = null;

  /**
   * Getter for crn.
   * The deployed flow CRN.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The deployed flow CRN.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for name.
   * The deployed flow name.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The deployed flow name.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for deploymentCrn.
   * The deployment CRN.
   **/
  @JsonProperty("deploymentCrn")
  public String getDeploymentCrn() {
    return deploymentCrn;
  }

  /**
   * Setter for deploymentCrn.
   * The deployment CRN.
   **/
  public void setDeploymentCrn(String deploymentCrn) {
    this.deploymentCrn = deploymentCrn;
  }

  /**
   * Getter for status.
   * The deployed flow status.
   **/
  @JsonProperty("status")
  public DeployedFlowStatus getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The deployed flow status.
   **/
  public void setStatus(DeployedFlowStatus status) {
    this.status = status;
  }

  /**
   * Getter for updated.
   * Timestamp of the last time the deployed flow was modified.
   **/
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }

  /**
   * Setter for updated.
   * Timestamp of the last time the deployed flow was modified.
   **/
  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  /**
   * Getter for activeInfoAlertCount.
   * Current count of active alerts classified as informational.
   **/
  @JsonProperty("activeInfoAlertCount")
  public Long getActiveInfoAlertCount() {
    return activeInfoAlertCount;
  }

  /**
   * Setter for activeInfoAlertCount.
   * Current count of active alerts classified as informational.
   **/
  public void setActiveInfoAlertCount(Long activeInfoAlertCount) {
    this.activeInfoAlertCount = activeInfoAlertCount;
  }

  /**
   * Getter for activeWarningAlertCount.
   * Current count of active alerts classified as warnings.
   **/
  @JsonProperty("activeWarningAlertCount")
  public Long getActiveWarningAlertCount() {
    return activeWarningAlertCount;
  }

  /**
   * Setter for activeWarningAlertCount.
   * Current count of active alerts classified as warnings.
   **/
  public void setActiveWarningAlertCount(Long activeWarningAlertCount) {
    this.activeWarningAlertCount = activeWarningAlertCount;
  }

  /**
   * Getter for activeErrorAlertCount.
   * Current count of active alerts classified as errors.
   **/
  @JsonProperty("activeErrorAlertCount")
  public Long getActiveErrorAlertCount() {
    return activeErrorAlertCount;
  }

  /**
   * Setter for activeErrorAlertCount.
   * Current count of active alerts classified as errors.
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
    DeployedFlowSummary deployedFlowSummary = (DeployedFlowSummary) o;
    if (!Objects.equals(this.crn, deployedFlowSummary.crn)) {
      return false;
    }
    if (!Objects.equals(this.name, deployedFlowSummary.name)) {
      return false;
    }
    if (!Objects.equals(this.deploymentCrn, deployedFlowSummary.deploymentCrn)) {
      return false;
    }
    if (!Objects.equals(this.status, deployedFlowSummary.status)) {
      return false;
    }
    if (!Objects.equals(this.updated, deployedFlowSummary.updated)) {
      return false;
    }
    if (!Objects.equals(this.activeInfoAlertCount, deployedFlowSummary.activeInfoAlertCount)) {
      return false;
    }
    if (!Objects.equals(this.activeWarningAlertCount, deployedFlowSummary.activeWarningAlertCount)) {
      return false;
    }
    if (!Objects.equals(this.activeErrorAlertCount, deployedFlowSummary.activeErrorAlertCount)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, name, deploymentCrn, status, updated, activeInfoAlertCount, activeWarningAlertCount, activeErrorAlertCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeployedFlowSummary {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deploymentCrn: ").append(toIndentedString(deploymentCrn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

