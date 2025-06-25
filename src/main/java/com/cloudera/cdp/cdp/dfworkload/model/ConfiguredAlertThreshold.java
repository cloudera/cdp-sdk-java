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

/**
 * A configured alert threshold to pair together a statistical unit and value
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-06-24T14:06:24.983-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class ConfiguredAlertThreshold  {

  /**
   * The identifier of the alert threshold unit to associate with the given threshold value
   **/
  private String unitId = null;

  /**
   * The threshold value whose triggering causes an alert
   **/
  private Double value = null;

  /**
   * Getter for unitId.
   * The identifier of the alert threshold unit to associate with the given threshold value
   **/
  @JsonProperty("unitId")
  public String getUnitId() {
    return unitId;
  }

  /**
   * Setter for unitId.
   * The identifier of the alert threshold unit to associate with the given threshold value
   **/
  public void setUnitId(String unitId) {
    this.unitId = unitId;
  }

  /**
   * Getter for value.
   * The threshold value whose triggering causes an alert
   **/
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }

  /**
   * Setter for value.
   * The threshold value whose triggering causes an alert
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
    ConfiguredAlertThreshold configuredAlertThreshold = (ConfiguredAlertThreshold) o;
    if (!Objects.equals(this.unitId, configuredAlertThreshold.unitId)) {
      return false;
    }
    if (!Objects.equals(this.value, configuredAlertThreshold.value)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitId, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguredAlertThreshold {\n");
    sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
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

