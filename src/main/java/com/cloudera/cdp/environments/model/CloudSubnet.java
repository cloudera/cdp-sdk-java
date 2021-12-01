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
 * Information about a cloud provider subnet.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-12-01T15:55:32.870-08:00")
public class CloudSubnet  {

  /**
   * The id of the subnet.
   **/
  private String subnetId = null;

  /**
   * The name of the subnet.
   **/
  private String subnetName = null;

  /**
   * The availability zone of the subnet.
   **/
  private String availabilityZone = null;

  /**
   * The CIDR IP range of the subnet.
   **/
  private String cidr = null;

  /**
   * Getter for subnetId.
   * The id of the subnet.
   **/
  @JsonProperty("subnetId")
  public String getSubnetId() {
    return subnetId;
  }

  /**
   * Setter for subnetId.
   * The id of the subnet.
   **/
  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  /**
   * Getter for subnetName.
   * The name of the subnet.
   **/
  @JsonProperty("subnetName")
  public String getSubnetName() {
    return subnetName;
  }

  /**
   * Setter for subnetName.
   * The name of the subnet.
   **/
  public void setSubnetName(String subnetName) {
    this.subnetName = subnetName;
  }

  /**
   * Getter for availabilityZone.
   * The availability zone of the subnet.
   **/
  @JsonProperty("availabilityZone")
  public String getAvailabilityZone() {
    return availabilityZone;
  }

  /**
   * Setter for availabilityZone.
   * The availability zone of the subnet.
   **/
  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  /**
   * Getter for cidr.
   * The CIDR IP range of the subnet.
   **/
  @JsonProperty("cidr")
  public String getCidr() {
    return cidr;
  }

  /**
   * Setter for cidr.
   * The CIDR IP range of the subnet.
   **/
  public void setCidr(String cidr) {
    this.cidr = cidr;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudSubnet cloudSubnet = (CloudSubnet) o;
    if (!Objects.equals(this.subnetId, cloudSubnet.subnetId)) {
      return false;
    }
    if (!Objects.equals(this.subnetName, cloudSubnet.subnetName)) {
      return false;
    }
    if (!Objects.equals(this.availabilityZone, cloudSubnet.availabilityZone)) {
      return false;
    }
    if (!Objects.equals(this.cidr, cloudSubnet.cidr)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnetId, subnetName, availabilityZone, cidr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudSubnet {\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    subnetName: ").append(toIndentedString(subnetName)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
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

