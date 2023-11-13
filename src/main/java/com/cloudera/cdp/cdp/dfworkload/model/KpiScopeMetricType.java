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
 * Provides the legal metric types for an owning scope
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-11-09T15:08:30.880-08:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class KpiScopeMetricType  {

  /**
   * The internal id of the metric type
   **/
  private String id = null;

  /**
   * The user-visible label of the metric type
   **/
  private String label = null;

  /**
   * The unit type key for this metric
   **/
  private String unitTypeKey = null;

  /**
   * The default unitId for this metric
   **/
  private String defaultUnitId = null;

  /**
   * The user-visible description of the metric type
   **/
  private String description = null;

  /**
   * Getter for id.
   * The internal id of the metric type
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * The internal id of the metric type
   **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for label.
   * The user-visible label of the metric type
   **/
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  /**
   * Setter for label.
   * The user-visible label of the metric type
   **/
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * Getter for unitTypeKey.
   * The unit type key for this metric
   **/
  @JsonProperty("unitTypeKey")
  public String getUnitTypeKey() {
    return unitTypeKey;
  }

  /**
   * Setter for unitTypeKey.
   * The unit type key for this metric
   **/
  public void setUnitTypeKey(String unitTypeKey) {
    this.unitTypeKey = unitTypeKey;
  }

  /**
   * Getter for defaultUnitId.
   * The default unitId for this metric
   **/
  @JsonProperty("defaultUnitId")
  public String getDefaultUnitId() {
    return defaultUnitId;
  }

  /**
   * Setter for defaultUnitId.
   * The default unitId for this metric
   **/
  public void setDefaultUnitId(String defaultUnitId) {
    this.defaultUnitId = defaultUnitId;
  }

  /**
   * Getter for description.
   * The user-visible description of the metric type
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Setter for description.
   * The user-visible description of the metric type
   **/
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KpiScopeMetricType kpiScopeMetricType = (KpiScopeMetricType) o;
    if (!Objects.equals(this.id, kpiScopeMetricType.id)) {
      return false;
    }
    if (!Objects.equals(this.label, kpiScopeMetricType.label)) {
      return false;
    }
    if (!Objects.equals(this.unitTypeKey, kpiScopeMetricType.unitTypeKey)) {
      return false;
    }
    if (!Objects.equals(this.defaultUnitId, kpiScopeMetricType.defaultUnitId)) {
      return false;
    }
    if (!Objects.equals(this.description, kpiScopeMetricType.description)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, unitTypeKey, defaultUnitId, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KpiScopeMetricType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    unitTypeKey: ").append(toIndentedString(unitTypeKey)).append("\n");
    sb.append("    defaultUnitId: ").append(toIndentedString(defaultUnitId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

