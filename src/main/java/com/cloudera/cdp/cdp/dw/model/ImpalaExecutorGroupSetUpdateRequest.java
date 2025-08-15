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
 * Re-configure independently scaling set of uniformly sized executor groups.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-08-14T20:25:43.953-07:00")
public class ImpalaExecutorGroupSetUpdateRequest  {

  /**
   * Set number of executors per executor group.
   **/
  private Integer execGroupSize = null;

  /**
   * Set minimum number of executor groups allowed.
   **/
  private Integer minExecutorGroups = null;

  /**
   * Set maximum number of executor groups allowed.
   **/
  private Integer maxExecutorGroups = null;

  /**
   * Set auto suspend threshold. If not provided defaults will apply.
   **/
  private Integer autoSuspendTimeoutSeconds = null;

  /**
   * Turn off auto suspend. If not provided defaults will apply.
   **/
  private Boolean disableAutoSuspend = null;

  /**
   * Set scale up threshold in seconds. If not provided defaults will apply.
   **/
  private Integer triggerScaleUpDelay = null;

  /**
   * Set scale down threshold in seconds. If not provided defaults will apply.
   **/
  private Integer triggerScaleDownDelay = null;

  /**
   * Delete the executor group set.
   **/
  private Boolean deleteGroupSet = null;

  /**
   * Getter for execGroupSize.
   * Set number of executors per executor group.
   **/
  @JsonProperty("execGroupSize")
  public Integer getExecGroupSize() {
    return execGroupSize;
  }

  /**
   * Setter for execGroupSize.
   * Set number of executors per executor group.
   **/
  public void setExecGroupSize(Integer execGroupSize) {
    this.execGroupSize = execGroupSize;
  }

  /**
   * Getter for minExecutorGroups.
   * Set minimum number of executor groups allowed.
   **/
  @JsonProperty("minExecutorGroups")
  public Integer getMinExecutorGroups() {
    return minExecutorGroups;
  }

  /**
   * Setter for minExecutorGroups.
   * Set minimum number of executor groups allowed.
   **/
  public void setMinExecutorGroups(Integer minExecutorGroups) {
    this.minExecutorGroups = minExecutorGroups;
  }

  /**
   * Getter for maxExecutorGroups.
   * Set maximum number of executor groups allowed.
   **/
  @JsonProperty("maxExecutorGroups")
  public Integer getMaxExecutorGroups() {
    return maxExecutorGroups;
  }

  /**
   * Setter for maxExecutorGroups.
   * Set maximum number of executor groups allowed.
   **/
  public void setMaxExecutorGroups(Integer maxExecutorGroups) {
    this.maxExecutorGroups = maxExecutorGroups;
  }

  /**
   * Getter for autoSuspendTimeoutSeconds.
   * Set auto suspend threshold. If not provided defaults will apply.
   **/
  @JsonProperty("autoSuspendTimeoutSeconds")
  public Integer getAutoSuspendTimeoutSeconds() {
    return autoSuspendTimeoutSeconds;
  }

  /**
   * Setter for autoSuspendTimeoutSeconds.
   * Set auto suspend threshold. If not provided defaults will apply.
   **/
  public void setAutoSuspendTimeoutSeconds(Integer autoSuspendTimeoutSeconds) {
    this.autoSuspendTimeoutSeconds = autoSuspendTimeoutSeconds;
  }

  /**
   * Getter for disableAutoSuspend.
   * Turn off auto suspend. If not provided defaults will apply.
   **/
  @JsonProperty("disableAutoSuspend")
  public Boolean getDisableAutoSuspend() {
    return disableAutoSuspend;
  }

  /**
   * Setter for disableAutoSuspend.
   * Turn off auto suspend. If not provided defaults will apply.
   **/
  public void setDisableAutoSuspend(Boolean disableAutoSuspend) {
    this.disableAutoSuspend = disableAutoSuspend;
  }

  /**
   * Getter for triggerScaleUpDelay.
   * Set scale up threshold in seconds. If not provided defaults will apply.
   **/
  @JsonProperty("triggerScaleUpDelay")
  public Integer getTriggerScaleUpDelay() {
    return triggerScaleUpDelay;
  }

