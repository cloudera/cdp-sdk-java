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
import com.cloudera.cdp.datacatalog.model.AssetResponse;
import com.cloudera.cdp.datacatalog.model.DataShareExternalUser;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * Response of the Get Data Share operation.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-31T14:25:30.688-07:00")
public class GetDataShareResponse extends CdpResponse {

  /**
   * The unique identifier of the Data Share.
   **/
  private String dataShareId = null;

  /**
   * The name of the Data Share.
   **/
  private String dataShareName = null;

  /**
   * Indicates whether the Data Share is in Shared state or not.
   **/
  private Boolean isShared = null;

  /**
   * The date and time when the Data Share was created.
   **/
  private ZonedDateTime createdAt = null;

  /**
   * The date and time  when the Data Share was last updated.
   **/
  private ZonedDateTime updatedAt = null;

  /**
   * The CDP user who created the Data Share.
   **/
  private String createdBy = null;

  /**
   * List of keywords associated with the Data Share.
   **/
  private List<String> keywords = new ArrayList<String>();

  /**
   * List of the Atlas tags associated with the Data Share.
   **/
  private List<String> tags = new ArrayList<String>();

  /**
   * The date and time when the Data Share will expire.
   **/
  private ZonedDateTime expiryTime = null;

  /**
   * List of assets included in the Data Share.
   **/
  private List<AssetResponse> assets = new ArrayList<AssetResponse>();

  /**
   * List of external users granted access to the Data Share.
   **/
  private List<DataShareExternalUser> externalUsers = new ArrayList<DataShareExternalUser>();

  /**
   * A brief summary of the Data Share.
   **/
  private String summary = null;

  /**
   * The terms of use for the Data Share.
   **/
  private String termsOfUse = null;

  /**
   * Getter for dataShareId.
   * The unique identifier of the Data Share.
   **/
  @JsonProperty("dataShareId")
  public String getDataShareId() {
    return dataShareId;
  }

  /**
   * Setter for dataShareId.
   * The unique identifier of the Data Share.
   **/
  public void setDataShareId(String dataShareId) {
    this.dataShareId = dataShareId;
  }

  /**
   * Getter for dataShareName.
   * The name of the Data Share.
   **/
  @JsonProperty("dataShareName")
  public String getDataShareName() {
    return dataShareName;
  }

  /**
   * Setter for dataShareName.
   * The name of the Data Share.
   **/
  public void setDataShareName(String dataShareName) {
    this.dataShareName = dataShareName;
  }

  /**
   * Getter for isShared.
   * Indicates whether the Data Share is in Shared state or not.
   **/
  @JsonProperty("isShared")
  public Boolean getIsShared() {
    return isShared;
  }

  /**
   * Setter for isShared.
   * Indicates whether the Data Share is in Shared state or not.
   **/
  public void setIsShared(Boolean isShared) {
    this.isShared = isShared;
  }

  /**
   * Getter for createdAt.
   * The date and time when the Data Share was created.
   **/
  @JsonProperty("createdAt")
  public ZonedDateTime getCreatedAt() {
    return createdAt;
  }

