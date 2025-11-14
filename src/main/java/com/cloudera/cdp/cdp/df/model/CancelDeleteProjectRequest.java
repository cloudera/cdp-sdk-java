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
 * A request to cancel the deletion of a Project that is deleting
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-14T06:50:08.545-08:00")
public class CancelDeleteProjectRequest  {

  /**
   * The Project CRN.
   **/
  private String projectCrn = null;

  /**
   * The Project revision
   **/
  private Integer projectRevision = null;

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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelDeleteProjectRequest cancelDeleteProjectRequest = (CancelDeleteProjectRequest) o;
    if (!Objects.equals(this.projectCrn, cancelDeleteProjectRequest.projectCrn)) {
      return false;
    }
    if (!Objects.equals(this.projectRevision, cancelDeleteProjectRequest.projectRevision)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectCrn, projectRevision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelDeleteProjectRequest {\n");
    sb.append("    projectCrn: ").append(toIndentedString(projectCrn)).append("\n");
    sb.append("    projectRevision: ").append(toIndentedString(projectRevision)).append("\n");
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

