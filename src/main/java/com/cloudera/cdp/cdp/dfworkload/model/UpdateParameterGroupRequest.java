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
 * Request object for updating a parameter group. A parameter with only its name set indicates deletion. A parameter matching an existing name indicates an update. A parameter with a new name indicates an addition.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:56.373Z")
@com.cloudera.cdp.annotation.WorkloadApi
public class UpdateParameterGroupRequest  {

  /**
   * The CRN of an environment to execute the command.
   **/
  private String environmentCrn = null;

  /**
   * The CRN of the Parameter Group.
   **/
  private String parameterGroupCrn = null;

  /**
   * The description of the parameter group.
   **/
  private String description = null;

  /**
   * The parameters in this group.
   **/
  private List<ParameterRequest> parameters = new ArrayList<ParameterRequest>();

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
   * Getter for parameterGroupCrn.
   * The CRN of the Parameter Group.
   **/
  @JsonProperty("parameterGroupCrn")
  public String getParameterGroupCrn() {
    return parameterGroupCrn;
  }

  /**
   * Setter for parameterGroupCrn.
   * The CRN of the Parameter Group.
   **/
  public void setParameterGroupCrn(String parameterGroupCrn) {
    this.parameterGroupCrn = parameterGroupCrn;
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateParameterGroupRequest updateParameterGroupRequest = (UpdateParameterGroupRequest) o;
    if (!Objects.equals(this.environmentCrn, updateParameterGroupRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.parameterGroupCrn, updateParameterGroupRequest.parameterGroupCrn)) {
      return false;
    }
    if (!Objects.equals(this.description, updateParameterGroupRequest.description)) {
      return false;
    }
    if (!Objects.equals(this.parameters, updateParameterGroupRequest.parameters)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, parameterGroupCrn, description, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateParameterGroupRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    parameterGroupCrn: ").append(toIndentedString(parameterGroupCrn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

