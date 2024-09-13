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
import com.cloudera.cdp.de.model.ChartValueOverridesResponse;
import com.cloudera.cdp.de.model.ServiceResources;
import java.util.*;

/**
 * Detailed description of a CDE service.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-09-12T15:07:45.418-07:00")
public class ServiceDescription  {

  /**
   * Name of the CDE Service.
   **/
  private String name = null;

  /**
   * Cluster Id of the CDE Service.
   **/
  private String clusterId = null;

  /**
   * CDP Environment Name.
   **/
  private String environmentName = null;

  /**
   * CRN of the environment.
   **/
  private String environmentCrn = null;

  /**
   * CDP tenant ID.
   **/
  private String tenantId = null;

  /**
   * Resources details of CDE Service.
   **/
  private ServiceResources resources = null;

  /**
   * Status of the CDE service.
   **/
  private String status = null;

  /**
   * Email address of the creator of the CDE service.
   **/
  private String creatorEmail = null;

  /**
   * CRN of the creator.
   **/
  private String creatorCrn = null;

  /**
   * Timestamp of service enabling.
   **/
  private String enablingTime = null;

  /**
   * FQDN of the CDE service.
   **/
  private String clusterFqdn = null;

  /**
   * The cloud platform where the CDE service is enabled.
   **/
  private String cloudPlatform = null;

  /**
   * The Data lake file system.
   **/
  private String dataLakeFileSystems = null;

  /**
   * Location for the log files of jobs.
   **/
  private String logLocation = null;

  /**
   * Base location for the service backup archives.
   **/
  private String backupLocation = null;

  /**
   * Endpoint of Data Lake Atlas.
   **/
  private String dataLakeAtlasUIEndpoint = null;

  /**
   * Chart overrides for the Virtual Cluster.
   **/
  private List<ChartValueOverridesResponse> chartValueOverrides = new ArrayList<ChartValueOverridesResponse>();

  /**
   * List of CIDRs that would be allowed to access kubernetes master API server.
   **/
  private String whitelistIps = null;

  /**
   * Comma-separated CIDRs that would be allowed to access the load balancer.
   **/
  private String loadbalancerAllowlist = null;

  /**
   * List of Subnet IDs of the CDP subnets used by the kubernetes worker node.
   **/
  private String subnets = null;

  /**
   * If true, the CDE service was created with fully private Azure services (AKS, MySQL, etc.).
   **/
  private Boolean privateClusterEnabled = null;

  /**
   * If true, the CDE endpoint was created in a publicly accessible subnet.
   **/
  private Boolean publicEndpointEnabled = null;

  /**
   * Network outbound type. Currently 'udr' is the only supported.
   **/
  private String networkOutboundType = null;

  /**
   * The \"true\" value indicates that the previous version of the CDE service was requested to be deployed.
   **/
  private Boolean previousVersionDeployed = null;

  /**
   * If true, diagnostic information about job and query execution is sent to Cloudera Workload Manager.
   **/
  private Boolean workloadAnalyticsEnabled = null;

  /**
   * If true, SSD would have been be used for workload filesystem.
   **/
  private Boolean ssdUsed = null;

  /**
   * Getter for name.
   * Name of the CDE Service.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name of the CDE Service.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for clusterId.
   * Cluster Id of the CDE Service.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * Cluster Id of the CDE Service.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for environmentName.
   * CDP Environment Name.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * CDP Environment Name.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for environmentCrn.
   * CRN of the environment.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * CRN of the environment.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for tenantId.
   * CDP tenant ID.
   **/
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  /**
   * Setter for tenantId.
   * CDP tenant ID.
   **/
  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  /**
   * Getter for resources.
   * Resources details of CDE Service.
   **/
  @JsonProperty("resources")
  public ServiceResources getResources() {
    return resources;
  }

  /**
   * Setter for resources.
   * Resources details of CDE Service.
   **/
  public void setResources(ServiceResources resources) {
    this.resources = resources;
  }

  /**
   * Getter for status.
   * Status of the CDE service.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * Status of the CDE service.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for creatorEmail.
   * Email address of the creator of the CDE service.
   **/
  @JsonProperty("creatorEmail")
  public String getCreatorEmail() {
    return creatorEmail;
  }

  /**
   * Setter for creatorEmail.
   * Email address of the creator of the CDE service.
   **/
  public void setCreatorEmail(String creatorEmail) {
    this.creatorEmail = creatorEmail;
  }

  /**
   * Getter for creatorCrn.
   * CRN of the creator.
   **/
  @JsonProperty("creatorCrn")
  public String getCreatorCrn() {
    return creatorCrn;
  }

  /**
   * Setter for creatorCrn.
   * CRN of the creator.
   **/
  public void setCreatorCrn(String creatorCrn) {
    this.creatorCrn = creatorCrn;
  }

  /**
   * Getter for enablingTime.
   * Timestamp of service enabling.
   **/
  @JsonProperty("enablingTime")
  public String getEnablingTime() {
    return enablingTime;
  }

  /**
   * Setter for enablingTime.
   * Timestamp of service enabling.
   **/
  public void setEnablingTime(String enablingTime) {
    this.enablingTime = enablingTime;
  }

  /**
   * Getter for clusterFqdn.
   * FQDN of the CDE service.
   **/
  @JsonProperty("clusterFqdn")
  public String getClusterFqdn() {
    return clusterFqdn;
  }

  /**
   * Setter for clusterFqdn.
   * FQDN of the CDE service.
   **/
  public void setClusterFqdn(String clusterFqdn) {
    this.clusterFqdn = clusterFqdn;
  }

  /**
   * Getter for cloudPlatform.
   * The cloud platform where the CDE service is enabled.
   **/
  @JsonProperty("cloudPlatform")
  public String getCloudPlatform() {
    return cloudPlatform;
  }

  /**
   * Setter for cloudPlatform.
   * The cloud platform where the CDE service is enabled.
   **/
  public void setCloudPlatform(String cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
  }

  /**
   * Getter for dataLakeFileSystems.
   * The Data lake file system.
   **/
  @JsonProperty("dataLakeFileSystems")
  public String getDataLakeFileSystems() {
    return dataLakeFileSystems;
  }

  /**
   * Setter for dataLakeFileSystems.
   * The Data lake file system.
   **/
  public void setDataLakeFileSystems(String dataLakeFileSystems) {
    this.dataLakeFileSystems = dataLakeFileSystems;
  }

  /**
   * Getter for logLocation.
   * Location for the log files of jobs.
   **/
  @JsonProperty("logLocation")
  public String getLogLocation() {
    return logLocation;
  }

  /**
   * Setter for logLocation.
   * Location for the log files of jobs.
   **/
  public void setLogLocation(String logLocation) {
    this.logLocation = logLocation;
  }

  /**
   * Getter for backupLocation.
   * Base location for the service backup archives.
   **/
  @JsonProperty("backupLocation")
  public String getBackupLocation() {
    return backupLocation;
  }

  /**
   * Setter for backupLocation.
   * Base location for the service backup archives.
   **/
  public void setBackupLocation(String backupLocation) {
    this.backupLocation = backupLocation;
  }

  /**
   * Getter for dataLakeAtlasUIEndpoint.
   * Endpoint of Data Lake Atlas.
   **/
  @JsonProperty("dataLakeAtlasUIEndpoint")
  public String getDataLakeAtlasUIEndpoint() {
    return dataLakeAtlasUIEndpoint;
  }

  /**
   * Setter for dataLakeAtlasUIEndpoint.
   * Endpoint of Data Lake Atlas.
   **/
  public void setDataLakeAtlasUIEndpoint(String dataLakeAtlasUIEndpoint) {
    this.dataLakeAtlasUIEndpoint = dataLakeAtlasUIEndpoint;
  }

  /**
   * Getter for chartValueOverrides.
   * Chart overrides for the Virtual Cluster.
   **/
  @JsonProperty("chartValueOverrides")
  public List<ChartValueOverridesResponse> getChartValueOverrides() {
    return chartValueOverrides;
  }

  /**
   * Setter for chartValueOverrides.
   * Chart overrides for the Virtual Cluster.
   **/
  public void setChartValueOverrides(List<ChartValueOverridesResponse> chartValueOverrides) {
    this.chartValueOverrides = chartValueOverrides;
  }

  /**
   * Getter for whitelistIps.
   * List of CIDRs that would be allowed to access kubernetes master API server.
   **/
  @JsonProperty("whitelistIps")
  public String getWhitelistIps() {
    return whitelistIps;
  }

  /**
   * Setter for whitelistIps.
   * List of CIDRs that would be allowed to access kubernetes master API server.
   **/
  public void setWhitelistIps(String whitelistIps) {
    this.whitelistIps = whitelistIps;
  }

  /**
   * Getter for loadbalancerAllowlist.
   * Comma-separated CIDRs that would be allowed to access the load balancer.
   **/
  @JsonProperty("loadbalancerAllowlist")
  public String getLoadbalancerAllowlist() {
    return loadbalancerAllowlist;
  }

  /**
   * Setter for loadbalancerAllowlist.
   * Comma-separated CIDRs that would be allowed to access the load balancer.
   **/
  public void setLoadbalancerAllowlist(String loadbalancerAllowlist) {
    this.loadbalancerAllowlist = loadbalancerAllowlist;
  }

  /**
   * Getter for subnets.
   * List of Subnet IDs of the CDP subnets used by the kubernetes worker node.
   **/
  @JsonProperty("subnets")
  public String getSubnets() {
    return subnets;
  }

  /**
   * Setter for subnets.
   * List of Subnet IDs of the CDP subnets used by the kubernetes worker node.
   **/
  public void setSubnets(String subnets) {
    this.subnets = subnets;
  }

  /**
   * Getter for privateClusterEnabled.
   * If true, the CDE service was created with fully private Azure services (AKS, MySQL, etc.).
   **/
  @JsonProperty("privateClusterEnabled")
  public Boolean getPrivateClusterEnabled() {
    return privateClusterEnabled;
  }

  /**
   * Setter for privateClusterEnabled.
   * If true, the CDE service was created with fully private Azure services (AKS, MySQL, etc.).
   **/
  public void setPrivateClusterEnabled(Boolean privateClusterEnabled) {
    this.privateClusterEnabled = privateClusterEnabled;
  }

  /**
   * Getter for publicEndpointEnabled.
   * If true, the CDE endpoint was created in a publicly accessible subnet.
   **/
  @JsonProperty("publicEndpointEnabled")
  public Boolean getPublicEndpointEnabled() {
    return publicEndpointEnabled;
  }

  /**
   * Setter for publicEndpointEnabled.
   * If true, the CDE endpoint was created in a publicly accessible subnet.
   **/
  public void setPublicEndpointEnabled(Boolean publicEndpointEnabled) {
    this.publicEndpointEnabled = publicEndpointEnabled;
  }

  /**
   * Getter for networkOutboundType.
   * Network outbound type. Currently &#39;udr&#39; is the only supported.
   **/
  @JsonProperty("networkOutboundType")
  public String getNetworkOutboundType() {
    return networkOutboundType;
  }

  /**
   * Setter for networkOutboundType.
   * Network outbound type. Currently &#39;udr&#39; is the only supported.
   **/
  public void setNetworkOutboundType(String networkOutboundType) {
    this.networkOutboundType = networkOutboundType;
  }

  /**
   * Getter for previousVersionDeployed.
   * The \&quot;true\&quot; value indicates that the previous version of the CDE service was requested to be deployed.
   **/
  @JsonProperty("previousVersionDeployed")
  public Boolean getPreviousVersionDeployed() {
    return previousVersionDeployed;
  }

  /**
   * Setter for previousVersionDeployed.
   * The \&quot;true\&quot; value indicates that the previous version of the CDE service was requested to be deployed.
   **/
  public void setPreviousVersionDeployed(Boolean previousVersionDeployed) {
    this.previousVersionDeployed = previousVersionDeployed;
  }

  /**
   * Getter for workloadAnalyticsEnabled.
   * If true, diagnostic information about job and query execution is sent to Cloudera Workload Manager.
   **/
  @JsonProperty("workloadAnalyticsEnabled")
  public Boolean getWorkloadAnalyticsEnabled() {
    return workloadAnalyticsEnabled;
  }

  /**
   * Setter for workloadAnalyticsEnabled.
   * If true, diagnostic information about job and query execution is sent to Cloudera Workload Manager.
   **/
  public void setWorkloadAnalyticsEnabled(Boolean workloadAnalyticsEnabled) {
    this.workloadAnalyticsEnabled = workloadAnalyticsEnabled;
  }

  /**
   * Getter for ssdUsed.
   * If true, SSD would have been be used for workload filesystem.
   **/
  @JsonProperty("ssdUsed")
  public Boolean getSsdUsed() {
    return ssdUsed;
  }

  /**
   * Setter for ssdUsed.
   * If true, SSD would have been be used for workload filesystem.
   **/
  public void setSsdUsed(Boolean ssdUsed) {
    this.ssdUsed = ssdUsed;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDescription serviceDescription = (ServiceDescription) o;
    if (!Objects.equals(this.name, serviceDescription.name)) {
      return false;
    }
    if (!Objects.equals(this.clusterId, serviceDescription.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, serviceDescription.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, serviceDescription.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.tenantId, serviceDescription.tenantId)) {
      return false;
    }
    if (!Objects.equals(this.resources, serviceDescription.resources)) {
      return false;
    }
    if (!Objects.equals(this.status, serviceDescription.status)) {
      return false;
    }
    if (!Objects.equals(this.creatorEmail, serviceDescription.creatorEmail)) {
      return false;
    }
    if (!Objects.equals(this.creatorCrn, serviceDescription.creatorCrn)) {
      return false;
    }
    if (!Objects.equals(this.enablingTime, serviceDescription.enablingTime)) {
      return false;
    }
    if (!Objects.equals(this.clusterFqdn, serviceDescription.clusterFqdn)) {
      return false;
    }
    if (!Objects.equals(this.cloudPlatform, serviceDescription.cloudPlatform)) {
      return false;
    }
    if (!Objects.equals(this.dataLakeFileSystems, serviceDescription.dataLakeFileSystems)) {
      return false;
    }
    if (!Objects.equals(this.logLocation, serviceDescription.logLocation)) {
      return false;
    }
    if (!Objects.equals(this.backupLocation, serviceDescription.backupLocation)) {
      return false;
    }
    if (!Objects.equals(this.dataLakeAtlasUIEndpoint, serviceDescription.dataLakeAtlasUIEndpoint)) {
      return false;
    }
    if (!Objects.equals(this.chartValueOverrides, serviceDescription.chartValueOverrides)) {
      return false;
    }
    if (!Objects.equals(this.whitelistIps, serviceDescription.whitelistIps)) {
      return false;
    }
    if (!Objects.equals(this.loadbalancerAllowlist, serviceDescription.loadbalancerAllowlist)) {
      return false;
    }
    if (!Objects.equals(this.subnets, serviceDescription.subnets)) {
      return false;
    }
    if (!Objects.equals(this.privateClusterEnabled, serviceDescription.privateClusterEnabled)) {
      return false;
    }
    if (!Objects.equals(this.publicEndpointEnabled, serviceDescription.publicEndpointEnabled)) {
      return false;
    }
    if (!Objects.equals(this.networkOutboundType, serviceDescription.networkOutboundType)) {
      return false;
    }
    if (!Objects.equals(this.previousVersionDeployed, serviceDescription.previousVersionDeployed)) {
      return false;
    }
    if (!Objects.equals(this.workloadAnalyticsEnabled, serviceDescription.workloadAnalyticsEnabled)) {
      return false;
    }
    if (!Objects.equals(this.ssdUsed, serviceDescription.ssdUsed)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, clusterId, environmentName, environmentCrn, tenantId, resources, status, creatorEmail, creatorCrn, enablingTime, clusterFqdn, cloudPlatform, dataLakeFileSystems, logLocation, backupLocation, dataLakeAtlasUIEndpoint, chartValueOverrides, whitelistIps, loadbalancerAllowlist, subnets, privateClusterEnabled, publicEndpointEnabled, networkOutboundType, previousVersionDeployed, workloadAnalyticsEnabled, ssdUsed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDescription {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creatorEmail: ").append(toIndentedString(creatorEmail)).append("\n");
    sb.append("    creatorCrn: ").append(toIndentedString(creatorCrn)).append("\n");
    sb.append("    enablingTime: ").append(toIndentedString(enablingTime)).append("\n");
    sb.append("    clusterFqdn: ").append(toIndentedString(clusterFqdn)).append("\n");
    sb.append("    cloudPlatform: ").append(toIndentedString(cloudPlatform)).append("\n");
    sb.append("    dataLakeFileSystems: ").append(toIndentedString(dataLakeFileSystems)).append("\n");
    sb.append("    logLocation: ").append(toIndentedString(logLocation)).append("\n");
    sb.append("    backupLocation: ").append(toIndentedString(backupLocation)).append("\n");
    sb.append("    dataLakeAtlasUIEndpoint: ").append(toIndentedString(dataLakeAtlasUIEndpoint)).append("\n");
    sb.append("    chartValueOverrides: ").append(toIndentedString(chartValueOverrides)).append("\n");
    sb.append("    whitelistIps: ").append(toIndentedString(whitelistIps)).append("\n");
    sb.append("    loadbalancerAllowlist: ").append(toIndentedString(loadbalancerAllowlist)).append("\n");
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
    sb.append("    privateClusterEnabled: ").append(toIndentedString(privateClusterEnabled)).append("\n");
    sb.append("    publicEndpointEnabled: ").append(toIndentedString(publicEndpointEnabled)).append("\n");
    sb.append("    networkOutboundType: ").append(toIndentedString(networkOutboundType)).append("\n");
    sb.append("    previousVersionDeployed: ").append(toIndentedString(previousVersionDeployed)).append("\n");
    sb.append("    workloadAnalyticsEnabled: ").append(toIndentedString(workloadAnalyticsEnabled)).append("\n");
    sb.append("    ssdUsed: ").append(toIndentedString(ssdUsed)).append("\n");
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

