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

/**
 * Provides scoping when defining KPIs
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-16T07:43:45.932-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class KpiScopeComponent  {

  /**
   * The internal id of the scope, for example the connection ID
   **/
  private String id = null;

  /**
   * The child name to show in the hierarchical chooser
   **/
  private String name = null;

  /**
   * Getter for id.
   * The internal id of the scope, for example the connection ID
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * The internal id of the scope, for example the connection ID
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for name.
   * The child name to show in the hierarchical chooser
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The child name to show in the hierarchical chooser
   **/
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KpiScopeComponent kpiScopeComponent = (KpiScopeComponent) o;
    if (!Objects.equals(this.id, kpiScopeComponent.id)) {
      return false;
    }
    if (!Objects.equals(this.name, kpiScopeComponent.name)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KpiScopeComponent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

