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

/**
 * Request object to get a particular policy version.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:58.300Z")
public class DownloadPolicyRequest  {

  /**
   * The name of the policy.
   **/
  private String policyName = null;

  /**
   * The policy version.
   **/
  private String policyVersion = null;

  /**
   * The CRN of the CLO Data Hub.
   **/
  private String datahubCrn = null;

  /**
   * Getter for policyName.
   * The name of the policy.
   **/
  @JsonProperty("policyName")
  public String getPolicyName() {
    return policyName;
  }

  /**
   * Setter for policyName.
   * The name of the policy.
   **/
  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  /**
   * Getter for policyVersion.
   * The policy version.
   **/
  @JsonProperty("policyVersion")
  public String getPolicyVersion() {
    return policyVersion;
  }

  /**
   * Setter for policyVersion.
   * The policy version.
   **/
  public void setPolicyVersion(String policyVersion) {
    this.policyVersion = policyVersion;
  }

  /**
   * Getter for datahubCrn.
   * The CRN of the CLO Data Hub.
   **/
  @JsonProperty("datahubCrn")
  public String getDatahubCrn() {
    return datahubCrn;
  }

  /**
   * Setter for datahubCrn.
   * The CRN of the CLO Data Hub.
   **/
  public void setDatahubCrn(String datahubCrn) {
    this.datahubCrn = datahubCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadPolicyRequest downloadPolicyRequest = (DownloadPolicyRequest) o;
    if (!Objects.equals(this.policyName, downloadPolicyRequest.policyName)) {
      return false;
    }
    if (!Objects.equals(this.policyVersion, downloadPolicyRequest.policyVersion)) {
      return false;
    }
    if (!Objects.equals(this.datahubCrn, downloadPolicyRequest.datahubCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyName, policyVersion, datahubCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadPolicyRequest {\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policyVersion: ").append(toIndentedString(policyVersion)).append("\n");
    sb.append("    datahubCrn: ").append(toIndentedString(datahubCrn)).append("\n");
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

