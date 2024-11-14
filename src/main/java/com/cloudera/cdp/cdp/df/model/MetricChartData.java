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
import com.cloudera.cdp.df.model.MetricValue;
import java.util.*;

/**
 * Chart data of metrics
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-11-13T12:48:27.676-08:00")
public class MetricChartData  {

  /**
   * The average value of the data
   **/
  private Double averageValue = null;

  /**
   * The most recent value in the list of data points
   **/
  private Double currentValue = null;

  /**
   * The current value label
   **/
  private String currentValueLabel = null;

  /**
   * The average value label
   **/
  private String averageValueLabel = null;

  /**
   * The tooltip value label
   **/
  private String tooltipValueLabel = null;

  /**
   * The list of data points (in time-order) for the metric
   **/
  private List<MetricValue> datas = new ArrayList<MetricValue>();

  /**
   * Getter for averageValue.
   * The average value of the data
   **/
  @JsonProperty("averageValue")
  public Double getAverageValue() {
    return averageValue;
  }

  /**
   * Setter for averageValue.
   * The average value of the data
   **/
  public void setAverageValue(Double averageValue) {
    this.averageValue = averageValue;
  }

  /**
   * Getter for currentValue.
   * The most recent value in the list of data points
   **/
  @JsonProperty("currentValue")
  public Double getCurrentValue() {
    return currentValue;
  }

  /**
   * Setter for currentValue.
   * The most recent value in the list of data points
   **/
  public void setCurrentValue(Double currentValue) {
    this.currentValue = currentValue;
  }

  /**
   * Getter for currentValueLabel.
   * The current value label
   **/
  @JsonProperty("currentValueLabel")
  public String getCurrentValueLabel() {
    return currentValueLabel;
  }

  /**
   * Setter for currentValueLabel.
   * The current value label
   **/
  public void setCurrentValueLabel(String currentValueLabel) {
    this.currentValueLabel = currentValueLabel;
  }

  /**
   * Getter for averageValueLabel.
   * The average value label
   **/
  @JsonProperty("averageValueLabel")
  public String getAverageValueLabel() {
    return averageValueLabel;
  }

  /**
   * Setter for averageValueLabel.
   * The average value label
   **/
  public void setAverageValueLabel(String averageValueLabel) {
    this.averageValueLabel = averageValueLabel;
  }

  /**
   * Getter for tooltipValueLabel.
   * The tooltip value label
   **/
  @JsonProperty("tooltipValueLabel")
  public String getTooltipValueLabel() {
    return tooltipValueLabel;
  }

  /**
   * Setter for tooltipValueLabel.
   * The tooltip value label
   **/
  public void setTooltipValueLabel(String tooltipValueLabel) {
    this.tooltipValueLabel = tooltipValueLabel;
  }

  /**
   * Getter for datas.
   * The list of data points (in time-order) for the metric
   **/
  @JsonProperty("datas")
  public List<MetricValue> getDatas() {
    return datas;
  }

  /**
   * Setter for datas.
   * The list of data points (in time-order) for the metric
   **/
  public void setDatas(List<MetricValue> datas) {
    this.datas = datas;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricChartData metricChartData = (MetricChartData) o;
    if (!Objects.equals(this.averageValue, metricChartData.averageValue)) {
      return false;
    }
    if (!Objects.equals(this.currentValue, metricChartData.currentValue)) {
      return false;
    }
    if (!Objects.equals(this.currentValueLabel, metricChartData.currentValueLabel)) {
      return false;
    }
    if (!Objects.equals(this.averageValueLabel, metricChartData.averageValueLabel)) {
      return false;
    }
    if (!Objects.equals(this.tooltipValueLabel, metricChartData.tooltipValueLabel)) {
      return false;
    }
    if (!Objects.equals(this.datas, metricChartData.datas)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageValue, currentValue, currentValueLabel, averageValueLabel, tooltipValueLabel, datas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricChartData {\n");
    sb.append("    averageValue: ").append(toIndentedString(averageValue)).append("\n");
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
    sb.append("    currentValueLabel: ").append(toIndentedString(currentValueLabel)).append("\n");
    sb.append("    averageValueLabel: ").append(toIndentedString(averageValueLabel)).append("\n");
    sb.append("    tooltipValueLabel: ").append(toIndentedString(tooltipValueLabel)).append("\n");
    sb.append("    datas: ").append(toIndentedString(datas)).append("\n");
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

