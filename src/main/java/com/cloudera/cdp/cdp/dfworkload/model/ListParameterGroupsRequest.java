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
import java.util.*;

/**
 * Request object for listing parameter groups.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:56.373Z")
@com.cloudera.cdp.annotation.WorkloadApi
public class ListParameterGroupsRequest  {

  /**
   * The CRN of an environment to execute the command.
   **/
  private String environmentCrn = null;

  /**
   * The list of project CRNs by which to filter the parameter group list.
   **/
  private List<String> projectCrns = new ArrayList<String>();

  /**
   * The search term to filter by parameter group name.
   **/
  private String searchTerm = null;

  /**
   * Getter for environmentCrn.
   * The CRN of an environment to execute the command.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of an environment to execute the command.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for projectCrns.
   * The list of project CRNs by which to filter the parameter group list.
   **/
  @JsonProperty("projectCrns")
  public List<String> getProjectCrns() {
    return projectCrns;
  }

  /**
   * Setter for projectCrns.
   * The list of project CRNs by which to filter the parameter group list.
   **/
  public void setProjectCrns(List<String> projectCrns) {
    this.projectCrns = projectCrns;
  }

  /**
   * Getter for searchTerm.
   * The search term to filter by parameter group name.
   **/
  @JsonProperty("searchTerm")
  public String getSearchTerm() {
    return searchTerm;
  }

  /**
   * Setter for searchTerm.
   * The search term to filter by parameter group name.
   **/
  public void setSearchTerm(String searchTerm) {
    this.searchTerm = searchTerm;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListParameterGroupsRequest listParameterGroupsRequest = (ListParameterGroupsRequest) o;
    if (!Objects.equals(this.environmentCrn, listParameterGroupsRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.projectCrns, listParameterGroupsRequest.projectCrns)) {
      return false;
    }
    if (!Objects.equals(this.searchTerm, listParameterGroupsRequest.searchTerm)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, projectCrns, searchTerm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListParameterGroupsRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    projectCrns: ").append(toIndentedString(projectCrns)).append("\n");
    sb.append("    searchTerm: ").append(toIndentedString(searchTerm)).append("\n");
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

