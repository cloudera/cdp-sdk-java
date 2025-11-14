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
import com.cloudera.cdp.iam.model.ScimAccessToken;

/**
 * Response object to create the SCIM access token.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-14T06:50:08.152-08:00")
public class CreateScimAccessTokenResponse extends CdpResponse {

  /**
   * The SCIM access token that was created.
   **/
  private ScimAccessToken accessToken = null;

  /**
   * The SCIM access token secret. This secret could be used to authenticate requests sent to SCIM endpoints.
   **/
  private String accessTokenSecret = null;

  /**
   * Getter for accessToken.
   * The SCIM access token that was created.
   **/
  @JsonProperty("accessToken")
  public ScimAccessToken getAccessToken() {
    return accessToken;
  }

  /**
   * Setter for accessToken.
   * The SCIM access token that was created.
   **/
  public void setAccessToken(ScimAccessToken accessToken) {
    this.accessToken = accessToken;
  }

  /**
   * Getter for accessTokenSecret.
   * The SCIM access token secret. This secret could be used to authenticate requests sent to SCIM endpoints.
   **/
  @JsonProperty("accessTokenSecret")
  public String getAccessTokenSecret() {
    return accessTokenSecret;
  }

  /**
   * Setter for accessTokenSecret.
   * The SCIM access token secret. This secret could be used to authenticate requests sent to SCIM endpoints.
   **/
  public void setAccessTokenSecret(String accessTokenSecret) {
    this.accessTokenSecret = accessTokenSecret;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateScimAccessTokenResponse createScimAccessTokenResponse = (CreateScimAccessTokenResponse) o;
    if (!Objects.equals(this.accessToken, createScimAccessTokenResponse.accessToken)) {
      return false;
    }
    if (!Objects.equals(this.accessTokenSecret, createScimAccessTokenResponse.accessTokenSecret)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, accessTokenSecret, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateScimAccessTokenResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    accessTokenSecret: ").append(toIndentedString(accessTokenSecret)).append("\n");
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

