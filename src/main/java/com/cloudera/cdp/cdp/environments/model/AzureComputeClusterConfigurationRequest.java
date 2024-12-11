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
import java.util.*;

/**
 * Request object for creating Externalized compute cluster for the environment.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-11T11:26:10.209-08:00")
public class AzureComputeClusterConfigurationRequest  {

  /**
   * If true, creates private cluster
   **/
  private Boolean privateCluster = null;

  /**
   * Kubernetes API authorized IP ranges in CIDR notation. Mutually exclusive with privateCluster.
   **/
  private List<String> kubeApiAuthorizedIpRanges = new ArrayList<String>();

  /**
   * Customize cluster egress with defined outbound type in Azure Kubernetes Service.
   **/
  private String outboundType = null;

  /**
   * Specify subnets for Kubernetes Worker Nodes
   **/
  private List<String> workerNodeSubnets = new ArrayList<String>();

  /**
   * Getter for privateCluster.
   * If true, creates private cluster
   **/
  @JsonProperty("privateCluster")
  public Boolean getPrivateCluster() {
    return privateCluster;
  }

  /**
   * Setter for privateCluster.
   * If true, creates private cluster
   **/
  public void setPrivateCluster(Boolean privateCluster) {
    this.privateCluster = privateCluster;
  }

  /**
   * Getter for kubeApiAuthorizedIpRanges.
   * Kubernetes API authorized IP ranges in CIDR notation. Mutually exclusive with privateCluster.
   **/
  @JsonProperty("kubeApiAuthorizedIpRanges")
  public List<String> getKubeApiAuthorizedIpRanges() {
    return kubeApiAuthorizedIpRanges;
  }

  /**
   * Setter for kubeApiAuthorizedIpRanges.
   * Kubernetes API authorized IP ranges in CIDR notation. Mutually exclusive with privateCluster.
   **/
  public void setKubeApiAuthorizedIpRanges(List<String> kubeApiAuthorizedIpRanges) {
    this.kubeApiAuthorizedIpRanges = kubeApiAuthorizedIpRanges;
  }

  /**
   * Getter for outboundType.
   * Customize cluster egress with defined outbound type in Azure Kubernetes Service.
   **/
  @JsonProperty("outboundType")
  public String getOutboundType() {
    return outboundType;
  }

  /**
   * Setter for outboundType.
   * Customize cluster egress with defined outbound type in Azure Kubernetes Service.
   **/
  public void setOutboundType(String outboundType) {
    this.outboundType = outboundType;
  }

  /**
   * Getter for workerNodeSubnets.
   * Specify subnets for Kubernetes Worker Nodes
   **/
  @JsonProperty("workerNodeSubnets")
  public List<String> getWorkerNodeSubnets() {
    return workerNodeSubnets;
  }

  /**
   * Setter for workerNodeSubnets.
   * Specify subnets for Kubernetes Worker Nodes
   **/
  public void setWorkerNodeSubnets(List<String> workerNodeSubnets) {
    this.workerNodeSubnets = workerNodeSubnets;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureComputeClusterConfigurationRequest azureComputeClusterConfigurationRequest = (AzureComputeClusterConfigurationRequest) o;
    if (!Objects.equals(this.privateCluster, azureComputeClusterConfigurationRequest.privateCluster)) {
      return false;
    }
    if (!Objects.equals(this.kubeApiAuthorizedIpRanges, azureComputeClusterConfigurationRequest.kubeApiAuthorizedIpRanges)) {
      return false;
    }
    if (!Objects.equals(this.outboundType, azureComputeClusterConfigurationRequest.outboundType)) {
      return false;
    }
    if (!Objects.equals(this.workerNodeSubnets, azureComputeClusterConfigurationRequest.workerNodeSubnets)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateCluster, kubeApiAuthorizedIpRanges, outboundType, workerNodeSubnets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureComputeClusterConfigurationRequest {\n");
    sb.append("    privateCluster: ").append(toIndentedString(privateCluster)).append("\n");
    sb.append("    kubeApiAuthorizedIpRanges: ").append(toIndentedString(kubeApiAuthorizedIpRanges)).append("\n");
    sb.append("    outboundType: ").append(toIndentedString(outboundType)).append("\n");
    sb.append("    workerNodeSubnets: ").append(toIndentedString(workerNodeSubnets)).append("\n");
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

