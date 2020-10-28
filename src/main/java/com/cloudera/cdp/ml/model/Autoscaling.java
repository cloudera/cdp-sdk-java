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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Configuration for instance auto scaling.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2020-10-28T12:30:08.577-07:00")
public class Autoscaling  {

  /**
   * The minimum number of instance for auto scaling.
   **/
  private Integer minInstances = null;

  /**
   * The maximum number of instance for auto scaling.
   **/
  private Integer maxInstances = null;

  /**
   * The boolean flag to enable the auto scaling.
   **/
  private Boolean enabled = null;

  /**
   * Getter for minInstances.
   * The minimum number of instance for auto scaling.
   **/
  @JsonProperty("minInstances")
  public Integer getMinInstances() {
    return minInstances;
  }

  /**
   * Setter for minInstances.
   * The minimum number of instance for auto scaling.
   **/
  public void setMinInstances(Integer minInstances) {
    this.minInstances = minInstances;
  }

  /**
   * Getter for maxInstances.
   * The maximum number of instance for auto scaling.
   **/
  @JsonProperty("maxInstances")
  public Integer getMaxInstances() {
    return maxInstances;
  }

  /**
   * Setter for maxInstances.
   * The maximum number of instance for auto scaling.
   **/
  public void setMaxInstances(Integer maxInstances) {
    this.maxInstances = maxInstances;
  }

  /**
   * Getter for enabled.
   * The boolean flag to enable the auto scaling.
   **/
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * Setter for enabled.
   * The boolean flag to enable the auto scaling.
   **/
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Autoscaling autoscaling = (Autoscaling) o;
    if (!Objects.equals(this.minInstances, autoscaling.minInstances)) {
      return false;
    }
    if (!Objects.equals(this.maxInstances, autoscaling.maxInstances)) {
      return false;
    }
    if (!Objects.equals(this.enabled, autoscaling.enabled)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(minInstances, maxInstances, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Autoscaling {\n");
    sb.append("    minInstances: ").append(toIndentedString(minInstances)).append("\n");
    sb.append("    maxInstances: ").append(toIndentedString(maxInstances)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

