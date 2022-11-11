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
import com.cloudera.cdp.df.model.MetricChart;
import java.util.*;

/**
 * A response to list deployment KPIs
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-11-10T17:48:33.846-08:00")
public class ListDeploymentKPIsResponse extends CdpResponse {

  /**
   * The metrics for the configured KPIs
   **/
  private List<MetricChart> metricCharts = new ArrayList<MetricChart>();

  /**
   * Getter for metricCharts.
   * The metrics for the configured KPIs
   **/
  @JsonProperty("metricCharts")
  public List<MetricChart> getMetricCharts() {
    return metricCharts;
  }

  /**
   * Setter for metricCharts.
   * The metrics for the configured KPIs
   **/
  public void setMetricCharts(List<MetricChart> metricCharts) {
    this.metricCharts = metricCharts;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDeploymentKPIsResponse listDeploymentKPIsResponse = (ListDeploymentKPIsResponse) o;
    if (!Objects.equals(this.metricCharts, listDeploymentKPIsResponse.metricCharts)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricCharts, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDeploymentKPIsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    metricCharts: ").append(toIndentedString(metricCharts)).append("\n");
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

