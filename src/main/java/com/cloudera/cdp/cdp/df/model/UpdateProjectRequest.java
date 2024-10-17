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

/**
 * A request to describe a Project
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-10-16T16:58:53.112-07:00")
public class UpdateProjectRequest  {

  /**
   * The Project CRN.
   **/
  private String projectCrn = null;

  /**
   * The Project revision
   **/
  private Integer projectRevision = null;

  /**
   * The new Project name.
   **/
  private String projectName = null;

  /**
   * The new Project description.
   **/
  private String projectDescription = null;

  /**
   * Getter for projectCrn.
   * The Project CRN.
   **/
  @JsonProperty("projectCrn")
  public String getProjectCrn() {
    return projectCrn;
  }

  /**
   * Setter for projectCrn.
   * The Project CRN.
   **/
  public void setProjectCrn(String projectCrn) {
    this.projectCrn = projectCrn;
  }

  /**
   * Getter for projectRevision.
   * The Project revision
   **/
  @JsonProperty("projectRevision")
  public Integer getProjectRevision() {
    return projectRevision;
  }

  /**
   * Setter for projectRevision.
   * The Project revision
   **/
  public void setProjectRevision(Integer projectRevision) {
    this.projectRevision = projectRevision;
  }

  /**
   * Getter for projectName.
   * The new Project name.
   **/
  @JsonProperty("projectName")
  public String getProjectName() {
    return projectName;
  }

  /**
   * Setter for projectName.
   * The new Project name.
   **/
  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  /**
   * Getter for projectDescription.
   * The new Project description.
   **/
  @JsonProperty("projectDescription")
  public String getProjectDescription() {
    return projectDescription;
  }

  /**
   * Setter for projectDescription.
   * The new Project description.
   **/
  public void setProjectDescription(String projectDescription) {
    this.projectDescription = projectDescription;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateProjectRequest updateProjectRequest = (UpdateProjectRequest) o;
    if (!Objects.equals(this.projectCrn, updateProjectRequest.projectCrn)) {
      return false;
    }
    if (!Objects.equals(this.projectRevision, updateProjectRequest.projectRevision)) {
      return false;
    }
    if (!Objects.equals(this.projectName, updateProjectRequest.projectName)) {
      return false;
    }
    if (!Objects.equals(this.projectDescription, updateProjectRequest.projectDescription)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectCrn, projectRevision, projectName, projectDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateProjectRequest {\n");
    sb.append("    projectCrn: ").append(toIndentedString(projectCrn)).append("\n");
    sb.append("    projectRevision: ").append(toIndentedString(projectRevision)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    projectDescription: ").append(toIndentedString(projectDescription)).append("\n");
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

