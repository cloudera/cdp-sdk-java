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
import java.util.*;
import java.util.Map;

/**
 * The network.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2019-09-19T14:17:02.694-07:00")
public class Network  {

  /**
   * Name of the network
   **/
  private String networkName = null;

  /**
   * Subnet ids of the network.
   **/
  private List<String> subnetIds = new ArrayList<String>();

  /**
   * AWS network parameters.
   **/
  private NetworkAwsParams aws = null;

  /**
   * Additional subnet metadata of the network.
   **/
  private Map<String, CloudSubnet> subnetMetadata = new HashMap<String, CloudSubnet>();

  /**
   * Getter for networkName.
   * Name of the network
   **/
  @JsonProperty("networkName")
  public String getNetworkName() {
    return networkName;
  }

  /**
   * Setter for networkName.
   * Name of the network
   **/
  public void setNetworkName(String networkName) {
    this.networkName = networkName;
  }

  /**
   * Getter for subnetIds.
   * Subnet ids of the network.
   **/
  @JsonProperty("subnetIds")
  public List<String> getSubnetIds() {
    return subnetIds;
  }

  /**
   * Setter for subnetIds.
   * Subnet ids of the network.
   **/
  public void setSubnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
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
    if (!Objects.equals(this.aws, network.aws)) {
      return false;
    }
    if (!Objects.equals(this.subnetMetadata, network.subnetMetadata)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkName, subnetIds, aws, subnetMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Network {\n");
    sb.append("    networkName: ").append(toIndentedString(networkName)).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
    sb.append("    aws: ").append(toIndentedString(aws)).append("\n");
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

