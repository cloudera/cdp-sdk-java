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
import java.util.*;

/**
 * The model for a login event, as a part of CdpAuditEvent. CDP logs attempts to interactively login to the CDP console. This includes logins using Cloudera SSO and through any federated interactive login events.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-04-23T14:14:36.107-07:00")
public class InteractiveLoginEvent  {

  /**
   * The identity provider CRN used to interactively login. For Cloudera SSO the ID is 'crn:altus:iam:us-west-1:altus:samlProvider:cloudera-sso'. For identity provider connectors the connector's CRN is used.
   **/
  private String identityProviderCrn = null;

  /**
   * The identity provider session ID for this interactive login request. For SAML 2.0 identity federation this is the SessionIndex of the SAML AuthnResponse. (Deprecated: No replacement, as this was never available.)
   **/
  private String identityProviderSessionId = null;

  /**
   * The user ID as indicated by the identity provider. The specific format and type of this identifier is determined by the IdP. For Cloudera SSO this is the email used to login.
   **/
  private String identityProviderUserId = null;

  /**
   * The email of the user as provided to CDP.
   **/
  private String email = null;

  /**
   * The source IP address from which the login request came from.
   **/
  private String sourceIPAddress = null;

  /**
   * The first name of the user, if provided.
   **/
  private String firstName = null;

  /**
   * The last name of the user, if provided.
   **/
  private String lastName = null;

  /**
   * Whether the user was marked as account admin. Can only be 'true' for users using Cloudera SSO.
   **/
  private Boolean accountAdmin = null;

  /**
   * A list of group names the user belongs to as received in CDP. Only available for non Cloudera SSO login events.
   **/
  private List<String> groups = new ArrayList<String>();

  /**
   * The CDP user CRN for the user. This may be empty if the login failed.
   **/
  private String userCrn = null;

  /**
   * The groups that are invalid and filtered (ignored) during the interactive login through non Cloudera SSO IdP. It is a subset of the groups the user belongs to as received in CDP. It can be empty for any of the following reasons: 1) If the account is not entitled for this feature. 2) If the membership sync is off for the IdP used during the interactive login. 3) If all the groups were valid during login through non Cloudera SSO IdP. 4) If the login is performed through Cloudera SSO. 5) If the login fails before filtering invalid groups.
   **/
  private List<String> filteredInvalidGroups = new ArrayList<String>();

  /**
   * Getter for identityProviderCrn.
   * The identity provider CRN used to interactively login. For Cloudera SSO the ID is &#39;crn:altus:iam:us-west-1:altus:samlProvider:cloudera-sso&#39;. For identity provider connectors the connector&#39;s CRN is used.
   **/
  @JsonProperty("identityProviderCrn")
  public String getIdentityProviderCrn() {
    return identityProviderCrn;
  }

  /**
   * Setter for identityProviderCrn.
   * The identity provider CRN used to interactively login. For Cloudera SSO the ID is &#39;crn:altus:iam:us-west-1:altus:samlProvider:cloudera-sso&#39;. For identity provider connectors the connector&#39;s CRN is used.
   **/
  public void setIdentityProviderCrn(String identityProviderCrn) {
    this.identityProviderCrn = identityProviderCrn;
  }

  /**
   * Getter for identityProviderSessionId.
   * The identity provider session ID for this interactive login request. For SAML 2.0 identity federation this is the SessionIndex of the SAML AuthnResponse. (Deprecated: No replacement, as this was never available.)
   **/
  @Deprecated
  @JsonProperty("identityProviderSessionId")
  public String getIdentityProviderSessionId() {
    return identityProviderSessionId;
  }

  /**
   * Setter for identityProviderSessionId.
   * The identity provider session ID for this interactive login request. For SAML 2.0 identity federation this is the SessionIndex of the SAML AuthnResponse. (Deprecated: No replacement, as this was never available.)
   **/
  @Deprecated
  public void setIdentityProviderSessionId(String identityProviderSessionId) {
    this.identityProviderSessionId = identityProviderSessionId;
  }

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
   * The source IP address from which the login request came from.
   **/
  @JsonProperty("sourceIPAddress")
  public String getSourceIPAddress() {
    return sourceIPAddress;
  }

  /**
   * Setter for sourceIPAddress.
   * The source IP address from which the login request came from.
   **/
  public void setSourceIPAddress(String sourceIPAddress) {
    this.sourceIPAddress = sourceIPAddress;
  }

  /**
   * Getter for firstName.
   * The first name of the user, if provided.
   **/
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  /**
   * Setter for firstName.
   * The first name of the user, if provided.
   **/
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Getter for lastName.
   * The last name of the user, if provided.
   **/
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  /**
   * Setter for lastName.
   * The last name of the user, if provided.
   **/
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Getter for accountAdmin.
   * Whether the user was marked as account admin. Can only be &#39;true&#39; for users using Cloudera SSO.
   **/
  @JsonProperty("accountAdmin")
  public Boolean getAccountAdmin() {
    return accountAdmin;
  }

  /**
   * Setter for accountAdmin.
   * Whether the user was marked as account admin. Can only be &#39;true&#39; for users using Cloudera SSO.
   **/
  public void setAccountAdmin(Boolean accountAdmin) {
    this.accountAdmin = accountAdmin;
  }

  /**
   * Getter for groups.
   * A list of group names the user belongs to as received in CDP. Only available for non Cloudera SSO login events.
   **/
  @JsonProperty("groups")
  public List<String> getGroups() {
    return groups;
  }

  /**
   * Setter for groups.
   * A list of group names the user belongs to as received in CDP. Only available for non Cloudera SSO login events.
   **/
  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  /**
   * Getter for userCrn.
   * The CDP user CRN for the user. This may be empty if the login failed.
   **/
  @JsonProperty("userCrn")
  public String getUserCrn() {
    return userCrn;
  }

  /**
   * Setter for userCrn.
   * The CDP user CRN for the user. This may be empty if the login failed.
   **/
  public void setUserCrn(String userCrn) {
    this.userCrn = userCrn;
  }

  /**
   * Getter for filteredInvalidGroups.
   * The groups that are invalid and filtered (ignored) during the interactive login through non Cloudera SSO IdP. It is a subset of the groups the user belongs to as received in CDP. It can be empty for any of the following reasons: 1) If the account is not entitled for this feature. 2) If the membership sync is off for the IdP used during the interactive login. 3) If all the groups were valid during login through non Cloudera SSO IdP. 4) If the login is performed through Cloudera SSO. 5) If the login fails before filtering invalid groups.
   **/
  @JsonProperty("filteredInvalidGroups")
  public List<String> getFilteredInvalidGroups() {
    return filteredInvalidGroups;
  }

  /**
   * Setter for filteredInvalidGroups.
   * The groups that are invalid and filtered (ignored) during the interactive login through non Cloudera SSO IdP. It is a subset of the groups the user belongs to as received in CDP. It can be empty for any of the following reasons: 1) If the account is not entitled for this feature. 2) If the membership sync is off for the IdP used during the interactive login. 3) If all the groups were valid during login through non Cloudera SSO IdP. 4) If the login is performed through Cloudera SSO. 5) If the login fails before filtering invalid groups.
   **/
  public void setFilteredInvalidGroups(List<String> filteredInvalidGroups) {
    this.filteredInvalidGroups = filteredInvalidGroups;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractiveLoginEvent interactiveLoginEvent = (InteractiveLoginEvent) o;
    if (!Objects.equals(this.identityProviderCrn, interactiveLoginEvent.identityProviderCrn)) {
      return false;
    }
    if (!Objects.equals(this.identityProviderSessionId, interactiveLoginEvent.identityProviderSessionId)) {
      return false;
    }
    if (!Objects.equals(this.identityProviderUserId, interactiveLoginEvent.identityProviderUserId)) {
      return false;
    }
    if (!Objects.equals(this.email, interactiveLoginEvent.email)) {
      return false;
    }
    if (!Objects.equals(this.sourceIPAddress, interactiveLoginEvent.sourceIPAddress)) {
      return false;
    }
    if (!Objects.equals(this.firstName, interactiveLoginEvent.firstName)) {
      return false;
    }
    if (!Objects.equals(this.lastName, interactiveLoginEvent.lastName)) {
      return false;
    }
    if (!Objects.equals(this.accountAdmin, interactiveLoginEvent.accountAdmin)) {
      return false;
    }
    if (!Objects.equals(this.groups, interactiveLoginEvent.groups)) {
      return false;
    }
    if (!Objects.equals(this.userCrn, interactiveLoginEvent.userCrn)) {
      return false;
    }
    if (!Objects.equals(this.filteredInvalidGroups, interactiveLoginEvent.filteredInvalidGroups)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityProviderCrn, identityProviderSessionId, identityProviderUserId, email, sourceIPAddress, firstName, lastName, accountAdmin, groups, userCrn, filteredInvalidGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveLoginEvent {\n");
    sb.append("    identityProviderCrn: ").append(toIndentedString(identityProviderCrn)).append("\n");
    sb.append("    identityProviderSessionId: ").append(toIndentedString(identityProviderSessionId)).append("\n");
    sb.append("    identityProviderUserId: ").append(toIndentedString(identityProviderUserId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    sourceIPAddress: ").append(toIndentedString(sourceIPAddress)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    accountAdmin: ").append(toIndentedString(accountAdmin)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    userCrn: ").append(toIndentedString(userCrn)).append("\n");
    sb.append("    filteredInvalidGroups: ").append(toIndentedString(filteredInvalidGroups)).append("\n");
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

