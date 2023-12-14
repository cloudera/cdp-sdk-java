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
 * A representation of a artifact detail version
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-12-13T15:07:00.185-08:00")
public class ArtifactVersion  {

  /**
   * The artifact version CRN
   **/
  private String crn = null;

  /**
   * The bucketIdentifier of the artifact
   **/
  private String bucketIdentifier = null;

  /**
   * The author of the artifact
   **/
  private String author = null;

  /**
   * The version of the artifactVersion
   **/
  private Integer version = null;

  /**
   * The timestamp of the artifactVersion
   **/
  private Long timestamp = null;

  /**
   * The number of deployments of the artifactVersion
   **/
  private Integer deploymentCount = null;

  /**
   * Comments about the version
   **/
  private String comments = null;

  /**
   * The number of drafts associated with the version.
   **/
  private Integer draftCount = null;

  /**
   * Getter for crn.
   * The artifact version CRN
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The artifact version CRN
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for bucketIdentifier.
   * The bucketIdentifier of the artifact
   **/
  @JsonProperty("bucketIdentifier")
  public String getBucketIdentifier() {
    return bucketIdentifier;
  }

  /**
   * Setter for bucketIdentifier.
   * The bucketIdentifier of the artifact
   **/
  public void setBucketIdentifier(String bucketIdentifier) {
    this.bucketIdentifier = bucketIdentifier;
  }

  /**
   * Getter for author.
   * The author of the artifact
   **/
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }

  /**
   * Setter for author.
   * The author of the artifact
   **/
  public void setAuthor(String author) {
    this.author = author;
  }

  /**
   * Getter for version.
   * The version of the artifactVersion
   **/
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  /**
   * Setter for version.
   * The version of the artifactVersion
   **/
  public void setVersion(Integer version) {
    this.version = version;
  }

  /**
   * Getter for timestamp.
   * The timestamp of the artifactVersion
   **/
  @JsonProperty("timestamp")
  public Long getTimestamp() {
    return timestamp;
  }

  /**
   * Setter for timestamp.
   * The timestamp of the artifactVersion
   **/
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Getter for deploymentCount.
   * The number of deployments of the artifactVersion
   **/
  @JsonProperty("deploymentCount")
  public Integer getDeploymentCount() {
    return deploymentCount;
  }

  /**
   * Setter for deploymentCount.
   * The number of deployments of the artifactVersion
   **/
  public void setDeploymentCount(Integer deploymentCount) {
    this.deploymentCount = deploymentCount;
  }

  /**
   * Getter for comments.
   * Comments about the version
   **/
  @JsonProperty("comments")
  public String getComments() {
    return comments;
  }

  /**
   * Setter for comments.
   * Comments about the version
   **/
  public void setComments(String comments) {
    this.comments = comments;
  }

  /**
   * Getter for draftCount.
   * The number of drafts associated with the version.
   **/
  @JsonProperty("draftCount")
  public Integer getDraftCount() {
    return draftCount;
  }

  /**
   * Setter for draftCount.
   * The number of drafts associated with the version.
   **/
  public void setDraftCount(Integer draftCount) {
    this.draftCount = draftCount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactVersion artifactVersion = (ArtifactVersion) o;
    if (!Objects.equals(this.crn, artifactVersion.crn)) {
      return false;
    }
    if (!Objects.equals(this.bucketIdentifier, artifactVersion.bucketIdentifier)) {
      return false;
    }
    if (!Objects.equals(this.author, artifactVersion.author)) {
      return false;
    }
    if (!Objects.equals(this.version, artifactVersion.version)) {
      return false;
    }
    if (!Objects.equals(this.timestamp, artifactVersion.timestamp)) {
      return false;
    }
    if (!Objects.equals(this.deploymentCount, artifactVersion.deploymentCount)) {
      return false;
    }
    if (!Objects.equals(this.comments, artifactVersion.comments)) {
      return false;
    }
    if (!Objects.equals(this.draftCount, artifactVersion.draftCount)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, bucketIdentifier, author, version, timestamp, deploymentCount, comments, draftCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactVersion {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    bucketIdentifier: ").append(toIndentedString(bucketIdentifier)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    deploymentCount: ").append(toIndentedString(deploymentCount)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    draftCount: ").append(toIndentedString(draftCount)).append("\n");
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

