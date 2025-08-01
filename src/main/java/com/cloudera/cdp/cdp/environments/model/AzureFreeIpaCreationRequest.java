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
 * Request object for creating FreeIPA in the environment.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:42.850-07:00")
public class AzureFreeIpaCreationRequest  {

  /**
   * The number of FreeIPA instances to create per group when creating FreeIPA in the environment
   **/
  private Integer instanceCountByGroup = null;

  /**
   * The recipes for the FreeIPA cluster.
   **/
  private List<String> recipes = new ArrayList<String>();

  /**
   * Custom instance type of FreeIPA instances.
   **/
  private String instanceType = null;

  /**
   * Flag that enables deployment of the FreeIPA in a multi-availability zone.
   **/
  private Boolean multiAz = false;

  /**
   * Getter for instanceCountByGroup.
   * The number of FreeIPA instances to create per group when creating FreeIPA in the environment
   **/
  @JsonProperty("instanceCountByGroup")
  public Integer getInstanceCountByGroup() {
    return instanceCountByGroup;
  }

  /**
   * Setter for instanceCountByGroup.
   * The number of FreeIPA instances to create per group when creating FreeIPA in the environment
   **/
  public void setInstanceCountByGroup(Integer instanceCountByGroup) {
    this.instanceCountByGroup = instanceCountByGroup;
  }

  /**
   * Getter for recipes.
   * The recipes for the FreeIPA cluster.
   **/
  @JsonProperty("recipes")
  public List<String> getRecipes() {
    return recipes;
  }

  /**
   * Setter for recipes.
   * The recipes for the FreeIPA cluster.
   **/
  public void setRecipes(List<String> recipes) {
    this.recipes = recipes;
  }

  /**
   * Getter for instanceType.
   * Custom instance type of FreeIPA instances.
   **/
  @JsonProperty("instanceType")
  public String getInstanceType() {
    return instanceType;
  }

  /**
   * Setter for instanceType.
   * Custom instance type of FreeIPA instances.
   **/
  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  /**
   * Getter for multiAz.
   * Flag that enables deployment of the FreeIPA in a multi-availability zone.
   **/
  @JsonProperty("multiAz")
  public Boolean getMultiAz() {
    return multiAz;
  }

  /**
   * Setter for multiAz.
   * Flag that enables deployment of the FreeIPA in a multi-availability zone.
   **/
  public void setMultiAz(Boolean multiAz) {
    this.multiAz = multiAz;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureFreeIpaCreationRequest azureFreeIpaCreationRequest = (AzureFreeIpaCreationRequest) o;
    if (!Objects.equals(this.instanceCountByGroup, azureFreeIpaCreationRequest.instanceCountByGroup)) {
      return false;
    }
    if (!Objects.equals(this.recipes, azureFreeIpaCreationRequest.recipes)) {
      return false;
    }
    if (!Objects.equals(this.instanceType, azureFreeIpaCreationRequest.instanceType)) {
      return false;
    }
    if (!Objects.equals(this.multiAz, azureFreeIpaCreationRequest.multiAz)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceCountByGroup, recipes, instanceType, multiAz);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureFreeIpaCreationRequest {\n");
    sb.append("    instanceCountByGroup: ").append(toIndentedString(instanceCountByGroup)).append("\n");
    sb.append("    recipes: ").append(toIndentedString(recipes)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    multiAz: ").append(toIndentedString(multiAz)).append("\n");
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

