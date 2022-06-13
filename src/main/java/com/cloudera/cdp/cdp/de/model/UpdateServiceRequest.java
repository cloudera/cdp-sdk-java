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

package com.cloudera.cdp.de.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Request object for UpdateService method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-06-10T11:26:36.145-07:00")
public class UpdateServiceRequest  {

  /**
   * Cluster ID of the service to update.
   **/
  private String clusterId = null;

  /**
   * Minimum number of instances for the CDE service.
   **/
  private Integer minimumInstances = null;

  /**
   * Maximum number of instances for the CDE service.
   **/
  private Integer maximumInstances = null;

  /**
   * Minimum number of spot instances for the CDE service.
   **/
  private Integer minimumSpotInstances = null;

  /**
   * Maximum number of spot instances for the CDE service.
   **/
  private Integer maximumSpotInstances = null;

  /**
   * List of CIDRs that would be allowed to access kubernetes master API server.
   **/
  private List<String> whitelistIps = new ArrayList<String>();

  /**
   * List of CIDRs that would be allowed to access the load balancer.
   **/
  private List<String> loadbalancerAllowlist = new ArrayList<String>();

  /**
   * Getter for clusterId.
   * Cluster ID of the service to update.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * Cluster ID of the service to update.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for minimumInstances.
   * Minimum number of instances for the CDE service.
   **/
  @JsonProperty("minimumInstances")
  public Integer getMinimumInstances() {
    return minimumInstances;
  }

  /**
   * Setter for minimumInstances.
   * Minimum number of instances for the CDE service.
   **/
  public void setMinimumInstances(Integer minimumInstances) {
    this.minimumInstances = minimumInstances;
  }

  /**
   * Getter for maximumInstances.
   * Maximum number of instances for the CDE service.
   **/
  @JsonProperty("maximumInstances")
  public Integer getMaximumInstances() {
    return maximumInstances;
  }

  /**
   * Setter for maximumInstances.
   * Maximum number of instances for the CDE service.
   **/
  public void setMaximumInstances(Integer maximumInstances) {
    this.maximumInstances = maximumInstances;
  }

  /**
   * Getter for minimumSpotInstances.
   * Minimum number of spot instances for the CDE service.
   **/
  @JsonProperty("minimumSpotInstances")
  public Integer getMinimumSpotInstances() {
    return minimumSpotInstances;
  }

  /**
   * Setter for minimumSpotInstances.
   * Minimum number of spot instances for the CDE service.
   **/
  public void setMinimumSpotInstances(Integer minimumSpotInstances) {
    this.minimumSpotInstances = minimumSpotInstances;
  }

  /**
   * Getter for maximumSpotInstances.
   * Maximum number of spot instances for the CDE service.
   **/
  @JsonProperty("maximumSpotInstances")
  public Integer getMaximumSpotInstances() {
    return maximumSpotInstances;
  }

  /**
   * Setter for maximumSpotInstances.
   * Maximum number of spot instances for the CDE service.
   **/
  public void setMaximumSpotInstances(Integer maximumSpotInstances) {
    this.maximumSpotInstances = maximumSpotInstances;
  }

  /**
   * Getter for whitelistIps.
   * List of CIDRs that would be allowed to access kubernetes master API server.
   **/
  @JsonProperty("whitelistIps")
  public List<String> getWhitelistIps() {
    return whitelistIps;
  }

  /**
   * Setter for whitelistIps.
   * List of CIDRs that would be allowed to access kubernetes master API server.
   **/
  public void setWhitelistIps(List<String> whitelistIps) {
    this.whitelistIps = whitelistIps;
  }

  /**
   * Getter for loadbalancerAllowlist.
   * List of CIDRs that would be allowed to access the load balancer.
   **/
  @JsonProperty("loadbalancerAllowlist")
  public List<String> getLoadbalancerAllowlist() {
    return loadbalancerAllowlist;
  }

  /**
   * Setter for loadbalancerAllowlist.
   * List of CIDRs that would be allowed to access the load balancer.
   **/
  public void setLoadbalancerAllowlist(List<String> loadbalancerAllowlist) {
    this.loadbalancerAllowlist = loadbalancerAllowlist;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateServiceRequest updateServiceRequest = (UpdateServiceRequest) o;
    if (!Objects.equals(this.clusterId, updateServiceRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.minimumInstances, updateServiceRequest.minimumInstances)) {
      return false;
    }
    if (!Objects.equals(this.maximumInstances, updateServiceRequest.maximumInstances)) {
      return false;
    }
    if (!Objects.equals(this.minimumSpotInstances, updateServiceRequest.minimumSpotInstances)) {
      return false;
    }
    if (!Objects.equals(this.maximumSpotInstances, updateServiceRequest.maximumSpotInstances)) {
      return false;
    }
    if (!Objects.equals(this.whitelistIps, updateServiceRequest.whitelistIps)) {
      return false;
    }
    if (!Objects.equals(this.loadbalancerAllowlist, updateServiceRequest.loadbalancerAllowlist)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, minimumInstances, maximumInstances, minimumSpotInstances, maximumSpotInstances, whitelistIps, loadbalancerAllowlist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateServiceRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    minimumInstances: ").append(toIndentedString(minimumInstances)).append("\n");
    sb.append("    maximumInstances: ").append(toIndentedString(maximumInstances)).append("\n");
    sb.append("    minimumSpotInstances: ").append(toIndentedString(minimumSpotInstances)).append("\n");
    sb.append("    maximumSpotInstances: ").append(toIndentedString(maximumSpotInstances)).append("\n");
    sb.append("    whitelistIps: ").append(toIndentedString(whitelistIps)).append("\n");
    sb.append("    loadbalancerAllowlist: ").append(toIndentedString(loadbalancerAllowlist)).append("\n");
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

