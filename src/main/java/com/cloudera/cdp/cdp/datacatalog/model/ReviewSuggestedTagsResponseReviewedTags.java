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

package com.cloudera.cdp.datacatalog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Details of the reviewed tags.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-26T08:05:42.264-08:00")
public class ReviewSuggestedTagsResponseReviewedTags  {

  /**
   * The fully qualified name of the asset.
   **/
  private String qualifiedName = null;

  /**
   * List of tags on which have been reviewed.
   **/
  private List<String> tagsUpdated = new ArrayList<String>();

  /**
   * The current status of the tags. (ACCEPTED, REJECTED, FAILED)
   **/
  private String status = null;

  /**
   * Getter for qualifiedName.
   * The fully qualified name of the asset.
   **/
  @JsonProperty("qualifiedName")
  public String getQualifiedName() {
    return qualifiedName;
  }

  /**
   * Setter for qualifiedName.
   * The fully qualified name of the asset.
   **/
  public void setQualifiedName(String qualifiedName) {
    this.qualifiedName = qualifiedName;
  }

  /**
   * Getter for tagsUpdated.
   * List of tags on which have been reviewed.
   **/
  @JsonProperty("tagsUpdated")
  public List<String> getTagsUpdated() {
    return tagsUpdated;
  }

  /**
   * Setter for tagsUpdated.
   * List of tags on which have been reviewed.
   **/
  public void setTagsUpdated(List<String> tagsUpdated) {
    this.tagsUpdated = tagsUpdated;
  }

  /**
   * Getter for status.
   * The current status of the tags. (ACCEPTED, REJECTED, FAILED)
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The current status of the tags. (ACCEPTED, REJECTED, FAILED)
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewSuggestedTagsResponseReviewedTags reviewSuggestedTagsResponseReviewedTags = (ReviewSuggestedTagsResponseReviewedTags) o;
    if (!Objects.equals(this.qualifiedName, reviewSuggestedTagsResponseReviewedTags.qualifiedName)) {
      return false;
    }
    if (!Objects.equals(this.tagsUpdated, reviewSuggestedTagsResponseReviewedTags.tagsUpdated)) {
      return false;
    }
    if (!Objects.equals(this.status, reviewSuggestedTagsResponseReviewedTags.status)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(qualifiedName, tagsUpdated, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewSuggestedTagsResponseReviewedTags {\n");
    sb.append("    qualifiedName: ").append(toIndentedString(qualifiedName)).append("\n");
    sb.append("    tagsUpdated: ").append(toIndentedString(tagsUpdated)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

