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
import com.cloudera.cdp.datacatalog.model.AssetRequest;
import com.cloudera.cdp.datacatalog.model.ExternalUserAccessUpdate;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * Create Data Share request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-04-15T08:44:50.980-07:00")
public class CreateDataShareRequest  {

  /**
   * The CRN of the Data Lake where the Data Share will be created.
   **/
  private String datalakeCrn = null;

  /**
   * The CRN of the Environment where the Data Share will be created.
   **/
  private String environmentCrn = null;

  /**
   * The name of the Data Share to be created (Max length is 512 characters).
   **/
  private String dataShareName = null;

  /**
   * List of assets to be included in the Data Share.
   **/
  private List<AssetRequest> assets = new ArrayList<AssetRequest>();

  /**
   * A brief summary of the Data Share.
   **/
  private String summary = null;

  /**
   * The terms of use for the Data Share.
   **/
  private String termsOfUse = null;

  /**
   * List of keywords associated with the Data Share.
   **/
  private List<String> keywords = new ArrayList<String>();

  /**
   * The date and time when the Data Share will expire.
   **/
  private ZonedDateTime expiryTime = null;

  /**
   * List of external users to be granted access to the Data Share.
   **/
  private List<ExternalUserAccessUpdate> externalUsers = new ArrayList<ExternalUserAccessUpdate>();

  /**
   * Getter for datalakeCrn.
   * The CRN of the Data Lake where the Data Share will be created.
   **/
  @JsonProperty("datalakeCrn")
  public String getDatalakeCrn() {
    return datalakeCrn;
  }

  /**
   * Setter for datalakeCrn.
   * The CRN of the Data Lake where the Data Share will be created.
   **/
  public void setDatalakeCrn(String datalakeCrn) {
    this.datalakeCrn = datalakeCrn;
  }

  /**
   * Getter for environmentCrn.
   * The CRN of the Environment where the Data Share will be created.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of the Environment where the Data Share will be created.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for dataShareName.
   * The name of the Data Share to be created (Max length is 512 characters).
   **/
  @JsonProperty("dataShareName")
  public String getDataShareName() {
    return dataShareName;
  }

  /**
   * Setter for dataShareName.
   * The name of the Data Share to be created (Max length is 512 characters).
   **/
  public void setDataShareName(String dataShareName) {
    this.dataShareName = dataShareName;
  }

  /**
   * Getter for assets.
   * List of assets to be included in the Data Share.
   **/
  @JsonProperty("assets")
  public List<AssetRequest> getAssets() {
    return assets;
  }

  /**
   * Setter for assets.
   * List of assets to be included in the Data Share.
   **/
  public void setAssets(List<AssetRequest> assets) {
    this.assets = assets;
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

  /**
   * Getter for externalUsers.
   * List of external users to be granted access to the Data Share.
   **/
  @JsonProperty("externalUsers")
  public List<ExternalUserAccessUpdate> getExternalUsers() {
    return externalUsers;
  }

  /**
   * Setter for externalUsers.
   * List of external users to be granted access to the Data Share.
   **/
  public void setExternalUsers(List<ExternalUserAccessUpdate> externalUsers) {
    this.externalUsers = externalUsers;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDataShareRequest createDataShareRequest = (CreateDataShareRequest) o;
    if (!Objects.equals(this.datalakeCrn, createDataShareRequest.datalakeCrn)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, createDataShareRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.dataShareName, createDataShareRequest.dataShareName)) {
      return false;
    }
    if (!Objects.equals(this.assets, createDataShareRequest.assets)) {
      return false;
    }
    if (!Objects.equals(this.summary, createDataShareRequest.summary)) {
      return false;
    }
    if (!Objects.equals(this.termsOfUse, createDataShareRequest.termsOfUse)) {
      return false;
    }
    if (!Objects.equals(this.keywords, createDataShareRequest.keywords)) {
      return false;
    }
    if (!Objects.equals(this.expiryTime, createDataShareRequest.expiryTime)) {
      return false;
    }
    if (!Objects.equals(this.externalUsers, createDataShareRequest.externalUsers)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeCrn, environmentCrn, dataShareName, assets, summary, termsOfUse, keywords, expiryTime, externalUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDataShareRequest {\n");
    sb.append("    datalakeCrn: ").append(toIndentedString(datalakeCrn)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    dataShareName: ").append(toIndentedString(dataShareName)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    termsOfUse: ").append(toIndentedString(termsOfUse)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
    sb.append("    externalUsers: ").append(toIndentedString(externalUsers)).append("\n");
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

