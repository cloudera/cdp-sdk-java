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
 * Request object for an update AWS credential request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-09T13:56:13.429-07:00")
public class UpdateAwsCredentialRequest  {

  /**
   * The name of the credential.
   **/
  private String credentialName = null;

  /**
   * The ARN of the delegated access role.
   **/
  private String roleArn = null;

  /**
   * A description for the credential.
   **/
  private String description = null;

  /**
   * Whether to skip organizational policy decision checks or not.
   **/
  private Boolean skipOrgPolicyDecisions = false;

  /**
   * Whether to verify permissions upon saving or not.
   **/
  private Boolean verifyPermissions = false;

  /**
   * Getter for credentialName.
   * The name of the credential.
   **/
  @JsonProperty("credentialName")
  public String getCredentialName() {
    return credentialName;
  }

  /**
   * Setter for credentialName.
   * The name of the credential.
   **/
  public void setCredentialName(String credentialName) {
    this.credentialName = credentialName;
  }

  /**
   * Getter for roleArn.
   * The ARN of the delegated access role.
   **/
  @JsonProperty("roleArn")
  public String getRoleArn() {
    return roleArn;
  }

  /**
   * Setter for roleArn.
   * The ARN of the delegated access role.
   **/
  public void setRoleArn(String roleArn) {
    this.roleArn = roleArn;
  }

  /**
   * Getter for description.
   * A description for the credential.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * A description for the credential.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for skipOrgPolicyDecisions.
   * Whether to skip organizational policy decision checks or not.
   **/
  @JsonProperty("skipOrgPolicyDecisions")
  public Boolean getSkipOrgPolicyDecisions() {
    return skipOrgPolicyDecisions;
  }

  /**
   * Setter for skipOrgPolicyDecisions.
   * Whether to skip organizational policy decision checks or not.
   **/
  public void setSkipOrgPolicyDecisions(Boolean skipOrgPolicyDecisions) {
    this.skipOrgPolicyDecisions = skipOrgPolicyDecisions;
  }

  /**
   * Getter for verifyPermissions.
   * Whether to verify permissions upon saving or not.
   **/
  @JsonProperty("verifyPermissions")
  public Boolean getVerifyPermissions() {
    return verifyPermissions;
  }

  /**
   * Setter for verifyPermissions.
   * Whether to verify permissions upon saving or not.
   **/
  public void setVerifyPermissions(Boolean verifyPermissions) {
    this.verifyPermissions = verifyPermissions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAwsCredentialRequest updateAwsCredentialRequest = (UpdateAwsCredentialRequest) o;
    if (!Objects.equals(this.credentialName, updateAwsCredentialRequest.credentialName)) {
      return false;
    }
    if (!Objects.equals(this.roleArn, updateAwsCredentialRequest.roleArn)) {
      return false;
    }
    if (!Objects.equals(this.description, updateAwsCredentialRequest.description)) {
      return false;
    }
    if (!Objects.equals(this.skipOrgPolicyDecisions, updateAwsCredentialRequest.skipOrgPolicyDecisions)) {
      return false;
    }
    if (!Objects.equals(this.verifyPermissions, updateAwsCredentialRequest.verifyPermissions)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialName, roleArn, description, skipOrgPolicyDecisions, verifyPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAwsCredentialRequest {\n");
    sb.append("    credentialName: ").append(toIndentedString(credentialName)).append("\n");
    sb.append("    roleArn: ").append(toIndentedString(roleArn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    skipOrgPolicyDecisions: ").append(toIndentedString(skipOrgPolicyDecisions)).append("\n");
    sb.append("    verifyPermissions: ").append(toIndentedString(verifyPermissions)).append("\n");
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

