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
import java.time.ZonedDateTime;
import java.util.*;

/**
 * Data Share response.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-04-15T08:44:50.980-07:00")
public class DataShareResponse extends CdpResponse {

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
   * The CDP user who created the Data Share.
   **/
  private String createdBy = null;

  /**
   * List of keywords associated with the Data Share.
   **/
  private List<String> keywords = new ArrayList<String>();

  /**
   * The date and time when the Data Share will expire.
   **/
  private ZonedDateTime expiryTime = null;

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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataShareResponse dataShareResponse = (DataShareResponse) o;
    if (!Objects.equals(this.dataShareId, dataShareResponse.dataShareId)) {
      return false;
    }
    if (!Objects.equals(this.dataShareName, dataShareResponse.dataShareName)) {
      return false;
    }
    if (!Objects.equals(this.isShared, dataShareResponse.isShared)) {
      return false;
    }
    if (!Objects.equals(this.createdAt, dataShareResponse.createdAt)) {
      return false;
    }
    if (!Objects.equals(this.createdBy, dataShareResponse.createdBy)) {
      return false;
    }
    if (!Objects.equals(this.keywords, dataShareResponse.keywords)) {
      return false;
    }
    if (!Objects.equals(this.expiryTime, dataShareResponse.expiryTime)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataShareId, dataShareName, isShared, createdAt, createdBy, keywords, expiryTime, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataShareResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dataShareId: ").append(toIndentedString(dataShareId)).append("\n");
    sb.append("    dataShareName: ").append(toIndentedString(dataShareName)).append("\n");
    sb.append("    isShared: ").append(toIndentedString(isShared)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
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

