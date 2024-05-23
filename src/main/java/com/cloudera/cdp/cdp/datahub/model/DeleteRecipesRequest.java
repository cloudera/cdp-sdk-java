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
import java.util.*;

/**
 * Request object for delete recipe request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-05-22T20:53:52.887-07:00")
public class DeleteRecipesRequest  {

  /**
   * The names or CRNs of the recipes to be deleted.
   **/
  private List<String> recipeNames = new ArrayList<String>();

  /**
   * Getter for recipeNames.
   * The names or CRNs of the recipes to be deleted.
   **/
  @JsonProperty("recipeNames")
  public List<String> getRecipeNames() {
    return recipeNames;
  }

  /**
   * Setter for recipeNames.
   * The names or CRNs of the recipes to be deleted.
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
    DeleteRecipesRequest deleteRecipesRequest = (DeleteRecipesRequest) o;
    if (!Objects.equals(this.recipeNames, deleteRecipesRequest.recipeNames)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipeNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteRecipesRequest {\n");
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

