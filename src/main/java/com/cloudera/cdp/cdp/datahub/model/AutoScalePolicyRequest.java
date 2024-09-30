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

package com.cloudera.cdp.datahub.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datahub.model.AutoScaleLoadRequest;
import com.cloudera.cdp.datahub.model.AutoScaleScheduleRequest;

/**
 * An individual AutoScale Policy
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-09-27T08:40:24.392-07:00")
public class AutoScalePolicyRequest  {

  /**
   * A single hostgroup, or a comma separated list of hostGroups to which the rules apply
   **/
  private String hostGroups = null;

  /**
   * Scheduled based policy
   **/
  private AutoScaleScheduleRequest scheduleBasedPolicy = null;

  /**
   * Load based policy
   **/
  private AutoScaleLoadRequest loadBasedPolicy = null;

  /**
   * Getter for hostGroups.
   * A single hostgroup, or a comma separated list of hostGroups to which the rules apply
   **/
  @JsonProperty("hostGroups")
  public String getHostGroups() {
    return hostGroups;
  }

  /**
   * Setter for hostGroups.
   * A single hostgroup, or a comma separated list of hostGroups to which the rules apply
   **/
  public void setHostGroups(String hostGroups) {
    this.hostGroups = hostGroups;
  }

  /**
   * Getter for scheduleBasedPolicy.
   * Scheduled based policy
   **/
  @JsonProperty("scheduleBasedPolicy")
  public AutoScaleScheduleRequest getScheduleBasedPolicy() {
    return scheduleBasedPolicy;
  }

  /**
   * Setter for scheduleBasedPolicy.
   * Scheduled based policy
   **/
  public void setScheduleBasedPolicy(AutoScaleScheduleRequest scheduleBasedPolicy) {
    this.scheduleBasedPolicy = scheduleBasedPolicy;
  }

  /**
   * Getter for loadBasedPolicy.
   * Load based policy
   **/
  @JsonProperty("loadBasedPolicy")
  public AutoScaleLoadRequest getLoadBasedPolicy() {
    return loadBasedPolicy;
  }

  /**
   * Setter for loadBasedPolicy.
   * Load based policy
   **/
  public void setLoadBasedPolicy(AutoScaleLoadRequest loadBasedPolicy) {
    this.loadBasedPolicy = loadBasedPolicy;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoScalePolicyRequest autoScalePolicyRequest = (AutoScalePolicyRequest) o;
    if (!Objects.equals(this.hostGroups, autoScalePolicyRequest.hostGroups)) {
      return false;
    }
    if (!Objects.equals(this.scheduleBasedPolicy, autoScalePolicyRequest.scheduleBasedPolicy)) {
      return false;
    }
    if (!Objects.equals(this.loadBasedPolicy, autoScalePolicyRequest.loadBasedPolicy)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostGroups, scheduleBasedPolicy, loadBasedPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoScalePolicyRequest {\n");
    sb.append("    hostGroups: ").append(toIndentedString(hostGroups)).append("\n");
    sb.append("    scheduleBasedPolicy: ").append(toIndentedString(scheduleBasedPolicy)).append("\n");
    sb.append("    loadBasedPolicy: ").append(toIndentedString(loadBasedPolicy)).append("\n");
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

