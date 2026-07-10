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
import com.cloudera.cdp.dw.model.ImpalaExecutorGroupSetsCreateRequest;

/**
 * Auto-scaling configuration for a Virtual Warehouse.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2026-06-24T07:36:47.832Z")
public class AutoscalingOptionsCreateRequest  {

  /**
   * Sets the minimum number of Executor Groups.
   **/
  private Integer minClusters = 1;

  /**
   * Sets the maximum number of Executor Groups the Virtual Warehouse can scale up to. This value defines the upper boundary for autoscaling. The total node capacity is determined by this number multiplied by the number of nodes in the selected `--t-shirt-size`. NOTE: On Azure, all IPs for the maximum node count are pre-allocated. If you use the same `--instance-type` for multiple Virtual Warehouses, they will share the same underlying nodepool and its limit is calculated as the sum of all nodes required by the corresponding Virtual Warehouses.
   **/
  private Integer maxClusters = 5;

  /**
   * Turn off auto suspend for Virtual Warehouse.
   **/
  private Boolean disableAutoSuspend = null;

  /**
   * Auto suspend threshold for Virtual Warehouse.
   **/
  private Integer autoSuspendTimeoutSeconds = null;

  /**
   * Set wait time before a scale event happens. Either \"hiveScaleWaitTimeSeconds\" or \"hiveDesiredFreeCapacity\" can be provided.
   **/
  private Integer hiveScaleWaitTimeSeconds = null;

  /**
   * Set Desired free capacity. Either \"hiveScaleWaitTimeSeconds\" or \"hiveDesiredFreeCapacity\" can be provided.
   **/
  private Integer hiveDesiredFreeCapacity = null;

  /**
   * DEPRECATED in favor of the top level impalaHASettings object. Set High Availability mode. If not provided the default will apply. This value is disregarded for Hive.
   **/
  private String impalaHighAvailabilityMode = null;

  /**
   * Scale up the scaling up threshold in seconds. If not provided defaults will apply.
   **/
  private Integer impalaScaleUpDelaySeconds = null;

  /**
   * Scale down threshold in seconds. If not provided defaults will apply.
   **/
  private Integer impalaScaleDownDelaySeconds = null;

  /**
   * DEPRECATED: in favor of the top level impalaHASettings object. Enables a shutdown of the coordinator.
   **/
  private Boolean impalaEnableShutdownOfCoordinator = null;

  /**
   * DEPRECATED in favor of the top level impalaHASettings object. Delay in seconds before the shutdown of coordinator event happens.
   **/
  private Integer impalaShutdownOfCoordinatorDelaySeconds = null;

  /**
   * DEPRECATED in favor of the top level impalaHASettings object. Number of the active coordinators.
   **/
  private Integer impalaNumOfActiveCoordinators = null;

  /**
   * DEPRECATED in favor of the top level impalaHASettings object. Enables a backup instance for Impala catalog to ensure high availability.
   **/
  private Boolean impalaEnableCatalogHighAvailability = null;

  /**
   * Configures executor group sets for workload aware autoscaling.
   **/
  private ImpalaExecutorGroupSetsCreateRequest impalaExecutorGroupSets = null;

  /**
   * Disables Auto-scaling for Trino VW.
   **/
  private Boolean trinoDisableAutoScaling = true;

  /**
   * Maximum number of worker nodes in a Trino VW.
   **/
  private Integer trinoMaxWorkerCount = 10;

  /**
   * Minimum number of worker nodes in a Trino VW.
   **/
  private Integer trinoMinWorkerCount = 1;

  /**
   * Grace period in seconds before shutting down Trino workers.
   **/
  private Integer trinoShutdownGracePeriod = 300;

  /**
   * Scale down threshold in seconds. If not provided, the defaults will apply.
   **/
  private Integer trinoScaleDownDelaySeconds = 30;

  /**
   * Scale up threshold in seconds. If not provided defaults will apply.
   **/
  private Integer trinoScaleUpDelaySeconds = 15;

  /**
   * Getter for minClusters.
   * Sets the minimum number of Executor Groups.
   **/
  @JsonProperty("minClusters")
  public Integer getMinClusters() {
    return minClusters;
  }

  /**
   * Setter for minClusters.
   * Sets the minimum number of Executor Groups.
   **/
  public void setMinClusters(Integer minClusters) {
    this.minClusters = minClusters;
  }

  /**
   * Getter for maxClusters.
   * Sets the maximum number of Executor Groups the Virtual Warehouse can scale up to. This value defines the upper boundary for autoscaling. The total node capacity is determined by this number multiplied by the number of nodes in the selected &#x60;--t-shirt-size&#x60;. NOTE: On Azure, all IPs for the maximum node count are pre-allocated. If you use the same &#x60;--instance-type&#x60; for multiple Virtual Warehouses, they will share the same underlying nodepool and its limit is calculated as the sum of all nodes required by the corresponding Virtual Warehouses.
   **/
  @JsonProperty("maxClusters")
  public Integer getMaxClusters() {
    return maxClusters;
  }

  /**
   * Setter for maxClusters.
   * Sets the maximum number of Executor Groups the Virtual Warehouse can scale up to. This value defines the upper boundary for autoscaling. The total node capacity is determined by this number multiplied by the number of nodes in the selected &#x60;--t-shirt-size&#x60;. NOTE: On Azure, all IPs for the maximum node count are pre-allocated. If you use the same &#x60;--instance-type&#x60; for multiple Virtual Warehouses, they will share the same underlying nodepool and its limit is calculated as the sum of all nodes required by the corresponding Virtual Warehouses.
   **/
  public void setMaxClusters(Integer maxClusters) {
    this.maxClusters = maxClusters;
  }

  /**
   * Getter for disableAutoSuspend.
   * Turn off auto suspend for Virtual Warehouse.
   **/
  @JsonProperty("disableAutoSuspend")
  public Boolean getDisableAutoSuspend() {
    return disableAutoSuspend;
  }

  /**
   * Setter for disableAutoSuspend.
   * Turn off auto suspend for Virtual Warehouse.
   **/
  public void setDisableAutoSuspend(Boolean disableAutoSuspend) {
    this.disableAutoSuspend = disableAutoSuspend;
  }

  /**
   * Getter for autoSuspendTimeoutSeconds.
   * Auto suspend threshold for Virtual Warehouse.
   **/
  @JsonProperty("autoSuspendTimeoutSeconds")
  public Integer getAutoSuspendTimeoutSeconds() {
    return autoSuspendTimeoutSeconds;
  }

  /**
   * Setter for autoSuspendTimeoutSeconds.
   * Auto suspend threshold for Virtual Warehouse.
   **/
  public void setAutoSuspendTimeoutSeconds(Integer autoSuspendTimeoutSeconds) {
    this.autoSuspendTimeoutSeconds = autoSuspendTimeoutSeconds;
  }

  /**
   * Getter for hiveScaleWaitTimeSeconds.
   * Set wait time before a scale event happens. Either \&quot;hiveScaleWaitTimeSeconds\&quot; or \&quot;hiveDesiredFreeCapacity\&quot; can be provided.
   **/
  @JsonProperty("hiveScaleWaitTimeSeconds")
  public Integer getHiveScaleWaitTimeSeconds() {
    return hiveScaleWaitTimeSeconds;
  }

  /**
   * Setter for hiveScaleWaitTimeSeconds.
   * Set wait time before a scale event happens. Either \&quot;hiveScaleWaitTimeSeconds\&quot; or \&quot;hiveDesiredFreeCapacity\&quot; can be provided.
   **/
  public void setHiveScaleWaitTimeSeconds(Integer hiveScaleWaitTimeSeconds) {
    this.hiveScaleWaitTimeSeconds = hiveScaleWaitTimeSeconds;
  }

  /**
   * Getter for hiveDesiredFreeCapacity.
   * Set Desired free capacity. Either \&quot;hiveScaleWaitTimeSeconds\&quot; or \&quot;hiveDesiredFreeCapacity\&quot; can be provided.
   **/
  @JsonProperty("hiveDesiredFreeCapacity")
  public Integer getHiveDesiredFreeCapacity() {
    return hiveDesiredFreeCapacity;
  }

  /**
   * Setter for hiveDesiredFreeCapacity.
   * Set Desired free capacity. Either \&quot;hiveScaleWaitTimeSeconds\&quot; or \&quot;hiveDesiredFreeCapacity\&quot; can be provided.
   **/
  public void setHiveDesiredFreeCapacity(Integer hiveDesiredFreeCapacity) {
    this.hiveDesiredFreeCapacity = hiveDesiredFreeCapacity;
  }

  /**
   * Getter for impalaHighAvailabilityMode.
   * DEPRECATED in favor of the top level impalaHASettings object. Set High Availability mode. If not provided the default will apply. This value is disregarded for Hive.
   **/
  @Deprecated
  @JsonProperty("impalaHighAvailabilityMode")
  public String getImpalaHighAvailabilityMode() {
    return impalaHighAvailabilityMode;
  }

  /**
   * Setter for impalaHighAvailabilityMode.
   * DEPRECATED in favor of the top level impalaHASettings object. Set High Availability mode. If not provided the default will apply. This value is disregarded for Hive.
   **/
  @Deprecated
  public void setImpalaHighAvailabilityMode(String impalaHighAvailabilityMode) {
    this.impalaHighAvailabilityMode = impalaHighAvailabilityMode;
  }

  /**
   * Getter for impalaScaleUpDelaySeconds.
   * Scale up the scaling up threshold in seconds. If not provided defaults will apply.
   **/
  @JsonProperty("impalaScaleUpDelaySeconds")
  public Integer getImpalaScaleUpDelaySeconds() {
    return impalaScaleUpDelaySeconds;
  }

  /**
   * Setter for impalaScaleUpDelaySeconds.
   * Scale up the scaling up threshold in seconds. If not provided defaults will apply.
   **/
  public void setImpalaScaleUpDelaySeconds(Integer impalaScaleUpDelaySeconds) {
    this.impalaScaleUpDelaySeconds = impalaScaleUpDelaySeconds;
  }

  /**
   * Getter for impalaScaleDownDelaySeconds.
   * Scale down threshold in seconds. If not provided defaults will apply.
   **/
  @JsonProperty("impalaScaleDownDelaySeconds")
  public Integer getImpalaScaleDownDelaySeconds() {
    return impalaScaleDownDelaySeconds;
  }

  /**
   * Setter for impalaScaleDownDelaySeconds.
   * Scale down threshold in seconds. If not provided defaults will apply.
   **/
  public void setImpalaScaleDownDelaySeconds(Integer impalaScaleDownDelaySeconds) {
    this.impalaScaleDownDelaySeconds = impalaScaleDownDelaySeconds;
  }

  /**
   * Getter for impalaEnableShutdownOfCoordinator.
   * DEPRECATED: in favor of the top level impalaHASettings object. Enables a shutdown of the coordinator.
   **/
  @Deprecated
  @JsonProperty("impalaEnableShutdownOfCoordinator")
  public Boolean getImpalaEnableShutdownOfCoordinator() {
    return impalaEnableShutdownOfCoordinator;
  }

  /**
   * Setter for impalaEnableShutdownOfCoordinator.
   * DEPRECATED: in favor of the top level impalaHASettings object. Enables a shutdown of the coordinator.
   **/
  @Deprecated
  public void setImpalaEnableShutdownOfCoordinator(Boolean impalaEnableShutdownOfCoordinator) {
    this.impalaEnableShutdownOfCoordinator = impalaEnableShutdownOfCoordinator;
  }

  /**
   * Getter for impalaShutdownOfCoordinatorDelaySeconds.
   * DEPRECATED in favor of the top level impalaHASettings object. Delay in seconds before the shutdown of coordinator event happens.
   **/
  @Deprecated
  @JsonProperty("impalaShutdownOfCoordinatorDelaySeconds")
  public Integer getImpalaShutdownOfCoordinatorDelaySeconds() {
    return impalaShutdownOfCoordinatorDelaySeconds;
  }

  /**
   * Setter for impalaShutdownOfCoordinatorDelaySeconds.
   * DEPRECATED in favor of the top level impalaHASettings object. Delay in seconds before the shutdown of coordinator event happens.
   **/
  @Deprecated
  public void setImpalaShutdownOfCoordinatorDelaySeconds(Integer impalaShutdownOfCoordinatorDelaySeconds) {
    this.impalaShutdownOfCoordinatorDelaySeconds = impalaShutdownOfCoordinatorDelaySeconds;
  }

  /**
   * Getter for impalaNumOfActiveCoordinators.
   * DEPRECATED in favor of the top level impalaHASettings object. Number of the active coordinators.
   **/
  @Deprecated
  @JsonProperty("impalaNumOfActiveCoordinators")
  public Integer getImpalaNumOfActiveCoordinators() {
    return impalaNumOfActiveCoordinators;
  }

  /**
   * Setter for impalaNumOfActiveCoordinators.
   * DEPRECATED in favor of the top level impalaHASettings object. Number of the active coordinators.
   **/
  @Deprecated
  public void setImpalaNumOfActiveCoordinators(Integer impalaNumOfActiveCoordinators) {
    this.impalaNumOfActiveCoordinators = impalaNumOfActiveCoordinators;
  }

  /**
   * Getter for impalaEnableCatalogHighAvailability.
   * DEPRECATED in favor of the top level impalaHASettings object. Enables a backup instance for Impala catalog to ensure high availability.
   **/
  @Deprecated
  @JsonProperty("impalaEnableCatalogHighAvailability")
  public Boolean getImpalaEnableCatalogHighAvailability() {
    return impalaEnableCatalogHighAvailability;
  }

  /**
   * Setter for impalaEnableCatalogHighAvailability.
   * DEPRECATED in favor of the top level impalaHASettings object. Enables a backup instance for Impala catalog to ensure high availability.
   **/
  @Deprecated
  public void setImpalaEnableCatalogHighAvailability(Boolean impalaEnableCatalogHighAvailability) {
    this.impalaEnableCatalogHighAvailability = impalaEnableCatalogHighAvailability;
  }

  /**
   * Getter for impalaExecutorGroupSets.
   * Configures executor group sets for workload aware autoscaling.
   **/
  @JsonProperty("impalaExecutorGroupSets")
  public ImpalaExecutorGroupSetsCreateRequest getImpalaExecutorGroupSets() {
    return impalaExecutorGroupSets;
  }

  /**
   * Setter for impalaExecutorGroupSets.
   * Configures executor group sets for workload aware autoscaling.
   **/
  public void setImpalaExecutorGroupSets(ImpalaExecutorGroupSetsCreateRequest impalaExecutorGroupSets) {
    this.impalaExecutorGroupSets = impalaExecutorGroupSets;
  }

  /**
   * Getter for trinoDisableAutoScaling.
   * Disables Auto-scaling for Trino VW.
   **/
  @JsonProperty("trinoDisableAutoScaling")
  public Boolean getTrinoDisableAutoScaling() {
    return trinoDisableAutoScaling;
  }

  /**
   * Setter for trinoDisableAutoScaling.
   * Disables Auto-scaling for Trino VW.
   **/
  public void setTrinoDisableAutoScaling(Boolean trinoDisableAutoScaling) {
    this.trinoDisableAutoScaling = trinoDisableAutoScaling;
  }

  /**
   * Getter for trinoMaxWorkerCount.
   * Maximum number of worker nodes in a Trino VW.
   **/
  @JsonProperty("trinoMaxWorkerCount")
  public Integer getTrinoMaxWorkerCount() {
    return trinoMaxWorkerCount;
  }

  /**
   * Setter for trinoMaxWorkerCount.
   * Maximum number of worker nodes in a Trino VW.
   **/
  public void setTrinoMaxWorkerCount(Integer trinoMaxWorkerCount) {
    this.trinoMaxWorkerCount = trinoMaxWorkerCount;
  }

  /**
   * Getter for trinoMinWorkerCount.
   * Minimum number of worker nodes in a Trino VW.
   **/
  @JsonProperty("trinoMinWorkerCount")
  public Integer getTrinoMinWorkerCount() {
    return trinoMinWorkerCount;
  }

  /**
   * Setter for trinoMinWorkerCount.
   * Minimum number of worker nodes in a Trino VW.
   **/
  public void setTrinoMinWorkerCount(Integer trinoMinWorkerCount) {
    this.trinoMinWorkerCount = trinoMinWorkerCount;
  }

  /**
   * Getter for trinoShutdownGracePeriod.
   * Grace period in seconds before shutting down Trino workers.
   **/
  @JsonProperty("trinoShutdownGracePeriod")
  public Integer getTrinoShutdownGracePeriod() {
    return trinoShutdownGracePeriod;
  }

  /**
   * Setter for trinoShutdownGracePeriod.
   * Grace period in seconds before shutting down Trino workers.
   **/
  public void setTrinoShutdownGracePeriod(Integer trinoShutdownGracePeriod) {
    this.trinoShutdownGracePeriod = trinoShutdownGracePeriod;
  }

  /**
   * Getter for trinoScaleDownDelaySeconds.
   * Scale down threshold in seconds. If not provided, the defaults will apply.
   **/
  @JsonProperty("trinoScaleDownDelaySeconds")
  public Integer getTrinoScaleDownDelaySeconds() {
    return trinoScaleDownDelaySeconds;
  }

  /**
   * Setter for trinoScaleDownDelaySeconds.
   * Scale down threshold in seconds. If not provided, the defaults will apply.
   **/
  public void setTrinoScaleDownDelaySeconds(Integer trinoScaleDownDelaySeconds) {
    this.trinoScaleDownDelaySeconds = trinoScaleDownDelaySeconds;
  }

  /**
   * Getter for trinoScaleUpDelaySeconds.
   * Scale up threshold in seconds. If not provided defaults will apply.
   **/
  @JsonProperty("trinoScaleUpDelaySeconds")
  public Integer getTrinoScaleUpDelaySeconds() {
    return trinoScaleUpDelaySeconds;
  }

  /**
   * Setter for trinoScaleUpDelaySeconds.
   * Scale up threshold in seconds. If not provided defaults will apply.
   **/
  public void setTrinoScaleUpDelaySeconds(Integer trinoScaleUpDelaySeconds) {
    this.trinoScaleUpDelaySeconds = trinoScaleUpDelaySeconds;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoscalingOptionsCreateRequest autoscalingOptionsCreateRequest = (AutoscalingOptionsCreateRequest) o;
    if (!Objects.equals(this.minClusters, autoscalingOptionsCreateRequest.minClusters)) {
      return false;
    }
    if (!Objects.equals(this.maxClusters, autoscalingOptionsCreateRequest.maxClusters)) {
      return false;
    }
    if (!Objects.equals(this.disableAutoSuspend, autoscalingOptionsCreateRequest.disableAutoSuspend)) {
      return false;
    }
    if (!Objects.equals(this.autoSuspendTimeoutSeconds, autoscalingOptionsCreateRequest.autoSuspendTimeoutSeconds)) {
      return false;
    }
    if (!Objects.equals(this.hiveScaleWaitTimeSeconds, autoscalingOptionsCreateRequest.hiveScaleWaitTimeSeconds)) {
      return false;
    }
    if (!Objects.equals(this.hiveDesiredFreeCapacity, autoscalingOptionsCreateRequest.hiveDesiredFreeCapacity)) {
      return false;
    }
    if (!Objects.equals(this.impalaHighAvailabilityMode, autoscalingOptionsCreateRequest.impalaHighAvailabilityMode)) {
      return false;
    }
    if (!Objects.equals(this.impalaScaleUpDelaySeconds, autoscalingOptionsCreateRequest.impalaScaleUpDelaySeconds)) {
      return false;
    }
    if (!Objects.equals(this.impalaScaleDownDelaySeconds, autoscalingOptionsCreateRequest.impalaScaleDownDelaySeconds)) {
      return false;
    }
    if (!Objects.equals(this.impalaEnableShutdownOfCoordinator, autoscalingOptionsCreateRequest.impalaEnableShutdownOfCoordinator)) {
      return false;
    }
    if (!Objects.equals(this.impalaShutdownOfCoordinatorDelaySeconds, autoscalingOptionsCreateRequest.impalaShutdownOfCoordinatorDelaySeconds)) {
      return false;
    }
    if (!Objects.equals(this.impalaNumOfActiveCoordinators, autoscalingOptionsCreateRequest.impalaNumOfActiveCoordinators)) {
      return false;
    }
    if (!Objects.equals(this.impalaEnableCatalogHighAvailability, autoscalingOptionsCreateRequest.impalaEnableCatalogHighAvailability)) {
      return false;
    }
    if (!Objects.equals(this.impalaExecutorGroupSets, autoscalingOptionsCreateRequest.impalaExecutorGroupSets)) {
      return false;
    }
    if (!Objects.equals(this.trinoDisableAutoScaling, autoscalingOptionsCreateRequest.trinoDisableAutoScaling)) {
      return false;
    }
    if (!Objects.equals(this.trinoMaxWorkerCount, autoscalingOptionsCreateRequest.trinoMaxWorkerCount)) {
      return false;
    }
    if (!Objects.equals(this.trinoMinWorkerCount, autoscalingOptionsCreateRequest.trinoMinWorkerCount)) {
      return false;
    }
    if (!Objects.equals(this.trinoShutdownGracePeriod, autoscalingOptionsCreateRequest.trinoShutdownGracePeriod)) {
      return false;
    }
    if (!Objects.equals(this.trinoScaleDownDelaySeconds, autoscalingOptionsCreateRequest.trinoScaleDownDelaySeconds)) {
      return false;
    }
    if (!Objects.equals(this.trinoScaleUpDelaySeconds, autoscalingOptionsCreateRequest.trinoScaleUpDelaySeconds)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(minClusters, maxClusters, disableAutoSuspend, autoSuspendTimeoutSeconds, hiveScaleWaitTimeSeconds, hiveDesiredFreeCapacity, impalaHighAvailabilityMode, impalaScaleUpDelaySeconds, impalaScaleDownDelaySeconds, impalaEnableShutdownOfCoordinator, impalaShutdownOfCoordinatorDelaySeconds, impalaNumOfActiveCoordinators, impalaEnableCatalogHighAvailability, impalaExecutorGroupSets, trinoDisableAutoScaling, trinoMaxWorkerCount, trinoMinWorkerCount, trinoShutdownGracePeriod, trinoScaleDownDelaySeconds, trinoScaleUpDelaySeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoscalingOptionsCreateRequest {\n");
    sb.append("    minClusters: ").append(toIndentedString(minClusters)).append("\n");
    sb.append("    maxClusters: ").append(toIndentedString(maxClusters)).append("\n");
    sb.append("    disableAutoSuspend: ").append(toIndentedString(disableAutoSuspend)).append("\n");
    sb.append("    autoSuspendTimeoutSeconds: ").append(toIndentedString(autoSuspendTimeoutSeconds)).append("\n");
    sb.append("    hiveScaleWaitTimeSeconds: ").append(toIndentedString(hiveScaleWaitTimeSeconds)).append("\n");
    sb.append("    hiveDesiredFreeCapacity: ").append(toIndentedString(hiveDesiredFreeCapacity)).append("\n");
    sb.append("    impalaHighAvailabilityMode: ").append(toIndentedString(impalaHighAvailabilityMode)).append("\n");
    sb.append("    impalaScaleUpDelaySeconds: ").append(toIndentedString(impalaScaleUpDelaySeconds)).append("\n");
    sb.append("    impalaScaleDownDelaySeconds: ").append(toIndentedString(impalaScaleDownDelaySeconds)).append("\n");
    sb.append("    impalaEnableShutdownOfCoordinator: ").append(toIndentedString(impalaEnableShutdownOfCoordinator)).append("\n");
    sb.append("    impalaShutdownOfCoordinatorDelaySeconds: ").append(toIndentedString(impalaShutdownOfCoordinatorDelaySeconds)).append("\n");
    sb.append("    impalaNumOfActiveCoordinators: ").append(toIndentedString(impalaNumOfActiveCoordinators)).append("\n");
    sb.append("    impalaEnableCatalogHighAvailability: ").append(toIndentedString(impalaEnableCatalogHighAvailability)).append("\n");
    sb.append("    impalaExecutorGroupSets: ").append(toIndentedString(impalaExecutorGroupSets)).append("\n");
    sb.append("    trinoDisableAutoScaling: ").append(toIndentedString(trinoDisableAutoScaling)).append("\n");
    sb.append("    trinoMaxWorkerCount: ").append(toIndentedString(trinoMaxWorkerCount)).append("\n");
    sb.append("    trinoMinWorkerCount: ").append(toIndentedString(trinoMinWorkerCount)).append("\n");
    sb.append("    trinoShutdownGracePeriod: ").append(toIndentedString(trinoShutdownGracePeriod)).append("\n");
    sb.append("    trinoScaleDownDelaySeconds: ").append(toIndentedString(trinoScaleDownDelaySeconds)).append("\n");
    sb.append("    trinoScaleUpDelaySeconds: ").append(toIndentedString(trinoScaleUpDelaySeconds)).append("\n");
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

