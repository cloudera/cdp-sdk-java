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

package com.cloudera.cdp.opdb.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Describe a custom recipe.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-29T08:54:21.213-07:00")
public class CustomRecipe  {

  /**
   * Name of the recipe.
   **/
  private List<String> names = new ArrayList<String>();

  /**
   * Instance group to apply the recipe to.
   **/
  private String instanceGroup = null;

  /**
   * Getter for names.
   * Name of the recipe.
   **/
  @JsonProperty("names")
  public List<String> getNames() {
    return names;
  }

  /**
   * Setter for names.
   * Name of the recipe.
   **/
  public void setNames(List<String> names) {
    this.names = names;
  }

  /**
   * Getter for instanceGroup.
   * Instance group to apply the recipe to.
   **/
  @JsonProperty("instanceGroup")
  public String getInstanceGroup() {
    return instanceGroup;
  }

  /**
   * Setter for instanceGroup.
   * Instance group to apply the recipe to.
   **/
  public void setInstanceGroup(String instanceGroup) {
    this.instanceGroup = instanceGroup;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomRecipe customRecipe = (CustomRecipe) o;
    if (!Objects.equals(this.names, customRecipe.names)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroup, customRecipe.instanceGroup)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(names, instanceGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomRecipe {\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    instanceGroup: ").append(toIndentedString(instanceGroup)).append("\n");
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

