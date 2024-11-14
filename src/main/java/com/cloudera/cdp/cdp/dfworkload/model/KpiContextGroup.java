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
import com.cloudera.cdp.dfworkload.model.KpiScopeComponent;
import java.util.*;

/**
 * Captures the use of a KPI in the context of a process group
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-11-13T12:48:27.995-08:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class KpiContextGroup  {

  /**
   * The id of the containing process group
   **/
  private String id = null;

  /**
   * The name of the containing process group
   **/
  private String name = null;

  /**
   * The scope components of the group
   **/
  private List<KpiScopeComponent> scopeComponents = new ArrayList<KpiScopeComponent>();

  /**
   * Getter for id.
   * The id of the containing process group
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * The id of the containing process group
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for name.
   * The name of the containing process group
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the containing process group
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for scopeComponents.
   * The scope components of the group
   **/
  @JsonProperty("scopeComponents")
  public List<KpiScopeComponent> getScopeComponents() {
    return scopeComponents;
  }

  /**
   * Setter for scopeComponents.
   * The scope components of the group
   **/
  public void setScopeComponents(List<KpiScopeComponent> scopeComponents) {
    this.scopeComponents = scopeComponents;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KpiContextGroup kpiContextGroup = (KpiContextGroup) o;
    if (!Objects.equals(this.id, kpiContextGroup.id)) {
      return false;
    }
    if (!Objects.equals(this.name, kpiContextGroup.name)) {
      return false;
    }
    if (!Objects.equals(this.scopeComponents, kpiContextGroup.scopeComponents)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, scopeComponents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KpiContextGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scopeComponents: ").append(toIndentedString(scopeComponents)).append("\n");
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

