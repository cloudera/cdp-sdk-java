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
import com.cloudera.cdp.dfworkload.model.ConfiguredAlert;

/**
 * An instantiated KPI specifying a metric on which to alert
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-06-21T23:16:18.220-07:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class ConfiguredKpi  {

  /**
   * The id of the associated metric
   **/
  private String metricId = null;

  /**
   * The id of the KPI; used only when viewing and editing existing KPIs
   **/
  private String id = null;

  /**
   * The component type of the associated metric
   **/
  private String metricComponentType = null;

  /**
   * The alert specification for the associated metric
   **/
  private ConfiguredAlert alert = null;

  /**
   * The optional process group ID, processor ID, or connection ID. This is a composite ID containing a chain of process group IDs representing the component's full ancestry
   **/
  private String componentId = null;

  /**
   * Getter for metricId.
   * The id of the associated metric
   **/
  @JsonProperty("metricId")
  public String getMetricId() {
    return metricId;
  }

  /**
   * Setter for metricId.
   * The id of the associated metric
   **/
  public void setMetricId(String metricId) {
    this.metricId = metricId;
  }

  /**
   * Getter for id.
   * The id of the KPI; used only when viewing and editing existing KPIs
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * The id of the KPI; used only when viewing and editing existing KPIs
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for metricComponentType.
   * The component type of the associated metric
   **/
  @JsonProperty("metricComponentType")
  public String getMetricComponentType() {
    return metricComponentType;
  }

  /**
   * Setter for metricComponentType.
   * The component type of the associated metric
   **/
  public void setMetricComponentType(String metricComponentType) {
    this.metricComponentType = metricComponentType;
  }

  /**
   * Getter for alert.
   * The alert specification for the associated metric
   **/
  @JsonProperty("alert")
  public ConfiguredAlert getAlert() {
    return alert;
  }

  /**
   * Setter for alert.
   * The alert specification for the associated metric
   **/
  public void setAlert(ConfiguredAlert alert) {
    this.alert = alert;
  }

  /**
   * Getter for componentId.
   * The optional process group ID, processor ID, or connection ID. This is a composite ID containing a chain of process group IDs representing the component&#39;s full ancestry
   **/
  @JsonProperty("componentId")
  public String getComponentId() {
    return componentId;
  }

  /**
   * Setter for componentId.
   * The optional process group ID, processor ID, or connection ID. This is a composite ID containing a chain of process group IDs representing the component&#39;s full ancestry
   **/
  public void setComponentId(String componentId) {
    this.componentId = componentId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfiguredKpi configuredKpi = (ConfiguredKpi) o;
    if (!Objects.equals(this.metricId, configuredKpi.metricId)) {
      return false;
    }
    if (!Objects.equals(this.id, configuredKpi.id)) {
      return false;
    }
    if (!Objects.equals(this.metricComponentType, configuredKpi.metricComponentType)) {
      return false;
    }
    if (!Objects.equals(this.alert, configuredKpi.alert)) {
      return false;
    }
    if (!Objects.equals(this.componentId, configuredKpi.componentId)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricId, id, metricComponentType, alert, componentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguredKpi {\n");
    sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metricComponentType: ").append(toIndentedString(metricComponentType)).append("\n");
    sb.append("    alert: ").append(toIndentedString(alert)).append("\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
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

