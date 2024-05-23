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
import com.cloudera.cdp.environments.model.CredentialGranularPolicyResponse;
import java.util.*;

/**
 * Response object for getting Azure credential prerequisites.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-05-22T20:53:55.093-07:00")
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
   * The fine-grained policies related to each service.
   **/
  private List<CredentialGranularPolicyResponse> policies = new ArrayList<CredentialGranularPolicyResponse>();

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

  /**
   * Getter for policies.
   * The fine-grained policies related to each service.
   **/
  @JsonProperty("policies")
  public List<CredentialGranularPolicyResponse> getPolicies() {
    return policies;
  }

  /**
   * Setter for policies.
   * The fine-grained policies related to each service.
   **/
  public void setPolicies(List<CredentialGranularPolicyResponse> policies) {
    this.policies = policies;
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
    if (!Objects.equals(this.policies, azureCredentialPrerequisitesResponse.policies)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(appCreationCommand, roleDefinitionJson, policies, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureCredentialPrerequisitesResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    appCreationCommand: ").append(toIndentedString(appCreationCommand)).append("\n");
    sb.append("    roleDefinitionJson: ").append(toIndentedString(roleDefinitionJson)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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

