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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.ml.model.OverlayNetwork;

/**
 * AzureUpgradeOptions upgrade options for model registry. This message contains configuration options specific to Azure deployments when using User Defined Routing (UDR).
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-14T06:50:05.724-08:00")
public class AzureUpgradeOptions  {

  /**
   * OverlayNetwork configuration for UDR-based deployments. This defines the network settings required for Azure environments that use custom routing tables.
   **/
  private OverlayNetwork udrNetwork = null;

  /**
   * Getter for udrNetwork.
   * OverlayNetwork configuration for UDR-based deployments. This defines the network settings required for Azure environments that use custom routing tables.
   **/
  @JsonProperty("udrNetwork")
  public OverlayNetwork getUdrNetwork() {
    return udrNetwork;
  }

  /**
   * Setter for udrNetwork.
   * OverlayNetwork configuration for UDR-based deployments. This defines the network settings required for Azure environments that use custom routing tables.
   **/
  public void setUdrNetwork(OverlayNetwork udrNetwork) {
    this.udrNetwork = udrNetwork;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureUpgradeOptions azureUpgradeOptions = (AzureUpgradeOptions) o;
    if (!Objects.equals(this.udrNetwork, azureUpgradeOptions.udrNetwork)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(udrNetwork);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureUpgradeOptions {\n");
    sb.append("    udrNetwork: ").append(toIndentedString(udrNetwork)).append("\n");
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

