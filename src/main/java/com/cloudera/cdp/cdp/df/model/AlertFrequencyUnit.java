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

package com.cloudera.cdp.df.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Alert frequency unit
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-04-10T13:24:00.859-07:00")
public class AlertFrequencyUnit  {

  /**
   * Id of alert frequency unit
   **/
  private String id = null;

  /**
   * Label of the unit
   **/
  private String label = null;

  /**
   * Abbreviation used for this unit
   **/
  private String abbreviation = null;

  /**
   * Getter for id.
   * Id of alert frequency unit
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * Id of alert frequency unit
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for label.
   * Label of the unit
   **/
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  /**
   * Setter for label.
   * Label of the unit
   **/
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * Getter for abbreviation.
   * Abbreviation used for this unit
   **/
  @JsonProperty("abbreviation")
  public String getAbbreviation() {
    return abbreviation;
  }

  /**
   * Setter for abbreviation.
   * Abbreviation used for this unit
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

