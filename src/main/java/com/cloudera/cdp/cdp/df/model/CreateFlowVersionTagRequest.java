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
 * Request object for the CreateFlowVersionTag method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-10-16T16:58:53.112-07:00")
public class CreateFlowVersionTagRequest  {

  /**
   * The flow version CRN.
   **/
  private String flowVersionCrn = null;

  /**
   * The name of the version tag.
   **/
  private String tagName = null;

  /**
   * The color of the version tag (optional).
   **/
  private String tagColor = null;

  /**
   * Getter for flowVersionCrn.
   * The flow version CRN.
   **/
  @JsonProperty("flowVersionCrn")
  public String getFlowVersionCrn() {
    return flowVersionCrn;
  }

  /**
   * Setter for flowVersionCrn.
   * The flow version CRN.
   **/
  public void setFlowVersionCrn(String flowVersionCrn) {
    this.flowVersionCrn = flowVersionCrn;
  }

  /**
   * Getter for tagName.
   * The name of the version tag.
   **/
  @JsonProperty("tagName")
  public String getTagName() {
    return tagName;
  }

  /**
   * Setter for tagName.
   * The name of the version tag.
   **/
  public void setTagName(String tagName) {
    this.tagName = tagName;
  }

  /**
   * Getter for tagColor.
   * The color of the version tag (optional).
   **/
  @JsonProperty("tagColor")
  public String getTagColor() {
    return tagColor;
  }

  /**
   * Setter for tagColor.
   * The color of the version tag (optional).
   **/
  public void setTagColor(String tagColor) {
    this.tagColor = tagColor;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFlowVersionTagRequest createFlowVersionTagRequest = (CreateFlowVersionTagRequest) o;
    if (!Objects.equals(this.flowVersionCrn, createFlowVersionTagRequest.flowVersionCrn)) {
      return false;
    }
    if (!Objects.equals(this.tagName, createFlowVersionTagRequest.tagName)) {
      return false;
    }
    if (!Objects.equals(this.tagColor, createFlowVersionTagRequest.tagColor)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowVersionCrn, tagName, tagColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFlowVersionTagRequest {\n");
    sb.append("    flowVersionCrn: ").append(toIndentedString(flowVersionCrn)).append("\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
    sb.append("    tagColor: ").append(toIndentedString(tagColor)).append("\n");
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

