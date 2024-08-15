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
 * Captures the legal units for a metric, a means to avoid large numbers either before or after a decimal point
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-08-15T13:42:19.422-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class KpiUnit  {

  /**
   * The internal ID of the unit
   **/
  private String id = null;

  /**
   * The user-visible label of the unit
   **/
  private String label = null;

  /**
   * The conversion factor to use to normalize values with this unit into a common unit
   **/
  private Long factor = null;

  /**
   * Getter for id.
   * The internal ID of the unit
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * The internal ID of the unit
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for label.
   * The user-visible label of the unit
   **/
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  /**
   * Setter for label.
   * The user-visible label of the unit
   **/
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * Getter for factor.
   * The conversion factor to use to normalize values with this unit into a common unit
   **/
  @JsonProperty("factor")
  public Long getFactor() {
    return factor;
  }

  /**
   * Setter for factor.
   * The conversion factor to use to normalize values with this unit into a common unit
   **/
  public void setFactor(Long factor) {
    this.factor = factor;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KpiUnit kpiUnit = (KpiUnit) o;
    if (!Objects.equals(this.id, kpiUnit.id)) {
      return false;
    }
    if (!Objects.equals(this.label, kpiUnit.label)) {
      return false;
    }
    if (!Objects.equals(this.factor, kpiUnit.factor)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, factor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KpiUnit {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
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

