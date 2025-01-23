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

package com.cloudera.cdp.df.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;

/**
 * Request object for UpdateService
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-01-23T07:12:42.200-08:00")
public class UpdateServiceRequest  {

  /**
   * The service CRN.
   **/
  private String serviceCrn = null;

  /**
   * The minimum number of kubernetes nodes needed for the service.
   **/
  private Integer minK8sNodeCount = null;

  /**
   * The maximum number of kubernetes nodes that service may scale up under high-demand situations.
   **/
  private Integer maxK8sNodeCount = null;

  /**
   * The IP Ranges authorized to connect to the Kubernetes API Server.
   **/
  private List<String> kubeApiAuthorizedIpRanges = new ArrayList<String>();

  /**
   * IP Ranges that are authorized to access CDF local endpoints.
   **/
  private List<String> loadBalancerAuthorizedIpRanges = new ArrayList<String>();

  /**
   * Indicates whether to skip Liftie's pre-flight checks.
   **/
  private Boolean skipPreflightChecks = null;

  /**
   * Getter for serviceCrn.
   * The service CRN.
   **/
  @JsonProperty("serviceCrn")
  public String getServiceCrn() {
    return serviceCrn;
  }

  /**
   * Setter for serviceCrn.
   * The service CRN.
   **/
  public void setServiceCrn(String serviceCrn) {
    this.serviceCrn = serviceCrn;
  }

  /**
   * Getter for minK8sNodeCount.
   * The minimum number of kubernetes nodes needed for the service.
   **/
  @JsonProperty("minK8sNodeCount")
  public Integer getMinK8sNodeCount() {
    return minK8sNodeCount;
  }

  /**
   * Setter for minK8sNodeCount.
   * The minimum number of kubernetes nodes needed for the service.
   **/
  public void setMinK8sNodeCount(Integer minK8sNodeCount) {
    this.minK8sNodeCount = minK8sNodeCount;
  }

  /**
   * Getter for maxK8sNodeCount.
   * The maximum number of kubernetes nodes that service may scale up under high-demand situations.
   **/
  @JsonProperty("maxK8sNodeCount")
  public Integer getMaxK8sNodeCount() {
    return maxK8sNodeCount;
  }

  /**
   * Setter for maxK8sNodeCount.
   * The maximum number of kubernetes nodes that service may scale up under high-demand situations.
   **/
  public void setMaxK8sNodeCount(Integer maxK8sNodeCount) {
    this.maxK8sNodeCount = maxK8sNodeCount;
  }

  /**
   * Getter for kubeApiAuthorizedIpRanges.
   * The IP Ranges authorized to connect to the Kubernetes API Server.
   **/
  @JsonProperty("kubeApiAuthorizedIpRanges")
  public List<String> getKubeApiAuthorizedIpRanges() {
    return kubeApiAuthorizedIpRanges;
  }

  /**
   * Setter for kubeApiAuthorizedIpRanges.
   * The IP Ranges authorized to connect to the Kubernetes API Server.
   **/
  public void setKubeApiAuthorizedIpRanges(List<String> kubeApiAuthorizedIpRanges) {
    this.kubeApiAuthorizedIpRanges = kubeApiAuthorizedIpRanges;
  }

  /**
   * Getter for loadBalancerAuthorizedIpRanges.
   * IP Ranges that are authorized to access CDF local endpoints.
   **/
  @JsonProperty("loadBalancerAuthorizedIpRanges")
  public List<String> getLoadBalancerAuthorizedIpRanges() {
    return loadBalancerAuthorizedIpRanges;
  }

  /**
   * Setter for loadBalancerAuthorizedIpRanges.
   * IP Ranges that are authorized to access CDF local endpoints.
   **/
  public void setLoadBalancerAuthorizedIpRanges(List<String> loadBalancerAuthorizedIpRanges) {
    this.loadBalancerAuthorizedIpRanges = loadBalancerAuthorizedIpRanges;
  }

  /**
   * Getter for skipPreflightChecks.
   * Indicates whether to skip Liftie&#39;s pre-flight checks.
   **/
  @JsonProperty("skipPreflightChecks")
  public Boolean getSkipPreflightChecks() {
    return skipPreflightChecks;
  }

  /**
   * Setter for skipPreflightChecks.
   * Indicates whether to skip Liftie&#39;s pre-flight checks.
   **/
  public void setSkipPreflightChecks(Boolean skipPreflightChecks) {
    this.skipPreflightChecks = skipPreflightChecks;
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
    if (!Objects.equals(this.serviceCrn, updateServiceRequest.serviceCrn)) {
      return false;
    }
    if (!Objects.equals(this.minK8sNodeCount, updateServiceRequest.minK8sNodeCount)) {
      return false;
    }
    if (!Objects.equals(this.maxK8sNodeCount, updateServiceRequest.maxK8sNodeCount)) {
      return false;
    }
    if (!Objects.equals(this.kubeApiAuthorizedIpRanges, updateServiceRequest.kubeApiAuthorizedIpRanges)) {
      return false;
    }
    if (!Objects.equals(this.loadBalancerAuthorizedIpRanges, updateServiceRequest.loadBalancerAuthorizedIpRanges)) {
      return false;
    }
    if (!Objects.equals(this.skipPreflightChecks, updateServiceRequest.skipPreflightChecks)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceCrn, minK8sNodeCount, maxK8sNodeCount, kubeApiAuthorizedIpRanges, loadBalancerAuthorizedIpRanges, skipPreflightChecks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateServiceRequest {\n");
    sb.append("    serviceCrn: ").append(toIndentedString(serviceCrn)).append("\n");
    sb.append("    minK8sNodeCount: ").append(toIndentedString(minK8sNodeCount)).append("\n");
    sb.append("    maxK8sNodeCount: ").append(toIndentedString(maxK8sNodeCount)).append("\n");
    sb.append("    kubeApiAuthorizedIpRanges: ").append(toIndentedString(kubeApiAuthorizedIpRanges)).append("\n");
    sb.append("    loadBalancerAuthorizedIpRanges: ").append(toIndentedString(loadBalancerAuthorizedIpRanges)).append("\n");
    sb.append("    skipPreflightChecks: ").append(toIndentedString(skipPreflightChecks)).append("\n");
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

