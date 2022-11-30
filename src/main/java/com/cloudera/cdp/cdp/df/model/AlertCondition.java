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
import com.cloudera.cdp.df.model.MetricUnit;

/**
 * Alert condition
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-11-29T14:06:19.149-08:00")
public class AlertCondition  {

  /**
   * Id of the alert condition
   **/
  private String id = null;

  /**
   * Operator for the condition
   **/
  private String alertOperator = null;

  /**
   * Value used to for evaluation of this condition
   **/
  private Double value = null;

  /**
   * unit of measurement for the value
   **/
  private MetricUnit unit = null;

  /**
   * Getter for id.
   * Id of the alert condition
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * Id of the alert condition
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for alertOperator.
   * Operator for the condition
   **/
  @JsonProperty("alertOperator")
  public String getAlertOperator() {
    return alertOperator;
  }

  /**
   * Setter for alertOperator.
   * Operator for the condition
   **/
  public void setAlertOperator(String alertOperator) {
    this.alertOperator = alertOperator;
  }

  /**
   * Getter for value.
   * Value used to for evaluation of this condition
   **/
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }

  /**
   * Setter for value.
   * Value used to for evaluation of this condition
   **/
  public void setValue(Double value) {
    this.value = value;
  }

  /**
   * Getter for unit.
   * unit of measurement for the value
   **/
  @JsonProperty("unit")
  public MetricUnit getUnit() {
    return unit;
  }

  /**
   * Setter for unit.
   * unit of measurement for the value
   **/
  public void setUnit(MetricUnit unit) {
    this.unit = unit;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertCondition alertCondition = (AlertCondition) o;
    if (!Objects.equals(this.id, alertCondition.id)) {
      return false;
    }
    if (!Objects.equals(this.alertOperator, alertCondition.alertOperator)) {
      return false;
    }
    if (!Objects.equals(this.value, alertCondition.value)) {
      return false;
    }
    if (!Objects.equals(this.unit, alertCondition.unit)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, alertOperator, value, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertCondition {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    alertOperator: ").append(toIndentedString(alertOperator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

