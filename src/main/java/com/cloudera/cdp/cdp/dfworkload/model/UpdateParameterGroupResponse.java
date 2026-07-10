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
import com.cloudera.cdp.dfworkload.model.ParameterGroup;

/**
 * Response object for updating a parameter group.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:56.373Z")
@com.cloudera.cdp.annotation.WorkloadApi
public class UpdateParameterGroupResponse extends CdpResponse {

  /**
   * The updated parameter group.
   **/
  private ParameterGroup parameterGroup = null;

  /**
   * Getter for parameterGroup.
   * The updated parameter group.
   **/
  @JsonProperty("parameterGroup")
  public ParameterGroup getParameterGroup() {
    return parameterGroup;
  }

  /**
   * Setter for parameterGroup.
   * The updated parameter group.
   **/
  public void setParameterGroup(ParameterGroup parameterGroup) {
    this.parameterGroup = parameterGroup;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateParameterGroupResponse updateParameterGroupResponse = (UpdateParameterGroupResponse) o;
    if (!Objects.equals(this.parameterGroup, updateParameterGroupResponse.parameterGroup)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterGroup, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateParameterGroupResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    parameterGroup: ").append(toIndentedString(parameterGroup)).append("\n");
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

