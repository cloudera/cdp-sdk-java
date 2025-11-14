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
import com.cloudera.cdp.ml.model.KubernetesCluster;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * The Cloudera AI Inference Service instance.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-11-14T06:50:05.724-08:00")
public class MlServingApp  {

  /**
   * The cloud platform of the environment that was used to create this instance.
   **/
  private String cloudPlatform = null;

  /**
   * The name of the Cloudera AI Inference Service instance.
   **/
  private String appName = null;

  /**
   * The CRN of the Cloudera AI Inference Service instance.
   **/
  private String appCrn = null;

  /**
   * The CRN of the environment.
   **/
  private String environmentCrn = null;

  /**
   * The name of the environment.
   **/
  private String environmentName = null;

  /**
   * The namespace used for this service.
   **/
  private String namespace = null;

  /**
   * The email of the user who created this service.
   **/
  private String ownerEmail = null;

  /**
   * The Cloudera AI Inference Service version running on this instance.
   **/
  private String mlServingVersion = null;

  /**
   * Is this service installed on a private cluster.
   **/
  private Boolean isPrivateCluster = null;

  /**
   * Creation date of Cloudera AI Inference Service instance.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * The Kubernetes cluster information.
   **/
  private KubernetesCluster cluster = null;

  /**
   * The status of the Cloudera AI Inference Service instance.
   **/
  private String status = null;

  /**
   * Indicates if this Cloudera AI Inference Service instance uses a public load balancer.
   **/
  private Boolean usePublicLoadBalancer = null;

  /**
   * Indicates if HTTPs communication was enabled on this application when it was provisioned.
   **/
  private Boolean httpsEnabled = null;

  /**
   * The list of subnets used for the load balancer.
   **/
  private List<String> subnetsForLoadBalancers = new ArrayList<String>();

  /**
   * The allowed list of IPs for the load balancer.
   **/
  private String loadBalancerIPWhitelists = null;

  /**
   * Getter for cloudPlatform.
   * The cloud platform of the environment that was used to create this instance.
   **/
  @JsonProperty("cloudPlatform")
  public String getCloudPlatform() {
    return cloudPlatform;
  }

  /**
   * Setter for cloudPlatform.
   * The cloud platform of the environment that was used to create this instance.
   **/
  public void setCloudPlatform(String cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
  }

  /**
   * Getter for appName.
   * The name of the Cloudera AI Inference Service instance.
   **/
  @JsonProperty("appName")
  public String getAppName() {
    return appName;
  }

  /**
   * Setter for appName.
   * The name of the Cloudera AI Inference Service instance.
   **/
  public void setAppName(String appName) {
    this.appName = appName;
  }

  /**
   * Getter for appCrn.
   * The CRN of the Cloudera AI Inference Service instance.
   **/
  @JsonProperty("appCrn")
  public String getAppCrn() {
    return appCrn;
  }

  /**
   * Setter for appCrn.
   * The CRN of the Cloudera AI Inference Service instance.
   **/
  public void setAppCrn(String appCrn) {
    this.appCrn = appCrn;
  }

