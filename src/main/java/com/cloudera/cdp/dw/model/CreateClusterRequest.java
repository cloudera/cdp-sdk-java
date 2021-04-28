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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.dw.model.AwsActivationOptions;
import com.cloudera.cdp.dw.model.AzureActivationOptions;

/**
 * Request object for the createCluster method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-04-28T12:37:14.058-07:00")
public class CreateClusterRequest  {

  /**
   * The environment for the cluster to create.
   **/
  private String environmentCrn = null;

  /**
   * Using an overlay network will save IP addresses in the VPC by using a private IP address range for Pods in the cluster.
   **/
  private Boolean useOverlayNetwork = null;

  /**
   * Set up load balancer in private subnets -- make sure there is connectivity between your VPN and the VPC of CDW environment.
   **/
  private Boolean usePrivateLoadBalancer = null;

  /**
   * Options for activating an AWS environment.
   **/
  private AwsActivationOptions awsOptions = null;

  /**
   * Options for activating an Azure environment.
   **/
  private AzureActivationOptions azureOptions = null;

  /**
   * Getter for environmentCrn.
   * The environment for the cluster to create.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The environment for the cluster to create.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for useOverlayNetwork.
   * Using an overlay network will save IP addresses in the VPC by using a private IP address range for Pods in the cluster.
   **/
  @JsonProperty("useOverlayNetwork")
  public Boolean getUseOverlayNetwork() {
    return useOverlayNetwork;
  }

  /**
   * Setter for useOverlayNetwork.
   * Using an overlay network will save IP addresses in the VPC by using a private IP address range for Pods in the cluster.
   **/
  public void setUseOverlayNetwork(Boolean useOverlayNetwork) {
    this.useOverlayNetwork = useOverlayNetwork;
  }

  /**
   * Getter for usePrivateLoadBalancer.
   * Set up load balancer in private subnets -- make sure there is connectivity between your VPN and the VPC of CDW environment.
   **/
  @JsonProperty("usePrivateLoadBalancer")
  public Boolean getUsePrivateLoadBalancer() {
    return usePrivateLoadBalancer;
  }

  /**
   * Setter for usePrivateLoadBalancer.
   * Set up load balancer in private subnets -- make sure there is connectivity between your VPN and the VPC of CDW environment.
   **/
  public void setUsePrivateLoadBalancer(Boolean usePrivateLoadBalancer) {
    this.usePrivateLoadBalancer = usePrivateLoadBalancer;
  }

  /**
   * Getter for awsOptions.
   * Options for activating an AWS environment.
   **/
  @JsonProperty("awsOptions")
  public AwsActivationOptions getAwsOptions() {
    return awsOptions;
  }

  /**
   * Setter for awsOptions.
   * Options for activating an AWS environment.
   **/
  public void setAwsOptions(AwsActivationOptions awsOptions) {
    this.awsOptions = awsOptions;
  }

  /**
   * Getter for azureOptions.
   * Options for activating an Azure environment.
   **/
  @JsonProperty("azureOptions")
  public AzureActivationOptions getAzureOptions() {
    return azureOptions;
  }

  /**
   * Setter for azureOptions.
   * Options for activating an Azure environment.
   **/
  public void setAzureOptions(AzureActivationOptions azureOptions) {
    this.azureOptions = azureOptions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateClusterRequest createClusterRequest = (CreateClusterRequest) o;
    if (!Objects.equals(this.environmentCrn, createClusterRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.useOverlayNetwork, createClusterRequest.useOverlayNetwork)) {
      return false;
    }
    if (!Objects.equals(this.usePrivateLoadBalancer, createClusterRequest.usePrivateLoadBalancer)) {
      return false;
    }
    if (!Objects.equals(this.awsOptions, createClusterRequest.awsOptions)) {
      return false;
    }
    if (!Objects.equals(this.azureOptions, createClusterRequest.azureOptions)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, useOverlayNetwork, usePrivateLoadBalancer, awsOptions, azureOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateClusterRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    useOverlayNetwork: ").append(toIndentedString(useOverlayNetwork)).append("\n");
    sb.append("    usePrivateLoadBalancer: ").append(toIndentedString(usePrivateLoadBalancer)).append("\n");
    sb.append("    awsOptions: ").append(toIndentedString(awsOptions)).append("\n");
    sb.append("    azureOptions: ").append(toIndentedString(azureOptions)).append("\n");
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

