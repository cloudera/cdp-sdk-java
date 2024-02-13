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
import com.cloudera.cdp.dfworkload.model.ConfiguredAlertFrequencyTolerance;
import com.cloudera.cdp.dfworkload.model.ConfiguredAlertThreshold;

/**
 * An alert configuration that specifies a configured frequency with lower and/or upper thresholds
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-02-12T15:29:04.817-08:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class ConfiguredAlert  {

  /**
   * The optional moreThan threshold that should trigger an alert; at least one of thresholdMoreThan and thresholdLessThan is required
   **/
  private ConfiguredAlertThreshold thresholdMoreThan = null;

  /**
   * The optional lessThan threshold that should trigger an alert
   **/
  private ConfiguredAlertThreshold thresholdLessThan = null;

  /**
   * The configured alert frequency tolerance for the KPI
   **/
  private ConfiguredAlertFrequencyTolerance frequencyTolerance = null;

  /**
   * Getter for thresholdMoreThan.
   * The optional moreThan threshold that should trigger an alert; at least one of thresholdMoreThan and thresholdLessThan is required
   **/
  @JsonProperty("thresholdMoreThan")
  public ConfiguredAlertThreshold getThresholdMoreThan() {
    return thresholdMoreThan;
  }

  /**
   * Setter for thresholdMoreThan.
   * The optional moreThan threshold that should trigger an alert; at least one of thresholdMoreThan and thresholdLessThan is required
   **/
  public void setThresholdMoreThan(ConfiguredAlertThreshold thresholdMoreThan) {
    this.thresholdMoreThan = thresholdMoreThan;
  }

  /**
   * Getter for thresholdLessThan.
   * The optional lessThan threshold that should trigger an alert
   **/
  @JsonProperty("thresholdLessThan")
  public ConfiguredAlertThreshold getThresholdLessThan() {
    return thresholdLessThan;
  }

  /**
   * Setter for thresholdLessThan.
   * The optional lessThan threshold that should trigger an alert
   **/
  public void setThresholdLessThan(ConfiguredAlertThreshold thresholdLessThan) {
    this.thresholdLessThan = thresholdLessThan;
  }

  /**
   * Getter for frequencyTolerance.
   * The configured alert frequency tolerance for the KPI
   **/
  @JsonProperty("frequencyTolerance")
  public ConfiguredAlertFrequencyTolerance getFrequencyTolerance() {
    return frequencyTolerance;
  }

  /**
   * Setter for frequencyTolerance.
   * The configured alert frequency tolerance for the KPI
   **/
  public void setFrequencyTolerance(ConfiguredAlertFrequencyTolerance frequencyTolerance) {
    this.frequencyTolerance = frequencyTolerance;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfiguredAlert configuredAlert = (ConfiguredAlert) o;
    if (!Objects.equals(this.thresholdMoreThan, configuredAlert.thresholdMoreThan)) {
      return false;
    }
    if (!Objects.equals(this.thresholdLessThan, configuredAlert.thresholdLessThan)) {
      return false;
    }
    if (!Objects.equals(this.frequencyTolerance, configuredAlert.frequencyTolerance)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(thresholdMoreThan, thresholdLessThan, frequencyTolerance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguredAlert {\n");
    sb.append("    thresholdMoreThan: ").append(toIndentedString(thresholdMoreThan)).append("\n");
    sb.append("    thresholdLessThan: ").append(toIndentedString(thresholdLessThan)).append("\n");
    sb.append("    frequencyTolerance: ").append(toIndentedString(frequencyTolerance)).append("\n");
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

