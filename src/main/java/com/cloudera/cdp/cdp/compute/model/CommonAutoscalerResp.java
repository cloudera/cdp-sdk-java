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

package com.cloudera.cdp.compute.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Autoscaler response structure.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-04-17T06:49:16.183-07:00")
public class CommonAutoscalerResp  {

  /**
   * How long after scale up that scale down evaluation resumes. (Azure/AWS Support).
   **/
  private String scaleDownDelayAfterAdd = null;

  /**
   * How long after node deletion that scale down evaluation resumes, defaults to scanInterval. (Azure/AWS Support).
   **/
  private String scaleDownDelayAfterDelete = null;

  /**
   * How long after scale down failure that scale down evaluation resumes. (Azure/AWS Support).
   **/
  private String scaleDownDelayAfterFailure = null;

  /**
   * Scale down flag. (AWS Support).
   **/
  private Boolean scaleDownEnabled = null;

  /**
   * Maximum number of non empty nodes considered in one iteration as candidates for scale down with drain. Lower value means better CA responsiveness but possible slower scale down latency. Higher value can affect CA performance with big clusters (100s of nodes). Set to non positive value to turn this heuristic off - CA will not limit the number of nodes it considers. (AWS Support).
   **/
  private Integer scaleDownNonEmptyCandidatesCount = null;

  /**
   * How long a node should be unneeded before it is eligible for scale down. (Azure/AWS Support).
   **/
  private String scaleDownUnneededTime = null;

  /**
   * Node utilization level, defined as the sum of requested resources divided by capacity,. below which a node can be considered for scale down. (Azure/AWS Support).
   **/
  private Double scaleDownUtilizationThreshold = null;

  /**
   * Scan interval. (Azure/AWS Support).
   **/
  private String scanInterval = null;

  /**
   * Skip nodes with local storage flag. (AWS Support).
   **/
  private Boolean skipNodesWithLocalStorage = null;

  /**
   * Skip nodes with system pods. (AWS Support).
   **/
  private Boolean skipNodesWithSystemPods = null;

  /**
   * Maximum number of seconds CA waits for pod termination when trying to scale down a node. (Azure Support).
   **/
  private Long maxGracefulTerminationSec = null;

  /**
   * How long an unready node should be unneeded before it is eligible for scale down. (Azure Support).
   **/
  private String scaleDownUnreadyTime = null;

  /**
   * Getter for scaleDownDelayAfterAdd.
   * How long after scale up that scale down evaluation resumes. (Azure/AWS Support).
   **/
  @JsonProperty("scaleDownDelayAfterAdd")
  public String getScaleDownDelayAfterAdd() {
    return scaleDownDelayAfterAdd;
  }

  /**
   * Setter for scaleDownDelayAfterAdd.
   * How long after scale up that scale down evaluation resumes. (Azure/AWS Support).
   **/
  public void setScaleDownDelayAfterAdd(String scaleDownDelayAfterAdd) {
    this.scaleDownDelayAfterAdd = scaleDownDelayAfterAdd;
  }

  /**
   * Getter for scaleDownDelayAfterDelete.
   * How long after node deletion that scale down evaluation resumes, defaults to scanInterval. (Azure/AWS Support).
   **/
  @JsonProperty("scaleDownDelayAfterDelete")
  public String getScaleDownDelayAfterDelete() {
    return scaleDownDelayAfterDelete;
  }

  /**
   * Setter for scaleDownDelayAfterDelete.
   * How long after node deletion that scale down evaluation resumes, defaults to scanInterval. (Azure/AWS Support).
   **/
  public void setScaleDownDelayAfterDelete(String scaleDownDelayAfterDelete) {
    this.scaleDownDelayAfterDelete = scaleDownDelayAfterDelete;
  }

  /**
   * Getter for scaleDownDelayAfterFailure.
   * How long after scale down failure that scale down evaluation resumes. (Azure/AWS Support).
   **/
  @JsonProperty("scaleDownDelayAfterFailure")
  public String getScaleDownDelayAfterFailure() {
    return scaleDownDelayAfterFailure;
  }

  /**
   * Setter for scaleDownDelayAfterFailure.
   * How long after scale down failure that scale down evaluation resumes. (Azure/AWS Support).
   **/
  public void setScaleDownDelayAfterFailure(String scaleDownDelayAfterFailure) {
    this.scaleDownDelayAfterFailure = scaleDownDelayAfterFailure;
  }

  /**
   * Getter for scaleDownEnabled.
   * Scale down flag. (AWS Support).
   **/
  @JsonProperty("scaleDownEnabled")
  public Boolean getScaleDownEnabled() {
    return scaleDownEnabled;
  }

