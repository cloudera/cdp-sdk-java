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
import com.cloudera.cdp.dfworkload.model.ParameterGroupUsage;
import com.cloudera.cdp.dfworkload.model.ProjectSummary;
import java.util.*;

/**
 * Summary of a parameter group.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:56.373Z")
@com.cloudera.cdp.annotation.WorkloadApi
public class ParameterGroupSummary  {

  /**
   * The name of the parameter group.
   **/
  private String name = null;

  /**
   * The parameter group ID.
   **/
  private String id = null;

  /**
   * The source of parameter group creation.
   **/
  private String source = null;

  /**
   * Optional project ID that parameter group is assigned to.
   **/
  private String projectId = null;

  /**
   * Optional project summary that the parameter group is assigned to.
   **/
  private ProjectSummary projectSummary = null;

  /**
   * The list of usages where this parameter group is used.
   **/
  private List<ParameterGroupUsage> usages = new ArrayList<ParameterGroupUsage>();

  /**
   * Creation timestamp of the parameter group.
   **/
  private Long created = null;

  /**
   * Timestamp of the last time the parameter group was modified.
   **/
  private Long updated = null;

  /**
   * The description of the parameter group.
   **/
  private String description = null;

  /**
   * The CRN of the Parameter Group.
   **/
  private String crn = null;

  /**
   * The username of the creator of the parameter group.
   **/
  private String createdBy = null;

  /**
   * The version of the parameter group.
   **/
  private Long version = null;

  /**
   * Getter for name.
   * The name of the parameter group.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the parameter group.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for id.
   * The parameter group ID.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * The parameter group ID.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for source.
   * The source of parameter group creation.
   **/
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  /**
   * Setter for source.
   * The source of parameter group creation.
   **/
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * Getter for projectId.
   * Optional project ID that parameter group is assigned to.
   **/
  @JsonProperty("projectId")
  public String getProjectId() {
    return projectId;
  }

  /**
   * Setter for projectId.
   * Optional project ID that parameter group is assigned to.
   **/
  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  /**
   * Getter for projectSummary.
   * Optional project summary that the parameter group is assigned to.
   **/
  @JsonProperty("projectSummary")
  public ProjectSummary getProjectSummary() {
    return projectSummary;
  }

  /**
   * Setter for projectSummary.
   * Optional project summary that the parameter group is assigned to.
   **/
  public void setProjectSummary(ProjectSummary projectSummary) {
    this.projectSummary = projectSummary;
  }

  /**
   * Getter for usages.
   * The list of usages where this parameter group is used.
   **/
  @JsonProperty("usages")
  public List<ParameterGroupUsage> getUsages() {
    return usages;
  }

  /**
   * Setter for usages.
   * The list of usages where this parameter group is used.
   **/
  public void setUsages(List<ParameterGroupUsage> usages) {
    this.usages = usages;
  }

  /**
   * Getter for created.
   * Creation timestamp of the parameter group.
   **/
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }

  /**
   * Setter for created.
   * Creation timestamp of the parameter group.
   **/
  public void setCreated(Long created) {
    this.created = created;
  }

  /**
   * Getter for updated.
   * Timestamp of the last time the parameter group was modified.
   **/
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }

  /**
   * Setter for updated.
   * Timestamp of the last time the parameter group was modified.
   **/
  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  /**
   * Getter for description.
   * The description of the parameter group.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * The description of the parameter group.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for crn.
   * The CRN of the Parameter Group.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the Parameter Group.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for createdBy.
   * The username of the creator of the parameter group.
   **/
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Setter for createdBy.
   * The username of the creator of the parameter group.
   **/
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * Getter for version.
   * The version of the parameter group.
   **/
  @JsonProperty("version")
  public Long getVersion() {
    return version;
  }

  /**
   * Setter for version.
   * The version of the parameter group.
   **/
  public void setVersion(Long version) {
    this.version = version;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterGroupSummary parameterGroupSummary = (ParameterGroupSummary) o;
    if (!Objects.equals(this.name, parameterGroupSummary.name)) {
      return false;
    }
    if (!Objects.equals(this.id, parameterGroupSummary.id)) {
      return false;
    }
    if (!Objects.equals(this.source, parameterGroupSummary.source)) {
      return false;
    }
    if (!Objects.equals(this.projectId, parameterGroupSummary.projectId)) {
      return false;
    }
    if (!Objects.equals(this.projectSummary, parameterGroupSummary.projectSummary)) {
      return false;
    }
    if (!Objects.equals(this.usages, parameterGroupSummary.usages)) {
      return false;
    }
    if (!Objects.equals(this.created, parameterGroupSummary.created)) {
      return false;
    }
    if (!Objects.equals(this.updated, parameterGroupSummary.updated)) {
      return false;
    }
    if (!Objects.equals(this.description, parameterGroupSummary.description)) {
      return false;
    }
    if (!Objects.equals(this.crn, parameterGroupSummary.crn)) {
      return false;
    }
    if (!Objects.equals(this.createdBy, parameterGroupSummary.createdBy)) {
      return false;
    }
    if (!Objects.equals(this.version, parameterGroupSummary.version)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, source, projectId, projectSummary, usages, created, updated, description, crn, createdBy, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterGroupSummary {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectSummary: ").append(toIndentedString(projectSummary)).append("\n");
    sb.append("    usages: ").append(toIndentedString(usages)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

