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
import com.cloudera.cdp.dfworkload.model.ProjectMeta;

/**
 * Provides details about a flow designer draft.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-05-27T09:29:04.223-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class FlowMetadata  {

  /**
   * The runtime version associated with this flow.
   **/
  private String runtimeVersion = null;

  /**
   * The name of the flow.
   **/
  private String flowName = null;

  /**
   * The timestamp the flow was created
   **/
  private Long created = null;

  /**
   * The timestamp the flow was updated
   **/
  private Long updated = null;

  /**
   * The version of the flow artifact in the catalog associated with this flow design.
   **/
  private Integer catalogArtifactVersion = null;

  /**
   * The name of the flow artifact in the catalog associated with this flow design.
   **/
  private String catalogArtifactName = null;

  /**
   * The CRN of the flow artifact in the catalog associated with this flow design.
   **/
  private String catalogArtifactVersionCrn = null;

  /**
   * Resource type of the catalog item.
   **/
  private String resourceType = null;

  /**
   * Optional project that the flow is assigned to
   **/
  private ProjectMeta project = null;

  /**
   * The CRN of the flow designer draft.
   **/
  private String crn = null;

  /**
   * The NiFi major version of the runtime
   **/
  private Integer nifiMajorVersion = null;

  /**
   * Getter for runtimeVersion.
   * The runtime version associated with this flow.
   **/
  @JsonProperty("runtimeVersion")
  public String getRuntimeVersion() {
    return runtimeVersion;
  }

  /**
   * Setter for runtimeVersion.
   * The runtime version associated with this flow.
   **/
  public void setRuntimeVersion(String runtimeVersion) {
    this.runtimeVersion = runtimeVersion;
  }

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
   * The timestamp the flow was created
   **/
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }

  /**
   * Setter for created.
   * The timestamp the flow was created
   **/
  public void setCreated(Long created) {
    this.created = created;
  }

  /**
   * Getter for updated.
   * The timestamp the flow was updated
   **/
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }

  /**
   * Setter for updated.
   * The timestamp the flow was updated
   **/
  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  /**
   * Getter for catalogArtifactVersion.
   * The version of the flow artifact in the catalog associated with this flow design.
   **/
  @JsonProperty("catalogArtifactVersion")
  public Integer getCatalogArtifactVersion() {
    return catalogArtifactVersion;
  }

  /**
   * Setter for catalogArtifactVersion.
   * The version of the flow artifact in the catalog associated with this flow design.
   **/
  public void setCatalogArtifactVersion(Integer catalogArtifactVersion) {
    this.catalogArtifactVersion = catalogArtifactVersion;
  }

  /**
   * Getter for catalogArtifactName.
   * The name of the flow artifact in the catalog associated with this flow design.
   **/
  @JsonProperty("catalogArtifactName")
  public String getCatalogArtifactName() {
    return catalogArtifactName;
  }

  /**
   * Setter for catalogArtifactName.
   * The name of the flow artifact in the catalog associated with this flow design.
   **/
  public void setCatalogArtifactName(String catalogArtifactName) {
    this.catalogArtifactName = catalogArtifactName;
  }

  /**
   * Getter for catalogArtifactVersionCrn.
   * The CRN of the flow artifact in the catalog associated with this flow design.
   **/
  @JsonProperty("catalogArtifactVersionCrn")
  public String getCatalogArtifactVersionCrn() {
    return catalogArtifactVersionCrn;
  }

  /**
   * Setter for catalogArtifactVersionCrn.
   * The CRN of the flow artifact in the catalog associated with this flow design.
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
   * Getter for project.
   * Optional project that the flow is assigned to
   **/
  @JsonProperty("project")
  public ProjectMeta getProject() {
    return project;
  }

  /**
   * Setter for project.
   * Optional project that the flow is assigned to
   **/
  public void setProject(ProjectMeta project) {
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
   * Getter for nifiMajorVersion.
   * The NiFi major version of the runtime
   **/
  @JsonProperty("nifiMajorVersion")
  public Integer getNifiMajorVersion() {
    return nifiMajorVersion;
  }

  /**
   * Setter for nifiMajorVersion.
   * The NiFi major version of the runtime
   **/
  public void setNifiMajorVersion(Integer nifiMajorVersion) {
    this.nifiMajorVersion = nifiMajorVersion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowMetadata flowMetadata = (FlowMetadata) o;
    if (!Objects.equals(this.runtimeVersion, flowMetadata.runtimeVersion)) {
      return false;
    }
    if (!Objects.equals(this.flowName, flowMetadata.flowName)) {
      return false;
    }
    if (!Objects.equals(this.created, flowMetadata.created)) {
      return false;
    }
    if (!Objects.equals(this.updated, flowMetadata.updated)) {
      return false;
    }
    if (!Objects.equals(this.catalogArtifactVersion, flowMetadata.catalogArtifactVersion)) {
      return false;
    }
    if (!Objects.equals(this.catalogArtifactName, flowMetadata.catalogArtifactName)) {
      return false;
    }
    if (!Objects.equals(this.catalogArtifactVersionCrn, flowMetadata.catalogArtifactVersionCrn)) {
      return false;
    }
    if (!Objects.equals(this.resourceType, flowMetadata.resourceType)) {
      return false;
    }
    if (!Objects.equals(this.project, flowMetadata.project)) {
      return false;
    }
    if (!Objects.equals(this.crn, flowMetadata.crn)) {
      return false;
    }
    if (!Objects.equals(this.nifiMajorVersion, flowMetadata.nifiMajorVersion)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(runtimeVersion, flowName, created, updated, catalogArtifactVersion, catalogArtifactName, catalogArtifactVersionCrn, resourceType, project, crn, nifiMajorVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowMetadata {\n");
    sb.append("    runtimeVersion: ").append(toIndentedString(runtimeVersion)).append("\n");
    sb.append("    flowName: ").append(toIndentedString(flowName)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    catalogArtifactVersion: ").append(toIndentedString(catalogArtifactVersion)).append("\n");
    sb.append("    catalogArtifactName: ").append(toIndentedString(catalogArtifactName)).append("\n");
    sb.append("    catalogArtifactVersionCrn: ").append(toIndentedString(catalogArtifactVersionCrn)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    nifiMajorVersion: ").append(toIndentedString(nifiMajorVersion)).append("\n");
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

