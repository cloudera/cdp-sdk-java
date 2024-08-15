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
 * Request object for an updating SAML provider request.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-08-15T13:42:18.698-07:00")
public class UpdateSamlProviderRequest  {

  /**
   * The name or CRN of SAML provider to update.
   **/
  private String samlProviderName = null;

  /**
   * SAML metadata document XML file. Length of meta data document cannot be more than 200 KB (200,000 bytes). Can be omitted if no update is required.
   **/
  private String samlMetadataDocument = null;

  /**
   * Whether to sync group information for users federated with this SAML provider. Group membership can be passed using the https://cdp.cloudera.com/SAML/Attributes/groups SAML assertion. The default is to synchronize group membership. Can be omitted if no update is required.
   **/
  private Boolean syncGroupsOnLogin = null;

  /**
   * Whether to generate users' workload username by email. The default is to generate workload usernames by identity provider user ID (SAML NameID).
   **/
  private Boolean generateWorkloadUsernameByEmail = null;

  /**
   * Whether to enable SCIM on this SAML provider. System for Cross-domain Identity Management (SCIM) version 2.0 is a standard for automating the provisioning of user and group identity information from identity provider to CDP. It is not supported for Cloudera for Government.
   **/
  private Boolean enableScim = null;

  /**
   * Getter for samlProviderName.
   * The name or CRN of SAML provider to update.
   **/
  @JsonProperty("samlProviderName")
  public String getSamlProviderName() {
    return samlProviderName;
  }

  /**
   * Setter for samlProviderName.
   * The name or CRN of SAML provider to update.
   **/
  public void setSamlProviderName(String samlProviderName) {
    this.samlProviderName = samlProviderName;
  }

  /**
   * Getter for samlMetadataDocument.
   * SAML metadata document XML file. Length of meta data document cannot be more than 200 KB (200,000 bytes). Can be omitted if no update is required.
   **/
  @JsonProperty("samlMetadataDocument")
  public String getSamlMetadataDocument() {
    return samlMetadataDocument;
  }

  /**
   * Setter for samlMetadataDocument.
   * SAML metadata document XML file. Length of meta data document cannot be more than 200 KB (200,000 bytes). Can be omitted if no update is required.
   **/
  public void setSamlMetadataDocument(String samlMetadataDocument) {
    this.samlMetadataDocument = samlMetadataDocument;
  }

  /**
   * Getter for syncGroupsOnLogin.
   * Whether to sync group information for users federated with this SAML provider. Group membership can be passed using the https://cdp.cloudera.com/SAML/Attributes/groups SAML assertion. The default is to synchronize group membership. Can be omitted if no update is required.
   **/
  @JsonProperty("syncGroupsOnLogin")
  public Boolean getSyncGroupsOnLogin() {
    return syncGroupsOnLogin;
  }

  /**
   * Setter for syncGroupsOnLogin.
   * Whether to sync group information for users federated with this SAML provider. Group membership can be passed using the https://cdp.cloudera.com/SAML/Attributes/groups SAML assertion. The default is to synchronize group membership. Can be omitted if no update is required.
   **/
  public void setSyncGroupsOnLogin(Boolean syncGroupsOnLogin) {
    this.syncGroupsOnLogin = syncGroupsOnLogin;
  }

  /**
   * Getter for generateWorkloadUsernameByEmail.
   * Whether to generate users&#39; workload username by email. The default is to generate workload usernames by identity provider user ID (SAML NameID).
   **/
  @JsonProperty("generateWorkloadUsernameByEmail")
  public Boolean getGenerateWorkloadUsernameByEmail() {
    return generateWorkloadUsernameByEmail;
  }

  /**
   * Setter for generateWorkloadUsernameByEmail.
   * Whether to generate users&#39; workload username by email. The default is to generate workload usernames by identity provider user ID (SAML NameID).
   **/
  public void setGenerateWorkloadUsernameByEmail(Boolean generateWorkloadUsernameByEmail) {
    this.generateWorkloadUsernameByEmail = generateWorkloadUsernameByEmail;
  }

  /**
   * Getter for enableScim.
   * Whether to enable SCIM on this SAML provider. System for Cross-domain Identity Management (SCIM) version 2.0 is a standard for automating the provisioning of user and group identity information from identity provider to CDP. It is not supported for Cloudera for Government.
   **/
  @JsonProperty("enableScim")
  public Boolean getEnableScim() {
    return enableScim;
  }

  /**
   * Setter for enableScim.
   * Whether to enable SCIM on this SAML provider. System for Cross-domain Identity Management (SCIM) version 2.0 is a standard for automating the provisioning of user and group identity information from identity provider to CDP. It is not supported for Cloudera for Government.
   **/
  public void setEnableScim(Boolean enableScim) {
    this.enableScim = enableScim;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSamlProviderRequest updateSamlProviderRequest = (UpdateSamlProviderRequest) o;
    if (!Objects.equals(this.samlProviderName, updateSamlProviderRequest.samlProviderName)) {
      return false;
    }
    if (!Objects.equals(this.samlMetadataDocument, updateSamlProviderRequest.samlMetadataDocument)) {
      return false;
    }
    if (!Objects.equals(this.syncGroupsOnLogin, updateSamlProviderRequest.syncGroupsOnLogin)) {
      return false;
    }
    if (!Objects.equals(this.generateWorkloadUsernameByEmail, updateSamlProviderRequest.generateWorkloadUsernameByEmail)) {
      return false;
    }
    if (!Objects.equals(this.enableScim, updateSamlProviderRequest.enableScim)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(samlProviderName, samlMetadataDocument, syncGroupsOnLogin, generateWorkloadUsernameByEmail, enableScim);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSamlProviderRequest {\n");
    sb.append("    samlProviderName: ").append(toIndentedString(samlProviderName)).append("\n");
    sb.append("    samlMetadataDocument: ").append(toIndentedString(samlMetadataDocument)).append("\n");
    sb.append("    syncGroupsOnLogin: ").append(toIndentedString(syncGroupsOnLogin)).append("\n");
    sb.append("    generateWorkloadUsernameByEmail: ").append(toIndentedString(generateWorkloadUsernameByEmail)).append("\n");
    sb.append("    enableScim: ").append(toIndentedString(enableScim)).append("\n");
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

