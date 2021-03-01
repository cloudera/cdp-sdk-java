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
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-03-01T11:10:22.970-08:00")
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
   * CDE tenant ID
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
   * Endpoint of Data Lake Atlas.
   **/
  private String dataLakeAtlasUIEndpoint = null;

  /**
   * Chart overrides for the Virtual Cluster.
   **/
  private List<ChartValueOverridesResponse> chartValueOverrides = new ArrayList<ChartValueOverridesResponse>();

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
   * CDE tenant ID
   **/
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  /**
   * Setter for tenantId.
   * CDE tenant ID
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
    if (!Objects.equals(this.dataLakeAtlasUIEndpoint, serviceDescription.dataLakeAtlasUIEndpoint)) {
      return false;
    }
    if (!Objects.equals(this.chartValueOverrides, serviceDescription.chartValueOverrides)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, clusterId, environmentName, environmentCrn, tenantId, resources, status, creatorEmail, creatorCrn, enablingTime, clusterFqdn, cloudPlatform, dataLakeFileSystems, logLocation, dataLakeAtlasUIEndpoint, chartValueOverrides);
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
    sb.append("    dataLakeAtlasUIEndpoint: ").append(toIndentedString(dataLakeAtlasUIEndpoint)).append("\n");
    sb.append("    chartValueOverrides: ").append(toIndentedString(chartValueOverrides)).append("\n");
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

