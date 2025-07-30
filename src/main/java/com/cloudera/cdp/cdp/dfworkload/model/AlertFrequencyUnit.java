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
 * The alert frequency unit to use in KPI tolerances and metrics
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:44.928-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class AlertFrequencyUnit  {

  /**
   * The id of the frequency unit
   **/
  private String id = null;

  /**
   * The user-friendly label of the frequency unit
   **/
  private String label = null;

  /**
   * The abbreviation for frequency unit
   **/
  private String abbreviation = null;

  /**
   * Getter for id.
   * The id of the frequency unit
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * The id of the frequency unit
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for label.
   * The user-friendly label of the frequency unit
   **/
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  /**
   * Setter for label.
   * The user-friendly label of the frequency unit
   **/
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * Getter for abbreviation.
   * The abbreviation for frequency unit
   **/
  @JsonProperty("abbreviation")
  public String getAbbreviation() {
    return abbreviation;
  }

  /**
   * Setter for abbreviation.
   * The abbreviation for frequency unit
   **/
  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertFrequencyUnit alertFrequencyUnit = (AlertFrequencyUnit) o;
    if (!Objects.equals(this.id, alertFrequencyUnit.id)) {
      return false;
    }
    if (!Objects.equals(this.label, alertFrequencyUnit.label)) {
      return false;
    }
    if (!Objects.equals(this.abbreviation, alertFrequencyUnit.abbreviation)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, abbreviation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertFrequencyUnit {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
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

