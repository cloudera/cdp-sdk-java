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

/**
 * Request object to create the SCIM access token.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-12-16T12:55:42.002-08:00")
public class CreateScimAccessTokenRequest  {

  /**
   * The name or CRN of the SCIM enabled identity provider.
   **/
  private String identityProviderNameOrCrn = null;

  /**
   * The lifetime, in days, of the access token.
   **/
  private Integer accessTokenLifetimeDays = null;

  /**
   * Getter for identityProviderNameOrCrn.
   * The name or CRN of the SCIM enabled identity provider.
   **/
  @JsonProperty("identityProviderNameOrCrn")
  public String getIdentityProviderNameOrCrn() {
    return identityProviderNameOrCrn;
  }

  /**
   * Setter for identityProviderNameOrCrn.
   * The name or CRN of the SCIM enabled identity provider.
   **/
  public void setIdentityProviderNameOrCrn(String identityProviderNameOrCrn) {
    this.identityProviderNameOrCrn = identityProviderNameOrCrn;
  }

  /**
   * Getter for accessTokenLifetimeDays.
   * The lifetime, in days, of the access token.
   **/
  @JsonProperty("accessTokenLifetimeDays")
  public Integer getAccessTokenLifetimeDays() {
    return accessTokenLifetimeDays;
  }

  /**
   * Setter for accessTokenLifetimeDays.
   * The lifetime, in days, of the access token.
   **/
  public void setAccessTokenLifetimeDays(Integer accessTokenLifetimeDays) {
    this.accessTokenLifetimeDays = accessTokenLifetimeDays;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateScimAccessTokenRequest createScimAccessTokenRequest = (CreateScimAccessTokenRequest) o;
    if (!Objects.equals(this.identityProviderNameOrCrn, createScimAccessTokenRequest.identityProviderNameOrCrn)) {
      return false;
    }
    if (!Objects.equals(this.accessTokenLifetimeDays, createScimAccessTokenRequest.accessTokenLifetimeDays)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityProviderNameOrCrn, accessTokenLifetimeDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateScimAccessTokenRequest {\n");
    sb.append("    identityProviderNameOrCrn: ").append(toIndentedString(identityProviderNameOrCrn)).append("\n");
    sb.append("    accessTokenLifetimeDays: ").append(toIndentedString(accessTokenLifetimeDays)).append("\n");
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

