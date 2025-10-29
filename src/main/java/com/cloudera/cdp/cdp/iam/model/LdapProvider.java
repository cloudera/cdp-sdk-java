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
import com.cloudera.cdp.iam.model.LdapProviderInfo;

/**
 * LDAP Provider details.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-10-28T14:00:29.956-07:00")
public class LdapProvider  {

  /**
   * The unique ID of the LDAP provider.
   **/
  private String identityProviderConnectorId = null;

  /**
   * Name of the LDAP provider connector.
   **/
  private String ldapProviderName = null;

  /**
   * The LDAP provider connector CRN.
   **/
  private String crn = null;

  /**
   * Indicates whether group sync is skipped or not.
   **/
  private Boolean skipGroupSyncOnLogin = null;

  /**
   * The creation date in ms from the java epoch of 1970-01-01T00:00:00Z.
   **/
  private Long creationDate = null;

  /**
   * The updated LDAP identity provider connector configuration detail. This will be empty in listLdapProvidersResponse.
   **/
  private LdapProviderInfo ldapDetails = null;

  /**
   * Getter for identityProviderConnectorId.
   * The unique ID of the LDAP provider.
   **/
  @JsonProperty("identityProviderConnectorId")
  public String getIdentityProviderConnectorId() {
    return identityProviderConnectorId;
  }

  /**
   * Setter for identityProviderConnectorId.
   * The unique ID of the LDAP provider.
   **/
  public void setIdentityProviderConnectorId(String identityProviderConnectorId) {
    this.identityProviderConnectorId = identityProviderConnectorId;
  }

  /**
   * Getter for ldapProviderName.
   * Name of the LDAP provider connector.
   **/
  @JsonProperty("ldapProviderName")
  public String getLdapProviderName() {
    return ldapProviderName;
  }

  /**
   * Setter for ldapProviderName.
   * Name of the LDAP provider connector.
   **/
  public void setLdapProviderName(String ldapProviderName) {
    this.ldapProviderName = ldapProviderName;
  }

  /**
   * Getter for crn.
   * The LDAP provider connector CRN.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The LDAP provider connector CRN.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for skipGroupSyncOnLogin.
   * Indicates whether group sync is skipped or not.
   **/
  @JsonProperty("skipGroupSyncOnLogin")
  public Boolean getSkipGroupSyncOnLogin() {
    return skipGroupSyncOnLogin;
  }

  /**
   * Setter for skipGroupSyncOnLogin.
   * Indicates whether group sync is skipped or not.
   **/
  public void setSkipGroupSyncOnLogin(Boolean skipGroupSyncOnLogin) {
    this.skipGroupSyncOnLogin = skipGroupSyncOnLogin;
  }

  /**
   * Getter for creationDate.
   * The creation date in ms from the java epoch of 1970-01-01T00:00:00Z.
   **/
  @JsonProperty("creationDate")
  public Long getCreationDate() {
    return creationDate;
  }

  /**
   * Setter for creationDate.
   * The creation date in ms from the java epoch of 1970-01-01T00:00:00Z.
   **/
  public void setCreationDate(Long creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Getter for ldapDetails.
   * The updated LDAP identity provider connector configuration detail. This will be empty in listLdapProvidersResponse.
   **/
  @JsonProperty("ldapDetails")
  public LdapProviderInfo getLdapDetails() {
    return ldapDetails;
  }

  /**
   * Setter for ldapDetails.
   * The updated LDAP identity provider connector configuration detail. This will be empty in listLdapProvidersResponse.
   **/
  public void setLdapDetails(LdapProviderInfo ldapDetails) {
    this.ldapDetails = ldapDetails;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LdapProvider ldapProvider = (LdapProvider) o;
    if (!Objects.equals(this.identityProviderConnectorId, ldapProvider.identityProviderConnectorId)) {
      return false;
    }
    if (!Objects.equals(this.ldapProviderName, ldapProvider.ldapProviderName)) {
      return false;
    }
    if (!Objects.equals(this.crn, ldapProvider.crn)) {
      return false;
    }
    if (!Objects.equals(this.skipGroupSyncOnLogin, ldapProvider.skipGroupSyncOnLogin)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, ldapProvider.creationDate)) {
      return false;
    }
    if (!Objects.equals(this.ldapDetails, ldapProvider.ldapDetails)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityProviderConnectorId, ldapProviderName, crn, skipGroupSyncOnLogin, creationDate, ldapDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LdapProvider {\n");
    sb.append("    identityProviderConnectorId: ").append(toIndentedString(identityProviderConnectorId)).append("\n");
    sb.append("    ldapProviderName: ").append(toIndentedString(ldapProviderName)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    skipGroupSyncOnLogin: ").append(toIndentedString(skipGroupSyncOnLogin)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    ldapDetails: ").append(toIndentedString(ldapDetails)).append("\n");
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

