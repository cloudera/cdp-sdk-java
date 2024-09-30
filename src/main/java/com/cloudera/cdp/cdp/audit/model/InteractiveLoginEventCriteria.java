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

package com.cloudera.cdp.audit.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Filter criteria for listing interactive login audit events.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-09-27T08:40:27.499-07:00")
public class InteractiveLoginEventCriteria  {

  /**
   * The user ID as indicated by the identity provider. The specific format and type of this identifier is determined by the IdP. For Cloudera SSO this is the email used to login.
   **/
  private String identityProviderUserId = null;

  /**
   * The email of the user as provided to CDP.
   **/
  private String email = null;

  /**
   * The source IP address from which the login request came.
   **/
  private String sourceIPAddress = null;

  /**
   * The first name of the user.
   **/
  private String firstName = null;

  /**
   * The last name of the user.
   **/
  private String lastName = null;

  /**
   * Getter for identityProviderUserId.
   * The user ID as indicated by the identity provider. The specific format and type of this identifier is determined by the IdP. For Cloudera SSO this is the email used to login.
   **/
  @JsonProperty("identityProviderUserId")
  public String getIdentityProviderUserId() {
    return identityProviderUserId;
  }

  /**
   * Setter for identityProviderUserId.
   * The user ID as indicated by the identity provider. The specific format and type of this identifier is determined by the IdP. For Cloudera SSO this is the email used to login.
   **/
  public void setIdentityProviderUserId(String identityProviderUserId) {
    this.identityProviderUserId = identityProviderUserId;
  }

  /**
   * Getter for email.
   * The email of the user as provided to CDP.
   **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  /**
   * Setter for email.
   * The email of the user as provided to CDP.
   **/
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Getter for sourceIPAddress.
   * The source IP address from which the login request came.
   **/
  @JsonProperty("sourceIPAddress")
  public String getSourceIPAddress() {
    return sourceIPAddress;
  }

  /**
   * Setter for sourceIPAddress.
   * The source IP address from which the login request came.
   **/
  public void setSourceIPAddress(String sourceIPAddress) {
    this.sourceIPAddress = sourceIPAddress;
  }

  /**
   * Getter for firstName.
   * The first name of the user.
   **/
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  /**
   * Setter for firstName.
   * The first name of the user.
   **/
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Getter for lastName.
   * The last name of the user.
   **/
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  /**
   * Setter for lastName.
   * The last name of the user.
   **/
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractiveLoginEventCriteria interactiveLoginEventCriteria = (InteractiveLoginEventCriteria) o;
    if (!Objects.equals(this.identityProviderUserId, interactiveLoginEventCriteria.identityProviderUserId)) {
      return false;
    }
    if (!Objects.equals(this.email, interactiveLoginEventCriteria.email)) {
      return false;
    }
    if (!Objects.equals(this.sourceIPAddress, interactiveLoginEventCriteria.sourceIPAddress)) {
      return false;
    }
    if (!Objects.equals(this.firstName, interactiveLoginEventCriteria.firstName)) {
      return false;
    }
    if (!Objects.equals(this.lastName, interactiveLoginEventCriteria.lastName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityProviderUserId, email, sourceIPAddress, firstName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveLoginEventCriteria {\n");
    sb.append("    identityProviderUserId: ").append(toIndentedString(identityProviderUserId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    sourceIPAddress: ").append(toIndentedString(sourceIPAddress)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

