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
import com.cloudera.cdp.ml.model.Network;

/**
 * The capacity reservation config for EKS
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-05-27T09:29:00.715-07:00")
public class AwsCrConfig  {

  /**
   * The capacity reservation Id
   **/
  private String capacityReservationId = null;

  /**
   * The network config having subnets for AZ
   **/
  private Network network = null;

  /**
   * Getter for capacityReservationId.
   * The capacity reservation Id
   **/
  @JsonProperty("capacityReservationId")
  public String getCapacityReservationId() {
    return capacityReservationId;
  }

  /**
   * Setter for capacityReservationId.
   * The capacity reservation Id
   **/
  public void setCapacityReservationId(String capacityReservationId) {
    this.capacityReservationId = capacityReservationId;
  }

  /**
   * Getter for network.
   * The network config having subnets for AZ
   **/
  @JsonProperty("network")
  public Network getNetwork() {
    return network;
  }

  /**
   * Setter for network.
   * The network config having subnets for AZ
   **/
  public void setNetwork(Network network) {
    this.network = network;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsCrConfig awsCrConfig = (AwsCrConfig) o;
    if (!Objects.equals(this.capacityReservationId, awsCrConfig.capacityReservationId)) {
      return false;
    }
    if (!Objects.equals(this.network, awsCrConfig.network)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacityReservationId, network);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsCrConfig {\n");
    sb.append("    capacityReservationId: ").append(toIndentedString(capacityReservationId)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
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

