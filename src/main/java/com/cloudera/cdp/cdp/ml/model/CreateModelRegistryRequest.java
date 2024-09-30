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
import com.cloudera.cdp.ml.model.ModelRegistryProvisionK8sRequest;
import java.util.*;

/**
 * Request object for creating model registry.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-09-27T08:40:25.791-07:00")
public class CreateModelRegistryRequest  {

  /**
   * The namespace of the model registry.
   **/
  private String namespace = null;

  /**
   * The S3 access key of Ozone.
   **/
  private String s3AccessKey = null;

  /**
   * The S3 secret key of Ozone.
   **/
  private String s3SecretKey = null;

  /**
   * The s3Bucket of Ozone.
   **/
  private String s3Bucket = null;

  /**
   * The endpoint of Ozone.
   **/
  private String s3Endpoint = null;

  /**
   * The creator of model registry.
   **/
  private String creatorCrn = null;

  /**
   * The environment CRN of model registry.
   **/
  private String environmentCrn = null;

  /**
   * The environment for the model registry to create.
   **/
  private String environmentName = null;

  /**
   * The boolean flag to request a public load balancer. By default, a private load balancer is used.
   **/
  private Boolean usePublicLoadBalancer = null;

  /**
   * The list of subnets used for the load balancer that CML creates.
   **/
  private List<String> subnetsForLoadBalancers = new ArrayList<String>();

  /**
   * Outbound Types provided for the cluster.
   **/
  private List<String> outboundTypes = new ArrayList<String>();;

  /**
   * Skip pre-flight validations if requested.
   **/
  private Boolean skipValidation = null;

  /**
   * Whether to create a private cluster.
   **/
  private Boolean privateCluster = null;

  /**
   * The request for Kubernetes cluster provision. Required in public cloud.
   **/
  private ModelRegistryProvisionK8sRequest provisionK8sRequest = null;

  /**
   * The CRN of the backup that this model registry is created from.
   **/
  private String backupCrn = null;

  /**
   * Whether to whitelist only authorizedIPRanges given or all public IPs
   **/
  private Boolean whitelistAuthorizedIPRanges = null;

  /**
   * The whitelist of CIDR blocks which can access the API server.
   **/
  private List<String> authorizedIPRanges = new ArrayList<String>();

  /**
   * Getter for namespace.
   * The namespace of the model registry.
   **/
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }

  /**
   * Setter for namespace.
   * The namespace of the model registry.
   **/
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * Getter for s3AccessKey.
   * The S3 access key of Ozone.
   **/
  @JsonProperty("s3AccessKey")
  public String getS3AccessKey() {
    return s3AccessKey;
  }

  /**
   * Setter for s3AccessKey.
   * The S3 access key of Ozone.
   **/
  public void setS3AccessKey(String s3AccessKey) {
    this.s3AccessKey = s3AccessKey;
  }

  /**
   * Getter for s3SecretKey.
   * The S3 secret key of Ozone.
   **/
  @JsonProperty("s3SecretKey")
  public String getS3SecretKey() {
    return s3SecretKey;
  }

  /**
   * Setter for s3SecretKey.
   * The S3 secret key of Ozone.
   **/
  public void setS3SecretKey(String s3SecretKey) {
    this.s3SecretKey = s3SecretKey;
  }

  /**
   * Getter for s3Bucket.
   * The s3Bucket of Ozone.
   **/
  @JsonProperty("s3Bucket")
  public String getS3Bucket() {
    return s3Bucket;
  }

  /**
   * Setter for s3Bucket.
   * The s3Bucket of Ozone.
   **/
  public void setS3Bucket(String s3Bucket) {
    this.s3Bucket = s3Bucket;
  }

  /**
   * Getter for s3Endpoint.
   * The endpoint of Ozone.
   **/
  @JsonProperty("s3Endpoint")
  public String getS3Endpoint() {
    return s3Endpoint;
  }

  /**
   * Setter for s3Endpoint.
   * The endpoint of Ozone.
   **/
  public void setS3Endpoint(String s3Endpoint) {
    this.s3Endpoint = s3Endpoint;
  }

  /**
   * Getter for creatorCrn.
   * The creator of model registry.
   **/
  @JsonProperty("creatorCrn")
  public String getCreatorCrn() {
    return creatorCrn;
  }

  /**
   * Setter for creatorCrn.
   * The creator of model registry.
   **/
  public void setCreatorCrn(String creatorCrn) {
    this.creatorCrn = creatorCrn;
  }

  /**
   * Getter for environmentCrn.
   * The environment CRN of model registry.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The environment CRN of model registry.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for environmentName.
   * The environment for the model registry to create.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The environment for the model registry to create.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
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
   * Getter for subnetsForLoadBalancers.
   * The list of subnets used for the load balancer that CML creates.
   **/
  @JsonProperty("subnetsForLoadBalancers")
  public List<String> getSubnetsForLoadBalancers() {
    return subnetsForLoadBalancers;
  }

  /**
   * Setter for subnetsForLoadBalancers.
   * The list of subnets used for the load balancer that CML creates.
   **/
  public void setSubnetsForLoadBalancers(List<String> subnetsForLoadBalancers) {
    this.subnetsForLoadBalancers = subnetsForLoadBalancers;
  }

  /**
   * Getter for outboundTypes.
   * Outbound Types provided for the cluster.
   **/
  @JsonProperty("outboundTypes")
  public List<String> getOutboundTypes() {
    return outboundTypes;
  }

  /**
   * Setter for outboundTypes.
   * Outbound Types provided for the cluster.
   **/
  public void setOutboundTypes(List<String> outboundTypes) {
    this.outboundTypes = outboundTypes;
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
   * Getter for privateCluster.
   * Whether to create a private cluster.
   **/
  @JsonProperty("privateCluster")
  public Boolean getPrivateCluster() {
    return privateCluster;
  }

  /**
   * Setter for privateCluster.
   * Whether to create a private cluster.
   **/
  public void setPrivateCluster(Boolean privateCluster) {
    this.privateCluster = privateCluster;
  }

  /**
   * Getter for provisionK8sRequest.
   * The request for Kubernetes cluster provision. Required in public cloud.
   **/
  @JsonProperty("provisionK8sRequest")
  public ModelRegistryProvisionK8sRequest getProvisionK8sRequest() {
    return provisionK8sRequest;
  }

  /**
   * Setter for provisionK8sRequest.
   * The request for Kubernetes cluster provision. Required in public cloud.
   **/
  public void setProvisionK8sRequest(ModelRegistryProvisionK8sRequest provisionK8sRequest) {
    this.provisionK8sRequest = provisionK8sRequest;
  }

  /**
   * Getter for backupCrn.
   * The CRN of the backup that this model registry is created from.
   **/
  @JsonProperty("backupCrn")
  public String getBackupCrn() {
    return backupCrn;
  }

  /**
   * Setter for backupCrn.
   * The CRN of the backup that this model registry is created from.
   **/
  public void setBackupCrn(String backupCrn) {
    this.backupCrn = backupCrn;
  }

  /**
   * Getter for whitelistAuthorizedIPRanges.
   * Whether to whitelist only authorizedIPRanges given or all public IPs
   **/
  @JsonProperty("whitelistAuthorizedIPRanges")
  public Boolean getWhitelistAuthorizedIPRanges() {
    return whitelistAuthorizedIPRanges;
  }

  /**
   * Setter for whitelistAuthorizedIPRanges.
   * Whether to whitelist only authorizedIPRanges given or all public IPs
   **/
  public void setWhitelistAuthorizedIPRanges(Boolean whitelistAuthorizedIPRanges) {
    this.whitelistAuthorizedIPRanges = whitelistAuthorizedIPRanges;
  }

  /**
   * Getter for authorizedIPRanges.
   * The whitelist of CIDR blocks which can access the API server.
   **/
  @JsonProperty("authorizedIPRanges")
  public List<String> getAuthorizedIPRanges() {
    return authorizedIPRanges;
  }

  /**
   * Setter for authorizedIPRanges.
   * The whitelist of CIDR blocks which can access the API server.
   **/
  public void setAuthorizedIPRanges(List<String> authorizedIPRanges) {
    this.authorizedIPRanges = authorizedIPRanges;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateModelRegistryRequest createModelRegistryRequest = (CreateModelRegistryRequest) o;
    if (!Objects.equals(this.namespace, createModelRegistryRequest.namespace)) {
      return false;
    }
    if (!Objects.equals(this.s3AccessKey, createModelRegistryRequest.s3AccessKey)) {
      return false;
    }
    if (!Objects.equals(this.s3SecretKey, createModelRegistryRequest.s3SecretKey)) {
      return false;
    }
    if (!Objects.equals(this.s3Bucket, createModelRegistryRequest.s3Bucket)) {
      return false;
    }
    if (!Objects.equals(this.s3Endpoint, createModelRegistryRequest.s3Endpoint)) {
      return false;
    }
    if (!Objects.equals(this.creatorCrn, createModelRegistryRequest.creatorCrn)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, createModelRegistryRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, createModelRegistryRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.usePublicLoadBalancer, createModelRegistryRequest.usePublicLoadBalancer)) {
      return false;
    }
    if (!Objects.equals(this.subnetsForLoadBalancers, createModelRegistryRequest.subnetsForLoadBalancers)) {
      return false;
    }
    if (!Objects.equals(this.outboundTypes, createModelRegistryRequest.outboundTypes)) {
      return false;
    }
    if (!Objects.equals(this.skipValidation, createModelRegistryRequest.skipValidation)) {
      return false;
    }
    if (!Objects.equals(this.privateCluster, createModelRegistryRequest.privateCluster)) {
      return false;
    }
    if (!Objects.equals(this.provisionK8sRequest, createModelRegistryRequest.provisionK8sRequest)) {
      return false;
    }
    if (!Objects.equals(this.backupCrn, createModelRegistryRequest.backupCrn)) {
      return false;
    }
    if (!Objects.equals(this.whitelistAuthorizedIPRanges, createModelRegistryRequest.whitelistAuthorizedIPRanges)) {
      return false;
    }
    if (!Objects.equals(this.authorizedIPRanges, createModelRegistryRequest.authorizedIPRanges)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, s3AccessKey, s3SecretKey, s3Bucket, s3Endpoint, creatorCrn, environmentCrn, environmentName, usePublicLoadBalancer, subnetsForLoadBalancers, outboundTypes, skipValidation, privateCluster, provisionK8sRequest, backupCrn, whitelistAuthorizedIPRanges, authorizedIPRanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModelRegistryRequest {\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    s3AccessKey: ").append(toIndentedString(s3AccessKey)).append("\n");
    sb.append("    s3SecretKey: ").append(toIndentedString(s3SecretKey)).append("\n");
    sb.append("    s3Bucket: ").append(toIndentedString(s3Bucket)).append("\n");
    sb.append("    s3Endpoint: ").append(toIndentedString(s3Endpoint)).append("\n");
    sb.append("    creatorCrn: ").append(toIndentedString(creatorCrn)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    usePublicLoadBalancer: ").append(toIndentedString(usePublicLoadBalancer)).append("\n");
    sb.append("    subnetsForLoadBalancers: ").append(toIndentedString(subnetsForLoadBalancers)).append("\n");
    sb.append("    outboundTypes: ").append(toIndentedString(outboundTypes)).append("\n");
    sb.append("    skipValidation: ").append(toIndentedString(skipValidation)).append("\n");
    sb.append("    privateCluster: ").append(toIndentedString(privateCluster)).append("\n");
    sb.append("    provisionK8sRequest: ").append(toIndentedString(provisionK8sRequest)).append("\n");
    sb.append("    backupCrn: ").append(toIndentedString(backupCrn)).append("\n");
    sb.append("    whitelistAuthorizedIPRanges: ").append(toIndentedString(whitelistAuthorizedIPRanges)).append("\n");
    sb.append("    authorizedIPRanges: ").append(toIndentedString(authorizedIPRanges)).append("\n");
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