  /**
   * Setter for triggerScaleUpDelay.
   * Set scale up threshold in seconds. If not provided defaults will apply.
   **/
  public void setTriggerScaleUpDelay(Integer triggerScaleUpDelay) {
    this.triggerScaleUpDelay = triggerScaleUpDelay;
  }

  /**
   * Getter for triggerScaleDownDelay.
   * Set scale down threshold in seconds. If not provided defaults will apply.
   **/
  @JsonProperty("triggerScaleDownDelay")
  public Integer getTriggerScaleDownDelay() {
    return triggerScaleDownDelay;
  }

  /**
   * Setter for triggerScaleDownDelay.
   * Set scale down threshold in seconds. If not provided defaults will apply.
   **/
  public void setTriggerScaleDownDelay(Integer triggerScaleDownDelay) {
    this.triggerScaleDownDelay = triggerScaleDownDelay;
  }

  /**
   * Getter for deleteGroupSet.
   * Delete the executor group set.
   **/
  @JsonProperty("deleteGroupSet")
  public Boolean getDeleteGroupSet() {
    return deleteGroupSet;
  }

  /**
   * Setter for deleteGroupSet.
   * Delete the executor group set.
   **/
  public void setDeleteGroupSet(Boolean deleteGroupSet) {
    this.deleteGroupSet = deleteGroupSet;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImpalaExecutorGroupSetUpdateRequest impalaExecutorGroupSetUpdateRequest = (ImpalaExecutorGroupSetUpdateRequest) o;
    if (!Objects.equals(this.execGroupSize, impalaExecutorGroupSetUpdateRequest.execGroupSize)) {
      return false;
    }
    if (!Objects.equals(this.minExecutorGroups, impalaExecutorGroupSetUpdateRequest.minExecutorGroups)) {
      return false;
    }
    if (!Objects.equals(this.maxExecutorGroups, impalaExecutorGroupSetUpdateRequest.maxExecutorGroups)) {
      return false;
    }
    if (!Objects.equals(this.autoSuspendTimeoutSeconds, impalaExecutorGroupSetUpdateRequest.autoSuspendTimeoutSeconds)) {
      return false;
    }
    if (!Objects.equals(this.disableAutoSuspend, impalaExecutorGroupSetUpdateRequest.disableAutoSuspend)) {
      return false;
    }
    if (!Objects.equals(this.triggerScaleUpDelay, impalaExecutorGroupSetUpdateRequest.triggerScaleUpDelay)) {
      return false;
    }
    if (!Objects.equals(this.triggerScaleDownDelay, impalaExecutorGroupSetUpdateRequest.triggerScaleDownDelay)) {
      return false;
    }
    if (!Objects.equals(this.deleteGroupSet, impalaExecutorGroupSetUpdateRequest.deleteGroupSet)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(execGroupSize, minExecutorGroups, maxExecutorGroups, autoSuspendTimeoutSeconds, disableAutoSuspend, triggerScaleUpDelay, triggerScaleDownDelay, deleteGroupSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpalaExecutorGroupSetUpdateRequest {\n");
    sb.append("    execGroupSize: ").append(toIndentedString(execGroupSize)).append("\n");
    sb.append("    minExecutorGroups: ").append(toIndentedString(minExecutorGroups)).append("\n");
    sb.append("    maxExecutorGroups: ").append(toIndentedString(maxExecutorGroups)).append("\n");
    sb.append("    autoSuspendTimeoutSeconds: ").append(toIndentedString(autoSuspendTimeoutSeconds)).append("\n");
    sb.append("    disableAutoSuspend: ").append(toIndentedString(disableAutoSuspend)).append("\n");
    sb.append("    triggerScaleUpDelay: ").append(toIndentedString(triggerScaleUpDelay)).append("\n");
    sb.append("    triggerScaleDownDelay: ").append(toIndentedString(triggerScaleDownDelay)).append("\n");
    sb.append("    deleteGroupSet: ").append(toIndentedString(deleteGroupSet)).append("\n");
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

