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

package com.cloudera.cdp.df.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object for ImportFlowDefinition
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-09-28T16:30:06.540-07:00")
public class ImportFlowDefinitionRequest  {

  /**
   * The file to be uploaded.
   **/
  private String file = null;

  /**
   * The name of the flow.
   **/
  private String name = null;

  /**
   * The description of the flow.
   **/
  private String description = null;

  /**
   * The comments of the flow.
   **/
  private String comments = null;

  /**
   * Getter for file.
   * The file to be uploaded.
   **/
  @JsonProperty("file")
  public String getFile() {
    return file;
  }

  /**
   * Setter for file.
   * The file to be uploaded.
   **/
  public void setFile(String file) {
    this.file = file;
  }

  /**
   * Getter for name.
   * The name of the flow.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the flow.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for description.
   * The description of the flow.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * The description of the flow.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for comments.
   * The comments of the flow.
   **/
  @JsonProperty("comments")
  public String getComments() {
    return comments;
  }

  /**
   * Setter for comments.
   * The comments of the flow.
   **/
  public void setComments(String comments) {
    this.comments = comments;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportFlowDefinitionRequest importFlowDefinitionRequest = (ImportFlowDefinitionRequest) o;
    if (!Objects.equals(this.file, importFlowDefinitionRequest.file)) {
      return false;
    }
    if (!Objects.equals(this.name, importFlowDefinitionRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.description, importFlowDefinitionRequest.description)) {
      return false;
    }
    if (!Objects.equals(this.comments, importFlowDefinitionRequest.comments)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, name, description, comments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportFlowDefinitionRequest {\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

