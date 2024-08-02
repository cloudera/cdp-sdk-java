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
import com.cloudera.cdp.dfworkload.model.FlowParameter;
import java.util.*;

/**
 * A flow parameter group
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-08-02T09:36:51.948-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class FlowParameterGroup  {

  /**
   * The name of the parameter group
   **/
  private String name = null;

  /**
   * The parameters in the group
   **/
  private List<FlowParameter> parameters = new ArrayList<FlowParameter>();

  /**
   * Getter for name.
   * The name of the parameter group
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the parameter group
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for parameters.
   * The parameters in the group
   **/
  @JsonProperty("parameters")
  public List<FlowParameter> getParameters() {
    return parameters;
  }

  /**
   * Setter for parameters.
   * The parameters in the group
   **/
  public void setParameters(List<FlowParameter> parameters) {
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
    FlowParameterGroup flowParameterGroup = (FlowParameterGroup) o;
    if (!Objects.equals(this.name, flowParameterGroup.name)) {
      return false;
    }
    if (!Objects.equals(this.parameters, flowParameterGroup.parameters)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowParameterGroup {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

