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
 * Auto-scaling configuration for a Virtual Warehouse.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-09-03T11:22:07.520-07:00")
public class AutoscalingOptionsResponse extends CdpResponse {

  /**
   * Minimum number of available compute groups.
   **/
  private Integer minClusters = null;

  /**
   * Maximum number of available compute groups.
   **/
  private Integer maxClusters = null;

  /**
   * Turn off auto suspend for Virtual Warehouse.
   **/
  private Boolean disableAutoSuspend = null;

  /**
   * Auto suspend threshold for Virtual Warehouse.
   **/
  private Integer autoSuspendTimeoutSeconds = null;

  /**
   * DEPRECATED in favor of the top level enableUnifiedAnalytics flag. Whether the Unified Analytics is enabled.
   **/
  private Boolean enableUnifiedAnalytics = null;

  /**
   * Wait time before a scale event happens.
   **/
  private Integer hiveScaleWaitTimeSeconds = null;

  /**
   * Desired free capacity.
   **/
  private Integer hiveDesiredFreeCapacity = null;

  /**
   * DEPRECATED in favor of the top level impalaHASettings object. High Availability mode.
   **/
  private String impalaHighAvailabilityMode = null;

  /**
   * Scale up the scaling up threshold in seconds.
   **/
  private Integer impalaScaleUpDelaySeconds = null;

  /**
   * Scale down threshold in seconds.
   **/
  private Integer impalaScaleDownDelaySeconds = null;

  /**
   * DEPRECATED in favor of the top level impalaHASettings object. Whether a shutdown of the coordinator is enabled.
   **/
  private Boolean impalaEnableShutdownOfCoordinator = null;

  /**
   * DEPRECATED in favor of the top level impalaHASettings object. Number of the active coordinators.
   **/
  private Integer impalaNumOfActiveCoordinators = null;

  /**
   * DEPRECATED in favor of the top level impalaHASettings object. Delay in seconds before the shutdown of coordinator event happens.
   **/
  private Integer impalaShutdownOfCoordinatorDelaySeconds = null;

  /**
   * DEPRECATED in favor of the top level impalaHASettings object. Denotes whether a backup instance for Impala catalog is enabled.
   **/
  private Boolean impalaEnableCatalogHighAvailability = null;

  /**
   * Getter for minClusters.
   * Minimum number of available compute groups.
   **/
  @JsonProperty("minClusters")
  public Integer getMinClusters() {
    return minClusters;
  }

  /**
   * Setter for minClusters.
   * Minimum number of available compute groups.
   **/
  public void setMinClusters(Integer minClusters) {
    this.minClusters = minClusters;
  }

  /**
   * Getter for maxClusters.
   * Maximum number of available compute groups.
   **/
  @JsonProperty("maxClusters")
  public Integer getMaxClusters() {
    return maxClusters;
  }

  /**
   * Setter for maxClusters.
   * Maximum number of available compute groups.
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
   * Getter for enableUnifiedAnalytics.
   * DEPRECATED in favor of the top level enableUnifiedAnalytics flag. Whether the Unified Analytics is enabled.
   **/
  @Deprecated
  @JsonProperty("enableUnifiedAnalytics")
  public Boolean getEnableUnifiedAnalytics() {
    return enableUnifiedAnalytics;
  }

  /**
   * Setter for enableUnifiedAnalytics.
   * DEPRECATED in favor of the top level enableUnifiedAnalytics flag. Whether the Unified Analytics is enabled.
   **/
  @Deprecated
  public void setEnableUnifiedAnalytics(Boolean enableUnifiedAnalytics) {
    this.enableUnifiedAnalytics = enableUnifiedAnalytics;
  }

  /**
   * Getter for hiveScaleWaitTimeSeconds.
   * Wait time before a scale event happens.
   **/
  @JsonProperty("hiveScaleWaitTimeSeconds")
  public Integer getHiveScaleWaitTimeSeconds() {
    return hiveScaleWaitTimeSeconds;
  }

  /**
   * Setter for hiveScaleWaitTimeSeconds.
   * Wait time before a scale event happens.
   **/
  public void setHiveScaleWaitTimeSeconds(Integer hiveScaleWaitTimeSeconds) {
    this.hiveScaleWaitTimeSeconds = hiveScaleWaitTimeSeconds;
  }

  /**
   * Getter for hiveDesiredFreeCapacity.
   * Desired free capacity.
   **/
  @JsonProperty("hiveDesiredFreeCapacity")
  public Integer getHiveDesiredFreeCapacity() {
    return hiveDesiredFreeCapacity;
  }

