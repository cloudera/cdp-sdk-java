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
 * Azure-specific Data Service parameters request.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-14T20:25:45.730-07:00")
public class AzureDataServicesParametersRequest  {

  /**
   * User-assigned managed identity used by the AKS control plane.
   **/
  private String sharedManagedIdentity = null;

  /**
   * The full Azure resource ID of an existing Private DNS zone used for the AKS.
   **/
  private String aksPrivateDnsZoneId = null;

  /**
   * Getter for sharedManagedIdentity.
   * User-assigned managed identity used by the AKS control plane.
   **/
  @JsonProperty("sharedManagedIdentity")
  public String getSharedManagedIdentity() {
    return sharedManagedIdentity;
  }

  /**
   * Setter for sharedManagedIdentity.
   * User-assigned managed identity used by the AKS control plane.
   **/
  public void setSharedManagedIdentity(String sharedManagedIdentity) {
    this.sharedManagedIdentity = sharedManagedIdentity;
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureDataServicesParametersRequest azureDataServicesParametersRequest = (AzureDataServicesParametersRequest) o;
    if (!Objects.equals(this.sharedManagedIdentity, azureDataServicesParametersRequest.sharedManagedIdentity)) {
      return false;
    }
    if (!Objects.equals(this.aksPrivateDnsZoneId, azureDataServicesParametersRequest.aksPrivateDnsZoneId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharedManagedIdentity, aksPrivateDnsZoneId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureDataServicesParametersRequest {\n");
    sb.append("    sharedManagedIdentity: ").append(toIndentedString(sharedManagedIdentity)).append("\n");
    sb.append("    aksPrivateDnsZoneId: ").append(toIndentedString(aksPrivateDnsZoneId)).append("\n");
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

