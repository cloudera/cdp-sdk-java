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
import com.cloudera.cdp.dfworkload.model.ParameterRequest;
import java.util.*;

/**
 * Request object for creating a parameter group.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-05-27T09:29:04.223-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class CreateParameterGroupRequest  {

  /**
   * The CRN of an environment to execute the command.
   **/
  private String environmentCrn = null;

  /**
   * The name of the parameter group.
   **/
  private String name = null;

  /**
   * The description of the parameter group.
   **/
  private String description = null;

  /**
   * The parameters in this group.
   **/
  private List<ParameterRequest> parameters = new ArrayList<ParameterRequest>();

  /**
   * Optional project CRN that parameter group is assigned to.
   **/
  private String projectCrn = null;

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
   * Getter for parameters.
   * The parameters in this group.
   **/
  @JsonProperty("parameters")
  public List<ParameterRequest> getParameters() {
    return parameters;
  }

  /**
   * Setter for parameters.
   * The parameters in this group.
   **/
  public void setParameters(List<ParameterRequest> parameters) {
    this.parameters = parameters;
  }

  /**
   * Getter for projectCrn.
   * Optional project CRN that parameter group is assigned to.
   **/
  @JsonProperty("projectCrn")
  public String getProjectCrn() {
    return projectCrn;
  }

  /**
   * Setter for projectCrn.
   * Optional project CRN that parameter group is assigned to.
   **/
  public void setProjectCrn(String projectCrn) {
    this.projectCrn = projectCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateParameterGroupRequest createParameterGroupRequest = (CreateParameterGroupRequest) o;
    if (!Objects.equals(this.environmentCrn, createParameterGroupRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.name, createParameterGroupRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.description, createParameterGroupRequest.description)) {
      return false;
    }
    if (!Objects.equals(this.parameters, createParameterGroupRequest.parameters)) {
      return false;
    }
    if (!Objects.equals(this.projectCrn, createParameterGroupRequest.projectCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, name, description, parameters, projectCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateParameterGroupRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    projectCrn: ").append(toIndentedString(projectCrn)).append("\n");
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

