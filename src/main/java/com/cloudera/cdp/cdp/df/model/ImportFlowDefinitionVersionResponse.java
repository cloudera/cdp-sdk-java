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
 * Response object for ImportFlowDefinitionVersion
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-04-10T13:24:00.859-07:00")
public class ImportFlowDefinitionVersionResponse extends CdpResponse {

  /**
   * The flow version CRN
   **/
  private String crn = null;

  /**
   * The bucketIdentifier of the flow
   **/
  private String bucketIdentifier = null;

  /**
   * The author of the flow
   **/
  private String author = null;

  /**
   * The version of the flow
   **/
  private Integer version = null;

  /**
   * The timestamp of the flow
   **/
  private Long timestamp = null;

  /**
   * The number of deployments of the flow
   **/
  private Integer deploymentCount = null;

  /**
   * Comments about the flow
   **/
  private String comments = null;

  /**
   * Getter for crn.
   * The flow version CRN
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The flow version CRN
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for bucketIdentifier.
   * The bucketIdentifier of the flow
   **/
  @JsonProperty("bucketIdentifier")
  public String getBucketIdentifier() {
    return bucketIdentifier;
  }

  /**
   * Setter for bucketIdentifier.
   * The bucketIdentifier of the flow
   **/
  public void setBucketIdentifier(String bucketIdentifier) {
    this.bucketIdentifier = bucketIdentifier;
  }

  /**
   * Getter for author.
   * The author of the flow
   **/
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }

  /**
   * Setter for author.
   * The author of the flow
   **/
  public void setAuthor(String author) {
    this.author = author;
  }

  /**
   * Getter for version.
   * The version of the flow
   **/
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  /**
   * Setter for version.
   * The version of the flow
   **/
  public void setVersion(Integer version) {
    this.version = version;
  }

  /**
   * Getter for timestamp.
   * The timestamp of the flow
   **/
  @JsonProperty("timestamp")
  public Long getTimestamp() {
    return timestamp;
  }

  /**
   * Setter for timestamp.
   * The timestamp of the flow
   **/
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Getter for deploymentCount.
   * The number of deployments of the flow
   **/
  @JsonProperty("deploymentCount")
  public Integer getDeploymentCount() {
    return deploymentCount;
  }

  /**
   * Setter for deploymentCount.
   * The number of deployments of the flow
   **/
  public void setDeploymentCount(Integer deploymentCount) {
    this.deploymentCount = deploymentCount;
  }

  /**
   * Getter for comments.
   * Comments about the flow
   **/
  @JsonProperty("comments")
  public String getComments() {
    return comments;
  }

  /**
   * Setter for comments.
   * Comments about the flow
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
    ImportFlowDefinitionVersionResponse importFlowDefinitionVersionResponse = (ImportFlowDefinitionVersionResponse) o;
    if (!Objects.equals(this.crn, importFlowDefinitionVersionResponse.crn)) {
      return false;
    }
    if (!Objects.equals(this.bucketIdentifier, importFlowDefinitionVersionResponse.bucketIdentifier)) {
      return false;
    }
    if (!Objects.equals(this.author, importFlowDefinitionVersionResponse.author)) {
      return false;
    }
    if (!Objects.equals(this.version, importFlowDefinitionVersionResponse.version)) {
      return false;
    }
    if (!Objects.equals(this.timestamp, importFlowDefinitionVersionResponse.timestamp)) {
      return false;
    }
    if (!Objects.equals(this.deploymentCount, importFlowDefinitionVersionResponse.deploymentCount)) {
      return false;
    }
    if (!Objects.equals(this.comments, importFlowDefinitionVersionResponse.comments)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, bucketIdentifier, author, version, timestamp, deploymentCount, comments, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportFlowDefinitionVersionResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    bucketIdentifier: ").append(toIndentedString(bucketIdentifier)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    deploymentCount: ").append(toIndentedString(deploymentCount)).append("\n");
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