  /**
   * Setter for scaleDownEnabled.
   * Scale down flag. (AWS Support).
   **/
  public void setScaleDownEnabled(Boolean scaleDownEnabled) {
    this.scaleDownEnabled = scaleDownEnabled;
  }

  /**
   * Getter for scaleDownNonEmptyCandidatesCount.
   * Maximum number of non empty nodes considered in one iteration as candidates for scale down with drain. Lower value means better CA responsiveness but possible slower scale down latency. Higher value can affect CA performance with big clusters (100s of nodes). Set to non positive value to turn this heuristic off - CA will not limit the number of nodes it considers. (AWS Support).
   **/
  @JsonProperty("scaleDownNonEmptyCandidatesCount")
  public Integer getScaleDownNonEmptyCandidatesCount() {
    return scaleDownNonEmptyCandidatesCount;
  }

  /**
   * Setter for scaleDownNonEmptyCandidatesCount.
   * Maximum number of non empty nodes considered in one iteration as candidates for scale down with drain. Lower value means better CA responsiveness but possible slower scale down latency. Higher value can affect CA performance with big clusters (100s of nodes). Set to non positive value to turn this heuristic off - CA will not limit the number of nodes it considers. (AWS Support).
   **/
  public void setScaleDownNonEmptyCandidatesCount(Integer scaleDownNonEmptyCandidatesCount) {
    this.scaleDownNonEmptyCandidatesCount = scaleDownNonEmptyCandidatesCount;
  }

  /**
   * Getter for scaleDownUnneededTime.
   * How long a node should be unneeded before it is eligible for scale down. (Azure/AWS Support).
   **/
  @JsonProperty("scaleDownUnneededTime")
  public String getScaleDownUnneededTime() {
    return scaleDownUnneededTime;
  }

  /**
   * Setter for scaleDownUnneededTime.
   * How long a node should be unneeded before it is eligible for scale down. (Azure/AWS Support).
   **/
  public void setScaleDownUnneededTime(String scaleDownUnneededTime) {
    this.scaleDownUnneededTime = scaleDownUnneededTime;
  }

  /**
   * Getter for scaleDownUtilizationThreshold.
   * Node utilization level, defined as the sum of requested resources divided by capacity,. below which a node can be considered for scale down. (Azure/AWS Support).
   **/
  @JsonProperty("scaleDownUtilizationThreshold")
  public Double getScaleDownUtilizationThreshold() {
    return scaleDownUtilizationThreshold;
  }

  /**
   * Setter for scaleDownUtilizationThreshold.
   * Node utilization level, defined as the sum of requested resources divided by capacity,. below which a node can be considered for scale down. (Azure/AWS Support).
   **/
  public void setScaleDownUtilizationThreshold(Double scaleDownUtilizationThreshold) {
    this.scaleDownUtilizationThreshold = scaleDownUtilizationThreshold;
  }

  /**
   * Getter for scanInterval.
   * Scan interval. (Azure/AWS Support).
   **/
  @JsonProperty("scanInterval")
  public String getScanInterval() {
    return scanInterval;
  }

  /**
   * Setter for scanInterval.
   * Scan interval. (Azure/AWS Support).
   **/
  public void setScanInterval(String scanInterval) {
    this.scanInterval = scanInterval;
  }

  /**
   * Getter for skipNodesWithLocalStorage.
   * Skip nodes with local storage flag. (AWS Support).
   **/
  @JsonProperty("skipNodesWithLocalStorage")
  public Boolean getSkipNodesWithLocalStorage() {
    return skipNodesWithLocalStorage;
  }

  /**
   * Setter for skipNodesWithLocalStorage.
   * Skip nodes with local storage flag. (AWS Support).
   **/
  public void setSkipNodesWithLocalStorage(Boolean skipNodesWithLocalStorage) {
    this.skipNodesWithLocalStorage = skipNodesWithLocalStorage;
  }

  /**
   * Getter for skipNodesWithSystemPods.
   * Skip nodes with system pods. (AWS Support).
   **/
  @JsonProperty("skipNodesWithSystemPods")
  public Boolean getSkipNodesWithSystemPods() {
    return skipNodesWithSystemPods;
  }

  /**
   * Setter for skipNodesWithSystemPods.
   * Skip nodes with system pods. (AWS Support).
   **/
  public void setSkipNodesWithSystemPods(Boolean skipNodesWithSystemPods) {
    this.skipNodesWithSystemPods = skipNodesWithSystemPods;
  }

  /**
   * Getter for maxGracefulTerminationSec.
   * Maximum number of seconds CA waits for pod termination when trying to scale down a node. (Azure Support).
   **/
  @JsonProperty("maxGracefulTerminationSec")
  public Long getMaxGracefulTerminationSec() {
    return maxGracefulTerminationSec;
  }

