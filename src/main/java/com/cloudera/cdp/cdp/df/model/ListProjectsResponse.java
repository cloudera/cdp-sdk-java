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
import com.cloudera.cdp.df.model.Project;
import java.util.*;

/**
 * A response to list Projects
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-26T08:05:44.984-08:00")
public class ListProjectsResponse extends CdpResponse {

  /**
   * The page token for requesting the next page of results.
   **/
  private String nextToken = null;

  /**
   * The listing of Projects.
   **/
  private List<Project> projects = new ArrayList<Project>();

  /**
   * Getter for nextToken.
   * The page token for requesting the next page of results.
   **/
  @JsonProperty("nextToken")
  public String getNextToken() {
    return nextToken;
  }

  /**
   * Setter for nextToken.
   * The page token for requesting the next page of results.
   **/
  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  /**
   * Getter for projects.
   * The listing of Projects.
   **/
  @JsonProperty("projects")
  public List<Project> getProjects() {
    return projects;
  }

  /**
   * Setter for projects.
   * The listing of Projects.
   **/
  public void setProjects(List<Project> projects) {
    this.projects = projects;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListProjectsResponse listProjectsResponse = (ListProjectsResponse) o;
    if (!Objects.equals(this.nextToken, listProjectsResponse.nextToken)) {
      return false;
    }
    if (!Objects.equals(this.projects, listProjectsResponse.projects)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextToken, projects, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListProjectsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
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

