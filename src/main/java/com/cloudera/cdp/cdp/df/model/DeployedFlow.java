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
 * A flow, potentially one of many, deployed inside a deployment.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-31T14:25:33.758-07:00")
public class DeployedFlow  {

  /**
   * The deployed flow CRN.
   **/
  private String crn = null;

  /**
   * The deployed flow name.
   **/
  private String name = null;

  /**
   * The CRN of the deployment that contains the flow.
   **/
  private String deploymentCrn = null;

  /**
   * The deployed flow status.
   **/
  private DeployedFlowStatus status = null;

  /**
   * The parent deployment name.
   **/
  private String deploymentName = null;

  /**
   * The CRN of the project that the flow's deployment belongs to.
   **/
  private String projectCrn = null;

  /**
   * Timestamp of the creation of the deployed flow.
   **/
  private Long created = null;

  /**
   * Timestamp of the last time the deployed flow was modified.
   **/
  private Long updated = null;

  /**
   * The version of the flow.
   **/
  private Integer flowVersion = null;

  /**
   * The deployed flow definition version CRN.
   **/
  private String flowVersionCrn = null;

  /**
   * The CRN of the flow definition.
   **/
  private String flowCrn = null;

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
   * The CRN of the user who deployed the flow.
   **/
  private String creatorCrn = null;

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
   * The CRN of the deployment that contains the flow.
   **/
  @JsonProperty("deploymentCrn")
  public String getDeploymentCrn() {
    return deploymentCrn;
  }

  /**
   * Setter for deploymentCrn.
   * The CRN of the deployment that contains the flow.
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
   * Getter for deploymentName.
   * The parent deployment name.
   **/
  @JsonProperty("deploymentName")
  public String getDeploymentName() {
    return deploymentName;
  }

  /**
   * Setter for deploymentName.
   * The parent deployment name.
   **/
  public void setDeploymentName(String deploymentName) {
    this.deploymentName = deploymentName;
  }

  /**
   * Getter for projectCrn.
   * The CRN of the project that the flow&#39;s deployment belongs to.
   **/
  @JsonProperty("projectCrn")
  public String getProjectCrn() {
    return projectCrn;
  }

  /**
   * Setter for projectCrn.
   * The CRN of the project that the flow&#39;s deployment belongs to.
   **/
  public void setProjectCrn(String projectCrn) {
    this.projectCrn = projectCrn;
  }

  /**
   * Getter for created.
   * Timestamp of the creation of the deployed flow.
   **/
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }

  /**
   * Setter for created.
   * Timestamp of the creation of the deployed flow.
   **/
  public void setCreated(Long created) {
    this.created = created;
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
   * Getter for flowVersion.
   * The version of the flow.
   **/
  @JsonProperty("flowVersion")
  public Integer getFlowVersion() {
    return flowVersion;
  }

  /**
   * Setter for flowVersion.
   * The version of the flow.
   **/
  public void setFlowVersion(Integer flowVersion) {
    this.flowVersion = flowVersion;
  }

  /**
   * Getter for flowVersionCrn.
   * The deployed flow definition version CRN.
   **/
  @JsonProperty("flowVersionCrn")
  public String getFlowVersionCrn() {
    return flowVersionCrn;
  }

  /**
   * Setter for flowVersionCrn.
   * The deployed flow definition version CRN.
   **/
  public void setFlowVersionCrn(String flowVersionCrn) {
    this.flowVersionCrn = flowVersionCrn;
  }

  /**
   * Getter for flowCrn.
   * The CRN of the flow definition.
   **/
  @JsonProperty("flowCrn")
  public String getFlowCrn() {
    return flowCrn;
  }

  /**
   * Setter for flowCrn.
   * The CRN of the flow definition.
   **/
  public void setFlowCrn(String flowCrn) {
    this.flowCrn = flowCrn;
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

  /**
   * Getter for creatorCrn.
   * The CRN of the user who deployed the flow.
   **/
  @JsonProperty("creatorCrn")
  public String getCreatorCrn() {
    return creatorCrn;
  }

  /**
   * Setter for creatorCrn.
   * The CRN of the user who deployed the flow.
   **/
  public void setCreatorCrn(String creatorCrn) {
    this.creatorCrn = creatorCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeployedFlow deployedFlow = (DeployedFlow) o;
    if (!Objects.equals(this.crn, deployedFlow.crn)) {
      return false;
    }
    if (!Objects.equals(this.name, deployedFlow.name)) {
      return false;
    }
    if (!Objects.equals(this.deploymentCrn, deployedFlow.deploymentCrn)) {
      return false;
    }
    if (!Objects.equals(this.status, deployedFlow.status)) {
      return false;
    }
    if (!Objects.equals(this.deploymentName, deployedFlow.deploymentName)) {
      return false;
    }
    if (!Objects.equals(this.projectCrn, deployedFlow.projectCrn)) {
      return false;
    }
    if (!Objects.equals(this.created, deployedFlow.created)) {
      return false;
    }
    if (!Objects.equals(this.updated, deployedFlow.updated)) {
      return false;
    }
    if (!Objects.equals(this.flowVersion, deployedFlow.flowVersion)) {
      return false;
    }
    if (!Objects.equals(this.flowVersionCrn, deployedFlow.flowVersionCrn)) {
      return false;
    }
    if (!Objects.equals(this.flowCrn, deployedFlow.flowCrn)) {
      return false;
    }
    if (!Objects.equals(this.activeInfoAlertCount, deployedFlow.activeInfoAlertCount)) {
      return false;
    }
    if (!Objects.equals(this.activeWarningAlertCount, deployedFlow.activeWarningAlertCount)) {
      return false;
    }
    if (!Objects.equals(this.activeErrorAlertCount, deployedFlow.activeErrorAlertCount)) {
      return false;
    }
    if (!Objects.equals(this.creatorCrn, deployedFlow.creatorCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, name, deploymentCrn, status, deploymentName, projectCrn, created, updated, flowVersion, flowVersionCrn, flowCrn, activeInfoAlertCount, activeWarningAlertCount, activeErrorAlertCount, creatorCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeployedFlow {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deploymentCrn: ").append(toIndentedString(deploymentCrn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    deploymentName: ").append(toIndentedString(deploymentName)).append("\n");
    sb.append("    projectCrn: ").append(toIndentedString(projectCrn)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    flowVersion: ").append(toIndentedString(flowVersion)).append("\n");
    sb.append("    flowVersionCrn: ").append(toIndentedString(flowVersionCrn)).append("\n");
    sb.append("    flowCrn: ").append(toIndentedString(flowCrn)).append("\n");
    sb.append("    activeInfoAlertCount: ").append(toIndentedString(activeInfoAlertCount)).append("\n");
    sb.append("    activeWarningAlertCount: ").append(toIndentedString(activeWarningAlertCount)).append("\n");
    sb.append("    activeErrorAlertCount: ").append(toIndentedString(activeErrorAlertCount)).append("\n");
    sb.append("    creatorCrn: ").append(toIndentedString(creatorCrn)).append("\n");
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

