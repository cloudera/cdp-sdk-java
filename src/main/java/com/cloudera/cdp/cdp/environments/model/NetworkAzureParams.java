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

/**
 * Azure network parameters.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-09-20T12:01:40.521-07:00")
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
   * The ID of an existing private DNS zone used for the database.
   **/
  private String databasePrivateDnsZoneId = null;

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
   * The ID of an existing private DNS zone used for the database.
   **/
  @JsonProperty("databasePrivateDnsZoneId")
  public String getDatabasePrivateDnsZoneId() {
    return databasePrivateDnsZoneId;
  }

  /**
   * Setter for databasePrivateDnsZoneId.
   * The ID of an existing private DNS zone used for the database.
   **/
  public void setDatabasePrivateDnsZoneId(String databasePrivateDnsZoneId) {
    this.databasePrivateDnsZoneId = databasePrivateDnsZoneId;
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
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkId, resourceGroupName, usePublicIp, databasePrivateDnsZoneId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkAzureParams {\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    resourceGroupName: ").append(toIndentedString(resourceGroupName)).append("\n");
    sb.append("    usePublicIp: ").append(toIndentedString(usePublicIp)).append("\n");
    sb.append("    databasePrivateDnsZoneId: ").append(toIndentedString(databasePrivateDnsZoneId)).append("\n");
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

