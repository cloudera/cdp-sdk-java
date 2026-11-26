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

package com.cloudera.cdp.de.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import java.util.*;
import java.util.Map;

/**
 * Request object for updateVc method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-11-25T15:42:50.192Z")
public class UpdateVcRequest  {

  /**
   * Cluster ID of the CDE service where Virtual Cluster was enabled.
   **/
  private String clusterId = null;

  /**
   * Virtual Cluster ID
   **/
  private String vcId = null;

  /**
   * Comma-separated Workload usernames of CDP users to be granted access to the Virtual Cluster.
   **/
  private String aclUsers = null;

  /**
   * Users with full access.
   **/
  private List<String> fullAccessUsers = new ArrayList<String>();

  /**
   * Groups with full access.
   **/
  private List<String> fullAccessGroups = new ArrayList<String>();

  /**
   * Users with view only access.
   **/
  private List<String> viewOnlyUsers = new ArrayList<String>();

  /**
   * Groups with view only access.
   **/
  private List<String> viewOnlyGroups = new ArrayList<String>();

  /**
   * Spark configs that will be applied to all the spark jobs inside a virtual cluster.
   **/
  private Map<String, String> sparkConfigs = new HashMap<String, String>();

  /**
   * Discard the Spark configs inside a VC.
   **/
  private Boolean discardSparkConfigs = false;

  /**
   * Whether to enable job-level override for how drivers and executors run in the Virtual Cluster.
   **/
  private Boolean enableComputeOverride = null;

  /**
   * Base64-encoded PEM certificate bundle applied to dex-app, Airflow, and Airflow API database connections. Cannot be used together with encodedDbCaCertApi, encodedDbCaCertAirflow, or encodedDbCaCertAirflowAPI.
   **/
  private String encodedDbCaCert = null;

  /**
   * Base64-encoded PEM certificate bundle for the dex-app API database connection. Cannot be used together with encodedDbCaCert.
   **/
  private String encodedDbCaCertApi = null;

  /**
   * Base64-encoded PEM certificate bundle for the Airflow database connection. Cannot be used together with encodedDbCaCert.
   **/
  private String encodedDbCaCertAirflow = null;

  /**
   * Base64-encoded PEM certificate bundle for the Airflow API database connection. Cannot be used together with encodedDbCaCert.
   **/
  private String encodedDbCaCertAirflowAPI = null;

  /**
   * Getter for clusterId.
   * Cluster ID of the CDE service where Virtual Cluster was enabled.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * Cluster ID of the CDE service where Virtual Cluster was enabled.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for vcId.
   * Virtual Cluster ID
   **/
  @JsonProperty("vcId")
  public String getVcId() {
    return vcId;
  }

  /**
   * Setter for vcId.
   * Virtual Cluster ID
   **/
  public void setVcId(String vcId) {
    this.vcId = vcId;
  }

  /**
   * Getter for aclUsers.
   * Comma-separated Workload usernames of CDP users to be granted access to the Virtual Cluster.
   **/
  @JsonProperty("aclUsers")
  public String getAclUsers() {
    return aclUsers;
  }

  /**
   * Setter for aclUsers.
   * Comma-separated Workload usernames of CDP users to be granted access to the Virtual Cluster.
   **/
  public void setAclUsers(String aclUsers) {
    this.aclUsers = aclUsers;
  }

  /**
   * Getter for fullAccessUsers.
   * Users with full access.
   **/
  @JsonProperty("fullAccessUsers")
  public List<String> getFullAccessUsers() {
    return fullAccessUsers;
  }

  /**
   * Setter for fullAccessUsers.
   * Users with full access.
   **/
  public void setFullAccessUsers(List<String> fullAccessUsers) {
    this.fullAccessUsers = fullAccessUsers;
  }

  /**
   * Getter for fullAccessGroups.
   * Groups with full access.
   **/
  @JsonProperty("fullAccessGroups")
  public List<String> getFullAccessGroups() {
    return fullAccessGroups;
  }

  /**
   * Setter for fullAccessGroups.
   * Groups with full access.
   **/
  public void setFullAccessGroups(List<String> fullAccessGroups) {
    this.fullAccessGroups = fullAccessGroups;
  }

  /**
   * Getter for viewOnlyUsers.
   * Users with view only access.
   **/
  @JsonProperty("viewOnlyUsers")
  public List<String> getViewOnlyUsers() {
    return viewOnlyUsers;
  }

  /**
   * Setter for viewOnlyUsers.
   * Users with view only access.
   **/
  public void setViewOnlyUsers(List<String> viewOnlyUsers) {
    this.viewOnlyUsers = viewOnlyUsers;
  }

  /**
   * Getter for viewOnlyGroups.
   * Groups with view only access.
   **/
  @JsonProperty("viewOnlyGroups")
  public List<String> getViewOnlyGroups() {
    return viewOnlyGroups;
  }

  /**
   * Setter for viewOnlyGroups.
   * Groups with view only access.
   **/
  public void setViewOnlyGroups(List<String> viewOnlyGroups) {
    this.viewOnlyGroups = viewOnlyGroups;
  }

  /**
   * Getter for sparkConfigs.
   * Spark configs that will be applied to all the spark jobs inside a virtual cluster.
   **/
  @JsonProperty("sparkConfigs")
  public Map<String, String> getSparkConfigs() {
    return sparkConfigs;
  }

  /**
   * Setter for sparkConfigs.
   * Spark configs that will be applied to all the spark jobs inside a virtual cluster.
   **/
  public void setSparkConfigs(Map<String, String> sparkConfigs) {
    this.sparkConfigs = sparkConfigs;
  }

  /**
   * Getter for discardSparkConfigs.
   * Discard the Spark configs inside a VC.
   **/
  @JsonProperty("discardSparkConfigs")
  public Boolean getDiscardSparkConfigs() {
    return discardSparkConfigs;
  }

  /**
   * Setter for discardSparkConfigs.
   * Discard the Spark configs inside a VC.
   **/
  public void setDiscardSparkConfigs(Boolean discardSparkConfigs) {
    this.discardSparkConfigs = discardSparkConfigs;
  }

  /**
   * Getter for enableComputeOverride.
   * Whether to enable job-level override for how drivers and executors run in the Virtual Cluster.
   **/
  @JsonProperty("enableComputeOverride")
  public Boolean getEnableComputeOverride() {
    return enableComputeOverride;
  }

  /**
   * Setter for enableComputeOverride.
   * Whether to enable job-level override for how drivers and executors run in the Virtual Cluster.
   **/
  public void setEnableComputeOverride(Boolean enableComputeOverride) {
    this.enableComputeOverride = enableComputeOverride;
  }

  /**
   * Getter for encodedDbCaCert.
   * Base64-encoded PEM certificate bundle applied to dex-app, Airflow, and Airflow API database connections. Cannot be used together with encodedDbCaCertApi, encodedDbCaCertAirflow, or encodedDbCaCertAirflowAPI.
   **/
  @JsonProperty("encodedDbCaCert")
  public String getEncodedDbCaCert() {
    return encodedDbCaCert;
  }

  /**
   * Setter for encodedDbCaCert.
   * Base64-encoded PEM certificate bundle applied to dex-app, Airflow, and Airflow API database connections. Cannot be used together with encodedDbCaCertApi, encodedDbCaCertAirflow, or encodedDbCaCertAirflowAPI.
   **/
  public void setEncodedDbCaCert(String encodedDbCaCert) {
    this.encodedDbCaCert = encodedDbCaCert;
  }

  /**
   * Getter for encodedDbCaCertApi.
   * Base64-encoded PEM certificate bundle for the dex-app API database connection. Cannot be used together with encodedDbCaCert.
   **/
  @JsonProperty("encodedDbCaCertApi")
  public String getEncodedDbCaCertApi() {
    return encodedDbCaCertApi;
  }

  /**
   * Setter for encodedDbCaCertApi.
   * Base64-encoded PEM certificate bundle for the dex-app API database connection. Cannot be used together with encodedDbCaCert.
   **/
  public void setEncodedDbCaCertApi(String encodedDbCaCertApi) {
    this.encodedDbCaCertApi = encodedDbCaCertApi;
  }

  /**
   * Getter for encodedDbCaCertAirflow.
   * Base64-encoded PEM certificate bundle for the Airflow database connection. Cannot be used together with encodedDbCaCert.
   **/
  @JsonProperty("encodedDbCaCertAirflow")
  public String getEncodedDbCaCertAirflow() {
    return encodedDbCaCertAirflow;
  }

  /**
   * Setter for encodedDbCaCertAirflow.
   * Base64-encoded PEM certificate bundle for the Airflow database connection. Cannot be used together with encodedDbCaCert.
   **/
  public void setEncodedDbCaCertAirflow(String encodedDbCaCertAirflow) {
    this.encodedDbCaCertAirflow = encodedDbCaCertAirflow;
  }

  /**
   * Getter for encodedDbCaCertAirflowAPI.
   * Base64-encoded PEM certificate bundle for the Airflow API database connection. Cannot be used together with encodedDbCaCert.
   **/
  @JsonProperty("encodedDbCaCertAirflowAPI")
  public String getEncodedDbCaCertAirflowAPI() {
    return encodedDbCaCertAirflowAPI;
  }

  /**
   * Setter for encodedDbCaCertAirflowAPI.
   * Base64-encoded PEM certificate bundle for the Airflow API database connection. Cannot be used together with encodedDbCaCert.
   **/
  public void setEncodedDbCaCertAirflowAPI(String encodedDbCaCertAirflowAPI) {
    this.encodedDbCaCertAirflowAPI = encodedDbCaCertAirflowAPI;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVcRequest updateVcRequest = (UpdateVcRequest) o;
    if (!Objects.equals(this.clusterId, updateVcRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.vcId, updateVcRequest.vcId)) {
      return false;
    }
    if (!Objects.equals(this.aclUsers, updateVcRequest.aclUsers)) {
      return false;
    }
    if (!Objects.equals(this.fullAccessUsers, updateVcRequest.fullAccessUsers)) {
      return false;
    }
    if (!Objects.equals(this.fullAccessGroups, updateVcRequest.fullAccessGroups)) {
      return false;
    }
    if (!Objects.equals(this.viewOnlyUsers, updateVcRequest.viewOnlyUsers)) {
      return false;
    }
    if (!Objects.equals(this.viewOnlyGroups, updateVcRequest.viewOnlyGroups)) {
      return false;
    }
    if (!Objects.equals(this.sparkConfigs, updateVcRequest.sparkConfigs)) {
      return false;
    }
    if (!Objects.equals(this.discardSparkConfigs, updateVcRequest.discardSparkConfigs)) {
      return false;
    }
    if (!Objects.equals(this.enableComputeOverride, updateVcRequest.enableComputeOverride)) {
      return false;
    }
    if (!Objects.equals(this.encodedDbCaCert, updateVcRequest.encodedDbCaCert)) {
      return false;
    }
    if (!Objects.equals(this.encodedDbCaCertApi, updateVcRequest.encodedDbCaCertApi)) {
      return false;
    }
    if (!Objects.equals(this.encodedDbCaCertAirflow, updateVcRequest.encodedDbCaCertAirflow)) {
      return false;
    }
    if (!Objects.equals(this.encodedDbCaCertAirflowAPI, updateVcRequest.encodedDbCaCertAirflowAPI)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, vcId, aclUsers, fullAccessUsers, fullAccessGroups, viewOnlyUsers, viewOnlyGroups, sparkConfigs, discardSparkConfigs, enableComputeOverride, encodedDbCaCert, encodedDbCaCertApi, encodedDbCaCertAirflow, encodedDbCaCertAirflowAPI);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVcRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    vcId: ").append(toIndentedString(vcId)).append("\n");
    sb.append("    aclUsers: ").append(toIndentedString(aclUsers)).append("\n");
    sb.append("    fullAccessUsers: ").append(toIndentedString(fullAccessUsers)).append("\n");
    sb.append("    fullAccessGroups: ").append(toIndentedString(fullAccessGroups)).append("\n");
    sb.append("    viewOnlyUsers: ").append(toIndentedString(viewOnlyUsers)).append("\n");
    sb.append("    viewOnlyGroups: ").append(toIndentedString(viewOnlyGroups)).append("\n");
    sb.append("    sparkConfigs: ").append(toIndentedString(sparkConfigs)).append("\n");
    sb.append("    discardSparkConfigs: ").append(toIndentedString(discardSparkConfigs)).append("\n");
    sb.append("    enableComputeOverride: ").append(toIndentedString(enableComputeOverride)).append("\n");
    sb.append("    encodedDbCaCert: ").append(toIndentedString(encodedDbCaCert)).append("\n");
    sb.append("    encodedDbCaCertApi: ").append(toIndentedString(encodedDbCaCertApi)).append("\n");
    sb.append("    encodedDbCaCertAirflow: ").append(toIndentedString(encodedDbCaCertAirflow)).append("\n");
    sb.append("    encodedDbCaCertAirflowAPI: ").append(toIndentedString(encodedDbCaCertAirflowAPI)).append("\n");
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

