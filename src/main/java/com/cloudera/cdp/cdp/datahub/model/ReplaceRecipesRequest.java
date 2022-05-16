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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datahub.model.InstanceGroupRecipeRequest;
import java.util.*;

/**
 * The request for replacing recipes.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-05-16T09:57:44.187-07:00")
public class ReplaceRecipesRequest  {

  /**
   * The name or CRN of the datahub.
   **/
  private String datahub = null;

  /**
   * The list of instance group and recipe name pairs.
   **/
  private List<InstanceGroupRecipeRequest> instanceGroupRecipes = new ArrayList<InstanceGroupRecipeRequest>();

  /**
   * Getter for datahub.
   * The name or CRN of the datahub.
   **/
  @JsonProperty("datahub")
  public String getDatahub() {
    return datahub;
  }

  /**
   * Setter for datahub.
   * The name or CRN of the datahub.
   **/
  public void setDatahub(String datahub) {
    this.datahub = datahub;
  }

  /**
   * Getter for instanceGroupRecipes.
   * The list of instance group and recipe name pairs.
   **/
  @JsonProperty("instanceGroupRecipes")
  public List<InstanceGroupRecipeRequest> getInstanceGroupRecipes() {
    return instanceGroupRecipes;
  }

  /**
   * Setter for instanceGroupRecipes.
   * The list of instance group and recipe name pairs.
   **/
  public void setInstanceGroupRecipes(List<InstanceGroupRecipeRequest> instanceGroupRecipes) {
    this.instanceGroupRecipes = instanceGroupRecipes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceRecipesRequest replaceRecipesRequest = (ReplaceRecipesRequest) o;
    if (!Objects.equals(this.datahub, replaceRecipesRequest.datahub)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroupRecipes, replaceRecipesRequest.instanceGroupRecipes)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datahub, instanceGroupRecipes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceRecipesRequest {\n");
    sb.append("    datahub: ").append(toIndentedString(datahub)).append("\n");
    sb.append("    instanceGroupRecipes: ").append(toIndentedString(instanceGroupRecipes)).append("\n");
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

