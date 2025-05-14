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
import com.cloudera.cdp.dw.model.UpdateApplicationResources;
import java.util.*;
import java.util.Map;

/**
 * Request object for the updateResourceTemplate method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-14T11:34:33.811-07:00")
public class UpdateResourceTemplateRequest  {

  /**
   * The ID of the template.
   **/
  private String templateId = null;

  /**
   * Name of the template.
   **/
  private String name = null;

  /**
   * Description of the template.
   **/
  private String description = null;

  /**
   * The resource values of the template.
   **/
  private Map<String, UpdateApplicationResources> resources = new HashMap<String, UpdateApplicationResources>();

  /**
   * Getter for templateId.
   * The ID of the template.
   **/
  @JsonProperty("templateId")
  public String getTemplateId() {
    return templateId;
  }

  /**
   * Setter for templateId.
   * The ID of the template.
   **/
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
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
   * Getter for resources.
   * The resource values of the template.
   **/
  @JsonProperty("resources")
  public Map<String, UpdateApplicationResources> getResources() {
    return resources;
  }

  /**
   * Setter for resources.
   * The resource values of the template.
   **/
  public void setResources(Map<String, UpdateApplicationResources> resources) {
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
    UpdateResourceTemplateRequest updateResourceTemplateRequest = (UpdateResourceTemplateRequest) o;
    if (!Objects.equals(this.templateId, updateResourceTemplateRequest.templateId)) {
      return false;
    }
    if (!Objects.equals(this.name, updateResourceTemplateRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.description, updateResourceTemplateRequest.description)) {
      return false;
    }
    if (!Objects.equals(this.resources, updateResourceTemplateRequest.resources)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, name, description, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateResourceTemplateRequest {\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

