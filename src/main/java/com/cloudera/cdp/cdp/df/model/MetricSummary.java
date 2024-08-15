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
import com.cloudera.cdp.df.model.AlertCondition;
import com.cloudera.cdp.df.model.AlertFrequencyUnit;
import com.cloudera.cdp.df.model.MetricValue;
import java.util.*;

/**
 * Metric summary
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-08-15T13:42:19.082-07:00")
public class MetricSummary  {

  /**
   * The name of the metric
   **/
  private String name = null;

  /**
   * The label of the metric
   **/
  private String label = null;

  /**
   * The description of the metric
   **/
  private String description = null;

  /**
   * The unit type of the metric
   **/
  private String unitType = null;

  /**
   * The component type of the metric
   **/
  private String componentType = null;

  /**
   * The scope component name that will exist for Processor, Process Group, and Connection metrics.
   **/
  private String componentName = null;

  /**
   * Id of the component monitored
   **/
  private String componentId = null;

  /**
   * Values for the metric
   **/
  private List<MetricValue> values = new ArrayList<MetricValue>();

  /**
   * Display context of the metric
   **/
  private String displayContext = null;

  /**
   * Upper boundary condition
   **/
  private AlertCondition upperBoundCondition = null;

  /**
   * Lower boundary condition
   **/
  private AlertCondition lowerBoundCondition = null;

  /**
   * Frequency value
   **/
  private Double alertFrequencyValue = null;

  /**
   * Units of frequency
   **/
  private AlertFrequencyUnit alertFrequencyUnit = null;

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
   * Getter for label.
   * The label of the metric
   **/
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  /**
   * Setter for label.
   * The label of the metric
   **/
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * Getter for description.
   * The description of the metric
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * The description of the metric
   **/
  public void setDescription(String description) {
    this.description = description;
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

  /**
   * Getter for componentId.
   * Id of the component monitored
   **/
  @JsonProperty("componentId")
  public String getComponentId() {
    return componentId;
  }

  /**
   * Setter for componentId.
   * Id of the component monitored
   **/
  public void setComponentId(String componentId) {
    this.componentId = componentId;
  }

  /**
   * Getter for values.
   * Values for the metric
   **/
  @JsonProperty("values")
  public List<MetricValue> getValues() {
    return values;
  }

  /**
   * Setter for values.
   * Values for the metric
   **/
  public void setValues(List<MetricValue> values) {
    this.values = values;
  }

  /**
   * Getter for displayContext.
   * Display context of the metric
   **/
  @JsonProperty("displayContext")
  public String getDisplayContext() {
    return displayContext;
  }

  /**
   * Setter for displayContext.
   * Display context of the metric
   **/
  public void setDisplayContext(String displayContext) {
    this.displayContext = displayContext;
  }

  /**
   * Getter for upperBoundCondition.
   * Upper boundary condition
   **/
  @JsonProperty("upperBoundCondition")
  public AlertCondition getUpperBoundCondition() {
    return upperBoundCondition;
  }

  /**
   * Setter for upperBoundCondition.
   * Upper boundary condition
   **/
  public void setUpperBoundCondition(AlertCondition upperBoundCondition) {
    this.upperBoundCondition = upperBoundCondition;
  }

  /**
   * Getter for lowerBoundCondition.
   * Lower boundary condition
   **/
  @JsonProperty("lowerBoundCondition")
  public AlertCondition getLowerBoundCondition() {
    return lowerBoundCondition;
  }

  /**
   * Setter for lowerBoundCondition.
   * Lower boundary condition
   **/
  public void setLowerBoundCondition(AlertCondition lowerBoundCondition) {
    this.lowerBoundCondition = lowerBoundCondition;
  }

  /**
   * Getter for alertFrequencyValue.
   * Frequency value
   **/
  @JsonProperty("alertFrequencyValue")
  public Double getAlertFrequencyValue() {
    return alertFrequencyValue;
  }

  /**
   * Setter for alertFrequencyValue.
   * Frequency value
   **/
  public void setAlertFrequencyValue(Double alertFrequencyValue) {
    this.alertFrequencyValue = alertFrequencyValue;
  }

  /**
   * Getter for alertFrequencyUnit.
   * Units of frequency
   **/
  @JsonProperty("alertFrequencyUnit")
  public AlertFrequencyUnit getAlertFrequencyUnit() {
    return alertFrequencyUnit;
  }

  /**
   * Setter for alertFrequencyUnit.
   * Units of frequency
   **/
  public void setAlertFrequencyUnit(AlertFrequencyUnit alertFrequencyUnit) {
    this.alertFrequencyUnit = alertFrequencyUnit;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricSummary metricSummary = (MetricSummary) o;
    if (!Objects.equals(this.name, metricSummary.name)) {
      return false;
    }
    if (!Objects.equals(this.label, metricSummary.label)) {
      return false;
    }
    if (!Objects.equals(this.description, metricSummary.description)) {
      return false;
    }
    if (!Objects.equals(this.unitType, metricSummary.unitType)) {
      return false;
    }
    if (!Objects.equals(this.componentType, metricSummary.componentType)) {
      return false;
    }
    if (!Objects.equals(this.componentName, metricSummary.componentName)) {
      return false;
    }
    if (!Objects.equals(this.componentId, metricSummary.componentId)) {
      return false;
    }
    if (!Objects.equals(this.values, metricSummary.values)) {
      return false;
    }
    if (!Objects.equals(this.displayContext, metricSummary.displayContext)) {
      return false;
    }
    if (!Objects.equals(this.upperBoundCondition, metricSummary.upperBoundCondition)) {
      return false;
    }
    if (!Objects.equals(this.lowerBoundCondition, metricSummary.lowerBoundCondition)) {
      return false;
    }
    if (!Objects.equals(this.alertFrequencyValue, metricSummary.alertFrequencyValue)) {
      return false;
    }
    if (!Objects.equals(this.alertFrequencyUnit, metricSummary.alertFrequencyUnit)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, label, description, unitType, componentType, componentName, componentId, values, displayContext, upperBoundCondition, lowerBoundCondition, alertFrequencyValue, alertFrequencyUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricSummary {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    displayContext: ").append(toIndentedString(displayContext)).append("\n");
    sb.append("    upperBoundCondition: ").append(toIndentedString(upperBoundCondition)).append("\n");
    sb.append("    lowerBoundCondition: ").append(toIndentedString(lowerBoundCondition)).append("\n");
    sb.append("    alertFrequencyValue: ").append(toIndentedString(alertFrequencyValue)).append("\n");
    sb.append("    alertFrequencyUnit: ").append(toIndentedString(alertFrequencyUnit)).append("\n");
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

