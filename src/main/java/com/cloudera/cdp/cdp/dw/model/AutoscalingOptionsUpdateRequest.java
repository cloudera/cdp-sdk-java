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
 * Auto-scaling configuration for a Virtual Warehouse. Provide those values only that you want to update.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-08-16T15:45:11.677-07:00")
public class AutoscalingOptionsUpdateRequest  {

  /**
   * Minimum number of available compute groups. Zero means, the minClusters will not be updated.
   **/
  private Integer minClusters = 0;

  /**
   * Maximum number of available compute groups. Zero means, the maxClusters will not be updated..
   **/
  private Integer maxClusters = 0;

  /**
   * Turn off auto suspend for Virtual Warehouse.
   **/
  private Boolean disableAutoSuspend = null;

  /**
   * Auto suspend threshold for Virtual Warehouse.
   **/
  private Integer autoSuspendTimeoutSeconds = null;

  /**
   * Set wait time before a scale event happens. Either \"hiveScaleWaitTimeSeconds\" or \"hiveDesiredFreeCapacity\" can be provided. If \"hiveScaleWaitTimeSeconds\" provided, then the \"hiveDesiredFreeCapacity\" will be explicityly set to 0.
   **/
  private Integer hiveScaleWaitTimeSeconds = null;

  /**
   * Set Desired free capacity. Either \"hiveScaleWaitTimeSeconds\" or \"hiveDesiredFreeCapacity\" can be provided.
   **/
  private Integer hiveDesiredFreeCapacity = null;

  /**
   * Scale up the scaling up threshold in seconds.
   **/
  private Integer impalaScaleUpDelaySeconds = null;

  /**
   * Scale down threshold in seconds.
   **/
  private Integer impalaScaleDownDelaySeconds = null;

  /**
   * Delay in seconds before the shutdown of coordinator event happens.
   **/
  private Integer impalaShutdownOfCoordinatorDelaySeconds = null;

  /**
   * Number of the active coordinators.
   **/
  private Integer impalaNumOfActiveCoordinators = null;

  /**
   * Getter for minClusters.
   * Minimum number of available compute groups. Zero means, the minClusters will not be updated.
   **/
  @JsonProperty("minClusters")
  public Integer getMinClusters() {
    return minClusters;
  }

  /**
   * Setter for minClusters.
   * Minimum number of available compute groups. Zero means, the minClusters will not be updated.
   **/
  public void setMinClusters(Integer minClusters) {
    this.minClusters = minClusters;
  }

  /**
   * Getter for maxClusters.
   * Maximum number of available compute groups. Zero means, the maxClusters will not be updated..
   **/
  @JsonProperty("maxClusters")
  public Integer getMaxClusters() {
    return maxClusters;
  }

  /**
   * Setter for maxClusters.
   * Maximum number of available compute groups. Zero means, the maxClusters will not be updated..
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
   * Set wait time before a scale event happens. Either \&quot;hiveScaleWaitTimeSeconds\&quot; or \&quot;hiveDesiredFreeCapacity\&quot; can be provided. If \&quot;hiveScaleWaitTimeSeconds\&quot; provided, then the \&quot;hiveDesiredFreeCapacity\&quot; will be explicityly set to 0.
   **/
  @JsonProperty("hiveScaleWaitTimeSeconds")
  public Integer getHiveScaleWaitTimeSeconds() {
    return hiveScaleWaitTimeSeconds;
  }

  /**
   * Setter for hiveScaleWaitTimeSeconds.
   * Set wait time before a scale event happens. Either \&quot;hiveScaleWaitTimeSeconds\&quot; or \&quot;hiveDesiredFreeCapacity\&quot; can be provided. If \&quot;hiveScaleWaitTimeSeconds\&quot; provided, then the \&quot;hiveDesiredFreeCapacity\&quot; will be explicityly set to 0.
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
   * Getter for impalaShutdownOfCoordinatorDelaySeconds.
   * Delay in seconds before the shutdown of coordinator event happens.
   **/
  @JsonProperty("impalaShutdownOfCoordinatorDelaySeconds")
  public Integer getImpalaShutdownOfCoordinatorDelaySeconds() {
    return impalaShutdownOfCoordinatorDelaySeconds;
  }

