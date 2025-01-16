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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Request object for attaching recipes to FreeIPA.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-15T12:52:22.145-08:00")
public class AttachFreeIpaRecipesRequest  {

  /**
   * The environment name or CRN of the FreeIPA.
   **/
  private String environment = null;

  /**
   * The list of recipes to attach.
   **/
  private List<String> recipes = new ArrayList<String>();

  /**
   * Getter for environment.
   * The environment name or CRN of the FreeIPA.
   **/
  @JsonProperty("environment")
  public String getEnvironment() {
    return environment;
  }

  /**
   * Setter for environment.
   * The environment name or CRN of the FreeIPA.
   **/
  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  /**
   * Getter for recipes.
   * The list of recipes to attach.
   **/
  @JsonProperty("recipes")
  public List<String> getRecipes() {
    return recipes;
  }

  /**
   * Setter for recipes.
   * The list of recipes to attach.
   **/
  public void setRecipes(List<String> recipes) {
    this.recipes = recipes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachFreeIpaRecipesRequest attachFreeIpaRecipesRequest = (AttachFreeIpaRecipesRequest) o;
    if (!Objects.equals(this.environment, attachFreeIpaRecipesRequest.environment)) {
      return false;
    }
    if (!Objects.equals(this.recipes, attachFreeIpaRecipesRequest.recipes)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, recipes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachFreeIpaRecipesRequest {\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    recipes: ").append(toIndentedString(recipes)).append("\n");
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

