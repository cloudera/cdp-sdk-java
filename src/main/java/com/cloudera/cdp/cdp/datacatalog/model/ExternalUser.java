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

/**
 * Details of an External user.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-03-31T14:25:30.688-07:00")
public class ExternalUser  {

  /**
   * The unique identifier of the external user.
   **/
  private Long userId = null;

  /**
   * The username of the external user.
   **/
  private String username = null;

  /**
   * The email address of the external user.
   **/
  private String email = null;

  /**
   * The company name of the external user.
   **/
  private String companyName = null;

  /**
   * The Client ID of the external user that will be used for authentication.
   **/
  private String clientId = null;

  /**
   * The Secret of the external user that will be used for authentication to external services.
   **/
  private String secret = null;

  /**
   * The date and time when the external user was created.
   **/
  private ZonedDateTime createdAt = null;

  /**
   * The date and time when the external user will expire.
   **/
  private ZonedDateTime expiryTime = null;

  /**
   * Error message if any occurred during the creation of the external user.
   **/
  private String error = null;

  /**
   * Getter for userId.
   * The unique identifier of the external user.
   **/
  @JsonProperty("userId")
  public Long getUserId() {
    return userId;
  }

  /**
   * Setter for userId.
   * The unique identifier of the external user.
   **/
  public void setUserId(Long userId) {
    this.userId = userId;
  }

  /**
   * Getter for username.
   * The username of the external user.
   **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  /**
   * Setter for username.
   * The username of the external user.
   **/
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Getter for email.
   * The email address of the external user.
   **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  /**
   * Setter for email.
   * The email address of the external user.
   **/
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Getter for companyName.
   * The company name of the external user.
   **/
  @JsonProperty("companyName")
  public String getCompanyName() {
    return companyName;
  }

  /**
   * Setter for companyName.
   * The company name of the external user.
   **/
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  /**
   * Getter for clientId.
   * The Client ID of the external user that will be used for authentication.
   **/
  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }

  /**
   * Setter for clientId.
   * The Client ID of the external user that will be used for authentication.
   **/
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  /**
   * Getter for secret.
   * The Secret of the external user that will be used for authentication to external services.
   **/
  @JsonProperty("secret")
  public String getSecret() {
    return secret;
  }

  /**
   * Setter for secret.
   * The Secret of the external user that will be used for authentication to external services.
   **/
  public void setSecret(String secret) {
    this.secret = secret;
  }

  /**
   * Getter for createdAt.
   * The date and time when the external user was created.
   **/
  @JsonProperty("createdAt")
  public ZonedDateTime getCreatedAt() {
    return createdAt;
  }

  /**
   * Setter for createdAt.
   * The date and time when the external user was created.
   **/
  public void setCreatedAt(ZonedDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Getter for expiryTime.
   * The date and time when the external user will expire.
   **/
  @JsonProperty("expiryTime")
  public ZonedDateTime getExpiryTime() {
    return expiryTime;
  }

  /**
   * Setter for expiryTime.
   * The date and time when the external user will expire.
   **/
  public void setExpiryTime(ZonedDateTime expiryTime) {
    this.expiryTime = expiryTime;
  }

  /**
   * Getter for error.
   * Error message if any occurred during the creation of the external user.
   **/
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  /**
   * Setter for error.
   * Error message if any occurred during the creation of the external user.
   **/
  public void setError(String error) {
    this.error = error;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalUser externalUser = (ExternalUser) o;
    if (!Objects.equals(this.userId, externalUser.userId)) {
      return false;
    }
    if (!Objects.equals(this.username, externalUser.username)) {
      return false;
    }
    if (!Objects.equals(this.email, externalUser.email)) {
      return false;
    }
    if (!Objects.equals(this.companyName, externalUser.companyName)) {
      return false;
    }
    if (!Objects.equals(this.clientId, externalUser.clientId)) {
      return false;
    }
    if (!Objects.equals(this.secret, externalUser.secret)) {
      return false;
    }
    if (!Objects.equals(this.createdAt, externalUser.createdAt)) {
      return false;
    }
    if (!Objects.equals(this.expiryTime, externalUser.expiryTime)) {
      return false;
    }
    if (!Objects.equals(this.error, externalUser.error)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, username, email, companyName, clientId, secret, createdAt, expiryTime, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalUser {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

