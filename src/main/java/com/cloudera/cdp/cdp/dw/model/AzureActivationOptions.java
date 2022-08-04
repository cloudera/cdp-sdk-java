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

/**
 * Options for activating an Azure environment.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-08-03T22:29:41.325-07:00")
public class AzureActivationOptions  {

  /**
   * ID of Azure subnet where the cluster should be deployed.
   **/
  private String subnetId = null;

  /**
   * Enables Azure Availability Zones for the cluster deployment.
   **/
  private Boolean enableAZ = null;

  /**
   * Whether to enable spot instances for Virtual warehouses. It cannot be updated later. If the AzureActivationOptions is not provided it defaults to false.
   **/
  private Boolean enableSpotInstances = false;

  /**
   * The generation type of the virtual machines used to create the environment.
   **/
  private String vmGenerationType = null;

  /**
   * Workspace ID for Azure log analytics.
   **/
  private String logAnalyticsWorkspaceId = null;

  /**
   * Docker bridge CIDR range for deployment.
   **/
  private String dockerBridgeCidr = null;

  /**
   * Enable user defined routing for the cluster deployment.
   **/
  private Boolean enableUDR = false;

  /**
   * Enables private SQL for the cluster deployment.
   **/
  private Boolean enablePrivateSQL = false;

  /**
   * Private DNS zone AKS resource ID.
   **/
  private String privateDNSZoneAKS = null;

  /**
   * Enable Azure Private AKS mode.
   **/
  private Boolean enablePrivateAks = false;

  /**
   * Enable uptime SLA for Kubernetes API server.
   **/
  private Boolean enableUptimeSLA = false;

  /**
   * Getter for subnetId.
   * ID of Azure subnet where the cluster should be deployed.
   **/
  @JsonProperty("subnetId")
  public String getSubnetId() {
    return subnetId;
  }

  /**
   * Setter for subnetId.
   * ID of Azure subnet where the cluster should be deployed.
   **/
  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  /**
   * Getter for enableAZ.
   * Enables Azure Availability Zones for the cluster deployment.
   **/
  @JsonProperty("enableAZ")
  public Boolean getEnableAZ() {
    return enableAZ;
  }

  /**
   * Setter for enableAZ.
   * Enables Azure Availability Zones for the cluster deployment.
   **/
  public void setEnableAZ(Boolean enableAZ) {
    this.enableAZ = enableAZ;
  }

  /**
   * Getter for enableSpotInstances.
   * Whether to enable spot instances for Virtual warehouses. It cannot be updated later. If the AzureActivationOptions is not provided it defaults to false.
   **/
  @JsonProperty("enableSpotInstances")
  public Boolean getEnableSpotInstances() {
    return enableSpotInstances;
  }

  /**
   * Setter for enableSpotInstances.
   * Whether to enable spot instances for Virtual warehouses. It cannot be updated later. If the AzureActivationOptions is not provided it defaults to false.
   **/
  public void setEnableSpotInstances(Boolean enableSpotInstances) {
    this.enableSpotInstances = enableSpotInstances;
  }

  /**
   * Getter for vmGenerationType.
   * The generation type of the virtual machines used to create the environment.
   **/
  @JsonProperty("vmGenerationType")
  public String getVmGenerationType() {
    return vmGenerationType;
  }

  /**
   * Setter for vmGenerationType.
   * The generation type of the virtual machines used to create the environment.
   **/
  public void setVmGenerationType(String vmGenerationType) {
    this.vmGenerationType = vmGenerationType;
  }

  /**
   * Getter for logAnalyticsWorkspaceId.
   * Workspace ID for Azure log analytics.
   **/
  @JsonProperty("logAnalyticsWorkspaceId")
  public String getLogAnalyticsWorkspaceId() {
    return logAnalyticsWorkspaceId;
  }

  /**
   * Setter for logAnalyticsWorkspaceId.
   * Workspace ID for Azure log analytics.
   **/
  public void setLogAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
    this.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
  }

  /**
   * Getter for dockerBridgeCidr.
   * Docker bridge CIDR range for deployment.
   **/
  @JsonProperty("dockerBridgeCidr")
  public String getDockerBridgeCidr() {
    return dockerBridgeCidr;
  }

  /**
   * Setter for dockerBridgeCidr.
   * Docker bridge CIDR range for deployment.
   **/
  public void setDockerBridgeCidr(String dockerBridgeCidr) {
    this.dockerBridgeCidr = dockerBridgeCidr;
  }

  /**
   * Getter for enableUDR.
   * Enable user defined routing for the cluster deployment.
   **/
  @JsonProperty("enableUDR")
  public Boolean getEnableUDR() {
    return enableUDR;
  }

  /**
   * Setter for enableUDR.
   * Enable user defined routing for the cluster deployment.
   **/
  public void setEnableUDR(Boolean enableUDR) {
    this.enableUDR = enableUDR;
  }

  /**
   * Getter for enablePrivateSQL.
   * Enables private SQL for the cluster deployment.
   **/
  @JsonProperty("enablePrivateSQL")
  public Boolean getEnablePrivateSQL() {
    return enablePrivateSQL;
  }

  /**
   * Setter for enablePrivateSQL.
   * Enables private SQL for the cluster deployment.
   **/
  public void setEnablePrivateSQL(Boolean enablePrivateSQL) {
    this.enablePrivateSQL = enablePrivateSQL;
  }

  /**
   * Getter for privateDNSZoneAKS.
   * Private DNS zone AKS resource ID.
   **/
  @JsonProperty("privateDNSZoneAKS")
  public String getPrivateDNSZoneAKS() {
    return privateDNSZoneAKS;
  }

  /**
   * Setter for privateDNSZoneAKS.
   * Private DNS zone AKS resource ID.
   **/
  public void setPrivateDNSZoneAKS(String privateDNSZoneAKS) {
    this.privateDNSZoneAKS = privateDNSZoneAKS;
  }

  /**
   * Getter for enablePrivateAks.
   * Enable Azure Private AKS mode.
   **/
  @JsonProperty("enablePrivateAks")
  public Boolean getEnablePrivateAks() {
    return enablePrivateAks;
  }

  /**
   * Setter for enablePrivateAks.
   * Enable Azure Private AKS mode.
   **/
  public void setEnablePrivateAks(Boolean enablePrivateAks) {
    this.enablePrivateAks = enablePrivateAks;
  }

  /**
   * Getter for enableUptimeSLA.
   * Enable uptime SLA for Kubernetes API server.
   **/
  @JsonProperty("enableUptimeSLA")
  public Boolean getEnableUptimeSLA() {
    return enableUptimeSLA;
  }

  /**
   * Setter for enableUptimeSLA.
   * Enable uptime SLA for Kubernetes API server.
   **/
  public void setEnableUptimeSLA(Boolean enableUptimeSLA) {
    this.enableUptimeSLA = enableUptimeSLA;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureActivationOptions azureActivationOptions = (AzureActivationOptions) o;
    if (!Objects.equals(this.subnetId, azureActivationOptions.subnetId)) {
      return false;
    }
    if (!Objects.equals(this.enableAZ, azureActivationOptions.enableAZ)) {
      return false;
    }
    if (!Objects.equals(this.enableSpotInstances, azureActivationOptions.enableSpotInstances)) {
      return false;
    }
    if (!Objects.equals(this.vmGenerationType, azureActivationOptions.vmGenerationType)) {
      return false;
    }
    if (!Objects.equals(this.logAnalyticsWorkspaceId, azureActivationOptions.logAnalyticsWorkspaceId)) {
      return false;
    }
    if (!Objects.equals(this.dockerBridgeCidr, azureActivationOptions.dockerBridgeCidr)) {
      return false;
    }
    if (!Objects.equals(this.enableUDR, azureActivationOptions.enableUDR)) {
      return false;
    }
    if (!Objects.equals(this.enablePrivateSQL, azureActivationOptions.enablePrivateSQL)) {
      return false;
    }
    if (!Objects.equals(this.privateDNSZoneAKS, azureActivationOptions.privateDNSZoneAKS)) {
      return false;
    }
    if (!Objects.equals(this.enablePrivateAks, azureActivationOptions.enablePrivateAks)) {
      return false;
    }
    if (!Objects.equals(this.enableUptimeSLA, azureActivationOptions.enableUptimeSLA)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnetId, enableAZ, enableSpotInstances, vmGenerationType, logAnalyticsWorkspaceId, dockerBridgeCidr, enableUDR, enablePrivateSQL, privateDNSZoneAKS, enablePrivateAks, enableUptimeSLA);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureActivationOptions {\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    enableAZ: ").append(toIndentedString(enableAZ)).append("\n");
    sb.append("    enableSpotInstances: ").append(toIndentedString(enableSpotInstances)).append("\n");
    sb.append("    vmGenerationType: ").append(toIndentedString(vmGenerationType)).append("\n");
    sb.append("    logAnalyticsWorkspaceId: ").append(toIndentedString(logAnalyticsWorkspaceId)).append("\n");
    sb.append("    dockerBridgeCidr: ").append(toIndentedString(dockerBridgeCidr)).append("\n");
    sb.append("    enableUDR: ").append(toIndentedString(enableUDR)).append("\n");
    sb.append("    enablePrivateSQL: ").append(toIndentedString(enablePrivateSQL)).append("\n");
    sb.append("    privateDNSZoneAKS: ").append(toIndentedString(privateDNSZoneAKS)).append("\n");
    sb.append("    enablePrivateAks: ").append(toIndentedString(enablePrivateAks)).append("\n");
    sb.append("    enableUptimeSLA: ").append(toIndentedString(enableUptimeSLA)).append("\n");
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