  /**
   * Setter for hiveDesiredFreeCapacity.
   * Desired free capacity.
   **/
  public void setHiveDesiredFreeCapacity(Integer hiveDesiredFreeCapacity) {
    this.hiveDesiredFreeCapacity = hiveDesiredFreeCapacity;
  }

  /**
   * Getter for impalaHighAvailabilityMode.
   * DEPRECATED in favor of the top level impalaHASettings object. High Availability mode.
   **/
  @Deprecated
  @JsonProperty("impalaHighAvailabilityMode")
  public String getImpalaHighAvailabilityMode() {
    return impalaHighAvailabilityMode;
  }

  /**
   * Setter for impalaHighAvailabilityMode.
   * DEPRECATED in favor of the top level impalaHASettings object. High Availability mode.
   **/
  @Deprecated
  public void setImpalaHighAvailabilityMode(String impalaHighAvailabilityMode) {
    this.impalaHighAvailabilityMode = impalaHighAvailabilityMode;
  }

  /**
   * Getter for impalaScaleUpDelaySeconds.
   * Scale up the scaling up threshold in seconds.
   **/
  @JsonProperty("impalaScaleUpDelaySeconds")
  public Integer getImpalaScaleUpDelaySeconds() {
    return impalaScaleUpDelaySeconds;
  }

  /**
   * Setter for impalaScaleUpDelaySeconds.
   * Scale up the scaling up threshold in seconds.
   **/
  public void setImpalaScaleUpDelaySeconds(Integer impalaScaleUpDelaySeconds) {
    this.impalaScaleUpDelaySeconds = impalaScaleUpDelaySeconds;
  }

  /**
   * Getter for impalaScaleDownDelaySeconds.
   * Scale down threshold in seconds.
   **/
  @JsonProperty("impalaScaleDownDelaySeconds")
  public Integer getImpalaScaleDownDelaySeconds() {
    return impalaScaleDownDelaySeconds;
  }

  /**
   * Setter for impalaScaleDownDelaySeconds.
   * Scale down threshold in seconds.
   **/
  public void setImpalaScaleDownDelaySeconds(Integer impalaScaleDownDelaySeconds) {
    this.impalaScaleDownDelaySeconds = impalaScaleDownDelaySeconds;
  }

  /**
   * Getter for impalaEnableShutdownOfCoordinator.
   * DEPRECATED in favor of the top level impalaHASettings object. Whether a shutdown of the coordinator is enabled.
   **/
  @Deprecated
  @JsonProperty("impalaEnableShutdownOfCoordinator")
  public Boolean getImpalaEnableShutdownOfCoordinator() {
    return impalaEnableShutdownOfCoordinator;
  }

