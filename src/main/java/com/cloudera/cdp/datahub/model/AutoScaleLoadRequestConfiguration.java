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

/**
 * Configuration for load based scaling
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-07-09T16:32:32.151-07:00")
public class AutoScaleLoadRequestConfiguration  {

  /**
   * The lower bound for the resource
   **/
  private Integer minResourceValue = null;

  /**
   * The upper bound for the resource
   **/
  private Integer maxResourceValue = null;

  /**
   * Minimum time, in minutes, between autoscale activity
   **/
  private Integer coolDownMinutes = null;

  /**
   * Getter for minResourceValue.
   * The lower bound for the resource
   **/
  @JsonProperty("minResourceValue")
  public Integer getMinResourceValue() {
    return minResourceValue;
  }

  /**
   * Setter for minResourceValue.
   * The lower bound for the resource
   **/
  public void setMinResourceValue(Integer minResourceValue) {
    this.minResourceValue = minResourceValue;
  }

  /**
   * Getter for maxResourceValue.
   * The upper bound for the resource
   **/
  @JsonProperty("maxResourceValue")
  public Integer getMaxResourceValue() {
    return maxResourceValue;
  }

  /**
   * Setter for maxResourceValue.
   * The upper bound for the resource
   **/
  public void setMaxResourceValue(Integer maxResourceValue) {
    this.maxResourceValue = maxResourceValue;
  }

  /**
   * Getter for coolDownMinutes.
   * Minimum time, in minutes, between autoscale activity
   **/
  @JsonProperty("coolDownMinutes")
  public Integer getCoolDownMinutes() {
    return coolDownMinutes;
  }

  /**
   * Setter for coolDownMinutes.
   * Minimum time, in minutes, between autoscale activity
   **/
  public void setCoolDownMinutes(Integer coolDownMinutes) {
    this.coolDownMinutes = coolDownMinutes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoScaleLoadRequestConfiguration autoScaleLoadRequestConfiguration = (AutoScaleLoadRequestConfiguration) o;
    if (!Objects.equals(this.minResourceValue, autoScaleLoadRequestConfiguration.minResourceValue)) {
      return false;
    }
    if (!Objects.equals(this.maxResourceValue, autoScaleLoadRequestConfiguration.maxResourceValue)) {
      return false;
    }
    if (!Objects.equals(this.coolDownMinutes, autoScaleLoadRequestConfiguration.coolDownMinutes)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(minResourceValue, maxResourceValue, coolDownMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoScaleLoadRequestConfiguration {\n");
    sb.append("    minResourceValue: ").append(toIndentedString(minResourceValue)).append("\n");
    sb.append("    maxResourceValue: ").append(toIndentedString(maxResourceValue)).append("\n");
    sb.append("    coolDownMinutes: ").append(toIndentedString(coolDownMinutes)).append("\n");
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

