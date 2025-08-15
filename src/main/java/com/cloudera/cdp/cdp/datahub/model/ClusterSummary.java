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
import java.time.ZonedDateTime;

/**
 * Information about a cluster.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-14T20:25:42.889-07:00")
public class ClusterSummary  {

  /**
   * The name of the cluster.
   **/
  private String clusterName = null;

  /**
   * The CRN of the cluster.
   **/
  private String crn = null;

  /**
   * The status of the cluster.
   **/
  private String status = null;

  /**
   * The type of cluster.
   **/
  private String workloadType = null;

  /**
   * The CRN of the environment.
   **/
  private String environmentCrn = null;

  /**
   * The name of the environment.
   **/
  private String environmentName = null;

  /**
   * The name of the cloud platform.
   **/
  private String cloudPlatform = null;

  /**
   * The cluster node count.
   **/
  private Integer nodeCount = null;

  /**
   * The date when the cluster was created.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * The CRN of the attached datalake.
   **/
  private String datalakeCrn = null;

  /**
   * The CRN of the cluster template used for the cluster creation.
   **/
  private String clusterTemplateCrn = null;

  /**
   * Indicates the certificate status on the cluster.
   **/
  private String certificateExpirationState = null;

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
   * Getter for status.
   * The status of the cluster.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The status of the cluster.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for workloadType.
   * The type of cluster.
   **/
  @JsonProperty("workloadType")
  public String getWorkloadType() {
    return workloadType;
  }

  /**
   * Setter for workloadType.
   * The type of cluster.
   **/
  public void setWorkloadType(String workloadType) {
    this.workloadType = workloadType;
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
   * Getter for cloudPlatform.
   * The name of the cloud platform.
   **/
  @JsonProperty("cloudPlatform")
  public String getCloudPlatform() {
    return cloudPlatform;
  }

  /**
   * Setter for cloudPlatform.
   * The name of the cloud platform.
   **/
  public void setCloudPlatform(String cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
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

  /**
   * Getter for certificateExpirationState.
   * Indicates the certificate status on the cluster.
   **/
  @JsonProperty("certificateExpirationState")
  public String getCertificateExpirationState() {
    return certificateExpirationState;
  }

  /**
   * Setter for certificateExpirationState.
   * Indicates the certificate status on the cluster.
   **/
  public void setCertificateExpirationState(String certificateExpirationState) {
    this.certificateExpirationState = certificateExpirationState;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterSummary clusterSummary = (ClusterSummary) o;
    if (!Objects.equals(this.clusterName, clusterSummary.clusterName)) {
      return false;
    }
    if (!Objects.equals(this.crn, clusterSummary.crn)) {
      return false;
    }
    if (!Objects.equals(this.status, clusterSummary.status)) {
      return false;
    }
    if (!Objects.equals(this.workloadType, clusterSummary.workloadType)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, clusterSummary.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, clusterSummary.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.cloudPlatform, clusterSummary.cloudPlatform)) {
      return false;
    }
    if (!Objects.equals(this.nodeCount, clusterSummary.nodeCount)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, clusterSummary.creationDate)) {
      return false;
    }
    if (!Objects.equals(this.datalakeCrn, clusterSummary.datalakeCrn)) {
      return false;
    }
    if (!Objects.equals(this.clusterTemplateCrn, clusterSummary.clusterTemplateCrn)) {
      return false;
    }
    if (!Objects.equals(this.certificateExpirationState, clusterSummary.certificateExpirationState)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterName, crn, status, workloadType, environmentCrn, environmentName, cloudPlatform, nodeCount, creationDate, datalakeCrn, clusterTemplateCrn, certificateExpirationState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterSummary {\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    workloadType: ").append(toIndentedString(workloadType)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    cloudPlatform: ").append(toIndentedString(cloudPlatform)).append("\n");
    sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    datalakeCrn: ").append(toIndentedString(datalakeCrn)).append("\n");
    sb.append("    clusterTemplateCrn: ").append(toIndentedString(clusterTemplateCrn)).append("\n");
    sb.append("    certificateExpirationState: ").append(toIndentedString(certificateExpirationState)).append("\n");
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

