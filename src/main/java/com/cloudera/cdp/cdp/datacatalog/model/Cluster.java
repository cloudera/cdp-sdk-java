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

package com.cloudera.cdp.datacatalog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datacatalog.model.ImageDetails;
import java.time.ZonedDateTime;

/**
 * Information about a cluster.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-04-17T06:49:12.450-07:00")
public class Cluster  {

  /**
   * The name of the cluster.
   **/
  private String clusterName = null;

  /**
   * The CRN of the cluster.
   **/
  private String crn = null;

  /**
   * The date when the cluster was created.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * The status of the cluster.
   **/
  private String clusterStatus = null;

  /**
   * The cluster node count.
   **/
  private Integer nodeCount = null;

  /**
   * The workload type for the cluster.
   **/
  private String workloadType = null;

  /**
   * The cloud platform.
   **/
  private String cloudPlatform = null;

  /**
   * The image details.
   **/
  private ImageDetails imageDetails = null;

  /**
   * The CRN of the environment.
   **/
  private String environmentCrn = null;

  /**
   * The CRN of the credential.
   **/
  private String credentialCrn = null;

  /**
   * The CRN of the attached datalake.
   **/
  private String datalakeCrn = null;

  /**
   * The CRN of the cluster template used for the cluster creation.
   **/
  private String clusterTemplateCrn = null;

  /**
   * Getter for clusterName.
   * The name of the cluster.
   **/
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }

  /**
   * Setter for clusterName.
   * The name of the cluster.
   **/
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  /**
   * Getter for crn.
   * The CRN of the cluster.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the cluster.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for creationDate.
   * The date when the cluster was created.
   **/
  @JsonProperty("creationDate")
  public ZonedDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * Setter for creationDate.
   * The date when the cluster was created.
   **/
  public void setCreationDate(ZonedDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Getter for clusterStatus.
   * The status of the cluster.
   **/
  @JsonProperty("clusterStatus")
  public String getClusterStatus() {
    return clusterStatus;
  }

  /**
   * Setter for clusterStatus.
   * The status of the cluster.
   **/
  public void setClusterStatus(String clusterStatus) {
    this.clusterStatus = clusterStatus;
  }

  /**
   * Getter for nodeCount.
   * The cluster node count.
   **/
  @JsonProperty("nodeCount")
  public Integer getNodeCount() {
    return nodeCount;
  }

  /**
   * Setter for nodeCount.
   * The cluster node count.
   **/
  public void setNodeCount(Integer nodeCount) {
    this.nodeCount = nodeCount;
  }

  /**
   * Getter for workloadType.
   * The workload type for the cluster.
   **/
  @JsonProperty("workloadType")
  public String getWorkloadType() {
    return workloadType;
  }

  /**
   * Setter for workloadType.
   * The workload type for the cluster.
   **/
  public void setWorkloadType(String workloadType) {
    this.workloadType = workloadType;
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
   * Getter for imageDetails.
   * The image details.
   **/
  @JsonProperty("imageDetails")
  public ImageDetails getImageDetails() {
    return imageDetails;
  }

  /**
   * Setter for imageDetails.
   * The image details.
   **/
  public void setImageDetails(ImageDetails imageDetails) {
    this.imageDetails = imageDetails;
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
   * Getter for credentialCrn.
   * The CRN of the credential.
   **/
  @JsonProperty("credentialCrn")
  public String getCredentialCrn() {
    return credentialCrn;
  }

  /**
   * Setter for credentialCrn.
   * The CRN of the credential.
   **/
  public void setCredentialCrn(String credentialCrn) {
    this.credentialCrn = credentialCrn;
  }

  /**
   * Getter for datalakeCrn.
   * The CRN of the attached datalake.
   **/
  @JsonProperty("datalakeCrn")
  public String getDatalakeCrn() {
    return datalakeCrn;
  }

  /**
   * Setter for datalakeCrn.
   * The CRN of the attached datalake.
   **/
  public void setDatalakeCrn(String datalakeCrn) {
    this.datalakeCrn = datalakeCrn;
  }

  /**
   * Getter for clusterTemplateCrn.
   * The CRN of the cluster template used for the cluster creation.
   **/
  @JsonProperty("clusterTemplateCrn")
  public String getClusterTemplateCrn() {
    return clusterTemplateCrn;
  }

  /**
   * Setter for clusterTemplateCrn.
   * The CRN of the cluster template used for the cluster creation.
   **/
  public void setClusterTemplateCrn(String clusterTemplateCrn) {
    this.clusterTemplateCrn = clusterTemplateCrn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cluster cluster = (Cluster) o;
    if (!Objects.equals(this.clusterName, cluster.clusterName)) {
      return false;
    }
    if (!Objects.equals(this.crn, cluster.crn)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, cluster.creationDate)) {
      return false;
    }
    if (!Objects.equals(this.clusterStatus, cluster.clusterStatus)) {
      return false;
    }
    if (!Objects.equals(this.nodeCount, cluster.nodeCount)) {
      return false;
    }
    if (!Objects.equals(this.workloadType, cluster.workloadType)) {
      return false;
    }
    if (!Objects.equals(this.cloudPlatform, cluster.cloudPlatform)) {
      return false;
    }
    if (!Objects.equals(this.imageDetails, cluster.imageDetails)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, cluster.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.credentialCrn, cluster.credentialCrn)) {
      return false;
    }
    if (!Objects.equals(this.datalakeCrn, cluster.datalakeCrn)) {
      return false;
    }
    if (!Objects.equals(this.clusterTemplateCrn, cluster.clusterTemplateCrn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterName, crn, creationDate, clusterStatus, nodeCount, workloadType, cloudPlatform, imageDetails, environmentCrn, credentialCrn, datalakeCrn, clusterTemplateCrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cluster {\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    clusterStatus: ").append(toIndentedString(clusterStatus)).append("\n");
    sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
    sb.append("    workloadType: ").append(toIndentedString(workloadType)).append("\n");
    sb.append("    cloudPlatform: ").append(toIndentedString(cloudPlatform)).append("\n");
    sb.append("    imageDetails: ").append(toIndentedString(imageDetails)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    credentialCrn: ").append(toIndentedString(credentialCrn)).append("\n");
    sb.append("    datalakeCrn: ").append(toIndentedString(datalakeCrn)).append("\n");
    sb.append("    clusterTemplateCrn: ").append(toIndentedString(clusterTemplateCrn)).append("\n");
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

