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
import com.cloudera.cdp.df.model.MetricChartAlert;
import com.cloudera.cdp.df.model.MetricChartData;

/**
 * A metric chart
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-10-06T10:34:45.194-07:00")
public class MetricChart  {

  /**
   * The name of the metric
   **/
  private String name = null;

  /**
   * The unit type of the metric
   **/
  private String unitType = null;

  /**
   * The component type of the metric
   **/
  private String componentType = null;

  /**
   * The chart metrics
   **/
  private MetricChartData metrics = null;

  /**
   * The optional mirrored metrics that only exist for certain system metrics
   **/
  private MetricChartData mirroredMetrics = null;

  /**
   * The optional thresholds associated with the alert on a metric
   **/
  private MetricChartAlert alert = null;

  /**
   * The scope component name that will exist for Processor, Process Group, and Connection metrics.
   **/
  private String componentName = null;

  /**
   * Getter for name.
   * The name of the metric
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the metric
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for unitType.
   * The unit type of the metric
   **/
  @JsonProperty("unitType")
  public String getUnitType() {
    return unitType;
  }

  /**
   * Setter for unitType.
   * The unit type of the metric
   **/
  public void setUnitType(String unitType) {
    this.unitType = unitType;
  }

  /**
   * Getter for componentType.
   * The component type of the metric
   **/
  @JsonProperty("componentType")
  public String getComponentType() {
    return componentType;
  }

  /**
   * Setter for componentType.
   * The component type of the metric
   **/
  public void setComponentType(String componentType) {
    this.componentType = componentType;
  }

  /**
   * Getter for metrics.
   * The chart metrics
   **/
  @JsonProperty("metrics")
  public MetricChartData getMetrics() {
    return metrics;
  }

  /**
   * Setter for metrics.
   * The chart metrics
   **/
  public void setMetrics(MetricChartData metrics) {
    this.metrics = metrics;
  }

  /**
   * Getter for mirroredMetrics.
   * The optional mirrored metrics that only exist for certain system metrics
   **/
  @JsonProperty("mirroredMetrics")
  public MetricChartData getMirroredMetrics() {
    return mirroredMetrics;
  }

  /**
   * Setter for mirroredMetrics.
   * The optional mirrored metrics that only exist for certain system metrics
   **/
  public void setMirroredMetrics(MetricChartData mirroredMetrics) {
    this.mirroredMetrics = mirroredMetrics;
  }

  /**
   * Getter for alert.
   * The optional thresholds associated with the alert on a metric
   **/
  @JsonProperty("alert")
  public MetricChartAlert getAlert() {
    return alert;
  }

  /**
   * Setter for alert.
   * The optional thresholds associated with the alert on a metric
   **/
  public void setAlert(MetricChartAlert alert) {
    this.alert = alert;
  }

  /**
   * Getter for componentName.
   * The scope component name that will exist for Processor, Process Group, and Connection metrics.
   **/
  @JsonProperty("componentName")
  public String getComponentName() {
    return componentName;
  }

  /**
   * Setter for componentName.
   * The scope component name that will exist for Processor, Process Group, and Connection metrics.
   **/
  public void setComponentName(String componentName) {
    this.componentName = componentName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricChart metricChart = (MetricChart) o;
    if (!Objects.equals(this.name, metricChart.name)) {
      return false;
    }
    if (!Objects.equals(this.unitType, metricChart.unitType)) {
      return false;
    }
    if (!Objects.equals(this.componentType, metricChart.componentType)) {
      return false;
    }
    if (!Objects.equals(this.metrics, metricChart.metrics)) {
      return false;
    }
    if (!Objects.equals(this.mirroredMetrics, metricChart.mirroredMetrics)) {
      return false;
    }
    if (!Objects.equals(this.alert, metricChart.alert)) {
      return false;
    }
    if (!Objects.equals(this.componentName, metricChart.componentName)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, unitType, componentType, metrics, mirroredMetrics, alert, componentName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricChart {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    mirroredMetrics: ").append(toIndentedString(mirroredMetrics)).append("\n");
    sb.append("    alert: ").append(toIndentedString(alert)).append("\n");
    sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
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

