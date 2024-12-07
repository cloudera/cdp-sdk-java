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
import com.cloudera.cdp.ml.model.Tag;
import com.cloudera.cdp.ml.model.WorkspaceInstanceGroup;
import java.util.*;

/**
 * The Kubernetes cluster information
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-06T11:27:15.866-08:00")
public class KubernetesCluster  {

  /**
   * The name of the Kubernetes cluster.
   **/
  private String clusterName = null;

  /**
   * The domain name for the cluster.
   **/
  private String domainName = null;

  /**
   * The identifier in Cloudera Data Platform Compute Service corresponding to this Kubernetes cluster.
   **/
  private String liftieID = null;

  /**
   * Indicates if this cluster is accepting incoming connection from public internet.
   **/
  private Boolean isPublic = null;

  /**
   * The allow list of IPs for incoming connections.
   **/
  private String ipAllowlist = null;

  /**
   * The base domain for this cluster.
   **/
  private String baseDomain = null;

  /**
   * The subnets associated with this cluster.
   **/
  private String subnets = null;

  /**
   * The allow list of CIDR blocks which can access the API server.
   **/
  private String authorizedIpRanges = null;

  /**
   * Whether to allow only 'authorizedIPRanges' given or all public IPs.
   **/
  private Boolean authorizedIpRangesAllowList = null;

  /**
   * Tags provided by the user at the time of app creation.
   **/
  private List<Tag> tags = new ArrayList<Tag>();

  /**
   * The instance groups.
   **/
  private List<WorkspaceInstanceGroup> instanceGroups = new ArrayList<WorkspaceInstanceGroup>();

  /**
   * The cluster CRN of the kubernetes cluster.
   **/
  private String clusterCrn = null;

  /**
   * Getter for clusterName.
   * The name of the Kubernetes cluster.
   **/
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }

  /**
   * Setter for clusterName.
   * The name of the Kubernetes cluster.
   **/
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  /**
   * Getter for domainName.
   * The domain name for the cluster.
   **/
  @JsonProperty("domainName")
  public String getDomainName() {
    return domainName;
  }

  /**
   * Setter for domainName.
   * The domain name for the cluster.
   **/
  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  /**
   * Getter for liftieID.
   * The identifier in Cloudera Data Platform Compute Service corresponding to this Kubernetes cluster.
   **/
  @JsonProperty("liftieID")
  public String getLiftieID() {
    return liftieID;
  }

  /**
   * Setter for liftieID.
   * The identifier in Cloudera Data Platform Compute Service corresponding to this Kubernetes cluster.
   **/
  public void setLiftieID(String liftieID) {
    this.liftieID = liftieID;
  }

  /**
   * Getter for isPublic.
   * Indicates if this cluster is accepting incoming connection from public internet.
   **/
  @JsonProperty("isPublic")
  public Boolean getIsPublic() {
    return isPublic;
  }

  /**
   * Setter for isPublic.
   * Indicates if this cluster is accepting incoming connection from public internet.
   **/
  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }

  /**
   * Getter for ipAllowlist.
   * The allow list of IPs for incoming connections.
   **/
  @JsonProperty("ipAllowlist")
  public String getIpAllowlist() {
    return ipAllowlist;
  }

  /**
   * Setter for ipAllowlist.
   * The allow list of IPs for incoming connections.
   **/
  public void setIpAllowlist(String ipAllowlist) {
    this.ipAllowlist = ipAllowlist;
  }

  /**
   * Getter for baseDomain.
   * The base domain for this cluster.
   **/
  @JsonProperty("baseDomain")
  public String getBaseDomain() {
    return baseDomain;
  }

  /**
   * Setter for baseDomain.
   * The base domain for this cluster.
   **/
  public void setBaseDomain(String baseDomain) {
    this.baseDomain = baseDomain;
  }

  /**
   * Getter for subnets.
   * The subnets associated with this cluster.
   **/
  @JsonProperty("subnets")
  public String getSubnets() {
    return subnets;
  }

  /**
   * Setter for subnets.
   * The subnets associated with this cluster.
   **/
  public void setSubnets(String subnets) {
    this.subnets = subnets;
  }

  /**
   * Getter for authorizedIpRanges.
   * The allow list of CIDR blocks which can access the API server.
   **/
  @JsonProperty("authorizedIpRanges")
  public String getAuthorizedIpRanges() {
    return authorizedIpRanges;
  }

  /**
   * Setter for authorizedIpRanges.
   * The allow list of CIDR blocks which can access the API server.
   **/
  public void setAuthorizedIpRanges(String authorizedIpRanges) {
    this.authorizedIpRanges = authorizedIpRanges;
  }

  /**
   * Getter for authorizedIpRangesAllowList.
   * Whether to allow only &#39;authorizedIPRanges&#39; given or all public IPs.
   **/
  @JsonProperty("authorizedIpRangesAllowList")
  public Boolean getAuthorizedIpRangesAllowList() {
    return authorizedIpRangesAllowList;
  }

  /**
   * Setter for authorizedIpRangesAllowList.
   * Whether to allow only &#39;authorizedIPRanges&#39; given or all public IPs.
   **/
  public void setAuthorizedIpRangesAllowList(Boolean authorizedIpRangesAllowList) {
    this.authorizedIpRangesAllowList = authorizedIpRangesAllowList;
  }

  /**
   * Getter for tags.
   * Tags provided by the user at the time of app creation.
   **/
  @JsonProperty("tags")
  public List<Tag> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Tags provided by the user at the time of app creation.
   **/
  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  /**
   * Getter for instanceGroups.
   * The instance groups.
   **/
  @JsonProperty("instanceGroups")
  public List<WorkspaceInstanceGroup> getInstanceGroups() {
    return instanceGroups;
  }

  /**
   * Setter for instanceGroups.
   * The instance groups.
   **/
  public void setInstanceGroups(List<WorkspaceInstanceGroup> instanceGroups) {
    this.instanceGroups = instanceGroups;
  }

  /**
   * Getter for clusterCrn.
   * The cluster CRN of the kubernetes cluster.
   **/
  @JsonProperty("clusterCrn")
  public String getClusterCrn() {
    return clusterCrn;
  }

  /**
   * Setter for clusterCrn.
   * The cluster CRN of the kubernetes cluster.
   **/
  public void setClusterCrn(String clusterCrn) {
    this.clusterCrn = clusterCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KubernetesCluster kubernetesCluster = (KubernetesCluster) o;
    if (!Objects.equals(this.clusterName, kubernetesCluster.clusterName)) {
      return false;
    }
    if (!Objects.equals(this.domainName, kubernetesCluster.domainName)) {
      return false;
    }
    if (!Objects.equals(this.liftieID, kubernetesCluster.liftieID)) {
      return false;
    }
    if (!Objects.equals(this.isPublic, kubernetesCluster.isPublic)) {
      return false;
    }
    if (!Objects.equals(this.ipAllowlist, kubernetesCluster.ipAllowlist)) {
      return false;
    }
    if (!Objects.equals(this.baseDomain, kubernetesCluster.baseDomain)) {
      return false;
    }
    if (!Objects.equals(this.subnets, kubernetesCluster.subnets)) {
      return false;
    }
    if (!Objects.equals(this.authorizedIpRanges, kubernetesCluster.authorizedIpRanges)) {
      return false;
    }
    if (!Objects.equals(this.authorizedIpRangesAllowList, kubernetesCluster.authorizedIpRangesAllowList)) {
      return false;
    }
    if (!Objects.equals(this.tags, kubernetesCluster.tags)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroups, kubernetesCluster.instanceGroups)) {
      return false;
    }
    if (!Objects.equals(this.clusterCrn, kubernetesCluster.clusterCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterName, domainName, liftieID, isPublic, ipAllowlist, baseDomain, subnets, authorizedIpRanges, authorizedIpRangesAllowList, tags, instanceGroups, clusterCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KubernetesCluster {\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    liftieID: ").append(toIndentedString(liftieID)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    ipAllowlist: ").append(toIndentedString(ipAllowlist)).append("\n");
    sb.append("    baseDomain: ").append(toIndentedString(baseDomain)).append("\n");
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
    sb.append("    authorizedIpRanges: ").append(toIndentedString(authorizedIpRanges)).append("\n");
    sb.append("    authorizedIpRangesAllowList: ").append(toIndentedString(authorizedIpRangesAllowList)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    instanceGroups: ").append(toIndentedString(instanceGroups)).append("\n");
    sb.append("    clusterCrn: ").append(toIndentedString(clusterCrn)).append("\n");
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

