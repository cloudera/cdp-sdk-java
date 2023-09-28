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

/**
 * The audit credential prerequisites for GovCloud for the enabled providers.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-09-27T13:27:53.061-07:00")
public class GetGovCloudAuditCredentialPrerequisitesResponse extends CdpResponse {

  /**
   * The provider specific identifier of the account/subscription/project.
   **/
  private String accountId = null;

  /**
   * Provides the external id and policy JSON (this one encoded in base64) for AWS credential creation.
   **/
  private AwsCredentialPrerequisitesResponse aws = null;

  /**
   * Getter for accountId.
   * The provider specific identifier of the account/subscription/project.
   **/
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }

  /**
   * Setter for accountId.
   * The provider specific identifier of the account/subscription/project.
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGovCloudAuditCredentialPrerequisitesResponse getGovCloudAuditCredentialPrerequisitesResponse = (GetGovCloudAuditCredentialPrerequisitesResponse) o;
    if (!Objects.equals(this.accountId, getGovCloudAuditCredentialPrerequisitesResponse.accountId)) {
      return false;
    }
    if (!Objects.equals(this.aws, getGovCloudAuditCredentialPrerequisitesResponse.aws)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, aws, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGovCloudAuditCredentialPrerequisitesResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    aws: ").append(toIndentedString(aws)).append("\n");
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

