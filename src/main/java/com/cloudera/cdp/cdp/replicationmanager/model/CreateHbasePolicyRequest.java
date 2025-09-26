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
import com.cloudera.cdp.replicationmanager.model.HbasePolicyDefinition;

/**
 * Create an HBase replication policy.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-09-26T09:46:38.244-07:00")
public class CreateHbasePolicyRequest  {

  /**
   * CRN of the destination cluster.
   **/
  private String clusterCrn = null;

  /**
   * Name of the new policy.
   **/
  private String policyName = null;

  /**
   * Policy definition.
   **/
  private HbasePolicyDefinition policyDefinition = null;

  /**
   * Getter for clusterCrn.
   * CRN of the destination cluster.
   **/
  @JsonProperty("clusterCrn")
  public String getClusterCrn() {
    return clusterCrn;
  }

  /**
   * Setter for clusterCrn.
   * CRN of the destination cluster.
   **/
  public void setClusterCrn(String clusterCrn) {
    this.clusterCrn = clusterCrn;
  }

  /**
   * Getter for policyName.
   * Name of the new policy.
   **/
  @JsonProperty("policyName")
  public String getPolicyName() {
    return policyName;
  }

  /**
   * Setter for policyName.
   * Name of the new policy.
   **/
  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  /**
   * Getter for policyDefinition.
   * Policy definition.
   **/
  @JsonProperty("policyDefinition")
  public HbasePolicyDefinition getPolicyDefinition() {
    return policyDefinition;
  }

  /**
   * Setter for policyDefinition.
   * Policy definition.
   **/
  public void setPolicyDefinition(HbasePolicyDefinition policyDefinition) {
    this.policyDefinition = policyDefinition;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateHbasePolicyRequest createHbasePolicyRequest = (CreateHbasePolicyRequest) o;
    if (!Objects.equals(this.clusterCrn, createHbasePolicyRequest.clusterCrn)) {
      return false;
    }
    if (!Objects.equals(this.policyName, createHbasePolicyRequest.policyName)) {
      return false;
    }
    if (!Objects.equals(this.policyDefinition, createHbasePolicyRequest.policyDefinition)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterCrn, policyName, policyDefinition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateHbasePolicyRequest {\n");
    sb.append("    clusterCrn: ").append(toIndentedString(clusterCrn)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policyDefinition: ").append(toIndentedString(policyDefinition)).append("\n");
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