  /**
   * Setter for impalaEnableShutdownOfCoordinator.
   * DEPRECATED in favor of the top level impalaHASettings object. Whether a shutdown of the coordinator is enabled.
   **/
  @Deprecated
  public void setImpalaEnableShutdownOfCoordinator(Boolean impalaEnableShutdownOfCoordinator) {
    this.impalaEnableShutdownOfCoordinator = impalaEnableShutdownOfCoordinator;
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
   * Getter for impalaEnableCatalogHighAvailability.
   * DEPRECATED in favor of the top level impalaHASettings object. Denotes whether a backup instance for Impala catalog is enabled.
   **/
  @Deprecated
  @JsonProperty("impalaEnableCatalogHighAvailability")
  public Boolean getImpalaEnableCatalogHighAvailability() {
    return impalaEnableCatalogHighAvailability;
  }

  /**
   * Setter for impalaEnableCatalogHighAvailability.
   * DEPRECATED in favor of the top level impalaHASettings object. Denotes whether a backup instance for Impala catalog is enabled.
   **/
  @Deprecated
  public void setImpalaEnableCatalogHighAvailability(Boolean impalaEnableCatalogHighAvailability) {
    this.impalaEnableCatalogHighAvailability = impalaEnableCatalogHighAvailability;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoscalingOptionsResponse autoscalingOptionsResponse = (AutoscalingOptionsResponse) o;
    if (!Objects.equals(this.minClusters, autoscalingOptionsResponse.minClusters)) {
      return false;
    }
    if (!Objects.equals(this.maxClusters, autoscalingOptionsResponse.maxClusters)) {
      return false;
    }
    if (!Objects.equals(this.disableAutoSuspend, autoscalingOptionsResponse.disableAutoSuspend)) {
      return false;
    }
    if (!Objects.equals(this.autoSuspendTimeoutSeconds, autoscalingOptionsResponse.autoSuspendTimeoutSeconds)) {
      return false;
    }
    if (!Objects.equals(this.enableUnifiedAnalytics, autoscalingOptionsResponse.enableUnifiedAnalytics)) {
      return false;
    }
    if (!Objects.equals(this.hiveScaleWaitTimeSeconds, autoscalingOptionsResponse.hiveScaleWaitTimeSeconds)) {
      return false;
    }
    if (!Objects.equals(this.hiveDesiredFreeCapacity, autoscalingOptionsResponse.hiveDesiredFreeCapacity)) {
      return false;
    }
    if (!Objects.equals(this.impalaHighAvailabilityMode, autoscalingOptionsResponse.impalaHighAvailabilityMode)) {
      return false;
    }
    if (!Objects.equals(this.impalaScaleUpDelaySeconds, autoscalingOptionsResponse.impalaScaleUpDelaySeconds)) {
      return false;
    }
    if (!Objects.equals(this.impalaScaleDownDelaySeconds, autoscalingOptionsResponse.impalaScaleDownDelaySeconds)) {
      return false;
    }
    if (!Objects.equals(this.impalaEnableShutdownOfCoordinator, autoscalingOptionsResponse.impalaEnableShutdownOfCoordinator)) {
      return false;
    }
    if (!Objects.equals(this.impalaNumOfActiveCoordinators, autoscalingOptionsResponse.impalaNumOfActiveCoordinators)) {
      return false;
    }
    if (!Objects.equals(this.impalaShutdownOfCoordinatorDelaySeconds, autoscalingOptionsResponse.impalaShutdownOfCoordinatorDelaySeconds)) {
      return false;
    }
    if (!Objects.equals(this.impalaEnableCatalogHighAvailability, autoscalingOptionsResponse.impalaEnableCatalogHighAvailability)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(minClusters, maxClusters, disableAutoSuspend, autoSuspendTimeoutSeconds, enableUnifiedAnalytics, hiveScaleWaitTimeSeconds, hiveDesiredFreeCapacity, impalaHighAvailabilityMode, impalaScaleUpDelaySeconds, impalaScaleDownDelaySeconds, impalaEnableShutdownOfCoordinator, impalaNumOfActiveCoordinators, impalaShutdownOfCoordinatorDelaySeconds, impalaEnableCatalogHighAvailability, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoscalingOptionsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    minClusters: ").append(toIndentedString(minClusters)).append("\n");
    sb.append("    maxClusters: ").append(toIndentedString(maxClusters)).append("\n");
    sb.append("    disableAutoSuspend: ").append(toIndentedString(disableAutoSuspend)).append("\n");
    sb.append("    autoSuspendTimeoutSeconds: ").append(toIndentedString(autoSuspendTimeoutSeconds)).append("\n");
    sb.append("    enableUnifiedAnalytics: ").append(toIndentedString(enableUnifiedAnalytics)).append("\n");
    sb.append("    hiveScaleWaitTimeSeconds: ").append(toIndentedString(hiveScaleWaitTimeSeconds)).append("\n");
    sb.append("    hiveDesiredFreeCapacity: ").append(toIndentedString(hiveDesiredFreeCapacity)).append("\n");
    sb.append("    impalaHighAvailabilityMode: ").append(toIndentedString(impalaHighAvailabilityMode)).append("\n");
    sb.append("    impalaScaleUpDelaySeconds: ").append(toIndentedString(impalaScaleUpDelaySeconds)).append("\n");
    sb.append("    impalaScaleDownDelaySeconds: ").append(toIndentedString(impalaScaleDownDelaySeconds)).append("\n");
    sb.append("    impalaEnableShutdownOfCoordinator: ").append(toIndentedString(impalaEnableShutdownOfCoordinator)).append("\n");
    sb.append("    impalaNumOfActiveCoordinators: ").append(toIndentedString(impalaNumOfActiveCoordinators)).append("\n");
    sb.append("    impalaShutdownOfCoordinatorDelaySeconds: ").append(toIndentedString(impalaShutdownOfCoordinatorDelaySeconds)).append("\n");
    sb.append("    impalaEnableCatalogHighAvailability: ").append(toIndentedString(impalaEnableCatalogHighAvailability)).append("\n");
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

