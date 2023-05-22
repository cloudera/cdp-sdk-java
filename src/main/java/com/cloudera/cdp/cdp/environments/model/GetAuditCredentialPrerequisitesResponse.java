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
import com.cloudera.cdp.environments.model.AwsCredentialPrerequisitesResponse;
import com.cloudera.cdp.environments.model.AzureCredentialPrerequisitesResponse;

/**
 * The audit credential prerequisites.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-05-19T00:55:26.598-07:00")
public class GetAuditCredentialPrerequisitesResponse extends CdpResponse {

  /**
   * The name of the given cloud platform
   **/
  private String cloudPlatform = null;

  /**
   * The provider specific identifier of the account/subscription/project that is used by Cloudbreak.
   **/
  private String accountId = null;

  /**
   * Provides the external id and policy JSON (this one encoded in base64) for AWS credential creation.
   **/
  private AwsCredentialPrerequisitesResponse aws = null;

  /**
   * Provides the app creation command and role definition Json for Azure credential creation.
   **/
  private AzureCredentialPrerequisitesResponse azure = null;

  /**
   * Getter for cloudPlatform.
   * The name of the given cloud platform
   **/
  @JsonProperty("cloudPlatform")
  public String getCloudPlatform() {
    return cloudPlatform;
  }

  /**
   * Setter for cloudPlatform.
   * The name of the given cloud platform
   **/
  public void setCloudPlatform(String cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
  }

  /**
   * Getter for accountId.
   * The provider specific identifier of the account/subscription/project that is used by Cloudbreak.
   **/
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }

  /**
   * Setter for accountId.
   * The provider specific identifier of the account/subscription/project that is used by Cloudbreak.
   **/
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * Getter for aws.
   * Provides the external id and policy JSON (this one encoded in base64) for AWS credential creation.
   **/
  @JsonProperty("aws")
  public AwsCredentialPrerequisitesResponse getAws() {
    return aws;
  }

  /**
   * Setter for aws.
   * Provides the external id and policy JSON (this one encoded in base64) for AWS credential creation.
   **/
  public void setAws(AwsCredentialPrerequisitesResponse aws) {
    this.aws = aws;
  }

  /**
   * Getter for azure.
   * Provides the app creation command and role definition Json for Azure credential creation.
   **/
  @JsonProperty("azure")
  public AzureCredentialPrerequisitesResponse getAzure() {
    return azure;
  }

  /**
   * Setter for azure.
   * Provides the app creation command and role definition Json for Azure credential creation.
   **/
  public void setAzure(AzureCredentialPrerequisitesResponse azure) {
    this.azure = azure;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAuditCredentialPrerequisitesResponse getAuditCredentialPrerequisitesResponse = (GetAuditCredentialPrerequisitesResponse) o;
    if (!Objects.equals(this.cloudPlatform, getAuditCredentialPrerequisitesResponse.cloudPlatform)) {
      return false;
    }
    if (!Objects.equals(this.accountId, getAuditCredentialPrerequisitesResponse.accountId)) {
      return false;
    }
    if (!Objects.equals(this.aws, getAuditCredentialPrerequisitesResponse.aws)) {
      return false;
    }
    if (!Objects.equals(this.azure, getAuditCredentialPrerequisitesResponse.azure)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudPlatform, accountId, aws, azure, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAuditCredentialPrerequisitesResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    cloudPlatform: ").append(toIndentedString(cloudPlatform)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    aws: ").append(toIndentedString(aws)).append("\n");
    sb.append("    azure: ").append(toIndentedString(azure)).append("\n");
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

