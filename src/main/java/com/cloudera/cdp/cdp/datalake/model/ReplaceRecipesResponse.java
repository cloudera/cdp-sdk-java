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
import com.cloudera.cdp.datalake.model.InstanceGroupRecipeResponse;
import java.util.*;

/**
 * The response for replacing recipes.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-14T11:34:34.979-07:00")
public class ReplaceRecipesResponse extends CdpResponse {

  /**
   * The list of recipes, which will be attached to the cluster.
   **/
  private List<InstanceGroupRecipeResponse> attachedRecipes = new ArrayList<InstanceGroupRecipeResponse>();

  /**
   * The list of recipes, which will be detached from the cluster.
   **/
  private List<InstanceGroupRecipeResponse> detachedRecipes = new ArrayList<InstanceGroupRecipeResponse>();

  /**
   * Getter for attachedRecipes.
   * The list of recipes, which will be attached to the cluster.
   **/
  @JsonProperty("attachedRecipes")
  public List<InstanceGroupRecipeResponse> getAttachedRecipes() {
    return attachedRecipes;
  }

  /**
   * Setter for attachedRecipes.
   * The list of recipes, which will be attached to the cluster.
   **/
  public void setAttachedRecipes(List<InstanceGroupRecipeResponse> attachedRecipes) {
    this.attachedRecipes = attachedRecipes;
  }

  /**
   * Getter for detachedRecipes.
   * The list of recipes, which will be detached from the cluster.
   **/
  @JsonProperty("detachedRecipes")
  public List<InstanceGroupRecipeResponse> getDetachedRecipes() {
    return detachedRecipes;
  }

  /**
   * Setter for detachedRecipes.
   * The list of recipes, which will be detached from the cluster.
   **/
  public void setDetachedRecipes(List<InstanceGroupRecipeResponse> detachedRecipes) {
    this.detachedRecipes = detachedRecipes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceRecipesResponse replaceRecipesResponse = (ReplaceRecipesResponse) o;
    if (!Objects.equals(this.attachedRecipes, replaceRecipesResponse.attachedRecipes)) {
      return false;
    }
    if (!Objects.equals(this.detachedRecipes, replaceRecipesResponse.detachedRecipes)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachedRecipes, detachedRecipes, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceRecipesResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    attachedRecipes: ").append(toIndentedString(attachedRecipes)).append("\n");
    sb.append("    detachedRecipes: ").append(toIndentedString(detachedRecipes)).append("\n");
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

