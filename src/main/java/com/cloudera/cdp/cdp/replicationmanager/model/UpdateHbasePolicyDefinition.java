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

package com.cloudera.cdp.replicationmanager.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * HBase policy update request definition.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-09T13:56:16.355-07:00")
public class UpdateHbasePolicyDefinition  {

  /**
   * The policy name.
   **/
  private String name = null;

  /**
   * Description of the policy.
   **/
  private String description = null;

  /**
   * List of tables to be replicated. The items should be in \"namespace:tablename\" format.
   **/
  private List<String> tables = null;

  /**
   * Getter for name.
   * The policy name.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The policy name.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for description.
   * Description of the policy.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * Description of the policy.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for tables.
   * List of tables to be replicated. The items should be in \&quot;namespace:tablename\&quot; format.
   **/
  @JsonProperty("tables")
  public List<String> getTables() {
    return tables;
  }

  /**
   * Setter for tables.
   * List of tables to be replicated. The items should be in \&quot;namespace:tablename\&quot; format.
   **/
  public void setTables(List<String> tables) {
    this.tables = tables;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateHbasePolicyDefinition updateHbasePolicyDefinition = (UpdateHbasePolicyDefinition) o;
    if (!Objects.equals(this.name, updateHbasePolicyDefinition.name)) {
      return false;
    }
    if (!Objects.equals(this.description, updateHbasePolicyDefinition.description)) {
      return false;
    }
    if (!Objects.equals(this.tables, updateHbasePolicyDefinition.tables)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, tables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateHbasePolicyDefinition {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
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

