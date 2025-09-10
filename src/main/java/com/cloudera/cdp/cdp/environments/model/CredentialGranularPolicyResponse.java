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
 * Response object for the granular policy for the given service or experience.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-09T16:18:24.748-07:00")
public class CredentialGranularPolicyResponse extends CdpResponse {

  /**
   * The name of the service that requires the given policy for resource management.
   **/
  private String service = null;

  /**
   * The policy JSON encoded in base64.
   **/
  private String policyJson = null;

  /**
   * Getter for service.
   * The name of the service that requires the given policy for resource management.
   **/
  @JsonProperty("service")
  public String getService() {
    return service;
  }

  /**
   * Setter for service.
   * The name of the service that requires the given policy for resource management.
   **/
  public void setService(String service) {
    this.service = service;
  }

  /**
   * Getter for policyJson.
   * The policy JSON encoded in base64.
   **/
  @JsonProperty("policyJson")
  public String getPolicyJson() {
    return policyJson;
  }

  /**
   * Setter for policyJson.
   * The policy JSON encoded in base64.
   **/
  public void setPolicyJson(String policyJson) {
    this.policyJson = policyJson;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialGranularPolicyResponse credentialGranularPolicyResponse = (CredentialGranularPolicyResponse) o;
    if (!Objects.equals(this.service, credentialGranularPolicyResponse.service)) {
      return false;
    }
    if (!Objects.equals(this.policyJson, credentialGranularPolicyResponse.policyJson)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(service, policyJson, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialGranularPolicyResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    policyJson: ").append(toIndentedString(policyJson)).append("\n");
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

