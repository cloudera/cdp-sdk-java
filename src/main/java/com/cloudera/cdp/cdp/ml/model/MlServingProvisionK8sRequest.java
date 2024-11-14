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
import com.cloudera.cdp.ml.model.InstanceGroup;
import com.cloudera.cdp.ml.model.OverlayNetwork;
import com.cloudera.cdp.ml.model.ProvisionTag;
import java.util.*;

/**
 * Request object for provisioning Cloudera AI Inference Service instance groups.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-11-13T12:48:25.494-08:00")
public class MlServingProvisionK8sRequest  {

  /**
   * The instance groups.
   **/
  private List<InstanceGroup> instanceGroups = new ArrayList<InstanceGroup>();

  /**
   * The CRN of the environment for the cluster to create.
   **/
  private String environmentCrn = null;

  /**
   * Tags to add to the cloud provider resources created. This is in addition to any tags added by Cloudera.
   **/
  private List<ProvisionTag> tags = new ArrayList<ProvisionTag>();

  /**
   * The overlay network for an AWS Kubernetes cluster's CNI.
   **/
  private OverlayNetwork network = null;

  /**
   * Getter for instanceGroups.
   * The instance groups.
   **/
  @JsonProperty("instanceGroups")
  public List<InstanceGroup> getInstanceGroups() {
    return instanceGroups;
  }

  /**
   * Setter for instanceGroups.
   * The instance groups.
   **/
  public void setInstanceGroups(List<InstanceGroup> instanceGroups) {
    this.instanceGroups = instanceGroups;
  }

  /**
   * Getter for environmentCrn.
   * The CRN of the environment for the cluster to create.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of the environment for the cluster to create.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for tags.
   * Tags to add to the cloud provider resources created. This is in addition to any tags added by Cloudera.
   **/
  @JsonProperty("tags")
  public List<ProvisionTag> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Tags to add to the cloud provider resources created. This is in addition to any tags added by Cloudera.
   **/
  public void setTags(List<ProvisionTag> tags) {
    this.tags = tags;
  }

  /**
   * Getter for network.
   * The overlay network for an AWS Kubernetes cluster&#39;s CNI.
   **/
  @JsonProperty("network")
  public OverlayNetwork getNetwork() {
    return network;
  }

  /**
   * Setter for network.
   * The overlay network for an AWS Kubernetes cluster&#39;s CNI.
   **/
  public void setNetwork(OverlayNetwork network) {
    this.network = network;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MlServingProvisionK8sRequest mlServingProvisionK8sRequest = (MlServingProvisionK8sRequest) o;
    if (!Objects.equals(this.instanceGroups, mlServingProvisionK8sRequest.instanceGroups)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, mlServingProvisionK8sRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.tags, mlServingProvisionK8sRequest.tags)) {
      return false;
    }
    if (!Objects.equals(this.network, mlServingProvisionK8sRequest.network)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceGroups, environmentCrn, tags, network);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MlServingProvisionK8sRequest {\n");
    sb.append("    instanceGroups: ").append(toIndentedString(instanceGroups)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
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

