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
 * Request object for a create user access key request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-03-30T09:56:51.203-07:00")
public class CreateUserAccessKeyRequest  {

  /**
   * The ID or CRN of the user to whom this access key will be associated. If it is not included, it defaults to the user making the request.
   **/
  private String user = null;

  /**
   * The version of an access key to create. Default is V2. Use V1 for compatibility with old CLI (< 1.6)  and SDK (< 1.3) releases.
   **/
  private String type = null;

  /**
   * Getter for user.
   * The ID or CRN of the user to whom this access key will be associated. If it is not included, it defaults to the user making the request.
   **/
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  /**
   * Setter for user.
   * The ID or CRN of the user to whom this access key will be associated. If it is not included, it defaults to the user making the request.
   **/
  public void setUser(String user) {
    this.user = user;
  }

  /**
   * Getter for type.
   * The version of an access key to create. Default is V2. Use V1 for compatibility with old CLI (&lt; 1.6)  and SDK (&lt; 1.3) releases.
   **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Setter for type.
   * The version of an access key to create. Default is V2. Use V1 for compatibility with old CLI (&lt; 1.6)  and SDK (&lt; 1.3) releases.
   **/
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserAccessKeyRequest createUserAccessKeyRequest = (CreateUserAccessKeyRequest) o;
    if (!Objects.equals(this.user, createUserAccessKeyRequest.user)) {
      return false;
    }
    if (!Objects.equals(this.type, createUserAccessKeyRequest.type)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserAccessKeyRequest {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

