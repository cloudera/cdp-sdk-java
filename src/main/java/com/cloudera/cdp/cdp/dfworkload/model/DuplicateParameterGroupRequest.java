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
 * Request object for duplicating a parameter group.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-05T07:54:45.482-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class DuplicateParameterGroupRequest  {

  /**
   * The CRN of an environment to execute the command.
   **/
  private String environmentCrn = null;

  /**
   * The parameter group CRN.
   **/
  private String parameterGroupCrn = null;

  /**
   * The new parameter group name.
   **/
  private String newParameterGroupName = null;

  /**
   * The description.
   **/
  private String description = null;

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
   * The parameter group CRN.
   **/
  @JsonProperty("parameterGroupCrn")
  public String getParameterGroupCrn() {
    return parameterGroupCrn;
  }

  /**
   * Setter for parameterGroupCrn.
   * The parameter group CRN.
   **/
  public void setParameterGroupCrn(String parameterGroupCrn) {
    this.parameterGroupCrn = parameterGroupCrn;
  }

  /**
   * Getter for newParameterGroupName.
   * The new parameter group name.
   **/
  @JsonProperty("newParameterGroupName")
  public String getNewParameterGroupName() {
    return newParameterGroupName;
  }

  /**
   * Setter for newParameterGroupName.
   * The new parameter group name.
   **/
  public void setNewParameterGroupName(String newParameterGroupName) {
    this.newParameterGroupName = newParameterGroupName;
  }

  /**
   * Getter for description.
   * The description.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * The description.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DuplicateParameterGroupRequest duplicateParameterGroupRequest = (DuplicateParameterGroupRequest) o;
    if (!Objects.equals(this.environmentCrn, duplicateParameterGroupRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.parameterGroupCrn, duplicateParameterGroupRequest.parameterGroupCrn)) {
      return false;
    }
    if (!Objects.equals(this.newParameterGroupName, duplicateParameterGroupRequest.newParameterGroupName)) {
      return false;
    }
    if (!Objects.equals(this.description, duplicateParameterGroupRequest.description)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, parameterGroupCrn, newParameterGroupName, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DuplicateParameterGroupRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    parameterGroupCrn: ").append(toIndentedString(parameterGroupCrn)).append("\n");
    sb.append("    newParameterGroupName: ").append(toIndentedString(newParameterGroupName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

