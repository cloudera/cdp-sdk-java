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
 * GCP network parameters.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-29T08:54:20.540-07:00")
public class NetworkGcpParams  {

  /**
   * The name of the GCP VPC.
   **/
  private String networkName = null;

  /**
   * Whether to associate public ip's to the resources within the network.
   **/
  private Boolean usePublicIp = null;

  /**
   * The ID of the Google project associated with the VPC.
   **/
  private String sharedProjectId = null;

  /**
   * Getter for networkName.
   * The name of the GCP VPC.
   **/
  @JsonProperty("networkName")
  public String getNetworkName() {
    return networkName;
  }

  /**
   * Setter for networkName.
   * The name of the GCP VPC.
   **/
  public void setNetworkName(String networkName) {
    this.networkName = networkName;
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
   * Getter for sharedProjectId.
   * The ID of the Google project associated with the VPC.
   **/
  @JsonProperty("sharedProjectId")
  public String getSharedProjectId() {
    return sharedProjectId;
  }

  /**
   * Setter for sharedProjectId.
   * The ID of the Google project associated with the VPC.
   **/
  public void setSharedProjectId(String sharedProjectId) {
    this.sharedProjectId = sharedProjectId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkGcpParams networkGcpParams = (NetworkGcpParams) o;
    if (!Objects.equals(this.networkName, networkGcpParams.networkName)) {
      return false;
    }
    if (!Objects.equals(this.usePublicIp, networkGcpParams.usePublicIp)) {
      return false;
    }
    if (!Objects.equals(this.sharedProjectId, networkGcpParams.sharedProjectId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkName, usePublicIp, sharedProjectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkGcpParams {\n");
    sb.append("    networkName: ").append(toIndentedString(networkName)).append("\n");
    sb.append("    usePublicIp: ").append(toIndentedString(usePublicIp)).append("\n");
    sb.append("    sharedProjectId: ").append(toIndentedString(sharedProjectId)).append("\n");
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

