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

package com.cloudera.cdp.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.environments.model.AnonymizationRuleRequest;
import java.util.*;

/**
 * Request object to enable environment level telemetry features.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2025-07-30T10:22:42.850-07:00")
public class SetAccountTelemetryRequest  {

  /**
   * Flag to enable account level workload analytics. (that will be used as a default for environment)
   **/
  private Boolean workloadAnalytics = null;

  /**
   * [Deprecated] Flag to enable environment level deployment log collection.
   **/
  private Boolean reportDeploymentLogs = false;

  /**
   * List of anonymization rules that are applied on logs that are shipped to Cloudera
   **/
  private List<AnonymizationRuleRequest> rules = new ArrayList<AnonymizationRuleRequest>();

  /**
   * Getter for workloadAnalytics.
   * Flag to enable account level workload analytics. (that will be used as a default for environment)
   **/
  @JsonProperty("workloadAnalytics")
  public Boolean getWorkloadAnalytics() {
    return workloadAnalytics;
  }

  /**
   * Setter for workloadAnalytics.
   * Flag to enable account level workload analytics. (that will be used as a default for environment)
   **/
  public void setWorkloadAnalytics(Boolean workloadAnalytics) {
    this.workloadAnalytics = workloadAnalytics;
  }

  /**
   * Getter for reportDeploymentLogs.
   * [Deprecated] Flag to enable environment level deployment log collection.
   **/
  @Deprecated
  @JsonProperty("reportDeploymentLogs")
  public Boolean getReportDeploymentLogs() {
    return reportDeploymentLogs;
  }

  /**
   * Setter for reportDeploymentLogs.
   * [Deprecated] Flag to enable environment level deployment log collection.
   **/
  @Deprecated
  public void setReportDeploymentLogs(Boolean reportDeploymentLogs) {
    this.reportDeploymentLogs = reportDeploymentLogs;
  }

  /**
   * Getter for rules.
   * List of anonymization rules that are applied on logs that are shipped to Cloudera
   **/
  @JsonProperty("rules")
  public List<AnonymizationRuleRequest> getRules() {
    return rules;
  }

  /**
   * Setter for rules.
   * List of anonymization rules that are applied on logs that are shipped to Cloudera
   **/
  public void setRules(List<AnonymizationRuleRequest> rules) {
    this.rules = rules;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetAccountTelemetryRequest setAccountTelemetryRequest = (SetAccountTelemetryRequest) o;
    if (!Objects.equals(this.workloadAnalytics, setAccountTelemetryRequest.workloadAnalytics)) {
      return false;
    }
    if (!Objects.equals(this.reportDeploymentLogs, setAccountTelemetryRequest.reportDeploymentLogs)) {
      return false;
    }
    if (!Objects.equals(this.rules, setAccountTelemetryRequest.rules)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(workloadAnalytics, reportDeploymentLogs, rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetAccountTelemetryRequest {\n");
    sb.append("    workloadAnalytics: ").append(toIndentedString(workloadAnalytics)).append("\n");
    sb.append("    reportDeploymentLogs: ").append(toIndentedString(reportDeploymentLogs)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

