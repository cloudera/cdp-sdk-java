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
import com.cloudera.cdp.de.model.ChartValueOverridesRequest;
import com.cloudera.cdp.de.model.CustomAzureFilesConfigs;
import java.util.*;
import java.util.Map;

/**
 * Request object for Enable Service method.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-02-18T18:28:46.140-08:00")
public class EnableServiceRequest  {

  /**
   * Name of the CDE Service.
   **/
  private String name = null;

  /**
   * CDP environment where cde service should be enabled.
   **/
  private String env = null;

  /**
   * Instance type of the cluster for CDE Service.
   **/
  private String instanceType = null;

  /**
   * Minimum Instances for the CDE Service.
   **/
  private Integer minimumInstances = null;

  /**
   * Maximum Instances for the CDE Service.
   **/
  private Integer maximumInstances = null;

  /**
   * Minimum Spot instances for the CDE Service.
   **/
  private Integer minimumSpotInstances = null;

  /**
   * Maximum Spot Instances for the CDE Service.
   **/
  private Integer maximumSpotInstances = null;

  /**
   * Initial Instances when the service is enabled.
   **/
  private Integer initialInstances = null;

  /**
   * Initial spot Instances when the service is enabled.
   **/
  private Integer initialSpotInstances = null;

  /**
   * EBS volume size in GB.
   **/
  private Integer rootVolumeSize = null;

  /**
   * Creates a CDE endpoint (Load Balancer) in a publicly accessible subnet. If set false, the endpoint will be created in a private subnet and you will need to setup access to the endpoint manually in your cloud account.
   **/
  private Boolean enablePublicEndpoint = false;

  /**
   * If set to \"true\", the previous version of the CDE service will be deployed.
   **/
  private Boolean deployPreviousVersion = false;

  /**
   * If set false, diagnostic information about job and query execution is sent to Cloudera Workload Manager. Anonymization can be configured under Environments / Shared Resources / Telemetry. Refer documentation for more info at https://docs.cloudera.com/workload-manager/cloud/index.html.
   **/
  private Boolean enableWorkloadAnalytics = false;

  /**
   * Instance local storage (SSD) would be used for the workload filesystem (Example - spark local directory). In case the workload requires more space than what's available in the instance storage, please use an instance type with sufficient instance local storage or choose an instance type without SSD and configure the EBS volume size. Currently supported only for aws services.
   **/
  private Boolean useSsd = null;

  /**
   * Chart overrides for enabling a service.
   **/
  private List<ChartValueOverridesRequest> chartValueOverrides = new ArrayList<ChartValueOverridesRequest>();

  /**
   * List of CIDRs that would be allowed to access kubernetes master API server.
   **/
  private List<String> whitelistIps = new ArrayList<String>();

  /**
   * List of CIDRs that would be allowed to access the load balancer.
   **/
  private List<String> loadbalancerAllowlist = new ArrayList<String>();

  /**
   * User defined labels that tag all provisioned cloud resources.
   **/
  private Map<String, String> tags = new HashMap<String, String>();

  /**
   * Skip Validation check.
   **/
  private Boolean skipValidation = false;

  /**
   * Create a fully private CDE instance on either Amazon or Azure. This includes services such as Kubernetes, MySQL, etc. For Azure, this will also enable virtual network (VNet) access via private endpoints and private link.
   **/
  private Boolean enablePrivateNetwork = null;

  /**
   * List of Subnet IDs of CDP subnets to use for the kubernetes worker node.
   **/
  private List<String> subnets = new ArrayList<String>();

  /**
   * Resource ID of custom private DNS zone for Azure storage account.
   **/
  private String azureFilesharePrivateDNSZoneId = null;

  /**
   * Resource ID of the custom private DNS zone associated with the Azure database.
   **/
  private String azureDatabasePrivateDNSZoneId = null;

  /**
   * CDE uses a default public File Shares storage provisioned by AKS. Enable this option to use your own public/private File Shares.
   **/
  private CustomAzureFilesConfigs customAzureFilesConfigs = null;

  /**
   * Network outbound type. Currently 'udr' is the only supported.
   **/
  private String networkOutboundType = null;

  /**
   * Instance type of the cluster for CDE Service for the All Purpose Instance Group.
   **/
  private String allPurposeInstanceType = null;

  /**
   * Minimum Instances for the CDE Service for the All Purpose Instance Group.
   **/
  private Integer allPurposeMinimumInstances = null;

  /**
   * Maximum Instances for the CDE Service for the All Purpose Instance Group.
   **/
  private Integer allPurposeMaximumInstances = null;

  /**
   * Minimum Spot instances for the CDE Service for the All Purpose Instance Group.
   **/
  private Integer allPurposeMinimumSpotInstances = null;

  /**
   * Maximum Spot Instances for the CDE Service for the All Purpose Instance Group.
   **/
  private Integer allPurposeMaximumSpotInstances = null;

  /**
   * Initial Instances when the service is enabled for the All Purpose Instance Group.
   **/
  private Integer allPurposeInitialInstances = null;

  /**
   * Initial spot Instances when the service is enabled for the All Purpose Instance Group.
   **/
  private Integer allPurposeInitialSpotInstances = null;

  /**
   * EBS volume size in GB for the All Purpose Instance Group.
   **/
  private Integer allPurposeRootVolumeSize = null;

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
   * Getter for env.
   * CDP environment where cde service should be enabled.
   **/
  @JsonProperty("env")
  public String getEnv() {
    return env;
  }

  /**
   * Setter for env.
   * CDP environment where cde service should be enabled.
   **/
  public void setEnv(String env) {
    this.env = env;
  }

  /**
   * Getter for instanceType.
   * Instance type of the cluster for CDE Service.
   **/
  @JsonProperty("instanceType")
  public String getInstanceType() {
    return instanceType;
  }

  /**
   * Setter for instanceType.
   * Instance type of the cluster for CDE Service.
   **/
  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  /**
   * Getter for minimumInstances.
   * Minimum Instances for the CDE Service.
   **/
  @JsonProperty("minimumInstances")
  public Integer getMinimumInstances() {
    return minimumInstances;
  }

  /**
   * Setter for minimumInstances.
   * Minimum Instances for the CDE Service.
   **/
  public void setMinimumInstances(Integer minimumInstances) {
    this.minimumInstances = minimumInstances;
  }

  /**
   * Getter for maximumInstances.
   * Maximum Instances for the CDE Service.
   **/
  @JsonProperty("maximumInstances")
  public Integer getMaximumInstances() {
    return maximumInstances;
  }

  /**
   * Setter for maximumInstances.
   * Maximum Instances for the CDE Service.
   **/
  public void setMaximumInstances(Integer maximumInstances) {
    this.maximumInstances = maximumInstances;
  }

  /**
   * Getter for minimumSpotInstances.
   * Minimum Spot instances for the CDE Service.
   **/
  @JsonProperty("minimumSpotInstances")
  public Integer getMinimumSpotInstances() {
    return minimumSpotInstances;
  }

  /**
   * Setter for minimumSpotInstances.
   * Minimum Spot instances for the CDE Service.
   **/
  public void setMinimumSpotInstances(Integer minimumSpotInstances) {
    this.minimumSpotInstances = minimumSpotInstances;
  }

  /**
   * Getter for maximumSpotInstances.
   * Maximum Spot Instances for the CDE Service.
   **/
  @JsonProperty("maximumSpotInstances")
  public Integer getMaximumSpotInstances() {
    return maximumSpotInstances;
  }

  /**
   * Setter for maximumSpotInstances.
   * Maximum Spot Instances for the CDE Service.
   **/
  public void setMaximumSpotInstances(Integer maximumSpotInstances) {
    this.maximumSpotInstances = maximumSpotInstances;
  }

  /**
   * Getter for initialInstances.
   * Initial Instances when the service is enabled.
   **/
  @JsonProperty("initialInstances")
  public Integer getInitialInstances() {
    return initialInstances;
  }

  /**
   * Setter for initialInstances.
   * Initial Instances when the service is enabled.
   **/
  public void setInitialInstances(Integer initialInstances) {
    this.initialInstances = initialInstances;
  }

  /**
   * Getter for initialSpotInstances.
   * Initial spot Instances when the service is enabled.
   **/
  @JsonProperty("initialSpotInstances")
  public Integer getInitialSpotInstances() {
    return initialSpotInstances;
  }

  /**
   * Setter for initialSpotInstances.
   * Initial spot Instances when the service is enabled.
   **/
  public void setInitialSpotInstances(Integer initialSpotInstances) {
    this.initialSpotInstances = initialSpotInstances;
  }

  /**
   * Getter for rootVolumeSize.
   * EBS volume size in GB.
   **/
  @JsonProperty("rootVolumeSize")
  public Integer getRootVolumeSize() {
    return rootVolumeSize;
  }

  /**
   * Setter for rootVolumeSize.
   * EBS volume size in GB.
   **/
  public void setRootVolumeSize(Integer rootVolumeSize) {
    this.rootVolumeSize = rootVolumeSize;
  }

  /**
   * Getter for enablePublicEndpoint.
   * Creates a CDE endpoint (Load Balancer) in a publicly accessible subnet. If set false, the endpoint will be created in a private subnet and you will need to setup access to the endpoint manually in your cloud account.
   **/
  @JsonProperty("enablePublicEndpoint")
  public Boolean getEnablePublicEndpoint() {
    return enablePublicEndpoint;
  }

  /**
   * Setter for enablePublicEndpoint.
   * Creates a CDE endpoint (Load Balancer) in a publicly accessible subnet. If set false, the endpoint will be created in a private subnet and you will need to setup access to the endpoint manually in your cloud account.
   **/
  public void setEnablePublicEndpoint(Boolean enablePublicEndpoint) {
    this.enablePublicEndpoint = enablePublicEndpoint;
  }

  /**
   * Getter for deployPreviousVersion.
   * If set to \&quot;true\&quot;, the previous version of the CDE service will be deployed.
   **/
  @JsonProperty("deployPreviousVersion")
  public Boolean getDeployPreviousVersion() {
    return deployPreviousVersion;
  }

  /**
   * Setter for deployPreviousVersion.
   * If set to \&quot;true\&quot;, the previous version of the CDE service will be deployed.
   **/
  public void setDeployPreviousVersion(Boolean deployPreviousVersion) {
    this.deployPreviousVersion = deployPreviousVersion;
  }

  /**
   * Getter for enableWorkloadAnalytics.
   * If set false, diagnostic information about job and query execution is sent to Cloudera Workload Manager. Anonymization can be configured under Environments / Shared Resources / Telemetry. Refer documentation for more info at https://docs.cloudera.com/workload-manager/cloud/index.html.
   **/
  @JsonProperty("enableWorkloadAnalytics")
  public Boolean getEnableWorkloadAnalytics() {
    return enableWorkloadAnalytics;
  }

  /**
   * Setter for enableWorkloadAnalytics.
   * If set false, diagnostic information about job and query execution is sent to Cloudera Workload Manager. Anonymization can be configured under Environments / Shared Resources / Telemetry. Refer documentation for more info at https://docs.cloudera.com/workload-manager/cloud/index.html.
   **/
  public void setEnableWorkloadAnalytics(Boolean enableWorkloadAnalytics) {
    this.enableWorkloadAnalytics = enableWorkloadAnalytics;
  }

  /**
   * Getter for useSsd.
   * Instance local storage (SSD) would be used for the workload filesystem (Example - spark local directory). In case the workload requires more space than what&#39;s available in the instance storage, please use an instance type with sufficient instance local storage or choose an instance type without SSD and configure the EBS volume size. Currently supported only for aws services.
   **/
  @JsonProperty("useSsd")
  public Boolean getUseSsd() {
    return useSsd;
  }

  /**
   * Setter for useSsd.
   * Instance local storage (SSD) would be used for the workload filesystem (Example - spark local directory). In case the workload requires more space than what&#39;s available in the instance storage, please use an instance type with sufficient instance local storage or choose an instance type without SSD and configure the EBS volume size. Currently supported only for aws services.
   **/
  public void setUseSsd(Boolean useSsd) {
    this.useSsd = useSsd;
  }

  /**
   * Getter for chartValueOverrides.
   * Chart overrides for enabling a service.
   **/
  @JsonProperty("chartValueOverrides")
  public List<ChartValueOverridesRequest> getChartValueOverrides() {
    return chartValueOverrides;
  }

  /**
   * Setter for chartValueOverrides.
   * Chart overrides for enabling a service.
   **/
  public void setChartValueOverrides(List<ChartValueOverridesRequest> chartValueOverrides) {
    this.chartValueOverrides = chartValueOverrides;
  }

  /**
   * Getter for whitelistIps.
   * List of CIDRs that would be allowed to access kubernetes master API server.
   **/
  @JsonProperty("whitelistIps")
  public List<String> getWhitelistIps() {
    return whitelistIps;
  }

  /**
   * Setter for whitelistIps.
   * List of CIDRs that would be allowed to access kubernetes master API server.
   **/
  public void setWhitelistIps(List<String> whitelistIps) {
    this.whitelistIps = whitelistIps;
  }

  /**
   * Getter for loadbalancerAllowlist.
   * List of CIDRs that would be allowed to access the load balancer.
   **/
  @JsonProperty("loadbalancerAllowlist")
  public List<String> getLoadbalancerAllowlist() {
    return loadbalancerAllowlist;
  }

  /**
   * Setter for loadbalancerAllowlist.
   * List of CIDRs that would be allowed to access the load balancer.
   **/
  public void setLoadbalancerAllowlist(List<String> loadbalancerAllowlist) {
    this.loadbalancerAllowlist = loadbalancerAllowlist;
  }

  /**
   * Getter for tags.
   * User defined labels that tag all provisioned cloud resources.
   **/
  @JsonProperty("tags")
  public Map<String, String> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * User defined labels that tag all provisioned cloud resources.
   **/
  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  /**
   * Getter for skipValidation.
   * Skip Validation check.
   **/
  @JsonProperty("skipValidation")
  public Boolean getSkipValidation() {
    return skipValidation;
  }

  /**
   * Setter for skipValidation.
   * Skip Validation check.
   **/
  public void setSkipValidation(Boolean skipValidation) {
    this.skipValidation = skipValidation;
  }

  /**
   * Getter for enablePrivateNetwork.
   * Create a fully private CDE instance on either Amazon or Azure. This includes services such as Kubernetes, MySQL, etc. For Azure, this will also enable virtual network (VNet) access via private endpoints and private link.
   **/
  @JsonProperty("enablePrivateNetwork")
  public Boolean getEnablePrivateNetwork() {
    return enablePrivateNetwork;
  }

  /**
   * Setter for enablePrivateNetwork.
   * Create a fully private CDE instance on either Amazon or Azure. This includes services such as Kubernetes, MySQL, etc. For Azure, this will also enable virtual network (VNet) access via private endpoints and private link.
   **/
  public void setEnablePrivateNetwork(Boolean enablePrivateNetwork) {
    this.enablePrivateNetwork = enablePrivateNetwork;
  }

  /**
   * Getter for subnets.
   * List of Subnet IDs of CDP subnets to use for the kubernetes worker node.
   **/
  @JsonProperty("subnets")
  public List<String> getSubnets() {
    return subnets;
  }

  /**
   * Setter for subnets.
   * List of Subnet IDs of CDP subnets to use for the kubernetes worker node.
   **/
  public void setSubnets(List<String> subnets) {
    this.subnets = subnets;
  }

  /**
   * Getter for azureFilesharePrivateDNSZoneId.
   * Resource ID of custom private DNS zone for Azure storage account.
   **/
  @JsonProperty("azureFilesharePrivateDNSZoneId")
  public String getAzureFilesharePrivateDNSZoneId() {
    return azureFilesharePrivateDNSZoneId;
  }

  /**
   * Setter for azureFilesharePrivateDNSZoneId.
   * Resource ID of custom private DNS zone for Azure storage account.
   **/
  public void setAzureFilesharePrivateDNSZoneId(String azureFilesharePrivateDNSZoneId) {
    this.azureFilesharePrivateDNSZoneId = azureFilesharePrivateDNSZoneId;
  }

  /**
   * Getter for azureDatabasePrivateDNSZoneId.
   * Resource ID of the custom private DNS zone associated with the Azure database.
   **/
  @JsonProperty("azureDatabasePrivateDNSZoneId")
  public String getAzureDatabasePrivateDNSZoneId() {
    return azureDatabasePrivateDNSZoneId;
  }

  /**
   * Setter for azureDatabasePrivateDNSZoneId.
   * Resource ID of the custom private DNS zone associated with the Azure database.
   **/
  public void setAzureDatabasePrivateDNSZoneId(String azureDatabasePrivateDNSZoneId) {
    this.azureDatabasePrivateDNSZoneId = azureDatabasePrivateDNSZoneId;
  }

  /**
   * Getter for customAzureFilesConfigs.
   * CDE uses a default public File Shares storage provisioned by AKS. Enable this option to use your own public/private File Shares.
   **/
  @JsonProperty("customAzureFilesConfigs")
  public CustomAzureFilesConfigs getCustomAzureFilesConfigs() {
    return customAzureFilesConfigs;
  }

  /**
   * Setter for customAzureFilesConfigs.
   * CDE uses a default public File Shares storage provisioned by AKS. Enable this option to use your own public/private File Shares.
   **/
  public void setCustomAzureFilesConfigs(CustomAzureFilesConfigs customAzureFilesConfigs) {
    this.customAzureFilesConfigs = customAzureFilesConfigs;
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
   * Getter for allPurposeInstanceType.
   * Instance type of the cluster for CDE Service for the All Purpose Instance Group.
   **/
  @JsonProperty("allPurposeInstanceType")
  public String getAllPurposeInstanceType() {
    return allPurposeInstanceType;
  }

  /**
   * Setter for allPurposeInstanceType.
   * Instance type of the cluster for CDE Service for the All Purpose Instance Group.
   **/
  public void setAllPurposeInstanceType(String allPurposeInstanceType) {
    this.allPurposeInstanceType = allPurposeInstanceType;
  }

  /**
   * Getter for allPurposeMinimumInstances.
   * Minimum Instances for the CDE Service for the All Purpose Instance Group.
   **/
  @JsonProperty("allPurposeMinimumInstances")
  public Integer getAllPurposeMinimumInstances() {
    return allPurposeMinimumInstances;
  }

  /**
   * Setter for allPurposeMinimumInstances.
   * Minimum Instances for the CDE Service for the All Purpose Instance Group.
   **/
  public void setAllPurposeMinimumInstances(Integer allPurposeMinimumInstances) {
    this.allPurposeMinimumInstances = allPurposeMinimumInstances;
  }

  /**
   * Getter for allPurposeMaximumInstances.
   * Maximum Instances for the CDE Service for the All Purpose Instance Group.
   **/
  @JsonProperty("allPurposeMaximumInstances")
  public Integer getAllPurposeMaximumInstances() {
    return allPurposeMaximumInstances;
  }

  /**
   * Setter for allPurposeMaximumInstances.
   * Maximum Instances for the CDE Service for the All Purpose Instance Group.
   **/
  public void setAllPurposeMaximumInstances(Integer allPurposeMaximumInstances) {
    this.allPurposeMaximumInstances = allPurposeMaximumInstances;
  }

  /**
   * Getter for allPurposeMinimumSpotInstances.
   * Minimum Spot instances for the CDE Service for the All Purpose Instance Group.
   **/
  @JsonProperty("allPurposeMinimumSpotInstances")
  public Integer getAllPurposeMinimumSpotInstances() {
    return allPurposeMinimumSpotInstances;
  }

  /**
   * Setter for allPurposeMinimumSpotInstances.
   * Minimum Spot instances for the CDE Service for the All Purpose Instance Group.
   **/
  public void setAllPurposeMinimumSpotInstances(Integer allPurposeMinimumSpotInstances) {
    this.allPurposeMinimumSpotInstances = allPurposeMinimumSpotInstances;
  }

  /**
   * Getter for allPurposeMaximumSpotInstances.
   * Maximum Spot Instances for the CDE Service for the All Purpose Instance Group.
   **/
  @JsonProperty("allPurposeMaximumSpotInstances")
  public Integer getAllPurposeMaximumSpotInstances() {
    return allPurposeMaximumSpotInstances;
  }

  /**
   * Setter for allPurposeMaximumSpotInstances.
   * Maximum Spot Instances for the CDE Service for the All Purpose Instance Group.
   **/
  public void setAllPurposeMaximumSpotInstances(Integer allPurposeMaximumSpotInstances) {
    this.allPurposeMaximumSpotInstances = allPurposeMaximumSpotInstances;
  }

  /**
   * Getter for allPurposeInitialInstances.
   * Initial Instances when the service is enabled for the All Purpose Instance Group.
   **/
  @JsonProperty("allPurposeInitialInstances")
  public Integer getAllPurposeInitialInstances() {
    return allPurposeInitialInstances;
  }

  /**
   * Setter for allPurposeInitialInstances.
   * Initial Instances when the service is enabled for the All Purpose Instance Group.
   **/
  public void setAllPurposeInitialInstances(Integer allPurposeInitialInstances) {
    this.allPurposeInitialInstances = allPurposeInitialInstances;
  }

  /**
   * Getter for allPurposeInitialSpotInstances.
   * Initial spot Instances when the service is enabled for the All Purpose Instance Group.
   **/
  @JsonProperty("allPurposeInitialSpotInstances")
  public Integer getAllPurposeInitialSpotInstances() {
    return allPurposeInitialSpotInstances;
  }

  /**
   * Setter for allPurposeInitialSpotInstances.
   * Initial spot Instances when the service is enabled for the All Purpose Instance Group.
   **/
  public void setAllPurposeInitialSpotInstances(Integer allPurposeInitialSpotInstances) {
    this.allPurposeInitialSpotInstances = allPurposeInitialSpotInstances;
  }

  /**
   * Getter for allPurposeRootVolumeSize.
   * EBS volume size in GB for the All Purpose Instance Group.
   **/
  @JsonProperty("allPurposeRootVolumeSize")
  public Integer getAllPurposeRootVolumeSize() {
    return allPurposeRootVolumeSize;
  }

  /**
   * Setter for allPurposeRootVolumeSize.
   * EBS volume size in GB for the All Purpose Instance Group.
   **/
  public void setAllPurposeRootVolumeSize(Integer allPurposeRootVolumeSize) {
    this.allPurposeRootVolumeSize = allPurposeRootVolumeSize;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnableServiceRequest enableServiceRequest = (EnableServiceRequest) o;
    if (!Objects.equals(this.name, enableServiceRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.env, enableServiceRequest.env)) {
      return false;
    }
    if (!Objects.equals(this.instanceType, enableServiceRequest.instanceType)) {
      return false;
    }
    if (!Objects.equals(this.minimumInstances, enableServiceRequest.minimumInstances)) {
      return false;
    }
    if (!Objects.equals(this.maximumInstances, enableServiceRequest.maximumInstances)) {
      return false;
    }
    if (!Objects.equals(this.minimumSpotInstances, enableServiceRequest.minimumSpotInstances)) {
      return false;
    }
    if (!Objects.equals(this.maximumSpotInstances, enableServiceRequest.maximumSpotInstances)) {
      return false;
    }
    if (!Objects.equals(this.initialInstances, enableServiceRequest.initialInstances)) {
      return false;
    }
    if (!Objects.equals(this.initialSpotInstances, enableServiceRequest.initialSpotInstances)) {
      return false;
    }
    if (!Objects.equals(this.rootVolumeSize, enableServiceRequest.rootVolumeSize)) {
      return false;
    }
    if (!Objects.equals(this.enablePublicEndpoint, enableServiceRequest.enablePublicEndpoint)) {
      return false;
    }
    if (!Objects.equals(this.deployPreviousVersion, enableServiceRequest.deployPreviousVersion)) {
      return false;
    }
    if (!Objects.equals(this.enableWorkloadAnalytics, enableServiceRequest.enableWorkloadAnalytics)) {
      return false;
    }
    if (!Objects.equals(this.useSsd, enableServiceRequest.useSsd)) {
      return false;
    }
    if (!Objects.equals(this.chartValueOverrides, enableServiceRequest.chartValueOverrides)) {
      return false;
    }
    if (!Objects.equals(this.whitelistIps, enableServiceRequest.whitelistIps)) {
      return false;
    }
    if (!Objects.equals(this.loadbalancerAllowlist, enableServiceRequest.loadbalancerAllowlist)) {
      return false;
    }
    if (!Objects.equals(this.tags, enableServiceRequest.tags)) {
      return false;
    }
    if (!Objects.equals(this.skipValidation, enableServiceRequest.skipValidation)) {
      return false;
    }
    if (!Objects.equals(this.enablePrivateNetwork, enableServiceRequest.enablePrivateNetwork)) {
      return false;
    }
    if (!Objects.equals(this.subnets, enableServiceRequest.subnets)) {
      return false;
    }
    if (!Objects.equals(this.azureFilesharePrivateDNSZoneId, enableServiceRequest.azureFilesharePrivateDNSZoneId)) {
      return false;
    }
    if (!Objects.equals(this.azureDatabasePrivateDNSZoneId, enableServiceRequest.azureDatabasePrivateDNSZoneId)) {
      return false;
    }
    if (!Objects.equals(this.customAzureFilesConfigs, enableServiceRequest.customAzureFilesConfigs)) {
      return false;
    }
    if (!Objects.equals(this.networkOutboundType, enableServiceRequest.networkOutboundType)) {
      return false;
    }
    if (!Objects.equals(this.allPurposeInstanceType, enableServiceRequest.allPurposeInstanceType)) {
      return false;
    }
    if (!Objects.equals(this.allPurposeMinimumInstances, enableServiceRequest.allPurposeMinimumInstances)) {
      return false;
    }
    if (!Objects.equals(this.allPurposeMaximumInstances, enableServiceRequest.allPurposeMaximumInstances)) {
      return false;
    }
    if (!Objects.equals(this.allPurposeMinimumSpotInstances, enableServiceRequest.allPurposeMinimumSpotInstances)) {
      return false;
    }
    if (!Objects.equals(this.allPurposeMaximumSpotInstances, enableServiceRequest.allPurposeMaximumSpotInstances)) {
      return false;
    }
    if (!Objects.equals(this.allPurposeInitialInstances, enableServiceRequest.allPurposeInitialInstances)) {
      return false;
    }
    if (!Objects.equals(this.allPurposeInitialSpotInstances, enableServiceRequest.allPurposeInitialSpotInstances)) {
      return false;
    }
    if (!Objects.equals(this.allPurposeRootVolumeSize, enableServiceRequest.allPurposeRootVolumeSize)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, env, instanceType, minimumInstances, maximumInstances, minimumSpotInstances, maximumSpotInstances, initialInstances, initialSpotInstances, rootVolumeSize, enablePublicEndpoint, deployPreviousVersion, enableWorkloadAnalytics, useSsd, chartValueOverrides, whitelistIps, loadbalancerAllowlist, tags, skipValidation, enablePrivateNetwork, subnets, azureFilesharePrivateDNSZoneId, azureDatabasePrivateDNSZoneId, customAzureFilesConfigs, networkOutboundType, allPurposeInstanceType, allPurposeMinimumInstances, allPurposeMaximumInstances, allPurposeMinimumSpotInstances, allPurposeMaximumSpotInstances, allPurposeInitialInstances, allPurposeInitialSpotInstances, allPurposeRootVolumeSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnableServiceRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    minimumInstances: ").append(toIndentedString(minimumInstances)).append("\n");
    sb.append("    maximumInstances: ").append(toIndentedString(maximumInstances)).append("\n");
    sb.append("    minimumSpotInstances: ").append(toIndentedString(minimumSpotInstances)).append("\n");
    sb.append("    maximumSpotInstances: ").append(toIndentedString(maximumSpotInstances)).append("\n");
    sb.append("    initialInstances: ").append(toIndentedString(initialInstances)).append("\n");
    sb.append("    initialSpotInstances: ").append(toIndentedString(initialSpotInstances)).append("\n");
    sb.append("    rootVolumeSize: ").append(toIndentedString(rootVolumeSize)).append("\n");
    sb.append("    enablePublicEndpoint: ").append(toIndentedString(enablePublicEndpoint)).append("\n");
    sb.append("    deployPreviousVersion: ").append(toIndentedString(deployPreviousVersion)).append("\n");
    sb.append("    enableWorkloadAnalytics: ").append(toIndentedString(enableWorkloadAnalytics)).append("\n");
    sb.append("    useSsd: ").append(toIndentedString(useSsd)).append("\n");
    sb.append("    chartValueOverrides: ").append(toIndentedString(chartValueOverrides)).append("\n");
    sb.append("    whitelistIps: ").append(toIndentedString(whitelistIps)).append("\n");
    sb.append("    loadbalancerAllowlist: ").append(toIndentedString(loadbalancerAllowlist)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    skipValidation: ").append(toIndentedString(skipValidation)).append("\n");
    sb.append("    enablePrivateNetwork: ").append(toIndentedString(enablePrivateNetwork)).append("\n");
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
    sb.append("    azureFilesharePrivateDNSZoneId: ").append(toIndentedString(azureFilesharePrivateDNSZoneId)).append("\n");
    sb.append("    azureDatabasePrivateDNSZoneId: ").append(toIndentedString(azureDatabasePrivateDNSZoneId)).append("\n");
    sb.append("    customAzureFilesConfigs: ").append(toIndentedString(customAzureFilesConfigs)).append("\n");
    sb.append("    networkOutboundType: ").append(toIndentedString(networkOutboundType)).append("\n");
    sb.append("    allPurposeInstanceType: ").append(toIndentedString(allPurposeInstanceType)).append("\n");
    sb.append("    allPurposeMinimumInstances: ").append(toIndentedString(allPurposeMinimumInstances)).append("\n");
    sb.append("    allPurposeMaximumInstances: ").append(toIndentedString(allPurposeMaximumInstances)).append("\n");
    sb.append("    allPurposeMinimumSpotInstances: ").append(toIndentedString(allPurposeMinimumSpotInstances)).append("\n");
    sb.append("    allPurposeMaximumSpotInstances: ").append(toIndentedString(allPurposeMaximumSpotInstances)).append("\n");
    sb.append("    allPurposeInitialInstances: ").append(toIndentedString(allPurposeInitialInstances)).append("\n");
    sb.append("    allPurposeInitialSpotInstances: ").append(toIndentedString(allPurposeInitialSpotInstances)).append("\n");
    sb.append("    allPurposeRootVolumeSize: ").append(toIndentedString(allPurposeRootVolumeSize)).append("\n");
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