  /**
   * Setter for maxGracefulTerminationSec.
   * Maximum number of seconds CA waits for pod termination when trying to scale down a node. (Azure Support).
   **/
  public void setMaxGracefulTerminationSec(Long maxGracefulTerminationSec) {
    this.maxGracefulTerminationSec = maxGracefulTerminationSec;
  }

  /**
   * Getter for scaleDownUnreadyTime.
   * How long an unready node should be unneeded before it is eligible for scale down. (Azure Support).
   **/
  @JsonProperty("scaleDownUnreadyTime")
  public String getScaleDownUnreadyTime() {
    return scaleDownUnreadyTime;
  }

  /**
   * Setter for scaleDownUnreadyTime.
   * How long an unready node should be unneeded before it is eligible for scale down. (Azure Support).
   **/
  public void setScaleDownUnreadyTime(String scaleDownUnreadyTime) {
    this.scaleDownUnreadyTime = scaleDownUnreadyTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonAutoscalerResp commonAutoscalerResp = (CommonAutoscalerResp) o;
    if (!Objects.equals(this.scaleDownDelayAfterAdd, commonAutoscalerResp.scaleDownDelayAfterAdd)) {
      return false;
    }
    if (!Objects.equals(this.scaleDownDelayAfterDelete, commonAutoscalerResp.scaleDownDelayAfterDelete)) {
      return false;
    }
    if (!Objects.equals(this.scaleDownDelayAfterFailure, commonAutoscalerResp.scaleDownDelayAfterFailure)) {
      return false;
    }
    if (!Objects.equals(this.scaleDownEnabled, commonAutoscalerResp.scaleDownEnabled)) {
      return false;
    }
    if (!Objects.equals(this.scaleDownNonEmptyCandidatesCount, commonAutoscalerResp.scaleDownNonEmptyCandidatesCount)) {
      return false;
    }
    if (!Objects.equals(this.scaleDownUnneededTime, commonAutoscalerResp.scaleDownUnneededTime)) {
      return false;
    }
    if (!Objects.equals(this.scaleDownUtilizationThreshold, commonAutoscalerResp.scaleDownUtilizationThreshold)) {
      return false;
    }
    if (!Objects.equals(this.scanInterval, commonAutoscalerResp.scanInterval)) {
      return false;
    }
    if (!Objects.equals(this.skipNodesWithLocalStorage, commonAutoscalerResp.skipNodesWithLocalStorage)) {
      return false;
    }
    if (!Objects.equals(this.skipNodesWithSystemPods, commonAutoscalerResp.skipNodesWithSystemPods)) {
      return false;
    }
    if (!Objects.equals(this.maxGracefulTerminationSec, commonAutoscalerResp.maxGracefulTerminationSec)) {
      return false;
    }
    if (!Objects.equals(this.scaleDownUnreadyTime, commonAutoscalerResp.scaleDownUnreadyTime)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(scaleDownDelayAfterAdd, scaleDownDelayAfterDelete, scaleDownDelayAfterFailure, scaleDownEnabled, scaleDownNonEmptyCandidatesCount, scaleDownUnneededTime, scaleDownUtilizationThreshold, scanInterval, skipNodesWithLocalStorage, skipNodesWithSystemPods, maxGracefulTerminationSec, scaleDownUnreadyTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonAutoscalerResp {\n");
    sb.append("    scaleDownDelayAfterAdd: ").append(toIndentedString(scaleDownDelayAfterAdd)).append("\n");
    sb.append("    scaleDownDelayAfterDelete: ").append(toIndentedString(scaleDownDelayAfterDelete)).append("\n");
    sb.append("    scaleDownDelayAfterFailure: ").append(toIndentedString(scaleDownDelayAfterFailure)).append("\n");
    sb.append("    scaleDownEnabled: ").append(toIndentedString(scaleDownEnabled)).append("\n");
    sb.append("    scaleDownNonEmptyCandidatesCount: ").append(toIndentedString(scaleDownNonEmptyCandidatesCount)).append("\n");
    sb.append("    scaleDownUnneededTime: ").append(toIndentedString(scaleDownUnneededTime)).append("\n");
    sb.append("    scaleDownUtilizationThreshold: ").append(toIndentedString(scaleDownUtilizationThreshold)).append("\n");
    sb.append("    scanInterval: ").append(toIndentedString(scanInterval)).append("\n");
    sb.append("    skipNodesWithLocalStorage: ").append(toIndentedString(skipNodesWithLocalStorage)).append("\n");
    sb.append("    skipNodesWithSystemPods: ").append(toIndentedString(skipNodesWithSystemPods)).append("\n");
    sb.append("    maxGracefulTerminationSec: ").append(toIndentedString(maxGracefulTerminationSec)).append("\n");
    sb.append("    scaleDownUnreadyTime: ").append(toIndentedString(scaleDownUnreadyTime)).append("\n");
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

