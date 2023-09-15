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
 * Response object for getting AWS credential prerequisites.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-09-14T10:47:18.529-07:00")
public class AwsCredentialPrerequisitesResponse extends CdpResponse {

  /**
   * The cross-account external ID.
   **/
  private String externalId = null;

  /**
   * The related policy json encoded in base64
   **/
  private String policyJson = null;

  /**
   * The fine-grained policies related to each service.
   **/
  private List<CredentialGranularPolicyResponse> policies = new ArrayList<CredentialGranularPolicyResponse>();

  /**
   * Getter for externalId.
   * The cross-account external ID.
   **/
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  /**
   * Setter for externalId.
   * The cross-account external ID.
   **/
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   * Getter for policyJson.
   * The related policy json encoded in base64
   **/
  @JsonProperty("policyJson")
  public String getPolicyJson() {
    return policyJson;
  }

  /**
   * Setter for policyJson.
   * The related policy json encoded in base64
   **/
  public void setPolicyJson(String policyJson) {
    this.policyJson = policyJson;
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
    AwsCredentialPrerequisitesResponse awsCredentialPrerequisitesResponse = (AwsCredentialPrerequisitesResponse) o;
    if (!Objects.equals(this.externalId, awsCredentialPrerequisitesResponse.externalId)) {
      return false;
    }
    if (!Objects.equals(this.policyJson, awsCredentialPrerequisitesResponse.policyJson)) {
      return false;
    }
    if (!Objects.equals(this.policies, awsCredentialPrerequisitesResponse.policies)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, policyJson, policies, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsCredentialPrerequisitesResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    policyJson: ").append(toIndentedString(policyJson)).append("\n");
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

