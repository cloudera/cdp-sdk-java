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

package com.cloudera.cdp.replicationmanager.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.replicationmanager.model.UpdateHbasePolicyDefinition;

/**
 * Update HBase replication policy request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-27T10:36:32.351-07:00")
public class UpdateHbasePolicyRequest  {

  /**
   * The CRN of the cluster where the policy will be updated.
   **/
  private String clusterCrn = null;

  /**
   * The ID of the policy to be updated.
   **/
  private String policyId = null;

  /**
   * The policy definition.
   **/
  private UpdateHbasePolicyDefinition updateHbasePolicyDefinition = null;

  /**
   * Getter for clusterCrn.
   * The CRN of the cluster where the policy will be updated.
   **/
  @JsonProperty("clusterCrn")
  public String getClusterCrn() {
    return clusterCrn;
  }

  /**
   * Setter for clusterCrn.
   * The CRN of the cluster where the policy will be updated.
   **/
  public void setClusterCrn(String clusterCrn) {
    this.clusterCrn = clusterCrn;
  }

  /**
   * Getter for policyId.
   * The ID of the policy to be updated.
   **/
  @JsonProperty("policyId")
  public String getPolicyId() {
    return policyId;
  }

  /**
   * Setter for policyId.
   * The ID of the policy to be updated.
   **/
  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  /**
   * Getter for updateHbasePolicyDefinition.
   * The policy definition.
   **/
  @JsonProperty("updateHbasePolicyDefinition")
  public UpdateHbasePolicyDefinition getUpdateHbasePolicyDefinition() {
    return updateHbasePolicyDefinition;
  }

  /**
   * Setter for updateHbasePolicyDefinition.
   * The policy definition.
   **/
  public void setUpdateHbasePolicyDefinition(UpdateHbasePolicyDefinition updateHbasePolicyDefinition) {
    this.updateHbasePolicyDefinition = updateHbasePolicyDefinition;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateHbasePolicyRequest updateHbasePolicyRequest = (UpdateHbasePolicyRequest) o;
    if (!Objects.equals(this.clusterCrn, updateHbasePolicyRequest.clusterCrn)) {
      return false;
    }
    if (!Objects.equals(this.policyId, updateHbasePolicyRequest.policyId)) {
      return false;
    }
    if (!Objects.equals(this.updateHbasePolicyDefinition, updateHbasePolicyRequest.updateHbasePolicyDefinition)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterCrn, policyId, updateHbasePolicyDefinition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateHbasePolicyRequest {\n");
    sb.append("    clusterCrn: ").append(toIndentedString(clusterCrn)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    updateHbasePolicyDefinition: ").append(toIndentedString(updateHbasePolicyDefinition)).append("\n");
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

