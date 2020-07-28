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
 * Information used to connect an Altus account to an external identity provider.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2020-07-28T12:49:36.300-07:00")
public class SamlProvider  {

  /**
   * CRN of the SAML provider in Altus.
   **/
  private String crn = null;

  /**
   * The date when this SAML provider record was created.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * Name of the SAML provider.
   **/
  private String samlProviderName = null;

  /**
   * The unique ID of the saml provider.
   **/
  private String samlProviderId = null;

  /**
   * Whether users federated with this SAML provider will have their group membership synchronized. Group membership can be passed using the https://altus.cloudera.com/SAML/Attributes/groups SAML assertion.
   **/
  private Boolean syncGroupsOnLogin = null;

  /**
   * The original metadata that was passed while creating the SAML provider connector. This field will not be set for listSamlProviders API response.
   **/
  private String samlMetadataDocument = null;

  /**
   * Getter for crn.
   * CRN of the SAML provider in Altus.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * CRN of the SAML provider in Altus.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for creationDate.
   * The date when this SAML provider record was created.
   **/
  @JsonProperty("creationDate")
  public ZonedDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * Setter for creationDate.
   * The date when this SAML provider record was created.
   **/
  public void setCreationDate(ZonedDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Getter for samlProviderName.
   * Name of the SAML provider.
   **/
  @JsonProperty("samlProviderName")
  public String getSamlProviderName() {
    return samlProviderName;
  }

  /**
   * Setter for samlProviderName.
   * Name of the SAML provider.
   **/
  public void setSamlProviderName(String samlProviderName) {
    this.samlProviderName = samlProviderName;
  }

  /**
   * Getter for samlProviderId.
   * The unique ID of the saml provider.
   **/
  @JsonProperty("samlProviderId")
  public String getSamlProviderId() {
    return samlProviderId;
  }

  /**
   * Setter for samlProviderId.
   * The unique ID of the saml provider.
   **/
  public void setSamlProviderId(String samlProviderId) {
    this.samlProviderId = samlProviderId;
  }

  /**
   * Getter for syncGroupsOnLogin.
   * Whether users federated with this SAML provider will have their group membership synchronized. Group membership can be passed using the https://altus.cloudera.com/SAML/Attributes/groups SAML assertion.
   **/
  @JsonProperty("syncGroupsOnLogin")
  public Boolean getSyncGroupsOnLogin() {
    return syncGroupsOnLogin;
  }

  /**
   * Setter for syncGroupsOnLogin.
   * Whether users federated with this SAML provider will have their group membership synchronized. Group membership can be passed using the https://altus.cloudera.com/SAML/Attributes/groups SAML assertion.
   **/
  public void setSyncGroupsOnLogin(Boolean syncGroupsOnLogin) {
    this.syncGroupsOnLogin = syncGroupsOnLogin;
  }

  /**
   * Getter for samlMetadataDocument.
   * The original metadata that was passed while creating the SAML provider connector. This field will not be set for listSamlProviders API response.
   **/
  @JsonProperty("samlMetadataDocument")
  public String getSamlMetadataDocument() {
    return samlMetadataDocument;
  }

  /**
   * Setter for samlMetadataDocument.
   * The original metadata that was passed while creating the SAML provider connector. This field will not be set for listSamlProviders API response.
   **/
  public void setSamlMetadataDocument(String samlMetadataDocument) {
    this.samlMetadataDocument = samlMetadataDocument;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamlProvider samlProvider = (SamlProvider) o;
    if (!Objects.equals(this.crn, samlProvider.crn)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, samlProvider.creationDate)) {
      return false;
    }
    if (!Objects.equals(this.samlProviderName, samlProvider.samlProviderName)) {
      return false;
    }
    if (!Objects.equals(this.samlProviderId, samlProvider.samlProviderId)) {
      return false;
    }
    if (!Objects.equals(this.syncGroupsOnLogin, samlProvider.syncGroupsOnLogin)) {
      return false;
    }
    if (!Objects.equals(this.samlMetadataDocument, samlProvider.samlMetadataDocument)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, creationDate, samlProviderName, samlProviderId, syncGroupsOnLogin, samlMetadataDocument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlProvider {\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    samlProviderName: ").append(toIndentedString(samlProviderName)).append("\n");
    sb.append("    samlProviderId: ").append(toIndentedString(samlProviderId)).append("\n");
    sb.append("    syncGroupsOnLogin: ").append(toIndentedString(syncGroupsOnLogin)).append("\n");
    sb.append("    samlMetadataDocument: ").append(toIndentedString(samlMetadataDocument)).append("\n");
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

