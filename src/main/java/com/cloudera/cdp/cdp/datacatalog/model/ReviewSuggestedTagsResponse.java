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
import com.cloudera.cdp.datacatalog.model.ReviewSuggestedTagsResponseReviewedTags;
import java.util.*;

/**
 * Review suggested tags response.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-26T08:05:42.264-08:00")
public class ReviewSuggestedTagsResponse extends CdpResponse {

  /**
   * List of reviewed tags.
   **/
  private List<ReviewSuggestedTagsResponseReviewedTags> reviewedTags = new ArrayList<ReviewSuggestedTagsResponseReviewedTags>();

  /**
   * Getter for reviewedTags.
   * List of reviewed tags.
   **/
  @JsonProperty("reviewedTags")
  public List<ReviewSuggestedTagsResponseReviewedTags> getReviewedTags() {
    return reviewedTags;
  }

  /**
   * Setter for reviewedTags.
   * List of reviewed tags.
   **/
  public void setReviewedTags(List<ReviewSuggestedTagsResponseReviewedTags> reviewedTags) {
    this.reviewedTags = reviewedTags;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewSuggestedTagsResponse reviewSuggestedTagsResponse = (ReviewSuggestedTagsResponse) o;
    if (!Objects.equals(this.reviewedTags, reviewSuggestedTagsResponse.reviewedTags)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewedTags, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewSuggestedTagsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    reviewedTags: ").append(toIndentedString(reviewedTags)).append("\n");
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

