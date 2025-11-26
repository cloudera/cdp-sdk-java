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
import com.cloudera.cdp.datacatalog.model.AssetsToReviewRequest;
import java.util.*;

/**
 * Request to review suggested tags.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-26T08:05:42.264-08:00")
public class ReviewSuggestedTagsRequest  {

  /**
   * The CRN of the Datalake.
   **/
  private String datalakeCrn = null;

  /**
   * List of assets for which tags are being reviewed.
   **/
  private List<AssetsToReviewRequest> assets = new ArrayList<AssetsToReviewRequest>();

  /**
   * Action to be taken on the suggested tags. (ACCEPT, REJECT)
   **/
  private String action = null;

  /**
   * Getter for datalakeCrn.
   * The CRN of the Datalake.
   **/
  @JsonProperty("datalakeCrn")
  public String getDatalakeCrn() {
    return datalakeCrn;
  }

  /**
   * Setter for datalakeCrn.
   * The CRN of the Datalake.
   **/
  public void setDatalakeCrn(String datalakeCrn) {
    this.datalakeCrn = datalakeCrn;
  }

  /**
   * Getter for assets.
   * List of assets for which tags are being reviewed.
   **/
  @JsonProperty("assets")
  public List<AssetsToReviewRequest> getAssets() {
    return assets;
  }

  /**
   * Setter for assets.
   * List of assets for which tags are being reviewed.
   **/
  public void setAssets(List<AssetsToReviewRequest> assets) {
    this.assets = assets;
  }

  /**
   * Getter for action.
   * Action to be taken on the suggested tags. (ACCEPT, REJECT)
   **/
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  /**
   * Setter for action.
   * Action to be taken on the suggested tags. (ACCEPT, REJECT)
   **/
  public void setAction(String action) {
    this.action = action;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewSuggestedTagsRequest reviewSuggestedTagsRequest = (ReviewSuggestedTagsRequest) o;
    if (!Objects.equals(this.datalakeCrn, reviewSuggestedTagsRequest.datalakeCrn)) {
      return false;
    }
    if (!Objects.equals(this.assets, reviewSuggestedTagsRequest.assets)) {
      return false;
    }
    if (!Objects.equals(this.action, reviewSuggestedTagsRequest.action)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeCrn, assets, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewSuggestedTagsRequest {\n");
    sb.append("    datalakeCrn: ").append(toIndentedString(datalakeCrn)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

