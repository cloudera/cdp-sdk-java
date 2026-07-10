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

package com.cloudera.cdp.dfworkload.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.dfworkload.model.ProjectSummary;
import com.cloudera.cdp.dfworkload.model.RuntimeSession;

/**
 * Data object for information describing a flow designer draft.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:56.373Z")
@com.cloudera.cdp.annotation.WorkloadApi
public class FlowSummary  {

  /**
   * The name of the flow.
   **/
  private String flowName = null;

  /**
   * Creation timestamp of the flow.
   **/
  private Long created = null;

  /**
   * The timestamp the flow was last modified.
   **/
  private Long lastModified = null;

  /**
   * The identity of the user that last modified the flow.
   **/
  private String lastModifiedBy = null;

  /**
   * The identity of the user that created the flow.
   **/
  private String createdBy = null;

  /**
   * Optional, originating artifact version from the flow catalog this flow is associated with.
   **/
  private Integer catalogArtifactVersion = null;

  /**
   * Optional, originating artifact name from the flow catalog this flow is associated with.
   **/
  private String catalogArtifactName = null;

  /**
   * The crn of the flow in the catalog associated with this flow design.
   **/
  private String catalogArtifactVersionCrn = null;

  /**
   * Resource type of the catalog item.
   **/
  private String resourceType = null;

  /**
   * The NiFi Major version.
   **/
  private Integer nifiMajorVersion = null;

  /**
   * Optional project summary that the flow is assigned to.
   **/
  private ProjectSummary project = null;

  /**
   * The CRN of the flow designer draft.
   **/
  private String crn = null;

  /**
   * Information about the runtime session, if one exists for the flow under design.
   **/
  private RuntimeSession runtimeSession = null;

  /**
   * Getter for flowName.
   * The name of the flow.
   **/
  @JsonProperty("flowName")
  public String getFlowName() {
    return flowName;
  }

  /**
   * Setter for flowName.
   * The name of the flow.
   **/
  public void setFlowName(String flowName) {
    this.flowName = flowName;
  }

  /**
   * Getter for created.
   * Creation timestamp of the flow.
   **/
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }

  /**
   * Setter for created.
   * Creation timestamp of the flow.
   **/
  public void setCreated(Long created) {
    this.created = created;
  }

  /**
   * Getter for lastModified.
   * The timestamp the flow was last modified.
   **/
  @JsonProperty("lastModified")
  public Long getLastModified() {
    return lastModified;
  }

  /**
   * Setter for lastModified.
   * The timestamp the flow was last modified.
   **/
  public void setLastModified(Long lastModified) {
    this.lastModified = lastModified;
  }

  /**
   * Getter for lastModifiedBy.
   * The identity of the user that last modified the flow.
   **/
  @JsonProperty("lastModifiedBy")
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  /**
   * Setter for lastModifiedBy.
   * The identity of the user that last modified the flow.
   **/
  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  /**
   * Getter for createdBy.
   * The identity of the user that created the flow.
   **/
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Setter for createdBy.
   * The identity of the user that created the flow.
   **/
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * Getter for catalogArtifactVersion.
   * Optional, originating artifact version from the flow catalog this flow is associated with.
   **/
  @JsonProperty("catalogArtifactVersion")
  public Integer getCatalogArtifactVersion() {
    return catalogArtifactVersion;
  }

  /**
   * Setter for catalogArtifactVersion.
   * Optional, originating artifact version from the flow catalog this flow is associated with.
   **/
  public void setCatalogArtifactVersion(Integer catalogArtifactVersion) {
    this.catalogArtifactVersion = catalogArtifactVersion;
  }

  /**
   * Getter for catalogArtifactName.
   * Optional, originating artifact name from the flow catalog this flow is associated with.
   **/
  @JsonProperty("catalogArtifactName")
  public String getCatalogArtifactName() {
    return catalogArtifactName;
  }

  /**
   * Setter for catalogArtifactName.
   * Optional, originating artifact name from the flow catalog this flow is associated with.
   **/
  public void setCatalogArtifactName(String catalogArtifactName) {
    this.catalogArtifactName = catalogArtifactName;
  }

  /**
   * Getter for catalogArtifactVersionCrn.
   * The crn of the flow in the catalog associated with this flow design.
   **/
  @JsonProperty("catalogArtifactVersionCrn")
  public String getCatalogArtifactVersionCrn() {
    return catalogArtifactVersionCrn;
  }

  /**
   * Setter for catalogArtifactVersionCrn.
   * The crn of the flow in the catalog associated with this flow design.
   **/
  public void setCatalogArtifactVersionCrn(String catalogArtifactVersionCrn) {
    this.catalogArtifactVersionCrn = catalogArtifactVersionCrn;
  }

  /**
   * Getter for resourceType.
   * Resource type of the catalog item.
   **/
  @JsonProperty("resourceType")
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Setter for resourceType.
   * Resource type of the catalog item.
   **/
  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  /**
   * Getter for nifiMajorVersion.
   * The NiFi Major version.
   **/
  @JsonProperty("nifiMajorVersion")
  public Integer getNifiMajorVersion() {
    return nifiMajorVersion;
  }

  /**
   * Setter for nifiMajorVersion.
   * The NiFi Major version.
   **/
  public void setNifiMajorVersion(Integer nifiMajorVersion) {
    this.nifiMajorVersion = nifiMajorVersion;
  }

  /**
   * Getter for project.
   * Optional project summary that the flow is assigned to.
   **/
  @JsonProperty("project")
  public ProjectSummary getProject() {
    return project;
  }

  /**
   * Setter for project.
   * Optional project summary that the flow is assigned to.
   **/
  public void setProject(ProjectSummary project) {
    this.project = project;
  }

  /**
   * Getter for crn.
   * The CRN of the flow designer draft.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the flow designer draft.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for runtimeSession.
   * Information about the runtime session, if one exists for the flow under design.
   **/
  @JsonProperty("runtimeSession")
  public RuntimeSession getRuntimeSession() {
    return runtimeSession;
  }

  /**
   * Setter for runtimeSession.
   * Information about the runtime session, if one exists for the flow under design.
   **/
  public void setRuntimeSession(RuntimeSession runtimeSession) {
    this.runtimeSession = runtimeSession;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowSummary flowSummary = (FlowSummary) o;
    if (!Objects.equals(this.flowName, flowSummary.flowName)) {
      return false;
    }
    if (!Objects.equals(this.created, flowSummary.created)) {
      return false;
    }
    if (!Objects.equals(this.lastModified, flowSummary.lastModified)) {
      return false;
    }
    if (!Objects.equals(this.lastModifiedBy, flowSummary.lastModifiedBy)) {
      return false;
    }
    if (!Objects.equals(this.createdBy, flowSummary.createdBy)) {
      return false;
    }
    if (!Objects.equals(this.catalogArtifactVersion, flowSummary.catalogArtifactVersion)) {
      return false;
    }
    if (!Objects.equals(this.catalogArtifactName, flowSummary.catalogArtifactName)) {
      return false;
    }
    if (!Objects.equals(this.catalogArtifactVersionCrn, flowSummary.catalogArtifactVersionCrn)) {
      return false;
    }
    if (!Objects.equals(this.resourceType, flowSummary.resourceType)) {
      return false;
    }
    if (!Objects.equals(this.nifiMajorVersion, flowSummary.nifiMajorVersion)) {
      return false;
    }
    if (!Objects.equals(this.project, flowSummary.project)) {
      return false;
    }
    if (!Objects.equals(this.crn, flowSummary.crn)) {
      return false;
    }
    if (!Objects.equals(this.runtimeSession, flowSummary.runtimeSession)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowName, created, lastModified, lastModifiedBy, createdBy, catalogArtifactVersion, catalogArtifactName, catalogArtifactVersionCrn, resourceType, nifiMajorVersion, project, crn, runtimeSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowSummary {\n");
    sb.append("    flowName: ").append(toIndentedString(flowName)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    catalogArtifactVersion: ").append(toIndentedString(catalogArtifactVersion)).append("\n");
    sb.append("    catalogArtifactName: ").append(toIndentedString(catalogArtifactName)).append("\n");
    sb.append("    catalogArtifactVersionCrn: ").append(toIndentedString(catalogArtifactVersionCrn)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    nifiMajorVersion: ").append(toIndentedString(nifiMajorVersion)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    runtimeSession: ").append(toIndentedString(runtimeSession)).append("\n");
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

