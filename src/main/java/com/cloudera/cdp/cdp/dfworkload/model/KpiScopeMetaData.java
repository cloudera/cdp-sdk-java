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
import com.cloudera.cdp.dfworkload.model.KpiContextGroup;
import com.cloudera.cdp.dfworkload.model.KpiScopeMetricType;
import java.util.*;

/**
 * Provides scoping meta data for use during KPI creation
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2023-03-09T11:03:09.490-08:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class KpiScopeMetaData  {

  /**
   * The type of the scope
   **/
  private String type = null;

  /**
   * The available metric types for the chosen scope type
   **/
  private List<KpiScopeMetricType> metricTypes = new ArrayList<KpiScopeMetricType>();

  /**
   * The label to use for the chosen scope type
   **/
  private String label = null;

  /**
   * The context identifiers for the chosen scope type
   **/
  private List<KpiContextGroup> contextGroups = new ArrayList<KpiContextGroup>();

  /**
   * The label to use for the context identifier, which depends on scope type.
   **/
  private String contextLabel = null;

  /**
   * Getter for type.
   * The type of the scope
   **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Setter for type.
   * The type of the scope
   **/
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Getter for metricTypes.
   * The available metric types for the chosen scope type
   **/
  @JsonProperty("metricTypes")
  public List<KpiScopeMetricType> getMetricTypes() {
    return metricTypes;
  }

  /**
   * Setter for metricTypes.
   * The available metric types for the chosen scope type
   **/
  public void setMetricTypes(List<KpiScopeMetricType> metricTypes) {
    this.metricTypes = metricTypes;
  }

  /**
   * Getter for label.
   * The label to use for the chosen scope type
   **/
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  /**
   * Setter for label.
   * The label to use for the chosen scope type
   **/
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * Getter for contextGroups.
   * The context identifiers for the chosen scope type
   **/
  @JsonProperty("contextGroups")
  public List<KpiContextGroup> getContextGroups() {
    return contextGroups;
  }

  /**
   * Setter for contextGroups.
   * The context identifiers for the chosen scope type
   **/
  public void setContextGroups(List<KpiContextGroup> contextGroups) {
    this.contextGroups = contextGroups;
  }

  /**
   * Getter for contextLabel.
   * The label to use for the context identifier, which depends on scope type.
   **/
  @JsonProperty("contextLabel")
  public String getContextLabel() {
    return contextLabel;
  }

  /**
   * Setter for contextLabel.
   * The label to use for the context identifier, which depends on scope type.
   **/
  public void setContextLabel(String contextLabel) {
    this.contextLabel = contextLabel;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KpiScopeMetaData kpiScopeMetaData = (KpiScopeMetaData) o;
    if (!Objects.equals(this.type, kpiScopeMetaData.type)) {
      return false;
    }
    if (!Objects.equals(this.metricTypes, kpiScopeMetaData.metricTypes)) {
      return false;
    }
    if (!Objects.equals(this.label, kpiScopeMetaData.label)) {
      return false;
    }
    if (!Objects.equals(this.contextGroups, kpiScopeMetaData.contextGroups)) {
      return false;
    }
    if (!Objects.equals(this.contextLabel, kpiScopeMetaData.contextLabel)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, metricTypes, label, contextGroups, contextLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KpiScopeMetaData {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    metricTypes: ").append(toIndentedString(metricTypes)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    contextGroups: ").append(toIndentedString(contextGroups)).append("\n");
    sb.append("    contextLabel: ").append(toIndentedString(contextLabel)).append("\n");
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