  /**
   * Setter for createdAt.
   * The date and time when the Data Share was created.
   **/
  public void setCreatedAt(ZonedDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Getter for updatedAt.
   * The date and time  when the Data Share was last updated.
   **/
  @JsonProperty("updatedAt")
  public ZonedDateTime getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Setter for updatedAt.
   * The date and time  when the Data Share was last updated.
   **/
  public void setUpdatedAt(ZonedDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Getter for createdBy.
   * The CDP user who created the Data Share.
   **/
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Setter for createdBy.
   * The CDP user who created the Data Share.
   **/
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * Getter for keywords.
   * List of keywords associated with the Data Share.
   **/
  @JsonProperty("keywords")
  public List<String> getKeywords() {
    return keywords;
  }

  /**
   * Setter for keywords.
   * List of keywords associated with the Data Share.
   **/
  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  /**
   * Getter for tags.
   * List of the Atlas tags associated with the Data Share.
   **/
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * List of the Atlas tags associated with the Data Share.
   **/
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * Getter for expiryTime.
   * The date and time when the Data Share will expire.
   **/
  @JsonProperty("expiryTime")
  public ZonedDateTime getExpiryTime() {
    return expiryTime;
  }

  /**
   * Setter for expiryTime.
   * The date and time when the Data Share will expire.
   **/
  public void setExpiryTime(ZonedDateTime expiryTime) {
    this.expiryTime = expiryTime;
  }

  /**
   * Getter for assets.
   * List of assets included in the Data Share.
   **/
  @JsonProperty("assets")
  public List<AssetResponse> getAssets() {
    return assets;
  }

  /**
   * Setter for assets.
   * List of assets included in the Data Share.
   **/
  public void setAssets(List<AssetResponse> assets) {
    this.assets = assets;
  }

  /**
   * Getter for externalUsers.
   * List of external users granted access to the Data Share.
   **/
  @JsonProperty("externalUsers")
  public List<DataShareExternalUser> getExternalUsers() {
    return externalUsers;
  }

  /**
   * Setter for externalUsers.
   * List of external users granted access to the Data Share.
   **/
  public void setExternalUsers(List<DataShareExternalUser> externalUsers) {
    this.externalUsers = externalUsers;
  }

  /**
   * Getter for summary.
   * A brief summary of the Data Share.
   **/
  @JsonProperty("summary")
  public String getSummary() {
    return summary;
  }

  /**
   * Setter for summary.
   * A brief summary of the Data Share.
   **/
  public void setSummary(String summary) {
    this.summary = summary;
  }

  /**
   * Getter for termsOfUse.
   * The terms of use for the Data Share.
   **/
  @JsonProperty("termsOfUse")
  public String getTermsOfUse() {
    return termsOfUse;
  }

  /**
   * Setter for termsOfUse.
   * The terms of use for the Data Share.
   **/
  public void setTermsOfUse(String termsOfUse) {
    this.termsOfUse = termsOfUse;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDataShareResponse getDataShareResponse = (GetDataShareResponse) o;
    if (!Objects.equals(this.dataShareId, getDataShareResponse.dataShareId)) {
      return false;
    }
    if (!Objects.equals(this.dataShareName, getDataShareResponse.dataShareName)) {
      return false;
    }
    if (!Objects.equals(this.isShared, getDataShareResponse.isShared)) {
      return false;
    }
    if (!Objects.equals(this.createdAt, getDataShareResponse.createdAt)) {
      return false;
    }
    if (!Objects.equals(this.updatedAt, getDataShareResponse.updatedAt)) {
      return false;
    }
    if (!Objects.equals(this.createdBy, getDataShareResponse.createdBy)) {
      return false;
    }
    if (!Objects.equals(this.keywords, getDataShareResponse.keywords)) {
      return false;
    }
    if (!Objects.equals(this.tags, getDataShareResponse.tags)) {
      return false;
    }
    if (!Objects.equals(this.expiryTime, getDataShareResponse.expiryTime)) {
      return false;
    }
    if (!Objects.equals(this.assets, getDataShareResponse.assets)) {
      return false;
    }
    if (!Objects.equals(this.externalUsers, getDataShareResponse.externalUsers)) {
      return false;
    }
    if (!Objects.equals(this.summary, getDataShareResponse.summary)) {
      return false;
    }
    if (!Objects.equals(this.termsOfUse, getDataShareResponse.termsOfUse)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataShareId, dataShareName, isShared, createdAt, updatedAt, createdBy, keywords, tags, expiryTime, assets, externalUsers, summary, termsOfUse, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDataShareResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dataShareId: ").append(toIndentedString(dataShareId)).append("\n");
    sb.append("    dataShareName: ").append(toIndentedString(dataShareName)).append("\n");
    sb.append("    isShared: ").append(toIndentedString(isShared)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    externalUsers: ").append(toIndentedString(externalUsers)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    termsOfUse: ").append(toIndentedString(termsOfUse)).append("\n");
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

