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

/**
 * Request object for create recipe request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-11T11:26:07.808-08:00")
public class CreateRecipeRequest  {

  /**
   * The name of the recipe. This name must be unique, must have between 5 and 100 characters, and must contain only lowercase letters, numbers and hyphens. Names are case-sensitive.
   **/
  private String recipeName = null;

  /**
   * The content of the recipe.
   **/
  private String recipeContent = null;

  /**
   * The type of recipe. Supported values are : PRE_SERVICE_DEPLOYMENT, PRE_TERMINATION, POST_SERVICE_DEPLOYMENT, POST_CLOUDERA_MANAGER_START.
   **/
  private String type = null;

  /**
   * The description of the recipe. The description can have a maximum of 1000 characters.
   **/
  private String description = null;

  /**
   * Getter for recipeName.
   * The name of the recipe. This name must be unique, must have between 5 and 100 characters, and must contain only lowercase letters, numbers and hyphens. Names are case-sensitive.
   **/
  @JsonProperty("recipeName")
  public String getRecipeName() {
    return recipeName;
  }

  /**
   * Setter for recipeName.
   * The name of the recipe. This name must be unique, must have between 5 and 100 characters, and must contain only lowercase letters, numbers and hyphens. Names are case-sensitive.
   **/
  public void setRecipeName(String recipeName) {
    this.recipeName = recipeName;
  }

  /**
   * Getter for recipeContent.
   * The content of the recipe.
   **/
  @JsonProperty("recipeContent")
  public String getRecipeContent() {
    return recipeContent;
  }

  /**
   * Setter for recipeContent.
   * The content of the recipe.
   **/
  public void setRecipeContent(String recipeContent) {
    this.recipeContent = recipeContent;
  }

  /**
   * Getter for type.
   * The type of recipe. Supported values are : PRE_SERVICE_DEPLOYMENT, PRE_TERMINATION, POST_SERVICE_DEPLOYMENT, POST_CLOUDERA_MANAGER_START.
   **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Setter for type.
   * The type of recipe. Supported values are : PRE_SERVICE_DEPLOYMENT, PRE_TERMINATION, POST_SERVICE_DEPLOYMENT, POST_CLOUDERA_MANAGER_START.
   **/
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Getter for description.
   * The description of the recipe. The description can have a maximum of 1000 characters.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * The description of the recipe. The description can have a maximum of 1000 characters.
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
    CreateRecipeRequest createRecipeRequest = (CreateRecipeRequest) o;
    if (!Objects.equals(this.recipeName, createRecipeRequest.recipeName)) {
      return false;
    }
    if (!Objects.equals(this.recipeContent, createRecipeRequest.recipeContent)) {
      return false;
    }
    if (!Objects.equals(this.type, createRecipeRequest.type)) {
      return false;
    }
    if (!Objects.equals(this.description, createRecipeRequest.description)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipeName, recipeContent, type, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRecipeRequest {\n");
    sb.append("    recipeName: ").append(toIndentedString(recipeName)).append("\n");
    sb.append("    recipeContent: ").append(toIndentedString(recipeContent)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

