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
import java.util.*;

/**
 * The alert frequency tolerance unit choices, including a default
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-04-23T14:14:37.211-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class AlertFrequencyTolerance  {

  /**
   * The legal alert frequency values
   **/
  private List<AlertFrequencyUnit> units = new ArrayList<AlertFrequencyUnit>();

  /**
   * The default alert frequency ID to use as the default chooser value
   **/
  private String defaultUnitId = null;

  /**
   * Getter for units.
   * The legal alert frequency values
   **/
  @JsonProperty("units")
  public List<AlertFrequencyUnit> getUnits() {
    return units;
  }

  /**
   * Setter for units.
   * The legal alert frequency values
   **/
  public void setUnits(List<AlertFrequencyUnit> units) {
    this.units = units;
  }

  /**
   * Getter for defaultUnitId.
   * The default alert frequency ID to use as the default chooser value
   **/
  @JsonProperty("defaultUnitId")
  public String getDefaultUnitId() {
    return defaultUnitId;
  }

  /**
   * Setter for defaultUnitId.
   * The default alert frequency ID to use as the default chooser value
   **/
  public void setDefaultUnitId(String defaultUnitId) {
    this.defaultUnitId = defaultUnitId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertFrequencyTolerance alertFrequencyTolerance = (AlertFrequencyTolerance) o;
    if (!Objects.equals(this.units, alertFrequencyTolerance.units)) {
      return false;
    }
    if (!Objects.equals(this.defaultUnitId, alertFrequencyTolerance.defaultUnitId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(units, defaultUnitId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertFrequencyTolerance {\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    defaultUnitId: ").append(toIndentedString(defaultUnitId)).append("\n");
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

