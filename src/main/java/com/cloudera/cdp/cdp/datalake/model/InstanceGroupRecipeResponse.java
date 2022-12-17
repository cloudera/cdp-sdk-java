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

package com.cloudera.cdp.datalake.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Represents an instance group - recipe pair (by names) response.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-12-16T12:55:40.926-08:00")
public class InstanceGroupRecipeResponse extends CdpResponse {

  /**
   * A valid instance/host group name. This name must be unique.
   **/
  private String instanceGroupName = null;

  /**
   * Names of the recipes (empty is valid).
   **/
  private List<String> recipeNames = new ArrayList<String>();

  /**
   * Getter for instanceGroupName.
   * A valid instance/host group name. This name must be unique.
   **/
  @JsonProperty("instanceGroupName")
  public String getInstanceGroupName() {
    return instanceGroupName;
  }

  /**
   * Setter for instanceGroupName.
   * A valid instance/host group name. This name must be unique.
   **/
  public void setInstanceGroupName(String instanceGroupName) {
    this.instanceGroupName = instanceGroupName;
  }

  /**
   * Getter for recipeNames.
   * Names of the recipes (empty is valid).
   **/
  @JsonProperty("recipeNames")
  public List<String> getRecipeNames() {
    return recipeNames;
  }

  /**
   * Setter for recipeNames.
   * Names of the recipes (empty is valid).
   **/
  public void setRecipeNames(List<String> recipeNames) {
    this.recipeNames = recipeNames;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceGroupRecipeResponse instanceGroupRecipeResponse = (InstanceGroupRecipeResponse) o;
    if (!Objects.equals(this.instanceGroupName, instanceGroupRecipeResponse.instanceGroupName)) {
      return false;
    }
    if (!Objects.equals(this.recipeNames, instanceGroupRecipeResponse.recipeNames)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceGroupName, recipeNames, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceGroupRecipeResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    instanceGroupName: ").append(toIndentedString(instanceGroupName)).append("\n");
    sb.append("    recipeNames: ").append(toIndentedString(recipeNames)).append("\n");
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

