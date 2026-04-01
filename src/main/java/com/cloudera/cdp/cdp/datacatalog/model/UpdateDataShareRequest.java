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
 * Update Data Share request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-31T14:25:30.688-07:00")
public class UpdateDataShareRequest  {

  /**
   * The CRN of the Data Lake where the Data Share is located.
   **/
  private String datalakeCrn = null;

  /**
   * The CRN of the Environment where the Data Share is located.
   **/
  private String environmentCrn = null;

  /**
   * The unique identifier of the Data Share to be updated.
   **/
  private String dataShareId = null;

  /**
   * The name of the Data Share.
   **/
  private String dataShareName = null;

  /**
   * List of keywords associated with the Data Share.
   **/
  private List<String> keywords = new ArrayList<String>();

  /**
   * The date and time when the Data Share will expire.
   **/
  private ZonedDateTime expiryTime = null;

  /**
   * A brief summary of the Data Share.
   **/
  private String summary = null;

  /**
   * The terms of use for the Data Share.
   **/
  private String termsOfUse = null;

  /**
   * Getter for datalakeCrn.
   * The CRN of the Data Lake where the Data Share is located.
   **/
  @JsonProperty("datalakeCrn")
  public String getDatalakeCrn() {
    return datalakeCrn;
  }

  /**
   * Setter for datalakeCrn.
   * The CRN of the Data Lake where the Data Share is located.
   **/
  public void setDatalakeCrn(String datalakeCrn) {
    this.datalakeCrn = datalakeCrn;
  }

  /**
   * Getter for environmentCrn.
   * The CRN of the Environment where the Data Share is located.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of the Environment where the Data Share is located.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for dataShareId.
   * The unique identifier of the Data Share to be updated.
   **/
  @JsonProperty("dataShareId")
  public String getDataShareId() {
    return dataShareId;
  }

  /**
   * Setter for dataShareId.
   * The unique identifier of the Data Share to be updated.
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
    UpdateDataShareRequest updateDataShareRequest = (UpdateDataShareRequest) o;
    if (!Objects.equals(this.datalakeCrn, updateDataShareRequest.datalakeCrn)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, updateDataShareRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.dataShareId, updateDataShareRequest.dataShareId)) {
      return false;
    }
    if (!Objects.equals(this.dataShareName, updateDataShareRequest.dataShareName)) {
      return false;
    }
    if (!Objects.equals(this.keywords, updateDataShareRequest.keywords)) {
      return false;
    }
    if (!Objects.equals(this.expiryTime, updateDataShareRequest.expiryTime)) {
      return false;
    }
    if (!Objects.equals(this.summary, updateDataShareRequest.summary)) {
      return false;
    }
    if (!Objects.equals(this.termsOfUse, updateDataShareRequest.termsOfUse)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datalakeCrn, environmentCrn, dataShareId, dataShareName, keywords, expiryTime, summary, termsOfUse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDataShareRequest {\n");
    sb.append("    datalakeCrn: ").append(toIndentedString(datalakeCrn)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    dataShareId: ").append(toIndentedString(dataShareId)).append("\n");
    sb.append("    dataShareName: ").append(toIndentedString(dataShareName)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
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

