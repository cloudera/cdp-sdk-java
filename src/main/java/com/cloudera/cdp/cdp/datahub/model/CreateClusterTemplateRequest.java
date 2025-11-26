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
import com.cloudera.cdp.datahub.model.DatahubResourceTagRequest;
import java.util.*;

/**
 * Request object for create cluster template request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-26T08:05:40.396-08:00")
public class CreateClusterTemplateRequest  {

  /**
   * The name of the cluster template. This name must be unique, must have between 5 and 100 characters, and must contain only lowercase letters, numbers and hyphens. Names are case-sensitive.
   **/
  private String clusterTemplateName = null;

  /**
   * The cluster template content.
   **/
  private String clusterTemplateContent = null;

  /**
   * The description of the cluster template. The description can have a maximum of 1000 characters.
   **/
  private String description = null;

  /**
   * Tags to be added to the cluster template.
   **/
  private List<DatahubResourceTagRequest> tags = new ArrayList<DatahubResourceTagRequest>();

  /**
   * Getter for clusterTemplateName.
   * The name of the cluster template. This name must be unique, must have between 5 and 100 characters, and must contain only lowercase letters, numbers and hyphens. Names are case-sensitive.
   **/
  @JsonProperty("clusterTemplateName")
  public String getClusterTemplateName() {
    return clusterTemplateName;
  }

  /**
   * Setter for clusterTemplateName.
   * The name of the cluster template. This name must be unique, must have between 5 and 100 characters, and must contain only lowercase letters, numbers and hyphens. Names are case-sensitive.
   **/
  public void setClusterTemplateName(String clusterTemplateName) {
    this.clusterTemplateName = clusterTemplateName;
  }

  /**
   * Getter for clusterTemplateContent.
   * The cluster template content.
   **/
  @JsonProperty("clusterTemplateContent")
  public String getClusterTemplateContent() {
    return clusterTemplateContent;
  }

  /**
   * Setter for clusterTemplateContent.
   * The cluster template content.
   **/
  public void setClusterTemplateContent(String clusterTemplateContent) {
    this.clusterTemplateContent = clusterTemplateContent;
  }

  /**
   * Getter for description.
   * The description of the cluster template. The description can have a maximum of 1000 characters.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * The description of the cluster template. The description can have a maximum of 1000 characters.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for tags.
   * Tags to be added to the cluster template.
   **/
  @JsonProperty("tags")
  public List<DatahubResourceTagRequest> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Tags to be added to the cluster template.
   **/
  public void setTags(List<DatahubResourceTagRequest> tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateClusterTemplateRequest createClusterTemplateRequest = (CreateClusterTemplateRequest) o;
    if (!Objects.equals(this.clusterTemplateName, createClusterTemplateRequest.clusterTemplateName)) {
      return false;
    }
    if (!Objects.equals(this.clusterTemplateContent, createClusterTemplateRequest.clusterTemplateContent)) {
      return false;
    }
    if (!Objects.equals(this.description, createClusterTemplateRequest.description)) {
      return false;
    }
    if (!Objects.equals(this.tags, createClusterTemplateRequest.tags)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterTemplateName, clusterTemplateContent, description, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateClusterTemplateRequest {\n");
    sb.append("    clusterTemplateName: ").append(toIndentedString(clusterTemplateName)).append("\n");
    sb.append("    clusterTemplateContent: ").append(toIndentedString(clusterTemplateContent)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

