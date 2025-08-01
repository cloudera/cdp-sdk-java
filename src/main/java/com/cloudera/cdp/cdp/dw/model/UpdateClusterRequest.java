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

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.dw.model.UpdateClusterObservabilityConfig;
import com.cloudera.cdp.dw.model.UpdateClusterRequestAwsUpdate;
import com.cloudera.cdp.dw.model.UpdateClusterRequestAzureUpdate;
import java.util.*;

/**
 * Request object for the updateCluster method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:40.786-07:00")
public class UpdateClusterRequest  {

  /**
   * The ID of the cluster to update.
   **/
  private String clusterId = null;

  /**
   * Cluster description.
   **/
  private String description = null;

  /**
   * List of IP address CIDRs to whitelist. NOTE: CDW is in process of rolling out a new feature to whitelist IP CIDR separately for Kubernetes Clusters and Loadbalancers on CDP Public Cloud. For an existing cluster, if different IP CIDR has been already applied to LoadBalancer and the Kubernetes cluster through the DWX UI, then updating the IP CIDR of such cluster is not supported from CLI. In the upcoming release, the CLI will support this feature. Please make use of UI for the same.
   **/
  private List<String> whitelistIpCIDRs = new ArrayList<String>();

  /**
   * List of IP address CIDRs to whitelist for kubernetes cluster access.
   **/
  private List<String> whitelistK8sClusterAccessIpCIDRs = new ArrayList<String>();

  /**
   * List of IP address CIDRs to whitelist for workload access.
   **/
  private List<String> whitelistWorkloadAccessIpCIDRs = new ArrayList<String>();

  /**
   * 
   **/
  private UpdateClusterRequestAwsUpdate awsUpdate = null;

  /**
   * 
   **/
  private UpdateClusterRequestAzureUpdate azureUpdate = null;

  /**
   * Cluster observability configurations to update. You can forward logs from environments activated in Cloudera Data Warehouse (CDW) to observability and monitoring systems such as Datadog, New Relic, or Splunk. Please refer to the following Cloudera documentation for more info. https://docs.cloudera.com/data-warehouse/cloud/monitoring/topics/dw-observability-log-forwarding.html
   **/
  private UpdateClusterObservabilityConfig observabilityConfig = null;

  /**
   * Getter for clusterId.
   * The ID of the cluster to update.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * The ID of the cluster to update.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for description.
   * Cluster description.
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * Cluster description.
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Getter for whitelistIpCIDRs.
   * List of IP address CIDRs to whitelist. NOTE: CDW is in process of rolling out a new feature to whitelist IP CIDR separately for Kubernetes Clusters and Loadbalancers on CDP Public Cloud. For an existing cluster, if different IP CIDR has been already applied to LoadBalancer and the Kubernetes cluster through the DWX UI, then updating the IP CIDR of such cluster is not supported from CLI. In the upcoming release, the CLI will support this feature. Please make use of UI for the same.
   **/
  @JsonProperty("whitelistIpCIDRs")
  public List<String> getWhitelistIpCIDRs() {
    return whitelistIpCIDRs;
  }

  /**
   * Setter for whitelistIpCIDRs.
   * List of IP address CIDRs to whitelist. NOTE: CDW is in process of rolling out a new feature to whitelist IP CIDR separately for Kubernetes Clusters and Loadbalancers on CDP Public Cloud. For an existing cluster, if different IP CIDR has been already applied to LoadBalancer and the Kubernetes cluster through the DWX UI, then updating the IP CIDR of such cluster is not supported from CLI. In the upcoming release, the CLI will support this feature. Please make use of UI for the same.
   **/
  public void setWhitelistIpCIDRs(List<String> whitelistIpCIDRs) {
    this.whitelistIpCIDRs = whitelistIpCIDRs;
  }

  /**
   * Getter for whitelistK8sClusterAccessIpCIDRs.
   * List of IP address CIDRs to whitelist for kubernetes cluster access.
   **/
  @JsonProperty("whitelistK8sClusterAccessIpCIDRs")
  public List<String> getWhitelistK8sClusterAccessIpCIDRs() {
    return whitelistK8sClusterAccessIpCIDRs;
  }

  /**
   * Setter for whitelistK8sClusterAccessIpCIDRs.
   * List of IP address CIDRs to whitelist for kubernetes cluster access.
   **/
  public void setWhitelistK8sClusterAccessIpCIDRs(List<String> whitelistK8sClusterAccessIpCIDRs) {
    this.whitelistK8sClusterAccessIpCIDRs = whitelistK8sClusterAccessIpCIDRs;
  }

  /**
   * Getter for whitelistWorkloadAccessIpCIDRs.
   * List of IP address CIDRs to whitelist for workload access.
   **/
  @JsonProperty("whitelistWorkloadAccessIpCIDRs")
  public List<String> getWhitelistWorkloadAccessIpCIDRs() {
    return whitelistWorkloadAccessIpCIDRs;
  }

  /**
   * Setter for whitelistWorkloadAccessIpCIDRs.
   * List of IP address CIDRs to whitelist for workload access.
   **/
  public void setWhitelistWorkloadAccessIpCIDRs(List<String> whitelistWorkloadAccessIpCIDRs) {
    this.whitelistWorkloadAccessIpCIDRs = whitelistWorkloadAccessIpCIDRs;
  }

  /**
   * Getter for awsUpdate.
   * 
   **/
  @JsonProperty("awsUpdate")
  public UpdateClusterRequestAwsUpdate getAwsUpdate() {
    return awsUpdate;
  }

  /**
   * Setter for awsUpdate.
   * 
   **/
  public void setAwsUpdate(UpdateClusterRequestAwsUpdate awsUpdate) {
    this.awsUpdate = awsUpdate;
  }

  /**
   * Getter for azureUpdate.
   * 
   **/
  @JsonProperty("azureUpdate")
  public UpdateClusterRequestAzureUpdate getAzureUpdate() {
    return azureUpdate;
  }

  /**
   * Setter for azureUpdate.
   * 
   **/
  public void setAzureUpdate(UpdateClusterRequestAzureUpdate azureUpdate) {
    this.azureUpdate = azureUpdate;
  }

  /**
   * Getter for observabilityConfig.
   * Cluster observability configurations to update. You can forward logs from environments activated in Cloudera Data Warehouse (CDW) to observability and monitoring systems such as Datadog, New Relic, or Splunk. Please refer to the following Cloudera documentation for more info. https://docs.cloudera.com/data-warehouse/cloud/monitoring/topics/dw-observability-log-forwarding.html
   **/
  @JsonProperty("observabilityConfig")
  public UpdateClusterObservabilityConfig getObservabilityConfig() {
    return observabilityConfig;
  }

  /**
   * Setter for observabilityConfig.
   * Cluster observability configurations to update. You can forward logs from environments activated in Cloudera Data Warehouse (CDW) to observability and monitoring systems such as Datadog, New Relic, or Splunk. Please refer to the following Cloudera documentation for more info. https://docs.cloudera.com/data-warehouse/cloud/monitoring/topics/dw-observability-log-forwarding.html
   **/
  public void setObservabilityConfig(UpdateClusterObservabilityConfig observabilityConfig) {
    this.observabilityConfig = observabilityConfig;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateClusterRequest updateClusterRequest = (UpdateClusterRequest) o;
    if (!Objects.equals(this.clusterId, updateClusterRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.description, updateClusterRequest.description)) {
      return false;
    }
    if (!Objects.equals(this.whitelistIpCIDRs, updateClusterRequest.whitelistIpCIDRs)) {
      return false;
    }
    if (!Objects.equals(this.whitelistK8sClusterAccessIpCIDRs, updateClusterRequest.whitelistK8sClusterAccessIpCIDRs)) {
      return false;
    }
    if (!Objects.equals(this.whitelistWorkloadAccessIpCIDRs, updateClusterRequest.whitelistWorkloadAccessIpCIDRs)) {
      return false;
    }
    if (!Objects.equals(this.awsUpdate, updateClusterRequest.awsUpdate)) {
      return false;
    }
    if (!Objects.equals(this.azureUpdate, updateClusterRequest.azureUpdate)) {
      return false;
    }
    if (!Objects.equals(this.observabilityConfig, updateClusterRequest.observabilityConfig)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, description, whitelistIpCIDRs, whitelistK8sClusterAccessIpCIDRs, whitelistWorkloadAccessIpCIDRs, awsUpdate, azureUpdate, observabilityConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateClusterRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    whitelistIpCIDRs: ").append(toIndentedString(whitelistIpCIDRs)).append("\n");
    sb.append("    whitelistK8sClusterAccessIpCIDRs: ").append(toIndentedString(whitelistK8sClusterAccessIpCIDRs)).append("\n");
    sb.append("    whitelistWorkloadAccessIpCIDRs: ").append(toIndentedString(whitelistWorkloadAccessIpCIDRs)).append("\n");
    sb.append("    awsUpdate: ").append(toIndentedString(awsUpdate)).append("\n");
    sb.append("    azureUpdate: ").append(toIndentedString(azureUpdate)).append("\n");
    sb.append("    observabilityConfig: ").append(toIndentedString(observabilityConfig)).append("\n");
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

