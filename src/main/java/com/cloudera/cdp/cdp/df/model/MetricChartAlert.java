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
import com.cloudera.cdp.df.model.MetricChartFrequencyTolerance;

/**
 * Thresholds associated with a metric
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-09-20T12:01:41.557-07:00")
public class MetricChartAlert  {

  /**
   * The unit of time controlling how long a metric value can persist outside its boundaries before an alert is generated
   **/
  private MetricChartFrequencyTolerance frequencyTolerance = null;

  /**
   * The moreThan threshold for the alert
   **/
  private Double thresholdMoreThan = null;

  /**
   * The lessThan threshold for the alert
   **/
  private Double thresholdLessThan = null;

  /**
   * Getter for frequencyTolerance.
   * The unit of time controlling how long a metric value can persist outside its boundaries before an alert is generated
   **/
  @JsonProperty("frequencyTolerance")
  public MetricChartFrequencyTolerance getFrequencyTolerance() {
    return frequencyTolerance;
  }

  /**
   * Setter for frequencyTolerance.
   * The unit of time controlling how long a metric value can persist outside its boundaries before an alert is generated
   **/
  public void setFrequencyTolerance(MetricChartFrequencyTolerance frequencyTolerance) {
    this.frequencyTolerance = frequencyTolerance;
  }

  /**
   * Getter for thresholdMoreThan.
   * The moreThan threshold for the alert
   **/
  @JsonProperty("thresholdMoreThan")
  public Double getThresholdMoreThan() {
    return thresholdMoreThan;
  }

  /**
   * Setter for thresholdMoreThan.
   * The moreThan threshold for the alert
   **/
  public void setThresholdMoreThan(Double thresholdMoreThan) {
    this.thresholdMoreThan = thresholdMoreThan;
  }

  /**
   * Getter for thresholdLessThan.
   * The lessThan threshold for the alert
   **/
  @JsonProperty("thresholdLessThan")
  public Double getThresholdLessThan() {
    return thresholdLessThan;
  }

  /**
   * Setter for thresholdLessThan.
   * The lessThan threshold for the alert
   **/
  public void setThresholdLessThan(Double thresholdLessThan) {
    this.thresholdLessThan = thresholdLessThan;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricChartAlert metricChartAlert = (MetricChartAlert) o;
    if (!Objects.equals(this.frequencyTolerance, metricChartAlert.frequencyTolerance)) {
      return false;
    }
    if (!Objects.equals(this.thresholdMoreThan, metricChartAlert.thresholdMoreThan)) {
      return false;
    }
    if (!Objects.equals(this.thresholdLessThan, metricChartAlert.thresholdLessThan)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequencyTolerance, thresholdMoreThan, thresholdLessThan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricChartAlert {\n");
    sb.append("    frequencyTolerance: ").append(toIndentedString(frequencyTolerance)).append("\n");
    sb.append("    thresholdMoreThan: ").append(toIndentedString(thresholdMoreThan)).append("\n");
    sb.append("    thresholdLessThan: ").append(toIndentedString(thresholdLessThan)).append("\n");
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

