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
 * Details of a FreeIPA load balancer.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:42.850-07:00")
public class FreeIpaLoadBalancer  {

  /**
   * The cloud resource ID of the provisioned load balancer.
   **/
  private String resourceId = null;

  /**
   * The fully qualified domain name of the load balancer.
   **/
  private String fqdn = null;

  /**
   * The private IP addresses of the load balancer.
   **/
  private List<String> privateIps = new ArrayList<String>();

  /**
   * Getter for resourceId.
   * The cloud resource ID of the provisioned load balancer.
   **/
  @JsonProperty("resourceId")
  public String getResourceId() {
    return resourceId;
  }

  /**
   * Setter for resourceId.
   * The cloud resource ID of the provisioned load balancer.
   **/
  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  /**
   * Getter for fqdn.
   * The fully qualified domain name of the load balancer.
   **/
  @JsonProperty("fqdn")
  public String getFqdn() {
    return fqdn;
  }

  /**
   * Setter for fqdn.
   * The fully qualified domain name of the load balancer.
   **/
  public void setFqdn(String fqdn) {
    this.fqdn = fqdn;
  }

  /**
   * Getter for privateIps.
   * The private IP addresses of the load balancer.
   **/
  @JsonProperty("privateIps")
  public List<String> getPrivateIps() {
    return privateIps;
  }

  /**
   * Setter for privateIps.
   * The private IP addresses of the load balancer.
   **/
  public void setPrivateIps(List<String> privateIps) {
    this.privateIps = privateIps;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeIpaLoadBalancer freeIpaLoadBalancer = (FreeIpaLoadBalancer) o;
    if (!Objects.equals(this.resourceId, freeIpaLoadBalancer.resourceId)) {
      return false;
    }
    if (!Objects.equals(this.fqdn, freeIpaLoadBalancer.fqdn)) {
      return false;
    }
    if (!Objects.equals(this.privateIps, freeIpaLoadBalancer.privateIps)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, fqdn, privateIps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeIpaLoadBalancer {\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
    sb.append("    privateIps: ").append(toIndentedString(privateIps)).append("\n");
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

