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

package com.cloudera.cdp.lakehouseopt.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.lakehouseopt.model.GetPolicyResponsePolicyDetail;
import java.util.*;

/**
 * Response object containing the policy detail which includes version IDs, associations, scope and status.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-05T07:54:46.717-07:00")
public class GetPolicyResponse extends CdpResponse {

  /**
   * List of all version IDs of the policy.
   **/
  private List<String> versions = new ArrayList<String>();

  /**
   * 
   **/
  private GetPolicyResponsePolicyDetail policyDetail = null;

  /**
   * Getter for versions.
   * List of all version IDs of the policy.
   **/
  @JsonProperty("versions")
  public List<String> getVersions() {
    return versions;
  }

  /**
   * Setter for versions.
   * List of all version IDs of the policy.
   **/
  public void setVersions(List<String> versions) {
    this.versions = versions;
  }

  /**
   * Getter for policyDetail.
   * 
   **/
  @JsonProperty("policyDetail")
  public GetPolicyResponsePolicyDetail getPolicyDetail() {
    return policyDetail;
  }

  /**
   * Setter for policyDetail.
   * 
   **/
  public void setPolicyDetail(GetPolicyResponsePolicyDetail policyDetail) {
    this.policyDetail = policyDetail;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPolicyResponse getPolicyResponse = (GetPolicyResponse) o;
    if (!Objects.equals(this.versions, getPolicyResponse.versions)) {
      return false;
    }
    if (!Objects.equals(this.policyDetail, getPolicyResponse.policyDetail)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(versions, policyDetail, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPolicyResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("    policyDetail: ").append(toIndentedString(policyDetail)).append("\n");
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

