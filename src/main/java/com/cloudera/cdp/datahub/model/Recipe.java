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
 * Information about a recipe.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-08-04T11:15:47.586-07:00")
public class Recipe  {

  /**
   * The name of the recipe.
   **/
  private String recipeName = null;

  /**
   * The CRN of the recipe.
   **/
  private String crn = null;

  /**
   * The content of the recipe.
   **/
  private String recipeContent = null;

  /**
   * The type of recipe. Supported values are : PRE_CLOUDERA_MANAGER_START, PRE_TERMINATION, POST_CLOUDERA_MANAGER_START, POST_CLUSTER_INSTALL.
   **/
  private String type = null;

  /**
   * The CRN of the creator of the recipe.
   **/
  private String creatorCrn = null;

  /**
   * The description of the recipe.
   **/
  private String description = null;

  /**
   * Getter for recipeName.
   * The name of the recipe.
   **/
  @JsonProperty("recipeName")
  public String getRecipeName() {
    return recipeName;
  }

  /**
   * Setter for recipeName.
   * The name of the recipe.
   **/
  public void setRecipeName(String recipeName) {
    this.recipeName = recipeName;
  }

  /**
   * Getter for crn.
   * The CRN of the recipe.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the recipe.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
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
   * The type of recipe. Supported values are : PRE_CLOUDERA_MANAGER_START, PRE_TERMINATION, POST_CLOUDERA_MANAGER_START, POST_CLUSTER_INSTALL.
   **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Setter for type.
   * The type of recipe. Supported values are : PRE_CLOUDERA_MANAGER_START, PRE_TERMINATION, POST_CLOUDERA_MANAGER_START, POST_CLUSTER_INSTALL.
   **/
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Getter for creatorCrn.
   * The CRN of the creator of the recipe.
   **/
  @JsonProperty("creatorCrn")
  public String getCreatorCrn() {
    return creatorCrn;
  }

  /**
   * Setter for creatorCrn.
   * The CRN of the creator of the recipe.
   **/
  public void setCreatorCrn(String creatorCrn) {
    this.creatorCrn = creatorCrn;
  }

  /**
   * Getter for description.
   * The description of the recipe.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * The description of the recipe.
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
    Recipe recipe = (Recipe) o;
    if (!Objects.equals(this.recipeName, recipe.recipeName)) {
      return false;
    }
    if (!Objects.equals(this.crn, recipe.crn)) {
      return false;
    }
    if (!Objects.equals(this.recipeContent, recipe.recipeContent)) {
      return false;
    }
    if (!Objects.equals(this.type, recipe.type)) {
      return false;
    }
    if (!Objects.equals(this.creatorCrn, recipe.creatorCrn)) {
      return false;
    }
    if (!Objects.equals(this.description, recipe.description)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipeName, crn, recipeContent, type, creatorCrn, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recipe {\n");
    sb.append("    recipeName: ").append(toIndentedString(recipeName)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    recipeContent: ").append(toIndentedString(recipeContent)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    creatorCrn: ").append(toIndentedString(creatorCrn)).append("\n");
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

