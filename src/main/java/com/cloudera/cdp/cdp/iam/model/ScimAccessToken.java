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

package com.cloudera.cdp.iam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.time.ZonedDateTime;

/**
 * Information about the SCIM access token.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-13T11:52:47.406-07:00")
public class ScimAccessToken  {

  /**
   * The SCIM access token id.
   **/
  private String accessTokenId = null;

  /**
   * The SCIM access token CRN.
   **/
  private String crn = null;

  /**
   * The date when this SCIM access token was created.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * The SCIM access token expiration date. The access token never expires if the value is not set.
   **/
  private ZonedDateTime expirationDate = null;

  /**
   * Getter for accessTokenId.
   * The SCIM access token id.
   **/
  @JsonProperty("accessTokenId")
  public String getAccessTokenId() {
    return accessTokenId;
  }

  /**
   * Setter for accessTokenId.
   * The SCIM access token id.
   **/
  public void setAccessTokenId(String accessTokenId) {
    this.accessTokenId = accessTokenId;
  }

  /**
   * Getter for crn.
   * The SCIM access token CRN.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The SCIM access token CRN.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for creationDate.
   * The date when this SCIM access token was created.
   **/
  @JsonProperty("creationDate")
  public ZonedDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * Setter for creationDate.
   * The date when this SCIM access token was created.
   **/
  public void setCreationDate(ZonedDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Getter for expirationDate.
   * The SCIM access token expiration date. The access token never expires if the value is not set.
   **/
  @JsonProperty("expirationDate")
  public ZonedDateTime getExpirationDate() {
    return expirationDate;
  }

  /**
   * Setter for expirationDate.
   * The SCIM access token expiration date. The access token never expires if the value is not set.
   **/
  public void setExpirationDate(ZonedDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimAccessToken scimAccessToken = (ScimAccessToken) o;
    if (!Objects.equals(this.accessTokenId, scimAccessToken.accessTokenId)) {
      return false;
    }
    if (!Objects.equals(this.crn, scimAccessToken.crn)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, scimAccessToken.creationDate)) {
      return false;
    }
    if (!Objects.equals(this.expirationDate, scimAccessToken.expirationDate)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessTokenId, crn, creationDate, expirationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimAccessToken {\n");
    sb.append("    accessTokenId: ").append(toIndentedString(accessTokenId)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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

