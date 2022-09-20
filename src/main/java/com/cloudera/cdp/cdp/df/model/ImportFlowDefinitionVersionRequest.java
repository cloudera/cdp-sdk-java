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
 * Request object for ImportFlowDefinitionVersion
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-09-20T12:01:41.557-07:00")
public class ImportFlowDefinitionVersionRequest  {

  /**
   * The CRN of the previously uploaded flow.
   **/
  private String flowCrn = null;

  /**
   * The file to be uploaded.
   **/
  private String file = null;

  /**
   * The comments of the flow version.
   **/
  private String comments = null;

  /**
   * Getter for flowCrn.
   * The CRN of the previously uploaded flow.
   **/
  @JsonProperty("flowCrn")
  public String getFlowCrn() {
    return flowCrn;
  }

  /**
   * Setter for flowCrn.
   * The CRN of the previously uploaded flow.
   **/
  public void setFlowCrn(String flowCrn) {
    this.flowCrn = flowCrn;
  }

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
   * Getter for comments.
   * The comments of the flow version.
   **/
  @JsonProperty("comments")
  public String getComments() {
    return comments;
  }

  /**
   * Setter for comments.
   * The comments of the flow version.
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
    ImportFlowDefinitionVersionRequest importFlowDefinitionVersionRequest = (ImportFlowDefinitionVersionRequest) o;
    if (!Objects.equals(this.flowCrn, importFlowDefinitionVersionRequest.flowCrn)) {
      return false;
    }
    if (!Objects.equals(this.file, importFlowDefinitionVersionRequest.file)) {
      return false;
    }
    if (!Objects.equals(this.comments, importFlowDefinitionVersionRequest.comments)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowCrn, file, comments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportFlowDefinitionVersionRequest {\n");
    sb.append("    flowCrn: ").append(toIndentedString(flowCrn)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
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

