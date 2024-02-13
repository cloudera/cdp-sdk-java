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
import com.cloudera.cdp.dfworkload.model.AlertFrequencyTolerance;
import com.cloudera.cdp.dfworkload.model.KpiScopeMetaData;
import com.cloudera.cdp.dfworkload.model.KpiUnit;
import java.util.*;
import java.util.Map;

/**
 * A template for instantiating KPIs
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-02-12T15:29:04.817-08:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class KpiMetaData  {

  /**
   * The KPI scope meta data list, one per MetricComponentType.
   **/
  private List<KpiScopeMetaData> kpiScopes = new ArrayList<KpiScopeMetaData>();

  /**
   * The entire tree of legal unit types for all metrics.
   **/
  private Map<String, List<KpiUnit>> unitTypes = new HashMap<String, List<KpiUnit>>();

  /**
   * The alert frequency tolerance shared by all metrics.
   **/
  private AlertFrequencyTolerance alertFrequencyTolerance = null;

  /**
   * Getter for kpiScopes.
   * The KPI scope meta data list, one per MetricComponentType.
   **/
  @JsonProperty("kpiScopes")
  public List<KpiScopeMetaData> getKpiScopes() {
    return kpiScopes;
  }

  /**
   * Setter for kpiScopes.
   * The KPI scope meta data list, one per MetricComponentType.
   **/
  public void setKpiScopes(List<KpiScopeMetaData> kpiScopes) {
    this.kpiScopes = kpiScopes;
  }

  /**
   * Getter for unitTypes.
   * The entire tree of legal unit types for all metrics.
   **/
  @JsonProperty("unitTypes")
  public Map<String, List<KpiUnit>> getUnitTypes() {
    return unitTypes;
  }

  /**
   * Setter for unitTypes.
   * The entire tree of legal unit types for all metrics.
   **/
  public void setUnitTypes(Map<String, List<KpiUnit>> unitTypes) {
    this.unitTypes = unitTypes;
  }

  /**
   * Getter for alertFrequencyTolerance.
   * The alert frequency tolerance shared by all metrics.
   **/
  @JsonProperty("alertFrequencyTolerance")
  public AlertFrequencyTolerance getAlertFrequencyTolerance() {
    return alertFrequencyTolerance;
  }

  /**
   * Setter for alertFrequencyTolerance.
   * The alert frequency tolerance shared by all metrics.
   **/
  public void setAlertFrequencyTolerance(AlertFrequencyTolerance alertFrequencyTolerance) {
    this.alertFrequencyTolerance = alertFrequencyTolerance;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KpiMetaData kpiMetaData = (KpiMetaData) o;
    if (!Objects.equals(this.kpiScopes, kpiMetaData.kpiScopes)) {
      return false;
    }
    if (!Objects.equals(this.unitTypes, kpiMetaData.unitTypes)) {
      return false;
    }
    if (!Objects.equals(this.alertFrequencyTolerance, kpiMetaData.alertFrequencyTolerance)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(kpiScopes, unitTypes, alertFrequencyTolerance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KpiMetaData {\n");
    sb.append("    kpiScopes: ").append(toIndentedString(kpiScopes)).append("\n");
    sb.append("    unitTypes: ").append(toIndentedString(unitTypes)).append("\n");
    sb.append("    alertFrequencyTolerance: ").append(toIndentedString(alertFrequencyTolerance)).append("\n");
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

