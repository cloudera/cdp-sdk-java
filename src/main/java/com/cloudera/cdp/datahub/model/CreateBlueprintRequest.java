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
 * Request object for create blueprint request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2019-08-21T14:31:31.470-07:00")
public class CreateBlueprintRequest  {

  /**
   * The name of the blueprint. This name must be unique, must have between 5 and 100 characters, and must contain only lowercase letters, numbers and hyphens. Names are case-sensitive.
   **/
  private String blueprintName = null;

  /**
   * The blueprint content.
   **/
  private String blueprintContent = null;

  /**
   * The blueprint source URL.
   **/
  private String blueprintSourceURL = null;

  /**
   * The description of the blueprint. The description can have a maximum of 1000 characters.
   **/
  private String description = null;

  /**
   * Tags to be added to the blueprint.
   **/
  private List<DatahubResourceTagRequest> tags = new ArrayList<DatahubResourceTagRequest>();

  /**
   * Getter for blueprintName.
   * The name of the blueprint. This name must be unique, must have between 5 and 100 characters, and must contain only lowercase letters, numbers and hyphens. Names are case-sensitive.
   **/
  @JsonProperty("blueprintName")
  public String getBlueprintName() {
    return blueprintName;
  }

  /**
   * Setter for blueprintName.
   * The name of the blueprint. This name must be unique, must have between 5 and 100 characters, and must contain only lowercase letters, numbers and hyphens. Names are case-sensitive.
   **/
  public void setBlueprintName(String blueprintName) {
    this.blueprintName = blueprintName;
  }

  /**
   * Getter for blueprintContent.
   * The blueprint content.
   **/
  @JsonProperty("blueprintContent")
  public String getBlueprintContent() {
    return blueprintContent;
  }

  /**
   * Setter for blueprintContent.
   * The blueprint content.
   **/
  public void setBlueprintContent(String blueprintContent) {
    this.blueprintContent = blueprintContent;
  }

  /**
   * Getter for blueprintSourceURL.
   * The blueprint source URL.
   **/
  @JsonProperty("blueprintSourceURL")
  public String getBlueprintSourceURL() {
    return blueprintSourceURL;
  }

  /**
   * Setter for blueprintSourceURL.
   * The blueprint source URL.
   **/
  public void setBlueprintSourceURL(String blueprintSourceURL) {
    this.blueprintSourceURL = blueprintSourceURL;
  }

  /**
   * Getter for description.
   * The description of the blueprint. The description can have a maximum of 1000 characters.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * The description of the blueprint. The description can have a maximum of 1000 characters.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for tags.
   * Tags to be added to the blueprint.
   **/
  @JsonProperty("tags")
  public List<DatahubResourceTagRequest> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Tags to be added to the blueprint.
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
    CreateBlueprintRequest createBlueprintRequest = (CreateBlueprintRequest) o;
    if (!Objects.equals(this.blueprintName, createBlueprintRequest.blueprintName)) {
      return false;
    }
    if (!Objects.equals(this.blueprintContent, createBlueprintRequest.blueprintContent)) {
      return false;
    }
    if (!Objects.equals(this.blueprintSourceURL, createBlueprintRequest.blueprintSourceURL)) {
      return false;
    }
    if (!Objects.equals(this.description, createBlueprintRequest.description)) {
      return false;
    }
    if (!Objects.equals(this.tags, createBlueprintRequest.tags)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(blueprintName, blueprintContent, blueprintSourceURL, description, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBlueprintRequest {\n");
    sb.append("    blueprintName: ").append(toIndentedString(blueprintName)).append("\n");
    sb.append("    blueprintContent: ").append(toIndentedString(blueprintContent)).append("\n");
    sb.append("    blueprintSourceURL: ").append(toIndentedString(blueprintSourceURL)).append("\n");
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

