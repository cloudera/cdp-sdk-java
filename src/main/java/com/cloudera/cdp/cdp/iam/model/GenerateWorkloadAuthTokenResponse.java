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
 * Response object for GenerateWorkloadAuthToken method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-06-05T15:30:59.971-07:00")
public class GenerateWorkloadAuthTokenResponse extends CdpResponse {

  /**
   * The workload endpoint URL
   **/
  private String endpointUrl = null;

  /**
   * The authentication token
   **/
  private String token = null;

  /**
   * When the information should expire
   **/
  private ZonedDateTime expireAt = null;

  /**
   * Getter for endpointUrl.
   * The workload endpoint URL
   **/
  @JsonProperty("endpointUrl")
  public String getEndpointUrl() {
    return endpointUrl;
  }

  /**
   * Setter for endpointUrl.
   * The workload endpoint URL
   **/
  public void setEndpointUrl(String endpointUrl) {
    this.endpointUrl = endpointUrl;
  }

  /**
   * Getter for token.
   * The authentication token
   **/
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  /**
   * Setter for token.
   * The authentication token
   **/
  public void setToken(String token) {
    this.token = token;
  }

  /**
   * Getter for expireAt.
   * When the information should expire
   **/
  @JsonProperty("expireAt")
  public ZonedDateTime getExpireAt() {
    return expireAt;
  }

  /**
   * Setter for expireAt.
   * When the information should expire
   **/
  public void setExpireAt(ZonedDateTime expireAt) {
    this.expireAt = expireAt;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateWorkloadAuthTokenResponse generateWorkloadAuthTokenResponse = (GenerateWorkloadAuthTokenResponse) o;
    if (!Objects.equals(this.endpointUrl, generateWorkloadAuthTokenResponse.endpointUrl)) {
      return false;
    }
    if (!Objects.equals(this.token, generateWorkloadAuthTokenResponse.token)) {
      return false;
    }
    if (!Objects.equals(this.expireAt, generateWorkloadAuthTokenResponse.expireAt)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointUrl, token, expireAt, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateWorkloadAuthTokenResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    endpointUrl: ").append(toIndentedString(endpointUrl)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
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

