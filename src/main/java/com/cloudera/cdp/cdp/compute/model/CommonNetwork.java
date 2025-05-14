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

package com.cloudera.cdp.compute.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Network structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-05-14T11:34:38.707-07:00")
public class CommonNetwork  {

  /**
   * Subnets.
   **/
  private List<String> subnets = new ArrayList<String>();

  /**
   * The pod CIDR to use if the backend provider supports setting this.
   **/
  private String podCidr = null;

  /**
   * The CIDR for services declared inside of Kubernetes if the backend provider supports setting this.
   **/
  private String serviceCidr = null;

  /**
   * Cluster outbound type. Currently supported is udr.
   **/
  private String outboundType = null;

  /**
   * Getter for subnets.
   * Subnets.
   **/
  @JsonProperty("subnets")
  public List<String> getSubnets() {
    return subnets;
  }

  /**
   * Setter for subnets.
   * Subnets.
   **/
  public void setSubnets(List<String> subnets) {
    this.subnets = subnets;
  }

  /**
   * Getter for podCidr.
   * The pod CIDR to use if the backend provider supports setting this.
   **/
  @JsonProperty("podCidr")
  public String getPodCidr() {
    return podCidr;
  }

  /**
   * Setter for podCidr.
   * The pod CIDR to use if the backend provider supports setting this.
   **/
  public void setPodCidr(String podCidr) {
    this.podCidr = podCidr;
  }

  /**
   * Getter for serviceCidr.
   * The CIDR for services declared inside of Kubernetes if the backend provider supports setting this.
   **/
  @JsonProperty("serviceCidr")
  public String getServiceCidr() {
    return serviceCidr;
  }

  /**
   * Setter for serviceCidr.
   * The CIDR for services declared inside of Kubernetes if the backend provider supports setting this.
   **/
  public void setServiceCidr(String serviceCidr) {
    this.serviceCidr = serviceCidr;
  }

  /**
   * Getter for outboundType.
   * Cluster outbound type. Currently supported is udr.
   **/
  @JsonProperty("outboundType")
  public String getOutboundType() {
    return outboundType;
  }

  /**
   * Setter for outboundType.
   * Cluster outbound type. Currently supported is udr.
   **/
  public void setOutboundType(String outboundType) {
    this.outboundType = outboundType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonNetwork commonNetwork = (CommonNetwork) o;
    if (!Objects.equals(this.subnets, commonNetwork.subnets)) {
      return false;
    }
    if (!Objects.equals(this.podCidr, commonNetwork.podCidr)) {
      return false;
    }
    if (!Objects.equals(this.serviceCidr, commonNetwork.serviceCidr)) {
      return false;
    }
    if (!Objects.equals(this.outboundType, commonNetwork.outboundType)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnets, podCidr, serviceCidr, outboundType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonNetwork {\n");
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
    sb.append("    podCidr: ").append(toIndentedString(podCidr)).append("\n");
    sb.append("    serviceCidr: ").append(toIndentedString(serviceCidr)).append("\n");
    sb.append("    outboundType: ").append(toIndentedString(outboundType)).append("\n");
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

