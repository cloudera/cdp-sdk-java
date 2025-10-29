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

/**
 * Resource template.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-28T14:00:26.728-07:00")
public class ResourceTemplateResponse extends CdpResponse {

  /**
   * Identifier of the template.
   **/
  private String id = null;

  /**
   * Name of the template.
   **/
  private String name = null;

  /**
   * Version number.
   **/
  private Integer version = null;

  /**
   * The type of the entity, which can be one of the following: Hive, Impala, Hue, DataViz.
   **/
  private String entityType = null;

  /**
   * Short description.
   **/
  private String description = null;

  /**
   * Denotes whether it is the default template or not.
   **/
  private Boolean isDefault = null;

  /**
   * Getter for id.
   * Identifier of the template.
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * Identifier of the template.
   **/
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
   * Getter for version.
   * Version number.
   **/
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  /**
   * Setter for version.
   * Version number.
   **/
  public void setVersion(Integer version) {
    this.version = version;
  }

  /**
   * Getter for entityType.
   * The type of the entity, which can be one of the following: Hive, Impala, Hue, DataViz.
   **/
  @JsonProperty("entityType")
  public String getEntityType() {
    return entityType;
  }

  /**
   * Setter for entityType.
   * The type of the entity, which can be one of the following: Hive, Impala, Hue, DataViz.
   **/
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  /**
   * Getter for description.
   * Short description.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * Short description.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for isDefault.
   * Denotes whether it is the default template or not.
   **/
  @JsonProperty("isDefault")
  public Boolean getIsDefault() {
    return isDefault;
  }

  /**
   * Setter for isDefault.
   * Denotes whether it is the default template or not.
   **/
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceTemplateResponse resourceTemplateResponse = (ResourceTemplateResponse) o;
    if (!Objects.equals(this.id, resourceTemplateResponse.id)) {
      return false;
    }
    if (!Objects.equals(this.name, resourceTemplateResponse.name)) {
      return false;
    }
    if (!Objects.equals(this.version, resourceTemplateResponse.version)) {
      return false;
    }
    if (!Objects.equals(this.entityType, resourceTemplateResponse.entityType)) {
      return false;
    }
    if (!Objects.equals(this.description, resourceTemplateResponse.description)) {
      return false;
    }
    if (!Objects.equals(this.isDefault, resourceTemplateResponse.isDefault)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, version, entityType, description, isDefault, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceTemplateResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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

