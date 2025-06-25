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
import java.util.Map;

/**
 * Request object for EnableService
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-06-24T14:06:24.523-07:00")
public class EnableServiceRequest  {

  /**
   * The CDP environment CRN
   **/
  private String environmentCrn = null;

  /**
   * The minimum number of kubernetes nodes needed for the service.
   **/
  private Integer minK8sNodeCount = null;

  /**
   * The maximum number of kubernetes nodes that service may scale up under high-demand situations.
   **/
  private Integer maxK8sNodeCount = null;

  /**
   * Indicates whether or not to use a public load balancer when deploying dependencies stack, such as Nginx Ingress Controller.
   **/
  private Boolean usePublicLoadBalancer = null;

  /**
   * The IP ranges authorized to connect to the Kubernetes API server.
   **/
  private List<String> kubeApiAuthorizedIpRanges = new ArrayList<String>();

  /**
   * The tags to apply to service-related resources created.
   **/
  private Map<String, String> tags = new HashMap<String, String>();

  /**
   * IP Ranges that are authorized to access DF local endpoints.
   **/
  private List<String> loadBalancerAuthorizedIpRanges = new ArrayList<String>();

  /**
   * Subnets to use for the Kubernetes cluster
   **/
  private List<String> clusterSubnets = new ArrayList<String>();

  /**
   * Subnets to use for the Load Balancer
   **/
  private List<String> loadBalancerSubnets = new ArrayList<String>();

  /**
   * Indicates whether to provision private k8s cluster.
   **/
  private Boolean privateCluster = null;

  /**
   * Indicates custom instance type to be used
   **/
  private String instanceType = null;

  /**
   * Indicates whether to skip Liftie's pre-flight checks.
   **/
  private Boolean skipPreflightChecks = null;

  /**
   * Indicates whether User Defined Routing (UDR) mode is enabled for AKS clusters.
   **/
  private Boolean userDefinedRouting = null;

  /**
   * CIDR range from which to assign IPs to pods in the kubernetes cluster.
   **/
  private String podCidr = null;

  /**
   * CIDR range from which to assign IPs to internal services in the kubernetes cluster.
   **/
  private String serviceCidr = null;

  /**
   * Getter for environmentCrn.
   * The CDP environment CRN
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CDP environment CRN
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
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
   * Getter for usePublicLoadBalancer.
   * Indicates whether or not to use a public load balancer when deploying dependencies stack, such as Nginx Ingress Controller.
   **/
  @JsonProperty("usePublicLoadBalancer")
  public Boolean getUsePublicLoadBalancer() {
    return usePublicLoadBalancer;
  }

  /**
   * Setter for usePublicLoadBalancer.
   * Indicates whether or not to use a public load balancer when deploying dependencies stack, such as Nginx Ingress Controller.
   **/
  public void setUsePublicLoadBalancer(Boolean usePublicLoadBalancer) {
    this.usePublicLoadBalancer = usePublicLoadBalancer;
  }

  /**
   * Getter for kubeApiAuthorizedIpRanges.
   * The IP ranges authorized to connect to the Kubernetes API server.
   **/
  @JsonProperty("kubeApiAuthorizedIpRanges")
  public List<String> getKubeApiAuthorizedIpRanges() {
    return kubeApiAuthorizedIpRanges;
  }

  /**
   * Setter for kubeApiAuthorizedIpRanges.
   * The IP ranges authorized to connect to the Kubernetes API server.
   **/
  public void setKubeApiAuthorizedIpRanges(List<String> kubeApiAuthorizedIpRanges) {
    this.kubeApiAuthorizedIpRanges = kubeApiAuthorizedIpRanges;
  }

  /**
   * Getter for tags.
   * The tags to apply to service-related resources created.
   **/
  @JsonProperty("tags")
  public Map<String, String> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * The tags to apply to service-related resources created.
   **/
  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  /**
   * Getter for loadBalancerAuthorizedIpRanges.
   * IP Ranges that are authorized to access DF local endpoints.
   **/
  @JsonProperty("loadBalancerAuthorizedIpRanges")
  public List<String> getLoadBalancerAuthorizedIpRanges() {
    return loadBalancerAuthorizedIpRanges;
  }

  /**
   * Setter for loadBalancerAuthorizedIpRanges.
   * IP Ranges that are authorized to access DF local endpoints.
   **/
  public void setLoadBalancerAuthorizedIpRanges(List<String> loadBalancerAuthorizedIpRanges) {
    this.loadBalancerAuthorizedIpRanges = loadBalancerAuthorizedIpRanges;
  }

  /**
   * Getter for clusterSubnets.
   * Subnets to use for the Kubernetes cluster
   **/
  @JsonProperty("clusterSubnets")
  public List<String> getClusterSubnets() {
    return clusterSubnets;
  }

  /**
   * Setter for clusterSubnets.
   * Subnets to use for the Kubernetes cluster
   **/
  public void setClusterSubnets(List<String> clusterSubnets) {
    this.clusterSubnets = clusterSubnets;
  }

  /**
   * Getter for loadBalancerSubnets.
   * Subnets to use for the Load Balancer
   **/
  @JsonProperty("loadBalancerSubnets")
  public List<String> getLoadBalancerSubnets() {
    return loadBalancerSubnets;
  }

  /**
   * Setter for loadBalancerSubnets.
   * Subnets to use for the Load Balancer
   **/
  public void setLoadBalancerSubnets(List<String> loadBalancerSubnets) {
    this.loadBalancerSubnets = loadBalancerSubnets;
  }

  /**
   * Getter for privateCluster.
   * Indicates whether to provision private k8s cluster.
   **/
  @JsonProperty("privateCluster")
  public Boolean getPrivateCluster() {
    return privateCluster;
  }

  /**
   * Setter for privateCluster.
   * Indicates whether to provision private k8s cluster.
   **/
  public void setPrivateCluster(Boolean privateCluster) {
    this.privateCluster = privateCluster;
  }

  /**
   * Getter for instanceType.
   * Indicates custom instance type to be used
   **/
  @JsonProperty("instanceType")
  public String getInstanceType() {
    return instanceType;
  }

  /**
   * Setter for instanceType.
   * Indicates custom instance type to be used
   **/
  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
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

  /**
   * Getter for userDefinedRouting.
   * Indicates whether User Defined Routing (UDR) mode is enabled for AKS clusters.
   **/
  @JsonProperty("userDefinedRouting")
  public Boolean getUserDefinedRouting() {
    return userDefinedRouting;
  }

  /**
   * Setter for userDefinedRouting.
   * Indicates whether User Defined Routing (UDR) mode is enabled for AKS clusters.
   **/
  public void setUserDefinedRouting(Boolean userDefinedRouting) {
    this.userDefinedRouting = userDefinedRouting;
  }

  /**
   * Getter for podCidr.
   * CIDR range from which to assign IPs to pods in the kubernetes cluster.
   **/
  @JsonProperty("podCidr")
  public String getPodCidr() {
    return podCidr;
  }

  /**
   * Setter for podCidr.
   * CIDR range from which to assign IPs to pods in the kubernetes cluster.
   **/
  public void setPodCidr(String podCidr) {
    this.podCidr = podCidr;
  }

  /**
   * Getter for serviceCidr.
   * CIDR range from which to assign IPs to internal services in the kubernetes cluster.
   **/
  @JsonProperty("serviceCidr")
  public String getServiceCidr() {
    return serviceCidr;
  }

  /**
   * Setter for serviceCidr.
   * CIDR range from which to assign IPs to internal services in the kubernetes cluster.
   **/
  public void setServiceCidr(String serviceCidr) {
    this.serviceCidr = serviceCidr;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnableServiceRequest enableServiceRequest = (EnableServiceRequest) o;
    if (!Objects.equals(this.environmentCrn, enableServiceRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.minK8sNodeCount, enableServiceRequest.minK8sNodeCount)) {
      return false;
    }
    if (!Objects.equals(this.maxK8sNodeCount, enableServiceRequest.maxK8sNodeCount)) {
      return false;
    }
    if (!Objects.equals(this.usePublicLoadBalancer, enableServiceRequest.usePublicLoadBalancer)) {
      return false;
    }
    if (!Objects.equals(this.kubeApiAuthorizedIpRanges, enableServiceRequest.kubeApiAuthorizedIpRanges)) {
      return false;
    }
    if (!Objects.equals(this.tags, enableServiceRequest.tags)) {
      return false;
    }
    if (!Objects.equals(this.loadBalancerAuthorizedIpRanges, enableServiceRequest.loadBalancerAuthorizedIpRanges)) {
      return false;
    }
    if (!Objects.equals(this.clusterSubnets, enableServiceRequest.clusterSubnets)) {
      return false;
    }
    if (!Objects.equals(this.loadBalancerSubnets, enableServiceRequest.loadBalancerSubnets)) {
      return false;
    }
    if (!Objects.equals(this.privateCluster, enableServiceRequest.privateCluster)) {
      return false;
    }
    if (!Objects.equals(this.instanceType, enableServiceRequest.instanceType)) {
      return false;
    }
    if (!Objects.equals(this.skipPreflightChecks, enableServiceRequest.skipPreflightChecks)) {
      return false;
    }
    if (!Objects.equals(this.userDefinedRouting, enableServiceRequest.userDefinedRouting)) {
      return false;
    }
    if (!Objects.equals(this.podCidr, enableServiceRequest.podCidr)) {
      return false;
    }
    if (!Objects.equals(this.serviceCidr, enableServiceRequest.serviceCidr)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, minK8sNodeCount, maxK8sNodeCount, usePublicLoadBalancer, kubeApiAuthorizedIpRanges, tags, loadBalancerAuthorizedIpRanges, clusterSubnets, loadBalancerSubnets, privateCluster, instanceType, skipPreflightChecks, userDefinedRouting, podCidr, serviceCidr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnableServiceRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    minK8sNodeCount: ").append(toIndentedString(minK8sNodeCount)).append("\n");
    sb.append("    maxK8sNodeCount: ").append(toIndentedString(maxK8sNodeCount)).append("\n");
    sb.append("    usePublicLoadBalancer: ").append(toIndentedString(usePublicLoadBalancer)).append("\n");
    sb.append("    kubeApiAuthorizedIpRanges: ").append(toIndentedString(kubeApiAuthorizedIpRanges)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    loadBalancerAuthorizedIpRanges: ").append(toIndentedString(loadBalancerAuthorizedIpRanges)).append("\n");
    sb.append("    clusterSubnets: ").append(toIndentedString(clusterSubnets)).append("\n");
    sb.append("    loadBalancerSubnets: ").append(toIndentedString(loadBalancerSubnets)).append("\n");
    sb.append("    privateCluster: ").append(toIndentedString(privateCluster)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    skipPreflightChecks: ").append(toIndentedString(skipPreflightChecks)).append("\n");
    sb.append("    userDefinedRouting: ").append(toIndentedString(userDefinedRouting)).append("\n");
    sb.append("    podCidr: ").append(toIndentedString(podCidr)).append("\n");
    sb.append("    serviceCidr: ").append(toIndentedString(serviceCidr)).append("\n");
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