  /**
   * Setter for impalaShutdownOfCoordinatorDelaySeconds.
   * Delay in seconds before the shutdown of coordinator event happens.
   **/
  public void setImpalaShutdownOfCoordinatorDelaySeconds(Integer impalaShutdownOfCoordinatorDelaySeconds) {
    this.impalaShutdownOfCoordinatorDelaySeconds = impalaShutdownOfCoordinatorDelaySeconds;
  }

  /**
   * Getter for impalaNumOfActiveCoordinators.
   * Number of the active coordinators.
   **/
  @JsonProperty("impalaNumOfActiveCoordinators")
  public Integer getImpalaNumOfActiveCoordinators() {
    return impalaNumOfActiveCoordinators;
  }

  /**
   * Setter for impalaNumOfActiveCoordinators.
   * Number of the active coordinators.
   **/
  public void setImpalaNumOfActiveCoordinators(Integer impalaNumOfActiveCoordinators) {
    this.impalaNumOfActiveCoordinators = impalaNumOfActiveCoordinators;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoscalingOptionsUpdateRequest autoscalingOptionsUpdateRequest = (AutoscalingOptionsUpdateRequest) o;
    if (!Objects.equals(this.minClusters, autoscalingOptionsUpdateRequest.minClusters)) {
      return false;
    }
    if (!Objects.equals(this.maxClusters, autoscalingOptionsUpdateRequest.maxClusters)) {
      return false;
    }
    if (!Objects.equals(this.disableAutoSuspend, autoscalingOptionsUpdateRequest.disableAutoSuspend)) {
      return false;
    }
    if (!Objects.equals(this.autoSuspendTimeoutSeconds, autoscalingOptionsUpdateRequest.autoSuspendTimeoutSeconds)) {
      return false;
    }
    if (!Objects.equals(this.hiveScaleWaitTimeSeconds, autoscalingOptionsUpdateRequest.hiveScaleWaitTimeSeconds)) {
      return false;
    }
    if (!Objects.equals(this.hiveDesiredFreeCapacity, autoscalingOptionsUpdateRequest.hiveDesiredFreeCapacity)) {
      return false;
    }
    if (!Objects.equals(this.impalaScaleUpDelaySeconds, autoscalingOptionsUpdateRequest.impalaScaleUpDelaySeconds)) {
      return false;
    }
    if (!Objects.equals(this.impalaScaleDownDelaySeconds, autoscalingOptionsUpdateRequest.impalaScaleDownDelaySeconds)) {
      return false;
    }
    if (!Objects.equals(this.impalaShutdownOfCoordinatorDelaySeconds, autoscalingOptionsUpdateRequest.impalaShutdownOfCoordinatorDelaySeconds)) {
      return false;
    }
    if (!Objects.equals(this.impalaNumOfActiveCoordinators, autoscalingOptionsUpdateRequest.impalaNumOfActiveCoordinators)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(minClusters, maxClusters, disableAutoSuspend, autoSuspendTimeoutSeconds, hiveScaleWaitTimeSeconds, hiveDesiredFreeCapacity, impalaScaleUpDelaySeconds, impalaScaleDownDelaySeconds, impalaShutdownOfCoordinatorDelaySeconds, impalaNumOfActiveCoordinators);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoscalingOptionsUpdateRequest {\n");
    sb.append("    minClusters: ").append(toIndentedString(minClusters)).append("\n");
    sb.append("    maxClusters: ").append(toIndentedString(maxClusters)).append("\n");
    sb.append("    disableAutoSuspend: ").append(toIndentedString(disableAutoSuspend)).append("\n");
    sb.append("    autoSuspendTimeoutSeconds: ").append(toIndentedString(autoSuspendTimeoutSeconds)).append("\n");
    sb.append("    hiveScaleWaitTimeSeconds: ").append(toIndentedString(hiveScaleWaitTimeSeconds)).append("\n");
    sb.append("    hiveDesiredFreeCapacity: ").append(toIndentedString(hiveDesiredFreeCapacity)).append("\n");
    sb.append("    impalaScaleUpDelaySeconds: ").append(toIndentedString(impalaScaleUpDelaySeconds)).append("\n");
    sb.append("    impalaScaleDownDelaySeconds: ").append(toIndentedString(impalaScaleDownDelaySeconds)).append("\n");
    sb.append("    impalaShutdownOfCoordinatorDelaySeconds: ").append(toIndentedString(impalaShutdownOfCoordinatorDelaySeconds)).append("\n");
    sb.append("    impalaNumOfActiveCoordinators: ").append(toIndentedString(impalaNumOfActiveCoordinators)).append("\n");
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

