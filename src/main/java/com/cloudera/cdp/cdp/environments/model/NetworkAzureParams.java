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
 * Azure network parameters.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:42.850-07:00")
public class NetworkAzureParams  {

  /**
   * The id of the Azure VNet.
   **/
  private String networkId = null;

  /**
   * The name of the resource group associated with the VNet.
   **/
  private String resourceGroupName = null;

  /**
   * Whether to associate public ip's to the resources within the network.
   **/
  private Boolean usePublicIp = null;

  /**
   * The full Azure resource ID of the existing Private DNS Zone used for Flexible Server and Single Server Databases.
   **/
  private String databasePrivateDnsZoneId = null;

  /**
   * The full Azure resource ID of an existing Private DNS zone used for the AKS.
   **/
  private String aksPrivateDnsZoneId = null;

  /**
   * Whether the outbound load balancer was created for this environment.
   **/
  private Boolean enableOutboundLoadBalancer = null;

  /**
   * The subnets delegated for Flexible Server database. Accepts either the name or the full resource id.
   **/
  private List<String> flexibleServerSubnetIds = new ArrayList<String>();

  /**
   * Getter for networkId.
   * The id of the Azure VNet.
   **/
  @JsonProperty("networkId")
  public String getNetworkId() {
    return networkId;
  }

  /**
   * Setter for networkId.
   * The id of the Azure VNet.
   **/
  public void setNetworkId(String networkId) {
    this.networkId = networkId;
  }

  /**
   * Getter for resourceGroupName.
   * The name of the resource group associated with the VNet.
   **/
  @JsonProperty("resourceGroupName")
  public String getResourceGroupName() {
    return resourceGroupName;
  }

  /**
   * Setter for resourceGroupName.
   * The name of the resource group associated with the VNet.
   **/
  public void setResourceGroupName(String resourceGroupName) {
    this.resourceGroupName = resourceGroupName;
  }

  /**
   * Getter for usePublicIp.
   * Whether to associate public ip&#39;s to the resources within the network.
   **/
  @JsonProperty("usePublicIp")
  public Boolean getUsePublicIp() {
    return usePublicIp;
  }

  /**
   * Setter for usePublicIp.
   * Whether to associate public ip&#39;s to the resources within the network.
   **/
  public void setUsePublicIp(Boolean usePublicIp) {
    this.usePublicIp = usePublicIp;
  }

  /**
   * Getter for databasePrivateDnsZoneId.
   * The full Azure resource ID of the existing Private DNS Zone used for Flexible Server and Single Server Databases.
   **/
  @JsonProperty("databasePrivateDnsZoneId")
  public String getDatabasePrivateDnsZoneId() {
    return databasePrivateDnsZoneId;
  }

  /**
   * Setter for databasePrivateDnsZoneId.
   * The full Azure resource ID of the existing Private DNS Zone used for Flexible Server and Single Server Databases.
   **/
  public void setDatabasePrivateDnsZoneId(String databasePrivateDnsZoneId) {
    this.databasePrivateDnsZoneId = databasePrivateDnsZoneId;
  }

  /**
   * Getter for aksPrivateDnsZoneId.
   * The full Azure resource ID of an existing Private DNS zone used for the AKS.
   **/
  @JsonProperty("aksPrivateDnsZoneId")
  public String getAksPrivateDnsZoneId() {
    return aksPrivateDnsZoneId;
  }

  /**
   * Setter for aksPrivateDnsZoneId.
   * The full Azure resource ID of an existing Private DNS zone used for the AKS.
   **/
  public void setAksPrivateDnsZoneId(String aksPrivateDnsZoneId) {
    this.aksPrivateDnsZoneId = aksPrivateDnsZoneId;
  }

  /**
   * Getter for enableOutboundLoadBalancer.
   * Whether the outbound load balancer was created for this environment.
   **/
  @JsonProperty("enableOutboundLoadBalancer")
  public Boolean getEnableOutboundLoadBalancer() {
    return enableOutboundLoadBalancer;
  }

  /**
   * Setter for enableOutboundLoadBalancer.
   * Whether the outbound load balancer was created for this environment.
   **/
  public void setEnableOutboundLoadBalancer(Boolean enableOutboundLoadBalancer) {
    this.enableOutboundLoadBalancer = enableOutboundLoadBalancer;
  }

  /**
   * Getter for flexibleServerSubnetIds.
   * The subnets delegated for Flexible Server database. Accepts either the name or the full resource id.
   **/
  @JsonProperty("flexibleServerSubnetIds")
  public List<String> getFlexibleServerSubnetIds() {
    return flexibleServerSubnetIds;
  }

  /**
   * Setter for flexibleServerSubnetIds.
   * The subnets delegated for Flexible Server database. Accepts either the name or the full resource id.
   **/
  public void setFlexibleServerSubnetIds(List<String> flexibleServerSubnetIds) {
    this.flexibleServerSubnetIds = flexibleServerSubnetIds;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkAzureParams networkAzureParams = (NetworkAzureParams) o;
    if (!Objects.equals(this.networkId, networkAzureParams.networkId)) {
      return false;
    }
    if (!Objects.equals(this.resourceGroupName, networkAzureParams.resourceGroupName)) {
      return false;
    }
    if (!Objects.equals(this.usePublicIp, networkAzureParams.usePublicIp)) {
      return false;
    }
    if (!Objects.equals(this.databasePrivateDnsZoneId, networkAzureParams.databasePrivateDnsZoneId)) {
      return false;
    }
    if (!Objects.equals(this.aksPrivateDnsZoneId, networkAzureParams.aksPrivateDnsZoneId)) {
      return false;
    }
    if (!Objects.equals(this.enableOutboundLoadBalancer, networkAzureParams.enableOutboundLoadBalancer)) {
      return false;
    }
    if (!Objects.equals(this.flexibleServerSubnetIds, networkAzureParams.flexibleServerSubnetIds)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkId, resourceGroupName, usePublicIp, databasePrivateDnsZoneId, aksPrivateDnsZoneId, enableOutboundLoadBalancer, flexibleServerSubnetIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkAzureParams {\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    resourceGroupName: ").append(toIndentedString(resourceGroupName)).append("\n");
    sb.append("    usePublicIp: ").append(toIndentedString(usePublicIp)).append("\n");
    sb.append("    databasePrivateDnsZoneId: ").append(toIndentedString(databasePrivateDnsZoneId)).append("\n");
    sb.append("    aksPrivateDnsZoneId: ").append(toIndentedString(aksPrivateDnsZoneId)).append("\n");
    sb.append("    enableOutboundLoadBalancer: ").append(toIndentedString(enableOutboundLoadBalancer)).append("\n");
    sb.append("    flexibleServerSubnetIds: ").append(toIndentedString(flexibleServerSubnetIds)).append("\n");
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

