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
import com.cloudera.cdp.de.model.SmtpConfigRequest;
import java.util.*;

/**
 * Request object for CreateVc method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-01-05T09:16:32.026-08:00")
public class CreateVcRequest  {

  /**
   * Name of the virtual cluster.
   **/
  private String name = null;

  /**
   * Cluster id of the CDE service where virtual cluster has to be created.
   **/
  private String clusterId = null;

  /**
   * Cpu requests for autoscaling.
   **/
  private String cpuRequests = null;

  /**
   * Memory requests for autoscaling - eg. 30Gi.
   **/
  private String memoryRequests = null;

  /**
   * Chart overrides for creating a virtual cluster.
   **/
  private List<ChartValueOverridesRequest> chartValueOverrides = new ArrayList<ChartValueOverridesRequest>();

  /**
   * SMTP Configurations for Airflow Email Alerts.
   **/
  private SmtpConfigRequest smtpConfigs = null;

  /**
   * Used to describe where the Driver and the Executors would run. By default the Driver would run on on-demand instances and the Executors on spot instances. Setting it to ALL will run both the Driver and the Executors on spot instances whereas setting it to NONE should run both the Driver and the Executor on on-demand instances. Currently applicable for aws services only. Use this option only on services with spot instances enabled.
   **/
  private String runtimeSpotComponent = null;

  /**
   * Spark version for the virtual cluster. Currently supported spark versions are SPARK2(deprecated), SPARK3 and SPARK3_3. This feature is only supported in CDE-1.7.0 and beyond. SPARK3_3 is supported in CDE-1.19 and beyond.
   **/
  private String sparkVersion = null;

  /**
   * Tier of the virtual cluster. Currently supported tiers are CORE and ALLP. CORE tiered virtual cluster enables operational deployment via batch jobs. ALLP virtual clusters are all-purpose virtual clusters supporting both operational batch jobs and interactive sessions. This feature is only supported in CDE-1.19.0 and beyond.
   **/
  private String vcTier = null;

  /**
   * Comma-separated Workload usernames of CDP users to be granted access to the Virtual Cluster.
   **/
  private String aclUsers = null;

  /**
   * Getter for name.
   * Name of the virtual cluster.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name of the virtual cluster.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for clusterId.
   * Cluster id of the CDE service where virtual cluster has to be created.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * Cluster id of the CDE service where virtual cluster has to be created.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for cpuRequests.
   * Cpu requests for autoscaling.
   **/
  @JsonProperty("cpuRequests")
  public String getCpuRequests() {
    return cpuRequests;
  }

  /**
   * Setter for cpuRequests.
   * Cpu requests for autoscaling.
   **/
  public void setCpuRequests(String cpuRequests) {
    this.cpuRequests = cpuRequests;
  }

  /**
   * Getter for memoryRequests.
   * Memory requests for autoscaling - eg. 30Gi.
   **/
  @JsonProperty("memoryRequests")
  public String getMemoryRequests() {
    return memoryRequests;
  }

  /**
   * Setter for memoryRequests.
   * Memory requests for autoscaling - eg. 30Gi.
   **/
  public void setMemoryRequests(String memoryRequests) {
    this.memoryRequests = memoryRequests;
  }

  /**
   * Getter for chartValueOverrides.
   * Chart overrides for creating a virtual cluster.
   **/
  @JsonProperty("chartValueOverrides")
  public List<ChartValueOverridesRequest> getChartValueOverrides() {
    return chartValueOverrides;
  }

  /**
   * Setter for chartValueOverrides.
   * Chart overrides for creating a virtual cluster.
   **/
  public void setChartValueOverrides(List<ChartValueOverridesRequest> chartValueOverrides) {
    this.chartValueOverrides = chartValueOverrides;
  }

  /**
   * Getter for smtpConfigs.
   * SMTP Configurations for Airflow Email Alerts.
   **/
  @JsonProperty("smtpConfigs")
  public SmtpConfigRequest getSmtpConfigs() {
    return smtpConfigs;
  }

  /**
   * Setter for smtpConfigs.
   * SMTP Configurations for Airflow Email Alerts.
   **/
  public void setSmtpConfigs(SmtpConfigRequest smtpConfigs) {
    this.smtpConfigs = smtpConfigs;
  }

  /**
   * Getter for runtimeSpotComponent.
   * Used to describe where the Driver and the Executors would run. By default the Driver would run on on-demand instances and the Executors on spot instances. Setting it to ALL will run both the Driver and the Executors on spot instances whereas setting it to NONE should run both the Driver and the Executor on on-demand instances. Currently applicable for aws services only. Use this option only on services with spot instances enabled.
   **/
  @JsonProperty("runtimeSpotComponent")
  public String getRuntimeSpotComponent() {
    return runtimeSpotComponent;
  }

  /**
   * Setter for runtimeSpotComponent.
   * Used to describe where the Driver and the Executors would run. By default the Driver would run on on-demand instances and the Executors on spot instances. Setting it to ALL will run both the Driver and the Executors on spot instances whereas setting it to NONE should run both the Driver and the Executor on on-demand instances. Currently applicable for aws services only. Use this option only on services with spot instances enabled.
   **/
  public void setRuntimeSpotComponent(String runtimeSpotComponent) {
    this.runtimeSpotComponent = runtimeSpotComponent;
  }

  /**
   * Getter for sparkVersion.
   * Spark version for the virtual cluster. Currently supported spark versions are SPARK2(deprecated), SPARK3 and SPARK3_3. This feature is only supported in CDE-1.7.0 and beyond. SPARK3_3 is supported in CDE-1.19 and beyond.
   **/
  @JsonProperty("sparkVersion")
  public String getSparkVersion() {
    return sparkVersion;
  }

  /**
   * Setter for sparkVersion.
   * Spark version for the virtual cluster. Currently supported spark versions are SPARK2(deprecated), SPARK3 and SPARK3_3. This feature is only supported in CDE-1.7.0 and beyond. SPARK3_3 is supported in CDE-1.19 and beyond.
   **/
  public void setSparkVersion(String sparkVersion) {
    this.sparkVersion = sparkVersion;
  }

  /**
   * Getter for vcTier.
   * Tier of the virtual cluster. Currently supported tiers are CORE and ALLP. CORE tiered virtual cluster enables operational deployment via batch jobs. ALLP virtual clusters are all-purpose virtual clusters supporting both operational batch jobs and interactive sessions. This feature is only supported in CDE-1.19.0 and beyond.
   **/
  @JsonProperty("vcTier")
  public String getVcTier() {
    return vcTier;
  }

  /**
   * Setter for vcTier.
   * Tier of the virtual cluster. Currently supported tiers are CORE and ALLP. CORE tiered virtual cluster enables operational deployment via batch jobs. ALLP virtual clusters are all-purpose virtual clusters supporting both operational batch jobs and interactive sessions. This feature is only supported in CDE-1.19.0 and beyond.
   **/
  public void setVcTier(String vcTier) {
    this.vcTier = vcTier;
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVcRequest createVcRequest = (CreateVcRequest) o;
    if (!Objects.equals(this.name, createVcRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.clusterId, createVcRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.cpuRequests, createVcRequest.cpuRequests)) {
      return false;
    }
    if (!Objects.equals(this.memoryRequests, createVcRequest.memoryRequests)) {
      return false;
    }
    if (!Objects.equals(this.chartValueOverrides, createVcRequest.chartValueOverrides)) {
      return false;
    }
    if (!Objects.equals(this.smtpConfigs, createVcRequest.smtpConfigs)) {
      return false;
    }
    if (!Objects.equals(this.runtimeSpotComponent, createVcRequest.runtimeSpotComponent)) {
      return false;
    }
    if (!Objects.equals(this.sparkVersion, createVcRequest.sparkVersion)) {
      return false;
    }
    if (!Objects.equals(this.vcTier, createVcRequest.vcTier)) {
      return false;
    }
    if (!Objects.equals(this.aclUsers, createVcRequest.aclUsers)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, clusterId, cpuRequests, memoryRequests, chartValueOverrides, smtpConfigs, runtimeSpotComponent, sparkVersion, vcTier, aclUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVcRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    cpuRequests: ").append(toIndentedString(cpuRequests)).append("\n");
    sb.append("    memoryRequests: ").append(toIndentedString(memoryRequests)).append("\n");
    sb.append("    chartValueOverrides: ").append(toIndentedString(chartValueOverrides)).append("\n");
    sb.append("    smtpConfigs: ").append(toIndentedString(smtpConfigs)).append("\n");
    sb.append("    runtimeSpotComponent: ").append(toIndentedString(runtimeSpotComponent)).append("\n");
    sb.append("    sparkVersion: ").append(toIndentedString(sparkVersion)).append("\n");
    sb.append("    vcTier: ").append(toIndentedString(vcTier)).append("\n");
    sb.append("    aclUsers: ").append(toIndentedString(aclUsers)).append("\n");
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

