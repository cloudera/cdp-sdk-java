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
 * Request object for testing text input against provided account telemetry anonymization rules.
 **/
@jakarta.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-12-11T11:26:10.209-08:00")
public class TestAccountTelemetryRulesRequest  {

  /**
   * Text input that will be tested against the provided account telemetry anonymization rules.
   **/
  private String testInput = null;

  /**
   * List of anonymization rules that are applied on logs that are shipped to Cloudera
   **/
  private List<AnonymizationRuleRequest> rules = new ArrayList<AnonymizationRuleRequest>();

  /**
   * Getter for testInput.
   * Text input that will be tested against the provided account telemetry anonymization rules.
   **/
  @JsonProperty("testInput")
  public String getTestInput() {
    return testInput;
  }

  /**
   * Setter for testInput.
   * Text input that will be tested against the provided account telemetry anonymization rules.
   **/
  public void setTestInput(String testInput) {
    this.testInput = testInput;
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
    TestAccountTelemetryRulesRequest testAccountTelemetryRulesRequest = (TestAccountTelemetryRulesRequest) o;
    if (!Objects.equals(this.testInput, testAccountTelemetryRulesRequest.testInput)) {
      return false;
    }
    if (!Objects.equals(this.rules, testAccountTelemetryRulesRequest.rules)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(testInput, rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestAccountTelemetryRulesRequest {\n");
    sb.append("    testInput: ").append(toIndentedString(testInput)).append("\n");
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

