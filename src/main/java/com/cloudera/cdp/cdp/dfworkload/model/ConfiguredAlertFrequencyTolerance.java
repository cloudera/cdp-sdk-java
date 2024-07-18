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

package com.cloudera.cdp.dfworkload.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.dfworkload.model.AlertFrequencyUnit;

/**
 * An alert configuration frequency tolerance for measuring an amount of time and unit for alert triggering
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-07-18T14:59:56.971-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class ConfiguredAlertFrequencyTolerance  {

  /**
   * The unit of time controlling how long a metric value can persist outside its boundaries before an alert is generated
   **/
  private AlertFrequencyUnit unit = null;

  /**
   * The amount of time, associated with the given unit, a metric value can persist outside its boundaries before an alert is generated
   **/
  private Double value = null;

  /**
   * Getter for unit.
   * The unit of time controlling how long a metric value can persist outside its boundaries before an alert is generated
   **/
  @JsonProperty("unit")
  public AlertFrequencyUnit getUnit() {
    return unit;
  }

  /**
   * Setter for unit.
   * The unit of time controlling how long a metric value can persist outside its boundaries before an alert is generated
   **/
  public void setUnit(AlertFrequencyUnit unit) {
    this.unit = unit;
  }

  /**
   * Getter for value.
   * The amount of time, associated with the given unit, a metric value can persist outside its boundaries before an alert is generated
   **/
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }

  /**
   * Setter for value.
   * The amount of time, associated with the given unit, a metric value can persist outside its boundaries before an alert is generated
   **/
  public void setValue(Double value) {
    this.value = value;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfiguredAlertFrequencyTolerance configuredAlertFrequencyTolerance = (ConfiguredAlertFrequencyTolerance) o;
    if (!Objects.equals(this.unit, configuredAlertFrequencyTolerance.unit)) {
      return false;
    }
    if (!Objects.equals(this.value, configuredAlertFrequencyTolerance.value)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguredAlertFrequencyTolerance {\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

