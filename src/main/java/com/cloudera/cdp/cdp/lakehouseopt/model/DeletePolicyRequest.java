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
 * Request object specifying the policy and resource scope for deletion.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:58.300Z")
public class DeletePolicyRequest  {

  /**
   * The CRN of the CLO Data Hub.
   **/
  private String datahubCrn = null;

  /**
   * Policy name that needs to be deleted. The version is identified through the resource.
   **/
  private String policyName = null;

  /**
   * Represents the hierarchical level (<catalog>.<namespace>.<table>) at which a policy is defined and needs to be deleted. Give `*` for catalog level and `catalog.namespace.*` for namespace level.
   **/
  private String resourceScope = null;

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

  /**
   * Getter for policyName.
   * Policy name that needs to be deleted. The version is identified through the resource.
   **/
  @JsonProperty("policyName")
  public String getPolicyName() {
    return policyName;
  }

  /**
   * Setter for policyName.
   * Policy name that needs to be deleted. The version is identified through the resource.
   **/
  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  /**
   * Getter for resourceScope.
   * Represents the hierarchical level (&lt;catalog&gt;.&lt;namespace&gt;.&lt;table&gt;) at which a policy is defined and needs to be deleted. Give &#x60;*&#x60; for catalog level and &#x60;catalog.namespace.*&#x60; for namespace level.
   **/
  @JsonProperty("resourceScope")
  public String getResourceScope() {
    return resourceScope;
  }

  /**
   * Setter for resourceScope.
   * Represents the hierarchical level (&lt;catalog&gt;.&lt;namespace&gt;.&lt;table&gt;) at which a policy is defined and needs to be deleted. Give &#x60;*&#x60; for catalog level and &#x60;catalog.namespace.*&#x60; for namespace level.
   **/
  public void setResourceScope(String resourceScope) {
    this.resourceScope = resourceScope;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletePolicyRequest deletePolicyRequest = (DeletePolicyRequest) o;
    if (!Objects.equals(this.datahubCrn, deletePolicyRequest.datahubCrn)) {
      return false;
    }
    if (!Objects.equals(this.policyName, deletePolicyRequest.policyName)) {
      return false;
    }
    if (!Objects.equals(this.resourceScope, deletePolicyRequest.resourceScope)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(datahubCrn, policyName, resourceScope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePolicyRequest {\n");
    sb.append("    datahubCrn: ").append(toIndentedString(datahubCrn)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    resourceScope: ").append(toIndentedString(resourceScope)).append("\n");
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

