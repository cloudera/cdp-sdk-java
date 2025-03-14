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
import com.cloudera.cdp.ml.model.MlServingProvisionK8sRequest;
import java.util.*;

/**
 * Request object for the CreateMlServingApp method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-03-13T11:52:45.419-07:00")
public class CreateMlServingAppRequest  {

  /**
   * The name of the Cloudera AI Inference Service to be created.
   **/
  private String appName = null;

  /**
   * The environment CRN.
   **/
  private String environmentCrn = null;

  /**
   * The cluster CRN of an existing cluster where Cloudera AI Inference Service instance will be deployed.
   **/
  private String clusterCrn = null;

  /**
   * The request for Kubernetes cluster provisioning. Required in public cloud.
   **/
  private MlServingProvisionK8sRequest provisionK8sRequest = null;

  /**
   * The boolean flag to request a public load balancer. By default, a private load balancer is used.
   **/
  private Boolean usePublicLoadBalancer = null;

  /**
   * Skip pre-flight validations if requested.
   **/
  private Boolean skipValidation = null;

  /**
   * The whitelist of IPs for load balancer.
   **/
  private List<String> loadBalancerIPWhitelists = new ArrayList<String>();

  /**
   * The list of subnets to be used for the load balancer.
   **/
  private List<String> subnetsForLoadBalancers = new ArrayList<String>();

  /**
   * The static subdomain to be used for the Cloudera AI Inference Service instance.
   **/
  private String staticSubdomain = null;

  /**
   * Getter for appName.
   * The name of the Cloudera AI Inference Service to be created.
   **/
  @JsonProperty("appName")
  public String getAppName() {
    return appName;
  }

  /**
   * Setter for appName.
   * The name of the Cloudera AI Inference Service to be created.
   **/
  public void setAppName(String appName) {
    this.appName = appName;
  }

  /**
   * Getter for environmentCrn.
   * The environment CRN.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The environment CRN.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for clusterCrn.
   * The cluster CRN of an existing cluster where Cloudera AI Inference Service instance will be deployed.
   **/
  @JsonProperty("clusterCrn")
  public String getClusterCrn() {
    return clusterCrn;
  }

  /**
   * Setter for clusterCrn.
   * The cluster CRN of an existing cluster where Cloudera AI Inference Service instance will be deployed.
   **/
  public void setClusterCrn(String clusterCrn) {
    this.clusterCrn = clusterCrn;
  }

  /**
   * Getter for provisionK8sRequest.
   * The request for Kubernetes cluster provisioning. Required in public cloud.
   **/
  @JsonProperty("provisionK8sRequest")
  public MlServingProvisionK8sRequest getProvisionK8sRequest() {
    return provisionK8sRequest;
  }

  /**
   * Setter for provisionK8sRequest.
   * The request for Kubernetes cluster provisioning. Required in public cloud.
   **/
  public void setProvisionK8sRequest(MlServingProvisionK8sRequest provisionK8sRequest) {
    this.provisionK8sRequest = provisionK8sRequest;
  }

  /**
   * Getter for usePublicLoadBalancer.
   * The boolean flag to request a public load balancer. By default, a private load balancer is used.
   **/
  @JsonProperty("usePublicLoadBalancer")
  public Boolean getUsePublicLoadBalancer() {
    return usePublicLoadBalancer;
  }

  /**
   * Setter for usePublicLoadBalancer.
   * The boolean flag to request a public load balancer. By default, a private load balancer is used.
   **/
  public void setUsePublicLoadBalancer(Boolean usePublicLoadBalancer) {
    this.usePublicLoadBalancer = usePublicLoadBalancer;
  }

  /**
   * Getter for skipValidation.
   * Skip pre-flight validations if requested.
   **/
  @JsonProperty("skipValidation")
  public Boolean getSkipValidation() {
    return skipValidation;
  }

  /**
   * Setter for skipValidation.
   * Skip pre-flight validations if requested.
   **/
  public void setSkipValidation(Boolean skipValidation) {
    this.skipValidation = skipValidation;
  }

  /**
   * Getter for loadBalancerIPWhitelists.
   * The whitelist of IPs for load balancer.
   **/
  @JsonProperty("loadBalancerIPWhitelists")
  public List<String> getLoadBalancerIPWhitelists() {
    return loadBalancerIPWhitelists;
  }

  /**
   * Setter for loadBalancerIPWhitelists.
   * The whitelist of IPs for load balancer.
   **/
  public void setLoadBalancerIPWhitelists(List<String> loadBalancerIPWhitelists) {
    this.loadBalancerIPWhitelists = loadBalancerIPWhitelists;
  }

  /**
   * Getter for subnetsForLoadBalancers.
   * The list of subnets to be used for the load balancer.
   **/
  @JsonProperty("subnetsForLoadBalancers")
  public List<String> getSubnetsForLoadBalancers() {
    return subnetsForLoadBalancers;
  }

  /**
   * Setter for subnetsForLoadBalancers.
   * The list of subnets to be used for the load balancer.
   **/
  public void setSubnetsForLoadBalancers(List<String> subnetsForLoadBalancers) {
    this.subnetsForLoadBalancers = subnetsForLoadBalancers;
  }

  /**
   * Getter for staticSubdomain.
   * The static subdomain to be used for the Cloudera AI Inference Service instance.
   **/
  @JsonProperty("staticSubdomain")
  public String getStaticSubdomain() {
    return staticSubdomain;
  }

  /**
   * Setter for staticSubdomain.
   * The static subdomain to be used for the Cloudera AI Inference Service instance.
   **/
  public void setStaticSubdomain(String staticSubdomain) {
    this.staticSubdomain = staticSubdomain;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMlServingAppRequest createMlServingAppRequest = (CreateMlServingAppRequest) o;
    if (!Objects.equals(this.appName, createMlServingAppRequest.appName)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, createMlServingAppRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.clusterCrn, createMlServingAppRequest.clusterCrn)) {
      return false;
    }
    if (!Objects.equals(this.provisionK8sRequest, createMlServingAppRequest.provisionK8sRequest)) {
      return false;
    }
    if (!Objects.equals(this.usePublicLoadBalancer, createMlServingAppRequest.usePublicLoadBalancer)) {
      return false;
    }
    if (!Objects.equals(this.skipValidation, createMlServingAppRequest.skipValidation)) {
      return false;
    }
    if (!Objects.equals(this.loadBalancerIPWhitelists, createMlServingAppRequest.loadBalancerIPWhitelists)) {
      return false;
    }
    if (!Objects.equals(this.subnetsForLoadBalancers, createMlServingAppRequest.subnetsForLoadBalancers)) {
      return false;
    }
    if (!Objects.equals(this.staticSubdomain, createMlServingAppRequest.staticSubdomain)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, environmentCrn, clusterCrn, provisionK8sRequest, usePublicLoadBalancer, skipValidation, loadBalancerIPWhitelists, subnetsForLoadBalancers, staticSubdomain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMlServingAppRequest {\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    clusterCrn: ").append(toIndentedString(clusterCrn)).append("\n");
    sb.append("    provisionK8sRequest: ").append(toIndentedString(provisionK8sRequest)).append("\n");
    sb.append("    usePublicLoadBalancer: ").append(toIndentedString(usePublicLoadBalancer)).append("\n");
    sb.append("    skipValidation: ").append(toIndentedString(skipValidation)).append("\n");
    sb.append("    loadBalancerIPWhitelists: ").append(toIndentedString(loadBalancerIPWhitelists)).append("\n");
    sb.append("    subnetsForLoadBalancers: ").append(toIndentedString(subnetsForLoadBalancers)).append("\n");
    sb.append("    staticSubdomain: ").append(toIndentedString(staticSubdomain)).append("\n");
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

