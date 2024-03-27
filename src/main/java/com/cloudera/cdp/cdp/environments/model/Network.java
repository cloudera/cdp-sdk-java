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
import com.cloudera.cdp.environments.model.CloudSubnet;
import com.cloudera.cdp.environments.model.NetworkAwsParams;
import com.cloudera.cdp.environments.model.NetworkAzureParams;
import com.cloudera.cdp.environments.model.NetworkGcpParams;
import java.util.*;
import java.util.Map;

/**
 * The network.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-03-27T12:18:19.900-07:00")
public class Network  {

  /**
   * Name or id of the network
   **/
  private String networkName = null;

  /**
   * Subnet names or ids of the network.
   **/
  private List<String> subnetIds = new ArrayList<String>();

  /**
   * The scheme for the endpoint gateway. PUBLIC indicates an external endpoint that can be accessed over the Internet.
   **/
  private String endpointAccessGatewayScheme = null;

  /**
   * The subnets to use for endpoint access gateway.
   **/
  private List<String> endpointAccessGatewaySubnetIds = new ArrayList<String>();

  /**
   * AWS network parameters.
   **/
  private NetworkAwsParams aws = null;

  /**
   * Azure network parameters.
   **/
  private NetworkAzureParams azure = null;

  /**
   * GCP network parameters.
   **/
  private NetworkGcpParams gcp = null;

  /**
   * The range of private IPv4 addresses that resources will use under this network.
   **/
  private String networkCidr = null;

  /**
   * Additional subnet metadata of the network.
   **/
  private Map<String, CloudSubnet> subnetMetadata = new HashMap<String, CloudSubnet>();

  /**
   * Getter for networkName.
   * Name or id of the network
   **/
  @JsonProperty("networkName")
  public String getNetworkName() {
    return networkName;
  }

  /**
   * Setter for networkName.
   * Name or id of the network
   **/
  public void setNetworkName(String networkName) {
    this.networkName = networkName;
  }

  /**
   * Getter for subnetIds.
   * Subnet names or ids of the network.
   **/
  @JsonProperty("subnetIds")
  public List<String> getSubnetIds() {
    return subnetIds;
  }

  /**
   * Setter for subnetIds.
   * Subnet names or ids of the network.
   **/
  public void setSubnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
  }

  /**
   * Getter for endpointAccessGatewayScheme.
   * The scheme for the endpoint gateway. PUBLIC indicates an external endpoint that can be accessed over the Internet.
   **/
  @JsonProperty("endpointAccessGatewayScheme")
  public String getEndpointAccessGatewayScheme() {
    return endpointAccessGatewayScheme;
  }

  /**
   * Setter for endpointAccessGatewayScheme.
   * The scheme for the endpoint gateway. PUBLIC indicates an external endpoint that can be accessed over the Internet.
   **/
  public void setEndpointAccessGatewayScheme(String endpointAccessGatewayScheme) {
    this.endpointAccessGatewayScheme = endpointAccessGatewayScheme;
  }

  /**
   * Getter for endpointAccessGatewaySubnetIds.
   * The subnets to use for endpoint access gateway.
   **/
  @JsonProperty("endpointAccessGatewaySubnetIds")
  public List<String> getEndpointAccessGatewaySubnetIds() {
    return endpointAccessGatewaySubnetIds;
  }

  /**
   * Setter for endpointAccessGatewaySubnetIds.
   * The subnets to use for endpoint access gateway.
   **/
  public void setEndpointAccessGatewaySubnetIds(List<String> endpointAccessGatewaySubnetIds) {
    this.endpointAccessGatewaySubnetIds = endpointAccessGatewaySubnetIds;
  }

  /**
   * Getter for aws.
   * AWS network parameters.
   **/
  @JsonProperty("aws")
  public NetworkAwsParams getAws() {
    return aws;
  }

  /**
   * Setter for aws.
   * AWS network parameters.
   **/
  public void setAws(NetworkAwsParams aws) {
    this.aws = aws;
  }

  /**
   * Getter for azure.
   * Azure network parameters.
   **/
  @JsonProperty("azure")
  public NetworkAzureParams getAzure() {
    return azure;
  }

  /**
   * Setter for azure.
   * Azure network parameters.
   **/
  public void setAzure(NetworkAzureParams azure) {
    this.azure = azure;
  }

  /**
   * Getter for gcp.
   * GCP network parameters.
   **/
  @JsonProperty("gcp")
  public NetworkGcpParams getGcp() {
    return gcp;
  }

  /**
   * Setter for gcp.
   * GCP network parameters.
   **/
  public void setGcp(NetworkGcpParams gcp) {
    this.gcp = gcp;
  }

  /**
   * Getter for networkCidr.
   * The range of private IPv4 addresses that resources will use under this network.
   **/
  @JsonProperty("networkCidr")
  public String getNetworkCidr() {
    return networkCidr;
  }

  /**
   * Setter for networkCidr.
   * The range of private IPv4 addresses that resources will use under this network.
   **/
  public void setNetworkCidr(String networkCidr) {
    this.networkCidr = networkCidr;
  }

  /**
   * Getter for subnetMetadata.
   * Additional subnet metadata of the network.
   **/
  @JsonProperty("subnetMetadata")
  public Map<String, CloudSubnet> getSubnetMetadata() {
    return subnetMetadata;
  }

  /**
   * Setter for subnetMetadata.
   * Additional subnet metadata of the network.
   **/
  public void setSubnetMetadata(Map<String, CloudSubnet> subnetMetadata) {
    this.subnetMetadata = subnetMetadata;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Network network = (Network) o;
    if (!Objects.equals(this.networkName, network.networkName)) {
      return false;
    }
    if (!Objects.equals(this.subnetIds, network.subnetIds)) {
      return false;
    }
    if (!Objects.equals(this.endpointAccessGatewayScheme, network.endpointAccessGatewayScheme)) {
      return false;
    }
    if (!Objects.equals(this.endpointAccessGatewaySubnetIds, network.endpointAccessGatewaySubnetIds)) {
      return false;
    }
    if (!Objects.equals(this.aws, network.aws)) {
      return false;
    }
    if (!Objects.equals(this.azure, network.azure)) {
      return false;
    }
    if (!Objects.equals(this.gcp, network.gcp)) {
      return false;
    }
    if (!Objects.equals(this.networkCidr, network.networkCidr)) {
      return false;
    }
    if (!Objects.equals(this.subnetMetadata, network.subnetMetadata)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkName, subnetIds, endpointAccessGatewayScheme, endpointAccessGatewaySubnetIds, aws, azure, gcp, networkCidr, subnetMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Network {\n");
    sb.append("    networkName: ").append(toIndentedString(networkName)).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
    sb.append("    endpointAccessGatewayScheme: ").append(toIndentedString(endpointAccessGatewayScheme)).append("\n");
    sb.append("    endpointAccessGatewaySubnetIds: ").append(toIndentedString(endpointAccessGatewaySubnetIds)).append("\n");
    sb.append("    aws: ").append(toIndentedString(aws)).append("\n");
    sb.append("    azure: ").append(toIndentedString(azure)).append("\n");
    sb.append("    gcp: ").append(toIndentedString(gcp)).append("\n");
    sb.append("    networkCidr: ").append(toIndentedString(networkCidr)).append("\n");
    sb.append("    subnetMetadata: ").append(toIndentedString(subnetMetadata)).append("\n");
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