  /**
   * Getter for environmentCrn.
   * The CRN of the environment.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of the environment.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for environmentName.
   * The name of the environment.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The name of the environment.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for namespace.
   * The namespace used for this service.
   **/
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }

  /**
   * Setter for namespace.
   * The namespace used for this service.
   **/
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * Getter for ownerEmail.
   * The email of the user who created this service.
   **/
  @JsonProperty("ownerEmail")
  public String getOwnerEmail() {
    return ownerEmail;
  }

  /**
   * Setter for ownerEmail.
   * The email of the user who created this service.
   **/
  public void setOwnerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
  }

  /**
   * Getter for mlServingVersion.
   * The Cloudera AI Inference Service version running on this instance.
   **/
  @JsonProperty("mlServingVersion")
  public String getMlServingVersion() {
    return mlServingVersion;
  }

  /**
   * Setter for mlServingVersion.
   * The Cloudera AI Inference Service version running on this instance.
   **/
  public void setMlServingVersion(String mlServingVersion) {
    this.mlServingVersion = mlServingVersion;
  }

  /**
   * Getter for isPrivateCluster.
   * Is this service installed on a private cluster.
   **/
  @JsonProperty("isPrivateCluster")
  public Boolean getIsPrivateCluster() {
    return isPrivateCluster;
  }

  /**
   * Setter for isPrivateCluster.
   * Is this service installed on a private cluster.
   **/
  public void setIsPrivateCluster(Boolean isPrivateCluster) {
    this.isPrivateCluster = isPrivateCluster;
  }

  /**
   * Getter for creationDate.
   * Creation date of Cloudera AI Inference Service instance.
   **/
  @JsonProperty("creationDate")
  public ZonedDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * Setter for creationDate.
   * Creation date of Cloudera AI Inference Service instance.
   **/
  public void setCreationDate(ZonedDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Getter for cluster.
   * The Kubernetes cluster information.
   **/
  @JsonProperty("cluster")
  public KubernetesCluster getCluster() {
    return cluster;
  }

  /**
   * Setter for cluster.
   * The Kubernetes cluster information.
   **/
  public void setCluster(KubernetesCluster cluster) {
    this.cluster = cluster;
  }

  /**
   * Getter for status.
   * The status of the Cloudera AI Inference Service instance.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The status of the Cloudera AI Inference Service instance.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for usePublicLoadBalancer.
   * Indicates if this Cloudera AI Inference Service instance uses a public load balancer.
   **/
  @JsonProperty("usePublicLoadBalancer")
  public Boolean getUsePublicLoadBalancer() {
    return usePublicLoadBalancer;
  }

  /**
   * Setter for usePublicLoadBalancer.
   * Indicates if this Cloudera AI Inference Service instance uses a public load balancer.
   **/
  public void setUsePublicLoadBalancer(Boolean usePublicLoadBalancer) {
    this.usePublicLoadBalancer = usePublicLoadBalancer;
  }

  /**
   * Getter for httpsEnabled.
   * Indicates if HTTPs communication was enabled on this application when it was provisioned.
   **/
  @JsonProperty("httpsEnabled")
  public Boolean getHttpsEnabled() {
    return httpsEnabled;
  }

  /**
   * Setter for httpsEnabled.
   * Indicates if HTTPs communication was enabled on this application when it was provisioned.
   **/
  public void setHttpsEnabled(Boolean httpsEnabled) {
    this.httpsEnabled = httpsEnabled;
  }

  /**
   * Getter for subnetsForLoadBalancers.
   * The list of subnets used for the load balancer.
   **/
  @JsonProperty("subnetsForLoadBalancers")
  public List<String> getSubnetsForLoadBalancers() {
    return subnetsForLoadBalancers;
  }

  /**
   * Setter for subnetsForLoadBalancers.
   * The list of subnets used for the load balancer.
   **/
  public void setSubnetsForLoadBalancers(List<String> subnetsForLoadBalancers) {
    this.subnetsForLoadBalancers = subnetsForLoadBalancers;
  }

  /**
   * Getter for loadBalancerIPWhitelists.
   * The allowed list of IPs for the load balancer.
   **/
  @JsonProperty("loadBalancerIPWhitelists")
  public String getLoadBalancerIPWhitelists() {
    return loadBalancerIPWhitelists;
  }

  /**
   * Setter for loadBalancerIPWhitelists.
   * The allowed list of IPs for the load balancer.
   **/
  public void setLoadBalancerIPWhitelists(String loadBalancerIPWhitelists) {
    this.loadBalancerIPWhitelists = loadBalancerIPWhitelists;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MlServingApp mlServingApp = (MlServingApp) o;
    if (!Objects.equals(this.cloudPlatform, mlServingApp.cloudPlatform)) {
      return false;
    }
    if (!Objects.equals(this.appName, mlServingApp.appName)) {
      return false;
    }
    if (!Objects.equals(this.appCrn, mlServingApp.appCrn)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, mlServingApp.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, mlServingApp.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.namespace, mlServingApp.namespace)) {
      return false;
    }
    if (!Objects.equals(this.ownerEmail, mlServingApp.ownerEmail)) {
      return false;
    }
    if (!Objects.equals(this.mlServingVersion, mlServingApp.mlServingVersion)) {
      return false;
    }
    if (!Objects.equals(this.isPrivateCluster, mlServingApp.isPrivateCluster)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, mlServingApp.creationDate)) {
      return false;
    }
    if (!Objects.equals(this.cluster, mlServingApp.cluster)) {
      return false;
    }
    if (!Objects.equals(this.status, mlServingApp.status)) {
      return false;
    }
    if (!Objects.equals(this.usePublicLoadBalancer, mlServingApp.usePublicLoadBalancer)) {
      return false;
    }
    if (!Objects.equals(this.httpsEnabled, mlServingApp.httpsEnabled)) {
      return false;
    }
    if (!Objects.equals(this.subnetsForLoadBalancers, mlServingApp.subnetsForLoadBalancers)) {
      return false;
    }
    if (!Objects.equals(this.loadBalancerIPWhitelists, mlServingApp.loadBalancerIPWhitelists)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudPlatform, appName, appCrn, environmentCrn, environmentName, namespace, ownerEmail, mlServingVersion, isPrivateCluster, creationDate, cluster, status, usePublicLoadBalancer, httpsEnabled, subnetsForLoadBalancers, loadBalancerIPWhitelists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MlServingApp {\n");
    sb.append("    cloudPlatform: ").append(toIndentedString(cloudPlatform)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appCrn: ").append(toIndentedString(appCrn)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    ownerEmail: ").append(toIndentedString(ownerEmail)).append("\n");
    sb.append("    mlServingVersion: ").append(toIndentedString(mlServingVersion)).append("\n");
    sb.append("    isPrivateCluster: ").append(toIndentedString(isPrivateCluster)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    usePublicLoadBalancer: ").append(toIndentedString(usePublicLoadBalancer)).append("\n");
    sb.append("    httpsEnabled: ").append(toIndentedString(httpsEnabled)).append("\n");
    sb.append("    subnetsForLoadBalancers: ").append(toIndentedString(subnetsForLoadBalancers)).append("\n");
    sb.append("    loadBalancerIPWhitelists: ").append(toIndentedString(loadBalancerIPWhitelists)).append("\n");
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

