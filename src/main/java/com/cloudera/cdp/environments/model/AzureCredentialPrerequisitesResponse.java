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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Response object for getting Azure credential prerequisites.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-04-29T14:24:31.002-07:00")
public class AzureCredentialPrerequisitesResponse extends CdpResponse {

  /**
   * Azure CLI command to create Azure AD Application encoded in base64.
   **/
  private String appCreationCommand = null;

  /**
   * The related role definition json encoded in base64
   **/
  private String roleDefinitionJson = null;

  /**
   * Getter for appCreationCommand.
   * Azure CLI command to create Azure AD Application encoded in base64.
   **/
  @JsonProperty("appCreationCommand")
  public String getAppCreationCommand() {
    return appCreationCommand;
  }

  /**
   * Setter for appCreationCommand.
   * Azure CLI command to create Azure AD Application encoded in base64.
   **/
  public void setAppCreationCommand(String appCreationCommand) {
    this.appCreationCommand = appCreationCommand;
  }

  /**
   * Getter for roleDefinitionJson.
   * The related role definition json encoded in base64
   **/
  @JsonProperty("roleDefinitionJson")
  public String getRoleDefinitionJson() {
    return roleDefinitionJson;
  }

  /**
   * Setter for roleDefinitionJson.
   * The related role definition json encoded in base64
   **/
  public void setRoleDefinitionJson(String roleDefinitionJson) {
    this.roleDefinitionJson = roleDefinitionJson;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureCredentialPrerequisitesResponse azureCredentialPrerequisitesResponse = (AzureCredentialPrerequisitesResponse) o;
    if (!Objects.equals(this.appCreationCommand, azureCredentialPrerequisitesResponse.appCreationCommand)) {
      return false;
    }
    if (!Objects.equals(this.roleDefinitionJson, azureCredentialPrerequisitesResponse.roleDefinitionJson)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(appCreationCommand, roleDefinitionJson, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureCredentialPrerequisitesResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    appCreationCommand: ").append(toIndentedString(appCreationCommand)).append("\n");
    sb.append("    roleDefinitionJson: ").append(toIndentedString(roleDefinitionJson)).append("\n");
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

