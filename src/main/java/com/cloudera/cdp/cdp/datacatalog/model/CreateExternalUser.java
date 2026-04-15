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

/**
 * Details of an External user.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-04-15T08:44:50.980-07:00")
public class CreateExternalUser  {

  /**
   * The email address of the External user.
   **/
  private String email = null;

  /**
   * The username of the External user.
   **/
  private String username = null;

  /**
   * The company name of the External user.
   **/
  private String companyName = null;

  /**
   * Getter for email.
   * The email address of the External user.
   **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  /**
   * Setter for email.
   * The email address of the External user.
   **/
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Getter for username.
   * The username of the External user.
   **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  /**
   * Setter for username.
   * The username of the External user.
   **/
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Getter for companyName.
   * The company name of the External user.
   **/
  @JsonProperty("companyName")
  public String getCompanyName() {
    return companyName;
  }

  /**
   * Setter for companyName.
   * The company name of the External user.
   **/
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateExternalUser createExternalUser = (CreateExternalUser) o;
    if (!Objects.equals(this.email, createExternalUser.email)) {
      return false;
    }
    if (!Objects.equals(this.username, createExternalUser.username)) {
      return false;
    }
    if (!Objects.equals(this.companyName, createExternalUser.companyName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, username, companyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateExternalUser {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
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

