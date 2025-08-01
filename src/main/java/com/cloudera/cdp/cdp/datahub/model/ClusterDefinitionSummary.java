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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Information about a cluster definition.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:39.671-07:00")
public class ClusterDefinitionSummary  {

  /**
   * The name of the cluster definition.
   **/
  private String clusterDefinitionName = null;

  /**
   * The CRN of the cluster definition.
   **/
  private String crn = null;

  /**
   * The type of cluster definition.
   **/
  private String type = null;

  /**
   * The node count of the cluster.
   **/
  private Integer nodeCount = null;

  /**
   * The cloud platform.
   **/
  private String cloudPlatform = null;

  /**
   * The product version.
   **/
  private String productVersion = null;

  /**
   * The CRN of the environment.
   **/
  private String environmentCrn = null;

  /**
   * The description of the cluster definition.
   **/
  private String description = null;

  /**
   * Getter for clusterDefinitionName.
   * The name of the cluster definition.
   **/
  @JsonProperty("clusterDefinitionName")
  public String getClusterDefinitionName() {
    return clusterDefinitionName;
  }

  /**
   * Setter for clusterDefinitionName.
   * The name of the cluster definition.
   **/
  public void setClusterDefinitionName(String clusterDefinitionName) {
    this.clusterDefinitionName = clusterDefinitionName;
  }

  /**
   * Getter for crn.
   * The CRN of the cluster definition.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the cluster definition.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for type.
   * The type of cluster definition.
   **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Setter for type.
   * The type of cluster definition.
   **/
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Getter for nodeCount.
   * The node count of the cluster.
   **/
  @JsonProperty("nodeCount")
  public Integer getNodeCount() {
    return nodeCount;
  }

  /**
   * Setter for nodeCount.
   * The node count of the cluster.
   **/
  public void setNodeCount(Integer nodeCount) {
    this.nodeCount = nodeCount;
  }

  /**
   * Getter for cloudPlatform.
   * The cloud platform.
   **/
  @JsonProperty("cloudPlatform")
  public String getCloudPlatform() {
    return cloudPlatform;
  }

  /**
   * Setter for cloudPlatform.
   * The cloud platform.
   **/
  public void setCloudPlatform(String cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
  }

  /**
   * Getter for productVersion.
   * The product version.
   **/
  @JsonProperty("productVersion")
  public String getProductVersion() {
    return productVersion;
  }

  /**
   * Setter for productVersion.
   * The product version.
   **/
  public void setProductVersion(String productVersion) {
    this.productVersion = productVersion;
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
   * Getter for description.
   * The description of the cluster definition.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * The description of the cluster definition.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterDefinitionSummary clusterDefinitionSummary = (ClusterDefinitionSummary) o;
    if (!Objects.equals(this.clusterDefinitionName, clusterDefinitionSummary.clusterDefinitionName)) {
      return false;
    }
    if (!Objects.equals(this.crn, clusterDefinitionSummary.crn)) {
      return false;
    }
    if (!Objects.equals(this.type, clusterDefinitionSummary.type)) {
      return false;
    }
    if (!Objects.equals(this.nodeCount, clusterDefinitionSummary.nodeCount)) {
      return false;
    }
    if (!Objects.equals(this.cloudPlatform, clusterDefinitionSummary.cloudPlatform)) {
      return false;
    }
    if (!Objects.equals(this.productVersion, clusterDefinitionSummary.productVersion)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, clusterDefinitionSummary.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.description, clusterDefinitionSummary.description)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterDefinitionName, crn, type, nodeCount, cloudPlatform, productVersion, environmentCrn, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterDefinitionSummary {\n");
    sb.append("    clusterDefinitionName: ").append(toIndentedString(clusterDefinitionName)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
    sb.append("    cloudPlatform: ").append(toIndentedString(cloudPlatform)).append("\n");
    sb.append("    productVersion: ").append(toIndentedString(productVersion)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

