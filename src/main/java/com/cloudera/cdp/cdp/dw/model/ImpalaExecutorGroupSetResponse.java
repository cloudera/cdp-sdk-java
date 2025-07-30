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
 * Describes configurations for an executor group set.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:40.786-07:00")
public class ImpalaExecutorGroupSetResponse extends CdpResponse {

  /**
   * Name of resource pool for this executor group set.
   **/
  private String groupSetPrefix = null;

  /**
   * Number of executors per executor group.
   **/
  private Integer execGroupSize = null;

  /**
   * Minimum number of executor groups allowed.
   **/
  private Integer minExecutorGroups = null;

  /**
   * Maximum number of executor groups allowed.
   **/
  private Integer maxExecutorGroups = null;

  /**
   * Auto suspend threshold.
   **/
  private Integer autoSuspendTimeoutSeconds = null;

  /**
   * Denotes whether auto suspend is turned off.
   **/
  private Boolean disableAutoSuspend = null;

  /**
   * Scale up threshold in seconds.
   **/
  private Integer triggerScaleUpDelay = null;

  /**
   * Scale down threshold in seconds.
   **/
  private Integer triggerScaleDownDelay = null;

  /**
   * Getter for groupSetPrefix.
   * Name of resource pool for this executor group set.
   **/
  @JsonProperty("groupSetPrefix")
  public String getGroupSetPrefix() {
    return groupSetPrefix;
  }

  /**
   * Setter for groupSetPrefix.
   * Name of resource pool for this executor group set.
   **/
  public void setGroupSetPrefix(String groupSetPrefix) {
    this.groupSetPrefix = groupSetPrefix;
  }

  /**
   * Getter for execGroupSize.
   * Number of executors per executor group.
   **/
  @JsonProperty("execGroupSize")
  public Integer getExecGroupSize() {
    return execGroupSize;
  }

  /**
   * Setter for execGroupSize.
   * Number of executors per executor group.
   **/
  public void setExecGroupSize(Integer execGroupSize) {
    this.execGroupSize = execGroupSize;
  }

  /**
   * Getter for minExecutorGroups.
   * Minimum number of executor groups allowed.
   **/
  @JsonProperty("minExecutorGroups")
  public Integer getMinExecutorGroups() {
    return minExecutorGroups;
  }

  /**
   * Setter for minExecutorGroups.
   * Minimum number of executor groups allowed.
   **/
  public void setMinExecutorGroups(Integer minExecutorGroups) {
    this.minExecutorGroups = minExecutorGroups;
  }

  /**
   * Getter for maxExecutorGroups.
   * Maximum number of executor groups allowed.
   **/
  @JsonProperty("maxExecutorGroups")
  public Integer getMaxExecutorGroups() {
    return maxExecutorGroups;
  }

  /**
   * Setter for maxExecutorGroups.
   * Maximum number of executor groups allowed.
   **/
  public void setMaxExecutorGroups(Integer maxExecutorGroups) {
    this.maxExecutorGroups = maxExecutorGroups;
  }

  /**
   * Getter for autoSuspendTimeoutSeconds.
   * Auto suspend threshold.
   **/
  @JsonProperty("autoSuspendTimeoutSeconds")
  public Integer getAutoSuspendTimeoutSeconds() {
    return autoSuspendTimeoutSeconds;
  }

  /**
   * Setter for autoSuspendTimeoutSeconds.
   * Auto suspend threshold.
   **/
  public void setAutoSuspendTimeoutSeconds(Integer autoSuspendTimeoutSeconds) {
    this.autoSuspendTimeoutSeconds = autoSuspendTimeoutSeconds;
  }

  /**
   * Getter for disableAutoSuspend.
   * Denotes whether auto suspend is turned off.
   **/
  @JsonProperty("disableAutoSuspend")
  public Boolean getDisableAutoSuspend() {
    return disableAutoSuspend;
  }

  /**
   * Setter for disableAutoSuspend.
   * Denotes whether auto suspend is turned off.
   **/
  public void setDisableAutoSuspend(Boolean disableAutoSuspend) {
    this.disableAutoSuspend = disableAutoSuspend;
  }

  /**
   * Getter for triggerScaleUpDelay.
   * Scale up threshold in seconds.
   **/
  @JsonProperty("triggerScaleUpDelay")
  public Integer getTriggerScaleUpDelay() {
    return triggerScaleUpDelay;
  }

  /**
   * Setter for triggerScaleUpDelay.
   * Scale up threshold in seconds.
   **/
  public void setTriggerScaleUpDelay(Integer triggerScaleUpDelay) {
    this.triggerScaleUpDelay = triggerScaleUpDelay;
  }

  /**
   * Getter for triggerScaleDownDelay.
   * Scale down threshold in seconds.
   **/
  @JsonProperty("triggerScaleDownDelay")
  public Integer getTriggerScaleDownDelay() {
    return triggerScaleDownDelay;
  }

  /**
   * Setter for triggerScaleDownDelay.
   * Scale down threshold in seconds.
   **/
  public void setTriggerScaleDownDelay(Integer triggerScaleDownDelay) {
    this.triggerScaleDownDelay = triggerScaleDownDelay;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImpalaExecutorGroupSetResponse impalaExecutorGroupSetResponse = (ImpalaExecutorGroupSetResponse) o;
    if (!Objects.equals(this.groupSetPrefix, impalaExecutorGroupSetResponse.groupSetPrefix)) {
      return false;
    }
    if (!Objects.equals(this.execGroupSize, impalaExecutorGroupSetResponse.execGroupSize)) {
      return false;
    }
    if (!Objects.equals(this.minExecutorGroups, impalaExecutorGroupSetResponse.minExecutorGroups)) {
      return false;
    }
    if (!Objects.equals(this.maxExecutorGroups, impalaExecutorGroupSetResponse.maxExecutorGroups)) {
      return false;
    }
    if (!Objects.equals(this.autoSuspendTimeoutSeconds, impalaExecutorGroupSetResponse.autoSuspendTimeoutSeconds)) {
      return false;
    }
    if (!Objects.equals(this.disableAutoSuspend, impalaExecutorGroupSetResponse.disableAutoSuspend)) {
      return false;
    }
    if (!Objects.equals(this.triggerScaleUpDelay, impalaExecutorGroupSetResponse.triggerScaleUpDelay)) {
      return false;
    }
    if (!Objects.equals(this.triggerScaleDownDelay, impalaExecutorGroupSetResponse.triggerScaleDownDelay)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupSetPrefix, execGroupSize, minExecutorGroups, maxExecutorGroups, autoSuspendTimeoutSeconds, disableAutoSuspend, triggerScaleUpDelay, triggerScaleDownDelay, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImpalaExecutorGroupSetResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    groupSetPrefix: ").append(toIndentedString(groupSetPrefix)).append("\n");
    sb.append("    execGroupSize: ").append(toIndentedString(execGroupSize)).append("\n");
    sb.append("    minExecutorGroups: ").append(toIndentedString(minExecutorGroups)).append("\n");
    sb.append("    maxExecutorGroups: ").append(toIndentedString(maxExecutorGroups)).append("\n");
    sb.append("    autoSuspendTimeoutSeconds: ").append(toIndentedString(autoSuspendTimeoutSeconds)).append("\n");
    sb.append("    disableAutoSuspend: ").append(toIndentedString(disableAutoSuspend)).append("\n");
    sb.append("    triggerScaleUpDelay: ").append(toIndentedString(triggerScaleUpDelay)).append("\n");
    sb.append("    triggerScaleDownDelay: ").append(toIndentedString(triggerScaleDownDelay)).append("\n");
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

