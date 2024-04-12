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
import java.util.*;

/**
 * Request object for creating user request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-04-11T13:44:53.898-07:00")
public class CreateUserRequest  {

  /**
   * The identity provider user id for the user. This ID must match the NameId attribute value that will be passed for the user in the SAML response using the associated SAML provider.
   **/
  private String identityProviderUserId = null;

  /**
   * The email address for the user. Used for display purposes only.
   **/
  private String email = null;

  /**
   * The name or CRN of the SAML provider the user will use for login.
   **/
  private String samlProviderName = null;

  /**
   * The list of groups the user belongs to. The groups will be created if they do not exist. There are certain restrictions on the group name. Refer to the How To > User Management section in the Management Console documentation for the details.
   **/
  private List<String> groups = new ArrayList<String>();

  /**
   * The user first name.
   **/
  private String firstName = null;

  /**
   * The user last name.
   **/
  private String lastName = null;

  /**
   * Getter for identityProviderUserId.
   * The identity provider user id for the user. This ID must match the NameId attribute value that will be passed for the user in the SAML response using the associated SAML provider.
   **/
  @JsonProperty("identityProviderUserId")
  public String getIdentityProviderUserId() {
    return identityProviderUserId;
  }

  /**
   * Setter for identityProviderUserId.
   * The identity provider user id for the user. This ID must match the NameId attribute value that will be passed for the user in the SAML response using the associated SAML provider.
   **/
  public void setIdentityProviderUserId(String identityProviderUserId) {
    this.identityProviderUserId = identityProviderUserId;
  }

  /**
   * Getter for email.
   * The email address for the user. Used for display purposes only.
   **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  /**
   * Setter for email.
   * The email address for the user. Used for display purposes only.
   **/
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Getter for samlProviderName.
   * The name or CRN of the SAML provider the user will use for login.
   **/
  @JsonProperty("samlProviderName")
  public String getSamlProviderName() {
    return samlProviderName;
  }

  /**
   * Setter for samlProviderName.
   * The name or CRN of the SAML provider the user will use for login.
   **/
  public void setSamlProviderName(String samlProviderName) {
    this.samlProviderName = samlProviderName;
  }

  /**
   * Getter for groups.
   * The list of groups the user belongs to. The groups will be created if they do not exist. There are certain restrictions on the group name. Refer to the How To &gt; User Management section in the Management Console documentation for the details.
   **/
  @JsonProperty("groups")
  public List<String> getGroups() {
    return groups;
  }

  /**
   * Setter for groups.
   * The list of groups the user belongs to. The groups will be created if they do not exist. There are certain restrictions on the group name. Refer to the How To &gt; User Management section in the Management Console documentation for the details.
   **/
  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  /**
   * Getter for firstName.
   * The user first name.
   **/
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  /**
   * Setter for firstName.
   * The user first name.
   **/
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Getter for lastName.
   * The user last name.
   **/
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  /**
   * Setter for lastName.
   * The user last name.
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
    CreateUserRequest createUserRequest = (CreateUserRequest) o;
    if (!Objects.equals(this.identityProviderUserId, createUserRequest.identityProviderUserId)) {
      return false;
    }
    if (!Objects.equals(this.email, createUserRequest.email)) {
      return false;
    }
    if (!Objects.equals(this.samlProviderName, createUserRequest.samlProviderName)) {
      return false;
    }
    if (!Objects.equals(this.groups, createUserRequest.groups)) {
      return false;
    }
    if (!Objects.equals(this.firstName, createUserRequest.firstName)) {
      return false;
    }
    if (!Objects.equals(this.lastName, createUserRequest.lastName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityProviderUserId, email, samlProviderName, groups, firstName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserRequest {\n");
    sb.append("    identityProviderUserId: ").append(toIndentedString(identityProviderUserId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    samlProviderName: ").append(toIndentedString(samlProviderName)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

