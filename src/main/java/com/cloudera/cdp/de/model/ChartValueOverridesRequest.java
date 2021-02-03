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

package com.cloudera.cdp.de.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Object containing chart value overrides for enabling a CDE service or creation of virtual clusters.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-02-03T13:16:58.730-08:00")
public class ChartValueOverridesRequest  {

  /**
   * Name of the chart that has to be overridden, for eg- \"dex-app\", \"dex-base\".
   **/
  private String chartName = null;

  /**
   * Space separated key-value pairs for overriding chart values. The key and the value must be separated using a colon(:) For eg- \"airflow.enabled:true safari.enabled:true\".
   **/
  private String overrides = null;

  /**
   * Getter for chartName.
   * Name of the chart that has to be overridden, for eg- \&quot;dex-app\&quot;, \&quot;dex-base\&quot;.
   **/
  @JsonProperty("chartName")
  public String getChartName() {
    return chartName;
  }

  /**
   * Setter for chartName.
   * Name of the chart that has to be overridden, for eg- \&quot;dex-app\&quot;, \&quot;dex-base\&quot;.
   **/
  public void setChartName(String chartName) {
    this.chartName = chartName;
  }

  /**
   * Getter for overrides.
   * Space separated key-value pairs for overriding chart values. The key and the value must be separated using a colon(:) For eg- \&quot;airflow.enabled:true safari.enabled:true\&quot;.
   **/
  @JsonProperty("overrides")
  public String getOverrides() {
    return overrides;
  }

  /**
   * Setter for overrides.
   * Space separated key-value pairs for overriding chart values. The key and the value must be separated using a colon(:) For eg- \&quot;airflow.enabled:true safari.enabled:true\&quot;.
   **/
  public void setOverrides(String overrides) {
    this.overrides = overrides;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartValueOverridesRequest chartValueOverridesRequest = (ChartValueOverridesRequest) o;
    if (!Objects.equals(this.chartName, chartValueOverridesRequest.chartName)) {
      return false;
    }
    if (!Objects.equals(this.overrides, chartValueOverridesRequest.overrides)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(chartName, overrides);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartValueOverridesRequest {\n");
    sb.append("    chartName: ").append(toIndentedString(chartName)).append("\n");
    sb.append("    overrides: ").append(toIndentedString(overrides)).append("\n");
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

