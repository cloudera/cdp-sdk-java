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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.dw.model.CreateApplicationResources;
import java.util.*;
import java.util.Map;

/**
 * Request object for the createResourceTemplate method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-16T07:43:41.843-07:00")
public class CreateResourceTemplateRequest  {

  /**
   * DEPRECATED: ID of the template. This field is unused and always empty. Subject of removal.
   **/
  private String id = null;

  /**
   * Name of the template.
   **/
  private String name = null;

  /**
   * Description of the template.
   **/
  private String description = null;

  /**
   * Entity type for which the template will be created. (Possible values: impala, hive, trino, hue, dbc, viz).
   **/
  private String entityType = null;

  /**
   * The resource values of the template.
   **/
  private Map<String, CreateApplicationResources> resources = new HashMap<String, CreateApplicationResources>();

  /**
   * Getter for id.
   * DEPRECATED: ID of the template. This field is unused and always empty. Subject of removal.
   **/
  @Deprecated
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * DEPRECATED: ID of the template. This field is unused and always empty. Subject of removal.
   **/
  @Deprecated
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for name.
   * Name of the template.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name of the template.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for description.
   * Description of the template.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * Description of the template.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for entityType.
   * Entity type for which the template will be created. (Possible values: impala, hive, trino, hue, dbc, viz).
   **/
  @JsonProperty("entityType")
  public String getEntityType() {
    return entityType;
  }

  /**
   * Setter for entityType.
   * Entity type for which the template will be created. (Possible values: impala, hive, trino, hue, dbc, viz).
   **/
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  /**
   * Getter for resources.
   * The resource values of the template.
   **/
  @JsonProperty("resources")
  public Map<String, CreateApplicationResources> getResources() {
    return resources;
  }

  /**
   * Setter for resources.
   * The resource values of the template.
   **/
  public void setResources(Map<String, CreateApplicationResources> resources) {
    this.resources = resources;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateResourceTemplateRequest createResourceTemplateRequest = (CreateResourceTemplateRequest) o;
    if (!Objects.equals(this.id, createResourceTemplateRequest.id)) {
      return false;
    }
    if (!Objects.equals(this.name, createResourceTemplateRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.description, createResourceTemplateRequest.description)) {
      return false;
    }
    if (!Objects.equals(this.entityType, createResourceTemplateRequest.entityType)) {
      return false;
    }
    if (!Objects.equals(this.resources, createResourceTemplateRequest.resources)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, entityType, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateResourceTemplateRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

