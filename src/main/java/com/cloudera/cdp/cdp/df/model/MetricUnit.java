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
 * Metric unit
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-09-12T15:07:46.050-07:00")
public class MetricUnit  {

  /**
   * Id of the metric unit
   **/
  private String id = null;

  /**
   * Name of the unit
   **/
  private String name = null;

  /**
   * display label for the unit
   **/
  private String displayLabel = null;

  /**
   * abbreviation used for this unit
   **/
  private String abbreviation = null;

  /**
   * ordinal used when positioning the unit in a list (sort order)
   **/
  private Integer ordinal = null;

  /**
   * conversion value to use when converting between units
   **/
  private Long conversionValue = null;

  /**
   * type of unit (DURATION, RATIO, SIZE, RATE, COUNT)
   **/
  private String metricUnitType = null;

  /**
   * Getter for id.
   * Id of the metric unit
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * Id of the metric unit
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for name.
   * Name of the unit
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * Name of the unit
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for displayLabel.
   * display label for the unit
   **/
  @JsonProperty("displayLabel")
  public String getDisplayLabel() {
    return displayLabel;
  }

  /**
   * Setter for displayLabel.
   * display label for the unit
   **/
  public void setDisplayLabel(String displayLabel) {
    this.displayLabel = displayLabel;
  }

  /**
   * Getter for abbreviation.
   * abbreviation used for this unit
   **/
  @JsonProperty("abbreviation")
  public String getAbbreviation() {
    return abbreviation;
  }

  /**
   * Setter for abbreviation.
   * abbreviation used for this unit
   **/
  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  /**
   * Getter for ordinal.
   * ordinal used when positioning the unit in a list (sort order)
   **/
  @JsonProperty("ordinal")
  public Integer getOrdinal() {
    return ordinal;
  }

  /**
   * Setter for ordinal.
   * ordinal used when positioning the unit in a list (sort order)
   **/
  public void setOrdinal(Integer ordinal) {
    this.ordinal = ordinal;
  }

  /**
   * Getter for conversionValue.
   * conversion value to use when converting between units
   **/
  @JsonProperty("conversionValue")
  public Long getConversionValue() {
    return conversionValue;
  }

  /**
   * Setter for conversionValue.
   * conversion value to use when converting between units
   **/
  public void setConversionValue(Long conversionValue) {
    this.conversionValue = conversionValue;
  }

  /**
   * Getter for metricUnitType.
   * type of unit (DURATION, RATIO, SIZE, RATE, COUNT)
   **/
  @JsonProperty("metricUnitType")
  public String getMetricUnitType() {
    return metricUnitType;
  }

  /**
   * Setter for metricUnitType.
   * type of unit (DURATION, RATIO, SIZE, RATE, COUNT)
   **/
  public void setMetricUnitType(String metricUnitType) {
    this.metricUnitType = metricUnitType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricUnit metricUnit = (MetricUnit) o;
    if (!Objects.equals(this.id, metricUnit.id)) {
      return false;
    }
    if (!Objects.equals(this.name, metricUnit.name)) {
      return false;
    }
    if (!Objects.equals(this.displayLabel, metricUnit.displayLabel)) {
      return false;
    }
    if (!Objects.equals(this.abbreviation, metricUnit.abbreviation)) {
      return false;
    }
    if (!Objects.equals(this.ordinal, metricUnit.ordinal)) {
      return false;
    }
    if (!Objects.equals(this.conversionValue, metricUnit.conversionValue)) {
      return false;
    }
    if (!Objects.equals(this.metricUnitType, metricUnit.metricUnitType)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, displayLabel, abbreviation, ordinal, conversionValue, metricUnitType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricUnit {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayLabel: ").append(toIndentedString(displayLabel)).append("\n");
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
    sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
    sb.append("    conversionValue: ").append(toIndentedString(conversionValue)).append("\n");
    sb.append("    metricUnitType: ").append(toIndentedString(metricUnitType)).append("\n");
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

