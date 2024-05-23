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
 * Information used to connect a CDP account to an external identity provider.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-05-22T20:53:56.170-07:00")
public class SamlProvider  {

  /**
   * CRN of the SAML provider in CDP.
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
   * Whether users federated with this SAML provider will have their group membership synchronized. Group membership can be passed using the https://cdp.cloudera.com/SAML/Attributes/groups SAML assertion.
   **/
  private Boolean syncGroupsOnLogin = null;

  /**
   * Whether to generate users' workload username by email or by identity provider user ID (SAML NameID).
   **/
  private Boolean generateWorkloadUsernameByEmail = null;

  /**
   * Whether SCIM is enabled on this SAML provider. System for Cross-domain Identity Management (SCIM) version 2.0 is a standard for automating the provisioning of user and group identity information from identity provider to CDP. It is omitted for Cloudera for Government.
   **/
  private Boolean enableScim = null;

  /**
   * The SCIM URL if SCIM is enabled. It is omitted for Cloudera for Government.
   **/
  private String scimUrl = null;

  /**
   * The original metadata that was passed while creating the SAML provider connector. This field will not be set when the SAML provider does not have metadata. This field will not be set for listSamlProviders API response.
   **/
  private String samlMetadataDocument = null;

  /**
   * The Service Provider SAML metadata specific to this CDP SAML provider. This field will only be set for createSamlProvider and describeSamlProvider API calls.
   **/
  private String cdpSpMetadata = null;

  /**
   * Getter for crn.
   * CRN of the SAML provider in CDP.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * CRN of the SAML provider in CDP.
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
   * Whether users federated with this SAML provider will have their group membership synchronized. Group membership can be passed using the https://cdp.cloudera.com/SAML/Attributes/groups SAML assertion.
   **/
  @JsonProperty("syncGroupsOnLogin")
  public Boolean getSyncGroupsOnLogin() {
    return syncGroupsOnLogin;
  }

  /**
   * Setter for syncGroupsOnLogin.
   * Whether users federated with this SAML provider will have their group membership synchronized. Group membership can be passed using the https://cdp.cloudera.com/SAML/Attributes/groups SAML assertion.
   **/
  public void setSyncGroupsOnLogin(Boolean syncGroupsOnLogin) {
    this.syncGroupsOnLogin = syncGroupsOnLogin;
  }

  /**
   * Getter for generateWorkloadUsernameByEmail.
   * Whether to generate users&#39; workload username by email or by identity provider user ID (SAML NameID).
   **/
  @JsonProperty("generateWorkloadUsernameByEmail")
  public Boolean getGenerateWorkloadUsernameByEmail() {
    return generateWorkloadUsernameByEmail;
  }

  /**
   * Setter for generateWorkloadUsernameByEmail.
   * Whether to generate users&#39; workload username by email or by identity provider user ID (SAML NameID).
   **/
  public void setGenerateWorkloadUsernameByEmail(Boolean generateWorkloadUsernameByEmail) {
    this.generateWorkloadUsernameByEmail = generateWorkloadUsernameByEmail;
  }

  /**
   * Getter for enableScim.
   * Whether SCIM is enabled on this SAML provider. System for Cross-domain Identity Management (SCIM) version 2.0 is a standard for automating the provisioning of user and group identity information from identity provider to CDP. It is omitted for Cloudera for Government.
   **/
  @JsonProperty("enableScim")
  public Boolean getEnableScim() {
    return enableScim;
  }

  /**
   * Setter for enableScim.
   * Whether SCIM is enabled on this SAML provider. System for Cross-domain Identity Management (SCIM) version 2.0 is a standard for automating the provisioning of user and group identity information from identity provider to CDP. It is omitted for Cloudera for Government.
   **/
  public void setEnableScim(Boolean enableScim) {
    this.enableScim = enableScim;
  }

  /**
   * Getter for scimUrl.
   * The SCIM URL if SCIM is enabled. It is omitted for Cloudera for Government.
   **/
  @JsonProperty("scimUrl")
  public String getScimUrl() {
    return scimUrl;
  }

  /**
   * Setter for scimUrl.
   * The SCIM URL if SCIM is enabled. It is omitted for Cloudera for Government.
   **/
  public void setScimUrl(String scimUrl) {
    this.scimUrl = scimUrl;
  }

  /**
   * Getter for samlMetadataDocument.
   * The original metadata that was passed while creating the SAML provider connector. This field will not be set when the SAML provider does not have metadata. This field will not be set for listSamlProviders API response.
   **/
  @JsonProperty("samlMetadataDocument")
  public String getSamlMetadataDocument() {
    return samlMetadataDocument;
  }

  /**
   * Setter for samlMetadataDocument.
   * The original metadata that was passed while creating the SAML provider connector. This field will not be set when the SAML provider does not have metadata. This field will not be set for listSamlProviders API response.
   **/
  public void setSamlMetadataDocument(String samlMetadataDocument) {
    this.samlMetadataDocument = samlMetadataDocument;
  }

  /**
   * Getter for cdpSpMetadata.
   * The Service Provider SAML metadata specific to this CDP SAML provider. This field will only be set for createSamlProvider and describeSamlProvider API calls.
   **/
  @JsonProperty("cdpSpMetadata")
  public String getCdpSpMetadata() {
    return cdpSpMetadata;
  }

  /**
   * Setter for cdpSpMetadata.
   * The Service Provider SAML metadata specific to this CDP SAML provider. This field will only be set for createSamlProvider and describeSamlProvider API calls.
   **/
  public void setCdpSpMetadata(String cdpSpMetadata) {
    this.cdpSpMetadata = cdpSpMetadata;
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
    if (!Objects.equals(this.generateWorkloadUsernameByEmail, samlProvider.generateWorkloadUsernameByEmail)) {
      return false;
    }
    if (!Objects.equals(this.enableScim, samlProvider.enableScim)) {
      return false;
    }
    if (!Objects.equals(this.scimUrl, samlProvider.scimUrl)) {
      return false;
    }
    if (!Objects.equals(this.samlMetadataDocument, samlProvider.samlMetadataDocument)) {
      return false;
    }
    if (!Objects.equals(this.cdpSpMetadata, samlProvider.cdpSpMetadata)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(crn, creationDate, samlProviderName, samlProviderId, syncGroupsOnLogin, generateWorkloadUsernameByEmail, enableScim, scimUrl, samlMetadataDocument, cdpSpMetadata);
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
    sb.append("    generateWorkloadUsernameByEmail: ").append(toIndentedString(generateWorkloadUsernameByEmail)).append("\n");
    sb.append("    enableScim: ").append(toIndentedString(enableScim)).append("\n");
    sb.append("    scimUrl: ").append(toIndentedString(scimUrl)).append("\n");
    sb.append("    samlMetadataDocument: ").append(toIndentedString(samlMetadataDocument)).append("\n");
    sb.append("    cdpSpMetadata: ").append(toIndentedString(cdpSpMetadata)).append("\n");
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

