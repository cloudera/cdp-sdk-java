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

/**
 * Anonymization rule response object rule that is applied on logs that are sent to Cloudera.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2021-04-29T14:24:31.002-07:00")
public class AnonymizationRuleResponse extends CdpResponse {

  /**
   * Pattern of the rule that should be redacted.
   **/
  private String value = null;

  /**
   * If rule pattern (value) matches, that will be replaced for this string (default [REDACTED])
   **/
  private String replacement = null;

  /**
   * Getter for value.
   * Pattern of the rule that should be redacted.
   **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  /**
   * Setter for value.
   * Pattern of the rule that should be redacted.
   **/
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Getter for replacement.
   * If rule pattern (value) matches, that will be replaced for this string (default [REDACTED])
   **/
  @JsonProperty("replacement")
  public String getReplacement() {
    return replacement;
  }

  /**
   * Setter for replacement.
   * If rule pattern (value) matches, that will be replaced for this string (default [REDACTED])
   **/
  public void setReplacement(String replacement) {
    this.replacement = replacement;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnonymizationRuleResponse anonymizationRuleResponse = (AnonymizationRuleResponse) o;
    if (!Objects.equals(this.value, anonymizationRuleResponse.value)) {
      return false;
    }
    if (!Objects.equals(this.replacement, anonymizationRuleResponse.replacement)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, replacement, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnonymizationRuleResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    replacement: ").append(toIndentedString(replacement)).append("\n");
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

