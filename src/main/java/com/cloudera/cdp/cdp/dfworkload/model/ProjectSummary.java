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

/**
 * Provides a summary of the project.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-05T07:54:45.482-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class ProjectSummary  {

  /**
   * The ID of the project.
   **/
  private String id = null;

  /**
   * The CRN of the project.
   **/
  private String crn = null;

  /**
   * The name of the group.
   **/
  private String name = null;

  /**
   * The description of the group.
   **/
  private String description = null;

  /**
   * The name of the workload administration group for this project.
   **/
  private String workloadAdministrationGroup = null;

  /**
   * Indicates the project is in the process of being deleted.
   **/
  private Boolean deleting = null;

  /**
   * Getter for id.
   * The ID of the project.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * The ID of the project.
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for crn.
   * The CRN of the project.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the project.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for name.
   * The name of the group.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the group.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for description.
   * The description of the group.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * The description of the group.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for workloadAdministrationGroup.
   * The name of the workload administration group for this project.
   **/
  @JsonProperty("workloadAdministrationGroup")
  public String getWorkloadAdministrationGroup() {
    return workloadAdministrationGroup;
  }

  /**
   * Setter for workloadAdministrationGroup.
   * The name of the workload administration group for this project.
   **/
  public void setWorkloadAdministrationGroup(String workloadAdministrationGroup) {
    this.workloadAdministrationGroup = workloadAdministrationGroup;
  }

  /**
   * Getter for deleting.
   * Indicates the project is in the process of being deleted.
   **/
  @JsonProperty("deleting")
  public Boolean getDeleting() {
    return deleting;
  }

  /**
   * Setter for deleting.
   * Indicates the project is in the process of being deleted.
   **/
  public void setDeleting(Boolean deleting) {
    this.deleting = deleting;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectSummary projectSummary = (ProjectSummary) o;
    if (!Objects.equals(this.id, projectSummary.id)) {
      return false;
    }
    if (!Objects.equals(this.crn, projectSummary.crn)) {
      return false;
    }
    if (!Objects.equals(this.name, projectSummary.name)) {
      return false;
    }
    if (!Objects.equals(this.description, projectSummary.description)) {
      return false;
    }
    if (!Objects.equals(this.workloadAdministrationGroup, projectSummary.workloadAdministrationGroup)) {
      return false;
    }
    if (!Objects.equals(this.deleting, projectSummary.deleting)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, crn, name, description, workloadAdministrationGroup, deleting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectSummary {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    workloadAdministrationGroup: ").append(toIndentedString(workloadAdministrationGroup)).append("\n");
    sb.append("    deleting: ").append(toIndentedString(deleting)).append("\n");
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

